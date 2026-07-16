// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import net.minecraft.class_742;
import net.minecraft.class_1799;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import net.minecraft.class_1923;
import net.minecraft.class_2818;
import java.util.stream.Stream;
import net.minecraft.class_1269;
import net.minecraft.class_1268;
import net.minecraft.class_3965;
import net.minecraft.class_239;
import net.minecraft.class_3532;
import net.minecraft.class_243;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1309;
import java.util.function.Predicate;

public final class Initializer_1
{
    static final boolean boolFlag;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public static boolean isEnabled() {
        return com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1687.method_18456().parallelStream().filter(Initializer_1::lambda$iDBN$0).filter(Initializer_1::lambda$iDBN$1).anyMatch(class_1309::method_29504);
    }
    
    public static class_1297 createClass_1297(final class_1657 p0, final float p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: fstore_3       
        //     3: aconst_null    
        //     4: astore          4
        //     6: getstatic       com/target/mod/compat/sub1/sub1/sub7/Initializer_1.boolFlag:Z
        //     9: ifne            40
        //    12: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //    15: getfield        net/minecraft/class_310.field_1687:Lnet/minecraft/class_638;
        //    18: ifnonnull       40
        //    21: goto            28
        //    24: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    27: athrow         
        //    28: new             Ljava/lang/AssertionError;
        //    31: dup            
        //    32: invokespecial   java/lang/AssertionError.<init>:()V
        //    35: athrow         
        //    36: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    39: athrow         
        //    40: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //    43: getfield        net/minecraft/class_310.field_1687:Lnet/minecraft/class_638;
        //    46: invokevirtual   net/minecraft/class_638.method_18112:()Ljava/lang/Iterable;
        //    49: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    54: astore          5
        //    56: aload           5
        //    58: invokeinterface java/util/Iterator.hasNext:()Z
        //    63: ifeq            152
        //    66: aload           5
        //    68: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    73: checkcast       Lnet/minecraft/class_1297;
        //    76: astore          6
        //    78: aload           6
        //    80: aload_0        
        //    81: invokevirtual   net/minecraft/class_1297.method_5739:(Lnet/minecraft/class_1297;)F
        //    84: fstore          7
        //    86: aload           6
        //    88: aload_0        
        //    89: if_acmpeq       149
        //    92: fload           7
        //    94: fload_1        
        //    95: fcmpg          
        //    96: ifgt            149
        //    99: goto            106
        //   102: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   105: athrow         
        //   106: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //   109: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   112: aload           6
        //   114: invokevirtual   net/minecraft/class_746.method_6057:(Lnet/minecraft/class_1297;)Z
        //   117: iload_2        
        //   118: if_icmpne       149
        //   121: goto            128
        //   124: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   127: athrow         
        //   128: fload           7
        //   130: fload_3        
        //   131: fcmpg          
        //   132: ifge            149
        //   135: goto            142
        //   138: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   141: athrow         
        //   142: fload           7
        //   144: fstore_3       
        //   145: aload           6
        //   147: astore          4
        //   149: goto            56
        //   152: aload           4
        //   154: areturn        
        //    StackMapTable: 00 0D FF 00 18 00 05 07 00 5A 02 01 02 05 00 01 07 00 55 03 47 07 00 55 03 FF 00 0F 00 06 07 00 5A 02 01 02 07 00 6D 07 00 6F 00 00 FF 00 2D 00 08 07 00 5A 02 01 02 07 00 6D 07 00 6F 07 00 6D 02 00 01 07 00 55 03 51 07 00 55 03 49 07 00 55 03 06 F9 00 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  6      21     24     28     Ljava/lang/IllegalStateException;
        //  12     36     36     40     Ljava/lang/IllegalStateException;
        //  86     99     102    106    Ljava/lang/IllegalStateException;
        //  92     121    124    128    Ljava/lang/IllegalStateException;
        //  106    135    138    142    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0106:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static double method_double(final class_243 class_243, final class_243 class_244) {
        return Math.sqrt(Math.pow(class_244.field_1352 - class_243.field_1352, 2.0) + Math.pow(class_244.field_1351 - class_243.field_1351, 2.0) + Math.pow(class_244.field_1350 - class_243.field_1350, 2.0));
    }
    
