// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub2;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_2;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_1;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_1297.class })
public class Initializer
{
    @Inject(method = { "method_5871" }, at = { @At("RETURN") }, cancellable = true)
    private void htHit(final CallbackInfoReturnable<Float> callbackInfoReturnable) {
        if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.isEnabled()) {
            final Initializer_2 eventd = ClientModInitializerImpl.sortB.getEventd();
            if (eventd != null) {
                final DataNImpl_1 dataNImpl_1 = eventd.computeLoadf(DataNImpl_1.class);
                if (dataNImpl_1 != null && dataNImpl_1.isEnabled()) {
                    final float method_float = dataNImpl_1.method_float((class_1297)this);
                    if (method_float > 0.0f) {
                        callbackInfoReturnable.setReturnValue((Object)((float)callbackInfoReturnable.getReturnValue() + method_float));
                    }
                }
            }
        }
    }
}
