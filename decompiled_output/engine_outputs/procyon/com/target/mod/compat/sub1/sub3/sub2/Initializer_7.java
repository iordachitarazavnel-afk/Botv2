// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub2;

import com.target.mod.compat.sub1.sub2.sub6.BindCSub_11;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub2.sub1.sub1.Initializer;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_3;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_21;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_310.class })
public class Initializer_7
{
    @Inject(method = { "method_1574" }, at = { @At("HEAD") })
    private void onTick(final CallbackInfo callbackInfo) {
        if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.isEnabled() && Initializer_21.isEnabled()) {
            Initializer.setBindc(new BindCSub_3());
        }
    }
    
    @Inject(method = { "method_1583" }, at = { @At("HEAD") }, cancellable = true)
    private void onItemUse(final CallbackInfo callbackInfo) {
        if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.isEnabled()) {
            final BindCSub bindc = new BindCSub();
            Initializer.setBindc(bindc);
            if (bindc.isEnabled()) {
                callbackInfo.cancel();
            }
        }
    }
    
    @Inject(method = { "method_1536" }, at = { @At("HEAD") }, cancellable = true)
    private void onAttack(final CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.isEnabled()) {
            final BindCSub_11 bindc = new BindCSub_11();
            Initializer.setBindc(bindc);
            if (bindc.isEnabled()) {
                callbackInfoReturnable.setReturnValue((Object)false);
            }
        }
    }
    
    @Inject(method = { "method_1590" }, at = { @At("HEAD") }, cancellable = true)
    private void htBb(final boolean b, final CallbackInfo callbackInfo) {
    }
    
    @Inject(method = { "method_1508" }, at = { @At("HEAD") })
    private void htIe(final CallbackInfo callbackInfo) {
    }
}
