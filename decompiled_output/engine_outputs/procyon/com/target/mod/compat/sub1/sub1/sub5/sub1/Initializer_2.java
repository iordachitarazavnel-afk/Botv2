// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub1;

import net.minecraft.class_243;
import com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer;
import net.minecraft.class_332;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import java.awt.Color;
import net.minecraft.class_310;

public class Initializer_2
{
    private final class_310 class310;
    private final Initializer_3 utilE;
    private Color color;
    private static int[] intArr;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_2() {
        this.class310 = Initializer_1.class310;
        this.color = new Color(0, 0, 0);
        this.utilE = new Initializer_3();
    }
    
    public void processAll(final class_332 p0, final int p1, final int p2, final int p3, final double p4, final boolean p5, final boolean p6, final boolean p7, final boolean p8, final Color p9, final Color p10, final Color p11) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload           11
        //     3: putfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.color:Ljava/awt/Color;
        //     6: aload_0        
        //     7: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.class310:Lnet/minecraft/class_310;
        //    10: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //    13: ifnull          26
        //    16: aload_0        
        //    17: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.class310:Lnet/minecraft/class_310;
        //    20: getfield        net/minecraft/class_310.field_1687:Lnet/minecraft/class_638;
        //    23: ifnonnull       27
        //    26: return         
        //    27: aload_0        
        //    28: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.utilE:Lcom/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3;
        //    31: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3.getInt:()I
        //    34: istore          14
        //    36: iload           14
        //    38: iload           4
        //    40: imul           
        //    41: istore          15
        //    43: iload           14
        //    45: iload           4
        //    47: imul           
        //    48: istore          16
        //    50: bipush          6
        //    52: istore          17
        //    54: iconst_2       
        //    55: istore          18
        //    57: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //    60: ldc             ldc            !!! ERROR
        //    62: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.computeCalcg_1:(Ljava/lang/Class;)Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;
        //    65: checkcast       checkcast      !!! ERROR
        //    68: astore          19
        //    70: aload           19
        //    72: ifnull          83
        //    75: aload           19
        //    77: invokevirtual   invokevirtual  !!! ERROR
        //    80: goto            85
        //    83: ldc             -65536
        //    85: istore          20
        //    87: dload           5
        //    89: ldc2_w          0.6000000238418579
        //    92: dmul           
        //    93: ldc2_w          255.0
        //    96: dmul           
        //    97: d2i            
        //    98: istore          21
        //   100: iload           21
        //   102: bipush          24
        //   104: ishl           
        //   105: iload           20
        //   107: ldc             16777215
        //   109: iand           
        //   110: ior            
        //   111: istore          22
        //   113: dload           5
        //   115: ldc2_w          255.0
        //   118: dmul           
        //   119: d2i            
        //   120: istore          23
        //   122: iload           23
        //   124: bipush          24
        //   126: ishl           
        //   127: aload           11
        //   129: invokevirtual   java/awt/Color.getRGB:()I
        //   132: ldc             16777215
        //   134: iand           
        //   135: ior            
        //   136: istore          24
        //   138: aload_1        
        //   139: iload_2        
        //   140: iload_3        
        //   141: iload           15
        //   143: iload           16
        //   145: iload           17
        //   147: iload           24
        //   149: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //   152: aload_1        
        //   153: iload_2        
        //   154: iload_3        
        //   155: iload           15
        //   157: iload           16
        //   159: iload           17
        //   161: iload           22
        //   163: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_30:(Lnet/minecraft/class_332;IIIIII)V
        //   166: iconst_0       
        //   167: istore          25
        //   169: iload           25
        //   171: iload           14
        //   173: if_icmpge       311
        //   176: iconst_0       
        //   177: istore          26
        //   179: iload           26
        //   181: iload           14
        //   183: if_icmpge       305
        //   186: iload           25
        //   188: iload           14
        //   190: imul           
        //   191: iload           26
        //   193: iadd           
        //   194: istore          27
        //   196: aload_0        
        //   197: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.utilE:Lcom/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3;
        //   200: iload           27
        //   202: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3.computeRenderh:(I)Lcom/target/mod/compat/sub1/sub1/sub5/sub1/RecordSub;
        //   205: astore          28
        //   207: aload           28
        //   209: ifnull          299
        //   212: iload_2        
        //   213: iload           26
        //   215: iload           4
        //   217: imul           
        //   218: iadd           
        //   219: iload           18
        //   221: iadd           
        //   222: istore          29
        //   224: iload_3        
        //   225: iload           25
        //   227: iload           4
        //   229: imul           
        //   230: iadd           
        //   231: iload           18
        //   233: iadd           
        //   234: istore          30
        //   236: iload           4
        //   238: iload           18
        //   240: iconst_2       
        //   241: imul           
        //   242: isub           
        //   243: istore          31
        //   245: iload           4
        //   247: iload           18
        //   249: iconst_2       
        //   250: imul           
        //   251: isub           
        //   252: istore          32
        //   254: aload_0        
        //   255: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.utilE:Lcom/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3;
        //   258: aload           28
        //   260: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/RecordSub.intValue_1:I
        //   263: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3.computeColor:(I)Ljava/awt/Color;
        //   266: astore          33
        //   268: iload           23
        //   270: bipush          24
        //   272: ishl           
        //   273: aload           33
        //   275: invokevirtual   java/awt/Color.getRGB:()I
        //   278: ldc             16777215
        //   280: iand           
        //   281: ior            
        //   282: istore          34
        //   284: aload_1        
        //   285: iload           29
        //   287: iload           30
        //   289: iload           31
        //   291: iload           32
        //   293: iconst_2       
        //   294: iload           34
        //   296: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //   299: iinc            26, 1
        //   302: goto            179
        //   305: iinc            25, 1
        //   308: goto            169
        //   311: iload           7
        //   313: ifeq            419
        //   316: dload           5
        //   318: ldc2_w          0.30000001192092896
        //   321: dmul           
        //   322: ldc2_w          255.0
        //   325: dmul           
        //   326: d2i            
        //   327: istore          25
        //   329: iload           25
        //   331: bipush          24
        //   333: ishl           
        //   334: aload           12
        //   336: invokevirtual   java/awt/Color.getRGB:()I
        //   339: ldc             16777215
        //   341: iand           
        //   342: ior            
        //   343: istore          26
        //   345: iconst_0       
        //   346: istore          27
        //   348: iload           27
        //   350: iload           14
        //   352: if_icmpgt       382
        //   355: iload_2        
        //   356: iload           27
        //   358: iload           4
        //   360: imul           
        //   361: iadd           
        //   362: istore          28
        //   364: aload_1        
        //   365: iload           28
        //   367: iload_3        
        //   368: iconst_1       
        //   369: iload           16
        //   371: iload           26
        //   373: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll:(Lnet/minecraft/class_332;IIIII)V
        //   376: iinc            27, 1
        //   379: goto            348
        //   382: iconst_0       
        //   383: istore          27
        //   385: iload           27
        //   387: iload           14
        //   389: if_icmpgt       419
        //   392: iload_3        
        //   393: iload           27
        //   395: iload           4
        //   397: imul           
        //   398: iadd           
        //   399: istore          28
        //   401: aload_1        
        //   402: iload_2        
        //   403: iload           28
        //   405: iload           15
        //   407: iconst_1       
        //   408: iload           26
        //   410: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll:(Lnet/minecraft/class_332;IIIII)V
        //   413: iinc            27, 1
        //   416: goto            385
        //   419: fconst_1       
        //   420: fstore          25
        //   422: aload_1        
        //   423: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   426: invokevirtual   org/joml/Matrix3x2fStack.pushMatrix:()Lorg/joml/Matrix3x2fStack;
        //   429: pop            
        //   430: iload           8
        //   432: ifeq            604
        //   435: iconst_0       
        //   436: istore          26
        //   438: iload           26
        //   440: iload           14
        //   442: if_icmpge       604
        //   445: iconst_0       
        //   446: istore          27
        //   448: iload           27
        //   450: iload           14
        //   452: if_icmpge       598
        //   455: iload           26
        //   457: iload           14
        //   459: imul           
        //   460: iload           27
        //   462: iadd           
        //   463: istore          28
        //   465: aload_0        
        //   466: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.utilE:Lcom/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3;
        //   469: iload           28
        //   471: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3.computeRenderh:(I)Lcom/target/mod/compat/sub1/sub1/sub5/sub1/RecordSub;
        //   474: astore          29
        //   476: aload           29
        //   478: ifnull          592
        //   481: iload_2        
        //   482: iload           27
        //   484: iload           4
        //   486: imul           
        //   487: iadd           
        //   488: istore          30
        //   490: iload_3        
        //   491: iload           26
        //   493: iload           4
        //   495: imul           
        //   496: iadd           
        //   497: istore          31
        //   499: aload           29
        //   501: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/RecordSub.intValue:I
        //   504: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   507: astore          32
        //   509: aload_0        
        //   510: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.class310:Lnet/minecraft/class_310;
        //   513: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   516: aload           32
        //   518: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //   521: i2f            
        //   522: fstore          33
        //   524: aload_0        
        //   525: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.class310:Lnet/minecraft/class_310;
        //   528: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   531: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   534: pop            
        //   535: ldc             9.0
        //   537: fstore          34
        //   539: iload           30
        //   541: i2f            
        //   542: iload           4
        //   544: i2f            
        //   545: fload           33
        //   547: fsub           
        //   548: fconst_2       
        //   549: fdiv           
        //   550: fadd           
        //   551: fstore          35
        //   553: iload           31
        //   555: i2f            
        //   556: iload           4
        //   558: i2f            
        //   559: fload           34
        //   561: fsub           
        //   562: fconst_2       
        //   563: fdiv           
        //   564: fadd           
        //   565: fstore          36
        //   567: aload_1        
        //   568: aload_0        
        //   569: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.class310:Lnet/minecraft/class_310;
        //   572: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   575: aload           32
        //   577: fload           35
        //   579: f2i            
        //   580: fload           36
        //   582: f2i            
        //   583: getstatic       java/awt/Color.WHITE:Ljava/awt/Color;
        //   586: invokevirtual   java/awt/Color.getRGB:()I
        //   589: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //   592: iinc            27, 1
        //   595: goto            448
        //   598: iinc            26, 1
        //   601: goto            438
        //   604: aload_1        
        //   605: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   608: invokevirtual   org/joml/Matrix3x2fStack.popMatrix:()Lorg/joml/Matrix3x2fStack;
        //   611: pop            
        //   612: iload           10
        //   614: ifeq            628
        //   617: aload_0        
        //   618: aload_1        
        //   619: iload_2        
        //   620: iload_3        
        //   621: iload           4
        //   623: aload           13
        //   625: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.processAll_1:(Lnet/minecraft/class_332;IIILjava/awt/Color;)V
        //   628: iload           9
        //   630: ifne            638
        //   633: iload           8
        //   635: ifeq            651
        //   638: aload_0        
        //   639: aload_1        
        //   640: iload_2        
        //   641: iload_3        
        //   642: iload           16
        //   644: iload           9
        //   646: iload           8
        //   648: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.processAll_2:(Lnet/minecraft/class_332;IIIZZ)V
        //   651: return         
        //    StackMapTable: 00 15 1A 00 FF 00 37 00 13 07 00 02 07 00 48 01 01 01 03 01 01 01 01 07 00 1F 07 00 1F 07 00 1F 01 01 01 01 01 07 00 3D 00 00 41 01 FF 00 53 00 19 07 00 02 07 00 48 01 01 01 03 01 01 01 01 07 00 1F 07 00 1F 07 00 1F 01 01 01 01 01 07 00 3D 01 01 01 01 01 01 00 00 FC 00 09 01 FB 00 77 FA 00 05 FA 00 05 FE 00 24 01 01 01 FA 00 21 FC 00 02 01 F8 00 21 FD 00 12 02 01 FC 00 09 01 FB 00 8F FA 00 05 FA 00 05 17 09 0C
        // 
        // The error that occurred was:
        // 
        // java.lang.ClassCastException: class com.strobel.assembler.ir.attributes.BlobAttribute cannot be cast to class com.strobel.assembler.ir.attributes.BootstrapMethodsAttribute (com.strobel.assembler.ir.attributes.BlobAttribute and com.strobel.assembler.ir.attributes.BootstrapMethodsAttribute are in unnamed module of loader 'app')
        //     at com.strobel.assembler.metadata.ClassFileReader$Scope.lookupDynamicCallSite(ClassFileReader.java:1543)
        //     at com.strobel.assembler.metadata.ClassFileReader$Scope.lookup(ClassFileReader.java:1629)
        //     at com.strobel.assembler.ir.MetadataReader.readAttributeCore(MetadataReader.java:307)
        //     at com.strobel.assembler.metadata.ClassFileReader.readAttributeCore(ClassFileReader.java:431)
        //     at com.strobel.assembler.ir.MetadataReader.inflateAttributes(MetadataReader.java:440)
        //     at com.strobel.assembler.metadata.ClassFileReader.visitAttributes(ClassFileReader.java:1403)
        //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:667)
        //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:605)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveType(MetadataSystem.java:129)
        //     at com.strobel.decompiler.NoRetryMetadataSystem.resolveType(DecompilerDriver.java:475)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveCore(MetadataSystem.java:81)
        //     at com.strobel.assembler.metadata.MetadataResolver.resolve(MetadataResolver.java:104)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.resolve(CoreMetadataFactory.java:616)
        //     at com.strobel.assembler.metadata.MetadataHelper.isRawType(MetadataHelper.java:1688)
        //     at com.strobel.assembler.metadata.MetadataHelper.asSubType(MetadataHelper.java:821)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1507)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:373)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
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
    
