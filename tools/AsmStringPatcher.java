import org.objectweb.asm.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

/**
 * Patches static String fields in class files with decrypted plaintext values.
 *
 * Reads a patch file (written by StringDecryptor) where each line is:
 *   STRING  owner/Internal/Name  fieldName  decryptedValue
 *
 * For each class with patches:
 *   1. Reads the .class bytes
 *   2. Removes the <clinit> XOR decryption code for that field (replaces with LDC + PUTSTATIC)
 *   3. Adds the field initializer as a ConstantValue attribute (for static final fields)
 *   4. Writes the patched bytes back
 *
 * Usage:
 *   java -cp "asm-9.7.jar:AsmStringPatcher.jar" AsmStringPatcher patches.txt inputDir outputDir
 */
public class AsmStringPatcher {

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.err.println("Usage: AsmStringPatcher <patches.txt> <inputDir> <outputDir>");
            System.exit(1);
        }
        Path patchFile = Paths.get(args[0]);
        Path inputDir  = Paths.get(args[1]);
        Path outputDir = Paths.get(args[2]);

        // Parse patch file: owner → { fieldName → decryptedValue }
        Map<String, Map<String, String>> patches = new LinkedHashMap<>();
        for (String line : Files.readAllLines(patchFile)) {
            line = line.trim();
            if (!line.startsWith("STRING ")) continue;
            String[] parts = line.split(" ", 4);
            if (parts.length < 4) continue;
            String owner  = parts[1];
            String field  = parts[2];
            String value  = parts[3]
                .replace("\\n", "\n").replace("\\r", "\r")
                .replace("\\t", "\t").replace("\\\\", "\\");
            patches.computeIfAbsent(owner, k -> new LinkedHashMap<>()).put(field, value);
        }

        int patched = 0;
        int skipped = 0;

        for (Map.Entry<String, Map<String, String>> e : patches.entrySet()) {
            String owner = e.getKey();
            Map<String, String> fieldMap = e.getValue();

            // Locate the class file
            Path classFile = inputDir.resolve(owner + ".class");
            if (!Files.exists(classFile)) { skipped++; continue; }

            try {
                byte[] original = Files.readAllBytes(classFile);
                byte[] result   = patchClass(original, owner, fieldMap);
                Path dest = outputDir.resolve(owner + ".class");
                Files.createDirectories(dest.getParent());
                Files.write(dest, result);
                patched++;
            } catch (Exception ex) {
                skipped++;
                // If patching fails, copy original unchanged
                try {
                    Path dest = outputDir.resolve(owner + ".class");
                    Files.createDirectories(dest.getParent());
                    Files.copy(classFile, dest, StandardCopyOption.REPLACE_EXISTING);
                } catch (Exception ignored) {}
            }
        }

        System.out.println("[AsmStringPatcher] patched=" + patched + " skipped=" + skipped);
    }

    static byte[] patchClass(byte[] bytes, String owner, Map<String, String> fieldMap) {
        ClassReader  cr = new ClassReader(bytes);
        ClassWriter  cw = new ClassWriter(cr, ClassWriter.COMPUTE_MAXS);
        ClassVisitor cv = new StringPatchingVisitor(cw, owner, fieldMap);
        cr.accept(cv, 0);
        return cw.toByteArray();
    }

    // ── ClassVisitor ──────────────────────────────────────────────────────────
    static class StringPatchingVisitor extends ClassVisitor {
        private final String owner;
        private final Map<String, String> fieldMap;

        StringPatchingVisitor(ClassVisitor next, String owner, Map<String, String> fieldMap) {
            super(Opcodes.ASM9, next);
            this.owner = owner;
            this.fieldMap = fieldMap;
        }

        @Override
        public MethodVisitor visitMethod(int acc, String name, String desc, String sig, String[] ex) {
            MethodVisitor mv = super.visitMethod(acc, name, desc, sig, ex);
            if ("<clinit>".equals(name)) {
                return new ClinitPatcher(mv, owner, fieldMap);
            }
            return mv;
        }
    }

    // ── MethodVisitor: rewrites <clinit> ──────────────────────────────────────
    /**
     * Strategy: suppress all instructions between an LDC encrypted-string and its
     * corresponding PUTSTATIC (for fields we have a patch for), then emit:
     *   LDC decryptedString
     *   PUTSTATIC owner fieldName Ljava/lang/String;
     */
    static class ClinitPatcher extends MethodVisitor {
        private final String owner;
        private final Map<String, String> fieldMap;

        // When we see LDC String → toCharArray, enter suppression mode
        private boolean suppressing = false;
        private String  pendingEncrypted = null;
        private String  pendingField     = null;

        // Stack depth tracking (simplified): count suppressed instructions
        private int suppressDepth = 0;

        ClinitPatcher(MethodVisitor mv, String owner, Map<String, String> fieldMap) {
            super(Opcodes.ASM9, mv);
            this.owner = owner; this.fieldMap = fieldMap;
        }

        @Override public void visitLdcInsn(Object cst) {
            if (cst instanceof String) {
                String s = (String) cst;
                if (s.length() >= 2) {
                    // Start of a potential encrypted string block
                    pendingEncrypted = s;
                    suppressing      = false;  // wait for toCharArray confirmation
                    pendingField     = null;
                    super.visitLdcInsn(cst);   // emit normally until confirmed
                    return;
                }
            }
            if (!suppressing) super.visitLdcInsn(cst);
        }

        @Override public void visitMethodInsn(int op, String owner2, String name, String desc, boolean itf) {
            if ("toCharArray".equals(name) && pendingEncrypted != null) {
                // Confirmed: entering XOR block — suppress everything until PUTSTATIC
                suppressing = true;
                suppressDepth = 0;
                // Do NOT emit toCharArray or the LDC that preceded it.
                // We need to undo the LDC we already emitted — we can't, so we
                // emit a POP to consume it, then start suppressing.
                super.visitInsn(Opcodes.POP);  // consume the String we emitted
                return;
            }
            if (!suppressing) super.visitMethodInsn(op, owner2, name, desc, itf);
        }

        @Override public void visitFieldInsn(int op, String fOwner, String fName, String fDesc) {
            if (suppressing && op == Opcodes.PUTSTATIC
                && owner.equals(fOwner) && "Ljava/lang/String;".equals(fDesc)
                && fieldMap.containsKey(fName)) {
                // Emit the decrypted value directly
                String decrypted = fieldMap.get(fName);
                super.visitLdcInsn(decrypted);
                super.visitFieldInsn(Opcodes.PUTSTATIC, fOwner, fName, fDesc);
                suppressing = false;
                pendingEncrypted = null;
                pendingField = null;
                return;
            }
            if (!suppressing) super.visitFieldInsn(op, fOwner, fName, fDesc);
        }

        // Suppress all other instructions during XOR block
        @Override public void visitInsn(int op)                           { if (!suppressing) super.visitInsn(op); }
        @Override public void visitIntInsn(int op, int operand)           { if (!suppressing) super.visitIntInsn(op, operand); }
        @Override public void visitVarInsn(int op, int var)               { if (!suppressing) super.visitVarInsn(op, var); }
        @Override public void visitIincInsn(int var, int increment)       { if (!suppressing) super.visitIincInsn(var, increment); }
        @Override public void visitJumpInsn(int op, Label label)          { if (!suppressing) super.visitJumpInsn(op, label); }
        @Override public void visitTypeInsn(int op, String type)          { if (!suppressing) super.visitTypeInsn(op, type); }
        @Override public void visitLabel(Label label)                     { if (!suppressing) super.visitLabel(label); else super.visitLabel(label); }
    }
}
