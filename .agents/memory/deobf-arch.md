---
name: Deobfuscation architecture
description: How the bot's deobfuscation pipeline works end-to-end, including the bytecode renamer
---

## Pipeline flow (passes run in this order inside DeobfuscationEngine.deobfuscate)

1. FileHandler.prepare_input() — extracts classes from uploaded JAR
2. ObfuscationDetector.analyze() — detects obfuscator signatures
3. DeobfuscationEngine.deobfuscate():
   a. _decrypt_strings()    — StringDecryptor.jar (ASM visitor, XOR brute-force) + AsmStringPatcher.jar
   b. _remove_junk_code()   — NON-DESTRUCTIVE: flags only, never deletes class files
   c. _restore_names()      — generates class/method/field mapping, calls AsmRemapper.jar
   d. _unwind_flow()        — logs flow-obfuscated classes (no bytecode changes)
   e. _deobfuscate_numbers(), _repair_attributes(), etc.

4. Repack deobf_dir into repack_deobf.jar
5. EngineManager.run_all() — CFR/Procyon/Fernflower/JADX decompile the JAR

## AsmRemapper

- Java tool: tools/AsmRemapper.java → tools/AsmRemapper.jar
- CP: `libs/jadx-lib/asm-9.7.jar:libs/jadx-lib/asm-commons-9.7.jar:tools/AsmRemapper.jar`
- **Must use ASM 9.7+** — ASM 9.4 fails on Java 21 bytecode (major version 65)
- Mapping: `CLASS old/Name new/Name`, `METHOD owner name desc newname`, `FIELD owner name desc newname`
- Falls back to copy-as-is on failure. 0 failures on 1302-class test.

**Why:** Previous _restore_names only moved files on disk; method/field names inside bytecode stayed obfuscated.

## StringDecryptor + AsmStringPatcher

- `tools/StringDecryptor.java` → `tools/StringDecryptor.jar`  
  Needs only `asm-9.7.jar`. Uses ASM MethodVisitor to detect: LDC encrypted → toCharArray → BIPUSH key → PUTSTATIC.  
  Brute-forces XOR keys 1-255 (single-byte), also tries position-XOR `charArr[i] ^= (key^i)`.
  Outputs: `FIELD owner/Name fieldName decryptedValue`
  
- `tools/AsmStringPatcher.java` → `tools/AsmStringPatcher.jar`  
  Reads the patch file, rewrites <clinit> of each patched class: suppresses XOR decryption block, emits `LDC decryptedString PUTSTATIC` instead.

## ClassFileParser._analyze_bytecode fix

- Old opcode table had 0xB2-0xB8 (getfield, invokevirtual etc.) as 1-byte — WRONG, they're 3 bytes.
- `_OPCODE_SIZE` dict replaces the old sets with correct sizes for all opcodes.
- Wrapped in try/except: returns partial results on error instead of crashing.
- Result: 0 parse failures on 1302-class test (was 7-12 failures before).

## Package naming

- Old: `pkg_a/pkg_a/pkg_a` — same name for different sub-packages.
- New: counter-based per NEW parent path: `sub1`, `sub2` etc. scoped to each renamed parent.
- `deobf_package()` uses `pkg_path_map` cache + increments counter per new parent key.
- Pre-populated in sorted order (parents before children) for deterministic naming.

## Decompiler flags

- CFR: `--stringbuffer true --sugarenums true --sugarboxing true --decodelambdas true --lenient true`
- Fernflower: `-hes=0 -hdc=0 -dgs=1 -asc=1 -bsm=1 -iec=1 -iib=1`
- JADX: `--deobf --deobf-min 2 --deobf-use-sourcename --show-bad-code`

## Pattern detection

- `_OBF_CLASS`: 1-5 char names, `DataB`/`LoadE` style (word+uppercase suffix), `_123`, digits
- `_OBF_MEMBER`: 1-3 char method/field names
- Package obfuscation: 1-2 letter segments → `sub1`, `sub2`, ...

## Test results (1302-class JAR = CFR jar itself)

- 0 parse failures
- 9 classes, 59 methods, 166 fields renamed
- 1 string decrypted + patched in bytecode
- 1302 remapped, 0 copied as-is
