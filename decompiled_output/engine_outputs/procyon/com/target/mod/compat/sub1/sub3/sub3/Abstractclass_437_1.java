// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import net.minecraft.class_1044;
import java.util.function.Supplier;
import net.minecraft.class_1043;
import java.io.InputStream;
import net.minecraft.class_1011;
import java.net.URL;
import java.net.HttpURLConnection;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.class_11909;
import net.minecraft.class_332;
import java.util.concurrent.CompletableFuture;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_2561;
import org.spongepowered.asm.mixin.Unique;
import net.minecraft.class_2960;
import net.minecraft.class_442;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.class_437;

@Mixin({ class_442.class })
public abstract class Abstractclass_437_1 extends class_437
{
    private static final String strValue = "mc_core";
    @Unique
    private static final class_2960 class2960;
    @Unique
    private float floatValue;
    @Unique
    private class_2960 class2960_1;
    @Unique
    private String strValue_1;
    
    protected Abstractclass_437_1(final class_2561 class_2561) {
        super(class_2561);
        this.floatValue = 0.0f;
        this.class2960_1 = null;
        this.strValue_1 = "";
    }
    
    @Inject(method = { "method_25426" }, at = { @At("TAIL") })
    private void onInit(final CallbackInfo callbackInfo) {
        this.updateHeadTexture();
    }
    
    @Unique
    private void updateHeadTexture() {
        if (this.field_22787 == null || this.field_22787.method_1548() == null) {
            return;
        }
        final String method_1676 = this.field_22787.method_1548().method_1676();
        if (method_1676 == null || method_1676.trim().isEmpty()) {
            return;
        }
        if (method_1676.equals(this.strValue_1) && this.class2960_1 != null) {
            return;
        }
        this.strValue_1 = method_1676;
        this.class2960_1 = null;
        this.fetchHeadTexture(method_1676);
    }
    
    @Unique
    private void fetchHeadTexture(final String s) {
        CompletableFuture.runAsync(this::lambda$fetchHeadTexture$2);
    }
    