    private void processAll_1(final class_332 class_332, final int n, final int n2, final int n3, final Color color) {
        final class_243 method_73189 = this.class310.field_1724.method_73189();
        final int[] intarr = this.utilE.createIntarr(method_73189.field_1352, method_73189.field_1350);
        if (intarr[0] >= 0 && intarr[0] < this.utilE.getInt() && intarr[1] >= 0 && intarr[1] < this.utilE.getInt()) {
            final double[] doublearr = this.utilE.createDoublearr(method_73189.field_1352, method_73189.field_1350);
            final double n4 = n + intarr[0] * n3 + doublearr[0] * n3;
            final double n5 = n2 + intarr[1] * n3 + doublearr[1] * n3;
            final int n6 = 4;
            final int rgb = color.getRGB();
            final int n7 = -1;
            Initializer.processAll_13(class_332, (int)n4, (int)n5, n6 + 2, 0x40000000 | (rgb & 0xFFFFFF), 0x0 | (rgb & 0xFFFFFF));
            Initializer.processAll_20(class_332, (int)n4 - n6, (int)n5 - n6, n6 * 2, n6 * 2, n6, rgb);
            Initializer.processAll_30(class_332, (int)n4 - n6, (int)n5 - n6, n6 * 2, n6 * 2, n6, n7);
            final double radians = Math.toRadians(-this.class310.field_1724.method_36454() + 90.0f);
            Initializer.processAll_20(class_332, (int)(n4 + Math.cos(radians) * 7.0) - 2, (int)(n5 + Math.sin(radians) * 7.0) - 2, 4, 4, 2, n7);
        }
    }
    