    public static class_1657 createClass_1657(final class_1657 p0, final float p1, final boolean p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: fstore          4
        //     4: aconst_null    
        //     5: astore          5
        //     7: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //    10: getfield        net/minecraft/class_310.field_1687:Lnet/minecraft/class_638;
        //    13: invokevirtual   net/minecraft/class_638.method_18456:()Ljava/util/List;
        //    16: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    21: astore          6
        //    23: aload           6
        //    25: invokeinterface java/util/Iterator.hasNext:()Z
        //    30: ifeq            123
        //    33: aload           6
        //    35: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    40: checkcast       Lnet/minecraft/class_1657;
        //    43: astore          7
        //    45: aload_0        
        //    46: invokevirtual   net/minecraft/class_1657.method_73189:()Lnet/minecraft/class_243;
        //    49: aload           7
        //    51: invokevirtual   net/minecraft/class_1657.method_73189:()Lnet/minecraft/class_243;
        //    54: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.method_double:(Lnet/minecraft/class_243;Lnet/minecraft/class_243;)D
        //    57: d2f            
        //    58: fstore          8
        //    60: aload           7
        //    62: aload_0        
        //    63: if_acmpeq       120
        //    66: fload           8
        //    68: fload_1        
        //    69: fcmpg          
        //    70: ifgt            120
        //    73: goto            80
        //    76: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    79: athrow         
        //    80: aload           7
        //    82: aload_0        
        //    83: invokevirtual   net/minecraft/class_1657.method_6057:(Lnet/minecraft/class_1297;)Z
        //    86: iload_2        
        //    87: if_icmpne       120
        //    90: goto            97
        //    93: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    96: athrow         
        //    97: fload           8
        //    99: fload           4
        //   101: fcmpg          
        //   102: ifge            120
        //   105: goto            112
        //   108: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   111: athrow         
        //   112: fload           8
        //   114: fstore          4
        //   116: aload           7
        //   118: astore          5
        //   120: goto            23
        //   123: aload           5
        //   125: areturn        
        //    StackMapTable: 00 09 FE 00 17 02 07 00 5A 07 00 6F FF 00 34 00 09 07 00 5A 02 01 01 02 07 00 5A 07 00 6F 07 00 5A 02 00 01 07 00 55 03 4C 07 00 55 03 4A 07 00 55 03 07 F9 00 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  60     73     76     80     Ljava/lang/IllegalStateException;
        //  66     90     93     97     Ljava/lang/IllegalStateException;
        //  80     105    108    112    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0080:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static class_243 createClass_243(final float n, final float n2) {
        final float n3 = n2 * 0.017453292f;
        final float n4 = -n * 0.017453292f;
        final float method_15362 = class_3532.method_15362((double)n4);
        final float method_15363 = class_3532.method_15374((double)n4);
        final float method_15364 = class_3532.method_15362((double)n3);
        return new class_243((double)(method_15363 * method_15364), (double)(-class_3532.method_15374((double)n3)), (double)(method_15362 * method_15364));
    }
    
    public static class_243 computeClass_243(final class_1657 class_1657) {
        return createClass_243(class_1657.method_36454(), class_1657.method_36455());
    }
    
    public static class_239 computeClass_239(final double n) {
        return createClass_239((class_1657)com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1724, false, com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1724.method_36454(), com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1724.method_36455(), n);
    }
    
