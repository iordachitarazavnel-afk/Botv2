// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.target.mod.compat.sub1.sub1.sub5.sub3.BuffPImpl;
import com.target.mod.compat.sub1.sub1.sub5.sub3.BuffPImpl_1;
import com.target.mod.compat.sub1.sub1.sub2.sub1.ParseCSub_7;
import net.minecraft.class_437;
import com.target.mod.compat.sub1.sub1.sub2.sub1.ParseCSub;
import com.target.mod.compat.sub1.sub1.sub2.sub1.ParseCSub_4;
import com.target.mod.compat.sub1.sub1.sub2.sub1.ParseCSub_6;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BuildBSub_2;
import com.target.mod.compat.sub1.sub1.sub2.sub1.ParseCSub_3;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub1.sub2.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BuildBSub_1;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import com.target.mod.compat.sub1.sub1.sub4.Interface;

@Mixin({ class_310.class })
public class ViewAImpl implements Interface
{
    private class_310 self() {
        return (class_310)this;
    }
    
    @Inject(method = { "method_1574" }, at = { @At("HEAD") })
    private void onTick(final CallbackInfo callbackInfo) {
        if (this.self().field_1687 != null) {
            Initializer_1.setBuildb(new BuildBSub_1());
        }
    }
    
    @Inject(method = { "method_1583" }, at = { @At("HEAD") }, cancellable = true)
    private void onItemUse(final CallbackInfo callbackInfo) {
        final ParseCSub_3 buildb = new ParseCSub_3();
        Initializer_1.setBuildb(buildb);
        if (buildb.isEnabled()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "method_1508" }, at = { @At("HEAD") })
    public void mc$handleInputEvents(final CallbackInfo callbackInfo) {
        Initializer_1.setBuildb(new BuildBSub_2());
    }
    
    @Inject(method = { "method_1536" }, at = { @At("HEAD") }, cancellable = true)
    private void onAttack(final CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        final ParseCSub_6 buildb = new ParseCSub_6();
        Initializer_1.setBuildb(buildb);
        if (buildb.isEnabled()) {
            callbackInfoReturnable.cancel();
        }
        final class_310 self = this.self();
        if (self.field_1692 != null) {
            final ParseCSub_4 buildb2 = new ParseCSub_4(self.field_1692);
            Initializer_1.setBuildb(buildb2);
            if (buildb2.isEnabled()) {
                callbackInfoReturnable.cancel();
            }
        }
    }
    
    @Inject(method = { "method_1590" }, at = { @At("HEAD") }, cancellable = true)
    private void oBBH(final boolean b, final CallbackInfo callbackInfo) {
        final ParseCSub buildb = new ParseCSub();
        Initializer_1.setBuildb(buildb);
        if (buildb.isEnabled()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "method_1507" }, at = { @At("HEAD") }, cancellable = true)
    public void mc$setScreen(final class_437 class_437, final CallbackInfo callbackInfo) {
        final ParseCSub_7 buildb = new ParseCSub_7(class_437);
        Initializer_1.setBuildb(buildb);
        if (buildb.isEnabled()) {
            callbackInfo.cancel();
        }
    }
    
    @ModifyReturnValue(method = { "method_1569" }, at = { @At("RETURN") })
    private boolean alwaysFocused(final boolean b) {
        if (com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF == null) {
            return b;
        }
        final BuffPImpl_1 buffPImpl_1 = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF.computeCalcg_1(BuffPImpl_1.class);
        final BuffPImpl buffPImpl = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF.computeCalcg_1(BuffPImpl.class);
        return (buffPImpl != null && buffPImpl.isEnabled()) || (buffPImpl_1 != null && buffPImpl_1.isEnabled()) || b;
    }
    
    @Override
    public void sIUC(final int field_1752) {
        this.self().field_1752 = field_1752;
    }
}
