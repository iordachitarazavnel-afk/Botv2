// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import com.target.mod.compat.sub1.sub2.sub6.BindCSub_11;
import net.minecraft.class_1799;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.minecraft.class_4969;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import java.util.concurrent.ThreadLocalRandom;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_3;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_6;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_4;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public class DataNImpl extends Initializer_3 implements PackDImpl_5, PackDImpl_4, PackDImpl_6
{
    private final SyncASub_3 initD;
    private final SyncASub_5 parseB;
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_1 buildC_2;
    private final SyncASub_1 buildC_3;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private static final int intValue = 0;
    private static final int intValue_1 = 1;
    private static final int intValue_2 = 2;
    private static final int intValue_3 = 3;
    private static final int intValue_4 = 4;
    private int intValue_5;
    private int intValue_6;
    private boolean boolFlag;
    private boolean boolFlag_1;
    
    public DataNImpl() {
        super("auto_hit_crystal", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 153, 211, 250, 219, 178, 213, 231, 94, 102, 40, 60, 69, 8, 82, 36, 107, 120, 3, 74, 145, 226, 165, 183, 193, 132, 197, 160, 231, 233 }), "A.utomatically hit-crystals for you", Initializer.cacheE);
        this.initD = new SyncASub_3(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 64, 33, 100, 112, 0, 71, 140, 255, 166, 176, 222, 129, 198, 189, 224, 252, 156, 195, 12, 180, 112, 22, 30, 47, 118, 83, 14, 81, 110 }), 1, false);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 75, 33, 100, 97, 0, 71, 134, 255, 166, 173, 17, 211, 251, 226, 178, 213, 255, 145, 52, 21, 112, 23, 54, 47, 118, 83 }), false);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 114, 178, 212, 215, 145, 52, 17, 112, 23, 57, 47, 118, 87, 14, 81, 110 }), 0.0, 20.0, 0.0, 1.0);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 114, 178, 212, 208, 145, 52, 28, 112, 23, 52, 47, 118, 88, 14, 81, 116, 237, 176, 157 }), 0.0, 100.0, 100.0, 1.0);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 134, 255, 166, 163, 17, 211, 251, 246, 178, 213, 246, 145, 52, 24, 112, 23, 52, 47, 118, 79 }), 0.0, 20.0, 0.0, 1.0);
        this.buildC_3 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 134, 255, 166, 163, 17, 211, 251, 241, 178, 213, 251, 145, 52, 21, 112, 23, 59, 47, 118, 85, 14, 81, 114 }), 0.0, 100.0, 100.0, 1.0);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 54, 99, 43, 44, 66, 5, 76, 33, 100, 118, 0, 71, 142, 48, 244, 154, 134, 211, 250, 219, 178, 213, 231, 145, 52, 28, 191, 69, 9, 116, 36, 107, 110, 3, 74, 150, 226, 165, 166, 193, 132, 201 }), false);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 54, 99, 43, 44, 66, 5, 76, 33, 100, 118, 0, 71, 142, 48, 244, 154, 134, 211, 250, 219, 178, 213, 231, 145, 52, 28, 191, 69, 9, 99, 36, 107, 115, 3, 74, 155, 226, 165, 176, 193, 132, 208, 160, 231, 228, 159, 198, 10 }), false);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 107, 0, 71, 151, 255, 166, 162, 17, 211, 251, 225, 178, 213, 228, 145, 52, 21, 112, 23, 37 }), true);
        this.intValue_5 = 0;
        this.intValue_6 = 0;
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.setSyncaarr(this.initD, this.parseB, this.buildC, this.buildC_1, this.buildC_2, this.buildC_3, this.parseB_1, this.parseB_2, this.parseB_3);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd(PackDImpl_4.class, this);
        this.renderA.setClassAndPackd(PackDImpl_6.class, this);
        this.execute_2();
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_4.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_6.class, this);
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_0       
        //     2: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //     5: aload_0        
        //     6: iconst_0       
        //     7: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_6:I
        //    10: aload_0        
        //    11: iconst_0       
        //    12: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.boolFlag:Z
        //    15: aload_0        
        //    16: iconst_0       
        //    17: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.boolFlag_1:Z
        //    20: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //    23: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getEventd:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_2;
        //    26: ldc             Lcom/target/mod/compat/sub1/sub2/sub3/sub1/DataNImpl_9;.class
        //    28: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_2.computeLoadf:(Ljava/lang/Class;)Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //    31: checkcast       Lcom/target/mod/compat/sub1/sub2/sub3/sub1/DataNImpl_9;
        //    34: astore_1       
        //    35: aload_1        
        //    36: ifnull          83
        //    39: aload_1        
        //    40: getfield        com/target/mod/compat/sub1/sub2/sub3/sub1/DataNImpl_9.boolFlag_1:Z
        //    43: ifeq            83
        //    46: goto            53
        //    49: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    52: athrow         
        //    53: aload_1        
        //    54: iconst_0       
        //    55: putfield        com/target/mod/compat/sub1/sub2/sub3/sub1/DataNImpl_9.boolFlag_1:Z
        //    58: aload_1        
        //    59: invokevirtual   com/target/mod/compat/sub1/sub2/sub3/sub1/DataNImpl_9.isEnabled:()Z
        //    62: ifeq            83
        //    65: goto            72
        //    68: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    71: athrow         
        //    72: aload_1        
        //    73: invokevirtual   com/target/mod/compat/sub1/sub2/sub3/sub1/DataNImpl_9.execute_2:()V
        //    76: goto            83
        //    79: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    82: athrow         
        //    83: goto            87
        //    86: astore_1       
        //    87: return         
        //    StackMapTable: 00 08 FF 00 31 00 02 07 00 02 07 00 93 00 01 07 00 87 03 4E 07 00 87 03 46 07 00 87 03 FF 00 02 00 01 07 00 02 00 01 07 00 87 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  53     76     79     83     Ljava/lang/Exception;
        //  39     65     68     72     Ljava/lang/Exception;
        //  35     46     49     53     Ljava/lang/Exception;
        //  20     83     86     87     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
    
    public void execute_3() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //     6: ifnull          25
        //     9: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl.class310:Lnet/minecraft/class_310;
        //    12: getfield        net/minecraft/class_310.field_1687:Lnet/minecraft/class_638;
        //    15: ifnonnull       30
        //    18: goto            25
        //    21: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    24: athrow         
        //    25: return         
        //    26: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    29: athrow         
        //    30: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl.class310:Lnet/minecraft/class_310;
        //    33: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //    36: ifnull          44
        //    39: return         
        //    40: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    43: athrow         
        //    44: aload_0        
        //    45: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //    48: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3.getInt:()I
        //    51: istore_1       
        //    52: iload_1        
        //    53: iconst_m1      
        //    54: if_icmpeq       71
        //    57: iload_1        
        //    58: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_9.checkInt:(I)Z
        //    61: ifne            97
        //    64: goto            71
        //    67: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    70: athrow         
        //    71: aload_0        
        //    72: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.boolFlag:Z
        //    75: ifeq            96
        //    78: goto            85
        //    81: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    84: athrow         
        //    85: aload_0        
        //    86: invokevirtual   com/target/mod/compat/sub1/sub2/sub4/DataNImpl.execute_2:()V
        //    89: goto            96
        //    92: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    95: athrow         
        //    96: return         
        //    97: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl.class310:Lnet/minecraft/class_310;
        //   100: getfield        net/minecraft/class_310.field_1765:Lnet/minecraft/class_239;
        //   103: ifnull          128
        //   106: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl.class310:Lnet/minecraft/class_310;
        //   109: getfield        net/minecraft/class_310.field_1765:Lnet/minecraft/class_239;
        //   112: invokevirtual   net/minecraft/class_239.method_17783:()Lnet/minecraft/class_239$class_240;
        //   115: getstatic       net/minecraft/class_239$class_240.field_1332:Lnet/minecraft/class_239$class_240;
        //   118: if_acmpeq       133
        //   121: goto            128
        //   124: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   127: athrow         
        //   128: return         
        //   129: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   132: athrow         
        //   133: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl.class310:Lnet/minecraft/class_310;
        //   136: getfield        net/minecraft/class_310.field_1765:Lnet/minecraft/class_239;
        //   139: checkcast       Lnet/minecraft/class_3965;
        //   142: astore_2       
        //   143: aload_0        
        //   144: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.boolFlag:Z
        //   147: ifne            192
        //   150: aload_0        
        //   151: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.parseB:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //   154: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //   157: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   160: ifeq            192
        //   163: goto            170
        //   166: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   169: athrow         
        //   170: aload_2        
        //   171: invokevirtual   net/minecraft/class_3965.method_17777:()Lnet/minecraft/class_2338;
        //   174: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer.checkClass_2338_1:(Lnet/minecraft/class_2338;)Z
        //   177: ifne            192
        //   180: goto            187
        //   183: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   186: athrow         
        //   187: return         
        //   188: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   191: athrow         
        //   192: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl.class310:Lnet/minecraft/class_310;
        //   195: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   198: invokevirtual   net/minecraft/class_746.method_6047:()Lnet/minecraft/class_1799;
        //   201: astore_3       
        //   202: aload_0        
        //   203: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.boolFlag:Z
        //   206: ifne            305
        //   209: aload_3        
        //   210: invokevirtual   net/minecraft/class_1799.method_7909:()Lnet/minecraft/class_1792;
        //   213: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_8.checkClass_1792:(Lnet/minecraft/class_1792;)Z
        //   216: ifne            305
        //   219: goto            226
        //   222: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   225: athrow         
        //   226: aload_0        
        //   227: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.parseB_1:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //   230: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //   233: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   236: ifeq            263
        //   239: goto            246
        //   242: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   245: athrow         
        //   246: aload_3        
        //   247: getstatic       net/minecraft/class_1802.field_8288:Lnet/minecraft/class_1792;
        //   250: invokevirtual   net/minecraft/class_1799.method_31574:(Lnet/minecraft/class_1792;)Z
        //   253: ifne            305
        //   256: goto            263
        //   259: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   262: athrow         
        //   263: aload_0        
        //   264: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.parseB_2:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //   267: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //   270: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   273: ifeq            300
        //   276: goto            283
        //   279: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   282: athrow         
        //   283: aload_3        
        //   284: getstatic       net/minecraft/class_1802.field_8301:Lnet/minecraft/class_1792;
        //   287: invokevirtual   net/minecraft/class_1799.method_31574:(Lnet/minecraft/class_1792;)Z
        //   290: ifne            305
        //   293: goto            300
        //   296: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   299: athrow         
        //   300: return         
        //   301: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   304: athrow         
        //   305: aload_0        
        //   306: iconst_1       
        //   307: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.boolFlag:Z
        //   310: aload_0        
        //   311: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_6:I
        //   314: ifle            332
        //   317: aload_0        
        //   318: dup            
        //   319: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_6:I
        //   322: iconst_1       
        //   323: isub           
        //   324: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_6:I
        //   327: return         
        //   328: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   331: athrow         
        //   332: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl.class310:Lnet/minecraft/class_310;
        //   335: getfield        net/minecraft/class_310.field_1687:Lnet/minecraft/class_638;
        //   338: aload_2        
        //   339: invokevirtual   net/minecraft/class_3965.method_17777:()Lnet/minecraft/class_2338;
        //   342: invokevirtual   net/minecraft/class_638.method_8320:(Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
        //   345: invokevirtual   net/minecraft/class_2680.method_26204:()Lnet/minecraft/class_2248;
        //   348: astore          4
        //   350: aload           4
        //   352: getstatic       net/minecraft/class_2246.field_10540:Lnet/minecraft/class_2248;
        //   355: if_acmpeq       373
        //   358: aload           4
        //   360: getstatic       net/minecraft/class_2246.field_9987:Lnet/minecraft/class_2248;
        //   363: if_acmpne       381
        //   366: goto            373
        //   369: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   372: athrow         
        //   373: iconst_1       
        //   374: goto            382
        //   377: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   380: athrow         
        //   381: iconst_0       
        //   382: istore          5
        //   384: iconst_0       
        //   385: istore          6
        //   387: iload           6
        //   389: iconst_5       
        //   390: if_icmpge       860
        //   393: aload_0        
        //   394: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //   397: istore          7
        //   399: aload_0        
        //   400: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //   403: ifne            469
        //   406: aload           4
        //   408: getstatic       net/minecraft/class_2246.field_23152:Lnet/minecraft/class_2248;
        //   411: if_acmpne       444
        //   414: goto            421
        //   417: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   420: athrow         
        //   421: aload_0        
        //   422: aload_2        
        //   423: invokevirtual   net/minecraft/class_3965.method_17777:()Lnet/minecraft/class_2338;
        //   426: invokevirtual   com/target/mod/compat/sub1/sub2/sub4/DataNImpl.checkClass_2338:(Lnet/minecraft/class_2338;)Z
        //   429: ifeq            444
        //   432: goto            439
        //   435: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   438: athrow         
        //   439: return         
        //   440: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   443: athrow         
        //   444: iload           5
        //   446: ifeq            461
        //   449: aload_0        
        //   450: iconst_3       
        //   451: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //   454: goto            838
        //   457: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   460: athrow         
        //   461: aload_0        
        //   462: iconst_1       
        //   463: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //   466: goto            838
        //   469: aload_0        
        //   470: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //   473: iconst_1       
        //   474: if_icmpne       579
        //   477: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl.class310:Lnet/minecraft/class_310;
        //   480: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   483: invokevirtual   net/minecraft/class_746.method_6047:()Lnet/minecraft/class_1799;
        //   486: getstatic       net/minecraft/class_1802.field_8281:Lnet/minecraft/class_1792;
        //   489: invokevirtual   net/minecraft/class_1799.method_31574:(Lnet/minecraft/class_1792;)Z
        //   492: ifne            516
        //   495: goto            502
        //   498: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   501: athrow         
        //   502: getstatic       net/minecraft/class_1802.field_8281:Lnet/minecraft/class_1792;
        //   505: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_10.checkClass_1792:(Lnet/minecraft/class_1792;)Z
        //   508: pop            
        //   509: goto            516
        //   512: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   515: athrow         
        //   516: aload_0        
        //   517: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.boolFlag_1:Z
        //   520: ifne            540
        //   523: aload_2        
        //   524: iconst_1       
        //   525: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_6.setClass_3965AndBool:(Lnet/minecraft/class_3965;Z)V
        //   528: aload_0        
        //   529: iconst_1       
        //   530: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.boolFlag_1:Z
        //   533: goto            540
        //   536: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   539: athrow         
        //   540: aload_0        
        //   541: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.buildC_2:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   544: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getInt:()I
        //   547: ifle            571
        //   550: aload_0        
        //   551: aload_0        
        //   552: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.buildC_2:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   555: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getInt:()I
        //   558: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_6:I
        //   561: aload_0        
        //   562: iconst_3       
        //   563: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //   566: return         
        //   567: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   570: athrow         
        //   571: aload_0        
        //   572: iconst_3       
        //   573: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //   576: goto            838
        //   579: aload_0        
        //   580: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //   583: iconst_3       
        //   584: if_icmpne       665
        //   587: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl.class310:Lnet/minecraft/class_310;
        //   590: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   593: invokevirtual   net/minecraft/class_746.method_6047:()Lnet/minecraft/class_1799;
        //   596: getstatic       net/minecraft/class_1802.field_8301:Lnet/minecraft/class_1792;
        //   599: invokevirtual   net/minecraft/class_1799.method_31574:(Lnet/minecraft/class_1792;)Z
        //   602: ifne            626
        //   605: goto            612
        //   608: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   611: athrow         
        //   612: getstatic       net/minecraft/class_1802.field_8301:Lnet/minecraft/class_1792;
        //   615: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_10.checkClass_1792:(Lnet/minecraft/class_1792;)Z
        //   618: pop            
        //   619: goto            626
        //   622: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   625: athrow         
        //   626: aload_0        
        //   627: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.buildC:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   630: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getInt:()I
        //   633: ifle            657
        //   636: aload_0        
        //   637: aload_0        
        //   638: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.buildC:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   641: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getInt:()I
        //   644: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_6:I
        //   647: aload_0        
        //   648: iconst_4       
        //   649: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //   652: return         
        //   653: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   656: athrow         
        //   657: aload_0        
        //   658: iconst_4       
        //   659: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //   662: goto            838
        //   665: aload_0        
        //   666: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //   669: iconst_4       
        //   670: if_icmpne       838
        //   673: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl.class310:Lnet/minecraft/class_310;
        //   676: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   679: invokevirtual   net/minecraft/class_746.method_6047:()Lnet/minecraft/class_1799;
        //   682: getstatic       net/minecraft/class_1802.field_8301:Lnet/minecraft/class_1792;
        //   685: invokevirtual   net/minecraft/class_1799.method_31574:(Lnet/minecraft/class_1792;)Z
        //   688: ifeq            820
        //   691: goto            698
        //   694: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   697: athrow         
        //   698: aconst_null    
        //   699: astore          8
        //   701: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //   704: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getEventd:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_2;
        //   707: ldc_w           Lcom/target/mod/compat/sub1/sub2/sub4/DataNImpl_17;.class
        //   710: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_2.computeLoadf:(Ljava/lang/Class;)Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //   713: checkcast       Lcom/target/mod/compat/sub1/sub2/sub4/DataNImpl_17;
        //   716: astore          8
        //   718: goto            723
        //   721: astore          9
        //   723: aload           8
        //   725: ifnull          758
        //   728: aload           8
        //   730: invokevirtual   com/target/mod/compat/sub1/sub2/sub4/DataNImpl_17.isEnabled:()Z
        //   733: ifeq            758
        //   736: goto            743
        //   739: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   742: athrow         
        //   743: aload           8
        //   745: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl_17.boolFlag:Z
        //   748: ifne            820
        //   751: goto            758
        //   754: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   757: athrow         
        //   758: aconst_null    
        //   759: astore          9
        //   761: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //   764: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getEventd:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_2;
        //   767: ldc             Lcom/target/mod/compat/sub1/sub2/sub3/sub1/DataNImpl_9;.class
        //   769: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_2.computeLoadf:(Ljava/lang/Class;)Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //   772: checkcast       Lcom/target/mod/compat/sub1/sub2/sub3/sub1/DataNImpl_9;
        //   775: astore          9
        //   777: goto            782
        //   780: astore          10
        //   782: aload           9
        //   784: ifnull          820
        //   787: aload           9
        //   789: invokevirtual   com/target/mod/compat/sub1/sub2/sub3/sub1/DataNImpl_9.isEnabled:()Z
        //   792: ifne            820
        //   795: goto            802
        //   798: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   801: athrow         
        //   802: aload           9
        //   804: iconst_1       
        //   805: putfield        com/target/mod/compat/sub1/sub2/sub3/sub1/DataNImpl_9.boolFlag_1:Z
        //   808: aload           9
        //   810: invokevirtual   com/target/mod/compat/sub1/sub2/sub3/sub1/DataNImpl_9.execute_2:()V
        //   813: goto            820
        //   816: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   819: athrow         
        //   820: aload_0        
        //   821: iconst_0       
        //   822: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //   825: aload_0        
        //   826: iconst_0       
        //   827: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.boolFlag_1:Z
        //   830: aload_0        
        //   831: iconst_0       
        //   832: putfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_6:I
        //   835: goto            860
        //   838: aload_0        
        //   839: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl.intValue_5:I
        //   842: iload           7
        //   844: if_icmpne       854
        //   847: goto            860
        //   850: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   853: athrow         
        //   854: iinc            6, 1
        //   857: goto            387
        //   860: return         
        //    StackMapTable: 00 56 55 07 00 87 03 40 07 00 87 03 49 07 00 87 03 FF 00 16 00 02 07 00 02 01 00 01 07 00 87 03 49 07 00 87 03 46 07 00 87 03 00 5A 07 00 87 03 40 07 00 87 03 FF 00 20 00 03 07 00 02 01 07 00 D2 00 01 07 00 87 03 4C 07 00 87 03 40 07 00 87 03 FF 00 1D 00 04 07 00 02 01 07 00 D2 07 00 ED 00 01 07 00 87 03 4F 07 00 87 03 4C 07 00 87 03 4F 07 00 87 03 4C 07 00 87 03 40 07 00 87 03 56 07 00 87 03 FF 00 24 00 05 07 00 02 01 07 00 D2 07 00 ED 07 01 1A 00 01 07 00 87 03 43 07 00 87 03 40 01 FD 00 04 01 01 FF 00 1D 00 08 07 00 02 01 07 00 D2 07 00 ED 07 01 1A 01 01 01 00 01 07 00 87 03 4D 07 00 87 03 40 07 00 87 03 4C 07 00 87 03 07 5C 07 00 87 03 49 07 00 87 03 53 07 00 87 03 5A 07 00 87 03 07 5C 07 00 87 03 49 07 00 87 03 5A 07 00 87 03 07 5C 07 00 87 03 FF 00 16 00 09 07 00 02 01 07 00 D2 07 00 ED 07 01 1A 01 01 01 07 01 2F 00 01 07 00 87 01 4F 07 00 87 03 4A 07 00 87 03 FF 00 15 00 0A 07 00 02 01 07 00 D2 07 00 ED 07 01 1A 01 01 01 07 01 2F 07 00 93 00 01 07 00 87 01 4F 07 00 87 03 4D 07 00 87 F9 00 03 11 4B 07 00 87 03 FA 00 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  665    691    694    698    Ljava/lang/Exception;
        //  626    653    653    657    Ljava/lang/Exception;
        //  587    619    622    626    Ljava/lang/Exception;
        //  579    605    608    612    Ljava/lang/Exception;
        //  540    567    567    571    Ljava/lang/Exception;
        //  516    533    536    540    Ljava/lang/Exception;
        //  477    509    512    516    Ljava/lang/Exception;
        //  469    495    498    502    Ljava/lang/Exception;
        //  444    457    457    461    Ljava/lang/Exception;
        //  421    440    440    444    Ljava/lang/Exception;
        //  406    432    435    439    Ljava/lang/Exception;
        //  399    414    417    421    Ljava/lang/Exception;
        //  358    377    377    381    Ljava/lang/Exception;
        //  350    366    369    373    Ljava/lang/Exception;
        //  305    328    328    332    Ljava/lang/Exception;
        //  283    301    301    305    Ljava/lang/Exception;
        //  263    293    296    300    Ljava/lang/Exception;
        //  246    276    279    283    Ljava/lang/Exception;
        //  226    256    259    263    Ljava/lang/Exception;
        //  209    239    242    246    Ljava/lang/Exception;
        //  202    219    222    226    Ljava/lang/Exception;
        //  170    188    188    192    Ljava/lang/Exception;
        //  150    180    183    187    Ljava/lang/Exception;
        //  143    163    166    170    Ljava/lang/Exception;
        //  106    129    129    133    Ljava/lang/Exception;
        //  97     121    124    128    Ljava/lang/Exception;
        //  71     89     92     96     Ljava/lang/Exception;
        //  57     78     81     85     Ljava/lang/Exception;
        //  52     64     67     71     Ljava/lang/Exception;
        //  30     40     40     44     Ljava/lang/Exception;
        //  9      26     26     30     Ljava/lang/Exception;
        //  0      18     21     25     Ljava/lang/Exception;
        //  701    718    721    723    Ljava/lang/Exception;
        //  728    751    754    758    Ljava/lang/Exception;
        //  723    736    739    743    Ljava/lang/Exception;
        //  761    777    780    782    Ljava/lang/Exception;
        //  782    795    798    802    Ljava/lang/Exception;
        //  787    813    816    820    Ljava/lang/Exception;
        //  838    850    850    854    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0071:
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
    
    private int getInt() {
        return ThreadLocalRandom.current().nextInt(0, 3);
    }
    
    private boolean checkClass_2338(final class_2338 class_2338) {
        if (DataNImpl.class310.field_1687 == null) {
            return false;
        }
        final class_2680 method_8320 = DataNImpl.class310.field_1687.method_8320(class_2338);
        return method_8320.method_26204() == class_2246.field_23152 && (int)method_8320.method_11654((class_2769)class_4969.field_23153) != 0;
    }
    
    @Override
    public void setBlocke(final BindCSub bindCSub) {
        if (DataNImpl.class310.field_1724 == null) {
            return;
        }
        if (!this.boolFlag) {
            return;
        }
        final class_1799 method_6047 = DataNImpl.class310.field_1724.method_6047();
        if ((method_6047.method_31574(class_1802.field_8301) || method_6047.method_31574(class_1802.field_8281)) && !Initializer_9.checkInt(this.initD.getInt())) {
            bindCSub.execute_2();
        }
    }
    
    @Override
    public void setSlotf(final BindCSub_11 bindCSub_11) {
        if (DataNImpl.class310.field_1724 == null) {
            return;
        }
        if (!this.boolFlag) {
            return;
        }
        if (DataNImpl.class310.field_1724.method_6047().method_31574(class_1802.field_8301) && !Initializer_9.checkInt(this.initD.getInt())) {
            bindCSub_11.execute_2();
        }
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
}