    public static class_239 createClass_239(final class_1657 p0, final boolean p1, final float p2, final float p3, final double p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_0        
        //     6: ifnull          25
        //     9: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //    12: getfield        net/minecraft/class_310.field_1687:Lnet/minecraft/class_638;
        //    15: ifnonnull       31
        //    18: goto            25
        //    21: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    24: athrow         
        //    25: aconst_null    
        //    26: areturn        
        //    27: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    30: athrow         
        //    31: dload           4
        //    33: dstore          7
        //    35: aload_0        
        //    36: fconst_1       
        //    37: invokevirtual   net/minecraft/class_1657.method_5836:(F)Lnet/minecraft/class_243;
        //    40: astore          9
        //    42: fload_2        
        //    43: fload_3        
        //    44: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.createClass_243:(FF)Lnet/minecraft/class_243;
        //    47: astore          10
        //    49: aload           9
        //    51: aload           10
        //    53: getfield        net/minecraft/class_243.field_1352:D
        //    56: dload           7
        //    58: dmul           
        //    59: aload           10
        //    61: getfield        net/minecraft/class_243.field_1351:D
        //    64: dload           7
        //    66: dmul           
        //    67: aload           10
        //    69: getfield        net/minecraft/class_243.field_1350:D
        //    72: dload           7
        //    74: dmul           
        //    75: invokevirtual   net/minecraft/class_243.method_1031:(DDD)Lnet/minecraft/class_243;
        //    78: astore          11
        //    80: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //    83: getfield        net/minecraft/class_310.field_1687:Lnet/minecraft/class_638;
        //    86: new             Lnet/minecraft/class_3959;
        //    89: dup            
        //    90: aload           9
        //    92: aload           11
        //    94: getstatic       net/minecraft/class_3959$class_3960.field_17559:Lnet/minecraft/class_3959$class_3960;
        //    97: getstatic       net/minecraft/class_3959$class_242.field_1348:Lnet/minecraft/class_3959$class_242;
        //   100: aload_0        
        //   101: invokespecial   net/minecraft/class_3959.<init>:(Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
        //   104: invokevirtual   net/minecraft/class_638.method_17742:(Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
        //   107: astore          12
        //   109: dload           7
        //   111: dload           7
        //   113: dmul           
        //   114: dstore          13
        //   116: dload           4
        //   118: dstore          7
        //   120: aload           12
        //   122: iload           6
        //   124: ifne            139
        //   127: ifnull          149
        //   130: goto            137
        //   133: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   136: athrow         
        //   137: aload           12
        //   139: invokevirtual   net/minecraft/class_239.method_17784:()Lnet/minecraft/class_243;
        //   142: aload           9
        //   144: invokevirtual   net/minecraft/class_243.method_1025:(Lnet/minecraft/class_243;)D
        //   147: dstore          13
        //   149: aload           9
        //   151: aload           10
        //   153: getfield        net/minecraft/class_243.field_1352:D
        //   156: dload           7
        //   158: dmul           
        //   159: aload           10
        //   161: getfield        net/minecraft/class_243.field_1351:D
        //   164: dload           7
        //   166: dmul           
        //   167: aload           10
        //   169: getfield        net/minecraft/class_243.field_1350:D
        //   172: dload           7
        //   174: dmul           
        //   175: invokevirtual   net/minecraft/class_243.method_1031:(DDD)Lnet/minecraft/class_243;
        //   178: astore          15
        //   180: aload_0        
        //   181: invokevirtual   net/minecraft/class_1657.method_5829:()Lnet/minecraft/class_238;
        //   184: aload           10
        //   186: dload           7
        //   188: invokevirtual   net/minecraft/class_243.method_1021:(D)Lnet/minecraft/class_243;
        //   191: invokevirtual   net/minecraft/class_238.method_18804:(Lnet/minecraft/class_243;)Lnet/minecraft/class_238;
        //   194: dconst_1       
        //   195: dconst_1       
        //   196: dconst_1       
        //   197: invokevirtual   net/minecraft/class_238.method_1009:(DDD)Lnet/minecraft/class_238;
        //   200: astore          16
        //   202: aload_0        
        //   203: aload           9
        //   205: aload           15
        //   207: aload           16
        //   209: iload_1        
        //   210: invokedynamic   BootstrapMethod #3, test:(Z)Ljava/util/function/Predicate;
        //   215: dload           13
        //   217: invokestatic    net/minecraft/class_1675.method_18075:(Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_238;Ljava/util/function/Predicate;D)Lnet/minecraft/class_3966;
        //   220: astore          17
        //   222: aload           17
        //   224: iload           6
        //   226: ifne            421
        //   229: ifnull          419
        //   232: goto            239
        //   235: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   238: athrow         
        //   239: aload           17
        //   241: invokevirtual   net/minecraft/class_3966.method_17784:()Lnet/minecraft/class_243;
        //   244: astore          18
        //   246: aload           9
        //   248: aload           18
        //   250: invokevirtual   net/minecraft/class_243.method_1025:(Lnet/minecraft/class_243;)D
        //   253: dstore          19
        //   255: dload           4
        //   257: dload           4
        //   259: dcmpl          
        //   260: iload           6
        //   262: ifne            320
        //   265: ifle            308
        //   268: goto            275
        //   271: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   274: athrow         
        //   275: dload           19
        //   277: dload           4
        //   279: ldc2_w          2.0
        //   282: invokestatic    java/lang/Math.pow:(DD)D
        //   285: dcmpl          
        //   286: iload           6
        //   288: ifne            377
        //   291: goto            298
        //   294: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   297: athrow         
        //   298: ifgt            359
        //   301: goto            308
        //   304: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   307: athrow         
        //   308: dload           19
        //   310: dload           13
        //   312: dcmpg          
        //   313: goto            320
        //   316: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   319: athrow         
        //   320: iload           6
        //   322: ifne            377
        //   325: iflt            359
        //   328: goto            335
        //   331: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   334: athrow         
        //   335: aload           12
        //   337: iload           6
        //   339: ifne            421
        //   342: goto            349
        //   345: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   348: athrow         
        //   349: ifnonnull       419
        //   352: goto            359
        //   355: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   358: athrow         
        //   359: dload           19
        //   361: dload           4
        //   363: ldc2_w          2.0
        //   366: invokestatic    java/lang/Math.pow:(DD)D
        //   369: dcmpl          
        //   370: goto            377
        //   373: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   376: athrow         
        //   377: ifle            415
        //   380: aload           18
        //   382: aload           10
        //   384: getfield        net/minecraft/class_243.field_1352:D
        //   387: aload           10
        //   389: getfield        net/minecraft/class_243.field_1351:D
        //   392: aload           10
        //   394: getfield        net/minecraft/class_243.field_1350:D
        //   397: invokestatic    net/minecraft/class_2350.method_10142:(DDD)Lnet/minecraft/class_2350;
        //   400: aload           18
        //   402: invokestatic    net/minecraft/class_2338.method_49638:(Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
        //   405: invokestatic    net/minecraft/class_3965.method_17778:(Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
        //   408: goto            417
        //   411: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   414: athrow         
        //   415: aload           17
        //   417: astore          12
        //   419: aload           12
        //   421: areturn        
        //    StackMapTable: 00 1F FF 00 15 00 06 07 00 5A 01 02 02 03 01 00 01 07 00 55 03 41 07 00 55 03 FF 00 65 00 0C 07 00 5A 01 02 02 03 01 03 07 00 88 07 00 88 07 00 88 07 00 EF 03 00 01 07 00 55 03 41 07 00 EF 09 FF 00 55 00 0F 07 00 5A 01 02 02 03 01 03 07 00 88 07 00 88 07 00 88 07 00 EF 03 07 00 88 07 01 02 07 01 1B 00 01 07 00 55 03 FF 00 1F 00 11 07 00 5A 01 02 02 03 01 03 07 00 88 07 00 88 07 00 88 07 00 EF 03 07 00 88 07 01 02 07 01 1B 07 00 88 03 00 01 07 00 55 03 52 07 00 55 43 01 45 07 00 55 03 47 07 00 55 43 01 4A 07 00 55 03 49 07 00 55 43 07 00 EF 45 07 00 55 03 4D 07 00 55 43 01 61 07 00 55 03 41 07 00 F1 FF 00 01 00 0F 07 00 5A 01 02 02 03 01 03 07 00 88 07 00 88 07 00 88 07 00 F1 03 07 00 88 07 01 02 07 01 1B 00 00 41 07 00 F1
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  5      18     21     25     Ljava/lang/IllegalStateException;
        //  9      27     27     31     Ljava/lang/IllegalStateException;
        //  120    130    133    137    Ljava/lang/IllegalStateException;
        //  222    232    235    239    Ljava/lang/IllegalStateException;
        //  255    268    271    275    Ljava/lang/IllegalStateException;
        //  265    291    294    298    Ljava/lang/IllegalStateException;
        //  275    301    304    308    Ljava/lang/IllegalStateException;
        //  298    313    316    320    Ljava/lang/IllegalStateException;
        //  320    328    331    335    Ljava/lang/IllegalStateException;
        //  325    342    345    349    Ljava/lang/IllegalStateException;
        //  335    352    355    359    Ljava/lang/IllegalStateException;
        //  349    370    373    377    Ljava/lang/IllegalStateException;
        //  377    411    411    415    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0275:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void setClass_3965AndBool(final class_3965 class_3965, final boolean b) {
        final class_1269 method_2896 = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1761.method_2896(com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1724, class_1268.field_5808, class_3965);
        Label_0040: {
            try {
                if (!method_2896.method_23665()) {
                    return;
                }
                final boolean b2 = b;
                if (b2) {
                    break Label_0040;
                }
                return;
            }
            catch (final IllegalStateException ex) {
                throw computeIllegalstateexception(ex);
            }
            try {
                final boolean b2 = b;
                if (b2) {
                    com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1724.method_6104(class_1268.field_5808);
                }
            }
            catch (final IllegalStateException ex2) {
                throw computeIllegalstateexception(ex2);
            }
        }
    }
    