    private void processAll_2(final class_332 p0, final int p1, final int p2, final int p3, final boolean p4, final boolean p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: iload_3        
        //     4: iload           4
        //     6: iadd           
        //     7: bipush          8
        //     9: iadd           
        //    10: istore          8
        //    12: astore          7
        //    14: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //    17: ldc             ldc            !!! ERROR
        //    19: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.computeCalcg_1:(Ljava/lang/Class;)Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;
        //    22: checkcast       checkcast      !!! ERROR
        //    25: astore          9
        //    27: aload           9
        //    29: aload           7
        //    31: ifnonnull       39
        //    34: ifnull          45
        //    37: aload           9
        //    39: invokevirtual   invokevirtual  !!! ERROR
        //    42: goto            47
        //    45: ldc             -65536
        //    47: istore          10
        //    49: sipush          192
        //    52: istore          11
        //    54: iload           11
        //    56: bipush          24
        //    58: ishl           
        //    59: aload_0        
        //    60: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.color:Ljava/awt/Color;
        //    63: invokevirtual   java/awt/Color.getRed:()I
        //    66: bipush          16
        //    68: ishl           
        //    69: ior            
        //    70: aload_0        
        //    71: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.color:Ljava/awt/Color;
        //    74: invokevirtual   java/awt/Color.getGreen:()I
        //    77: bipush          8
        //    79: ishl           
        //    80: ior            
        //    81: aload_0        
        //    82: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.color:Ljava/awt/Color;
        //    85: invokevirtual   java/awt/Color.getBlue:()I
        //    88: ior            
        //    89: istore          12
        //    91: ldc             -16777216
        //    93: iload           10
        //    95: ldc             16777215
        //    97: iand           
        //    98: ior            
        //    99: istore          13
        //   101: aload_0        
        //   102: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.class310:Lnet/minecraft/class_310;
        //   105: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   108: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   111: pop            
        //   112: bipush          9
        //   114: istore          14
        //   116: bipush          40
        //   118: istore          15
        //   120: bipush          12
        //   122: istore          16
        //   124: bipush          12
        //   126: istore          17
        //   128: bipush          6
        //   130: istore          18
        //   132: bipush          12
        //   134: istore          19
        //   136: bipush          6
        //   138: istore          20
        //   140: iconst_0       
        //   141: istore          21
        //   143: aconst_null    
        //   144: astore          22
        //   146: aconst_null    
        //   147: astore          23
        //   149: iload           5
        //   151: ifeq            325
        //   154: aload_0        
        //   155: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.class310:Lnet/minecraft/class_310;
        //   158: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   161: invokevirtual   net/minecraft/class_746.method_73189:()Lnet/minecraft/class_243;
        //   164: astore          24
        //   166: sipush          27185
        //   169: sipush          -10871
        //   172: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.createString:(II)Ljava/lang/String;
        //   175: iconst_2       
        //   176: anewarray       Ljava/lang/Object;
        //   179: dup            
        //   180: iconst_0       
        //   181: aload           24
        //   183: getfield        net/minecraft/class_243.field_1352:D
        //   186: d2i            
        //   187: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   190: aastore        
        //   191: dup            
        //   192: iconst_1       
        //   193: aload           24
        //   195: getfield        net/minecraft/class_243.field_1350:D
        //   198: d2i            
        //   199: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   202: aastore        
        //   203: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   206: astore          22
        //   208: aload_0        
        //   209: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.class310:Lnet/minecraft/class_310;
        //   212: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   215: aload           22
        //   217: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //   220: istore          25
        //   222: iload           21
        //   224: iload           25
        //   226: invokestatic    java/lang/Math.max:(II)I
        //   229: istore          21
        //   231: aload_0        
        //   232: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.utilE:Lcom/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3;
        //   235: aload           24
        //   237: getfield        net/minecraft/class_243.field_1352:D
        //   240: aload           24
        //   242: getfield        net/minecraft/class_243.field_1350:D
        //   245: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3.method_int:(DD)I
        //   248: istore          26
        //   250: iload           26
        //   252: iconst_m1      
        //   253: if_icmpeq       325
        //   256: sipush          27184
        //   259: sipush          -14688
        //   262: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.createString:(II)Ljava/lang/String;
        //   265: iconst_2       
        //   266: anewarray       Ljava/lang/Object;
        //   269: dup            
        //   270: iconst_0       
        //   271: iload           26
        //   273: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   276: aastore        
        //   277: dup            
        //   278: iconst_1       
        //   279: aload_0        
        //   280: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.utilE:Lcom/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3;
        //   283: aload           24
        //   285: getfield        net/minecraft/class_243.field_1352:D
        //   288: aload           24
        //   290: getfield        net/minecraft/class_243.field_1350:D
        //   293: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3.createString:(DD)Ljava/lang/String;
        //   296: aastore        
        //   297: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   300: astore          23
        //   302: aload_0        
        //   303: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.class310:Lnet/minecraft/class_310;
        //   306: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   309: aload           23
        //   311: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //   314: istore          27
        //   316: iload           21
        //   318: iload           27
        //   320: invokestatic    java/lang/Math.max:(II)I
        //   323: istore          21
        //   325: iload           6
        //   327: aload           7
        //   329: ifnonnull       346
        //   332: ifeq            345
        //   335: aload_0        
        //   336: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.utilE:Lcom/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3;
        //   339: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3.getStringarrArray:()[Ljava/lang/String;
        //   342: goto            349
        //   345: iconst_0       
        //   346: anewarray       Ljava/lang/String;
        //   349: astore          24
        //   351: iload           6
        //   353: aload           7
        //   355: ifnonnull       372
        //   358: ifeq            371
        //   361: aload_0        
        //   362: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.utilE:Lcom/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3;
        //   365: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_3.getColorarrArray:()[Ljava/awt/Color;
        //   368: goto            375
        //   371: iconst_0       
        //   372: anewarray       Ljava/awt/Color;
        //   375: astore          25
        //   377: bipush          20
        //   379: istore          26
        //   381: iconst_4       
        //   382: istore          27
        //   384: bipush          20
        //   386: istore          28
        //   388: bipush          16
        //   390: istore          29
        //   392: iconst_0       
        //   393: istore          30
        //   395: aload           24
        //   397: astore          31
        //   399: aload           31
        //   401: arraylength    
        //   402: istore          32
        //   404: iconst_0       
        //   405: istore          33
        //   407: iload           33
        //   409: iload           32
        //   411: if_icmpge       457
        //   414: aload           31
        //   416: iload           33
        //   418: aaload         
        //   419: astore          34
        //   421: aload_0        
        //   422: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.class310:Lnet/minecraft/class_310;
        //   425: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   428: aload           34
        //   430: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //   433: istore          35
        //   435: iload           30
        //   437: iload           35
        //   439: invokestatic    java/lang/Math.max:(II)I
        //   442: aload           7
        //   444: ifnonnull       465
        //   447: istore          30
        //   449: iinc            33, 1
        //   452: aload           7
        //   454: ifnull          407
        //   457: iload           30
        //   459: iload           28
        //   461: iadd           
        //   462: iload           29
        //   464: iadd           
        //   465: istore          31
        //   467: iload           21
        //   469: iload           31
        //   471: invokestatic    java/lang/Math.max:(II)I
        //   474: istore          21
        //   476: iload           21
        //   478: iload           15
        //   480: iconst_2       
        //   481: imul           
        //   482: iadd           
        //   483: bipush          40
        //   485: iadd           
        //   486: istore          32
        //   488: iconst_0       
        //   489: istore          33
        //   491: iload           5
        //   493: aload           7
        //   495: ifnonnull       532
        //   498: ifeq            530
        //   501: iload           14
        //   503: aload           23
        //   505: ifnull          512
        //   508: iconst_2       
        //   509: goto            513
        //   512: iconst_1       
        //   513: imul           
        //   514: iload           18
        //   516: aload           23
        //   518: ifnull          525
        //   521: iconst_1       
        //   522: goto            526
        //   525: iconst_0       
        //   526: imul           
        //   527: iadd           
        //   528: istore          33
        //   530: iload           6
        //   532: aload           7
        //   534: ifnonnull       555
        //   537: ifeq            558
        //   540: aload           24
        //   542: arraylength    
        //   543: iload           26
        //   545: imul           
        //   546: iload           27
        //   548: aload           24
        //   550: arraylength    
        //   551: iconst_1       
        //   552: isub           
        //   553: imul           
        //   554: iadd           
        //   555: goto            559
        //   558: iconst_0       
        //   559: istore          34
        //   561: iload           33
        //   563: iload           5
        //   565: aload           7
        //   567: ifnonnull       575
        //   570: ifeq            588
        //   573: iload           6
        //   575: aload           7
        //   577: ifnonnull       585
        //   580: ifeq            588
        //   583: iload           19
        //   585: goto            589
        //   588: iconst_0       
        //   589: iadd           
        //   590: iload           34
        //   592: iadd           
        //   593: iload           16
        //   595: iconst_2       
        //   596: imul           
        //   597: iadd           
        //   598: istore          35
        //   600: aload_1        
        //   601: iload_2        
        //   602: iload           8
        //   604: iload           32
        //   606: iload           35
        //   608: iload           20
        //   610: iload           12
        //   612: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //   615: aload_1        
        //   616: iload_2        
        //   617: iload           8
        //   619: iload           32
        //   621: iload           35
        //   623: iload           20
        //   625: iload           13
        //   627: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_30:(Lnet/minecraft/class_332;IIIIII)V
        //   630: iload           8
        //   632: iload           16
        //   634: iadd           
        //   635: istore          36
        //   637: iload           5
        //   639: aload           7
        //   641: ifnonnull       859
        //   644: ifeq            857
        //   647: aload           22
        //   649: ifnull          857
        //   652: iload           10
        //   654: istore          37
        //   656: iload           36
        //   658: istore          38
        //   660: aload_1        
        //   661: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   664: invokevirtual   org/joml/Matrix3x2fStack.pushMatrix:()Lorg/joml/Matrix3x2fStack;
        //   667: pop            
        //   668: aload_1        
        //   669: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   672: fconst_2       
        //   673: fconst_2       
        //   674: invokevirtual   org/joml/Matrix3x2fStack.scale:(FF)Lorg/joml/Matrix3x2f;
        //   677: pop            
        //   678: aload_1        
        //   679: aload_0        
        //   680: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.class310:Lnet/minecraft/class_310;
        //   683: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   686: aload           22
        //   688: iload_2        
        //   689: iload           17
        //   691: iadd           
        //   692: iconst_2       
        //   693: idiv           
        //   694: iload           38
        //   696: iconst_2       
        //   697: idiv           
        //   698: iload           37
        //   700: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //   703: aload_1        
        //   704: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   707: invokevirtual   org/joml/Matrix3x2fStack.popMatrix:()Lorg/joml/Matrix3x2fStack;
        //   710: pop            
        //   711: iload           36
        //   713: iload           14
        //   715: iadd           
        //   716: istore          36
        //   718: aload           23
        //   720: aload           7
        //   722: ifnonnull       775
        //   725: ifnull          773
        //   728: iload           36
        //   730: iload           18
        //   732: iconst_2       
        //   733: idiv           
        //   734: iadd           
        //   735: istore          39
        //   737: ldc             1073741824
        //   739: istore          40
        //   741: iload           40
        //   743: bipush          24
        //   745: ishl           
        //   746: iload           10
        //   748: ldc             16777215
        //   750: iand           
        //   751: ior            
        //   752: istore          41
        //   754: aload_1        
        //   755: iload_2        
        //   756: iload           39
        //   758: iload           32
        //   760: iconst_1       
        //   761: iload           41
        //   763: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll:(Lnet/minecraft/class_332;IIIII)V
        //   766: iload           36
        //   768: iload           18
        //   770: iadd           
        //   771: istore          36
        //   773: aload           23
        //   775: ifnull          840
        //   778: iload           36
        //   780: istore          38
        //   782: aload_1        
        //   783: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   786: invokevirtual   org/joml/Matrix3x2fStack.pushMatrix:()Lorg/joml/Matrix3x2fStack;
        //   789: pop            
        //   790: aload_1        
        //   791: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   794: fconst_2       
        //   795: fconst_2       
        //   796: invokevirtual   org/joml/Matrix3x2fStack.scale:(FF)Lorg/joml/Matrix3x2f;
        //   799: pop            
        //   800: aload_1        
        //   801: aload_0        
        //   802: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.class310:Lnet/minecraft/class_310;
        //   805: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   808: aload           23
        //   810: iload_2        
        //   811: iload           17
        //   813: iadd           
        //   814: iconst_2       
        //   815: idiv           
        //   816: iload           38
        //   818: iconst_2       
        //   819: idiv           
        //   820: iload           37
        //   822: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //   825: aload_1        
        //   826: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   829: invokevirtual   org/joml/Matrix3x2fStack.popMatrix:()Lorg/joml/Matrix3x2fStack;
        //   832: pop            
        //   833: iload           36
        //   835: iload           14
        //   837: iadd           
        //   838: istore          36
        //   840: iload           6
        //   842: aload           7
        //   844: ifnonnull       859
        //   847: ifeq            857
        //   850: iload           36
        //   852: iload           19
        //   854: iadd           
        //   855: istore          36
        //   857: iload           6
        //   859: aload           7
        //   861: ifnonnull       868
        //   864: ifeq            1066
        //   867: iconst_m1      
        //   868: istore          37
        //   870: iload           36
        //   872: istore          38
        //   874: iconst_0       
        //   875: istore          39
        //   877: iload           39
        //   879: aload           24
        //   881: arraylength    
        //   882: if_icmpge       1066
        //   885: iload           39
        //   887: aload           25
        //   889: arraylength    
        //   890: aload           7
        //   892: ifnonnull       908
        //   895: if_icmpge       1066
        //   898: iload           38
        //   900: iload           39
        //   902: iload           26
        //   904: iload           27
        //   906: iadd           
        //   907: imul           
        //   908: iadd           
        //   909: istore          40
        //   911: iload_2        
        //   912: iload           17
        //   914: iadd           
        //   915: istore          41
        //   917: iload           40
        //   919: iload           26
        //   921: iload           28
        //   923: isub           
        //   924: iconst_2       
        //   925: idiv           
        //   926: iadd           
        //   927: istore          42
        //   929: aload           25
        //   931: iload           39
        //   933: aaload         
        //   934: invokevirtual   java/awt/Color.getRGB:()I
        //   937: istore          43
        //   939: aload_1        
        //   940: iload           41
        //   942: iload           42
        //   944: iload           28
        //   946: iload           28
        //   948: iconst_3       
        //   949: iload           43
        //   951: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //   954: ldc_w           1610612736
        //   957: istore          44
        //   959: iload           44
        //   961: bipush          24
        //   963: ishl           
        //   964: ldc             16777215
        //   966: ior            
        //   967: istore          45
        //   969: aload_1        
        //   970: iload           41
        //   972: iload           42
        //   974: iload           28
        //   976: iload           28
        //   978: iconst_3       
        //   979: iload           45
        //   981: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_30:(Lnet/minecraft/class_332;IIIIII)V
        //   984: iload           41
        //   986: iload           28
        //   988: iadd           
        //   989: iload           29
        //   991: iadd           
        //   992: istore          46
        //   994: iload           40
        //   996: iload           26
        //   998: iload           14
        //  1000: isub           
        //  1001: iconst_2       
        //  1002: idiv           
        //  1003: iadd           
        //  1004: istore          47
        //  1006: aload_1        
        //  1007: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //  1010: invokevirtual   org/joml/Matrix3x2fStack.pushMatrix:()Lorg/joml/Matrix3x2fStack;
        //  1013: pop            
        //  1014: aload_1        
        //  1015: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //  1018: fconst_2       
        //  1019: fconst_2       
        //  1020: invokevirtual   org/joml/Matrix3x2fStack.scale:(FF)Lorg/joml/Matrix3x2f;
        //  1023: pop            
        //  1024: aload_1        
        //  1025: aload_0        
        //  1026: getfield        com/target/mod/compat/sub1/sub1/sub5/sub1/Initializer_2.class310:Lnet/minecraft/class_310;
        //  1029: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //  1032: aload           24
        //  1034: iload           39
        //  1036: aaload         
        //  1037: iload           46
        //  1039: iconst_2       
        //  1040: idiv           
        //  1041: iload           47
        //  1043: iconst_2       
        //  1044: idiv           
        //  1045: iload           37
        //  1047: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //  1050: aload_1        
        //  1051: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //  1054: invokevirtual   org/joml/Matrix3x2fStack.popMatrix:()Lorg/joml/Matrix3x2fStack;
        //  1057: pop            
        //  1058: iinc            39, 1
        //  1061: aload           7
        //  1063: ifnull          877
        //  1066: return         
        //    StackMapTable: 00 23 FF 00 27 00 0A 07 00 02 07 00 48 01 01 01 01 01 07 00 CF 01 07 00 3D 00 01 07 00 3D 05 41 01 FF 01 15 00 18 07 00 02 07 00 48 01 01 01 01 01 07 00 CF 01 07 00 3D 01 01 01 01 01 01 01 01 01 01 01 01 07 00 79 07 00 79 00 00 13 40 01 42 07 00 FA FC 00 15 07 00 FA 40 01 42 07 01 00 FF 00 1F 00 22 07 00 02 07 00 48 01 01 01 01 01 07 00 CF 01 07 00 3D 01 01 01 01 01 01 01 01 01 01 01 01 07 00 79 07 00 79 07 00 FA 07 01 00 01 01 01 01 01 07 00 FA 01 01 00 00 31 47 01 FF 00 2E 00 22 07 00 02 07 00 48 01 01 01 01 01 07 00 CF 01 07 00 3D 01 01 01 01 01 01 01 01 01 01 01 01 07 00 79 07 00 79 07 00 FA 07 01 00 01 01 01 01 01 01 01 01 00 01 01 FF 00 00 00 22 07 00 02 07 00 48 01 01 01 01 01 07 00 CF 01 07 00 3D 01 01 01 01 01 01 01 01 01 01 01 01 07 00 79 07 00 79 07 00 FA 07 01 00 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 0B 00 22 07 00 02 07 00 48 01 01 01 01 01 07 00 CF 01 07 00 3D 01 01 01 01 01 01 01 01 01 01 01 01 07 00 79 07 00 79 07 00 FA 07 01 00 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 00 00 22 07 00 02 07 00 48 01 01 01 01 01 07 00 CF 01 07 00 3D 01 01 01 01 01 01 01 01 01 01 01 01 07 00 79 07 00 79 07 00 FA 07 01 00 01 01 01 01 01 01 01 01 00 03 01 01 01 03 41 01 56 01 02 40 01 FF 00 0F 00 23 07 00 02 07 00 48 01 01 01 01 01 07 00 CF 01 07 00 3D 01 01 01 01 01 01 01 01 01 01 01 01 07 00 79 07 00 79 07 00 FA 07 01 00 01 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 09 00 23 07 00 02 07 00 48 01 01 01 01 01 07 00 CF 01 07 00 3D 01 01 01 01 01 01 01 01 01 01 01 01 07 00 79 07 00 79 07 00 FA 07 01 00 01 01 01 01 01 01 01 01 01 00 02 01 01 42 01 FF 00 00 00 23 07 00 02 07 00 48 01 01 01 01 01 07 00 CF 01 07 00 3D 01 01 01 01 01 01 01 01 01 01 01 01 07 00 79 07 00 79 07 00 FA 07 01 00 01 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 B7 00 27 07 00 02 07 00 48 01 01 01 01 01 07 00 CF 01 07 00 3D 01 01 01 01 01 01 01 01 01 01 01 01 07 00 79 07 00 79 07 00 FA 07 01 00 01 01 01 01 01 01 01 01 01 01 01 01 01 00 00 41 07 00 79 FB 00 40 F9 00 10 41 01 48 01 FE 00 08 01 01 01 FF 00 1E 00 28 07 00 02 07 00 48 01 01 01 01 01 07 00 CF 01 07 00 3D 01 01 01 01 01 01 01 01 01 01 01 01 07 00 79 07 00 79 07 00 FA 07 01 00 01 01 01 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 F8 00 9D
        // 
        // The error that occurred was:
        // 
        // java.lang.ClassCastException: class com.strobel.assembler.ir.attributes.BlobAttribute cannot be cast to class com.strobel.assembler.ir.attributes.BootstrapMethodsAttribute (com.strobel.assembler.ir.attributes.BlobAttribute and com.strobel.assembler.ir.attributes.BootstrapMethodsAttribute are in unnamed module of loader 'app')
        //     at com.strobel.assembler.metadata.ClassFileReader$Scope.lookupDynamicCallSite(ClassFileReader.java:1543)
        //     at com.strobel.assembler.metadata.ClassFileReader$Scope.lookup(ClassFileReader.java:1629)
        //     at com.strobel.assembler.ir.MetadataReader.readAttributeCore(MetadataReader.java:307)
        //     at com.strobel.assembler.metadata.ClassFileReader.readAttributeCore(ClassFileReader.java:431)
        //     at com.strobel.assembler.ir.MetadataReader.inflateAttributes(MetadataReader.java:440)
        //     at com.strobel.assembler.metadata.ClassFileReader.visitAttributes(ClassFileReader.java:1403)
        //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:667)
        //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:605)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveType(MetadataSystem.java:129)
        //     at com.strobel.decompiler.NoRetryMetadataSystem.resolveType(DecompilerDriver.java:475)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveCore(MetadataSystem.java:81)
        //     at com.strobel.assembler.metadata.MetadataResolver.resolve(MetadataResolver.java:104)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.resolve(CoreMetadataFactory.java:616)
        //     at com.strobel.assembler.metadata.MetadataHelper.isRawType(MetadataHelper.java:1688)
        //     at com.strobel.assembler.metadata.MetadataHelper.asSubType(MetadataHelper.java:821)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1507)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:373)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
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
    
    public int method_int(final int n) {
        return this.utilE.getInt() * n;
    }
    
    public int method_int_1(final int n, final boolean b, final boolean b2) {
        int n2 = this.utilE.getInt() * n;
        if (b || b2) {
            final int n3 = 9;
            final int n4 = 12;
            final int n5 = 6;
            final int n6 = 12;
            final int n7 = 20;
            final int n8 = 4;
            n2 += (b ? (n3 * 2 + n5) : 0) + ((b && b2) ? n6 : 0) + (b2 ? (this.utilE.getStringarrArray().length * n7 + n8 * (this.utilE.getStringarrArray().length - 1)) : 0) + n4 * 2 + 8;
        }
        return n2;
    }
    
    public static void setIntarr(final int[] intArr) {
        Initializer_2.intArr = intArr;
    }
    
    public static int[] getIntarrArray() {
        return Initializer_2.intArr;
    }
    
    static {
        final String[] strArr2 = new String[2];
        int n = 0;
        final int[] intarr = null;
        final String s;
        final int length = (s = "\u00db¥\u00dd\u00da\u00f4\u00e7\u0006>1^I ¾j>\u000bT\u0014z\u00f4\u00d9P[\u00e6\n\u0089\u00cf").length();
        setIntarr(intarr);
        int char1 = 15;
        int index = -1;
        Label_0027: {
            break Label_0027;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 75);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0204: {
                        if (length2 > 1) {
                            break Label_0204;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 101;
                                case 1 -> 70;
                                case 2 -> 87;
                                case 3 -> 36;
                                case 4 -> 99;
                                case 5 -> 48;
                                default -> 110;
                            }));
                            ++n5;
                        } while (n2 == 0);
                    }
                    if (length2 > n5) {
                        continue;
                    }
                    break;
                }
                strArr2[n++] = new String(charArray).intern();
            } while ((index += char1) < length);
        }
        strArr = strArr2;
        strArr_1 = new String[2];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x6A30) & 0xFFFF;
        if (Initializer_2.strArr_1[n3] == null) {
            final char[] charArray = Initializer_2.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 85;
                case 1 -> 231;
                case 2 -> 253;
                case 3 -> 18;
                case 4 -> 124;
                case 5 -> 36;
                case 6 -> 223;
                case 7 -> 195;
                case 8 -> 241;
                case 9 -> 72;
                case 10 -> 66;
                case 11 -> 139;
                case 12 -> 145;
                case 13 -> 121;
                case 14 -> 147;
                case 15 -> 242;
                case 16 -> 112;
                case 17 -> 64;
                case 18 -> 246;
                case 19 -> 213;
                case 20 -> 109;
                case 21 -> 90;
                case 22 -> 16;
                case 23 -> 138;
                case 24 -> 63;
                case 25 -> 203;
                case 26 -> 162;
                case 27 -> 245;
                case 28 -> 117;
                case 29 -> 146;
                case 30 -> 238;
                case 31 -> 202;
                case 32 -> 218;
                case 33 -> 237;
                case 34 -> 192;
                case 35 -> 251;
                case 36 -> 252;
                case 37 -> 173;
                case 38 -> 100;
                case 39 -> 125;
                case 40 -> 152;
                case 41 -> 229;
                case 42 -> 61;
                case 43 -> 55;
                case 44 -> 212;
                case 45 -> 74;
                case 46 -> 94;
                case 47 -> 1;
                case 48 -> 108;
                case 49 -> 84;
                case 50 -> 14;
                case 51 -> 65;
                case 52 -> 211;
                case 53 -> 193;
                case 54 -> 99;
                case 55 -> 44;
                case 56 -> 56;
                case 57 -> 39;
                case 58 -> 130;
                case 59 -> 116;
                case 60 -> 210;
                case 61 -> 254;
                case 62 -> 179;
                case 63 -> 184;
                case 64 -> 13;
                case 65 -> 208;
                case 66 -> 196;
                case 67 -> 59;
                case 68 -> 28;
                case 69 -> 51;
                case 70 -> 142;
                case 71 -> 91;
                case 72 -> 68;
                case 73 -> 47;
                case 74 -> 209;
                case 75 -> 15;
                case 76 -> 7;
                case 77 -> 132;
                case 78 -> 122;
                case 79 -> 165;
                case 80 -> 194;
                case 81 -> 80;
                case 82 -> 200;
                case 83 -> 73;
                case 84 -> 21;
                case 85 -> 228;
                case 86 -> 17;
                case 87 -> 137;
                case 88 -> 26;
                case 89 -> 103;
                case 90 -> 201;
                case 91 -> 240;
                case 92 -> 57;
                case 93 -> 98;
                case 94 -> 82;
                case 95 -> 134;
                case 96 -> 40;
                case 97 -> 58;
                case 98 -> 183;
                case 99 -> 207;
                case 100 -> 250;
                case 101 -> 161;
                case 102 -> 89;
                case 103 -> 190;
                case 104 -> 52;
                case 105 -> 60;
                case 106 -> 255;
                case 107 -> 236;
                case 108 -> 181;
                case 109 -> 12;
                case 110 -> 133;
                case 111 -> 20;
                case 112 -> 178;
                case 113 -> 214;
                case 114 -> 180;
                case 115 -> 87;
                case 116 -> 170;
                case 117 -> 185;
                case 118 -> 198;
                case 119 -> 247;
                case 120 -> 219;
                case 121 -> 129;
                case 122 -> 95;
                case 123 -> 22;
                case 124 -> 243;
                case 125 -> 216;
                case 126 -> 24;
                case 127 -> 11;
                case 128 -> 8;
                case 129 -> 33;
                case 130 -> 182;
                case 131 -> 6;
                case 132 -> 233;
                case 133 -> 177;
                case 134 -> 69;
                case 135 -> 189;
                case 136 -> 248;
                case 137 -> 110;
                case 138 -> 79;
                case 139 -> 111;
                case 140 -> 70;
                case 141 -> 35;
                case 142 -> 88;
                case 143 -> 123;
                case 144 -> 97;
                case 145 -> 106;
                case 146 -> 46;
                case 147 -> 234;
                case 148 -> 217;
                case 149 -> 197;
                case 150 -> 76;
                case 151 -> 164;
                case 152 -> 42;
                case 153 -> 27;
                case 154 -> 96;
                case 155 -> 31;
                case 156 -> 102;
                case 157 -> 78;
                case 158 -> 113;
                case 159 -> 188;
                case 160 -> 150;
                case 161 -> 230;
                case 162 -> 155;
                case 163 -> 199;
                case 164 -> 83;
                case 165 -> 38;
                case 166 -> 50;
                case 167 -> 105;
                case 168 -> 154;
                case 169 -> 0;
                case 170 -> 25;
                case 171 -> 131;
                case 172 -> 67;
                case 173 -> 107;
                case 174 -> 128;
                case 175 -> 126;
                case 176 -> 215;
                case 177 -> 166;
                case 178 -> 119;
                case 179 -> 186;
                case 180 -> 34;
                case 181 -> 143;
                case 182 -> 156;
                case 183 -> 235;
                case 184 -> 160;
                case 185 -> 175;
                case 186 -> 71;
                case 187 -> 93;
                case 188 -> 86;
                case 189 -> 204;
                case 190 -> 120;
                case 191 -> 10;
                case 192 -> 135;
                case 193 -> 2;
                case 194 -> 54;
                case 195 -> 136;
                case 196 -> 226;
                case 197 -> 225;
                case 198 -> 244;
                case 199 -> 221;
                case 200 -> 104;
                case 201 -> 101;
                case 202 -> 29;
                case 203 -> 75;
                case 204 -> 227;
                case 205 -> 232;
                case 206 -> 19;
                case 207 -> 49;
                case 208 -> 222;
                case 209 -> 62;
                case 210 -> 118;
                case 211 -> 148;
                case 212 -> 48;
                case 213 -> 115;
                case 214 -> 141;
                case 215 -> 151;
                case 216 -> 81;
                case 217 -> 167;
                case 218 -> 187;
                case 219 -> 239;
                case 220 -> 41;
                case 221 -> 5;
                case 222 -> 37;
                case 223 -> 32;
                case 224 -> 158;
                case 225 -> 149;
                case 226 -> 23;
                case 227 -> 205;
                case 228 -> 171;
                case 229 -> 191;
                case 230 -> 77;
                case 231 -> 172;
                case 232 -> 153;
                case 233 -> 45;
                case 234 -> 43;
                case 235 -> 144;
                case 236 -> 114;
                case 237 -> 176;
                case 238 -> 159;
                case 239 -> 174;
                case 240 -> 92;
                case 241 -> 169;
                case 242 -> 168;
                case 243 -> 53;
                case 244 -> 30;
                case 245 -> 249;
                case 246 -> 224;
                case 247 -> 9;
                case 248 -> 206;
                case 249 -> 3;
                case 250 -> 4;
                case 251 -> 220;
                case 252 -> 140;
                case 253 -> 163;
                case 254 -> 157;
                default -> 127;
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
            Initializer_2.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_2.strArr_1[n3];
    }
}
