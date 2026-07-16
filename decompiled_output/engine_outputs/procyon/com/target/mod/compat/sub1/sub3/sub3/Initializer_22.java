// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub1.sub5.sub5.CalcGSub;
import net.minecraft.class_2561;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_640.class })
public class Initializer_22
{
    @Inject(method = { "method_2971" }, at = { @At("RETURN") }, cancellable = true)
    private void onGetDisplayName(final CallbackInfoReturnable<class_2561> callbackInfoReturnable) {
        final CalcGSub coreb = CalcGSub.getCoreb();
        if (coreb == null || !coreb.isEnabled_1()) {
            return;
        }
        final class_310 method_1551 = class_310.method_1551();
        if (method_1551.field_1724 == null) {
            return;
        }
        final String string = method_1551.field_1724.method_5477().getString();
        final String name = ((class_640)this).method_2966().name();
        if (name != null && name.equals(string)) {
            final class_2561 class_2561 = (class_2561)callbackInfoReturnable.getReturnValue();
            if (class_2561 != null) {
                final String computeString = coreb.computeString(class_2561.getString());
                if (!computeString.equals(class_2561.getString())) {
                    callbackInfoReturnable.setReturnValue((Object)net.minecraft.class_2561.method_43470(computeString));
                }
            }
            else {
                callbackInfoReturnable.setReturnValue((Object)net.minecraft.class_2561.method_43470(coreb.getString()));
            }
        }
    }
}
