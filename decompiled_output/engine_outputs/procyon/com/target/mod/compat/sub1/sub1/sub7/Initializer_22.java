// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import net.minecraft.class_6880;
import net.minecraft.class_1113;
import net.minecraft.class_1109;
import net.minecraft.class_3417;
import java.util.Iterator;
import net.minecraft.class_332;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import java.util.ArrayList;
import net.minecraft.class_310;
import java.util.List;

public class Initializer_22
{
    private static final Initializer_22 sortF;
    private static final int intValue = 250;
    private static final int intValue_1 = 60;
    private static final int intValue_2 = 10;
    private static final int intValue_3 = 8;
    private static final int intValue_4 = 20;
    private static final int intValue_5 = 6;
    private static final long longValue = 200L;
    private final List<Initializer> list;
    private final class_310 class310;
    
    private Initializer_22() {
        this.list = new ArrayList<Initializer>();
        this.class310 = class_310.method_1551();
    }
    
    public static Initializer_22 getSortf() {
        return Initializer_22.sortF;
    }
    
    public void setBinde(final Initializer initializer) {
        if (Initializer_1.class310 == null) {
            return;
        }
        this.execute();
        this.list.add(0, initializer);
        while (this.list.size() > 5) {
            this.list.remove(this.list.size() - 1);
        }
        this.setPackh(initializer.getPackh());
    }
    
    public void processAll(final String s, final String s2, final Initializer_18 initializer_18) {
        this.setBinde(new Initializer(s, s2, initializer_18));
    }
    
    public void setClass_332AndFloat(final class_332 class_332, final float n) {
        if (Initializer_1.class310 == null) {
            return;
        }
        com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.execute();
        final int method_4489 = this.class310.method_22683().method_4489();
        final int method_4490 = this.class310.method_22683().method_4506();
        final int n2 = method_4489 - 250 - 20;
        int n3 = method_4490 - 20;
        this.execute();
        final long currentTimeMillis = System.currentTimeMillis();
        final Iterator<Initializer> iterator = this.list.iterator();
        while (iterator.hasNext()) {
            final Initializer initializer = iterator.next();
            final long n4 = currentTimeMillis - initializer.getLong();
            if (n4 < 200L) {
                initializer.setFloat(this.method_float(n4 / 200.0f));
            }
            else if (initializer.isEnabled()) {
                final float n5 = (n4 - initializer.getLong_1()) / 200.0f;
                if (n5 >= 1.0f) {
                    iterator.remove();
                    continue;
                }
                initializer.setFloat(1.0f - this.method_float_1(n5));
            }
            else {
                initializer.setFloat(1.0f);
            }
            this.processAll_1(class_332, initializer, n2, n3 - 60, n);
            n3 -= 68;
        }
        com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.execute_1();
    }
    
