import org.objectweb.asm.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

/**
 * Detects and decrypts Allatori / Zelix / generic XOR-obfuscated static String fields.
 *
 * Uses ASM visitor API (only needs asm-9.7.jar, no asm-tree).
 *
 * Detection: in <clinit>, look for:
 *   LDC "encrypted_string"  →  INVOKEVIRTUAL toCharArray  →
 *   BIPUSH/SIPUSH/ICONST <key>  →  IXOR loop  →  PUTSTATIC staticStringField
 *
 * Output lines on stdout:
 *   FIELD  owner/internal/Name  fieldName  decryptedValue
 *
 * Usage:
 *   java -cp "asm-9.7.jar:StringDecryptor.jar" StringDecryptor <classdir>
 */
public class StringDecryptor {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: StringDecryptor <classdir>"); System.exit(1); }
        Path root = Paths.get(args[0]);
        int[] stats = {0, 0}; // [attempted, decrypted]
        List<Path> classes = Files.walk(root)
                .filter(p -> p.toString().endsWith(".class"))
                .sorted().collect(Collectors.toList());
        for (Path cf : classes) {
            try {
                byte[] bytes = Files.readAllBytes(cf);
                ClassReader cr = new ClassReader(bytes);
                cr.accept(new DeobfClassVisitor(stats), ClassReader.SKIP_FRAMES);
            } catch (Exception ignored) {}
        }
        System.out.println("[StringDecryptor] attempted=" + stats[0] + " decrypted=" + stats[1]);
    }

    // ── ClassVisitor ──────────────────────────────────────────────────────────
    static class DeobfClassVisitor extends ClassVisitor {
        private String className;
        private final Set<String> staticStringFields = new LinkedHashSet<>();
        private final int[] stats;

        DeobfClassVisitor(int[] stats) { super(Opcodes.ASM9); this.stats = stats; }

        @Override public void visit(int v, int a, String name, String sig, String sup, String[] ifaces) {
            this.className = name;
        }

        @Override public FieldVisitor visitField(int access, String name, String desc, String sig, Object val) {
            if ("Ljava/lang/String;".equals(desc) && (access & Opcodes.ACC_STATIC) != 0)
                staticStringFields.add(name);
            return null;
        }

        @Override public MethodVisitor visitMethod(int acc, String name, String desc, String sig, String[] ex) {
            if ("<clinit>".equals(name) && !staticStringFields.isEmpty())
                return new ClinitVisitor(className, staticStringFields, stats);
            return null;
        }
    }

    // ── MethodVisitor for <clinit> ────────────────────────────────────────────
    static class ClinitVisitor extends MethodVisitor {
        private final String owner;
        private final Set<String> strFields;
        private final int[] stats;

        // Simple stack to track LDC String → toCharArray → XOR key → PUTSTATIC
        // We maintain a sliding window of "pending encrypted strings" + detected XOR key
        private final List<String> pendingEncrypted = new ArrayList<>();
        private int detectedKey = -1;
        private boolean afterToCharArray = false;

        ClinitVisitor(String owner, Set<String> strFields, int[] stats) {
            super(Opcodes.ASM9);
            this.owner = owner; this.strFields = strFields; this.stats = stats;
        }

        @Override public void visitLdcInsn(Object cst) {
            if (cst instanceof String) {
                String s = (String) cst;
                if (s.length() >= 2) {
                    pendingEncrypted.add(s);
                    afterToCharArray = false;
                    detectedKey = -1;
                }
            } else if (cst instanceof Integer && afterToCharArray) {
                detectedKey = (Integer) cst;
            }
        }

        @Override public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
            if ("toCharArray".equals(name) && !pendingEncrypted.isEmpty()) {
                afterToCharArray = true;
            }
        }

        @Override public void visitIntInsn(int opcode, int operand) {
            if (afterToCharArray && detectedKey < 0 &&
                (opcode == Opcodes.BIPUSH || opcode == Opcodes.SIPUSH)) {
                detectedKey = operand;
            }
        }

        @Override public void visitInsn(int opcode) {
            if (afterToCharArray && detectedKey < 0 &&
                opcode >= Opcodes.ICONST_M1 && opcode <= Opcodes.ICONST_5) {
                detectedKey = opcode - Opcodes.ICONST_0;
            }
        }

        @Override public void visitFieldInsn(int opcode, String fOwner, String fName, String desc) {
            if (opcode == Opcodes.PUTSTATIC && "Ljava/lang/String;".equals(desc)
                && owner.equals(fOwner) && strFields.contains(fName)
                && !pendingEncrypted.isEmpty()) {

                // Try the most recent encrypted string candidates
                String encrypted = pendingEncrypted.get(pendingEncrypted.size() - 1);
                stats[0]++;
                String result = null;

                // Strategy 1: use detected key
                if (detectedKey > 0) {
                    result = tryXor(encrypted, detectedKey);
                    if (result == null) result = tryXorPos(encrypted, detectedKey);
                }
                // Strategy 2: brute-force single-byte keys
                if (result == null) {
                    for (int k = 1; k <= 255 && result == null; k++) {
                        result = tryXor(encrypted, k);
                        if (result == null) result = tryXorPos(encrypted, k);
                    }
                }
                // Strategy 3: brute-force two-byte keys (common in Allatori)
                if (result == null) {
                    for (int k = 256; k <= 0xFFFF && result == null; k += 7) {
                        result = tryXor(encrypted, k);
                    }
                }

                if (result != null) {
                    String safe = result.replace("\\", "\\\\")
                                        .replace("\n", "\\n").replace("\r", "\\r")
                                        .replace("\t", "\\t");
                    System.out.println("FIELD " + owner + " " + fName + " " + safe);
                    stats[1]++;
                }
                // Reset state for next string
                pendingEncrypted.clear();
                detectedKey = -1;
                afterToCharArray = false;
            }
        }

        static String tryXor(String enc, int key) {
            char[] ca = enc.toCharArray();
            for (int i = 0; i < ca.length; i++) ca[i] ^= key;
            return isPrintable(ca) ? new String(ca) : null;
        }

        static String tryXorPos(String enc, int key) {
            char[] ca = enc.toCharArray();
            for (int i = 0; i < ca.length; i++) ca[i] ^= (key ^ i);
            return isPrintable(ca) ? new String(ca) : null;
        }

        static boolean isPrintable(char[] ca) {
            if (ca.length == 0) return false;
            int ok = 0;
            for (char c : ca)
                if ((c >= 0x20 && c < 0x7F) || c == '\n' || c == '\r' || c == '\t') ok++;
            return (double) ok / ca.length > 0.80;
        }
    }
}
