// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub2;

import com.target.mod.compat.sub1.sub2.sub6.BindCSub_5;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub2.sub1.sub1.Initializer;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_9;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import net.minecraft.class_2535;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_2535.class })
public class Initializer_9
{
    @Inject(method = { "method_10759" }, at = { @At("HEAD") }, cancellable = true)
    private static <T extends class_2547> void onPacketReceive(final class_2596<T> class_2596, final class_2547 class_2597, final CallbackInfo callbackInfo) {
        if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.isEnabled()) {
            final BindCSub_9 bindc = new BindCSub_9(class_2596);
            Initializer.setBindc(bindc);
            if (bindc.isEnabled()) {
                callbackInfo.cancel();
            }
        }
    }
    
    @Inject(method = { "method_10743(Lnet/minecraft/class_2596;)V" }, at = { @At("HEAD") }, cancellable = true)
    private void onPacketSend(final class_2596<?> class_2596, final CallbackInfo callbackInfo) {
        if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.isEnabled()) {
            final BindCSub_5 bindc = new BindCSub_5(class_2596);
            Initializer.setBindc(bindc);
            if (bindc.isEnabled()) {
                callbackInfo.cancel();
            }
        }
    }
}