    @Inject(method = { "method_25394" }, at = { @At("TAIL") })
    private void onRender(final class_332 p0, final int p1, final int p2, final float p3, final CallbackInfo p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.updateHeadTexture:()V
        //     4: bipush          24
        //     6: istore          6
        //     8: bipush          10
        //    10: istore          7
        //    12: aload_1        
        //    13: invokevirtual   net/minecraft/class_332.method_51421:()I
        //    16: iload           6
        //    18: isub           
        //    19: iload           7
        //    21: isub           
        //    22: istore          8
        //    24: iload           7
        //    26: istore          9
        //    28: iload_2        
        //    29: iload           8
        //    31: if_icmplt       87
        //    34: iload_2        
        //    35: iload           8
        //    37: iload           6
        //    39: iadd           
        //    40: if_icmpgt       87
        //    43: goto            50
        //    46: invokestatic    com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    49: athrow         
        //    50: iload_3        
        //    51: iload           9
        //    53: if_icmplt       87
        //    56: goto            63
        //    59: invokestatic    com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    62: athrow         
        //    63: iload_3        
        //    64: iload           9
        //    66: iload           6
        //    68: iadd           
        //    69: if_icmpgt       87
        //    72: goto            79
        //    75: invokestatic    com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    78: athrow         
        //    79: iconst_1       
        //    80: goto            88
        //    83: invokestatic    com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    86: athrow         
        //    87: iconst_0       
        //    88: istore          10
        //    90: iload           10
        //    92: ifeq            103
        //    95: fconst_1       
        //    96: goto            104
        //    99: invokestatic    com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   102: athrow         
        //   103: fconst_0       
        //   104: fstore          11
        //   106: aload_0        
        //   107: fload           4
        //   109: ldc             0.2
        //   111: fmul           
        //   112: aload_0        
        //   113: getfield        com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.floatValue:F
        //   116: fload           11
        //   118: invokestatic    net/minecraft/class_3532.method_16439:(FFF)F
        //   121: putfield        com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.floatValue:F
        //   124: aload_1        
        //   125: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   128: invokevirtual   org/joml/Matrix3x2fStack.pushMatrix:()Lorg/joml/Matrix3x2fStack;
        //   131: pop            
        //   132: aload_1        
        //   133: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   136: iload           8
        //   138: i2d            
        //   139: iload           6
        //   141: i2d            
        //   142: ldc2_w          2.0
        //   145: ddiv           
        //   146: dadd           
        //   147: d2f            
        //   148: iload           9
        //   150: i2d            
        //   151: iload           6
        //   153: i2d            
        //   154: ldc2_w          2.0
        //   157: ddiv           
        //   158: dadd           
        //   159: d2f            
        //   160: invokevirtual   org/joml/Matrix3x2fStack.translate:(FF)Lorg/joml/Matrix3x2f;
        //   163: pop            
        //   164: fconst_1       
        //   165: aload_0        
        //   166: getfield        com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.floatValue:F
        //   169: ldc             0.15
        //   171: fmul           
        //   172: fadd           
        //   173: fstore          12
        //   175: aload_1        
        //   176: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   179: fload           12
        //   181: fload           12
        //   183: invokevirtual   org/joml/Matrix3x2fStack.scale:(FF)Lorg/joml/Matrix3x2f;
        //   186: pop            
        //   187: aload_0        
        //   188: getfield        com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.floatValue:F
        //   191: fconst_0       
        //   192: fcmpl          
        //   193: ifle            228
        //   196: aload_0        
        //   197: getfield        com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.floatValue:F
        //   200: ldc             100.0
        //   202: fmul           
        //   203: f2i            
        //   204: istore          13
        //   206: iload           13
        //   208: bipush          24
        //   210: ishl           
        //   211: ldc             16711680
        //   213: ior            
        //   214: istore          14
        //   216: aload_1        
        //   217: iconst_0       
        //   218: iconst_0       
        //   219: iload           6
        //   221: iload           14
        //   223: ldc             16711680
        //   225: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_13:(Lnet/minecraft/class_332;IIIII)V
        //   228: aload_0        
        //   229: getfield        com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.class2960_1:Lnet/minecraft/class_2960;
        //   232: ifnull          270
        //   235: aload_0        
        //   236: getfield        com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.field_22787:Lnet/minecraft/class_310;
        //   239: invokevirtual   net/minecraft/class_310.method_1531:()Lnet/minecraft/class_1060;
        //   242: aload_0        
        //   243: getfield        com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.class2960_1:Lnet/minecraft/class_2960;
        //   246: invokevirtual   net/minecraft/class_1060.method_4619:(Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
        //   249: ifnull          270
        //   252: goto            259
        //   255: invokestatic    com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   258: athrow         
        //   259: aload_0        
        //   260: getfield        com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.class2960_1:Lnet/minecraft/class_2960;
        //   263: goto            273
        //   266: invokestatic    com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   269: athrow         
        //   270: getstatic       com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.class2960:Lnet/minecraft/class_2960;
        //   273: astore          13
        //   275: aload_0        
        //   276: getfield        com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.field_22787:Lnet/minecraft/class_310;
        //   279: invokevirtual   net/minecraft/class_310.method_1531:()Lnet/minecraft/class_1060;
        //   282: aload           13
        //   284: invokevirtual   net/minecraft/class_1060.method_4619:(Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
        //   287: ifnull          310
        //   290: aload_1        
        //   291: aload           13
        //   293: iload           6
        //   295: ineg           
        //   296: iconst_2       
        //   297: idiv           
        //   298: iload           6
        //   300: ineg           
        //   301: iconst_2       
        //   302: idiv           
        //   303: iload           6
        //   305: iload           6
        //   307: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub5/Initializer.processAll_7:(Lnet/minecraft/class_332;Lnet/minecraft/class_2960;IIII)V
        //   310: goto            315
        //   313: astore          14
        //   315: aload_1        
        //   316: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   319: invokevirtual   org/joml/Matrix3x2fStack.popMatrix:()Lorg/joml/Matrix3x2fStack;
        //   322: pop            
        //   323: iload           10
        //   325: ifeq            350
        //   328: aload_1        
        //   329: aload_0        
        //   330: getfield        com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.field_22793:Lnet/minecraft/class_327;
        //   333: ldc             "§cManage Accounts"
        //   335: invokestatic    net/minecraft/class_2561.method_43470:(Ljava/lang/String;)Lnet/minecraft/class_5250;
        //   338: iload_2        
        //   339: iload_3        
        //   340: invokevirtual   net/minecraft/class_332.method_51438:(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;II)V
        //   343: goto            350
        //   346: invokestatic    com/target/mod/compat/sub1/sub3/sub3/Abstractclass_437_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   349: athrow         
        //   350: return         
        //    StackMapTable: 00 17 FF 00 2E 00 0A 07 00 02 07 00 69 01 01 02 07 00 6F 01 01 01 01 00 01 07 00 67 03 48 07 00 67 03 4B 07 00 67 03 43 07 00 67 03 40 01 FF 00 0A 00 0B 07 00 02 07 00 69 01 01 02 07 00 6F 01 01 01 01 01 00 01 07 00 67 03 40 02 FD 00 7B 02 02 5A 07 00 67 03 46 07 00 67 03 42 07 00 A3 FC 00 24 07 00 A3 42 07 00 67 01 5E 07 00 67 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  235    266    266    270    Ljava/lang/Exception;
        //  228    252    255    259    Ljava/lang/Exception;
        //  90     99     99     103    Ljava/lang/Exception;
        //  63     83     83     87     Ljava/lang/Exception;
        //  50     72     75     79     Ljava/lang/Exception;
        //  34     56     59     63     Ljava/lang/Exception;
        //  28     43     46     50     Ljava/lang/Exception;
        //  275    310    313    315    Ljava/lang/Exception;
        //  315    343    346    350    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
    
    @Inject(method = { "method_25402" }, at = { @At("HEAD") }, cancellable = true)
    private void onMouseClicked(final class_11909 class_11909, final boolean b, final CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
    }
    
    private void lambda$fetchHeadTexture$2(final String s) {
        try {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL("https://minotar.net/helm/" + s + "/64.png").openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            if (httpURLConnection.getResponseCode() != 200) {
                return;
            }
            final InputStream inputStream = httpURLConnection.getInputStream();
            final class_1011 method_4309 = class_1011.method_4309(inputStream);
            inputStream.close();
            this.field_22787.execute(this::lambda$fetchHeadTexture$1);
        }
        catch (final Exception ex) {}
    }
    
    private void lambda$fetchHeadTexture$1(final class_2960 class2960_1, final class_1011 class_1011) {
        try {
            this.field_22787.method_1531().method_4616(class2960_1, (class_1044)new class_1043((Supplier)Abstractclass_437_1::lambda$fetchHeadTexture$0, class_1011));
            this.class2960_1 = class2960_1;
        }
        catch (final Exception ex) {}
    }
    
    private static String lambda$fetchHeadTexture$0() {
        return "dynamic";
    }
    
    static {
        class2960 = class_2960.method_60655("mc_core", "textures/icon.png");
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
}