    private void processAll_1(final class_332 p0, final Initializer p1, final int p2, final int p3, final float p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_2        
        //     4: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer.getFloat_1:()F
        //     7: fstore          7
        //     9: istore          6
        //    11: iload_3        
        //    12: i2f            
        //    13: ldc             250.0
        //    15: fconst_1       
        //    16: fload           7
        //    18: fsub           
        //    19: fmul           
        //    20: fadd           
        //    21: f2i            
        //    22: istore          8
        //    24: invokestatic    com/target/mod/compat/sub1/sub1/sub6/Initializer.getUtili:()Lcom/target/mod/compat/sub1/sub1/sub6/Interface;
        //    27: astore          9
        //    29: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_1.getSyncf:()Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //    32: ldc             ldc            !!! ERROR
        //    34: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.computeCalcg_1:(Ljava/lang/Class;)Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;
        //    37: checkcast       checkcast      !!! ERROR
        //    40: astore          10
        //    42: aload           10
        //    44: iload           6
        //    46: ifeq            60
        //    49: ifnull          69
        //    52: aload           10
        //    54: getfield        getfield       !!! ERROR
        //    57: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub.getValue:()Ljava/lang/Object;
        //    60: checkcast       Ljava/lang/Double;
        //    63: invokevirtual   java/lang/Double.intValue:()I
        //    66: goto            71
        //    69: bipush          80
        //    71: istore          11
        //    73: aload           9
        //    75: iload           11
        //    77: invokeinterface com/target/mod/compat/sub1/sub1/sub6/Interface.method_int:(I)I
        //    82: istore          12
        //    84: aload           9
        //    86: invokeinterface com/target/mod/compat/sub1/sub1/sub6/Interface.getInt:()I
        //    91: istore          13
        //    93: aload           9
        //    95: invokeinterface com/target/mod/compat/sub1/sub1/sub6/Interface.getInt_1:()I
        //   100: istore          14
        //   102: aload           9
        //   104: aload           10
        //   106: invokeinterface com/target/mod/compat/sub1/sub1/sub6/Interface.method_int_1:(invokeinterface!!! ERROR
        //   111: istore          15
        //   113: aload_2        
        //   114: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer.getInt:()I
        //   117: istore          16
        //   119: iload           16
        //   121: fconst_1       
        //   122: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //   125: istore          17
        //   127: aload           9
        //   129: bipush          6
        //   131: invokeinterface com/target/mod/compat/sub1/sub1/sub6/Interface.method_int_6:(I)I
        //   136: istore          18
        //   138: aload           9
        //   140: invokeinterface com/target/mod/compat/sub1/sub1/sub6/Interface.isEnabled:()Z
        //   145: istore          19
        //   147: aload           9
        //   149: invokeinterface com/target/mod/compat/sub1/sub1/sub6/Interface.isEnabled_1:()Z
        //   154: istore          20
        //   156: iload           19
        //   158: iload           6
        //   160: ifeq            218
        //   163: ifeq            193
        //   166: aload_1        
        //   167: iload           8
        //   169: iconst_1       
        //   170: iadd           
        //   171: iload           4
        //   173: iconst_1       
        //   174: iadd           
        //   175: sipush          250
        //   178: bipush          60
        //   180: iload           18
        //   182: iload           18
        //   184: iload           18
        //   186: iload           18
        //   188: iload           13
        //   190: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_6:(Lnet/minecraft/class_332;IIIIIIIII)V
        //   193: aload_1        
        //   194: iload           8
        //   196: iload           4
        //   198: sipush          250
        //   201: bipush          60
        //   203: iload           18
        //   205: iload           18
        //   207: iload           18
        //   209: iload           18
        //   211: iload           12
        //   213: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_6:(Lnet/minecraft/class_332;IIIIIIIII)V
        //   216: iload           20
        //   218: iload           6
        //   220: ifeq            244
        //   223: ifeq            243
        //   226: aload_1        
        //   227: iload           8
        //   229: iload           4
        //   231: sipush          250
        //   234: bipush          60
        //   236: iload           18
        //   238: iload           14
        //   240: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_30:(Lnet/minecraft/class_332;IIIIII)V
        //   243: iconst_0       
        //   244: istore          21
        //   246: iload           8
        //   248: bipush          10
        //   250: iadd           
        //   251: istore          22
        //   253: iload           4
        //   255: bipush          10
        //   257: iadd           
        //   258: iconst_2       
        //   259: iadd           
        //   260: istore          23
        //   262: iload           4
        //   264: bipush          10
        //   266: iadd           
        //   267: bipush          18
        //   269: iadd           
        //   270: istore          24
        //   272: aload_1        
        //   273: aload_0        
        //   274: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_22.class310:Lnet/minecraft/class_310;
        //   277: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   280: aload_2        
        //   281: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer.getString:()Ljava/lang/String;
        //   284: iload           22
        //   286: iload           23
        //   288: iload           17
        //   290: iconst_0       
        //   291: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //   294: aload_2        
        //   295: iload           6
        //   297: ifeq            344
        //   300: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer.getString_1:()Ljava/lang/String;
        //   303: ifnull          343
        //   306: aload_2        
        //   307: iload           6
        //   309: ifeq            344
        //   312: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer.getString_1:()Ljava/lang/String;
        //   315: invokevirtual   java/lang/String.isEmpty:()Z
        //   318: ifne            343
        //   321: aload_1        
        //   322: aload_0        
        //   323: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_22.class310:Lnet/minecraft/class_310;
        //   326: getfield        net/minecraft/class_310.field_1772:Lnet/minecraft/class_327;
        //   329: aload_2        
        //   330: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer.getString_1:()Ljava/lang/String;
        //   333: iload           22
        //   335: iload           24
        //   337: iload           15
        //   339: iconst_0       
        //   340: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //   343: aload_2        
        //   344: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer.getFloat:()F
        //   347: fstore          25
        //   349: fload           25
        //   351: fconst_1       
        //   352: fcmpg          
        //   353: iload           6
        //   355: ifeq            365
        //   358: ifge            428
        //   361: fload           25
        //   363: fconst_0       
        //   364: fcmpl          
        //   365: iload           6
        //   367: ifeq            381
        //   370: ifle            428
        //   373: sipush          250
        //   376: iload           18
        //   378: iconst_2       
        //   379: imul           
        //   380: isub           
        //   381: istore          26
        //   383: iload           26
        //   385: i2f            
        //   386: fload           25
        //   388: fmul           
        //   389: f2i            
        //   390: istore          27
        //   392: iload           4
        //   394: bipush          60
        //   396: iadd           
        //   397: iconst_3       
        //   398: isub           
        //   399: istore          28
        //   401: iload           8
        //   403: iload           18
        //   405: iadd           
        //   406: istore          29
        //   408: aload_1        
        //   409: iload           29
        //   411: iload           28
        //   413: iload           27
        //   415: iconst_2       
        //   416: iconst_1       
        //   417: iload           16
        //   419: ldc_w           0.6
        //   422: invokestatic    com/target/mod/compat/sub1/sub1/sub3/Initializer_1.method_int:(IF)I
        //   425: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_20:(Lnet/minecraft/class_332;IIIIII)V
        //   428: return         
        //    StackMapTable: 00 0C FF 00 3C 00 0B 07 00 02 07 00 77 07 00 4C 01 01 02 01 02 01 07 00 C6 07 00 B5 00 01 07 00 04 08 41 01 FF 00 79 00 15 07 00 02 07 00 77 07 00 4C 01 01 02 01 02 01 07 00 C6 07 00 B5 01 01 01 01 01 01 01 01 01 01 00 00 58 01 18 40 01 FF 00 62 00 19 07 00 02 07 00 77 07 00 4C 01 01 02 01 02 01 07 00 C6 07 00 B5 01 01 01 01 01 01 01 01 01 01 01 01 01 01 00 00 40 07 00 4C FF 00 14 00 1A 07 00 02 07 00 77 07 00 4C 01 01 02 01 02 01 07 00 C6 07 00 B5 01 01 01 01 01 01 01 01 01 01 01 01 01 01 02 00 01 01 4F 01 2E
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
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2539)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2500)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.accept(CoreMetadataFactory.java:577)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2514)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1517)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:122)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.assembler.ir.FrameValue.equals(FrameValue.java:73)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.assembler.ir.Frame.merge(Frame.java:338)
        //     at com.strobel.assembler.ir.Frame.merge(Frame.java:273)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2262)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    private void execute() {
        this.list.removeIf(Initializer_22::lambda$removeExpired$0);
    }
    
    private void setPackh(final Initializer_18 initializer_18) {
        if (this.class310.method_1483() == null) {
            return;
        }
        switch (Initializer_26.intArr[initializer_18.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                this.class310.method_1483().method_4873((class_1113)class_1109.method_4758(class_3417.field_14627, 1.2f));
                break;
            }
            case 6:
            case 7:
            case 8: {
                this.class310.method_1483().method_4873((class_1113)class_1109.method_47978((class_6880)class_3417.field_14624, 0.8f));
                break;
            }
            case 9:
            case 10: {
                this.class310.method_1483().method_4873((class_1113)class_1109.method_47978((class_6880)class_3417.field_14622, 1.0f));
                break;
            }
            case 11:
            case 12: {
                this.class310.method_1483().method_4873((class_1113)class_1109.method_47978((class_6880)class_3417.field_15015, 0.9f));
                break;
            }
        }
    }
    
    private float method_float(final float n) {
        return 1.0f - (float)Math.pow(1.0f - n, 3.0);
    }
    
    private float method_float_1(final float n) {
        return n * n * n;
    }
    
    public void execute_1() {
        this.list.clear();
    }
    
    private static boolean lambda$removeExpired$0(final long n, final Initializer initializer) {
        return n - initializer.getLong() >= initializer.getLong_1() + 200L;
    }
    
    static {
        sortF = new Initializer_22();
    }
}