    public static Stream<class_2818> getStream() {
        final int n = Math.max(2, com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1690.method_38521()) + 3;
        final int n2 = n * 2 + 1;
        final class_1923 method_31476 = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1724.method_31476();
        final class_1923 seed = new class_1923(method_31476.field_9181 - n, method_31476.field_9180 - n);
        return Stream.iterate(seed, (UnaryOperator<class_1923>)Initializer_1::lambda$getLoadedChunks$3).limit(n2 * (long)n2).filter(Initializer_1::lambda$getLoadedChunks$4).map((Function<? super class_1923, ?>)Initializer_1::lambda$getLoadedChunks$5).filter((Predicate<? super class_2818>)Objects::nonNull);
    }
    
    public static boolean checkClass_1657(final class_1657 class_1657) {
        try {
            if (com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1724 == null || class_1657 == null) {
                return false;
            }
        }
        catch (final IllegalStateException ex) {
            throw computeIllegalstateexception(ex);
        }
        final class_243 method_1029 = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1724.method_73189().method_1020(class_1657.method_73189()).method_1029();
        final float method_1030 = class_1657.method_36454();
        final float method_1031 = class_1657.method_36455();
        final double method_1032 = new class_243(-Math.sin(Math.toRadians(method_1030)) * Math.cos(Math.toRadians(method_1031)), -Math.sin(Math.toRadians(method_1031)), Math.cos(Math.toRadians(method_1030)) * Math.cos(Math.toRadians(method_1031))).method_1029().method_1026(method_1029);
        try {
            if (method_1032 < 0.0) {
                return true;
            }
        }
        catch (final IllegalStateException ex2) {
            throw computeIllegalstateexception(ex2);
        }
        return false;
    }
    
