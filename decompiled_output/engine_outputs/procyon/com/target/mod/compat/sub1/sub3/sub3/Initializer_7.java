// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub2.sub3.sub1.DataNImpl_8;
import com.target.mod.compat.sub1.sub1.sub5.sub5.CalcGSub;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.class_1297;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_897.class })
public class Initializer_7
{
    @Inject(method = { "method_3921" }, at = { @At("HEAD") }, cancellable = true)
    private void onHasLabel(final class_1297 class_1297, final double n, final CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        final class_310 method_1551 = class_310.method_1551();
        if (method_1551.field_1724 != null && class_1297 == method_1551.field_1724) {
            final CalcGSub coreb = CalcGSub.getCoreb();
            if (coreb != null && coreb.isEnabled() && coreb.isEnabled_2()) {
                callbackInfoReturnable.setReturnValue((Object)false);
            }
        }
        if (class_1297 == DataNImpl_8.getClass_745()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
}
