// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub2;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_4;
import com.target.mod.compat.sub1.sub2.sub1.sub1.Initializer;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_6;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_9779;
import net.minecraft.class_332;
import net.minecraft.class_329;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_329.class })
public class Initializer_6
{
    @Inject(method = { "method_1753" }, at = { @At("TAIL") })
    private void onRender(final class_332 class_332, final class_9779 class_333, final CallbackInfo callbackInfo) {
        if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.isEnabled()) {
            Initializer.setBindc(new BindCSub_6(class_332, 1.0f));
            Initializer.setBindc(new BindCSub_4(class_332, class_333.method_60637(false)));
        }
    }
}
