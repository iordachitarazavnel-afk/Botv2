// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import java.util.regex.Matcher;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.List;
import net.minecraft.class_1657;
import net.minecraft.class_1836;
import net.minecraft.class_1937;
import net.minecraft.class_1792$class_9635;
import net.minecraft.class_1792;
import net.minecraft.class_2561;
import java.util.Locale;
import net.minecraft.class_1802;
import net.minecraft.class_1799;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_15;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub_17 extends AbstractLoadF
{
    private static final long longValue = 50L;
    private static final int intValue = 5;
    private final RenderASub_15<Initializer> wrapJ;
    private final RenderASub_15<Initializer_4> wrapJ_1;
    private final RenderASub_6 eventQ;
    private final RenderASub_1 buffC;
    private final RenderASub_1 buffC_1;
    private final RenderASub_1 buffC_2;
    private final RenderASub_6 eventQ_1;
    private final RenderASub_1 buffC_3;
    private final RenderASub_1 buffC_4;
    private Initializer_7 coreH;
    private long longValue_1;
    private int intValue_1;
    private long longValue_2;
    private int intValue_2;
    private int intValue_3;
    private long longValue_3;
    private int intValue_4;
    private String strValue;
    private boolean boolFlag;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_17() {
        super(createString(-26008, 11944), createString(-26032, -32276), com.target.mod.compat.sub1.sub1.sub5.Initializer.stepF);
        this.wrapJ = new RenderASub_15<Initializer>(createString(-26024, -15040), Initializer.SHULKERS, Initializer.class);
        this.wrapJ_1 = new RenderASub_15<Initializer_4>(createString(-26044, -2797), Initializer_4.BUY_AND_SELL, Initializer_4.class);
        this.eventQ = new RenderASub_6(createString(-26027, 46), createString(-26020, -23931));
        this.buffC = new RenderASub_1(createString(-26048, -19886), true);
        this.buffC_1 = new RenderASub_1(createString(-26016, -15058), true);
        this.buffC_2 = new RenderASub_1(createString(-25986, -25981), false);
        this.eventQ_1 = new RenderASub_6(createString(-26023, 11918), "");
        this.buffC_3 = new RenderASub_1(createString(-25987, -27818), false);
        this.buffC_4 = new RenderASub_1(createString(-26012, -15252), true);
        this.coreH = Initializer_7.NONE;
        this.longValue_1 = 0L;
        this.intValue_1 = 0;
        this.longValue_2 = 0L;
        this.intValue_2 = 0;
        this.intValue_3 = 0;
        this.longValue_3 = 0L;
        this.intValue_4 = 0;
        this.strValue = "";
        this.boolFlag = false;
        this.setRenderaarr(this.wrapJ, this.wrapJ_1, this.eventQ, this.buffC, this.buffC_1, this.buffC_2, this.eventQ_1, this.buffC_3, this.buffC_4);
    }
    
    @Override
    public void execute() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.eventQ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //     5: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6.getValue:()Ljava/lang/Object;
        //     8: checkcast       Ljava/lang/String;
        //    11: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.method_double_1:(Ljava/lang/String;)D
        //    14: dstore_1       
        //    15: dload_1        
        //    16: ldc2_w          -1.0
        //    19: dcmpl          
        //    20: ifne            93
        //    23: aload_0        
        //    24: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_2:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //    27: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //    30: checkcast       Ljava/lang/Boolean;
        //    33: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    36: ifne            93
        //    39: goto            46
        //    42: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    45: athrow         
        //    46: aload_0        
        //    47: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //    50: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //    53: checkcast       Ljava/lang/Boolean;
        //    56: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    59: ifeq            88
        //    62: goto            69
        //    65: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    68: athrow         
        //    69: sipush          -26043
        //    72: sipush          20111
        //    75: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //    78: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_5.setString_2:(Ljava/lang/String;)V
        //    81: goto            88
        //    84: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    87: athrow         
        //    88: aload_0        
        //    89: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.execute_2:()V
        //    92: return         
        //    93: aload_0        
        //    94: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.execute_2:()V
        //    97: aload_0        
        //    98: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //   101: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //   104: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4.SELL_ONLY:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4;
        //   107: if_acmpeq       130
        //   110: aload_0        
        //   111: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //   114: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //   117: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4.ORDER_ONLY:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4;
        //   120: if_acmpne       144
        //   123: goto            130
        //   126: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   129: athrow         
        //   130: aload_0        
        //   131: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.WAIT:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   134: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   137: goto            151
        //   140: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   143: athrow         
        //   144: aload_0        
        //   145: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   148: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   151: aload_0        
        //   152: invokestatic    java/lang/System.currentTimeMillis:()J
        //   155: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //   158: aload_0        
        //   159: iconst_0       
        //   160: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_1:I
        //   163: aload_0        
        //   164: lconst_0       
        //   165: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_2:J
        //   168: aload_0        
        //   169: iconst_0       
        //   170: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_2:I
        //   173: aload_0        
        //   174: iconst_0       
        //   175: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_3:I
        //   178: aload_0        
        //   179: iconst_0       
        //   180: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_4:I
        //   183: aload_0        
        //   184: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //   187: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //   190: checkcast       Ljava/lang/Boolean;
        //   193: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   196: ifeq            334
        //   199: aload_0        
        //   200: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.boolFlag:Z
        //   203: ifeq            243
        //   206: goto            213
        //   209: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   212: athrow         
        //   213: sipush          -26035
        //   216: sipush          13367
        //   219: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   222: iconst_1       
        //   223: anewarray       Ljava/lang/Object;
        //   226: dup            
        //   227: iconst_0       
        //   228: aload_0        
        //   229: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.strValue:Ljava/lang/String;
        //   232: aastore        
        //   233: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   236: goto            245
        //   239: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   242: athrow         
        //   243: ldc             ""
        //   245: astore_3       
        //   246: aload_0        
        //   247: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //   250: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //   253: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer.SHULKERS:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer;
        //   256: if_acmpne       275
        //   259: sipush          -26022
        //   262: sipush          30936
        //   265: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   268: goto            284
        //   271: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   274: athrow         
        //   275: sipush          -26047
        //   278: sipush          31880
        //   281: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   284: astore          4
        //   286: sipush          -25989
        //   289: sipush          5262
        //   292: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   295: iconst_4       
        //   296: anewarray       Ljava/lang/Object;
        //   299: dup            
        //   300: iconst_0       
        //   301: aload           4
        //   303: aastore        
        //   304: dup            
        //   305: iconst_1       
        //   306: aload_0        
        //   307: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //   310: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //   313: aastore        
        //   314: dup            
        //   315: iconst_2       
        //   316: aload_0        
        //   317: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.eventQ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //   320: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6.getValue:()Ljava/lang/Object;
        //   323: aastore        
        //   324: dup            
        //   325: iconst_3       
        //   326: aload_3        
        //   327: aastore        
        //   328: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   331: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_5.setString:(Ljava/lang/String;)V
        //   334: return         
        //    StackMapTable: 00 15 FF 00 2A 00 02 07 00 02 03 00 01 07 00 90 03 52 07 00 90 03 4E 07 00 90 03 04 60 07 00 90 03 49 07 00 90 03 06 79 07 00 90 03 59 07 00 90 03 41 07 00 96 FF 00 19 00 03 07 00 02 03 07 00 96 00 01 07 00 90 03 48 07 00 96 FA 00 31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  15     39     42     46     Ljava/lang/NumberFormatException;
        //  23     62     65     69     Ljava/lang/NumberFormatException;
        //  46     81     84     88     Ljava/lang/NumberFormatException;
        //  93     123    126    130    Ljava/lang/NumberFormatException;
        //  110    140    140    144    Ljava/lang/NumberFormatException;
        //  151    206    209    213    Ljava/lang/NumberFormatException;
        //  199    239    239    243    Ljava/lang/NumberFormatException;
        //  246    271    271    275    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    
    @Override
    public void execute_1() {
        this.coreH = Initializer_7.NONE;
    }
    
    private void execute_2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             ""
        //     3: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.strValue:Ljava/lang/String;
        //     6: aload_0        
        //     7: iconst_0       
        //     8: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.boolFlag:Z
        //    11: aload_0        
        //    12: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_2:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //    15: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //    18: checkcast       Ljava/lang/Boolean;
        //    21: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    24: ifeq            127
        //    27: aload_0        
        //    28: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.eventQ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //    31: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6.getValue:()Ljava/lang/Object;
        //    34: checkcast       Ljava/lang/String;
        //    37: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    40: invokevirtual   java/lang/String.isEmpty:()Z
        //    43: ifne            127
        //    46: goto            53
        //    49: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    52: athrow         
        //    53: aload_0        
        //    54: aload_0        
        //    55: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.eventQ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //    58: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6.getValue:()Ljava/lang/Object;
        //    61: checkcast       Ljava/lang/String;
        //    64: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    67: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.strValue:Ljava/lang/String;
        //    70: aload_0        
        //    71: iconst_1       
        //    72: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.boolFlag:Z
        //    75: aload_0        
        //    76: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //    79: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //    82: checkcast       Ljava/lang/Boolean;
        //    85: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    88: ifeq            127
        //    91: goto            98
        //    94: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    97: athrow         
        //    98: aload_0        
        //    99: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.strValue:Ljava/lang/String;
        //   102: sipush          -26030
        //   105: sipush          -4066
        //   108: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   111: swap           
        //   112: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   117: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_5.setString:(Ljava/lang/String;)V
        //   120: goto            127
        //   123: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   126: athrow         
        //   127: return         
        //    StackMapTable: 00 06 71 07 00 90 03 68 07 00 90 03 58 07 00 90 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      46     49     53     Ljava/lang/NumberFormatException;
        //  27     91     94     98     Ljava/lang/NumberFormatException;
        //  53     120    123    127    Ljava/lang/NumberFormatException;
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
        //     3: astore_1       
        //     4: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //     7: aload_1        
        //     8: ifnull          34
        //    11: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //    14: ifnull          40
        //    17: goto            24
        //    20: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    23: athrow         
        //    24: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //    27: goto            34
        //    30: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    33: athrow         
        //    34: getfield        net/minecraft/class_310.field_1687:Lnet/minecraft/class_638;
        //    37: ifnonnull       45
        //    40: return         
        //    41: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    44: athrow         
        //    45: invokestatic    java/lang/System.currentTimeMillis:()J
        //    48: lstore_2       
        //    49: aload_0        
        //    50: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //    53: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.ordinal:()I
        //    56: aload_1        
        //    57: ifnull          222
        //    60: tableswitch {
        //                0: 5502
        //                1: 251
        //                2: 370
        //                3: 651
        //                4: 1191
        //                5: 1481
        //                6: 1914
        //                7: 2251
        //                8: 2480
        //                9: 2716
        //               10: 2966
        //               11: 3966
        //               12: 4528
        //               13: 4633
        //               14: 5107
        //               15: 5335
        //               16: 148
        //          default: 5502
        //        }
        //   144: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   147: athrow         
        //   148: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //   151: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   154: getfield        net/minecraft/class_746.field_3944:Lnet/minecraft/class_634;
        //   157: aload_0        
        //   158: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.strValue:Ljava/lang/String;
        //   161: sipush          -26031
        //   164: sipush          264
        //   167: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   170: swap           
        //   171: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   176: invokevirtual   net/minecraft/class_634.method_45730:(Ljava/lang/String;)V
        //   179: aload_0        
        //   180: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.ORDERS:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   183: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   186: aload_0        
        //   187: lload_2        
        //   188: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //   191: aload_0        
        //   192: aload_1        
        //   193: ifnull          226
        //   196: goto            203
        //   199: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   202: athrow         
        //   203: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //   206: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //   209: checkcast       Ljava/lang/Boolean;
        //   212: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   215: goto            222
        //   218: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   221: athrow         
        //   222: ifeq            5502
        //   225: aload_0        
        //   226: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.strValue:Ljava/lang/String;
        //   229: sipush          -26011
        //   232: sipush          24873
        //   235: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   238: swap           
        //   239: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   244: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_5.setString:(Ljava/lang/String;)V
        //   247: aload_1        
        //   248: ifnonnull       5502
        //   251: aload_0        
        //   252: aload_1        
        //   253: ifnull          328
        //   256: goto            263
        //   259: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   262: athrow         
        //   263: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //   266: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //   269: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4.SELL_ONLY:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4;
        //   272: if_acmpeq       313
        //   275: goto            282
        //   278: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   281: athrow         
        //   282: aload_0        
        //   283: aload_1        
        //   284: ifnull          362
        //   287: goto            294
        //   290: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   293: athrow         
        //   294: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //   297: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //   300: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4.ORDER_ONLY:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4;
        //   303: if_acmpne       333
        //   306: goto            313
        //   309: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   312: athrow         
        //   313: aload_0        
        //   314: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.WAIT:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   317: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   320: aload_0        
        //   321: goto            328
        //   324: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   327: athrow         
        //   328: lload_2        
        //   329: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //   332: return         
        //   333: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //   336: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   339: getfield        net/minecraft/class_746.field_3944:Lnet/minecraft/class_634;
        //   342: sipush          -26041
        //   345: sipush          19832
        //   348: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   351: invokevirtual   net/minecraft/class_634.method_45730:(Ljava/lang/String;)V
        //   354: aload_0        
        //   355: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP_END:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   358: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   361: aload_0        
        //   362: lload_2        
        //   363: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //   366: aload_1        
        //   367: ifnonnull       5502
        //   370: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //   373: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //   376: astore          5
        //   378: aload           5
        //   380: aload_1        
        //   381: ifnull          406
        //   384: instanceof      Lnet/minecraft/class_476;
        //   387: ifeq            647
        //   390: goto            397
        //   393: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   396: athrow         
        //   397: aload           5
        //   399: goto            406
        //   402: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   405: athrow         
        //   406: checkcast       Lnet/minecraft/class_476;
        //   409: astore          4
        //   411: aload           4
        //   413: invokevirtual   net/minecraft/class_476.method_17577:()Lnet/minecraft/class_1703;
        //   416: astore          5
        //   418: aload           5
        //   420: getfield        net/minecraft/class_1703.field_7761:Lnet/minecraft/class_2371;
        //   423: invokevirtual   net/minecraft/class_2371.iterator:()Ljava/util/Iterator;
        //   426: astore          6
        //   428: aload           6
        //   430: invokeinterface java/util/Iterator.hasNext:()Z
        //   435: ifeq            572
        //   438: aload           6
        //   440: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   445: checkcast       Lnet/minecraft/class_1735;
        //   448: astore          7
        //   450: aload           7
        //   452: invokevirtual   net/minecraft/class_1735.method_7677:()Lnet/minecraft/class_1799;
        //   455: astore          8
        //   457: aload           8
        //   459: invokevirtual   net/minecraft/class_1799.method_7960:()Z
        //   462: aload_1        
        //   463: ifnull          616
        //   466: aload_1        
        //   467: ifnull          511
        //   470: goto            477
        //   473: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   476: athrow         
        //   477: ifne            568
        //   480: goto            487
        //   483: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   486: athrow         
        //   487: aload_0        
        //   488: aload_1        
        //   489: ifnull          563
        //   492: goto            499
        //   495: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   498: athrow         
        //   499: aload           8
        //   501: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.checkClass_1799_2:(Lnet/minecraft/class_1799;)Z
        //   504: goto            511
        //   507: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   510: athrow         
        //   511: ifeq            568
        //   514: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //   517: getfield        net/minecraft/class_310.field_1761:Lnet/minecraft/class_636;
        //   520: aload           5
        //   522: getfield        net/minecraft/class_1703.field_7763:I
        //   525: aload           7
        //   527: getfield        net/minecraft/class_1735.field_7874:I
        //   530: iconst_0       
        //   531: getstatic       net/minecraft/class_1713.field_7790:Lnet/minecraft/class_1713;
        //   534: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //   537: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   540: invokevirtual   net/minecraft/class_636.method_2906:(IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
        //   543: aload_0        
        //   544: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP_ITEM:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   547: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   550: aload_0        
        //   551: lload_2        
        //   552: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //   555: aload_0        
        //   556: goto            563
        //   559: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   562: athrow         
        //   563: iconst_0       
        //   564: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_4:I
        //   567: return         
        //   568: aload_1        
        //   569: ifnonnull       428
        //   572: lload_2        
        //   573: aload_0        
        //   574: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //   577: lsub           
        //   578: aload_0        
        //   579: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //   582: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //   585: checkcast       Ljava/lang/Boolean;
        //   588: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   591: aload_1        
        //   592: ifnull          608
        //   595: ifeq            611
        //   598: goto            605
        //   601: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   604: athrow         
        //   605: sipush          1000
        //   608: goto            614
        //   611: sipush          3000
        //   614: i2l            
        //   615: lcmp           
        //   616: ifle            647
        //   619: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //   622: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   625: invokevirtual   net/minecraft/class_746.method_7346:()V
        //   628: aload_0        
        //   629: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   632: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //   635: aload_0        
        //   636: lload_2        
        //   637: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //   640: goto            647
        //   643: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   646: athrow         
        //   647: aload_1        
        //   648: ifnonnull       5502
        //   651: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //   654: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //   657: astore          5
        //   659: aload           5
        //   661: aload_1        
        //   662: ifnull          687
        //   665: instanceof      Lnet/minecraft/class_476;
        //   668: ifeq            1187
        //   671: goto            678
        //   674: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   677: athrow         
        //   678: aload           5
        //   680: goto            687
        //   683: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   686: athrow         
        //   687: checkcast       Lnet/minecraft/class_476;
        //   690: astore          4
        //   692: aload           4
        //   694: invokevirtual   net/minecraft/class_476.method_17577:()Lnet/minecraft/class_1703;
        //   697: astore          5
        //   699: iconst_0       
        //   700: istore          6
        //   702: aload           5
        //   704: getfield        net/minecraft/class_1703.field_7761:Lnet/minecraft/class_2371;
        //   707: invokevirtual   net/minecraft/class_2371.iterator:()Ljava/util/Iterator;
        //   710: astore          7
        //   712: aload           7
        //   714: invokeinterface java/util/Iterator.hasNext:()Z
        //   719: ifeq            1097
        //   722: aload           7
        //   724: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   729: checkcast       Lnet/minecraft/class_1735;
        //   732: astore          8
        //   734: aload           8
        //   736: invokevirtual   net/minecraft/class_1735.method_7677:()Lnet/minecraft/class_1799;
        //   739: astore          9
        //   741: aload_0        
        //   742: aload_1        
        //   743: ifnull          1183
        //   746: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //   749: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //   752: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer.SHULKERS:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer;
        //   755: aload_1        
        //   756: ifnull          831
        //   759: goto            766
        //   762: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   765: athrow         
        //   766: if_acmpne       803
        //   769: goto            776
        //   772: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   775: athrow         
        //   776: aload_0        
        //   777: aload           9
        //   779: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.checkClass_1799_4:(Lnet/minecraft/class_1799;)Z
        //   782: aload_1        
        //   783: ifnull          855
        //   786: goto            793
        //   789: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   792: athrow         
        //   793: ifne            854
        //   796: goto            803
        //   799: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   802: athrow         
        //   803: aload_0        
        //   804: aload_1        
        //   805: ifnull          835
        //   808: goto            815
        //   811: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   814: athrow         
        //   815: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //   818: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //   821: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer.SHULKER_SHELLS:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer;
        //   824: goto            831
        //   827: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   830: athrow         
        //   831: if_acmpne       858
        //   834: aload_0        
        //   835: aload           9
        //   837: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.checkClass_1799_3:(Lnet/minecraft/class_1799;)Z
        //   840: aload_1        
        //   841: ifnull          855
        //   844: ifeq            858
        //   847: goto            854
        //   850: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   853: athrow         
        //   854: iconst_1       
        //   855: goto            859
        //   858: iconst_0       
        //   859: istore          10
        //   861: aload           9
        //   863: invokevirtual   net/minecraft/class_1799.method_7960:()Z
        //   866: aload_1        
        //   867: ifnull          882
        //   870: ifne            1086
        //   873: goto            880
        //   876: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   879: athrow         
        //   880: iload           10
        //   882: ifeq            1086
        //   885: aload_0        
        //   886: aload_1        
        //   887: ifnull          1063
        //   890: goto            897
        //   893: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   896: athrow         
        //   897: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //   900: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //   903: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer.SHULKERS:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer;
        //   906: if_acmpne       1026
        //   909: goto            916
        //   912: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   915: athrow         
        //   916: aload_0        
        //   917: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //   920: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //   923: checkcast       Ljava/lang/Boolean;
        //   926: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   929: aload_1        
        //   930: ifnull          952
        //   933: goto            940
        //   936: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   939: athrow         
        //   940: ifeq            955
        //   943: goto            950
        //   946: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   949: athrow         
        //   950: bipush          10
        //   952: goto            956
        //   955: iconst_5       
        //   956: istore          11
        //   958: iconst_0       
        //   959: istore          12
        //   961: iload           12
        //   963: iload           11
        //   965: if_icmpge       1015
        //   968: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //   971: getfield        net/minecraft/class_310.field_1761:Lnet/minecraft/class_636;
        //   974: aload           5
        //   976: getfield        net/minecraft/class_1703.field_7763:I
        //   979: aload           8
        //   981: getfield        net/minecraft/class_1735.field_7874:I
        //   984: iconst_0       
        //   985: getstatic       net/minecraft/class_1713.field_7790:Lnet/minecraft/class_1713;
        //   988: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //   991: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   994: invokevirtual   net/minecraft/class_636.method_2906:(IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
        //   997: iinc            12, 1
        //  1000: aload_1        
        //  1001: ifnull          1022
        //  1004: aload_1        
        //  1005: ifnonnull       961
        //  1008: goto            1015
        //  1011: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1014: athrow         
        //  1015: aload_0        
        //  1016: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP_CONFIRM:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1019: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1022: aload_1        
        //  1023: ifnonnull       1069
        //  1026: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  1029: getfield        net/minecraft/class_310.field_1761:Lnet/minecraft/class_636;
        //  1032: aload           5
        //  1034: getfield        net/minecraft/class_1703.field_7763:I
        //  1037: aload           8
        //  1039: getfield        net/minecraft/class_1735.field_7874:I
        //  1042: iconst_0       
        //  1043: getstatic       net/minecraft/class_1713.field_7790:Lnet/minecraft/class_1713;
        //  1046: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  1049: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  1052: invokevirtual   net/minecraft/class_636.method_2906:(IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
        //  1055: aload_0        
        //  1056: goto            1063
        //  1059: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1062: athrow         
        //  1063: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP_GLASS_PANE:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1066: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1069: iconst_1       
        //  1070: istore          6
        //  1072: aload_0        
        //  1073: dup            
        //  1074: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_4:I
        //  1077: iconst_1       
        //  1078: iadd           
        //  1079: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_4:I
        //  1082: aload_1        
        //  1083: ifnonnull       1097
        //  1086: aload_1        
        //  1087: ifnonnull       712
        //  1090: goto            1097
        //  1093: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1096: athrow         
        //  1097: iload           6
        //  1099: ifeq            1112
        //  1102: aload_0        
        //  1103: lload_2        
        //  1104: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  1107: return         
        //  1108: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1111: athrow         
        //  1112: lload_2        
        //  1113: aload_0        
        //  1114: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  1117: lsub           
        //  1118: aload_0        
        //  1119: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  1122: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  1125: checkcast       Ljava/lang/Boolean;
        //  1128: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1131: aload_1        
        //  1132: ifnull          1148
        //  1135: ifeq            1151
        //  1138: goto            1145
        //  1141: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1144: athrow         
        //  1145: sipush          500
        //  1148: goto            1154
        //  1151: sipush          1500
        //  1154: i2l            
        //  1155: lcmp           
        //  1156: ifle            1187
        //  1159: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  1162: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  1165: invokevirtual   net/minecraft/class_746.method_7346:()V
        //  1168: aload_0        
        //  1169: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1172: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1175: aload_0        
        //  1176: goto            1183
        //  1179: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1182: athrow         
        //  1183: lload_2        
        //  1184: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  1187: aload_1        
        //  1188: ifnonnull       5502
        //  1191: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  1194: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //  1197: astore          5
        //  1199: aload           5
        //  1201: aload_1        
        //  1202: ifnull          1227
        //  1205: instanceof      Lnet/minecraft/class_476;
        //  1208: ifeq            1477
        //  1211: goto            1218
        //  1214: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1217: athrow         
        //  1218: aload           5
        //  1220: goto            1227
        //  1223: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1226: athrow         
        //  1227: checkcast       Lnet/minecraft/class_476;
        //  1230: astore          4
        //  1232: aload           4
        //  1234: invokevirtual   net/minecraft/class_476.method_17577:()Lnet/minecraft/class_1703;
        //  1237: astore          5
        //  1239: aload           5
        //  1241: getfield        net/minecraft/class_1703.field_7761:Lnet/minecraft/class_2371;
        //  1244: invokevirtual   net/minecraft/class_2371.iterator:()Ljava/util/Iterator;
        //  1247: astore          6
        //  1249: aload           6
        //  1251: invokeinterface java/util/Iterator.hasNext:()Z
        //  1256: ifeq            1402
        //  1259: aload           6
        //  1261: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1266: checkcast       Lnet/minecraft/class_1735;
        //  1269: astore          7
        //  1271: aload           7
        //  1273: invokevirtual   net/minecraft/class_1735.method_7677:()Lnet/minecraft/class_1799;
        //  1276: astore          8
        //  1278: aload           8
        //  1280: invokevirtual   net/minecraft/class_1799.method_7960:()Z
        //  1283: aload_1        
        //  1284: ifnull          1446
        //  1287: aload_1        
        //  1288: ifnull          1321
        //  1291: goto            1298
        //  1294: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1297: athrow         
        //  1298: ifne            1398
        //  1301: goto            1308
        //  1304: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1307: athrow         
        //  1308: aload_0        
        //  1309: aload           8
        //  1311: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.checkClass_1799_5:(Lnet/minecraft/class_1799;)Z
        //  1314: goto            1321
        //  1317: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1320: athrow         
        //  1321: aload_1        
        //  1322: ifnull          1347
        //  1325: ifeq            1398
        //  1328: goto            1335
        //  1331: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1334: athrow         
        //  1335: aload           8
        //  1337: invokevirtual   net/minecraft/class_1799.method_7947:()I
        //  1340: goto            1347
        //  1343: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1346: athrow         
        //  1347: bipush          64
        //  1349: if_icmpne       1398
        //  1352: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  1355: getfield        net/minecraft/class_310.field_1761:Lnet/minecraft/class_636;
        //  1358: aload           5
        //  1360: getfield        net/minecraft/class_1703.field_7763:I
        //  1363: aload           7
        //  1365: getfield        net/minecraft/class_1735.field_7874:I
        //  1368: iconst_0       
        //  1369: getstatic       net/minecraft/class_1713.field_7790:Lnet/minecraft/class_1713;
        //  1372: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  1375: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  1378: invokevirtual   net/minecraft/class_636.method_2906:(IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
        //  1381: aload_0        
        //  1382: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP_BUY:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1385: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1388: aload_0        
        //  1389: lload_2        
        //  1390: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  1393: return         
        //  1394: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1397: athrow         
        //  1398: aload_1        
        //  1399: ifnonnull       1249
        //  1402: lload_2        
        //  1403: aload_0        
        //  1404: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  1407: lsub           
        //  1408: aload_0        
        //  1409: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  1412: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  1415: checkcast       Ljava/lang/Boolean;
        //  1418: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1421: aload_1        
        //  1422: ifnull          1438
        //  1425: ifeq            1441
        //  1428: goto            1435
        //  1431: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1434: athrow         
        //  1435: sipush          300
        //  1438: goto            1444
        //  1441: sipush          1000
        //  1444: i2l            
        //  1445: lcmp           
        //  1446: ifle            1477
        //  1449: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  1452: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  1455: invokevirtual   net/minecraft/class_746.method_7346:()V
        //  1458: aload_0        
        //  1459: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1462: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1465: aload_0        
        //  1466: lload_2        
        //  1467: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  1470: goto            1477
        //  1473: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1476: athrow         
        //  1477: aload_1        
        //  1478: ifnonnull       5502
        //  1481: aload_0        
        //  1482: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  1485: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  1488: checkcast       Ljava/lang/Boolean;
        //  1491: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1494: ifeq            1514
        //  1497: goto            1504
        //  1500: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1503: athrow         
        //  1504: ldc2_w          500
        //  1507: goto            1517
        //  1510: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1513: athrow         
        //  1514: ldc2_w          1000
        //  1517: lstore          4
        //  1519: lload_2        
        //  1520: aload_0        
        //  1521: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  1524: lsub           
        //  1525: lload           4
        //  1527: lcmp           
        //  1528: iflt            1910
        //  1531: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  1534: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //  1537: astore          7
        //  1539: aload           7
        //  1541: aload_1        
        //  1542: ifnull          1567
        //  1545: instanceof      Lnet/minecraft/class_476;
        //  1548: ifeq            1910
        //  1551: goto            1558
        //  1554: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1557: athrow         
        //  1558: aload           7
        //  1560: goto            1567
        //  1563: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1566: athrow         
        //  1567: checkcast       Lnet/minecraft/class_476;
        //  1570: astore          6
        //  1572: aload           6
        //  1574: invokevirtual   net/minecraft/class_476.method_17577:()Lnet/minecraft/class_1703;
        //  1577: astore          7
        //  1579: aload           7
        //  1581: getfield        net/minecraft/class_1703.field_7761:Lnet/minecraft/class_2371;
        //  1584: invokevirtual   net/minecraft/class_2371.iterator:()Ljava/util/Iterator;
        //  1587: astore          8
        //  1589: aload           8
        //  1591: invokeinterface java/util/Iterator.hasNext:()Z
        //  1596: ifeq            1844
        //  1599: aload           8
        //  1601: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1606: checkcast       Lnet/minecraft/class_1735;
        //  1609: astore          9
        //  1611: aload           9
        //  1613: invokevirtual   net/minecraft/class_1735.method_7677:()Lnet/minecraft/class_1799;
        //  1616: astore          10
        //  1618: aload           10
        //  1620: invokevirtual   net/minecraft/class_1799.method_7960:()Z
        //  1623: aload_1        
        //  1624: ifnull          1888
        //  1627: aload_1        
        //  1628: ifnull          1661
        //  1631: goto            1638
        //  1634: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1637: athrow         
        //  1638: ifne            1840
        //  1641: goto            1648
        //  1644: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1647: athrow         
        //  1648: aload_0        
        //  1649: aload           10
        //  1651: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.checkClass_1799_1:(Lnet/minecraft/class_1799;)Z
        //  1654: goto            1661
        //  1657: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1660: athrow         
        //  1661: aload_1        
        //  1662: ifnull          1687
        //  1665: ifeq            1840
        //  1668: goto            1675
        //  1671: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1674: athrow         
        //  1675: aload           10
        //  1677: invokevirtual   net/minecraft/class_1799.method_7947:()I
        //  1680: goto            1687
        //  1683: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1686: athrow         
        //  1687: aload_1        
        //  1688: ifnull          1722
        //  1691: iconst_1       
        //  1692: if_icmpne       1840
        //  1695: goto            1702
        //  1698: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1701: athrow         
        //  1702: aload_0        
        //  1703: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  1706: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  1709: checkcast       Ljava/lang/Boolean;
        //  1712: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1715: goto            1722
        //  1718: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1721: athrow         
        //  1722: aload_1        
        //  1723: ifnull          1738
        //  1726: ifeq            1741
        //  1729: goto            1736
        //  1732: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1735: athrow         
        //  1736: bipush          50
        //  1738: goto            1743
        //  1741: bipush          30
        //  1743: istore          11
        //  1745: iconst_0       
        //  1746: istore          12
        //  1748: iload           12
        //  1750: iload           11
        //  1752: if_icmpge       1827
        //  1755: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  1758: getfield        net/minecraft/class_310.field_1761:Lnet/minecraft/class_636;
        //  1761: aload           7
        //  1763: getfield        net/minecraft/class_1703.field_7763:I
        //  1766: aload           9
        //  1768: getfield        net/minecraft/class_1735.field_7874:I
        //  1771: iconst_0       
        //  1772: getstatic       net/minecraft/class_1713.field_7790:Lnet/minecraft/class_1713;
        //  1775: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  1778: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  1781: invokevirtual   net/minecraft/class_636.method_2906:(IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
        //  1784: aload_1        
        //  1785: ifnull          1823
        //  1788: aload_0        
        //  1789: aload_1        
        //  1790: ifnull          1835
        //  1793: goto            1800
        //  1796: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1799: athrow         
        //  1800: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.isEnabled:()Z
        //  1803: ifeq            1820
        //  1806: goto            1813
        //  1809: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1812: athrow         
        //  1813: goto            1827
        //  1816: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1819: athrow         
        //  1820: iinc            12, 1
        //  1823: aload_1        
        //  1824: ifnonnull       1748
        //  1827: aload_0        
        //  1828: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP_CHECK_FULL:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1831: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1834: aload_0        
        //  1835: lload_2        
        //  1836: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  1839: return         
        //  1840: aload_1        
        //  1841: ifnonnull       1589
        //  1844: lload_2        
        //  1845: aload_0        
        //  1846: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  1849: lsub           
        //  1850: aload_0        
        //  1851: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  1854: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  1857: checkcast       Ljava/lang/Boolean;
        //  1860: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1863: aload_1        
        //  1864: ifnull          1880
        //  1867: ifeq            1883
        //  1870: goto            1877
        //  1873: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1876: athrow         
        //  1877: sipush          2000
        //  1880: goto            1886
        //  1883: sipush          3000
        //  1886: i2l            
        //  1887: lcmp           
        //  1888: ifle            1910
        //  1891: aload_0        
        //  1892: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP_GLASS_PANE:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1895: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  1898: aload_0        
        //  1899: lload_2        
        //  1900: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  1903: goto            1910
        //  1906: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1909: athrow         
        //  1910: aload_1        
        //  1911: ifnonnull       5502
        //  1914: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  1917: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //  1920: astore          5
        //  1922: aload           5
        //  1924: aload_1        
        //  1925: ifnull          1950
        //  1928: instanceof      Lnet/minecraft/class_476;
        //  1931: ifeq            2247
        //  1934: goto            1941
        //  1937: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1940: athrow         
        //  1941: aload           5
        //  1943: goto            1950
        //  1946: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  1949: athrow         
        //  1950: checkcast       Lnet/minecraft/class_476;
        //  1953: astore          4
        //  1955: aload           4
        //  1957: invokevirtual   net/minecraft/class_476.method_17577:()Lnet/minecraft/class_1703;
        //  1960: astore          5
        //  1962: iconst_0       
        //  1963: istore          6
        //  1965: aload           5
        //  1967: getfield        net/minecraft/class_1703.field_7761:Lnet/minecraft/class_2371;
        //  1970: invokevirtual   net/minecraft/class_2371.iterator:()Ljava/util/Iterator;
        //  1973: astore          7
        //  1975: aload           7
        //  1977: invokeinterface java/util/Iterator.hasNext:()Z
        //  1982: ifeq            2159
        //  1985: aload           7
        //  1987: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1992: checkcast       Lnet/minecraft/class_1735;
        //  1995: astore          8
        //  1997: aload           8
        //  1999: invokevirtual   net/minecraft/class_1735.method_7677:()Lnet/minecraft/class_1799;
        //  2002: astore          9
        //  2004: aload           9
        //  2006: invokevirtual   net/minecraft/class_1799.method_7960:()Z
        //  2009: aload_1        
        //  2010: ifnull          2161
        //  2013: aload_1        
        //  2014: ifnull          2047
        //  2017: goto            2024
        //  2020: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2023: athrow         
        //  2024: ifne            2148
        //  2027: goto            2034
        //  2030: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2033: athrow         
        //  2034: aload_0        
        //  2035: aload           9
        //  2037: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.checkClass_1799_1:(Lnet/minecraft/class_1799;)Z
        //  2040: goto            2047
        //  2043: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2046: athrow         
        //  2047: aload_1        
        //  2048: ifnull          2062
        //  2051: ifeq            2148
        //  2054: goto            2061
        //  2057: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2060: athrow         
        //  2061: iconst_0       
        //  2062: istore          10
        //  2064: iload           10
        //  2066: aload_0        
        //  2067: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  2070: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  2073: checkcast       Ljava/lang/Boolean;
        //  2076: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2079: ifeq            2094
        //  2082: iconst_3       
        //  2083: aload_1        
        //  2084: ifnull          2095
        //  2087: goto            2095
        //  2090: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2093: athrow         
        //  2094: iconst_2       
        //  2095: if_icmpge       2141
        //  2098: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  2101: getfield        net/minecraft/class_310.field_1761:Lnet/minecraft/class_636;
        //  2104: aload           5
        //  2106: getfield        net/minecraft/class_1703.field_7763:I
        //  2109: aload           8
        //  2111: getfield        net/minecraft/class_1735.field_7874:I
        //  2114: iconst_0       
        //  2115: getstatic       net/minecraft/class_1713.field_7790:Lnet/minecraft/class_1713;
        //  2118: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  2121: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  2124: invokevirtual   net/minecraft/class_636.method_2906:(IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
        //  2127: iinc            10, 1
        //  2130: aload_1        
        //  2131: ifnonnull       2064
        //  2134: goto            2141
        //  2137: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2140: athrow         
        //  2141: iconst_1       
        //  2142: istore          6
        //  2144: aload_1        
        //  2145: ifnonnull       2159
        //  2148: aload_1        
        //  2149: ifnonnull       1975
        //  2152: goto            2159
        //  2155: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2158: athrow         
        //  2159: iload           6
        //  2161: ifeq            2181
        //  2164: aload_0        
        //  2165: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP_CHECK_FULL:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2168: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2171: aload_0        
        //  2172: lload_2        
        //  2173: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  2176: return         
        //  2177: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2180: athrow         
        //  2181: lload_2        
        //  2182: aload_0        
        //  2183: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  2186: lsub           
        //  2187: aload_0        
        //  2188: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  2191: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  2194: checkcast       Ljava/lang/Boolean;
        //  2197: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2200: aload_1        
        //  2201: ifnull          2217
        //  2204: ifeq            2220
        //  2207: goto            2214
        //  2210: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2213: athrow         
        //  2214: sipush          200
        //  2217: goto            2223
        //  2220: sipush          800
        //  2223: i2l            
        //  2224: lcmp           
        //  2225: ifle            2247
        //  2228: aload_0        
        //  2229: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP_ITEM:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2232: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2235: aload_0        
        //  2236: lload_2        
        //  2237: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  2240: goto            2247
        //  2243: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2246: athrow         
        //  2247: aload_1        
        //  2248: ifnonnull       5502
        //  2251: lload_2        
        //  2252: aload_0        
        //  2253: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  2256: lsub           
        //  2257: aload_0        
        //  2258: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  2261: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  2264: checkcast       Ljava/lang/Boolean;
        //  2267: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2270: aload_1        
        //  2271: ifnull          2293
        //  2274: goto            2281
        //  2277: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2280: athrow         
        //  2281: ifeq            2296
        //  2284: goto            2291
        //  2287: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2290: athrow         
        //  2291: bipush          100
        //  2293: goto            2299
        //  2296: sipush          200
        //  2299: i2l            
        //  2300: lcmp           
        //  2301: aload_1        
        //  2302: ifnull          2337
        //  2305: ifle            5502
        //  2308: goto            2315
        //  2311: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2314: athrow         
        //  2315: aload_0        
        //  2316: aload_1        
        //  2317: ifnull          2395
        //  2320: goto            2327
        //  2323: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2326: athrow         
        //  2327: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.isEnabled:()Z
        //  2330: goto            2337
        //  2333: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2336: athrow         
        //  2337: ifne            2371
        //  2340: aload_0        
        //  2341: aload_1        
        //  2342: ifnull          2395
        //  2345: goto            2352
        //  2348: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2351: athrow         
        //  2352: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  2355: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  2358: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4.BUY_ONLY:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4;
        //  2361: if_acmpne       2403
        //  2364: goto            2371
        //  2367: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2370: athrow         
        //  2371: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  2374: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  2377: invokevirtual   net/minecraft/class_746.method_7346:()V
        //  2380: aload_0        
        //  2381: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP_EXIT:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2384: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2387: aload_0        
        //  2388: goto            2395
        //  2391: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2394: athrow         
        //  2395: lload_2        
        //  2396: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  2399: aload_1        
        //  2400: ifnonnull       5502
        //  2403: lload_2        
        //  2404: aload_0        
        //  2405: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  2408: lsub           
        //  2409: aload_0        
        //  2410: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  2413: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  2416: checkcast       Ljava/lang/Boolean;
        //  2419: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2422: aload_1        
        //  2423: ifnull          2446
        //  2426: goto            2433
        //  2429: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2432: athrow         
        //  2433: ifeq            2449
        //  2436: goto            2443
        //  2439: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2442: athrow         
        //  2443: sipush          200
        //  2446: goto            2452
        //  2449: sipush          400
        //  2452: i2l            
        //  2453: lcmp           
        //  2454: ifle            5502
        //  2457: aload_0        
        //  2458: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP_ITEM:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2461: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2464: aload_0        
        //  2465: lload_2        
        //  2466: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  2469: aload_1        
        //  2470: ifnonnull       5502
        //  2473: goto            2480
        //  2476: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2479: athrow         
        //  2480: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  2483: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //  2486: aload_1        
        //  2487: ifnull          2532
        //  2490: goto            2497
        //  2493: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2496: athrow         
        //  2497: ifnonnull       2637
        //  2500: goto            2507
        //  2503: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2506: athrow         
        //  2507: aload_0        
        //  2508: aload_1        
        //  2509: ifnull          2626
        //  2512: goto            2519
        //  2515: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2518: athrow         
        //  2519: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  2522: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  2525: goto            2532
        //  2528: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2531: athrow         
        //  2532: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4.BUY_ONLY:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4;
        //  2535: if_acmpne       2618
        //  2538: aload_0        
        //  2539: aload_1        
        //  2540: ifnull          2608
        //  2543: goto            2550
        //  2546: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2549: athrow         
        //  2550: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_4:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  2553: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  2556: checkcast       Ljava/lang/Boolean;
        //  2559: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2562: ifeq            2607
        //  2565: goto            2572
        //  2568: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2571: athrow         
        //  2572: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  2575: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  2578: getfield        net/minecraft/class_746.field_3944:Lnet/minecraft/class_634;
        //  2581: new             Lnet/minecraft/class_2846;
        //  2584: dup            
        //  2585: getstatic       net/minecraft/class_2846$class_2847.field_12970:Lnet/minecraft/class_2846$class_2847;
        //  2588: getstatic       net/minecraft/class_2338.field_10980:Lnet/minecraft/class_2338;
        //  2591: getstatic       net/minecraft/class_2350.field_11033:Lnet/minecraft/class_2350;
        //  2594: invokespecial   net/minecraft/class_2846.<init>:(Lnet/minecraft/class_2846$class_2847;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)V
        //  2597: invokevirtual   net/minecraft/class_634.method_52787:(Lnet/minecraft/class_2596;)V
        //  2600: goto            2607
        //  2603: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2606: athrow         
        //  2607: aload_0        
        //  2608: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.CYCLE_PAUSE:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2611: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2614: aload_1        
        //  2615: ifnonnull       2632
        //  2618: aload_0        
        //  2619: goto            2626
        //  2622: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2625: athrow         
        //  2626: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.WAIT:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2629: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2632: aload_0        
        //  2633: lload_2        
        //  2634: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  2637: lload_2        
        //  2638: aload_0        
        //  2639: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  2642: lsub           
        //  2643: aload_0        
        //  2644: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  2647: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  2650: checkcast       Ljava/lang/Boolean;
        //  2653: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2656: aload_1        
        //  2657: ifnull          2673
        //  2660: ifeq            2676
        //  2663: goto            2670
        //  2666: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2669: athrow         
        //  2670: sipush          1000
        //  2673: goto            2679
        //  2676: sipush          5000
        //  2679: i2l            
        //  2680: lcmp           
        //  2681: ifle            5502
        //  2684: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  2687: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  2690: invokevirtual   net/minecraft/class_746.method_7346:()V
        //  2693: aload_0        
        //  2694: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2697: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2700: aload_0        
        //  2701: lload_2        
        //  2702: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  2705: aload_1        
        //  2706: ifnonnull       5502
        //  2709: goto            2716
        //  2712: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2715: athrow         
        //  2716: aload_0        
        //  2717: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  2720: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  2723: aload_1        
        //  2724: ifnull          2771
        //  2727: goto            2734
        //  2730: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2733: athrow         
        //  2734: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4.BUY_ONLY:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4;
        //  2737: if_acmpne       2764
        //  2740: goto            2747
        //  2743: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2746: athrow         
        //  2747: aload_0        
        //  2748: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2751: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2754: aload_0        
        //  2755: lload_2        
        //  2756: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  2759: return         
        //  2760: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2763: athrow         
        //  2764: aload_0        
        //  2765: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  2768: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  2771: checkcast       Ljava/lang/Boolean;
        //  2774: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2777: ifeq            2790
        //  2780: ldc2_w          25
        //  2783: goto            2793
        //  2786: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2789: athrow         
        //  2790: ldc2_w          50
        //  2793: lstore          4
        //  2795: lload_2        
        //  2796: aload_0        
        //  2797: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  2800: lsub           
        //  2801: lload           4
        //  2803: lcmp           
        //  2804: aload_1        
        //  2805: ifnull          2840
        //  2808: iflt            2962
        //  2811: goto            2818
        //  2814: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2817: athrow         
        //  2818: aload_0        
        //  2819: aload_1        
        //  2820: ifnull          2903
        //  2823: goto            2830
        //  2826: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2829: athrow         
        //  2830: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.boolFlag:Z
        //  2833: goto            2840
        //  2836: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2839: athrow         
        //  2840: ifeq            2889
        //  2843: aload_0        
        //  2844: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.strValue:Ljava/lang/String;
        //  2847: aload_1        
        //  2848: ifnull          2903
        //  2851: goto            2858
        //  2854: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2857: athrow         
        //  2858: invokevirtual   java/lang/String.isEmpty:()Z
        //  2861: ifne            2889
        //  2864: goto            2871
        //  2867: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2870: athrow         
        //  2871: aload_0        
        //  2872: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.TARGET_ORDERS:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2875: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2878: aload_1        
        //  2879: ifnonnull       2957
        //  2882: goto            2889
        //  2885: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2888: athrow         
        //  2889: aload_0        
        //  2890: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  2893: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  2896: goto            2903
        //  2899: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2902: athrow         
        //  2903: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer.SHULKERS:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer;
        //  2906: if_acmpne       2925
        //  2909: sipush          -26002
        //  2912: sipush          -15070
        //  2915: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //  2918: goto            2934
        //  2921: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2924: athrow         
        //  2925: sipush          -26014
        //  2928: sipush          13892
        //  2931: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //  2934: astore          6
        //  2936: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  2939: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  2942: getfield        net/minecraft/class_746.field_3944:Lnet/minecraft/class_634;
        //  2945: aload           6
        //  2947: invokevirtual   net/minecraft/class_634.method_45730:(Ljava/lang/String;)V
        //  2950: aload_0        
        //  2951: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.ORDERS:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2954: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  2957: aload_0        
        //  2958: lload_2        
        //  2959: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  2962: aload_1        
        //  2963: ifnonnull       5502
        //  2966: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  2969: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //  2972: astore          5
        //  2974: aload           5
        //  2976: aload_1        
        //  2977: ifnull          3002
        //  2980: instanceof      Lnet/minecraft/class_476;
        //  2983: ifeq            3962
        //  2986: goto            2993
        //  2989: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  2992: athrow         
        //  2993: aload           5
        //  2995: goto            3002
        //  2998: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3001: athrow         
        //  3002: checkcast       Lnet/minecraft/class_476;
        //  3005: astore          4
        //  3007: aload           4
        //  3009: invokevirtual   net/minecraft/class_476.method_17577:()Lnet/minecraft/class_1703;
        //  3012: astore          5
        //  3014: iconst_0       
        //  3015: istore          6
        //  3017: aload_0        
        //  3018: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  3021: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  3024: checkcast       Ljava/lang/Boolean;
        //  3027: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3030: aload_1        
        //  3031: ifnull          3061
        //  3034: ifeq            3065
        //  3037: goto            3044
        //  3040: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3043: athrow         
        //  3044: lload_2        
        //  3045: aload_0        
        //  3046: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  3049: lsub           
        //  3050: ldc2_w          200
        //  3053: lcmp           
        //  3054: goto            3061
        //  3057: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3060: athrow         
        //  3061: ifge            3065
        //  3064: return         
        //  3065: aload           5
        //  3067: getfield        net/minecraft/class_1703.field_7761:Lnet/minecraft/class_2371;
        //  3070: invokevirtual   net/minecraft/class_2371.iterator:()Ljava/util/Iterator;
        //  3073: astore          7
        //  3075: aload           7
        //  3077: invokeinterface java/util/Iterator.hasNext:()Z
        //  3082: ifeq            3826
        //  3085: aload           7
        //  3087: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3092: checkcast       Lnet/minecraft/class_1735;
        //  3095: astore          8
        //  3097: aload           8
        //  3099: invokevirtual   net/minecraft/class_1735.method_7677:()Lnet/minecraft/class_1799;
        //  3102: astore          9
        //  3104: aload_0        
        //  3105: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  3108: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  3111: aload_1        
        //  3112: ifnull          3919
        //  3115: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer.SHULKERS:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer;
        //  3118: aload_1        
        //  3119: ifnull          3221
        //  3122: goto            3129
        //  3125: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3128: athrow         
        //  3129: if_acmpne       3193
        //  3132: goto            3139
        //  3135: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3138: athrow         
        //  3139: aload_0        
        //  3140: aload_1        
        //  3141: ifnull          3218
        //  3144: goto            3151
        //  3147: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3150: athrow         
        //  3151: aload           9
        //  3153: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.checkClass_1799_4:(Lnet/minecraft/class_1799;)Z
        //  3156: ifeq            3193
        //  3159: goto            3166
        //  3162: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3165: athrow         
        //  3166: aload_0        
        //  3167: aload           9
        //  3169: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.checkClass_1799:(Lnet/minecraft/class_1799;)Z
        //  3172: aload_1        
        //  3173: ifnull          3245
        //  3176: goto            3183
        //  3179: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3182: athrow         
        //  3183: ifne            3244
        //  3186: goto            3193
        //  3189: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3192: athrow         
        //  3193: aload_0        
        //  3194: aload_1        
        //  3195: ifnull          3225
        //  3198: goto            3205
        //  3201: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3204: athrow         
        //  3205: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  3208: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  3211: goto            3218
        //  3214: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3217: athrow         
        //  3218: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer.SHULKER_SHELLS:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer;
        //  3221: if_acmpne       3248
        //  3224: aload_0        
        //  3225: aload           9
        //  3227: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.checkClass_1799_3:(Lnet/minecraft/class_1799;)Z
        //  3230: aload_1        
        //  3231: ifnull          3245
        //  3234: ifeq            3248
        //  3237: goto            3244
        //  3240: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3243: athrow         
        //  3244: iconst_1       
        //  3245: goto            3249
        //  3248: iconst_0       
        //  3249: istore          10
        //  3251: aload           9
        //  3253: invokevirtual   net/minecraft/class_1799.method_7960:()Z
        //  3256: aload_1        
        //  3257: ifnull          3272
        //  3260: ifne            3822
        //  3263: goto            3270
        //  3266: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3269: athrow         
        //  3270: iload           10
        //  3272: aload_1        
        //  3273: ifnull          3287
        //  3276: ifeq            3822
        //  3279: goto            3286
        //  3282: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3285: athrow         
        //  3286: iconst_0       
        //  3287: istore          11
        //  3289: aload_0        
        //  3290: aload           9
        //  3292: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeString_1:(Lnet/minecraft/class_1799;)Ljava/lang/String;
        //  3295: astore          12
        //  3297: aload_0        
        //  3298: aload           9
        //  3300: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.method_double_2:(Lnet/minecraft/class_1799;)D
        //  3303: dstore          13
        //  3305: aload_0        
        //  3306: aload_1        
        //  3307: ifnull          3368
        //  3310: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  3313: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  3316: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer.SHULKER_SHELLS:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer;
        //  3319: if_acmpne       3367
        //  3322: goto            3329
        //  3325: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3328: athrow         
        //  3329: dload           13
        //  3331: ldc2_w          1500.0
        //  3334: dcmpl          
        //  3335: aload_1        
        //  3336: ifnull          3371
        //  3339: goto            3346
        //  3342: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3345: athrow         
        //  3346: ifle            3367
        //  3349: goto            3356
        //  3352: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3355: athrow         
        //  3356: aload_1        
        //  3357: ifnonnull       3075
        //  3360: goto            3367
        //  3363: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3366: athrow         
        //  3367: aload_0        
        //  3368: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.boolFlag:Z
        //  3371: ifeq            3424
        //  3374: aload           12
        //  3376: aload_1        
        //  3377: ifnull          3399
        //  3380: goto            3387
        //  3383: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3386: athrow         
        //  3387: ifnull          3424
        //  3390: goto            3397
        //  3393: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3396: athrow         
        //  3397: aload           12
        //  3399: aload_0        
        //  3400: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.strValue:Ljava/lang/String;
        //  3403: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  3406: aload_1        
        //  3407: ifnull          3421
        //  3410: ifeq            3424
        //  3413: goto            3420
        //  3416: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3419: athrow         
        //  3420: iconst_1       
        //  3421: goto            3425
        //  3424: iconst_0       
        //  3425: istore          15
        //  3427: iload           15
        //  3429: aload_1        
        //  3430: ifnull          3574
        //  3433: ifeq            3554
        //  3436: goto            3443
        //  3439: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3442: athrow         
        //  3443: iconst_1       
        //  3444: istore          11
        //  3446: aload_0        
        //  3447: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  3450: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  3453: checkcast       Ljava/lang/Boolean;
        //  3456: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3459: aload_1        
        //  3460: ifnull          3686
        //  3463: ifeq            3684
        //  3466: goto            3473
        //  3469: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3472: athrow         
        //  3473: sipush          -26007
        //  3476: sipush          24128
        //  3479: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //  3482: iconst_2       
        //  3483: anewarray       Ljava/lang/Object;
        //  3486: dup            
        //  3487: iconst_0       
        //  3488: aload           12
        //  3490: aload_1        
        //  3491: ifnull          3531
        //  3494: goto            3501
        //  3497: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3500: athrow         
        //  3501: aastore        
        //  3502: dup            
        //  3503: iconst_1       
        //  3504: dload           13
        //  3506: dconst_0       
        //  3507: dcmpl          
        //  3508: ifle            3534
        //  3511: goto            3518
        //  3514: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3517: athrow         
        //  3518: aload_0        
        //  3519: dload           13
        //  3521: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeString:(D)Ljava/lang/String;
        //  3524: goto            3531
        //  3527: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3530: athrow         
        //  3531: goto            3543
        //  3534: sipush          -26036
        //  3537: sipush          -10472
        //  3540: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //  3543: aastore        
        //  3544: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  3547: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_5.setString:(Ljava/lang/String;)V
        //  3550: aload_1        
        //  3551: ifnonnull       3684
        //  3554: aload_0        
        //  3555: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_3:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  3558: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  3561: checkcast       Ljava/lang/Boolean;
        //  3564: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3567: goto            3574
        //  3570: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3573: athrow         
        //  3574: aload_1        
        //  3575: ifnull          3686
        //  3578: ifne            3684
        //  3581: goto            3588
        //  3584: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3587: athrow         
        //  3588: aload_0        
        //  3589: aload_0        
        //  3590: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.eventQ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //  3593: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6.getValue:()Ljava/lang/Object;
        //  3596: checkcast       Ljava/lang/String;
        //  3599: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.method_double_1:(Ljava/lang/String;)D
        //  3602: dstore          16
        //  3604: dload           13
        //  3606: dload           16
        //  3608: dcmpl          
        //  3609: aload_1        
        //  3610: ifnull          3686
        //  3613: iflt            3684
        //  3616: goto            3623
        //  3619: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3622: athrow         
        //  3623: iconst_1       
        //  3624: istore          11
        //  3626: aload_0        
        //  3627: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  3630: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  3633: checkcast       Ljava/lang/Boolean;
        //  3636: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3639: aload_1        
        //  3640: ifnull          3686
        //  3643: ifeq            3684
        //  3646: goto            3653
        //  3649: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3652: athrow         
        //  3653: aload_0        
        //  3654: dload           13
        //  3656: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeString:(D)Ljava/lang/String;
        //  3659: sipush          -26015
        //  3662: sipush          27510
        //  3665: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //  3668: swap           
        //  3669: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  3674: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_5.setString:(Ljava/lang/String;)V
        //  3677: goto            3684
        //  3680: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3683: athrow         
        //  3684: iload           11
        //  3686: ifeq            3822
        //  3689: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  3692: getfield        net/minecraft/class_310.field_1761:Lnet/minecraft/class_636;
        //  3695: aload           5
        //  3697: getfield        net/minecraft/class_1703.field_7763:I
        //  3700: aload           8
        //  3702: getfield        net/minecraft/class_1735.field_7874:I
        //  3705: iconst_0       
        //  3706: getstatic       net/minecraft/class_1713.field_7790:Lnet/minecraft/class_1713;
        //  3709: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  3712: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  3715: invokevirtual   net/minecraft/class_636.method_2906:(IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
        //  3718: aload_0        
        //  3719: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.ORDERS_SELECT:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  3722: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  3725: aload_0        
        //  3726: lload_2        
        //  3727: aload_0        
        //  3728: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  3731: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  3734: checkcast       Ljava/lang/Boolean;
        //  3737: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3740: aload_1        
        //  3741: ifnull          3763
        //  3744: goto            3751
        //  3747: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3750: athrow         
        //  3751: ifeq            3766
        //  3754: goto            3761
        //  3757: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3760: athrow         
        //  3761: bipush          100
        //  3763: goto            3768
        //  3766: bipush          50
        //  3768: i2l            
        //  3769: ladd           
        //  3770: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  3773: aload_0        
        //  3774: iconst_0       
        //  3775: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_1:I
        //  3778: aload_0        
        //  3779: lconst_0       
        //  3780: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_2:J
        //  3783: iconst_1       
        //  3784: istore          6
        //  3786: aload_0        
        //  3787: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  3790: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  3793: checkcast       Ljava/lang/Boolean;
        //  3796: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3799: ifeq            3821
        //  3802: sipush          -26018
        //  3805: sipush          15324
        //  3808: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //  3811: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_5.setString:(Ljava/lang/String;)V
        //  3814: goto            3821
        //  3817: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3820: athrow         
        //  3821: return         
        //  3822: aload_1        
        //  3823: ifnonnull       3075
        //  3826: iload           6
        //  3828: ifne            3962
        //  3831: lload_2        
        //  3832: aload_0        
        //  3833: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  3836: lsub           
        //  3837: aload_0        
        //  3838: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  3841: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  3844: checkcast       Ljava/lang/Boolean;
        //  3847: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3850: aload_1        
        //  3851: ifnull          3874
        //  3854: goto            3861
        //  3857: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3860: athrow         
        //  3861: ifeq            3877
        //  3864: goto            3871
        //  3867: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3870: athrow         
        //  3871: sipush          3000
        //  3874: goto            3880
        //  3877: sipush          5000
        //  3880: i2l            
        //  3881: lcmp           
        //  3882: ifle            3962
        //  3885: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  3888: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  3891: invokevirtual   net/minecraft/class_746.method_7346:()V
        //  3894: aload_0        
        //  3895: aload_1        
        //  3896: ifnull          3951
        //  3899: goto            3906
        //  3902: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3905: athrow         
        //  3906: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  3909: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  3912: goto            3919
        //  3915: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3918: athrow         
        //  3919: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4.ORDER_ONLY:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4;
        //  3922: if_acmpne       3943
        //  3925: aload_0        
        //  3926: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.CYCLE_PAUSE:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  3929: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  3932: aload_1        
        //  3933: ifnonnull       3957
        //  3936: goto            3943
        //  3939: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3942: athrow         
        //  3943: aload_0        
        //  3944: goto            3951
        //  3947: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3950: athrow         
        //  3951: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  3954: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  3957: aload_0        
        //  3958: lload_2        
        //  3959: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  3962: aload_1        
        //  3963: ifnonnull       5502
        //  3966: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  3969: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //  3972: astore          5
        //  3974: aload           5
        //  3976: aload_1        
        //  3977: ifnull          4002
        //  3980: instanceof      Lnet/minecraft/class_476;
        //  3983: ifeq            4524
        //  3986: goto            3993
        //  3989: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  3992: athrow         
        //  3993: aload           5
        //  3995: goto            4002
        //  3998: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4001: athrow         
        //  4002: checkcast       Lnet/minecraft/class_476;
        //  4005: astore          4
        //  4007: aload           4
        //  4009: invokevirtual   net/minecraft/class_476.method_17577:()Lnet/minecraft/class_1703;
        //  4012: astore          5
        //  4014: aload_0        
        //  4015: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_1:I
        //  4018: aload_1        
        //  4019: ifnull          4078
        //  4022: bipush          36
        //  4024: if_icmplt       4065
        //  4027: goto            4034
        //  4030: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4033: athrow         
        //  4034: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  4037: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  4040: invokevirtual   net/minecraft/class_746.method_7346:()V
        //  4043: aload_0        
        //  4044: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.ORDERS_CONFIRM:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  4047: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  4050: aload_0        
        //  4051: lload_2        
        //  4052: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  4055: aload_0        
        //  4056: iconst_0       
        //  4057: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_1:I
        //  4060: return         
        //  4061: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4064: athrow         
        //  4065: aload_0        
        //  4066: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  4069: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  4072: checkcast       Ljava/lang/Boolean;
        //  4075: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  4078: ifeq            4091
        //  4081: ldc2_w          10
        //  4084: goto            4094
        //  4087: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4090: athrow         
        //  4091: ldc2_w          100
        //  4094: lstore          6
        //  4096: lload_2        
        //  4097: aload_0        
        //  4098: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_2:J
        //  4101: lsub           
        //  4102: lload           6
        //  4104: lcmp           
        //  4105: aload_1        
        //  4106: ifnull          4139
        //  4109: iflt            4524
        //  4112: goto            4119
        //  4115: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4118: athrow         
        //  4119: aload_0        
        //  4120: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  4123: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  4126: checkcast       Ljava/lang/Boolean;
        //  4129: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  4132: goto            4139
        //  4135: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4138: athrow         
        //  4139: aload_1        
        //  4140: ifnull          4154
        //  4143: ifeq            4157
        //  4146: goto            4153
        //  4149: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4152: athrow         
        //  4153: iconst_3       
        //  4154: goto            4158
        //  4157: iconst_1       
        //  4158: istore          8
        //  4160: iconst_0       
        //  4161: istore          9
        //  4163: iload           9
        //  4165: iload           8
        //  4167: if_icmpge       4519
        //  4170: aload_0        
        //  4171: aload_1        
        //  4172: ifnull          4520
        //  4175: aload_1        
        //  4176: ifnull          4520
        //  4179: goto            4186
        //  4182: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4185: athrow         
        //  4186: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_1:I
        //  4189: bipush          36
        //  4191: if_icmpge       4519
        //  4194: goto            4201
        //  4197: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4200: athrow         
        //  4201: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  4204: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  4207: invokevirtual   net/minecraft/class_746.method_31548:()Lnet/minecraft/class_1661;
        //  4210: aload_0        
        //  4211: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_1:I
        //  4214: invokevirtual   net/minecraft/class_1661.method_5438:(I)Lnet/minecraft/class_1799;
        //  4217: astore          10
        //  4219: aload_0        
        //  4220: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  4223: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  4226: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer.SHULKERS:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer;
        //  4229: aload_1        
        //  4230: ifnull          4291
        //  4233: if_acmpne       4263
        //  4236: aload_0        
        //  4237: aload           10
        //  4239: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.checkClass_1799_4:(Lnet/minecraft/class_1799;)Z
        //  4242: aload_1        
        //  4243: ifnull          4315
        //  4246: goto            4253
        //  4249: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4252: athrow         
        //  4253: ifne            4314
        //  4256: goto            4263
        //  4259: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4262: athrow         
        //  4263: aload_0        
        //  4264: aload_1        
        //  4265: ifnull          4295
        //  4268: goto            4275
        //  4271: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4274: athrow         
        //  4275: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  4278: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  4281: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer.SHULKER_SHELLS:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer;
        //  4284: goto            4291
        //  4287: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4290: athrow         
        //  4291: if_acmpne       4318
        //  4294: aload_0        
        //  4295: aload           10
        //  4297: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.checkClass_1799_3:(Lnet/minecraft/class_1799;)Z
        //  4300: aload_1        
        //  4301: ifnull          4315
        //  4304: ifeq            4318
        //  4307: goto            4314
        //  4310: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4313: athrow         
        //  4314: iconst_1       
        //  4315: goto            4319
        //  4318: iconst_0       
        //  4319: istore          11
        //  4321: aload_1        
        //  4322: ifnull          4515
        //  4325: iload           11
        //  4327: ifeq            4502
        //  4330: goto            4337
        //  4333: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4336: athrow         
        //  4337: iconst_m1      
        //  4338: istore          12
        //  4340: aload           5
        //  4342: getfield        net/minecraft/class_1703.field_7761:Lnet/minecraft/class_2371;
        //  4345: invokevirtual   net/minecraft/class_2371.iterator:()Ljava/util/Iterator;
        //  4348: astore          13
        //  4350: aload           13
        //  4352: invokeinterface java/util/Iterator.hasNext:()Z
        //  4357: ifeq            4463
        //  4360: aload           13
        //  4362: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  4367: checkcast       Lnet/minecraft/class_1735;
        //  4370: astore          14
        //  4372: aload           14
        //  4374: aload_1        
        //  4375: ifnull          4413
        //  4378: getfield        net/minecraft/class_1735.field_7871:Lnet/minecraft/class_1263;
        //  4381: aload_1        
        //  4382: ifnull          4226
        //  4385: goto            4392
        //  4388: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4391: athrow         
        //  4392: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  4395: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  4398: invokevirtual   net/minecraft/class_746.method_31548:()Lnet/minecraft/class_1661;
        //  4401: if_acmpne       4452
        //  4404: aload           14
        //  4406: goto            4413
        //  4409: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4412: athrow         
        //  4413: invokevirtual   net/minecraft/class_1735.method_34266:()I
        //  4416: aload_1        
        //  4417: ifnull          4446
        //  4420: aload_0        
        //  4421: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_1:I
        //  4424: if_icmpne       4452
        //  4427: goto            4434
        //  4430: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4433: athrow         
        //  4434: aload           14
        //  4436: getfield        net/minecraft/class_1735.field_7874:I
        //  4439: goto            4446
        //  4442: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4445: athrow         
        //  4446: istore          12
        //  4448: aload_1        
        //  4449: ifnonnull       4463
        //  4452: aload_1        
        //  4453: ifnonnull       4350
        //  4456: goto            4463
        //  4459: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4462: athrow         
        //  4463: iload           12
        //  4465: iconst_m1      
        //  4466: if_icmpeq       4502
        //  4469: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  4472: getfield        net/minecraft/class_310.field_1761:Lnet/minecraft/class_636;
        //  4475: aload           5
        //  4477: getfield        net/minecraft/class_1703.field_7763:I
        //  4480: iload           12
        //  4482: iconst_0       
        //  4483: getstatic       net/minecraft/class_1713.field_7794:Lnet/minecraft/class_1713;
        //  4486: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  4489: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  4492: invokevirtual   net/minecraft/class_636.method_2906:(IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
        //  4495: goto            4502
        //  4498: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4501: athrow         
        //  4502: aload_0        
        //  4503: dup            
        //  4504: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_1:I
        //  4507: iconst_1       
        //  4508: iadd           
        //  4509: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_1:I
        //  4512: iinc            9, 1
        //  4515: aload_1        
        //  4516: ifnonnull       4163
        //  4519: aload_0        
        //  4520: lload_2        
        //  4521: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_2:J
        //  4524: aload_1        
        //  4525: ifnonnull       5502
        //  4528: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  4531: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //  4534: ifnonnull       5502
        //  4537: goto            4544
        //  4540: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4543: athrow         
        //  4544: aload_0        
        //  4545: dup            
        //  4546: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_2:I
        //  4549: iconst_1       
        //  4550: iadd           
        //  4551: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_2:I
        //  4554: aload_0        
        //  4555: aload_1        
        //  4556: ifnull          4625
        //  4559: goto            4566
        //  4562: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4565: athrow         
        //  4566: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_2:I
        //  4569: iconst_2       
        //  4570: if_icmpge       4605
        //  4573: goto            4580
        //  4576: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4579: athrow         
        //  4580: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  4583: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  4586: invokevirtual   net/minecraft/class_746.method_7346:()V
        //  4589: aload_0        
        //  4590: lload_2        
        //  4591: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  4594: aload_1        
        //  4595: ifnonnull       5502
        //  4598: goto            4605
        //  4601: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4604: athrow         
        //  4605: aload_0        
        //  4606: iconst_0       
        //  4607: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_2:I
        //  4610: aload_0        
        //  4611: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.ORDERS_CONFIRM:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  4614: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  4617: aload_0        
        //  4618: goto            4625
        //  4621: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4624: athrow         
        //  4625: lload_2        
        //  4626: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  4629: aload_1        
        //  4630: ifnonnull       5502
        //  4633: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  4636: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //  4639: astore          5
        //  4641: aload           5
        //  4643: aload_1        
        //  4644: ifnull          4669
        //  4647: instanceof      Lnet/minecraft/class_476;
        //  4650: ifeq            5103
        //  4653: goto            4660
        //  4656: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4659: athrow         
        //  4660: aload           5
        //  4662: goto            4669
        //  4665: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4668: athrow         
        //  4669: checkcast       Lnet/minecraft/class_476;
        //  4672: astore          4
        //  4674: aload           4
        //  4676: invokevirtual   net/minecraft/class_476.method_17577:()Lnet/minecraft/class_1703;
        //  4679: astore          5
        //  4681: aload           5
        //  4683: getfield        net/minecraft/class_1703.field_7761:Lnet/minecraft/class_2371;
        //  4686: invokevirtual   net/minecraft/class_2371.iterator:()Ljava/util/Iterator;
        //  4689: astore          6
        //  4691: aload           6
        //  4693: invokeinterface java/util/Iterator.hasNext:()Z
        //  4698: ifeq            4979
        //  4701: aload           6
        //  4703: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  4708: checkcast       Lnet/minecraft/class_1735;
        //  4711: astore          7
        //  4713: aload           7
        //  4715: invokevirtual   net/minecraft/class_1735.method_7677:()Lnet/minecraft/class_1799;
        //  4718: astore          8
        //  4720: aload           8
        //  4722: invokevirtual   net/minecraft/class_1799.method_7960:()Z
        //  4725: aload_1        
        //  4726: ifnull          5023
        //  4729: aload_1        
        //  4730: ifnull          4763
        //  4733: goto            4740
        //  4736: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4739: athrow         
        //  4740: ifne            4975
        //  4743: goto            4750
        //  4746: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4749: athrow         
        //  4750: aload_0        
        //  4751: aload           8
        //  4753: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.checkClass_1799_1:(Lnet/minecraft/class_1799;)Z
        //  4756: goto            4763
        //  4759: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4762: athrow         
        //  4763: aload_1        
        //  4764: ifnull          4778
        //  4767: ifeq            4975
        //  4770: goto            4777
        //  4773: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4776: athrow         
        //  4777: iconst_0       
        //  4778: istore          9
        //  4780: iload           9
        //  4782: aload_0        
        //  4783: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  4786: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  4789: checkcast       Ljava/lang/Boolean;
        //  4792: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  4795: ifeq            4811
        //  4798: bipush          15
        //  4800: aload_1        
        //  4801: ifnull          4812
        //  4804: goto            4812
        //  4807: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4810: athrow         
        //  4811: iconst_5       
        //  4812: if_icmpge       4858
        //  4815: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  4818: getfield        net/minecraft/class_310.field_1761:Lnet/minecraft/class_636;
        //  4821: aload           5
        //  4823: getfield        net/minecraft/class_1703.field_7763:I
        //  4826: aload           7
        //  4828: getfield        net/minecraft/class_1735.field_7874:I
        //  4831: iconst_0       
        //  4832: getstatic       net/minecraft/class_1713.field_7790:Lnet/minecraft/class_1713;
        //  4835: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  4838: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  4841: invokevirtual   net/minecraft/class_636.method_2906:(IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
        //  4844: iinc            9, 1
        //  4847: aload_1        
        //  4848: ifnonnull       4780
        //  4851: goto            4858
        //  4854: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4857: athrow         
        //  4858: aload_0        
        //  4859: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.ORDERS_FINAL_EXIT:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  4862: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  4865: aload_0        
        //  4866: lload_2        
        //  4867: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  4870: aload_0        
        //  4871: iconst_0       
        //  4872: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_3:I
        //  4875: aload_0        
        //  4876: lload_2        
        //  4877: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_3:J
        //  4880: aload_0        
        //  4881: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  4884: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  4887: checkcast       Ljava/lang/Boolean;
        //  4890: aload_1        
        //  4891: ifnull          4921
        //  4894: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  4897: ifeq            4974
        //  4900: goto            4907
        //  4903: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4906: athrow         
        //  4907: aload_0        
        //  4908: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  4911: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  4914: goto            4921
        //  4917: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4920: athrow         
        //  4921: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4.ORDER_ONLY:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4;
        //  4924: if_acmpne       4943
        //  4927: sipush          -26046
        //  4930: sipush          -19203
        //  4933: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //  4936: goto            4952
        //  4939: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  4942: athrow         
        //  4943: sipush          -26025
        //  4946: sipush          -10094
        //  4949: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //  4952: astore          9
        //  4954: aload           9
        //  4956: sipush          -26029
        //  4959: sipush          8401
        //  4962: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //  4965: swap           
        //  4966: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  4971: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_5.setString:(Ljava/lang/String;)V
        //  4974: return         
        //  4975: aload_1        
        //  4976: ifnonnull       4691
        //  4979: lload_2        
        //  4980: aload_0        
        //  4981: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  4984: lsub           
        //  4985: aload_0        
        //  4986: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  4989: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  4992: checkcast       Ljava/lang/Boolean;
        //  4995: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  4998: aload_1        
        //  4999: ifnull          5015
        //  5002: ifeq            5018
        //  5005: goto            5012
        //  5008: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5011: athrow         
        //  5012: sipush          2000
        //  5015: goto            5021
        //  5018: sipush          5000
        //  5021: i2l            
        //  5022: lcmp           
        //  5023: ifle            5103
        //  5026: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  5029: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  5032: invokevirtual   net/minecraft/class_746.method_7346:()V
        //  5035: aload_0        
        //  5036: aload_1        
        //  5037: ifnull          5092
        //  5040: goto            5047
        //  5043: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5046: athrow         
        //  5047: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  5050: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  5053: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4.ORDER_ONLY:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4;
        //  5056: if_acmpne       5084
        //  5059: goto            5066
        //  5062: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5065: athrow         
        //  5066: aload_0        
        //  5067: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.CYCLE_PAUSE:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  5070: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  5073: aload_1        
        //  5074: ifnonnull       5098
        //  5077: goto            5084
        //  5080: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5083: athrow         
        //  5084: aload_0        
        //  5085: goto            5092
        //  5088: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5091: athrow         
        //  5092: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  5095: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  5098: aload_0        
        //  5099: lload_2        
        //  5100: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  5103: aload_1        
        //  5104: ifnonnull       5502
        //  5107: aload_0        
        //  5108: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  5111: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  5114: checkcast       Ljava/lang/Boolean;
        //  5117: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  5120: ifeq            5140
        //  5123: goto            5130
        //  5126: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5129: athrow         
        //  5130: ldc2_w          50
        //  5133: goto            5143
        //  5136: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5139: athrow         
        //  5140: ldc2_w          200
        //  5143: lstore          4
        //  5145: aload_0        
        //  5146: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_3:I
        //  5149: aload_1        
        //  5150: ifnull          5243
        //  5153: ifne            5221
        //  5156: goto            5163
        //  5159: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5162: athrow         
        //  5163: invokestatic    java/lang/System.currentTimeMillis:()J
        //  5166: aload_0        
        //  5167: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_3:J
        //  5170: lsub           
        //  5171: lload           4
        //  5173: lcmp           
        //  5174: iflt            5331
        //  5177: goto            5184
        //  5180: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5183: athrow         
        //  5184: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  5187: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  5190: invokevirtual   net/minecraft/class_746.method_7346:()V
        //  5193: aload_0        
        //  5194: dup            
        //  5195: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_3:I
        //  5198: iconst_1       
        //  5199: iadd           
        //  5200: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_3:I
        //  5203: aload_0        
        //  5204: invokestatic    java/lang/System.currentTimeMillis:()J
        //  5207: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_3:J
        //  5210: aload_1        
        //  5211: ifnonnull       5331
        //  5214: goto            5221
        //  5217: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5220: athrow         
        //  5221: aload_0        
        //  5222: aload_1        
        //  5223: ifnull          5325
        //  5226: goto            5233
        //  5229: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5232: athrow         
        //  5233: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_3:I
        //  5236: goto            5243
        //  5239: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5242: athrow         
        //  5243: iconst_1       
        //  5244: if_icmpne       5305
        //  5247: invokestatic    java/lang/System.currentTimeMillis:()J
        //  5250: aload_0        
        //  5251: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_3:J
        //  5254: lsub           
        //  5255: lload           4
        //  5257: lcmp           
        //  5258: iflt            5331
        //  5261: goto            5268
        //  5264: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5267: athrow         
        //  5268: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //  5271: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //  5274: invokevirtual   net/minecraft/class_746.method_7346:()V
        //  5277: aload_0        
        //  5278: dup            
        //  5279: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_3:I
        //  5282: iconst_1       
        //  5283: iadd           
        //  5284: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_3:I
        //  5287: aload_0        
        //  5288: invokestatic    java/lang/System.currentTimeMillis:()J
        //  5291: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_3:J
        //  5294: aload_1        
        //  5295: ifnonnull       5331
        //  5298: goto            5305
        //  5301: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5304: athrow         
        //  5305: aload_0        
        //  5306: iconst_0       
        //  5307: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.intValue_3:I
        //  5310: aload_0        
        //  5311: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.CYCLE_PAUSE:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  5314: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  5317: aload_0        
        //  5318: goto            5325
        //  5321: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5324: athrow         
        //  5325: invokestatic    java/lang/System.currentTimeMillis:()J
        //  5328: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  5331: aload_1        
        //  5332: ifnonnull       5502
        //  5335: aload_0        
        //  5336: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //  5339: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //  5342: checkcast       Ljava/lang/Boolean;
        //  5345: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  5348: ifeq            5368
        //  5351: goto            5358
        //  5354: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5357: athrow         
        //  5358: ldc2_w          10
        //  5361: goto            5371
        //  5364: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5367: athrow         
        //  5368: ldc2_w          25
        //  5371: lstore          4
        //  5373: aload_1        
        //  5374: ifnull          5407
        //  5377: lload_2        
        //  5378: aload_0        
        //  5379: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  5382: lsub           
        //  5383: lload           4
        //  5385: lcmp           
        //  5386: iflt            5499
        //  5389: goto            5396
        //  5392: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5395: athrow         
        //  5396: aload_0        
        //  5397: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.execute_2:()V
        //  5400: goto            5407
        //  5403: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5406: athrow         
        //  5407: aload_0        
        //  5408: aload_1        
        //  5409: ifnull          5470
        //  5412: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  5415: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  5418: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4.ORDER_ONLY:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4;
        //  5421: if_acmpeq       5462
        //  5424: goto            5431
        //  5427: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5430: athrow         
        //  5431: aload_0        
        //  5432: aload_1        
        //  5433: ifnull          5488
        //  5436: goto            5443
        //  5439: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5442: athrow         
        //  5443: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.wrapJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //  5446: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.getValue:()Ljava/lang/Object;
        //  5449: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4.SELL_ONLY:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_4;
        //  5452: if_acmpne       5480
        //  5455: goto            5462
        //  5458: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5461: athrow         
        //  5462: aload_0        
        //  5463: goto            5470
        //  5466: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5469: athrow         
        //  5470: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.WAIT:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  5473: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  5476: aload_1        
        //  5477: ifnonnull       5494
        //  5480: aload_0        
        //  5481: goto            5488
        //  5484: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //  5487: athrow         
        //  5488: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7.SHOP:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  5491: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.coreH:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_7;
        //  5494: aload_0        
        //  5495: lload_2        
        //  5496: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.longValue_1:J
        //  5499: goto            5502
        //  5502: return         
        //    StackMapTable: 02 4C FF 00 14 00 02 07 00 02 07 00 F0 00 01 07 00 90 03 45 07 00 90 43 07 00 EB 05 40 07 00 90 03 FF 00 62 00 03 07 00 02 07 00 F0 04 00 01 07 00 90 03 72 07 00 90 43 07 00 02 4E 07 00 90 43 01 43 07 00 02 18 47 07 00 90 43 07 00 02 4E 07 00 90 03 47 07 00 90 43 07 00 02 4E 07 00 90 03 4A 07 00 90 43 07 00 02 04 5C 07 00 02 07 FF 00 16 00 05 07 00 02 07 00 F0 04 00 07 01 11 00 01 07 00 90 03 44 07 00 90 43 07 01 11 FF 00 15 00 06 07 00 02 07 00 F0 04 07 01 0F 07 01 17 07 01 23 00 00 FF 00 2C 00 08 07 00 02 07 00 F0 04 07 01 0F 07 01 17 07 01 23 07 01 2B 07 01 31 00 01 07 00 90 43 01 45 07 00 90 03 47 07 00 90 43 07 00 02 47 07 00 90 43 01 6F 07 00 90 43 07 00 02 04 F9 00 03 5C 07 00 90 43 04 FF 00 02 00 06 07 00 02 07 00 F0 04 07 01 0F 07 01 17 07 01 23 00 02 04 01 42 04 FF 00 02 00 06 07 00 02 07 00 F0 04 07 01 0F 07 01 17 07 01 23 00 02 04 01 41 01 5A 07 00 90 FF 00 03 00 05 07 00 02 07 00 F0 04 00 07 00 C3 00 00 F9 00 03 FF 00 16 00 05 07 00 02 07 00 F0 04 00 07 01 11 00 01 07 00 90 03 44 07 00 90 43 07 01 11 FF 00 18 00 07 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 00 00 FF 00 31 00 09 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 00 01 07 00 90 FF 00 03 00 09 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 00 02 07 00 C3 07 00 0B 45 07 00 90 03 4C 07 00 90 43 01 45 07 00 90 03 47 07 00 90 43 07 00 02 4B 07 00 90 FF 00 03 00 09 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 00 02 07 00 C3 07 00 0B 43 07 00 02 4E 07 00 90 03 40 01 02 40 01 FF 00 10 00 0A 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 00 01 07 00 90 03 41 01 4A 07 00 90 43 07 00 02 4E 07 00 90 03 53 07 00 90 43 01 45 07 00 90 03 41 01 02 40 01 FD 00 04 01 01 71 07 00 90 03 06 F9 00 03 60 07 00 90 43 07 00 02 05 10 46 07 00 90 F8 00 03 4A 07 00 90 03 5C 07 00 90 43 04 FF 00 02 00 07 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 00 02 04 01 42 04 FF 00 02 00 07 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 00 02 04 01 58 07 00 90 43 07 00 02 FF 00 03 00 05 07 00 02 07 00 F0 04 00 07 00 C3 00 00 F9 00 03 FF 00 16 00 05 07 00 02 07 00 F0 04 00 07 01 11 00 01 07 00 90 03 44 07 00 90 43 07 01 11 FF 00 15 00 06 07 00 02 07 00 F0 04 07 01 0F 07 01 17 07 01 23 00 00 FF 00 2C 00 08 07 00 02 07 00 F0 04 07 01 0F 07 01 17 07 01 23 07 01 2B 07 01 31 00 01 07 00 90 43 01 45 07 00 90 03 48 07 00 90 43 01 49 07 00 90 03 47 07 00 90 43 01 6E 07 00 90 03 F9 00 03 5C 07 00 90 43 04 FF 00 02 00 06 07 00 02 07 00 F0 04 07 01 0F 07 01 17 07 01 23 00 02 04 01 42 04 FF 00 02 00 06 07 00 02 07 00 F0 04 07 01 0F 07 01 17 07 01 23 00 02 04 01 41 01 5A 07 00 90 FF 00 03 00 05 07 00 02 07 00 F0 04 00 07 00 C3 00 00 F9 00 03 52 07 00 90 03 45 07 00 90 03 42 04 FF 00 24 00 06 07 00 02 07 00 F0 04 04 00 07 01 11 00 01 07 00 90 03 44 07 00 90 43 07 01 11 FF 00 15 00 07 07 00 02 07 00 F0 04 04 07 01 0F 07 01 17 07 01 23 00 00 FF 00 2C 00 09 07 00 02 07 00 F0 04 04 07 01 0F 07 01 17 07 01 23 07 01 2B 07 01 31 00 01 07 00 90 43 01 45 07 00 90 03 48 07 00 90 43 01 49 07 00 90 03 47 07 00 90 43 01 4A 07 00 90 03 4F 07 00 90 43 01 49 07 00 90 03 41 01 02 41 01 FD 00 04 01 01 6F 07 00 90 43 07 00 02 48 07 00 90 03 42 07 00 90 03 02 03 47 07 00 02 F9 00 04 F9 00 03 5C 07 00 90 43 04 FF 00 02 00 07 07 00 02 07 00 F0 04 04 07 01 0F 07 01 17 07 01 23 00 02 04 01 42 04 FF 00 02 00 07 07 00 02 07 00 F0 04 04 07 01 0F 07 01 17 07 01 23 00 02 04 01 41 01 51 07 00 90 F8 00 03 FA 00 03 FF 00 16 00 05 07 00 02 07 00 F0 04 00 07 01 11 00 01 07 00 90 03 44 07 00 90 43 07 01 11 FF 00 18 00 07 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 00 00 FF 00 2C 00 09 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 00 01 07 00 90 43 01 45 07 00 90 03 48 07 00 90 43 01 49 07 00 90 03 40 01 FC 00 01 01 59 07 00 90 43 01 FF 00 00 00 0A 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 00 02 01 01 69 07 00 90 03 FA 00 06 46 07 00 90 F9 00 03 41 01 4F 07 00 90 03 5C 07 00 90 43 04 FF 00 02 00 07 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 00 02 04 01 42 04 FF 00 02 00 07 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 00 02 04 01 53 07 00 90 FF 00 03 00 05 07 00 02 07 00 F0 04 00 07 00 C3 00 00 F9 00 03 59 07 00 90 FF 00 03 00 03 07 00 02 07 00 F0 04 00 02 04 01 45 07 00 90 43 04 FF 00 01 00 03 07 00 02 07 00 F0 04 00 02 04 01 42 04 FF 00 02 00 03 07 00 02 07 00 F0 04 00 02 04 01 4B 07 00 90 03 47 07 00 90 43 07 00 02 45 07 00 90 43 01 4A 07 00 90 43 07 00 02 4E 07 00 90 03 53 07 00 90 43 07 00 02 07 59 07 00 90 FF 00 03 00 03 07 00 02 07 00 F0 04 00 02 04 01 45 07 00 90 43 04 FF 00 02 00 03 07 00 02 07 00 F0 04 00 02 04 01 42 04 FF 00 02 00 03 07 00 02 07 00 F0 04 00 02 04 01 57 07 00 90 03 4C 07 00 90 43 07 01 11 45 07 00 90 03 47 07 00 90 43 07 00 02 48 07 00 90 43 07 00 C3 4D 07 00 90 43 07 00 02 51 07 00 90 03 5E 07 00 90 03 40 07 00 02 09 43 07 00 90 43 07 00 02 05 04 5C 07 00 90 43 04 FF 00 02 00 03 07 00 02 07 00 F0 04 00 02 04 01 42 04 FF 00 02 00 03 07 00 02 07 00 F0 04 00 02 04 01 60 07 00 90 03 4D 07 00 90 43 07 00 C3 48 07 00 90 03 4C 07 00 90 03 46 07 00 C3 4E 07 00 90 03 42 04 FF 00 14 00 04 07 00 02 07 00 F0 04 04 00 01 07 00 90 03 47 07 00 90 43 07 00 02 45 07 00 90 43 01 4D 07 00 90 43 07 00 96 48 07 00 90 03 4D 07 00 90 03 49 07 00 90 43 07 00 C3 51 07 00 90 03 48 07 00 96 16 04 FA 00 03 FF 00 16 00 05 07 00 02 07 00 F0 04 00 07 01 11 00 01 07 00 90 03 44 07 00 90 43 07 01 11 FF 00 25 00 06 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 00 01 07 00 90 03 4C 07 00 90 43 01 03 FC 00 09 07 01 23 FF 00 31 00 09 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 00 01 07 00 90 FF 00 03 00 09 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 00 02 07 00 C3 07 00 0B 45 07 00 90 03 47 07 00 90 43 07 00 02 4A 07 00 90 03 4C 07 00 90 43 01 45 07 00 90 03 47 07 00 90 43 07 00 02 48 07 00 90 43 07 00 C3 FF 00 02 00 09 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 00 02 07 00 C3 07 00 0B 43 07 00 02 4E 07 00 90 03 40 01 02 40 01 FF 00 10 00 0A 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 00 01 07 00 90 03 41 01 49 07 00 90 03 40 01 FF 00 25 00 0D 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 01 07 00 96 03 00 01 07 00 90 03 4C 07 00 90 43 01 45 07 00 90 03 46 07 00 90 03 40 07 00 02 42 01 4B 07 00 90 43 07 00 96 45 07 00 90 03 41 07 00 96 50 07 00 90 03 40 01 02 40 01 FF 00 0D 00 0E 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 01 07 00 96 03 01 00 01 07 00 90 03 59 07 00 90 03 57 07 00 90 FF 00 03 00 0E 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 01 07 00 96 03 01 00 05 07 00 96 07 01 B7 07 01 B7 01 07 00 96 4C 07 00 90 FF 00 03 00 0E 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 01 07 00 96 03 01 00 04 07 00 96 07 01 B7 07 01 B7 01 48 07 00 90 FF 00 03 00 0E 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 01 07 00 96 03 01 00 05 07 00 96 07 01 B7 07 01 B7 01 07 00 96 FF 00 02 00 0E 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 01 07 00 96 03 01 00 04 07 00 96 07 01 B7 07 01 B7 01 FF 00 08 00 0E 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 01 07 00 96 03 01 00 05 07 00 96 07 01 B7 07 01 B7 01 07 00 96 0A 4F 07 00 90 43 01 49 07 00 90 03 FF 00 1E 00 0F 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 01 07 00 96 03 01 03 00 01 07 00 90 03 59 07 00 90 03 5A 07 00 90 FA 00 03 41 01 7C 07 00 90 FF 00 03 00 0E 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 01 07 00 96 03 01 00 03 07 00 02 04 01 45 07 00 90 FF 00 03 00 0E 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 01 07 00 96 03 01 00 02 07 00 02 04 FF 00 01 00 0E 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 01 07 00 96 03 01 00 03 07 00 02 04 01 FF 00 02 00 0E 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 01 07 00 96 03 01 00 02 07 00 02 04 FF 00 01 00 0E 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 01 07 00 96 03 01 00 03 07 00 02 04 01 70 07 00 90 03 FF 00 00 00 0A 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 07 01 2B 07 01 31 01 00 00 F8 00 03 5E 07 00 90 FF 00 03 00 07 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 00 02 04 01 45 07 00 90 43 04 FF 00 02 00 07 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 00 02 04 01 42 04 FF 00 02 00 07 07 00 02 07 00 F0 04 07 01 0F 07 01 17 01 07 01 23 00 02 04 01 55 07 00 90 43 07 00 02 48 07 00 90 43 07 00 C3 53 07 00 90 03 43 07 00 90 43 07 00 02 05 FF 00 04 00 05 07 00 02 07 00 F0 04 00 07 00 C3 00 00 F9 00 03 FF 00 16 00 05 07 00 02 07 00 F0 04 00 07 01 11 00 01 07 00 90 03 44 07 00 90 43 07 01 11 FF 00 1B 00 05 07 00 02 07 00 F0 04 07 01 0F 07 01 17 00 01 07 00 90 03 5A 07 00 90 03 4C 01 48 07 00 90 03 42 04 FF 00 14 00 06 07 00 02 07 00 F0 04 07 01 0F 07 01 17 04 00 01 07 00 90 03 4F 07 00 90 43 01 49 07 00 90 03 40 01 02 40 01 FD 00 04 01 01 52 07 00 90 43 07 00 02 4A 07 00 90 03 FF 00 18 00 09 07 00 02 07 00 F0 04 07 01 0F 07 01 17 04 01 01 07 01 31 00 01 07 00 C3 56 07 00 90 43 01 45 07 00 90 03 47 07 00 90 43 07 00 02 4B 07 00 90 FF 00 03 00 09 07 00 02 07 00 F0 04 07 01 0F 07 01 17 04 01 01 07 01 31 00 02 07 00 C3 07 00 0B 43 07 00 02 4E 07 00 90 03 40 01 02 40 01 FF 00 0D 00 0A 07 00 02 07 00 F0 04 07 01 0F 07 01 17 04 01 01 07 01 31 01 00 01 07 00 90 03 FD 00 0C 01 07 01 23 FF 00 25 00 0D 07 00 02 07 00 F0 04 07 01 0F 07 01 17 04 01 01 07 01 31 01 01 07 01 23 07 01 2B 00 01 07 00 90 43 07 01 D5 50 07 00 90 43 07 01 2B 50 07 00 90 03 47 07 00 90 43 01 05 46 07 00 90 FA 00 03 62 07 00 90 F9 00 03 0C F9 00 03 40 07 00 02 FF 00 03 00 05 07 00 02 07 00 F0 04 00 07 00 C3 00 00 F9 00 03 4B 07 00 90 03 51 07 00 90 43 07 00 02 49 07 00 90 03 54 07 00 90 03 4F 07 00 90 43 07 00 02 07 FF 00 16 00 05 07 00 02 07 00 F0 04 00 07 01 11 00 01 07 00 90 03 44 07 00 90 43 07 01 11 FF 00 15 00 06 07 00 02 07 00 F0 04 07 01 0F 07 01 17 07 01 23 00 00 FF 00 2C 00 08 07 00 02 07 00 F0 04 07 01 0F 07 01 17 07 01 23 07 01 2B 07 01 31 00 01 07 00 90 43 01 45 07 00 90 03 48 07 00 90 43 01 49 07 00 90 03 40 01 FC 00 01 01 5A 07 00 90 43 01 FF 00 00 00 09 07 00 02 07 00 F0 04 07 01 0F 07 01 17 07 01 23 07 01 2B 07 01 31 01 00 02 01 01 69 07 00 90 03 6C 07 00 90 03 49 07 00 90 43 07 00 C3 51 07 00 90 03 48 07 00 96 FA 00 15 00 F9 00 03 5C 07 00 90 43 04 FF 00 02 00 06 07 00 02 07 00 F0 04 07 01 0F 07 01 17 07 01 23 00 02 04 01 42 04 FF 00 02 00 06 07 00 02 07 00 F0 04 07 01 0F 07 01 17 07 01 23 00 02 04 01 41 01 53 07 00 90 43 07 00 02 4E 07 00 90 03 4D 07 00 90 03 43 07 00 90 43 07 00 02 05 FF 00 04 00 05 07 00 02 07 00 F0 04 00 07 00 C3 00 00 F9 00 03 52 07 00 90 03 45 07 00 90 03 42 04 FF 00 0F 00 04 07 00 02 07 00 F0 04 04 00 01 07 00 90 03 50 07 00 90 03 60 07 00 90 03 47 07 00 90 43 07 00 02 45 07 00 90 43 01 54 07 00 90 03 60 07 00 90 03 4F 07 00 90 43 07 00 02 05 FA 00 03 52 07 00 90 03 45 07 00 90 03 42 04 FF 00 14 00 04 07 00 02 07 00 F0 04 04 00 01 07 00 90 03 46 07 00 90 03 53 07 00 90 03 47 07 00 90 43 07 00 02 4E 07 00 90 03 43 07 00 90 43 07 00 02 09 43 07 00 90 43 07 00 02 05 04 FA 00 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      17     20     24     Ljava/lang/NumberFormatException;
        //  11     27     30     34     Ljava/lang/NumberFormatException;
        //  34     41     41     45     Ljava/lang/NumberFormatException;
        //  49     144    144    148    Ljava/lang/NumberFormatException;
        //  60     196    199    203    Ljava/lang/NumberFormatException;
        //  148    215    218    222    Ljava/lang/NumberFormatException;
        //  226    256    259    263    Ljava/lang/NumberFormatException;
        //  251    275    278    282    Ljava/lang/NumberFormatException;
        //  263    287    290    294    Ljava/lang/NumberFormatException;
        //  282    306    309    313    Ljava/lang/NumberFormatException;
        //  294    321    324    328    Ljava/lang/NumberFormatException;
        //  378    390    393    397    Ljava/lang/NumberFormatException;
        //  384    399    402    406    Ljava/lang/NumberFormatException;
        //  457    470    473    477    Ljava/lang/NumberFormatException;
        //  466    480    483    487    Ljava/lang/NumberFormatException;
        //  477    492    495    499    Ljava/lang/NumberFormatException;
        //  487    504    507    511    Ljava/lang/NumberFormatException;
        //  511    556    559    563    Ljava/lang/NumberFormatException;
        //  572    598    601    605    Ljava/lang/NumberFormatException;
        //  616    640    643    647    Ljava/lang/NumberFormatException;
        //  659    671    674    678    Ljava/lang/NumberFormatException;
        //  665    680    683    687    Ljava/lang/NumberFormatException;
        //  741    759    762    766    Ljava/lang/NumberFormatException;
        //  746    769    772    776    Ljava/lang/NumberFormatException;
        //  766    786    789    793    Ljava/lang/NumberFormatException;
        //  776    796    799    803    Ljava/lang/NumberFormatException;
        //  793    808    811    815    Ljava/lang/NumberFormatException;
        //  803    824    827    831    Ljava/lang/NumberFormatException;
        //  835    847    850    854    Ljava/lang/NumberFormatException;
        //  861    873    876    880    Ljava/lang/NumberFormatException;
        //  882    890    893    897    Ljava/lang/NumberFormatException;
        //  885    909    912    916    Ljava/lang/NumberFormatException;
        //  897    933    936    940    Ljava/lang/NumberFormatException;
        //  916    943    946    950    Ljava/lang/NumberFormatException;
        //  968    1008   1011   1015   Ljava/lang/NumberFormatException;
        //  1022   1056   1059   1063   Ljava/lang/NumberFormatException;
        //  1072   1090   1093   1097   Ljava/lang/NumberFormatException;
        //  1097   1108   1108   1112   Ljava/lang/NumberFormatException;
        //  1112   1138   1141   1145   Ljava/lang/NumberFormatException;
        //  1154   1176   1179   1183   Ljava/lang/NumberFormatException;
        //  1199   1211   1214   1218   Ljava/lang/NumberFormatException;
        //  1205   1220   1223   1227   Ljava/lang/NumberFormatException;
        //  1278   1291   1294   1298   Ljava/lang/NumberFormatException;
        //  1287   1301   1304   1308   Ljava/lang/NumberFormatException;
        //  1298   1314   1317   1321   Ljava/lang/NumberFormatException;
        //  1321   1328   1331   1335   Ljava/lang/NumberFormatException;
        //  1325   1340   1343   1347   Ljava/lang/NumberFormatException;
        //  1347   1394   1394   1398   Ljava/lang/NumberFormatException;
        //  1402   1428   1431   1435   Ljava/lang/NumberFormatException;
        //  1446   1470   1473   1477   Ljava/lang/NumberFormatException;
        //  1477   1497   1500   1504   Ljava/lang/NumberFormatException;
        //  1481   1510   1510   1514   Ljava/lang/NumberFormatException;
        //  1539   1551   1554   1558   Ljava/lang/NumberFormatException;
        //  1545   1560   1563   1567   Ljava/lang/NumberFormatException;
        //  1618   1631   1634   1638   Ljava/lang/NumberFormatException;
        //  1627   1641   1644   1648   Ljava/lang/NumberFormatException;
        //  1638   1654   1657   1661   Ljava/lang/NumberFormatException;
        //  1661   1668   1671   1675   Ljava/lang/NumberFormatException;
        //  1665   1680   1683   1687   Ljava/lang/NumberFormatException;
        //  1687   1695   1698   1702   Ljava/lang/NumberFormatException;
        //  1691   1715   1718   1722   Ljava/lang/NumberFormatException;
        //  1722   1729   1732   1736   Ljava/lang/NumberFormatException;
        //  1755   1793   1796   1800   Ljava/lang/NumberFormatException;
        //  1788   1806   1809   1813   Ljava/lang/NumberFormatException;
        //  1800   1816   1816   1820   Ljava/lang/NumberFormatException;
        //  1844   1870   1873   1877   Ljava/lang/NumberFormatException;
        //  1888   1903   1906   1910   Ljava/lang/NumberFormatException;
        //  1922   1934   1937   1941   Ljava/lang/NumberFormatException;
        //  1928   1943   1946   1950   Ljava/lang/NumberFormatException;
        //  2004   2017   2020   2024   Ljava/lang/NumberFormatException;
        //  2013   2027   2030   2034   Ljava/lang/NumberFormatException;
        //  2024   2040   2043   2047   Ljava/lang/NumberFormatException;
        //  2047   2054   2057   2061   Ljava/lang/NumberFormatException;
        //  2082   2090   2090   2094   Ljava/lang/NumberFormatException;
        //  2095   2134   2137   2141   Ljava/lang/NumberFormatException;
        //  2144   2152   2155   2159   Ljava/lang/NumberFormatException;
        //  2161   2177   2177   2181   Ljava/lang/NumberFormatException;
        //  2181   2207   2210   2214   Ljava/lang/NumberFormatException;
        //  2223   2240   2243   2247   Ljava/lang/NumberFormatException;
        //  2247   2274   2277   2281   Ljava/lang/NumberFormatException;
        //  2251   2284   2287   2291   Ljava/lang/NumberFormatException;
        //  2299   2308   2311   2315   Ljava/lang/NumberFormatException;
        //  2305   2320   2323   2327   Ljava/lang/NumberFormatException;
        //  2315   2330   2333   2337   Ljava/lang/NumberFormatException;
        //  2337   2345   2348   2352   Ljava/lang/NumberFormatException;
        //  2340   2364   2367   2371   Ljava/lang/NumberFormatException;
        //  2352   2388   2391   2395   Ljava/lang/NumberFormatException;
        //  2395   2426   2429   2433   Ljava/lang/NumberFormatException;
        //  2403   2436   2439   2443   Ljava/lang/NumberFormatException;
        //  2452   2473   2476   2480   Ljava/lang/NumberFormatException;
        //  2457   2490   2493   2497   Ljava/lang/NumberFormatException;
        //  2480   2500   2503   2507   Ljava/lang/NumberFormatException;
        //  2497   2512   2515   2519   Ljava/lang/NumberFormatException;
        //  2507   2525   2528   2532   Ljava/lang/NumberFormatException;
        //  2532   2543   2546   2550   Ljava/lang/NumberFormatException;
        //  2538   2565   2568   2572   Ljava/lang/NumberFormatException;
        //  2550   2600   2603   2607   Ljava/lang/NumberFormatException;
        //  2608   2619   2622   2626   Ljava/lang/NumberFormatException;
        //  2637   2663   2666   2670   Ljava/lang/NumberFormatException;
        //  2679   2709   2712   2716   Ljava/lang/NumberFormatException;
        //  2684   2727   2730   2734   Ljava/lang/NumberFormatException;
        //  2716   2740   2743   2747   Ljava/lang/NumberFormatException;
        //  2734   2760   2760   2764   Ljava/lang/NumberFormatException;
        //  2771   2786   2786   2790   Ljava/lang/NumberFormatException;
        //  2795   2811   2814   2818   Ljava/lang/NumberFormatException;
        //  2808   2823   2826   2830   Ljava/lang/NumberFormatException;
        //  2818   2833   2836   2840   Ljava/lang/NumberFormatException;
        //  2840   2851   2854   2858   Ljava/lang/NumberFormatException;
        //  2843   2864   2867   2871   Ljava/lang/NumberFormatException;
        //  2858   2882   2885   2889   Ljava/lang/NumberFormatException;
        //  2871   2896   2899   2903   Ljava/lang/NumberFormatException;
        //  2903   2921   2921   2925   Ljava/lang/NumberFormatException;
        //  2974   2986   2989   2993   Ljava/lang/NumberFormatException;
        //  2980   2995   2998   3002   Ljava/lang/NumberFormatException;
        //  3017   3037   3040   3044   Ljava/lang/NumberFormatException;
        //  3034   3054   3057   3061   Ljava/lang/NumberFormatException;
        //  3104   3122   3125   3129   Ljava/lang/NumberFormatException;
        //  3115   3132   3135   3139   Ljava/lang/NumberFormatException;
        //  3129   3144   3147   3151   Ljava/lang/NumberFormatException;
        //  3139   3159   3162   3166   Ljava/lang/NumberFormatException;
        //  3151   3176   3179   3183   Ljava/lang/NumberFormatException;
        //  3166   3186   3189   3193   Ljava/lang/NumberFormatException;
        //  3183   3198   3201   3205   Ljava/lang/NumberFormatException;
        //  3193   3211   3214   3218   Ljava/lang/NumberFormatException;
        //  3225   3237   3240   3244   Ljava/lang/NumberFormatException;
        //  3251   3263   3266   3270   Ljava/lang/NumberFormatException;
        //  3272   3279   3282   3286   Ljava/lang/NumberFormatException;
        //  3305   3322   3325   3329   Ljava/lang/NumberFormatException;
        //  3310   3339   3342   3346   Ljava/lang/NumberFormatException;
        //  3329   3349   3352   3356   Ljava/lang/NumberFormatException;
        //  3346   3360   3363   3367   Ljava/lang/NumberFormatException;
        //  3371   3380   3383   3387   Ljava/lang/NumberFormatException;
        //  3374   3390   3393   3397   Ljava/lang/NumberFormatException;
        //  3399   3413   3416   3420   Ljava/lang/NumberFormatException;
        //  3427   3436   3439   3443   Ljava/lang/NumberFormatException;
        //  3446   3466   3469   3473   Ljava/lang/NumberFormatException;
        //  3463   3494   3497   3501   Ljava/lang/NumberFormatException;
        //  3473   3511   3514   3518   Ljava/lang/NumberFormatException;
        //  3501   3524   3527   3531   Ljava/lang/NumberFormatException;
        //  3543   3567   3570   3574   Ljava/lang/NumberFormatException;
        //  3574   3581   3584   3588   Ljava/lang/NumberFormatException;
        //  3604   3616   3619   3623   Ljava/lang/NumberFormatException;
        //  3626   3646   3649   3653   Ljava/lang/NumberFormatException;
        //  3643   3677   3680   3684   Ljava/lang/NumberFormatException;
        //  3686   3744   3747   3751   Ljava/lang/NumberFormatException;
        //  3689   3754   3757   3761   Ljava/lang/NumberFormatException;
        //  3786   3814   3817   3821   Ljava/lang/NumberFormatException;
        //  3826   3854   3857   3861   Ljava/lang/NumberFormatException;
        //  3831   3864   3867   3871   Ljava/lang/NumberFormatException;
        //  3880   3899   3902   3906   Ljava/lang/NumberFormatException;
        //  3885   3912   3915   3919   Ljava/lang/NumberFormatException;
        //  3919   3936   3939   3943   Ljava/lang/NumberFormatException;
        //  3925   3944   3947   3951   Ljava/lang/NumberFormatException;
        //  3974   3986   3989   3993   Ljava/lang/NumberFormatException;
        //  3980   3995   3998   4002   Ljava/lang/NumberFormatException;
        //  4014   4027   4030   4034   Ljava/lang/NumberFormatException;
        //  4022   4061   4061   4065   Ljava/lang/NumberFormatException;
        //  4078   4087   4087   4091   Ljava/lang/NumberFormatException;
        //  4096   4112   4115   4119   Ljava/lang/NumberFormatException;
        //  4109   4132   4135   4139   Ljava/lang/NumberFormatException;
        //  4139   4146   4149   4153   Ljava/lang/NumberFormatException;
        //  4170   4179   4182   4186   Ljava/lang/NumberFormatException;
        //  4175   4194   4197   4201   Ljava/lang/NumberFormatException;
        //  4233   4246   4249   4253   Ljava/lang/NumberFormatException;
        //  4236   4256   4259   4263   Ljava/lang/NumberFormatException;
        //  4253   4268   4271   4275   Ljava/lang/NumberFormatException;
        //  4263   4284   4287   4291   Ljava/lang/NumberFormatException;
        //  4295   4307   4310   4314   Ljava/lang/NumberFormatException;
        //  4321   4330   4333   4337   Ljava/lang/NumberFormatException;
        //  4372   4385   4388   4392   Ljava/lang/NumberFormatException;
        //  4392   4406   4409   4413   Ljava/lang/NumberFormatException;
        //  4413   4427   4430   4434   Ljava/lang/NumberFormatException;
        //  4420   4439   4442   4446   Ljava/lang/NumberFormatException;
        //  4448   4456   4459   4463   Ljava/lang/NumberFormatException;
        //  4463   4495   4498   4502   Ljava/lang/NumberFormatException;
        //  4524   4537   4540   4544   Ljava/lang/NumberFormatException;
        //  4528   4559   4562   4566   Ljava/lang/NumberFormatException;
        //  4544   4573   4576   4580   Ljava/lang/NumberFormatException;
        //  4566   4598   4601   4605   Ljava/lang/NumberFormatException;
        //  4580   4618   4621   4625   Ljava/lang/NumberFormatException;
        //  4641   4653   4656   4660   Ljava/lang/NumberFormatException;
        //  4647   4662   4665   4669   Ljava/lang/NumberFormatException;
        //  4720   4733   4736   4740   Ljava/lang/NumberFormatException;
        //  4729   4743   4746   4750   Ljava/lang/NumberFormatException;
        //  4740   4756   4759   4763   Ljava/lang/NumberFormatException;
        //  4763   4770   4773   4777   Ljava/lang/NumberFormatException;
        //  4798   4807   4807   4811   Ljava/lang/NumberFormatException;
        //  4812   4851   4854   4858   Ljava/lang/NumberFormatException;
        //  4858   4900   4903   4907   Ljava/lang/NumberFormatException;
        //  4894   4914   4917   4921   Ljava/lang/NumberFormatException;
        //  4921   4939   4939   4943   Ljava/lang/NumberFormatException;
        //  4979   5005   5008   5012   Ljava/lang/NumberFormatException;
        //  5023   5040   5043   5047   Ljava/lang/NumberFormatException;
        //  5026   5059   5062   5066   Ljava/lang/NumberFormatException;
        //  5047   5077   5080   5084   Ljava/lang/NumberFormatException;
        //  5066   5085   5088   5092   Ljava/lang/NumberFormatException;
        //  5103   5123   5126   5130   Ljava/lang/NumberFormatException;
        //  5107   5136   5136   5140   Ljava/lang/NumberFormatException;
        //  5145   5156   5159   5163   Ljava/lang/NumberFormatException;
        //  5153   5177   5180   5184   Ljava/lang/NumberFormatException;
        //  5163   5214   5217   5221   Ljava/lang/NumberFormatException;
        //  5184   5226   5229   5233   Ljava/lang/NumberFormatException;
        //  5221   5236   5239   5243   Ljava/lang/NumberFormatException;
        //  5243   5261   5264   5268   Ljava/lang/NumberFormatException;
        //  5247   5298   5301   5305   Ljava/lang/NumberFormatException;
        //  5268   5318   5321   5325   Ljava/lang/NumberFormatException;
        //  5331   5351   5354   5358   Ljava/lang/NumberFormatException;
        //  5335   5364   5364   5368   Ljava/lang/NumberFormatException;
        //  5373   5389   5392   5396   Ljava/lang/NumberFormatException;
        //  5377   5400   5403   5407   Ljava/lang/NumberFormatException;
        //  5407   5424   5427   5431   Ljava/lang/NumberFormatException;
        //  5412   5436   5439   5443   Ljava/lang/NumberFormatException;
        //  5431   5455   5458   5462   Ljava/lang/NumberFormatException;
        //  5443   5463   5466   5470   Ljava/lang/NumberFormatException;
        //  5470   5481   5484   5488   Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0148:
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
    
    private boolean checkClass_1799_2(final class_1799 class_1799) {
        Label_0047: {
            try {
                if (class_1799.method_7909() == class_1802.field_20399) {
                    break Label_0047;
                }
                final class_1799 class_1800 = class_1799;
                final class_2561 class_1801 = class_1800.method_7964();
                final String s = class_1801.getString();
                final Locale locale = Locale.ROOT;
                final String s2 = s.toLowerCase(locale);
                final int n = -26038;
                final int n2 = -22885;
                final String s3 = createString(n, n2);
                final boolean b = s2.contains(s3);
                if (b) {
                    break Label_0047;
                }
                return false;
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            try {
                final class_1799 class_1800 = class_1799;
                final class_2561 class_1801 = class_1800.method_7964();
                final String s = class_1801.getString();
                final Locale locale = Locale.ROOT;
                final String s2 = s.toLowerCase(locale);
                final int n = -26038;
                final int n2 = -22885;
                final String s3 = createString(n, n2);
                final boolean b = s2.contains(s3);
                if (b) {
                    return true;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
        }
        return false;
    }
    
    private boolean checkClass_1799_4(final class_1799 class_1799) {
        Label_0047: {
            try {
                if (class_1799.method_7960()) {
                    return false;
                }
                final class_1799 class_1800 = class_1799;
                final class_1792 class_1801 = class_1800.method_7909();
                final class_2561 class_1802 = class_1801.method_63680();
                final String s = class_1802.getString();
                final Locale locale = Locale.ROOT;
                final String s2 = s.toLowerCase(locale);
                final int n = -26028;
                final int n2 = 8095;
                final String s3 = createString(n, n2);
                final boolean b = s2.contains(s3);
                if (b) {
                    break Label_0047;
                }
                return false;
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            try {
                final class_1799 class_1800 = class_1799;
                final class_1792 class_1801 = class_1800.method_7909();
                final class_2561 class_1802 = class_1801.method_63680();
                final String s = class_1802.getString();
                final Locale locale = Locale.ROOT;
                final String s2 = s.toLowerCase(locale);
                final int n = -26028;
                final int n2 = 8095;
                final String s3 = createString(n, n2);
                final boolean b = s2.contains(s3);
                if (b) {
                    return true;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
        }
        return false;
    }
    
    private boolean checkClass_1799_3(final class_1799 class_1799) {
        Label_0024: {
            try {
                if (class_1799.method_7960()) {
                    return false;
                }
                final class_1799 class_1800 = class_1799;
                final class_1792 class_1801 = class_1800.method_7909();
                final class_1792 class_1802 = net.minecraft.class_1802.field_8815;
                if (class_1801 == class_1802) {
                    break Label_0024;
                }
                return false;
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            try {
                final class_1799 class_1800 = class_1799;
                final class_1792 class_1801 = class_1800.method_7909();
                final class_1792 class_1802 = net.minecraft.class_1802.field_8815;
                if (class_1801 == class_1802) {
                    return true;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
        }
        return false;
    }
    
    private boolean checkClass_1799(final class_1799 class_1799) {
        try {
            if (class_1799.method_7909() == class_1802.field_8545) {
                return true;
            }
        }
        catch (final NumberFormatException ex) {
            throw computeNumberformatexception(ex);
        }
        return false;
    }
    
    private boolean checkClass_1799_1(final class_1799 class_1799) {
        Label_0027: {
            try {
                if (class_1799.method_7909() == class_1802.field_8581) {
                    break Label_0027;
                }
                final class_1799 class_1800 = class_1799;
                final class_1792 class_1801 = class_1800.method_7909();
                final class_1792 class_1802 = net.minecraft.class_1802.field_8656;
                if (class_1801 == class_1802) {
                    break Label_0027;
                }
                return false;
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            try {
                final class_1799 class_1800 = class_1799;
                final class_1792 class_1801 = class_1800.method_7909();
                final class_1792 class_1802 = net.minecraft.class_1802.field_8656;
                if (class_1801 == class_1802) {
                    return true;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
        }
        return false;
    }
    
    private boolean checkClass_1799_5(final class_1799 class_1799) {
        final String lowerCase = class_1799.method_7909().method_63680().getString().toLowerCase();
        Label_0055: {
            try {
                if (!lowerCase.contains(createString(-26045, 16596))) {
                    return false;
                }
                final String s = lowerCase;
                final int n = -26006;
                final int n2 = 31581;
                final String s2 = createString(n, n2);
                final boolean b = s.contains(s2);
                if (b) {
                    break Label_0055;
                }
                return false;
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            try {
                final String s = lowerCase;
                final int n = -26006;
                final int n2 = 31581;
                final String s2 = createString(n, n2);
                final boolean b = s.contains(s2);
                if (b) {
                    return true;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
        }
        return false;
    }
    
    private boolean isEnabled() {
        for (int i = 9; i <= 35; ++i) {
            final class_1799 method_5438 = CalcGSub_17.class310.field_1724.method_31548().method_5438(i);
            try {
                if (method_5438.method_7960()) {
                    return false;
                }
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
        }
        return true;
    }
    
    private String computeString_1(final class_1799 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   net/minecraft/class_1799.method_7960:()Z
        //     4: ifeq            13
        //     7: aconst_null    
        //     8: areturn        
        //     9: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    12: athrow         
        //    13: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //    16: getfield        net/minecraft/class_310.field_1687:Lnet/minecraft/class_638;
        //    19: invokestatic    net/minecraft/class_1792$class_9635.method_59528:(Lnet/minecraft/class_1937;)Lnet/minecraft/class_1792$class_9635;
        //    22: astore_2       
        //    23: aload_1        
        //    24: aload_2        
        //    25: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.class310:Lnet/minecraft/class_310;
        //    28: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //    31: getstatic       net/minecraft/class_1836.field_41070:Lnet/minecraft/class_1836$class_1837;
        //    34: invokevirtual   net/minecraft/class_1799.method_7950:(Lnet/minecraft/class_1792$class_9635;Lnet/minecraft/class_1657;Lnet/minecraft/class_1836;)Ljava/util/List;
        //    37: astore_3       
        //    38: aload_3        
        //    39: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    44: astore          4
        //    46: aload           4
        //    48: invokeinterface java/util/Iterator.hasNext:()Z
        //    53: ifeq            291
        //    56: aload           4
        //    58: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    63: checkcast       Lnet/minecraft/class_2561;
        //    66: astore          5
        //    68: aload           5
        //    70: invokeinterface net/minecraft/class_2561.getString:()Ljava/lang/String;
        //    75: astore          6
        //    77: bipush          6
        //    79: anewarray       Ljava/util/regex/Pattern;
        //    82: dup            
        //    83: iconst_0       
        //    84: sipush          -25992
        //    87: sipush          25079
        //    90: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //    93: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    96: aastore        
        //    97: dup            
        //    98: iconst_1       
        //    99: sipush          -26040
        //   102: sipush          18517
        //   105: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   108: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //   111: aastore        
        //   112: dup            
        //   113: iconst_2       
        //   114: sipush          -25985
        //   117: sipush          -27055
        //   120: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   123: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //   126: aastore        
        //   127: dup            
        //   128: iconst_3       
        //   129: sipush          -26021
        //   132: sipush          23575
        //   135: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   138: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //   141: aastore        
        //   142: dup            
        //   143: iconst_4       
        //   144: sipush          -26004
        //   147: sipush          16469
        //   150: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   153: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //   156: aastore        
        //   157: dup            
        //   158: iconst_5       
        //   159: sipush          -26005
        //   162: sipush          15081
        //   165: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   168: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //   171: aastore        
        //   172: astore          7
        //   174: aload           7
        //   176: astore          8
        //   178: aload           8
        //   180: arraylength    
        //   181: istore          9
        //   183: iconst_0       
        //   184: istore          10
        //   186: iload           10
        //   188: iload           9
        //   190: if_icmpge       288
        //   193: aload           8
        //   195: iload           10
        //   197: aaload         
        //   198: astore          11
        //   200: aload           11
        //   202: aload           6
        //   204: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   207: astore          12
        //   209: aload           12
        //   211: invokevirtual   java/util/regex/Matcher.find:()Z
        //   214: ifeq            282
        //   217: aload           12
        //   219: iconst_1       
        //   220: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   223: astore          13
        //   225: aload           13
        //   227: invokevirtual   java/lang/String.length:()I
        //   230: iconst_3       
        //   231: if_icmplt       282
        //   234: aload           13
        //   236: invokevirtual   java/lang/String.length:()I
        //   239: bipush          16
        //   241: if_icmpgt       282
        //   244: goto            251
        //   247: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   250: athrow         
        //   251: aload           13
        //   253: sipush          -26017
        //   256: sipush          -24952
        //   259: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.createString:(II)Ljava/lang/String;
        //   262: invokevirtual   java/lang/String.matches:(Ljava/lang/String;)Z
        //   265: ifeq            282
        //   268: goto            275
        //   271: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   274: athrow         
        //   275: aload           13
        //   277: areturn        
        //   278: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   281: athrow         
        //   282: iinc            10, 1
        //   285: goto            186
        //   288: goto            46
        //   291: aconst_null    
        //   292: areturn        
        //    StackMapTable: 00 0C 49 07 00 90 03 FE 00 20 07 02 14 07 02 24 07 01 23 FF 00 8B 00 0B 07 00 02 07 01 31 07 02 14 07 02 24 07 01 23 07 01 EE 07 00 96 07 02 2D 07 02 2D 01 01 00 00 FF 00 3C 00 0E 07 00 02 07 01 31 07 02 14 07 02 24 07 01 23 07 01 EE 07 00 96 07 02 2D 07 02 2D 01 01 07 02 27 07 02 33 07 00 96 00 01 07 00 90 03 53 07 00 90 03 42 07 00 90 FA 00 03 F9 00 05 FF 00 02 00 01 07 00 02 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      9      9      13     Ljava/lang/NumberFormatException;
        //  225    244    247    251    Ljava/lang/NumberFormatException;
        //  234    268    271    275    Ljava/lang/NumberFormatException;
        //  251    278    278    282    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0251:
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
    
    private double method_double_2(final class_1799 class_1799) {
        try {
            if (class_1799.method_7960()) {
                return -1.0;
            }
        }
        catch (final NumberFormatException ex) {
            throw computeNumberformatexception(ex);
        }
        return this.method_double(class_1799.method_7950(class_1792$class_9635.method_59528((class_1937)CalcGSub_17.class310.field_1687), (class_1657)CalcGSub_17.class310.field_1724, (class_1836)class_1836.field_41070));
    }
    
    private double method_double(final List<class_2561> list) {
        Label_0028: {
            try {
                if (list == null) {
                    return -1.0;
                }
                final List<class_2561> list2 = list;
                final boolean b = list2.isEmpty();
                if (b) {
                    return -1.0;
                }
                break Label_0028;
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            try {
                final List<class_2561> list2 = list;
                final boolean b = list2.isEmpty();
                if (b) {
                    return -1.0;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
        }
        final Pattern[] array = { Pattern.compile(createString(-26003, 8594), 2), Pattern.compile(createString(-26010, -9461), 2), Pattern.compile(createString(-26039, -26388), 2), Pattern.compile(createString(-25991, 19908), 2), Pattern.compile(createString(-26001, 4997), 2), Pattern.compile(createString(-26026, 2547), 2) };
        final Iterator<class_2561> iterator = list.iterator();
        while (iterator.hasNext()) {
            final String string = iterator.next().getString();
            final Pattern[] array2 = array;
            for (int length = array2.length, i = 0; i < length; ++i) {
                final Matcher matcher = array2[i].matcher(string);
                if (matcher.find()) {
                    final String replace = matcher.group(1).replace(",", "");
                    String lowerCase = "";
                    Label_0264: {
                        try {
                            if (matcher.groupCount() < 2 || matcher.group(2) == null) {
                                break Label_0264;
                            }
                        }
                        catch (final NumberFormatException ex3) {
                            throw computeNumberformatexception(ex3);
                        }
                        lowerCase = matcher.group(2).toLowerCase();
                        try {
                            final double double1 = Double.parseDouble(replace);
                            double n = 1.0;
                            final String s = lowerCase;
                            int n2 = -1;
                            Label_0375: {
                                Label_0361: {
                                    Label_0344: {
                                        try {
                                            switch (s.hashCode()) {
                                                case 107: {
                                                    if (s.equals("k")) {
                                                        break;
                                                    }
                                                    break Label_0375;
                                                }
                                                case 109: {
                                                    break Label_0344;
                                                }
                                                case 98: {
                                                    break Label_0361;
                                                }
                                                default: {
                                                    break Label_0375;
                                                }
                                            }
                                        }
                                        catch (final NumberFormatException ex4) {
                                            throw computeNumberformatexception(ex4);
                                        }
                                        n2 = 0;
                                        break Label_0375;
                                    }
                                    if (s.equals("m")) {
                                        n2 = 1;
                                    }
                                    break Label_0375;
                                }
                                if (s.equals("b")) {
                                    n2 = 2;
                                }
                            }
                            switch (n2) {
                                case 0: {
                                    n = 1000.0;
                                    break;
                                }
                                case 1: {
                                    n = 1000000.0;
                                    break;
                                }
                                case 2: {
                                    n = 1.0E9;
                                    break;
                                }
                            }
                            return double1 * n;
                        }
                        catch (final NumberFormatException ex5) {}
                    }
                }
            }
        }
        return -1.0;
    }
    
    private double method_double_1(final String s) {
        Label_0026: {
            try {
                if (s == null) {
                    return -1.0;
                }
                final String s2 = s;
                final boolean b = s2.isEmpty();
                if (b) {
                    return -1.0;
                }
                break Label_0026;
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            try {
                final String s2 = s;
                final boolean b = s2.isEmpty();
                if (b) {
                    return -1.0;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
        }
        String s3 = s.trim().toLowerCase().replace(",", "");
        double n = 1.0;
        if (s3.endsWith("b")) {
            n = 1.0E9;
            s3 = s3.substring(0, s3.length() - 1);
        }
        else if (s3.endsWith("m")) {
            n = 1000000.0;
            s3 = s3.substring(0, s3.length() - 1);
        }
        else if (s3.endsWith("k")) {
            n = 1000.0;
            s3 = s3.substring(0, s3.length() - 1);
        }
        try {
            return Double.parseDouble(s3) * n;
        }
        catch (final NumberFormatException ex3) {
            return -1.0;
        }
    }
    
    private String computeString(final double d) {
        try {
            if (d >= 1.0E9) {
                return String.format(createString(-26033, -635), d / 1.0E9);
            }
        }
        catch (final NumberFormatException ex) {
            throw computeNumberformatexception(ex);
        }
        try {
            if (d >= 1000000.0) {
                return String.format(createString(-26013, -29140), d / 1000000.0);
            }
        }
        catch (final NumberFormatException ex2) {
            throw computeNumberformatexception(ex2);
        }
        try {
            if (d >= 1000.0) {
                return String.format(createString(-25990, 515), d / 1000.0);
            }
        }
        catch (final NumberFormatException ex3) {
            throw computeNumberformatexception(ex3);
        }
        return String.format(createString(-26042, -30104), d);
    }
    
    private boolean checkClass_1799_6(final class_1799 class_1799) {
        Label_0047: {
            try {
                if (class_1799.method_7909() == class_1802.field_20399) {
                    break Label_0047;
                }
                final class_1799 class_1800 = class_1799;
                final class_2561 class_1801 = class_1800.method_7964();
                final String s = class_1801.getString();
                final Locale locale = Locale.ROOT;
                final String s2 = s.toLowerCase(locale);
                final int n = -26019;
                final int n2 = 10281;
                final String s3 = createString(n, n2);
                final boolean b = s2.contains(s3);
                if (b) {
                    break Label_0047;
                }
                return false;
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            try {
                final class_1799 class_1800 = class_1799;
                final class_2561 class_1801 = class_1800.method_7964();
                final String s = class_1801.getString();
                final Locale locale = Locale.ROOT;
                final String s2 = s.toLowerCase(locale);
                final int n = -26019;
                final int n2 = 10281;
                final String s3 = createString(n, n2);
                final boolean b = s2.contains(s3);
                if (b) {
                    return true;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
        }
        return false;
    }
    
    private boolean checkClass_1799_7(final class_1799 class_1799) {
        Label_0024: {
            try {
                if (class_1799.method_7960()) {
                    return false;
                }
                final class_1799 class_1800 = class_1799;
                final class_1792 class_1801 = class_1800.method_7909();
                final class_1792 class_1802 = net.minecraft.class_1802.field_8815;
                if (class_1801 == class_1802) {
                    break Label_0024;
                }
                return false;
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            try {
                final class_1799 class_1800 = class_1799;
                final class_1792 class_1801 = class_1800.method_7909();
                final class_1792 class_1802 = net.minecraft.class_1802.field_8815;
                if (class_1801 == class_1802) {
                    return true;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
        }
        return false;
    }
    
    private boolean checkClass_1799_8(final class_1799 class_1799) {
        Label_0024: {
            try {
                if (class_1799.method_7960()) {
                    return false;
                }
                final class_1799 class_1800 = class_1799;
                final class_1792 class_1801 = class_1800.method_7909();
                final class_1792 class_1802 = net.minecraft.class_1802.field_8545;
                if (class_1801 == class_1802) {
                    break Label_0024;
                }
                return false;
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            try {
                final class_1799 class_1800 = class_1799;
                final class_1792 class_1801 = class_1800.method_7909();
                final class_1792 class_1802 = net.minecraft.class_1802.field_8545;
                if (class_1801 == class_1802) {
                    return true;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
        }
        return false;
    }
    
    private boolean checkClass_1799_9(final class_1799 class_1799) {
        final String lowerCase = class_1799.method_7909().method_63680().getString().toLowerCase();
        Label_0055: {
            try {
                if (!lowerCase.contains(createString(-26034, -2348))) {
                    return false;
                }
                final String s = lowerCase;
                final int n = -26037;
                final int n2 = 15814;
                final String s2 = createString(n, n2);
                final boolean b = s.contains(s2);
                if (b) {
                    break Label_0055;
                }
                return false;
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            try {
                final String s = lowerCase;
                final int n = -26037;
                final int n2 = 15814;
                final String s2 = createString(n, n2);
                final boolean b = s.contains(s2);
                if (b) {
                    return true;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
        }
        return false;
    }
    
    private boolean checkClass_1799_10(final class_1799 class_1799) {
        final String lowerCase = class_1799.method_7964().getString().toLowerCase();
        Label_0052: {
            try {
                if (!lowerCase.contains(createString(-26009, -28723))) {
                    return false;
                }
                final String s = lowerCase;
                final int n = -25988;
                final int n2 = 18284;
                final String s2 = createString(n, n2);
                final boolean b = s.contains(s2);
                if (b) {
                    break Label_0052;
                }
                return false;
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            try {
                final String s = lowerCase;
                final int n = -25988;
                final int n2 = 18284;
                final String s2 = createString(n, n2);
                final boolean b = s.contains(s2);
                if (b) {
                    return true;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
        }
        return false;
    }
    
    private boolean checkClass_1799_11(final class_1799 class_1799) {
        Label_0027: {
            try {
                if (class_1799.method_7909() == class_1802.field_8581) {
                    break Label_0027;
                }
                final class_1799 class_1800 = class_1799;
                final class_1792 class_1801 = class_1800.method_7909();
                final class_1792 class_1802 = net.minecraft.class_1802.field_8656;
                if (class_1801 == class_1802) {
                    break Label_0027;
                }
                return false;
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            try {
                final class_1799 class_1800 = class_1799;
                final class_1792 class_1801 = class_1800.method_7909();
                final class_1792 class_1802 = net.minecraft.class_1802.field_8656;
                if (class_1801 == class_1802) {
                    return true;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
        }
        return false;
    }
    
    private boolean isEnabled_1() {
        for (int i = 9; i <= 35; ++i) {
            final class_1799 method_5438 = CalcGSub_17.class310.field_1724.method_31548().method_5438(i);
            try {
                if (method_5438.method_7960()) {
                    return false;
                }
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
        }
        return true;
    }
    
    private static NumberFormatException computeNumberformatexception(final NumberFormatException ex) {
        return ex;
    }
    
    static {
        final String[] strArr2 = new String[56];
        int n = 0;
        String s;
        int n2 = (s = """
                      ª\u0000\u00f6\u00ea\u0003\u001d\u0001½*r\u0093¹A\u0098\u00f1Np¸@\u00f2 \u00e4³\u00f6\u0016\u001cT\u00e3\u008b¤\u00f0±ºp\u009f6\u001e\u00cd\u001d\u00c9¾\u00d3F\u00d0\u00c0\b\u00f6§\u00d8G\u0088\u001ehp\u00fa=\u00e6mC£\u00e2tc2\u00eb\u0012\u00df#|\u00ea	\u00de²\u009c1\u0098\u00d8\u0087x\u00e9\u00cf¶\u00061º\u001b%uE\u0005\u009eµ\u008a\u00e6\u00f4\u0010x!¸A\u00c90I\u0000\u0082\u0013\u0006\u00da\u00edªºV\r\u0095m\u0095¢@4¾`P\u00e9\u00df\u00f9n\u0005\u0090\u00e5K\u00ec\u00cc\u001b\u0093S«®L\u0007»\u009c \u00cd\u009d\u00fa¥T l@S5\u0088\u001a\u0017\u008d\u00eba\u00d5]\u000e\u0089\u008c\u00ceZ\u00f2{p\u00d95\u00c48
                      \u0016\u0089\r\u00d9Z{bh\u00d5\u009e\u00c0\u00fc\u008f\u00c8@\\u0004\u00fa\u00de\u009e\f\u00059\u00d8\u001ahU\u001d:\u00dc\u00e2\u009b\u0013\u00e3½Gf\u0016 tn\u00e5?\u0013\u00e4\u00f6\u00105y\u00d6\u00d4"\u00800\u00f9\u00e8\f\u0006r,\u00e0!\u0012º \u008ad¦¿x*$¿T\u00d7\u00dd.\u00f2¸2M\b^®3\u0092\u000e\u00cfj\bn\u0089\u0098¹\u0004\u001b\u009d\b\u00f3j\u0081\u0086\u001b\u00e0M\u00f9\r\u00efx\u00e2\u00e7\u009e·`\u0003\u0010\u00e8X®\u009b	\u00e7SJ?;\u00dev\u0004}\r\u00c3\u00e5\u00d6I\u0088\u0085xWgV\u00f9\u0012\u0014.\u008a\u0019·M\u00ef \u00cd\u00d5\u0004\u008e\u0014¬oUW\u00e2\u0080\u00c8\u0090\u00e1\u00e0ol\fl\u0099\u00c6"]\u00e6N\u0085\u0000:\u009f`\u007fVx\u0001\u009a\u00ed¶\u0007V\u00e7\u0003u}°\u0003WeV\u0011\u0001\u008fQj+\u0010`\u0016:\u0083)\u00f0\u0004\u00e8A¡S\u001e¥@«\u00e0·W\f!\u00f6\u0014\u00f2SB\u00f16!\u00f0\u000f\u000b\u001e\u00e3>d<Q\u0084¶\u00eez\u0095\u0007\u009f\u008b¦\u00ea\u00d5S\u00fcJ\u00c7\u009aV%\u00c6\u00f36\u0005\u000b6\u00c0|4\u0014\u00ed\u0087Y\u009a\u00c9\u0089\u00cc\u001fh\u00c2\u000e\u00ad9\u0087q\u0014\u00194\u0002.f\u00d0±*o\u00921\u0001\u00c9\u00f0\u00fe5\u000b^C\u009d\u0099\u00920£\u00ff\u00c3\u008c\u00f67Tb¦>¯z\u000e\u00c8\u00d2\u0087YP\u00df-\u001a\u0015\u00c2\u000e	\u00ef\u0099\u00ca\u0080C	\u00fd\u00ccVfJbQ\u008d\u00fd\u0086[O\u001fbD\u0000?\u00ea\u0007\u00fc
                      I,\u009a	c(¿\u00e6\u0010\u0094Z\u00f9`E¨L\u0091O\u00e2.\u0004;]	\u009bkJ\u00cb!\u009bMs\u00dc\u000b®7\u000e-\u00ea\u0095s\u0004dx\u0018\u0018\u00e1\fp6\u00d9oV{\u0086\u00efªZ\u00ee\u00c6\u00c1CN\u00926y\u00f6©\u0004\u00e8\u0004\u00df\u00eeX7\u001e`iD\u0003¬Ws\u00d0¶\u0087I\u0090P\u00f9\u0003\u008d\u008a\u00e9#\u00d3h\u00e0\b\r&m\u00cb\u00ca~Z\u000b¡)\u009aSa4:\u00d0£-\u00c2%\u0006\u00c5\u0002. \u00c4\u00dc\u0019¾\u0087\u00918
                      \u00eaJ\u00839m\u00cd<\u0013\u008fp\u001f¨\u00e5¦/\u00db\u001a5\u00ff=-\u0011\u00cd\u00ea\u000e\u00880D\u009d\u0089½w\u0086\u00f6\u000b\u0015J\u0092g\u001e2\u00f9
                      \u0006« \u00d4\u00eeL°:\u009awZ=¨@]P\u00c0!b\u0080¨\u0094\u00d3B½\u0010*\u001fhh\u00fa>\u00ef\bK¢\u00ecr\u0010(\u0091lc$\u00ear\u008a\u00e7<j\u00cb\u00cd\u0003\u001e\u00dbNg\u0002\u0080\u0006\u0094u¯\u00dc\u00e3u\u0014fk\u0099\u00f62\u00d0\u0000+\u0018¾\u00c8\u00fc)±\u0093-\u008d\u001f#\u00f2\r7\u0011®\f\u00f1¶\u00e3\u00df\u00ce\u0011\u0081J\u0098
                      \u00d6\u00805\u00c9\u0090d\u00ed\u0098iG\u0003\u008a]µ,\u008e\u00eb&Nk\u0003 `q\u00ecV\u00fbY\u0016zk\u00c9\u009b\u00d3\u0093\u00db\u0098\u00ad~\u0006C\u00f0a\u00cd\u00cf^±\u0093]Y\u00d1\u008f\u00deu\u001d~d\u0097\u0011\u0015°\u00d1\u00eb\u00feDº\u00dd\u0080\u00ec\u0084\u00e0}\u00dcJ\u00d3\u0081\u00f3sr(	h¦£¢5&ª8M,k\u00c1\u00c3\u009co\u0002{7¥½¾d(V½L\u00ed\u0013qw\u0015µDBWµ\u00cb\u00c6\u009e\u000f8t=[\u00f9\u008a&hx\u0015\u00e3¯\u0087\u00cf\u0006¡\u00ad	\u00c77\u0010-\u00d4Jmz\u0000\u0092\u0011¥\u009d.\u0011\u00c5k\u00c5\u0001\u00e2n«b°B²©g)\u0006\u0086\u001e\u00dc\u001b\u009f\u00f5\u00e2\u00c9\u00d9\u0017J¡\u00dc\u00e9r\u0003\u008c3\u00eb \u00e4[kX\u00c2\u00df\u001d<\u00df\u0010¬\u00d6\u00dc§\u00f7®°"¹¼p\u00ff\u0093T\u0083©\u00f8`\u0097\u001b\u00de~\u001c\u00c2\u009c¯ H\u00d5!\u00c0\u008d\u008c@\u0004A\u00efC\u00e5\u00c6I\u008a\u00858WoV\u00f8\u00124\u00c7\u0010:\bx\u0002µ¿-5´¹~\u00f5\u0084D[\u00ff""").length();
        int n3 = 4;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 109));
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
                                    case 0 -> 16;
                                    case 1 -> 18;
                                    case 2 -> 113;
                                    case 3 -> 64;
                                    case 4 -> 117;
                                    case 5 -> 124;
                                    default -> 52;
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
                            n2 = (s = "\u001bi\u00e3Z!\u009f\b\u0086\u00806\u0097\u0003\u00c2\u00ee\u0018\u00f1\u0003\u00e6\u00ce\u0017").length();
                            n3 = 16;
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
                    n5 = (n6 = (n7 = (n8 = 113)));
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
        strArr_1 = new String[56];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFF9A4B) & 0xFFFF;
        if (CalcGSub_17.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_17.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 220;
                case 1 -> 39;
                case 2 -> 145;
                case 3 -> 218;
                case 4 -> 228;
                case 5 -> 18;
                case 6 -> 59;
                case 7 -> 214;
                case 8 -> 188;
                case 9 -> 32;
                case 10 -> 219;
                case 11 -> 134;
                case 12 -> 213;
                case 13 -> 169;
                case 14 -> 17;
                case 15 -> 197;
                case 16 -> 242;
                case 17 -> 60;
                case 18 -> 149;
                case 19 -> 0;
                case 20 -> 47;
                case 21 -> 24;
                case 22 -> 55;
                case 23 -> 77;
                case 24 -> 89;
                case 25 -> 16;
                case 26 -> 86;
                case 27 -> 208;
                case 28 -> 125;
                case 29 -> 229;
                case 30 -> 178;
                case 31 -> 176;
                case 32 -> 202;
                case 33 -> 105;
                case 34 -> 82;
                case 35 -> 110;
                case 36 -> 72;
                case 37 -> 119;
                case 38 -> 61;
                case 39 -> 97;
                case 40 -> 113;
                case 41 -> 64;
                case 42 -> 115;
                case 43 -> 243;
                case 44 -> 102;
                case 45 -> 45;
                case 46 -> 206;
                case 47 -> 244;
                case 48 -> 98;
                case 49 -> 161;
                case 50 -> 101;
                case 51 -> 9;
                case 52 -> 231;
                case 53 -> 166;
                case 54 -> 236;
                case 55 -> 75;
                case 56 -> 165;
                case 57 -> 184;
                case 58 -> 111;
                case 59 -> 224;
                case 60 -> 28;
                case 61 -> 174;
                case 62 -> 164;
                case 63 -> 211;
                case 64 -> 252;
                case 65 -> 51;
                case 66 -> 96;
                case 67 -> 23;
                case 68 -> 8;
                case 69 -> 107;
                case 70 -> 3;
                case 71 -> 129;
                case 72 -> 172;
                case 73 -> 233;
                case 74 -> 106;
                case 75 -> 170;
                case 76 -> 29;
                case 77 -> 207;
                case 78 -> 103;
                case 79 -> 127;
                case 80 -> 87;
                case 81 -> 25;
                case 82 -> 152;
                case 83 -> 135;
                case 84 -> 175;
                case 85 -> 43;
                case 86 -> 143;
                case 87 -> 108;
                case 88 -> 90;
                case 89 -> 21;
                case 90 -> 181;
                case 91 -> 201;
                case 92 -> 193;
                case 93 -> 190;
                case 94 -> 217;
                case 95 -> 27;
                case 96 -> 150;
                case 97 -> 212;
                case 98 -> 171;
                case 99 -> 76;
                case 100 -> 159;
                case 101 -> 62;
                case 102 -> 153;
                case 103 -> 235;
                case 104 -> 69;
                case 105 -> 100;
                case 106 -> 130;
                case 107 -> 156;
                case 108 -> 157;
                case 109 -> 81;
                case 110 -> 68;
                case 111 -> 26;
                case 112 -> 88;
                case 113 -> 137;
                case 114 -> 234;
                case 115 -> 114;
                case 116 -> 133;
                case 117 -> 221;
                case 118 -> 85;
                case 119 -> 71;
                case 120 -> 141;
                case 121 -> 65;
                case 122 -> 40;
                case 123 -> 50;
                case 124 -> 158;
                case 125 -> 142;
                case 126 -> 117;
                case 127 -> 57;
                case 128 -> 204;
                case 129 -> 173;
                case 130 -> 73;
                case 131 -> 192;
                case 132 -> 248;
                case 133 -> 182;
                case 134 -> 122;
                case 135 -> 132;
                case 136 -> 53;
                case 137 -> 216;
                case 138 -> 138;
                case 139 -> 189;
                case 140 -> 92;
                case 141 -> 247;
                case 142 -> 251;
                case 143 -> 195;
                case 144 -> 44;
                case 145 -> 79;
                case 146 -> 200;
                case 147 -> 198;
                case 148 -> 254;
                case 149 -> 210;
                case 150 -> 246;
                case 151 -> 191;
                case 152 -> 162;
                case 153 -> 70;
                case 154 -> 109;
                case 155 -> 147;
                case 156 -> 41;
                case 157 -> 148;
                case 158 -> 140;
                case 159 -> 35;
                case 160 -> 42;
                case 161 -> 58;
                case 162 -> 139;
                case 163 -> 37;
                case 164 -> 104;
                case 165 -> 94;
                case 166 -> 12;
                case 167 -> 196;
                case 168 -> 239;
                case 169 -> 67;
                case 170 -> 238;
                case 171 -> 54;
                case 172 -> 187;
                case 173 -> 63;
                case 174 -> 126;
                case 175 -> 20;
                case 176 -> 7;
                case 177 -> 99;
                case 178 -> 52;
                case 179 -> 46;
                case 180 -> 120;
                case 181 -> 194;
                case 182 -> 2;
                case 183 -> 1;
                case 184 -> 6;
                case 185 -> 38;
                case 186 -> 241;
                case 187 -> 230;
                case 188 -> 49;
                case 189 -> 151;
                case 190 -> 163;
                case 191 -> 186;
                case 192 -> 4;
                case 193 -> 222;
                case 194 -> 93;
                case 195 -> 215;
                case 196 -> 177;
                case 197 -> 22;
                case 198 -> 116;
                case 199 -> 121;
                case 200 -> 14;
                case 201 -> 249;
                case 202 -> 167;
                case 203 -> 237;
                case 204 -> 226;
                case 205 -> 155;
                case 206 -> 30;
                case 207 -> 253;
                case 208 -> 36;
                case 209 -> 160;
                case 210 -> 66;
                case 211 -> 255;
                case 212 -> 250;
                case 213 -> 128;
                case 214 -> 34;
                case 215 -> 31;
                case 216 -> 146;
                case 217 -> 118;
                case 218 -> 168;
                case 219 -> 199;
                case 220 -> 11;
                case 221 -> 245;
                case 222 -> 78;
                case 223 -> 203;
                case 224 -> 240;
                case 225 -> 33;
                case 226 -> 123;
                case 227 -> 80;
                case 228 -> 83;
                case 229 -> 209;
                case 230 -> 131;
                case 231 -> 205;
                case 232 -> 91;
                case 233 -> 95;
                case 234 -> 180;
                case 235 -> 124;
                case 236 -> 5;
                case 237 -> 74;
                case 238 -> 112;
                case 239 -> 185;
                case 240 -> 223;
                case 241 -> 13;
                case 242 -> 84;
                case 243 -> 48;
                case 244 -> 225;
                case 245 -> 136;
                case 246 -> 154;
                case 247 -> 56;
                case 248 -> 19;
                case 249 -> 179;
                case 250 -> 144;
                case 251 -> 183;
                case 252 -> 232;
                case 253 -> 10;
                case 254 -> 227;
                default -> 15;
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
            CalcGSub_17.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_17.strArr_1[n3];
    }
}
