// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub2;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.class_259;
import com.target.mod.compat.sub1.sub2.sub3.sub1.DataNImpl_8;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import net.minecraft.class_265;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.class_3726;
import net.minecraft.class_2338;
import net.minecraft.class_1922;
import net.minecraft.class_4970$class_4971;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_4970$class_4971.class })
public class Initializer_5
{
    @Inject(method = { "method_26194(Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;Lnet/minecraft/class_3726;)Lnet/minecraft/class_265;" }, at = { @At("HEAD") }, cancellable = true)
    private void onGetCollisionShape(final class_1922 class_1922, final class_2338 class_1923, final class_3726 class_1924, final CallbackInfoReturnable<class_265> callbackInfoReturnable) {
        if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.isEnabled()) {
            final DataNImpl_8 dataNImpl_8 = ClientModInitializerImpl.sortB.getEventd().computeLoadf(DataNImpl_8.class);
            if (dataNImpl_8 != null && dataNImpl_8.isEnabled() && dataNImpl_8.isEnabled()) {
                callbackInfoReturnable.setReturnValue((Object)class_259.method_1073());
            }
        }
    }
}
