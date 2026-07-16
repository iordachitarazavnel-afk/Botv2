// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import com.target.mod.compat.sub1.sub1.sub5.sub5.CalcGSub;
import net.minecraft.class_2561;
import net.minecraft.class_338;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_338.class })
public class Initializer_6
{
    @ModifyVariable(method = { "method_44811(Lnet/minecraft/class_2561;Lnet/minecraft/class_7469;Lnet/minecraft/class_7591;)V" }, at = @At("HEAD"), ordinal = 0, argsOnly = true)
    private class_2561 modifyChatMessage(final class_2561 class_2561) {
        final CalcGSub coreb = CalcGSub.getCoreb();
        if (coreb != null && coreb.isEnabled()) {
            final String string = class_2561.getString();
            final String computeString = coreb.computeString(string);
            if (!string.equals(computeString)) {
                return (class_2561)class_2561.method_43470(computeString);
            }
        }
        return class_2561;
    }
}
