// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub2;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub2.sub3.sub1.DataNImpl_8;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_746.class })
public class Initializer_3
{
    @Inject(method = { "method_30673" }, at = { @At("HEAD") }, cancellable = true)
    private void htPb(final double n, final double n2, final CallbackInfo callbackInfo) {
        if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.isEnabled()) {
            final DataNImpl_8 dataNImpl_8 = ClientModInitializerImpl.sortB.getEventd().computeLoadf(DataNImpl_8.class);
            if (dataNImpl_8 != null && dataNImpl_8.isEnabled() && dataNImpl_8.isEnabled()) {
                callbackInfo.cancel();
            }
        }
    }
    
    @Inject(method = { "method_6007" }, at = { @At("HEAD") })
    private void htMv(final CallbackInfo callbackInfo) {
        if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.isEnabled()) {
            final DataNImpl_8 dataNImpl_8 = ClientModInitializerImpl.sortB.getEventd().computeLoadf(DataNImpl_8.class);
            if (dataNImpl_8 != null && dataNImpl_8.isEnabled() && dataNImpl_8.isEnabled()) {
                ((class_746)this).field_5960 = true;
            }
        }
    }
}
