// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import net.minecraft.class_2583;
import com.target.mod.compat.sub1.sub1.sub5.sub5.RenderVImpl;
import com.target.mod.compat.sub1.sub1.sub5.sub3.CalcGSub_12;
import com.target.mod.compat.sub1.sub1.sub5.sub3.CalcGSub_16;
import net.minecraft.class_327;
import net.minecraft.class_5348;
import net.minecraft.class_310;
import java.util.regex.Matcher;
import net.minecraft.class_5250;
import net.minecraft.class_124;
import java.util.regex.Pattern;
import com.target.mod.compat.sub1.sub1.sub5.sub3.CacheXImpl_1;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import net.minecraft.class_2561;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_9779;
import net.minecraft.class_332;
import net.minecraft.class_329;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_329.class })
public abstract class Launcher
{
    @Inject(method = { "method_1753" }, at = { @At("TAIL") })
    private void onRender(final class_332 p0, final class_9779 p1, final CallbackInfo p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   net/minecraft/class_310.method_53526:()Lnet/minecraft/class_340;
        //     6: invokevirtual   net/minecraft/class_340.method_53536:()Z
        //     9: ifeq            13
        //    12: return         
        //    13: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //    16: ifnonnull       20
        //    19: return         
        //    20: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_1.getSyncf:()Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //    23: ldc             ldc            !!! ERROR
        //    25: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.computeCalcg_1:(Ljava/lang/Class;)Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;
        //    28: checkcast       checkcast      !!! ERROR
        //    31: astore          4
        //    33: aload           4
        //    35: ifnull          45
        //    38: aload           4
        //    40: aload_1        
        //    41: fconst_0       
        //    42: invokevirtual   invokevirtual  !!! ERROR
        //    45: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_22.getSortf:()Lcom/target/mod/compat/sub1/sub1/sub7/Initializer_22;
        //    48: aload_1        
        //    49: fconst_0       
        //    50: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer_22.setClass_332AndFloat:(Lnet/minecraft/class_332;F)V
        //    53: return         
        //    StackMapTable: 00 03 0D 06 FC 00 18 07 00 30
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
    
    @Inject(method = { "method_1758" }, at = { @At("HEAD") }, cancellable = true)
    private void onSetOverlayMessage(final class_2561 class_2561, final boolean b, final CallbackInfo callbackInfo) {
        if (Initializer_1.syncF == null) {
            return;
        }
        final CacheXImpl_1 cacheXImpl_1 = Initializer_1.syncF.computeCalcg_1(CacheXImpl_1.class);
        if (cacheXImpl_1 != null && cacheXImpl_1.isEnabled() && cacheXImpl_1.isEnabled() && class_2561.getString().toLowerCase().contains("home")) {
            callbackInfo.cancel();
        }
    }
    
    private class_2561 parseColorCodes(final String input) {
        if (input == null || input.isEmpty()) {
            return (class_2561)class_2561.method_43470("");
        }
        final class_5250 method_43470 = class_2561.method_43470("");
        final Matcher matcher = Pattern.compile("&#([0-9A-Fa-f]{6})|([\u00c2§&])([0-9a-fk-or])").matcher(input);
        int end = 0;
        int int1 = 16777215;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (matcher.find()) {
            if (matcher.start() > end) {
                final class_5250 method_43471 = class_2561.method_43470(input.substring(end, matcher.start()));
                method_43471.method_27694(Launcher::lambda$parseColorCodes$0);
                method_43470.method_10852((class_2561)method_43471);
            }
            if (matcher.group(1) != null) {
                int1 = Integer.parseInt(matcher.group(1), 16);
                n2 = (n = (n3 = (n4 = 0)));
            }
            else if (matcher.group(2) != null && matcher.group(3) != null) {
                final char char1 = matcher.group(3).charAt(0);
                final class_124 method_43472 = class_124.method_544(char1);
                if (method_43472 != null) {
                    if (method_43472.method_543()) {
                        final Integer method_43473 = method_43472.method_532();
                        int1 = ((method_43473 != null) ? method_43473 : 16777215);
                        n2 = (n = (n3 = (n4 = 0)));
                    }
                    else {
                        switch (char1) {
                            case 'l': {
                                n = 1;
                                break;
                            }
                            case 'o': {
                                n2 = 1;
                                break;
                            }
                            case 'n': {
                                n3 = 1;
                                break;
                            }
                            case 'm': {
                                n4 = 1;
                                break;
                            }
                            case 'r': {
                                int1 = 16777215;
                                n2 = (n = (n3 = (n4 = 0)));
                                break;
                            }
                        }
                    }
                }
            }
            end = matcher.end();
        }
        if (end < input.length()) {
            final class_5250 method_43474 = class_2561.method_43470(input.substring(end));
            method_43474.method_27694(Launcher::lambda$parseColorCodes$1);
            method_43470.method_10852((class_2561)method_43474);
        }
        return (class_2561)method_43470;
    }
    
    private void renderCustomScoreboard(final class_332 class_332, final class_2561 class_333, final String[] array) {
        final class_327 field_1772 = class_310.method_1551().field_1772;
        final int method_51421 = class_332.method_51421();
        final int method_51422 = class_332.method_51443();
        final int n = 9;
        final int n2 = 4;
        int method_51423 = field_1772.method_27525((class_5348)class_333);
        final class_2561[] array2 = new class_2561[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = this.parseColorCodes(array[i]);
            final int method_51424 = field_1772.method_27525((class_5348)array2[i]);
            if (method_51424 > method_51423) {
                method_51423 = method_51424;
            }
        }
        final int n3 = method_51423 + n2 * 2;
        final int length = array.length;
        final int n4 = length * n;
        final int n5 = n + 2;
        final int n6 = method_51421 - 3;
        final int n7 = n6 - n3;
        final int n8 = (method_51422 - (n5 + n4)) / 2;
        class_332.method_25294(n7 - 2, n8, n6 + 2, n8 + n5, 1711276032);
        class_332.method_27535(field_1772, class_333, n7 + (n3 - field_1772.method_27525((class_5348)class_333)) / 2, n8 + 1, -1);
        final int n9 = n8 + n5;
        class_332.method_25294(n7 - 2, n9, n6 + 2, n9 + n4, 1275068416);
        for (int j = 0; j < length; ++j) {
            class_332.method_27535(field_1772, array2[j], n7, n9 + j * n, -1);
        }
    }
    
    @Inject(method = { "method_55803(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V" }, at = { @At("HEAD") }, cancellable = true)
    private void onRenderScoreboard(final class_332 class_332, final class_9779 class_333, final CallbackInfo callbackInfo) {
        if (Initializer_1.syncF == null) {
            return;
        }
        if (Initializer_1.syncF.computeCalcg_1(CalcGSub_16.class).isEnabled()) {
            callbackInfo.cancel();
        }
        final CalcGSub_12 sorth = CalcGSub_12.getSorth();
        if (sorth == null || !sorth.isEnabled()) {
            return;
        }
        if (!callbackInfo.isCancelled()) {
            callbackInfo.cancel();
        }
        final class_2561 colorCodes = this.parseColorCodes("&#007cf9&lD&#0089f9&lo&#0096f9&ln&#00a3f9&lu&#00b0f9&lt&#00bdf9 &#00b0f9&lS&#00b7f9&lM&#00c6f9&lP");
        final String[] array = { "", "&#00FC00&l$ &fMoney &#00FC00" + (String)sorth.eventQ.getValue(), "&#A303F9\u00e2\u02dc\u2026 &fShards &#A303F9" + (String)sorth.eventQ_1.getValue(), "&#FC0000\ud83d\udde1 &fKills &#FC0000" + (String)sorth.eventQ_2.getValue(), "&#F97603\u00e2\u02dc  &fDeaths &#F97603" + (String)sorth.eventQ_3.getValue(), "&#00A4FC\u00e2\u0152\u203a &fKeyall &#00A4FC" + (String)sorth.eventQ_4.getValue(), "&#FCE300\u00e2\u0152\u0161 &fPlaytime &#FCE300" + (String)sorth.eventQ_5.getValue(), "&#00A4FC\ud83e\ude93 &fTeam &#00A4FC" + (String)sorth.eventQ_6.getValue(), "", "&7" + (String)sorth.eventQ_7.getValue() + " &7(&#00A4FC" + (String)sorth.eventQ_8.getValue() + "ms&7)" };
        final String[] array2 = { "", "&#00FC00&l$ &fMoney &#00FC00" + (String)sorth.eventQ.getValue(), "&#A303F9\u00e2\u02dc\u2026 &fShards &#A303F9" + (String)sorth.eventQ_1.getValue(), "&#FC0000\ud83d\udde1 &fKills &#FC0000" + (String)sorth.eventQ_2.getValue(), "&#F97603\u00e2\u02dc  &fDeaths &#F97603" + (String)sorth.eventQ_3.getValue(), "&#00A4FC\u00e2\u0152\u203a &fKeyall &#00A4FC" + (String)sorth.eventQ_4.getValue(), "&#FCE300\u00e2\u0152\u0161 &fPlaytime &#FCE300" + (String)sorth.eventQ_5.getValue(), "", "&7" + (String)sorth.eventQ_7.getValue() + " &7(&#00A4FC" + (String)sorth.eventQ_8.getValue() + "ms&7)" };
        if (sorth.eventQ_6.getValue().isEmpty()) {
            this.renderCustomScoreboard(class_332, colorCodes, array2);
        }
        else {
            this.renderCustomScoreboard(class_332, colorCodes, array);
        }
    }
    
    @Inject(method = { "method_1759" }, at = { @At("HEAD") })
    private void onRenderHotbarStart(final class_332 class_332, final class_9779 class_333, final CallbackInfo callbackInfo) {
        RenderVImpl.boolFlag = true;
    }
    
    @Inject(method = { "method_1759" }, at = { @At("RETURN") })
    private void onRenderHotbarEnd(final class_332 class_332, final class_9779 class_333, final CallbackInfo callbackInfo) {
        RenderVImpl.boolFlag = false;
    }
    
    private static class_2583 lambda$parseColorCodes$1(final int n, final boolean b, final boolean b2, final boolean b3, final boolean b4, class_2583 class_2583) {
        class_2583 = class_2583.method_36139(n);
        if (b) {
            class_2583 = class_2583.method_10982(Boolean.valueOf(true));
        }
        if (b2) {
            class_2583 = class_2583.method_10978(Boolean.valueOf(true));
        }
        if (b3) {
            class_2583 = class_2583.method_30938(Boolean.valueOf(true));
        }
        if (b4) {
            class_2583 = class_2583.method_36140(Boolean.valueOf(true));
        }
        return class_2583;
    }
    
    private static class_2583 lambda$parseColorCodes$0(final int n, final boolean b, final boolean b2, final boolean b3, final boolean b4, class_2583 class_2583) {
        class_2583 = class_2583.method_36139(n);
        if (b) {
            class_2583 = class_2583.method_10982(Boolean.valueOf(true));
        }
        if (b2) {
            class_2583 = class_2583.method_10978(Boolean.valueOf(true));
        }
        if (b3) {
            class_2583 = class_2583.method_30938(Boolean.valueOf(true));
        }
        if (b4) {
            class_2583 = class_2583.method_36140(Boolean.valueOf(true));
        }
        return class_2583;
    }
}
