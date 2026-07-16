// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub2;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub2.sub4.LoadFSub;
import net.minecraft.class_1309;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_1297.class })
public class Initializer_2
{
    @Inject(method = { "method_5851" }, at = { @At("HEAD") }, cancellable = true)
    private void htGl(final CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.isEnabled() && ((class_1297)this) instanceof class_1309) {
            final com.target.mod.compat.sub1.sub2.sub2.Initializer_2 eventd = ClientModInitializerImpl.sortB.getEventd();
            if (eventd != null) {
                final LoadFSub loadFSub = eventd.computeLoadf(LoadFSub.class);
                if (loadFSub != null && loadFSub.isEnabled()) {
                    callbackInfoReturnable.setReturnValue((Object)true);
                }
            }
        }
    }
}