    public static boolean checkClass_1799(final class_1799 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0        
        //     4: invokevirtual   net/minecraft/class_1799.method_7909:()Lnet/minecraft/class_1792;
        //     7: invokeinterface net/minecraft/class_7922.method_10221:(Ljava/lang/Object;)Lnet/minecraft/class_2960;
        //    12: invokevirtual   net/minecraft/class_2960.toString:()Ljava/lang/String;
        //    15: astore_1       
        //    16: aload_1        
        //    17: sipush          -21293
        //    20: sipush          6384
        //    23: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.createString:(II)Ljava/lang/String;
        //    26: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    29: ifne            124
        //    32: aload_1        
        //    33: sipush          -21289
        //    36: sipush          -27970
        //    39: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.createString:(II)Ljava/lang/String;
        //    42: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    45: ifne            124
        //    48: goto            55
        //    51: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    54: athrow         
        //    55: aload_1        
        //    56: sipush          -21290
        //    59: sipush          -5120
        //    62: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.createString:(II)Ljava/lang/String;
        //    65: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    68: ifne            124
        //    71: goto            78
        //    74: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    77: athrow         
        //    78: aload_1        
        //    79: sipush          -21292
        //    82: sipush          4679
        //    85: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.createString:(II)Ljava/lang/String;
        //    88: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    91: ifne            124
        //    94: goto            101
        //    97: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   100: athrow         
        //   101: aload_1        
        //   102: sipush          -21291
        //   105: sipush          -15077
        //   108: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.createString:(II)Ljava/lang/String;
        //   111: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   114: ifeq            132
        //   117: goto            124
        //   120: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   123: athrow         
        //   124: iconst_1       
        //   125: goto            133
        //   128: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   131: athrow         
        //   132: iconst_0       
        //   133: ireturn        
        //    StackMapTable: 00 0B FF 00 33 00 02 07 01 B8 07 01 CE 00 01 07 00 55 03 52 07 00 55 03 52 07 00 55 03 52 07 00 55 03 43 07 00 55 03 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  16     48     51     55     Ljava/lang/IllegalStateException;
        //  32     71     74     78     Ljava/lang/IllegalStateException;
        //  55     94     97     101    Ljava/lang/IllegalStateException;
        //  78     117    120    124    Ljava/lang/IllegalStateException;
        //  101    128    128    132    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0055:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static boolean checkCondition(final class_1657 p0, final class_1297 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           0.5
        //     4: invokevirtual   net/minecraft/class_1657.method_7261:(F)F
        //     7: ldc_w           0.9
        //    10: fcmpl          
        //    11: ifle            111
        //    14: aload_0        
        //    15: getfield        net/minecraft/class_1657.field_6017:D
        //    18: dconst_0       
        //    19: dcmpl          
        //    20: ifle            111
        //    23: goto            30
        //    26: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    29: athrow         
        //    30: aload_0        
        //    31: invokevirtual   net/minecraft/class_1657.method_24828:()Z
        //    34: ifne            111
        //    37: goto            44
        //    40: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    43: athrow         
        //    44: aload_0        
        //    45: invokevirtual   net/minecraft/class_1657.method_6101:()Z
        //    48: ifne            111
        //    51: goto            58
        //    54: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    57: athrow         
        //    58: aload_0        
        //    59: invokevirtual   net/minecraft/class_1657.method_5869:()Z
        //    62: ifne            111
        //    65: goto            72
        //    68: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    71: athrow         
        //    72: aload_0        
        //    73: getstatic       net/minecraft/class_1294.field_5919:Lnet/minecraft/class_6880;
        //    76: invokevirtual   net/minecraft/class_1657.method_6059:(Lnet/minecraft/class_6880;)Z
        //    79: ifne            111
        //    82: goto            89
        //    85: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    88: athrow         
        //    89: aload_1        
        //    90: instanceof      Lnet/minecraft/class_1309;
        //    93: ifeq            111
        //    96: goto            103
        //    99: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   102: athrow         
        //   103: iconst_1       
        //   104: goto            112
        //   107: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //   110: athrow         
        //   111: iconst_0       
        //   112: ireturn        
        //    StackMapTable: 00 0F 5A 07 00 55 03 49 07 00 55 03 49 07 00 55 03 49 07 00 55 03 4C 07 00 55 03 49 07 00 55 03 43 07 00 55 03 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      23     26     30     Ljava/lang/IllegalStateException;
        //  14     37     40     44     Ljava/lang/IllegalStateException;
        //  30     51     54     58     Ljava/lang/IllegalStateException;
        //  44     65     68     72     Ljava/lang/IllegalStateException;
        //  58     82     85     89     Ljava/lang/IllegalStateException;
        //  72     96     99     103    Ljava/lang/IllegalStateException;
        //  89     107    107    111    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void setClass_1297AndBool(final class_1297 class_1297, final boolean b) {
        try {
            com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1761.method_2918((class_1657)com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1724, class_1297);
            if (b) {
                com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1724.method_6104(class_1268.field_5808);
            }
        }
        catch (final IllegalStateException ex) {
            throw computeIllegalstateexception(ex);
        }
    }
    
