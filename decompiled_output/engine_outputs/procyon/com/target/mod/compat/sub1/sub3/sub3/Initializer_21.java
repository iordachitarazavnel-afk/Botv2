// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub1.sub2.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub2.sub1.ParseCSub_8;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_11908;
import net.minecraft.class_309;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_309.class })
public class Initializer_21
{
    @Inject(method = { "method_1466" }, at = { @At("HEAD") })
    private void onPress(final long n, final int n2, final class_11908 class_11908, final CallbackInfo callbackInfo) {
        Initializer_1.setBuildb(new ParseCSub_8(class_11908.comp_4795(), n2, n));
    }
}
