// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub2;

import net.minecraft.class_1044;
import java.util.function.Supplier;
import net.minecraft.class_1043;
import java.io.InputStream;
import net.minecraft.class_1011;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.concurrent.CompletableFuture;
import com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1;
import net.minecraft.class_332;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_5;
import net.minecraft.class_2960;
import java.util.Map;
import com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_8;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_7;

public class Initializer_3
{
    private final Initializer_7 parseD;
    private final class_310 class310;
    private final int intValue = 125;
    private final int intValue_1 = 75;
    private final int intValue_2 = 150;
    private final int intValue_3 = 14;
    private final int intValue_4 = 4;
    private final int intValue_5 = 15;
    private final int intValue_6 = 3;
    private final int intValue_7 = 14;
    private final int intValue_8 = 11;
    private final Initializer_8 slotJ;
    private final Initializer_8 slotJ_1;
    private final Map<String, class_2960> map;
    private final Map<String, Boolean> map_1;
    private RenderASub_5 dataP;
    private int intValue_9;
    private int intValue_10;
    private int intValue_11;
    private int intValue_12;
    private int intValue_13;
    private boolean boolFlag;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_3() {
        this.class310 = class_310.method_1551();
        this.slotJ = new Initializer_8();
        this.slotJ_1 = new Initializer_8();
        this.map = new ConcurrentHashMap<String, class_2960>();
        this.map_1 = new ConcurrentHashMap<String, Boolean>();
        this.intValue_9 = 500;
        this.intValue_10 = 200;
        this.intValue_11 = 75;
        this.intValue_12 = 0;
        this.intValue_13 = -1;
        this.boolFlag = false;
        this.parseD = new Initializer_7();
    }
    
    private void execute() {
        if (this.dataP == null) {
            this.intValue_11 = 75;
            return;
        }
        final int size = this.getList().size();
        final int n = 34;
        if (size == 0) {
            this.intValue_11 = Math.max(75, n + 14 + 8);
        }
        else if (size <= 3) {
            this.intValue_11 = n + size * 18 + 4 + 14 + 4;
            this.intValue_11 = Math.min(this.intValue_11, 150);
        }
        else {
            this.intValue_11 = n + 54 + 4 + 14 + 4;
            this.intValue_11 = Math.min(this.intValue_11, 150);
        }
    }
    
    private List<String> getList() {
        if (this.dataP == null) {
            return Collections.emptyList();
        }
        if (this.slotJ_1.getString_1().isEmpty()) {
            return this.dataP.getList();
        }
        return this.dataP.getList().stream().filter(Initializer_3::lambda$getFilteredItems$0).collect((Collector<? super Object, ?, List<String>>)Collectors.toList());
    }
    
    public RenderASub_5 getDatap() {
        return this.dataP;
    }
    
    public void setDatap(final RenderASub_5 dataP) {
        this.dataP = dataP;
        if (dataP != null) {
            this.intValue_12 = 0;
            this.intValue_13 = -1;
            this.slotJ.setString_2("");
            this.slotJ.execute();
            this.boolFlag = false;
            this.execute();
        }
    }
    
