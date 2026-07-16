// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub1.sub2.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BuildBSub;
import net.minecraft.class_4587;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_9779;
import net.minecraft.class_757;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_757.class })
public abstract class Initializer_18
{
    @Inject(method = { "method_3188" }, at = { @At("TAIL") }, require = 0)
    private void onRenderWorldTail(final class_9779 class_9779, final CallbackInfo callbackInfo) {
        Initializer_1.setBuildb(new BuildBSub(new class_4587(), 0.0f));
    }
}
