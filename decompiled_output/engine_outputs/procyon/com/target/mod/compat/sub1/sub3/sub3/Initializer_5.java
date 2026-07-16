// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub1.sub2.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub2.sub1.ParseCSub_5;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_312.class })
public class Initializer_5
{
    @Inject(method = { "method_1600" }, at = { @At("HEAD") }, cancellable = true)
    private void onCursorPos(final long n, final double n2, final double n3, final CallbackInfo callbackInfo) {
        final ParseCSub_5 buildb = new ParseCSub_5(n2, n3);
        Initializer_1.setBuildb(buildb);
        if (buildb.isEnabled()) {
            callbackInfo.cancel();
        }
    }
}
