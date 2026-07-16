// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_18;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_22;
import com.target.mod.compat.sub1.sub1.sub5.sub1.CalcGSub;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_2663;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_634.class })
public class Initializer_11
{
    @Inject(method = { "method_11148" }, at = { @At("HEAD") })
    private void onEntityStatus(final class_2663 class_2663, final CallbackInfo callbackInfo) {
        if (class_2663.method_11470() == 35) {
            final class_1297 method_11469 = class_2663.method_11469((class_1937)Initializer_1.class310.field_1687);
            if (method_11469 instanceof final class_1657 class_2664) {
                if (class_2664 != Initializer_1.class310.field_1724) {
                    final CalcGSub calcGSub = Initializer_1.getSyncf().computeCalcg_1(CalcGSub.class);
                    if (calcGSub != null && calcGSub.buffC_1.getValue()) {
                        Initializer_22.getSortf().processAll("Totem Pop", class_2664.method_5477().getString() + " popped a totem", Initializer_18.WARNING);
                    }
                }
            }
        }
    }
}