    private static class_2818 lambda$getLoadedChunks$5(final class_1923 class_1923) {
        return com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1687.method_8497(class_1923.field_9181, class_1923.field_9180);
    }
    
    private static boolean lambda$getLoadedChunks$4(final class_1923 class_1923) {
        return com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1687.method_8393(class_1923.field_9181, class_1923.field_9180);
    }
    
    private static class_1923 lambda$getLoadedChunks$3(final class_1923 class_1923, final class_1923 class_1924, final class_1923 class_1925) {
        int n = class_1925.field_9181;
        int field_9180 = class_1925.field_9180;
        if (++n > class_1923.field_9181) {
            n = class_1924.field_9181;
            ++field_9180;
        }
        try {
            if (field_9180 > class_1923.field_9180) {
                throw new IllegalStateException(createString(-21294, -1337));
            }
        }
        catch (final IllegalStateException ex) {
            throw computeIllegalstateexception(ex);
        }
        return new class_1923(n, field_9180);
    }
    
    private static boolean lambda$getHitResult$2(final boolean p0, final class_1297 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   net/minecraft/class_1297.method_7325:()Z
        //     4: ifne            54
        //     7: aload_1        
        //     8: invokevirtual   net/minecraft/class_1297.method_5863:()Z
        //    11: ifeq            54
        //    14: goto            21
        //    17: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    20: athrow         
        //    21: aload_1        
        //    22: invokevirtual   net/minecraft/class_1297.method_5767:()Z
        //    25: ifeq            46
        //    28: goto            35
        //    31: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    34: athrow         
        //    35: iload_0        
        //    36: ifne            54
        //    39: goto            46
        //    42: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    45: athrow         
        //    46: iconst_1       
        //    47: goto            55
        //    50: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_1.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    53: athrow         
        //    54: iconst_0       
        //    55: ireturn        
        //    StackMapTable: 00 09 51 07 00 55 03 49 07 00 55 03 46 07 00 55 03 43 07 00 55 03 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      14     17     21     Ljava/lang/IllegalStateException;
        //  7      28     31     35     Ljava/lang/IllegalStateException;
        //  21     39     42     46     Ljava/lang/IllegalStateException;
        //  35     50     50     54     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0021:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean lambda$iDBN$1(final class_742 class_742) {
        try {
            if (class_742.method_5858((class_1297)com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1724) <= 36.0) {
                return true;
            }
        }
        catch (final IllegalStateException ex) {
            throw computeIllegalstateexception(ex);
        }
        return false;
    }
    
    private static boolean lambda$iDBN$0(final class_742 class_742) {
        try {
            if (class_742 != com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310.field_1724) {
                return true;
            }
        }
        catch (final IllegalStateException ex) {
            throw computeIllegalstateexception(ex);
        }
        return false;
    }
    
