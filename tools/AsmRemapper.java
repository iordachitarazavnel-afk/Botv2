import org.objectweb.asm.*;
import org.objectweb.asm.commons.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.atomic.*;

/**
 * AsmRemapper — applies a class/method/field name mapping to Java bytecode using ASM.
 *
 * Mapping file format (one entry per line):
 *   CLASS  old/internal/Name   new/internal/Name
 *   METHOD old/internal/Name   oldMethod  (Ldesc;)V   newMethod
 *   FIELD  old/internal/Name   oldField   Ldesc;       newField
 *
 * Usage: java -cp asm.jar:. AsmRemapper <mapping.txt> <input_dir> <output_dir>
 */
public class AsmRemapper {

    static final Map<String, String> classMap  = new HashMap<>();
    // key: "owner.name.desc"  → new method name
    static final Map<String, String> methodMap = new HashMap<>();
    // key: "owner.name:desc"  → new field name
    static final Map<String, String> fieldMap  = new HashMap<>();

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.err.println("Usage: AsmRemapper <mapping.txt> <input_dir> <output_dir>");
            System.exit(1);
        }

        Path mappingFile = Path.of(args[0]);
        Path inputDir    = Path.of(args[1]);
        Path outputDir   = Path.of(args[2]);

        // ── Parse mapping ────────────────────────────────────────────────────
        for (String raw : Files.readAllLines(mappingFile)) {
            String line = raw.strip();
            if (line.isEmpty() || line.startsWith("#")) continue;
            String[] p = line.split("\\s+");
            if (p.length < 1) continue;
            switch (p[0]) {
                case "CLASS"  -> { if (p.length >= 3) classMap.put(p[1], p[2]); }
                case "METHOD" -> { if (p.length >= 5) methodMap.put(p[1] + "." + p[2] + "." + p[3], p[4]); }
                case "FIELD"  -> { if (p.length >= 5) fieldMap.put(p[1] + "." + p[2] + ":" + p[3], p[4]); }
            }
        }

        System.out.println("[AsmRemapper] classes=" + classMap.size()
            + " methods=" + methodMap.size() + " fields=" + fieldMap.size());

        // ── Custom ASM remapper ───────────────────────────────────────────────
        Remapper remapper = new Remapper() {
            @Override public String map(String internalName) {
                return classMap.getOrDefault(internalName, internalName);
            }
            @Override public String mapMethodName(String owner, String name, String descriptor) {
                // try exact owner first, then try via class hierarchy (just owner)
                String key = owner + "." + name + "." + descriptor;
                String mapped = methodMap.get(key);
                if (mapped != null) return mapped;
                // fallback: owner-agnostic lookup (handles inherited methods)
                for (Map.Entry<String, String> e : methodMap.entrySet()) {
                    String k = e.getKey();
                    // k = "owner.name.desc" — match on name+desc only
                    int dot1 = k.indexOf('.');
                    if (dot1 < 0) continue;
                    String rest = k.substring(dot1 + 1);
                    if (rest.equals(name + "." + descriptor)) return e.getValue();
                }
                return name;
            }
            @Override public String mapFieldName(String owner, String name, String descriptor) {
                String key = owner + "." + name + ":" + descriptor;
                String mapped = fieldMap.get(key);
                if (mapped != null) return mapped;
                for (Map.Entry<String, String> e : fieldMap.entrySet()) {
                    String k = e.getKey();
                    int dot1 = k.indexOf('.');
                    if (dot1 < 0) continue;
                    String rest = k.substring(dot1 + 1);
                    if (rest.equals(name + ":" + descriptor)) return e.getValue();
                }
                return name;
            }
        };

        // ── Walk input dir and remap every .class ────────────────────────────
        AtomicInteger ok = new AtomicInteger();
        AtomicInteger fail = new AtomicInteger();

        List<Path> classFiles = new ArrayList<>();
        try (var stream = Files.walk(inputDir)) {
            stream.filter(p -> p.toString().endsWith(".class")).forEach(classFiles::add);
        }

        for (Path p : classFiles) {
            try {
                byte[] original = Files.readAllBytes(p);
                ClassReader cr = new ClassReader(original);
                // COMPUTE_MAXS not needed; 0 = no frame recalc (safe for remapping only)
                ClassWriter cw = new ClassWriter(0);
                cr.accept(new ClassRemapper(cw, remapper), ClassReader.EXPAND_FRAMES);
                byte[] remapped = cw.toByteArray();

                // Determine new output path from the remapped class name
                ClassReader cr2 = new ClassReader(remapped);
                String newClassName = cr2.getClassName(); // e.g. "com/deobf/Foo"
                Path out = outputDir.resolve(newClassName + ".class");
                Files.createDirectories(out.getParent());
                Files.write(out, remapped);
                ok.incrementAndGet();
            } catch (Exception e) {
                // On failure, copy original so decompilers still see the file
                Path rel = inputDir.relativize(p);
                Path out = outputDir.resolve(rel);
                try {
                    Files.createDirectories(out.getParent());
                    Files.copy(p, out, StandardCopyOption.REPLACE_EXISTING);
                } catch (Exception ignored) {}
                fail.incrementAndGet();
                System.err.println("[WARN] remap failed: " + p.getFileName() + " — " + e.getMessage());
            }
        }

        System.out.println("[AsmRemapper] done: " + ok + " remapped, " + fail + " copied as-is");
    }
}
