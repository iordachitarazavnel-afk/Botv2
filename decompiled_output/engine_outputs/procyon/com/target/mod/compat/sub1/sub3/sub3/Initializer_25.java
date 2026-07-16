// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub1.sub5.sub5.RenderVImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_1799;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_1799.class })
public abstract class Initializer_25
{
    @Inject(method = { "method_7912" }, at = { @At("HEAD") }, cancellable = true)
    private void onSetBobbingAnimationTime(final int n, final CallbackInfo callbackInfo) {
        try {
            if (RenderVImpl.isEnabled()) {
                callbackInfo.cancel();
            }
        }
        catch (final Exception ex) {}
    }
    
    @Inject(method = { "method_7965" }, at = { @At("HEAD") }, cancellable = true)
    private void onGetBobbingAnimationTime(final CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        try {
            if (RenderVImpl.isEnabled()) {
                callbackInfoReturnable.setReturnValue((Object)0);
            }
        }
        catch (final Exception ex) {}
    }
    
    @Inject(method = { "method_7947" }, at = { @At("HEAD") }, cancellable = true)
    private void onGetCount(final CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        try {
            if (RenderVImpl.boolFlag) {
                final int method_int = RenderVImpl.method_int((class_1799)this);
                try {
                    if (method_int >= 0) {
                        callbackInfoReturnable.setReturnValue((Object)method_int);
                    }
                }
                catch (final Exception ex) {
                    throw computeException(ex);
                }
            }
        }
        catch (final Exception ex2) {}
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
}