    public void processAll(final class_332 p0, final int p1, final int p2, final float p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          5
        //     5: aload_0        
        //     6: aload           5
        //     8: ifnonnull       34
        //    11: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.dataP:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5;
        //    14: ifnonnull       29
        //    17: goto            24
        //    20: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    23: athrow         
        //    24: return         
        //    25: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    28: athrow         
        //    29: aload_0        
        //    30: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.execute:()V
        //    33: aload_0        
        //    34: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.parseD:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_7;
        //    37: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_7.getIntarrArray:()[I
        //    40: astore          6
        //    42: aload_0        
        //    43: aload           6
        //    45: iconst_0       
        //    46: iaload         
        //    47: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //    50: aload_0        
        //    51: aload           6
        //    53: iconst_1       
        //    54: iaload         
        //    55: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_10:I
        //    58: aload_0        
        //    59: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.parseD:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_7;
        //    62: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_7.isEnabled:()Z
        //    65: istore          7
        //    67: bipush          6
        //    69: istore          8
        //    71: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt:()I
        //    74: istore          9
        //    76: iload           9
        //    78: ldc             -16777216
        //    80: ldc             0.8
        //    82: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int_2:(IIF)I
        //    85: istore          10
        //    87: iload           10
        //    89: fload           4
        //    91: ldc             0.4
        //    93: fmul           
        //    94: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //    97: istore          11
        //    99: aload_1        
        //   100: aload_0        
        //   101: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //   104: aload_0        
        //   105: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_10:I
        //   108: bipush          125
        //   110: aload_0        
        //   111: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_11:I
        //   114: iload           8
        //   116: iload           11
        //   118: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //   121: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt:()I
        //   124: fload           4
        //   126: ldc             0.15
        //   128: fmul           
        //   129: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //   132: istore          12
        //   134: iload           12
        //   136: aload           5
        //   138: ifnonnull       190
        //   141: ifeq            188
        //   144: goto            151
        //   147: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   150: athrow         
        //   151: aload_1        
        //   152: aload_0        
        //   153: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //   156: iconst_1       
        //   157: iadd           
        //   158: aload_0        
        //   159: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_10:I
        //   162: iconst_1       
        //   163: iadd           
        //   164: bipush          123
        //   166: aload_0        
        //   167: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_11:I
        //   170: iconst_2       
        //   171: isub           
        //   172: iload           8
        //   174: iconst_1       
        //   175: isub           
        //   176: iload           12
        //   178: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_30:(Lnet/minecraft/class_332;IIIIII)V
        //   181: goto            188
        //   184: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   187: athrow         
        //   188: iload           7
        //   190: ifeq            201
        //   193: fconst_1       
        //   194: goto            204
        //   197: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   200: athrow         
        //   201: ldc_w           0.7
        //   204: fstore          13
        //   206: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt:()I
        //   209: fload           4
        //   211: fload           13
        //   213: fmul           
        //   214: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //   217: istore          14
        //   219: aload_1        
        //   220: aload_0        
        //   221: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //   224: aload_0        
        //   225: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_10:I
        //   228: bipush          125
        //   230: aload_0        
        //   231: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_11:I
        //   234: iload           8
        //   236: iload           14
        //   238: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_30:(Lnet/minecraft/class_332;IIIIII)V
        //   241: iload           10
        //   243: fload           4
        //   245: ldc             0.4
        //   247: fmul           
        //   248: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //   251: istore          15
        //   253: aload_1        
        //   254: aload_0        
        //   255: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //   258: aload_0        
        //   259: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_10:I
        //   262: bipush          125
        //   264: bipush          15
        //   266: iload           8
        //   268: iload           15
        //   270: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_23:(Lnet/minecraft/class_332;IIIIII)V
        //   273: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt_8:()I
        //   276: fload           4
        //   278: ldc_w           255.0
        //   281: fmul           
        //   282: f2i            
        //   283: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int_1:(II)I
        //   286: ldc             -16777216
        //   288: ior            
        //   289: istore          16
        //   291: aload_0        
        //   292: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.dataP:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5;
        //   295: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5.getString:()Ljava/lang/String;
        //   298: astore          17
        //   300: aload_1        
        //   301: aload_0        
        //   302: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.class310:Lnet/minecraft/class_310;
        //   305: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   308: aload           17
        //   310: aload_0        
        //   311: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //   314: iconst_4       
        //   315: iadd           
        //   316: aload_0        
        //   317: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_10:I
        //   320: iconst_3       
        //   321: iadd           
        //   322: iload           16
        //   324: iconst_0       
        //   325: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //   328: aload_0        
        //   329: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //   332: bipush          125
        //   334: iadd           
        //   335: bipush          9
        //   337: isub           
        //   338: istore          18
        //   340: aload_0        
        //   341: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_10:I
        //   344: iconst_5       
        //   345: iadd           
        //   346: istore          19
        //   348: iload_2        
        //   349: i2d            
        //   350: iload_3        
        //   351: i2d            
        //   352: iload           18
        //   354: iconst_2       
        //   355: isub           
        //   356: iload           19
        //   358: bipush          7
        //   360: iconst_5       
        //   361: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_1.checkCondition:(DDIIII)Z
        //   364: istore          20
        //   366: iload           20
        //   368: aload           5
        //   370: ifnonnull       402
        //   373: ifeq            401
        //   376: goto            383
        //   379: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   382: athrow         
        //   383: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt:()I
        //   386: fload           4
        //   388: ldc             0.8
        //   390: fmul           
        //   391: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //   394: goto            406
        //   397: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   400: athrow         
        //   401: iconst_0       
        //   402: fconst_0       
        //   403: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //   406: istore          21
        //   408: iload           21
        //   410: aload           5
        //   412: ifnonnull       462
        //   415: ifeq            448
        //   418: goto            425
        //   421: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   424: athrow         
        //   425: aload_1        
        //   426: iload           18
        //   428: iconst_2       
        //   429: isub           
        //   430: iload           19
        //   432: bipush          7
        //   434: iconst_5       
        //   435: iconst_2       
        //   436: iload           21
        //   438: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //   441: goto            448
        //   444: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   447: athrow         
        //   448: iconst_m1      
        //   449: fload           4
        //   451: ldc_w           255.0
        //   454: fmul           
        //   455: f2i            
        //   456: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int_1:(II)I
        //   459: ldc             -16777216
        //   461: ior            
        //   462: istore          22
        //   464: aload_1        
        //   465: aload_0        
        //   466: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.class310:Lnet/minecraft/class_310;
        //   469: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   472: ldc_w           "\u2715"
        //   475: iload           18
        //   477: iconst_1       
        //   478: isub           
        //   479: iload           19
        //   481: iload           22
        //   483: iconst_0       
        //   484: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //   487: aload_0        
        //   488: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_10:I
        //   491: bipush          15
        //   493: iadd           
        //   494: iconst_4       
        //   495: iadd           
        //   496: istore          23
        //   498: aload_0        
        //   499: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //   502: iconst_4       
        //   503: iadd           
        //   504: istore          24
        //   506: bipush          117
        //   508: istore          25
        //   510: iload_2        
        //   511: i2d            
        //   512: iload_3        
        //   513: i2d            
        //   514: iload           24
        //   516: iload           23
        //   518: iload           25
        //   520: bipush          11
        //   522: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_1.checkCondition:(DDIIII)Z
        //   525: istore          26
        //   527: aload_0        
        //   528: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.slotJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //   531: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.isEnabled_1:()Z
        //   534: aload           5
        //   536: ifnonnull       592
        //   539: ifne            573
        //   542: goto            549
        //   545: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   548: athrow         
        //   549: iload           26
        //   551: aload           5
        //   553: ifnonnull       598
        //   556: goto            563
        //   559: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   562: athrow         
        //   563: ifeq            595
        //   566: goto            573
        //   569: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   572: athrow         
        //   573: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt_7:()I
        //   576: fload           4
        //   578: ldc_w           0.2
        //   581: fmul           
        //   582: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //   585: goto            592
        //   588: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   591: athrow         
        //   592: goto            607
        //   595: ldc_w           -13421773
        //   598: fload           4
        //   600: ldc_w           0.2
        //   603: fmul           
        //   604: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //   607: istore          27
        //   609: aload_1        
        //   610: iload           24
        //   612: iload           23
        //   614: iload           25
        //   616: bipush          11
        //   618: iconst_2       
        //   619: iload           27
        //   621: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //   624: aload_0        
        //   625: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.dataP:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5;
        //   628: aload           5
        //   630: ifnonnull       654
        //   633: ifnull          687
        //   636: goto            643
        //   639: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   642: athrow         
        //   643: aload_0        
        //   644: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.dataP:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5;
        //   647: goto            654
        //   650: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   653: athrow         
        //   654: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5.getString:()Ljava/lang/String;
        //   657: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   660: sipush          -25000
        //   663: sipush          -4799
        //   666: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.createString:(II)Ljava/lang/String;
        //   669: swap           
        //   670: sipush          -24993
        //   673: sipush          16724
        //   676: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.createString:(II)Ljava/lang/String;
        //   679: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   684: goto            696
        //   687: sipush          -25001
        //   690: sipush          -22482
        //   693: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.createString:(II)Ljava/lang/String;
        //   696: astore          28
        //   698: aload_0        
        //   699: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.slotJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //   702: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.getString_1:()Ljava/lang/String;
        //   705: astore          29
        //   707: aload_0        
        //   708: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.slotJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //   711: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.isEnabled_1:()Z
        //   714: aload           5
        //   716: ifnonnull       797
        //   719: ifeq            773
        //   722: goto            729
        //   725: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   728: athrow         
        //   729: aload_0        
        //   730: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.slotJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //   733: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.getInt_2:()I
        //   736: istore          31
        //   738: aload           29
        //   740: iconst_0       
        //   741: iload           31
        //   743: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   746: astore          32
        //   748: aload           29
        //   750: iload           31
        //   752: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   755: astore          33
        //   757: aload           32
        //   759: aload           33
        //   761: invokedynamic   BootstrapMethod #2, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   766: astore          30
        //   768: aload           5
        //   770: ifnull          820
        //   773: aload           29
        //   775: aload           5
        //   777: ifnonnull       818
        //   780: goto            787
        //   783: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   786: athrow         
        //   787: invokevirtual   java/lang/String.isEmpty:()Z
        //   790: goto            797
        //   793: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   796: athrow         
        //   797: ifeq            809
        //   800: aload           28
        //   802: astore          30
        //   804: aload           5
        //   806: ifnull          820
        //   809: aload           29
        //   811: goto            818
        //   814: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   817: athrow         
        //   818: astore          30
        //   820: aload_0        
        //   821: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.slotJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //   824: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.getString_1:()Ljava/lang/String;
        //   827: invokevirtual   java/lang/String.isEmpty:()Z
        //   830: aload           5
        //   832: ifnonnull       848
        //   835: ifeq            851
        //   838: goto            845
        //   841: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   844: athrow         
        //   845: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt_9:()I
        //   848: goto            854
        //   851: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt_8:()I
        //   854: fload           4
        //   856: ldc_w           255.0
        //   859: fmul           
        //   860: f2i            
        //   861: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int_1:(II)I
        //   864: ldc             -16777216
        //   866: ior            
        //   867: istore          31
        //   869: aload_1        
        //   870: aload_0        
        //   871: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.class310:Lnet/minecraft/class_310;
        //   874: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   877: aload           30
        //   879: iload           24
        //   881: iconst_2       
        //   882: iadd           
        //   883: iload           23
        //   885: iconst_1       
        //   886: iadd           
        //   887: iload           31
        //   889: iconst_0       
        //   890: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //   893: aload_0        
        //   894: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.getList:()Ljava/util/List;
        //   897: astore          32
        //   899: iload           23
        //   901: bipush          11
        //   903: iadd           
        //   904: iconst_4       
        //   905: iadd           
        //   906: istore          33
        //   908: aload_0        
        //   909: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_11:I
        //   912: bipush          15
        //   914: isub           
        //   915: bipush          11
        //   917: isub           
        //   918: bipush          14
        //   920: isub           
        //   921: bipush          16
        //   923: isub           
        //   924: istore          34
        //   926: bipush          54
        //   928: istore          35
        //   930: iload           34
        //   932: iload           35
        //   934: invokestatic    java/lang/Math.min:(II)I
        //   937: istore          36
        //   939: aload_1        
        //   940: aload_0        
        //   941: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //   944: iload           33
        //   946: aload_0        
        //   947: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //   950: bipush          125
        //   952: iadd           
        //   953: iload           33
        //   955: iload           36
        //   957: iadd           
        //   958: invokevirtual   net/minecraft/class_332.method_44379:(IIII)V
        //   961: iload           33
        //   963: aload_0        
        //   964: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_12:I
        //   967: isub           
        //   968: istore          37
        //   970: iconst_0       
        //   971: aload           32
        //   973: invokeinterface java/util/List.size:()I
        //   978: bipush          18
        //   980: imul           
        //   981: iload           36
        //   983: isub           
        //   984: invokestatic    java/lang/Math.max:(II)I
        //   987: istore          38
        //   989: aload_0        
        //   990: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_12:I
        //   993: aload           5
        //   995: ifnonnull       1030
        //   998: iload           38
        //  1000: if_icmple       1023
        //  1003: goto            1010
        //  1006: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1009: athrow         
        //  1010: aload_0        
        //  1011: iload           38
        //  1013: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_12:I
        //  1016: goto            1023
        //  1019: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1022: athrow         
        //  1023: aload           32
        //  1025: invokeinterface java/util/List.isEmpty:()Z
        //  1030: aload           5
        //  1032: ifnonnull       1274
        //  1035: ifeq            1266
        //  1038: goto            1045
        //  1041: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1044: athrow         
        //  1045: aload_0        
        //  1046: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.dataP:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5;
        //  1049: aload           5
        //  1051: ifnonnull       1082
        //  1054: goto            1061
        //  1057: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1060: athrow         
        //  1061: ifnull          1091
        //  1064: goto            1071
        //  1067: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1070: athrow         
        //  1071: aload_0        
        //  1072: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.dataP:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5;
        //  1075: goto            1082
        //  1078: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1081: athrow         
        //  1082: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5.getString:()Ljava/lang/String;
        //  1085: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //  1088: goto            1100
        //  1091: sipush          -25007
        //  1094: sipush          23634
        //  1097: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.createString:(II)Ljava/lang/String;
        //  1100: astore          39
        //  1102: aload_0        
        //  1103: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.slotJ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //  1106: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.getString_1:()Ljava/lang/String;
        //  1109: aload           5
        //  1111: ifnonnull       1162
        //  1114: invokevirtual   java/lang/String.isEmpty:()Z
        //  1117: ifeq            1160
        //  1120: goto            1127
        //  1123: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1126: athrow         
        //  1127: aload           39
        //  1129: sipush          -24999
        //  1132: sipush          29123
        //  1135: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.createString:(II)Ljava/lang/String;
        //  1138: swap           
        //  1139: sipush          -25004
        //  1142: sipush          3775
        //  1145: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.createString:(II)Ljava/lang/String;
        //  1148: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1153: goto            1186
        //  1156: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1159: athrow         
        //  1160: aload           39
        //  1162: sipush          -24994
        //  1165: sipush          8815
        //  1168: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.createString:(II)Ljava/lang/String;
        //  1171: swap           
        //  1172: sipush          -24996
        //  1175: sipush          -26938
        //  1178: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.createString:(II)Ljava/lang/String;
        //  1181: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1186: astore          40
        //  1188: aload_0        
        //  1189: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //  1192: bipush          125
        //  1194: aload_0        
        //  1195: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.class310:Lnet/minecraft/class_310;
        //  1198: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //  1201: aload           40
        //  1203: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  1206: isub           
        //  1207: iconst_2       
        //  1208: idiv           
        //  1209: iadd           
        //  1210: istore          41
        //  1212: iload           33
        //  1214: iload           36
        //  1216: iconst_2       
        //  1217: idiv           
        //  1218: iadd           
        //  1219: iconst_4       
        //  1220: isub           
        //  1221: istore          42
        //  1223: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt_9:()I
        //  1226: fload           4
        //  1228: ldc_w           255.0
        //  1231: fmul           
        //  1232: f2i            
        //  1233: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int_1:(II)I
        //  1236: ldc             -16777216
        //  1238: ior            
        //  1239: istore          43
        //  1241: aload_1        
        //  1242: aload_0        
        //  1243: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.class310:Lnet/minecraft/class_310;
        //  1246: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //  1249: aload           40
        //  1251: iload           41
        //  1253: iload           42
        //  1255: iload           43
        //  1257: iconst_0       
        //  1258: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  1261: aload           5
        //  1263: ifnull          2289
        //  1266: iconst_0       
        //  1267: goto            1274
        //  1270: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1273: athrow         
        //  1274: istore          39
        //  1276: iload           39
        //  1278: aload           32
        //  1280: invokeinterface java/util/List.size:()I
        //  1285: if_icmpge       2289
        //  1288: iload           37
        //  1290: bipush          14
        //  1292: iadd           
        //  1293: iload           33
        //  1295: aload           5
        //  1297: ifnonnull       2314
        //  1300: aload           5
        //  1302: ifnonnull       1336
        //  1305: goto            1312
        //  1308: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1311: athrow         
        //  1312: if_icmplt       1339
        //  1315: goto            1322
        //  1318: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1321: athrow         
        //  1322: iload           37
        //  1324: iload           33
        //  1326: iload           36
        //  1328: iadd           
        //  1329: goto            1336
        //  1332: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1335: athrow         
        //  1336: if_icmple       1354
        //  1339: iinc            37, 18
        //  1342: aload           5
        //  1344: ifnull          2281
        //  1347: goto            1354
        //  1350: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1353: athrow         
        //  1354: aload           32
        //  1356: iload           39
        //  1358: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1363: checkcast       Ljava/lang/String;
        //  1366: astore          40
        //  1368: aload           40
        //  1370: aload           5
        //  1372: ifnonnull       1387
        //  1375: ifnull          1390
        //  1378: goto            1385
        //  1381: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1384: athrow         
        //  1385: aload           40
        //  1387: goto            1392
        //  1390: ldc             ""
        //  1392: astore          41
        //  1394: aload_0        
        //  1395: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.dataP:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5;
        //  1398: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5.getList:()Ljava/util/List;
        //  1401: aload           40
        //  1403: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
        //  1408: istore          42
        //  1410: aload_0        
        //  1411: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_13:I
        //  1414: iload           42
        //  1416: aload           5
        //  1418: ifnonnull       1484
        //  1421: if_icmpne       1479
        //  1424: goto            1431
        //  1427: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1430: athrow         
        //  1431: aload_0        
        //  1432: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //  1435: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.getString_1:()Ljava/lang/String;
        //  1438: astore          43
        //  1440: aload_0        
        //  1441: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //  1444: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.getInt_2:()I
        //  1447: istore          44
        //  1449: aload           43
        //  1451: iconst_0       
        //  1452: iload           44
        //  1454: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1457: astore          45
        //  1459: aload           43
        //  1461: iload           44
        //  1463: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  1466: astore          46
        //  1468: aload           45
        //  1470: aload           46
        //  1472: invokedynamic   BootstrapMethod #2, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1477: astore          41
        //  1479: aload_0        
        //  1480: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //  1483: iconst_4       
        //  1484: iadd           
        //  1485: istore          43
        //  1487: bipush          113
        //  1489: istore          44
        //  1491: iload           37
        //  1493: istore          45
        //  1495: iload_2        
        //  1496: i2d            
        //  1497: iload_3        
        //  1498: i2d            
        //  1499: iload           43
        //  1501: iload           45
        //  1503: iload           44
        //  1505: bipush          14
        //  1507: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_1.checkCondition:(DDIIII)Z
        //  1510: istore          46
        //  1512: aload_0        
        //  1513: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_13:I
        //  1516: aload           5
        //  1518: ifnonnull       1541
        //  1521: iload           42
        //  1523: if_icmpne       1544
        //  1526: goto            1533
        //  1529: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1532: athrow         
        //  1533: iconst_1       
        //  1534: goto            1541
        //  1537: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1540: athrow         
        //  1541: goto            1545
        //  1544: iconst_0       
        //  1545: istore          47
        //  1547: iload           47
        //  1549: aload           5
        //  1551: ifnonnull       1607
        //  1554: ifne            1588
        //  1557: goto            1564
        //  1560: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1563: athrow         
        //  1564: iload           46
        //  1566: aload           5
        //  1568: ifnonnull       1613
        //  1571: goto            1578
        //  1574: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1577: athrow         
        //  1578: ifeq            1610
        //  1581: goto            1588
        //  1584: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1587: athrow         
        //  1588: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt_7:()I
        //  1591: fload           4
        //  1593: ldc_w           0.2
        //  1596: fmul           
        //  1597: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //  1600: goto            1607
        //  1603: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1606: athrow         
        //  1607: goto            1622
        //  1610: ldc_w           -13421773
        //  1613: fload           4
        //  1615: ldc_w           0.2
        //  1618: fmul           
        //  1619: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //  1622: istore          48
        //  1624: aload_1        
        //  1625: iload           43
        //  1627: iload           45
        //  1629: iload           44
        //  1631: bipush          14
        //  1633: iconst_4       
        //  1634: iload           48
        //  1636: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //  1639: bipush          8
        //  1641: istore          49
        //  1643: iload           43
        //  1645: iconst_4       
        //  1646: iadd           
        //  1647: istore          50
        //  1649: iload           45
        //  1651: iconst_3       
        //  1652: iadd           
        //  1653: istore          51
        //  1655: iconst_0       
        //  1656: istore          52
        //  1658: aload           40
        //  1660: aload           5
        //  1662: ifnonnull       1687
        //  1665: ifnull          1852
        //  1668: goto            1675
        //  1671: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1674: athrow         
        //  1675: aload           40
        //  1677: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1680: goto            1687
        //  1683: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1686: athrow         
        //  1687: invokevirtual   java/lang/String.isEmpty:()Z
        //  1690: aload           5
        //  1692: ifnonnull       1854
        //  1695: ifne            1852
        //  1698: goto            1705
        //  1701: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1704: athrow         
        //  1705: aload           40
        //  1707: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1710: astore          53
        //  1712: aload           53
        //  1714: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //  1717: astore          54
        //  1719: aload_0        
        //  1720: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.map:Ljava/util/Map;
        //  1723: aload           54
        //  1725: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1730: checkcast       Lnet/minecraft/class_2960;
        //  1733: astore          55
        //  1735: aload           55
        //  1737: aload           5
        //  1739: ifnonnull       1826
        //  1742: ifnonnull       1824
        //  1745: goto            1752
        //  1748: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1751: athrow         
        //  1752: aload_0        
        //  1753: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.map_1:Ljava/util/Map;
        //  1756: aload           54
        //  1758: iconst_0       
        //  1759: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1762: invokeinterface java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1767: checkcast       Ljava/lang/Boolean;
        //  1770: aload           5
        //  1772: ifnonnull       1817
        //  1775: goto            1782
        //  1778: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1781: athrow         
        //  1782: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1785: ifne            1824
        //  1788: goto            1795
        //  1791: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1794: athrow         
        //  1795: aload_0        
        //  1796: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.map_1:Ljava/util/Map;
        //  1799: aload           54
        //  1801: iconst_1       
        //  1802: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1805: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1810: goto            1817
        //  1813: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1816: athrow         
        //  1817: pop            
        //  1818: aload_0        
        //  1819: aload           53
        //  1821: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.setString:(Ljava/lang/String;)V
        //  1824: aload           55
        //  1826: ifnull          1847
        //  1829: aload_1        
        //  1830: aload           55
        //  1832: iload           50
        //  1834: iload           51
        //  1836: iload           49
        //  1838: iload           49
        //  1840: iconst_2       
        //  1841: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_8:(Lnet/minecraft/class_332;Lnet/minecraft/class_2960;IIIII)V
        //  1844: iconst_1       
        //  1845: istore          52
        //  1847: goto            1852
        //  1850: astore          53
        //  1852: iload           52
        //  1854: aload           5
        //  1856: ifnonnull       1905
        //  1859: ifne            1898
        //  1862: goto            1869
        //  1865: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1868: athrow         
        //  1869: ldc_w           -10066330
        //  1872: fload           4
        //  1874: ldc_w           0.2
        //  1877: fmul           
        //  1878: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //  1881: istore          53
        //  1883: aload_1        
        //  1884: iload           50
        //  1886: iload           51
        //  1888: iload           49
        //  1890: iload           49
        //  1892: iconst_2       
        //  1893: iload           53
        //  1895: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //  1898: iload           50
        //  1900: iload           49
        //  1902: iadd           
        //  1903: iconst_3       
        //  1904: iadd           
        //  1905: istore          53
        //  1907: iload           45
        //  1909: iconst_3       
        //  1910: iadd           
        //  1911: istore          54
        //  1913: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt_8:()I
        //  1916: fload           4
        //  1918: ldc_w           255.0
        //  1921: fmul           
        //  1922: f2i            
        //  1923: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int_1:(II)I
        //  1926: ldc             -16777216
        //  1928: ior            
        //  1929: istore          55
        //  1931: iload           44
        //  1933: iload           49
        //  1935: isub           
        //  1936: iconst_3       
        //  1937: isub           
        //  1938: bipush          22
        //  1940: isub           
        //  1941: istore          56
        //  1943: aload           41
        //  1945: aload           5
        //  1947: ifnonnull       1994
        //  1950: invokevirtual   java/lang/String.length:()I
        //  1953: bipush          20
        //  1955: if_icmple       1997
        //  1958: goto            1965
        //  1961: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1964: athrow         
        //  1965: aload           41
        //  1967: iconst_0       
        //  1968: bipush          17
        //  1970: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1973: sipush          -25002
        //  1976: sipush          23915
        //  1979: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.createString:(II)Ljava/lang/String;
        //  1982: invokedynamic   BootstrapMethod #3, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1987: goto            1994
        //  1990: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1993: athrow         
        //  1994: goto            1999
        //  1997: aload           41
        //  1999: astore          57
        //  2001: aload_0        
        //  2002: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.class310:Lnet/minecraft/class_310;
        //  2005: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //  2008: aload           57
        //  2010: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  2013: aload           5
        //  2015: ifnonnull       2102
        //  2018: iload           56
        //  2020: if_icmple       2080
        //  2023: goto            2030
        //  2026: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2029: athrow         
        //  2030: aload_0        
        //  2031: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.class310:Lnet/minecraft/class_310;
        //  2034: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //  2037: aload           57
        //  2039: iload           56
        //  2041: aload_0        
        //  2042: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.class310:Lnet/minecraft/class_310;
        //  2045: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //  2048: sipush          -25002
        //  2051: sipush          23915
        //  2054: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.createString:(II)Ljava/lang/String;
        //  2057: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  2060: isub           
        //  2061: invokevirtual   net/minecraft/class_327.method_27523:(Ljava/lang/String;I)Ljava/lang/String;
        //  2064: sipush          -25002
        //  2067: sipush          23915
        //  2070: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.createString:(II)Ljava/lang/String;
        //  2073: invokedynamic   BootstrapMethod #3, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2078: astore          57
        //  2080: aload_1        
        //  2081: aload_0        
        //  2082: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.class310:Lnet/minecraft/class_310;
        //  2085: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //  2088: aload           57
        //  2090: iload           53
        //  2092: iload           54
        //  2094: iload           55
        //  2096: iconst_0       
        //  2097: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  2100: bipush          20
        //  2102: istore          58
        //  2104: bipush          12
        //  2106: istore          59
        //  2108: iload           43
        //  2110: iload           44
        //  2112: iadd           
        //  2113: iload           58
        //  2115: isub           
        //  2116: iconst_2       
        //  2117: isub           
        //  2118: istore          60
        //  2120: iload           45
        //  2122: iconst_1       
        //  2123: iadd           
        //  2124: istore          61
        //  2126: iload_2        
        //  2127: i2d            
        //  2128: iload_3        
        //  2129: i2d            
        //  2130: iload           60
        //  2132: iload           61
        //  2134: iload           58
        //  2136: iload           59
        //  2138: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_1.checkCondition:(DDIIII)Z
        //  2141: istore          62
        //  2143: iload           62
        //  2145: aload           5
        //  2147: ifnonnull       2181
        //  2150: ifeq            2178
        //  2153: goto            2160
        //  2156: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2159: athrow         
        //  2160: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt:()I
        //  2163: fload           4
        //  2165: ldc             0.8
        //  2167: fmul           
        //  2168: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //  2171: goto            2190
        //  2174: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2177: athrow         
        //  2178: ldc_w           -13421773
        //  2181: fload           4
        //  2183: ldc_w           0.2
        //  2186: fmul           
        //  2187: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //  2190: istore          63
        //  2192: aload_1        
        //  2193: iload           60
        //  2195: iload           61
        //  2197: iload           58
        //  2199: iload           59
        //  2201: iconst_2       
        //  2202: iload           63
        //  2204: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //  2207: iconst_m1      
        //  2208: fload           4
        //  2210: ldc_w           255.0
        //  2213: fmul           
        //  2214: f2i            
        //  2215: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int_1:(II)I
        //  2218: ldc             -16777216
        //  2220: ior            
        //  2221: istore          64
        //  2223: ldc_w           "\u00d7"
        //  2226: astore          65
        //  2228: iload           60
        //  2230: iload           58
        //  2232: aload_0        
        //  2233: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.class310:Lnet/minecraft/class_310;
        //  2236: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //  2239: aload           65
        //  2241: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  2244: isub           
        //  2245: iconst_2       
        //  2246: idiv           
        //  2247: iadd           
        //  2248: istore          66
        //  2250: aload_1        
        //  2251: aload_0        
        //  2252: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.class310:Lnet/minecraft/class_310;
        //  2255: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //  2258: aload           65
        //  2260: iload           66
        //  2262: iload           61
        //  2264: iload           59
        //  2266: bipush          8
        //  2268: isub           
        //  2269: iconst_2       
        //  2270: idiv           
        //  2271: iadd           
        //  2272: iload           64
        //  2274: iconst_0       
        //  2275: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  2278: iinc            37, 18
        //  2281: iinc            39, 1
        //  2284: aload           5
        //  2286: ifnull          1276
        //  2289: aload_1        
        //  2290: invokevirtual   net/minecraft/class_332.method_44380:()V
        //  2293: aload_0        
        //  2294: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_10:I
        //  2297: aload_0        
        //  2298: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_11:I
        //  2301: iadd           
        //  2302: bipush          14
        //  2304: isub           
        //  2305: iconst_4       
        //  2306: isub           
        //  2307: istore          39
        //  2309: aload_0        
        //  2310: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //  2313: iconst_4       
        //  2314: iadd           
        //  2315: istore          40
        //  2317: bipush          117
        //  2319: istore          41
        //  2321: iload_2        
        //  2322: i2d            
        //  2323: iload_3        
        //  2324: i2d            
        //  2325: iload           40
        //  2327: iload           39
        //  2329: iload           41
        //  2331: bipush          14
        //  2333: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_1.checkCondition:(DDIIII)Z
        //  2336: istore          42
        //  2338: iload           42
        //  2340: aload           5
        //  2342: ifnonnull       2376
        //  2345: ifeq            2373
        //  2348: goto            2355
        //  2351: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2354: athrow         
        //  2355: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt:()I
        //  2358: fload           4
        //  2360: ldc             0.8
        //  2362: fmul           
        //  2363: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //  2366: goto            2385
        //  2369: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2372: athrow         
        //  2373: ldc_w           -11184811
        //  2376: fload           4
        //  2378: ldc_w           0.3
        //  2381: fmul           
        //  2382: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //  2385: istore          43
        //  2387: aload_1        
        //  2388: iload           40
        //  2390: iload           39
        //  2392: iload           41
        //  2394: bipush          14
        //  2396: iconst_3       
        //  2397: iload           43
        //  2399: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //  2402: aload_0        
        //  2403: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.boolFlag:Z
        //  2406: aload           5
        //  2408: ifnonnull       2447
        //  2411: ifeq            2510
        //  2414: goto            2421
        //  2417: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2420: athrow         
        //  2421: aload_0        
        //  2422: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //  2425: aload           5
        //  2427: ifnonnull       2461
        //  2430: goto            2437
        //  2433: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2436: athrow         
        //  2437: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.isEnabled_1:()Z
        //  2440: goto            2447
        //  2443: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2446: athrow         
        //  2447: ifeq            2510
        //  2450: aload_0        
        //  2451: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //  2454: goto            2461
        //  2457: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2460: athrow         
        //  2461: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.getString_1:()Ljava/lang/String;
        //  2464: astore          45
        //  2466: aload_0        
        //  2467: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //  2470: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.getInt_2:()I
        //  2473: istore          46
        //  2475: aload           45
        //  2477: iconst_0       
        //  2478: iload           46
        //  2480: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  2483: astore          47
        //  2485: aload           45
        //  2487: iload           46
        //  2489: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  2492: astore          48
        //  2494: aload           47
        //  2496: aload           48
        //  2498: invokedynamic   BootstrapMethod #2, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2503: astore          44
        //  2505: aload           5
        //  2507: ifnull          2521
        //  2510: sipush          -24995
        //  2513: sipush          -5269
        //  2516: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.createString:(II)Ljava/lang/String;
        //  2519: astore          44
        //  2521: iload           40
        //  2523: iload           41
        //  2525: aload_0        
        //  2526: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.class310:Lnet/minecraft/class_310;
        //  2529: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //  2532: aload           44
        //  2534: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  2537: isub           
        //  2538: iconst_2       
        //  2539: idiv           
        //  2540: iadd           
        //  2541: istore          45
        //  2543: iload           39
        //  2545: iconst_3       
        //  2546: iadd           
        //  2547: istore          46
        //  2549: iconst_m1      
        //  2550: fload           4
        //  2552: ldc_w           255.0
        //  2555: fmul           
        //  2556: f2i            
        //  2557: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int_1:(II)I
        //  2560: ldc             -16777216
        //  2562: ior            
        //  2563: istore          47
        //  2565: aload_1        
        //  2566: aload_0        
        //  2567: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.class310:Lnet/minecraft/class_310;
        //  2570: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //  2573: aload           44
        //  2575: iload           45
        //  2577: iload           46
        //  2579: iload           47
        //  2581: iconst_0       
        //  2582: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  2585: aload           32
        //  2587: invokeinterface java/util/List.size:()I
        //  2592: aload           5
        //  2594: ifnonnull       2617
        //  2597: iconst_3       
        //  2598: if_icmple       2764
        //  2601: goto            2608
        //  2604: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2607: athrow         
        //  2608: iload           38
        //  2610: goto            2617
        //  2613: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2616: athrow         
        //  2617: aload           5
        //  2619: ifnonnull       2648
        //  2622: ifle            2764
        //  2625: goto            2632
        //  2628: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2631: athrow         
        //  2632: aload_0        
        //  2633: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_9:I
        //  2636: bipush          125
        //  2638: iadd           
        //  2639: iconst_4       
        //  2640: isub           
        //  2641: goto            2648
        //  2644: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2647: athrow         
        //  2648: istore          48
        //  2650: iload           33
        //  2652: istore          49
        //  2654: iconst_2       
        //  2655: istore          50
        //  2657: iload           36
        //  2659: istore          51
        //  2661: ldc_w           -13421773
        //  2664: fload           4
        //  2666: ldc_w           0.3
        //  2669: fmul           
        //  2670: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //  2673: istore          52
        //  2675: aload_1        
        //  2676: iload           48
        //  2678: iload           49
        //  2680: iload           50
        //  2682: iload           51
        //  2684: iconst_1       
        //  2685: iload           52
        //  2687: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //  2690: bipush          10
        //  2692: iload           36
        //  2694: i2d            
        //  2695: aload           32
        //  2697: invokeinterface java/util/List.size:()I
        //  2702: i2d            
        //  2703: ddiv           
        //  2704: ldc2_w          3.0
        //  2707: dmul           
        //  2708: d2i            
        //  2709: invokestatic    java/lang/Math.max:(II)I
        //  2712: istore          53
        //  2714: iload           49
        //  2716: aload_0        
        //  2717: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_3.intValue_12:I
        //  2720: i2d            
        //  2721: iload           38
        //  2723: i2d            
        //  2724: ddiv           
        //  2725: iload           51
        //  2727: iload           53
        //  2729: isub           
        //  2730: i2d            
        //  2731: dmul           
        //  2732: d2i            
        //  2733: iadd           
        //  2734: istore          54
        //  2736: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.getInt:()I
        //  2739: fload           4
        //  2741: ldc             0.8
        //  2743: fmul           
        //  2744: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //  2747: istore          55
        //  2749: aload_1        
        //  2750: iload           48
        //  2752: iload           54
        //  2754: iload           50
        //  2756: iload           53
        //  2758: iconst_1       
        //  2759: iload           55
        //  2761: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //  2764: return         
        //    StackMapTable: 00 B9 FF 00 14 00 06 07 00 02 07 00 D8 01 01 02 07 00 8E 00 01 07 00 D1 03 40 07 00 D1 03 44 07 00 02 FF 00 70 00 0D 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 00 01 07 00 D1 03 60 07 00 D1 03 41 01 46 07 00 D1 03 42 02 FF 00 AE 00 15 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 00 01 07 00 D1 03 4D 07 00 D1 03 40 01 43 01 FF 00 0E 00 16 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 00 01 07 00 D1 03 52 07 00 D1 03 4D 01 FF 00 52 00 1B 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 00 01 07 00 D1 03 49 07 00 D1 43 01 45 07 00 D1 03 4E 07 00 D1 43 01 02 42 01 48 01 FF 00 1F 00 1C 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 00 01 07 00 D1 03 46 07 00 D1 43 07 00 94 20 48 07 00 8E FF 00 1C 00 1E 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 00 01 07 00 D1 03 2B 49 07 00 D1 43 07 00 8E 45 07 00 D1 43 01 0B 44 07 00 D1 43 07 00 8E FC 00 01 07 00 8E 54 07 00 D1 03 42 01 02 42 01 FF 00 97 00 27 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 00 01 07 00 D1 03 48 07 00 D1 03 46 01 4A 07 00 D1 03 4B 07 00 D1 43 07 00 94 45 07 00 D1 03 46 07 00 D1 43 07 00 94 08 48 07 00 8E FF 00 16 00 28 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 07 00 8E 00 01 07 00 D1 03 5C 07 00 D1 03 41 07 00 8E 57 07 00 8E FA 00 4F 43 07 00 D1 43 01 FC 00 01 01 5F 07 00 D1 FF 00 03 00 28 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 00 02 01 01 45 07 00 D1 03 49 07 00 D1 FF 00 03 00 28 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 00 02 01 01 02 4A 07 00 D1 03 FF 00 1A 00 29 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 07 00 8E 00 01 07 00 D1 03 41 07 00 8E 02 41 07 00 8E FF 00 22 00 2B 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 07 00 8E 07 00 8E 01 00 01 07 00 D1 03 2F FF 00 04 00 2B 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 07 00 8E 07 00 8E 01 00 02 01 01 FF 00 2C 00 2F 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 07 00 8E 07 00 8E 01 01 01 01 01 00 01 07 00 D1 03 43 07 00 D1 43 01 02 40 01 FF 00 0E 00 30 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 07 00 8E 07 00 8E 01 01 01 01 01 01 00 01 07 00 D1 03 49 07 00 D1 43 01 45 07 00 D1 03 4E 07 00 D1 43 01 02 42 01 48 01 FF 00 30 00 35 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 07 00 8E 07 00 8E 01 01 01 01 01 01 01 01 01 01 01 00 01 07 00 D1 03 47 07 00 D1 43 07 00 8E 4D 07 00 D1 03 FF 00 2A 00 38 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 07 00 8E 07 00 8E 01 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 01 61 00 01 07 00 D1 03 59 07 00 D1 43 07 01 63 48 07 00 D1 03 51 07 00 D1 43 07 00 04 06 41 07 01 61 14 FF 00 02 00 35 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 07 00 8E 07 00 8E 01 01 01 01 01 01 01 01 01 01 01 00 01 07 00 D1 01 41 01 4A 07 00 D1 03 1C 46 01 FF 00 37 00 39 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 07 00 8E 07 00 8E 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 00 01 07 00 D1 03 58 07 00 D1 43 07 00 8E 02 41 07 00 8E FF 00 1A 00 3A 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 07 00 8E 07 00 8E 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 07 00 8E 00 01 07 00 D1 03 31 55 01 FF 00 35 00 3F 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 07 00 8E 07 00 8E 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 07 00 8E 01 01 01 01 01 00 01 07 00 D1 03 4D 07 00 D1 03 42 01 48 01 FF 00 5A 00 28 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 00 00 FA 00 07 FF 00 18 00 28 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 00 02 01 01 FF 00 24 00 2B 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 01 01 01 00 01 07 00 D1 03 4D 07 00 D1 03 42 01 48 01 FF 00 1F 00 2C 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 01 01 01 01 00 01 07 00 D1 03 4B 07 00 D1 43 07 00 4F 45 07 00 D1 43 01 49 07 00 D1 43 07 00 4F 30 FC 00 0A 07 00 8E FF 00 52 00 30 07 00 02 07 00 D8 01 01 02 07 00 8E 07 00 FC 01 01 01 01 01 01 02 01 01 01 07 00 8E 01 01 01 01 01 01 01 01 01 01 07 00 8E 07 00 8E 07 00 8E 01 07 00 75 01 01 01 01 01 01 01 01 01 01 01 07 00 8E 01 01 01 00 01 07 00 D1 03 44 07 00 D1 43 01 4A 07 00 D1 03 4B 07 00 D1 43 01 FB 00 73
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  1782   1810   1813   1817   Ljava/lang/Exception;
        //  1752   1788   1791   1795   Ljava/lang/Exception;
        //  1742   1775   1778   1782   Ljava/lang/Exception;
        //  1735   1745   1748   1752   Ljava/lang/Exception;
        //  1687   1698   1701   1705   Ljava/lang/Exception;
        //  1665   1680   1683   1687   Ljava/lang/Exception;
        //  1658   1668   1671   1675   Ljava/lang/Exception;
        //  1578   1600   1603   1607   Ljava/lang/Exception;
        //  1564   1581   1584   1588   Ljava/lang/Exception;
        //  1554   1571   1574   1578   Ljava/lang/Exception;
        //  1547   1557   1560   1564   Ljava/lang/Exception;
        //  1521   1534   1537   1541   Ljava/lang/Exception;
        //  1512   1526   1529   1533   Ljava/lang/Exception;
        //  1410   1424   1427   1431   Ljava/lang/Exception;
        //  1368   1378   1381   1385   Ljava/lang/Exception;
        //  1336   1347   1350   1354   Ljava/lang/Exception;
        //  1312   1329   1332   1336   Ljava/lang/Exception;
        //  1300   1315   1318   1322   Ljava/lang/Exception;
        //  1288   1305   1308   1312   Ljava/lang/Exception;
        //  1241   1267   1270   1274   Ljava/lang/Exception;
        //  1114   1156   1156   1160   Ljava/lang/Exception;
        //  1102   1120   1123   1127   Ljava/lang/Exception;
        //  1061   1075   1078   1082   Ljava/lang/Exception;
        //  1045   1064   1067   1071   Ljava/lang/Exception;
        //  1035   1054   1057   1061   Ljava/lang/Exception;
        //  1030   1038   1041   1045   Ljava/lang/Exception;
        //  998    1016   1019   1023   Ljava/lang/Exception;
        //  989    1003   1006   1010   Ljava/lang/Exception;
        //  820    838    841    845    Ljava/lang/Exception;
        //  804    811    814    818    Ljava/lang/Exception;
        //  773    790    793    797    Ljava/lang/Exception;
        //  768    780    783    787    Ljava/lang/Exception;
        //  707    722    725    729    Ljava/lang/Exception;
        //  633    647    650    654    Ljava/lang/Exception;
        //  609    636    639    643    Ljava/lang/Exception;
        //  563    585    588    592    Ljava/lang/Exception;
        //  549    566    569    573    Ljava/lang/Exception;
        //  539    556    559    563    Ljava/lang/Exception;
        //  527    542    545    549    Ljava/lang/Exception;
        //  415    441    444    448    Ljava/lang/Exception;
        //  408    418    421    425    Ljava/lang/Exception;
        //  373    397    397    401    Ljava/lang/Exception;
        //  366    376    379    383    Ljava/lang/Exception;
        //  190    197    197    201    Ljava/lang/Exception;
        //  141    181    184    188    Ljava/lang/Exception;
        //  134    144    147    151    Ljava/lang/Exception;
        //  11     25     25     29     Ljava/lang/Exception;
        //  5      17     20     24     Ljava/lang/Exception;
        //  1705   1847   1850   1852   Ljava/lang/Exception;
        //  1854   1862   1865   1869   Ljava/lang/Exception;
        //  1943   1958   1961   1965   Ljava/lang/Exception;
        //  1950   1987   1990   1994   Ljava/lang/Exception;
        //  2001   2023   2026   2030   Ljava/lang/Exception;
        //  2143   2153   2156   2160   Ljava/lang/Exception;
        //  2150   2174   2174   2178   Ljava/lang/Exception;
        //  2338   2348   2351   2355   Ljava/lang/Exception;
        //  2345   2369   2369   2373   Ljava/lang/Exception;
        //  2387   2414   2417   2421   Ljava/lang/Exception;
        //  2411   2430   2433   2437   Ljava/lang/Exception;
        //  2421   2440   2443   2447   Ljava/lang/Exception;
        //  2447   2454   2457   2461   Ljava/lang/Exception;
        //  2565   2601   2604   2608   Ljava/lang/Exception;
        //  2597   2610   2613   2617   Ljava/lang/Exception;
        //  2617   2625   2628   2632   Ljava/lang/Exception;
        //  2622   2641   2644   2648   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0549:
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
    
    public boolean checkCondition(final double n, final double n2, final int n3) {
        if (this.dataP == null) {
            return false;
        }
        if (Initializer_1.checkCondition(n, n2, this.intValue_9 + 125 - 9 - 2, this.intValue_10 + 5, 7, 5)) {
            this.dataP = null;
            this.intValue_13 = -1;
            this.slotJ.setString_2("");
            this.slotJ.execute();
            this.boolFlag = false;
            this.slotJ_1.setString_2("");
            this.slotJ_1.execute();
            return true;
        }
        if (n3 == 0 && Initializer_1.checkCondition(n, n2, this.intValue_9, this.intValue_10, 116, 15)) {
            this.parseD.processAll(n, n2, this.intValue_9, this.intValue_10);
            return true;
        }
        final int n4 = this.intValue_10 + 15 + 4;
        final int n5 = this.intValue_9 + 4;
        final int n6 = 117;
        if (Initializer_1.checkCondition(n, n2, n5, n4, n6, 11)) {
            this.slotJ_1.setString(this.slotJ_1.getString_1());
            this.boolFlag = false;
            this.intValue_13 = -1;
            return true;
        }
        final List<String> list = this.getList();
        final int n7 = n4 + 11 + 4;
        final int min = Math.min(this.intValue_11 - 15 - 11 - 14 - 16, 54);
        final int n8 = n7 - this.intValue_12;
        for (int i = 0; i < list.size(); ++i) {
            final int n9 = n8 + i * 18;
            if (n9 + 14 >= n7) {
                if (n9 <= n7 + min) {
                    final String s = list.get(i);
                    final int index = this.dataP.getList().indexOf(s);
                    final int n10 = this.intValue_9 + 4;
                    final int n11 = 113;
                    final int n12 = 20;
                    if (Initializer_1.checkCondition(n, n2, n10 + n11 - n12 - 2, n9 + 1, n12, 12)) {
                        this.dataP.setInt(index);
                        if (this.intValue_13 == index) {
                            this.intValue_13 = -1;
                            this.slotJ.setString_2("");
                            this.slotJ.execute();
                        }
                        else if (this.intValue_13 > index) {
                            --this.intValue_13;
                        }
                        this.execute();
                        return true;
                    }
                    final int n13 = 11;
                    if (Initializer_1.checkCondition(n, n2, n10 + n13 + 3, n9, n11 - n13 - 3 - n12 - 3, 14)) {
                        this.intValue_13 = index;
                        this.slotJ.setString((s != null) ? s : "");
                        this.boolFlag = false;
                        this.slotJ_1.execute();
                        return true;
                    }
                }
            }
        }
        if (Initializer_1.checkCondition(n, n2, this.intValue_9 + 4, this.intValue_10 + this.intValue_11 - 14 - 4, 117, 14)) {
            if (this.boolFlag) {
                final String trim = this.slotJ.getString_1().trim();
                if (!trim.isEmpty()) {
                    this.dataP.setString(trim);
                    this.execute();
                }
                this.boolFlag = false;
                this.slotJ.setString_2("");
                this.slotJ.execute();
            }
            else {
                this.boolFlag = true;
                this.intValue_13 = -1;
                this.slotJ.setString_2("");
                this.slotJ.setString("");
                this.slotJ_1.execute();
            }
            return true;
        }
        if (this.slotJ_1.isEnabled_1() && !Initializer_1.checkCondition(n, n2, n5, n4, n6, 11)) {
            this.slotJ_1.execute();
        }
        return Initializer_1.checkCondition(n, n2, this.intValue_9, this.intValue_10, 125, this.intValue_11);
    }
    
    public boolean checkCondition_1(final double n, final double n2, final double n3, final double n4) {
        if (this.dataP == null) {
            return false;
        }
        final int n5 = this.intValue_10 + 15 + 4 + 11 + 4;
        final int min = Math.min(this.intValue_11 - 15 - 11 - 14 - 16, 54);
        if (!Initializer_1.checkCondition(n, n2, this.intValue_9, n5, 125, min)) {
            return false;
        }
        final int max = Math.max(0, this.getList().size() * 18 - min);
        this.intValue_12 -= (int)(n4 * 15.0);
        if (this.intValue_12 < 0) {
            this.intValue_12 = 0;
        }
        if (this.intValue_12 > max) {
            this.intValue_12 = max;
        }
        return true;
    }
    
    public boolean checkCondition_2(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (this.dataP == null) {
            return false;
        }
        if (this.parseD.isEnabled()) {
            this.parseD.createIntarr(n, n2);
            return true;
        }
        return false;
    }
    
    public boolean checkCondition_5(final double n, final double n2, final int n3) {
        if (n3 == 0) {
            this.parseD.execute();
        }
        return false;
    }
    
    public boolean checkCondition_3(final int n, final int n2, final int n3) {
        if (this.dataP == null) {
            return false;
        }
        if (this.slotJ_1.isEnabled_1()) {
            if (this.slotJ_1.checkCondition(n, n2, n3)) {
                if (n == 256) {
                    this.slotJ_1.setString_2("");
                }
                return true;
            }
            return false;
        }
        else {
            if (this.intValue_13 == -1 && !this.boolFlag) {
                return false;
            }
            if (!this.slotJ.isEnabled_1()) {
                return false;
            }
            if (this.slotJ.checkCondition(n, n2, n3)) {
                if (n == 256) {
                    this.intValue_13 = -1;
                    this.boolFlag = false;
                    this.slotJ.execute_1();
                }
                else if (n == 257) {
                    final String trim = this.slotJ.getString_1().trim();
                    if (this.boolFlag) {
                        if (!trim.isEmpty()) {
                            this.dataP.setString(trim);
                            this.execute();
                        }
                        this.boolFlag = false;
                        this.slotJ.execute();
                    }
                    else if (this.intValue_13 >= 0) {
                        if (this.intValue_13 < this.dataP.getInt()) {
                            if (!trim.isEmpty()) {
                                this.dataP.setIntAndString(this.intValue_13, trim);
                            }
                            else {
                                this.dataP.setInt(this.intValue_13);
                                this.execute();
                            }
                        }
                        this.intValue_13 = -1;
                        this.slotJ.execute();
                    }
                }
                return true;
            }
            return false;
        }
    }
    
    public boolean checkCondition_4(final char c, final int n) {
        if (this.dataP == null) {
            return false;
        }
        if (!this.slotJ_1.isEnabled_1()) {
            return (this.intValue_13 != -1 || this.boolFlag) && this.slotJ.isEnabled_1() && this.slotJ.checkCondition_1(c, n);
        }
        if (this.slotJ_1.checkCondition_1(c, n)) {
            this.intValue_12 = 0;
            return true;
        }
        return false;
    }
    
    public boolean isEnabled() {
        return this.dataP != null;
    }
    
    private void setString(final String s) {
        if (s == null || s.trim().isEmpty()) {
            return;
        }
        CompletableFuture.runAsync(this::lambda$fetchHeadFromVZGE$3);
    }
    
    private void lambda$fetchHeadFromVZGE$3(final String s) {
        try {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(createString(-25019, -20688) + s + createString(-25008, -7603)).openConnection();
            httpURLConnection.setRequestMethod(createString(-24997, 20));
            httpURLConnection.setRequestProperty(createString(-25006, -31960), createString(-25020, 19680));
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            if (httpURLConnection.getResponseCode() != 200) {
                this.map_1.remove(s.toLowerCase());
                return;
            }
            final InputStream inputStream = httpURLConnection.getInputStream();
            final int n = -24998;
            final class_1011 method_4309 = class_1011.method_4309(inputStream);
            final int n2 = -11802;
            inputStream.close();
            this.class310.execute(this::lambda$fetchHeadFromVZGE$2);
        }
        catch (final Exception ex) {
            this.map_1.remove(s.toLowerCase());
        }
    }
    
    private void lambda$fetchHeadFromVZGE$2(final class_2960 class_2960, final class_1011 class_2961, final String s) {
        try {
            this.class310.method_1531().method_4616(class_2960, (class_1044)new class_1043((Supplier)Initializer_3::lambda$fetchHeadFromVZGE$1, class_2961));
            this.map.put(s.toLowerCase(), class_2960);
        }
        catch (final Exception ex) {}
        finally {
            this.map_1.remove(s.toLowerCase());
        }
    }
    
    private static String lambda$fetchHeadFromVZGE$1() {
        return createString(-25003, -14804);
    }
    
    private static boolean lambda$getFilteredItems$0(final String s, final String s2) {
        return s2 != null && s2.toLowerCase().contains(s);
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    static {
        final String[] strArr2 = new String[18];
        int n = 0;
        String s;
        int n2 = (s = "\u00f0N\u00c1Z¸\u00c5«\u0004¢\u008fLw\t<\u0085\u0086¯°\u000b(\u00f5\u0091\u0003µB*\u000506~\u00f5;\u0007\b\u00e9¦GX\u00c7\r\u000e\u00d4©\u0000\u00c8d\u001eC\u00dbL\u008d)R±\u0092\n\u00e4\u0098_\u00d8A\u00cc\u00d8J¯\u00ad\u0003\u00c0`L\u0006\u00ca¹KL\u00cb\u009c\u0003¨º\u0089\u0003\u00f2\u001b \u0003\u00d1C\u00c4\u00075R§U\u0094T¢\u0003\u00f4\u00df<\u0007\u009d»u¿; \u009f").length();
        int n3 = 7;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 27));
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
                        Label_0264: {
                            if (length > 1) {
                                break Label_0264;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 8;
                                    case 1 -> 13;
                                    case 2 -> 32;
                                    case 3 -> 125;
                                    case 4 -> 50;
                                    case 5 -> 125;
                                    default -> 33;
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
                                continue Label_0024;
                            }
                            n2 = (s = "o\u00f7\u0095\u00e0E\u00c2µ\u00e5pv4\u009b\u00cb¿\u001e\u00f5\u00f8¤¶\u00e8k]\u0005f\u00fa\u000bC\u0090\u009fm\u00d4\u001f5\u00c2¿\u00d5\u00c0").length();
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
                            break Label_0024;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 64)));
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
        strArr_1 = new String[18];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFF9E55) & 0xFFFF;
        if (Initializer_3.strArr_1[n3] == null) {
            final char[] charArray = Initializer_3.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 41;
                case 1 -> 127;
                case 2 -> 72;
                case 3 -> 35;
                case 4 -> 150;
                case 5 -> 89;
                case 6 -> 33;
                case 7 -> 186;
                case 8 -> 254;
                case 9 -> 253;
                case 10 -> 113;
                case 11 -> 154;
                case 12 -> 208;
                case 13 -> 21;
                case 14 -> 29;
                case 15 -> 143;
                case 16 -> 132;
                case 17 -> 212;
                case 18 -> 180;
                case 19 -> 124;
                case 20 -> 91;
                case 21 -> 128;
                case 22 -> 117;
                case 23 -> 53;
                case 24 -> 101;
                case 25 -> 68;
                case 26 -> 188;
                case 27 -> 25;
                case 28 -> 88;
                case 29 -> 28;
                case 30 -> 120;
                case 31 -> 210;
                case 32 -> 0;
                case 33 -> 60;
                case 34 -> 106;
                case 35 -> 8;
                case 36 -> 107;
                case 37 -> 142;
                case 38 -> 204;
                case 39 -> 225;
                case 40 -> 179;
                case 41 -> 63;
                case 42 -> 252;
                case 43 -> 169;
                case 44 -> 184;
                case 45 -> 156;
                case 46 -> 2;
                case 47 -> 178;
                case 48 -> 157;
                case 49 -> 228;
                case 50 -> 166;
                case 51 -> 185;
                case 52 -> 203;
                case 53 -> 232;
                case 54 -> 37;
                case 55 -> 234;
                case 56 -> 177;
                case 57 -> 137;
                case 58 -> 105;
                case 59 -> 149;
                case 60 -> 119;
                case 61 -> 26;
                case 62 -> 10;
                case 63 -> 250;
                case 64 -> 11;
                case 65 -> 14;
                case 66 -> 103;
                case 67 -> 76;
                case 68 -> 189;
                case 69 -> 144;
                case 70 -> 87;
                case 71 -> 255;
                case 72 -> 239;
                case 73 -> 52;
                case 74 -> 135;
                case 75 -> 74;
                case 76 -> 1;
                case 77 -> 47;
                case 78 -> 199;
                case 79 -> 164;
                case 80 -> 211;
                case 81 -> 173;
                case 82 -> 221;
                case 83 -> 13;
                case 84 -> 31;
                case 85 -> 196;
                case 86 -> 222;
                case 87 -> 38;
                case 88 -> 19;
                case 89 -> 114;
                case 90 -> 86;
                case 91 -> 24;
                case 92 -> 195;
                case 93 -> 58;
                case 94 -> 206;
                case 95 -> 176;
                case 96 -> 104;
                case 97 -> 36;
                case 98 -> 163;
                case 99 -> 140;
                case 100 -> 85;
                case 101 -> 69;
                case 102 -> 153;
                case 103 -> 146;
                case 104 -> 151;
                case 105 -> 215;
                case 106 -> 7;
                case 107 -> 22;
                case 108 -> 220;
                case 109 -> 236;
                case 110 -> 17;
                case 111 -> 240;
                case 112 -> 49;
                case 113 -> 45;
                case 114 -> 155;
                case 115 -> 129;
                case 116 -> 233;
                case 117 -> 9;
                case 118 -> 194;
                case 119 -> 57;
                case 120 -> 141;
                case 121 -> 39;
                case 122 -> 93;
                case 123 -> 237;
                case 124 -> 130;
                case 125 -> 32;
                case 126 -> 224;
                case 127 -> 59;
                case 128 -> 158;
                case 129 -> 216;
                case 130 -> 214;
                case 131 -> 231;
                case 132 -> 112;
                case 133 -> 246;
                case 134 -> 108;
                case 135 -> 145;
                case 136 -> 248;
                case 137 -> 65;
                case 138 -> 50;
                case 139 -> 198;
                case 140 -> 126;
                case 141 -> 172;
                case 142 -> 3;
                case 143 -> 201;
                case 144 -> 51;
                case 145 -> 56;
                case 146 -> 121;
                case 147 -> 245;
                case 148 -> 244;
                case 149 -> 223;
                case 150 -> 20;
                case 151 -> 175;
                case 152 -> 62;
                case 153 -> 81;
                case 154 -> 18;
                case 155 -> 64;
                case 156 -> 6;
                case 157 -> 43;
                case 158 -> 97;
                case 159 -> 109;
                case 160 -> 190;
                case 161 -> 118;
                case 162 -> 80;
                case 163 -> 230;
                case 164 -> 174;
                case 165 -> 226;
                case 166 -> 227;
                case 167 -> 200;
                case 168 -> 98;
                case 169 -> 66;
                case 170 -> 209;
                case 171 -> 77;
                case 172 -> 242;
                case 173 -> 241;
                case 174 -> 125;
                case 175 -> 229;
                case 176 -> 136;
                case 177 -> 46;
                case 178 -> 182;
                case 179 -> 90;
                case 180 -> 181;
                case 181 -> 111;
                case 182 -> 102;
                case 183 -> 110;
                case 184 -> 202;
                case 185 -> 131;
                case 186 -> 152;
                case 187 -> 191;
                case 188 -> 243;
                case 189 -> 34;
                case 190 -> 219;
                case 191 -> 138;
                case 192 -> 71;
                case 193 -> 54;
                case 194 -> 55;
                case 195 -> 70;
                case 196 -> 159;
                case 197 -> 15;
                case 198 -> 42;
                case 199 -> 162;
                case 200 -> 115;
                case 201 -> 67;
                case 202 -> 82;
                case 203 -> 139;
                case 204 -> 73;
                case 205 -> 148;
                case 206 -> 4;
                case 207 -> 48;
                case 208 -> 30;
                case 209 -> 84;
                case 210 -> 75;
                case 211 -> 217;
                case 212 -> 40;
                case 213 -> 193;
                case 214 -> 218;
                case 215 -> 213;
                case 216 -> 23;
                case 217 -> 205;
                case 218 -> 27;
                case 219 -> 235;
                case 220 -> 197;
                case 221 -> 99;
                case 222 -> 100;
                case 223 -> 94;
                case 224 -> 187;
                case 225 -> 192;
                case 226 -> 79;
                case 227 -> 165;
                case 228 -> 147;
                case 229 -> 171;
                case 230 -> 251;
                case 231 -> 116;
                case 232 -> 133;
                case 233 -> 16;
                case 234 -> 12;
                case 235 -> 183;
                case 236 -> 161;
                case 237 -> 170;
                case 238 -> 95;
                case 239 -> 78;
                case 240 -> 5;
                case 241 -> 122;
                case 242 -> 61;
                case 243 -> 160;
                case 244 -> 247;
                case 245 -> 83;
                case 246 -> 168;
                case 247 -> 134;
                case 248 -> 238;
                case 249 -> 123;
                case 250 -> 96;
                case 251 -> 207;
                case 252 -> 167;
                case 253 -> 92;
                case 254 -> 249;
                default -> 44;
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
            Initializer_3.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_3.strArr_1[n3];
    }
}
