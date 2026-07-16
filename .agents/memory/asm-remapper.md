---
name: AsmRemapper setup
description: Java bytecode renamer tool built on ASM 9.7, used by the deobfuscator bot
---

## Location

- Source: `tools/AsmRemapper.java`
- Compiled JAR: `tools/AsmRemapper.jar` (includes AsmRemapper.class + AsmRemapper$*.class anonymous inner classes)
- Dependencies: `libs/jadx-lib/asm-9.7.jar`, `libs/jadx-lib/asm-commons-9.7.jar`

## Version requirement

ASM 9.7 supports Java 21/22/23 (major versions 65-67). ASM 9.4 (the one bundled with JADX) only goes to Java 20 — do NOT use it for remapping.

**Why:** The test JAR uses Java 21 bytecode (major version 65). ASM 9.4 throws "Unsupported class file major version 65" on every class, causing 0 remapped files.

## Compile command

```bash
cd tools
javac -cp ../libs/jadx-lib/asm-9.7.jar:../libs/jadx-lib/asm-commons-9.7.jar AsmRemapper.java
jar cf AsmRemapper.jar AsmRemapper*.class   # ← must include AsmRemapper$*.class (anonymous classes)
```

## Usage

```bash
java -cp "libs/jadx-lib/asm-9.7.jar:libs/jadx-lib/asm-commons-9.7.jar:tools/AsmRemapper.jar" \
  AsmRemapper <mapping.txt> <input_dir> <output_dir>
```

## Mapping format

```
CLASS com/old/Name com/new/Name
METHOD com/old/Name methodName ()V newMethodName
FIELD com/old/Name fieldName I newFieldName
```

## Fallback behavior

On parse failure (e.g. unsupported attribute), copies original class file to output unchanged so decompilers still see the file.
