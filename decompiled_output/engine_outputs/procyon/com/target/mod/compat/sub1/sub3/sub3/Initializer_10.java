// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import com.target.mod.compat.sub1.sub1.sub5.sub5.CalcGSub;
import net.minecraft.class_5223;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_5223.class })
public class Initializer_10
{
    @ModifyArg(method = { "method_27473(Ljava/lang/String;ILnet/minecraft/class_2583;Lnet/minecraft/class_2583;Lnet/minecraft/class_5224;)Z" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/class_5223;method_27472(Ljava/lang/String;ILnet/minecraft/class_2583;Lnet/minecraft/class_5224;)Z"), index = 0, require = 0)
    private static String modifyVisitedText(final String s) {
        final CalcGSub coreb = CalcGSub.getCoreb();
        if (coreb != null && coreb.isEnabled()) {
            return coreb.computeString(s);
        }
        return s;
    }
}
