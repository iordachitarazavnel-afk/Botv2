// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub5.sub4.CalcGSub;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_9112;
import net.minecraft.class_642;
import net.minecraft.class_639;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_412;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_412.class })
public class Initializer_24
{
    @Inject(method = { "method_36877(Lnet/minecraft/class_437;Lnet/minecraft/class_310;Lnet/minecraft/class_639;Lnet/minecraft/class_642;ZLnet/minecraft/class_9112;)V" }, at = { @At("HEAD") })
    private static void onConnect(final class_437 class_437, final class_310 class_438, final class_639 class_439, final class_642 class_440, final boolean b, final class_9112 class_441, final CallbackInfo callbackInfo) {
        final CalcGSub calcGSub = Initializer_1.getSyncf().computeCalcg_1(CalcGSub.class);
        if (calcGSub != null) {
            calcGSub.setClass_639AndClass_642(class_439, class_440);
        }
    }
}