    static {
        final String[] strArr2 = new String[6];
        int n = 0;
        String s;
        int n2 = (s = "\u000b2K\u0007\u00d7n\u00e5|X\u00da¾\u0006p\u00fc~\u0012¢½\u0003\u0010\u00f5\u0000").length();
        int n3 = 3;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 95));
                ++n4;
                final String s2 = s;
                final int beginIndex = n4;
                String s3 = s2.substring(beginIndex, beginIndex + n3);
                int n9 = -1;
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    final int length = charArray.length;
                    int n10 = 0;
                    while (true) {
                        Label_0260: {
                            if (length > 1) {
                                break Label_0260;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 116;
                                    case 1 -> 56;
                                    case 2 -> 56;
                                    case 3 -> 45;
                                    case 4 -> 57;
                                    case 5 -> 58;
                                    default -> 14;
                                }));
                                ++n10;
                            } while (n8 == 0);
                        }
                        if (length > n10) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n9) {
                        default: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0023;
                            }
                            n2 = (s = "Ks\u00ea¥@\u00f12\u00df\u008c¿\u00e8\u0003\u0098©\u0013>\u0080\\\u0087\u0089*7)\u00c7c\u0005\u00fe\u008een\n").length();
                            n3 = 25;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0023;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 112)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        strArr = strArr2;
        strArr_1 = new String[6];
        boolean boolFlag2 = false;
        Label_0317: {
            try {
                if (!Initializer_1.class.desiredAssertionStatus()) {
                    boolFlag2 = true;
                    break Label_0317;
                }
            }
            catch (final IllegalStateException ex) {
                throw computeIllegalstateexception(ex);
            }
            boolFlag2 = false;
        }
        boolFlag = boolFlag2;
    }
    
    private static IllegalStateException computeIllegalstateexception(final IllegalStateException ex) {
        return ex;
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFACD6) & 0xFFFF;
        if (Initializer_1.strArr_1[n3] == null) {
            final char[] charArray = Initializer_1.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 66;
                case 1 -> 94;
                case 2 -> 88;
                case 3 -> 114;
                case 4 -> 58;
                case 5 -> 79;
                case 6 -> 182;
                case 7 -> 130;
                case 8 -> 234;
                case 9 -> 253;
                case 10 -> 95;
                case 11 -> 186;
                case 12 -> 147;
                case 13 -> 155;
                case 14 -> 125;
                case 15 -> 92;
                case 16 -> 232;
                case 17 -> 97;
                case 18 -> 167;
                case 19 -> 229;
                case 20 -> 111;
                case 21 -> 107;
                case 22 -> 4;
                case 23 -> 115;
                case 24 -> 37;
                case 25 -> 0;
                case 26 -> 28;
                case 27 -> 235;
                case 28 -> 42;
                case 29 -> 72;
                case 30 -> 184;
                case 31 -> 255;
                case 32 -> 191;
                case 33 -> 206;
                case 34 -> 108;
                case 35 -> 74;
                case 36 -> 153;
                case 37 -> 189;
                case 38 -> 1;
                case 39 -> 43;
                case 40 -> 251;
                case 41 -> 185;
                case 42 -> 77;
                case 43 -> 60;
                case 44 -> 90;
                case 45 -> 26;
                case 46 -> 112;
                case 47 -> 86;
                case 48 -> 144;
                case 49 -> 244;
                case 50 -> 2;
                case 51 -> 224;
                case 52 -> 202;
                case 53 -> 240;
                case 54 -> 145;
                case 55 -> 65;
                case 56 -> 135;
                case 57 -> 32;
                case 58 -> 83;
                case 59 -> 200;
                case 60 -> 121;
                case 61 -> 239;
                case 62 -> 123;
                case 63 -> 101;
                case 64 -> 195;
                case 65 -> 62;
                case 66 -> 233;
                case 67 -> 7;
                case 68 -> 105;
                case 69 -> 140;
                case 70 -> 84;
                case 71 -> 156;
                case 72 -> 204;
                case 73 -> 25;
                case 74 -> 45;
                case 75 -> 110;
                case 76 -> 163;
                case 77 -> 109;
                case 78 -> 41;
                case 79 -> 171;
                case 80 -> 75;
                case 81 -> 199;
                case 82 -> 126;
                case 83 -> 139;
                case 84 -> 29;
                case 85 -> 208;
                case 86 -> 166;
                case 87 -> 165;
                case 88 -> 152;
                case 89 -> 212;
                case 90 -> 35;
                case 91 -> 31;
                case 92 -> 146;
                case 93 -> 181;
                case 94 -> 56;
                case 95 -> 73;
                case 96 -> 238;
                case 97 -> 122;
                case 98 -> 129;
                case 99 -> 164;
                case 100 -> 6;
                case 101 -> 210;
                case 102 -> 131;
                case 103 -> 87;
                case 104 -> 219;
                case 105 -> 169;
                case 106 -> 247;
                case 107 -> 55;
                case 108 -> 64;
                case 109 -> 241;
                case 110 -> 254;
                case 111 -> 52;
                case 112 -> 250;
                case 113 -> 245;
                case 114 -> 9;
                case 115 -> 20;
                case 116 -> 67;
                case 117 -> 230;
                case 118 -> 69;
                case 119 -> 33;
                case 120 -> 162;
                case 121 -> 177;
                case 122 -> 207;
                case 123 -> 54;
                case 124 -> 142;
                case 125 -> 104;
                case 126 -> 80;
                case 127 -> 124;
                case 128 -> 178;
                case 129 -> 49;
                case 130 -> 106;
                case 131 -> 159;
                case 132 -> 183;
                case 133 -> 91;
                case 134 -> 71;
                case 135 -> 252;
                case 136 -> 36;
                case 137 -> 138;
                case 138 -> 192;
                case 139 -> 220;
                case 140 -> 61;
                case 141 -> 198;
                case 142 -> 160;
                case 143 -> 21;
                case 144 -> 53;
                case 145 -> 128;
                case 146 -> 12;
                case 147 -> 81;
                case 148 -> 137;
                case 149 -> 18;
                case 150 -> 82;
                case 151 -> 197;
                case 152 -> 243;
                case 153 -> 246;
                case 154 -> 19;
                case 155 -> 179;
                case 156 -> 98;
                case 157 -> 180;
                case 158 -> 24;
                case 159 -> 214;
                case 160 -> 78;
                case 161 -> 116;
                case 162 -> 216;
                case 163 -> 141;
                case 164 -> 119;
                case 165 -> 227;
                case 166 -> 213;
                case 167 -> 118;
                case 168 -> 68;
                case 169 -> 143;
                case 170 -> 193;
                case 171 -> 157;
                case 172 -> 132;
                case 173 -> 5;
                case 174 -> 85;
                case 175 -> 222;
                case 176 -> 133;
                case 177 -> 151;
                case 178 -> 190;
                case 179 -> 237;
                case 180 -> 51;
                case 181 -> 175;
                case 182 -> 89;
                case 183 -> 188;
                case 184 -> 209;
                case 185 -> 100;
                case 186 -> 134;
                case 187 -> 203;
                case 188 -> 17;
                case 189 -> 228;
                case 190 -> 215;
                case 191 -> 40;
                case 192 -> 148;
                case 193 -> 172;
                case 194 -> 170;
                case 195 -> 117;
                case 196 -> 231;
                case 197 -> 223;
                case 198 -> 161;
                case 199 -> 201;
                case 200 -> 70;
                case 201 -> 10;
                case 202 -> 34;
                case 203 -> 226;
                case 204 -> 76;
                case 205 -> 23;
                case 206 -> 99;
                case 207 -> 14;
                case 208 -> 44;
                case 209 -> 59;
                case 210 -> 13;
                case 211 -> 93;
                case 212 -> 249;
                case 213 -> 211;
                case 214 -> 194;
                case 215 -> 39;
                case 216 -> 22;
                case 217 -> 136;
                case 218 -> 217;
                case 219 -> 38;
                case 220 -> 120;
                case 221 -> 221;
                case 222 -> 176;
                case 223 -> 16;
                case 224 -> 187;
                case 225 -> 149;
                case 226 -> 127;
                case 227 -> 46;
                case 228 -> 154;
                case 229 -> 150;
                case 230 -> 205;
                case 231 -> 158;
                case 232 -> 218;
                case 233 -> 3;
                case 234 -> 173;
                case 235 -> 15;
                case 236 -> 8;
                case 237 -> 30;
                case 238 -> 57;
                case 239 -> 242;
                case 240 -> 27;
                case 241 -> 11;
                case 242 -> 63;
                case 243 -> 47;
                case 244 -> 102;
                case 245 -> 168;
                case 246 -> 225;
                case 247 -> 236;
                case 248 -> 196;
                case 249 -> 248;
                case 250 -> 103;
                case 251 -> 48;
                case 252 -> 50;
                case 253 -> 174;
                case 254 -> 113;
                default -> 96;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < '\0') {
                n6 += '\u0100';
            }
            int n7 = ((n2 & 0xFFFF) >>> 8) - n5;
            if (n7 < '\0') {
                n7 += '\u0100';
            }
            for (int i = 0; i < charArray.length; ++i) {
                final int n8 = i % 2;
                final char[] array = charArray;
                final int n9 = i;
                final char c = array[n9];
                if (n8 == 0) {
                    array[n9] = (char)(c ^ n6);
                    n6 = (((n6 >>> 3 | n6 << 5) ^ charArray[i]) & 0xFF);
                }
                else {
                    array[n9] = (char)(c ^ n7);
                    n7 = (((n7 >>> 3 | n7 << 5) ^ charArray[i]) & 0xFF);
                }
            }
            Initializer_1.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_1.strArr_1[n3];
    }
}
