// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import net.minecraft.class_9112;
import net.minecraft.class_412;
import net.minecraft.class_442;
import org.spongepowered.asm.mixin.injection.At$Shift;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.class_8021;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub5.sub4.CalcGSub;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_2561;
import org.spongepowered.asm.mixin.Unique;
import net.minecraft.class_4185;
import net.minecraft.class_419;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.class_437;

@Mixin({ class_419.class })
public abstract class Abstractclass_437 extends class_437
{
    @Unique
    private class_4185 class4185;
    @Unique
    private double doubleValue;
    
    private class_419 self() {
        return (class_419)this;
    }
    
    protected Abstractclass_437(final class_2561 class_2561) {
        super(class_2561);
    }
    
    @Inject(method = { "method_25426" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/class_8667;method_48222()V", shift = At$Shift.BEFORE) })
    private void addButtons(final CallbackInfo callbackInfo) {
        final CalcGSub calcGSub = Initializer_1.getSyncf().computeCalcg_1(CalcGSub.class);
        if (calcGSub == null) {
            return;
        }
        if (Initializer_1.syncF == null) {
            return;
        }
        if (!calcGSub.isEnabled_1()) {
            return;
        }
        if (calcGSub.isEnabled()) {
            return;
        }
        this.doubleValue = calcGSub.getDouble() * 20.0;
        this.class4185 = class_4185.method_46430((class_2561)class_2561.method_43470(this.getText()), this::lambda$addButtons$0).method_46431();
        this.self().field_44552.method_52736((class_8021)this.class4185);
        this.self().field_44552.method_52736((class_8021)class_4185.method_46430((class_2561)class_2561.method_43470(this.getToggleText(calcGSub)), this::lambda$addButtons$1).method_46431());
    }
    
    public void method_25393() {
        final CalcGSub calcGSub = Initializer_1.getSyncf().computeCalcg_1(CalcGSub.class);
        if (calcGSub == null || !calcGSub.isEnabled() || !calcGSub.isEnabled_1()) {
            return;
        }
        if (this.doubleValue <= 0.0) {
            this.tryConnecting();
        }
        else {
            --this.doubleValue;
            if (this.class4185 != null) {
                this.class4185.method_25355((class_2561)class_2561.method_43470(this.getText()));
            }
        }
    }
    
    @Unique
    private String getText() {
        final CalcGSub calcGSub = Initializer_1.getSyncf().computeCalcg_1(CalcGSub.class);
        String s = "Reconnect";
        if (calcGSub != null && calcGSub.isEnabled()) {
            s = s + " " + String.format("(%.1f)", this.doubleValue / 20.0);
        }
        return s;
    }
    
    @Unique
    private String getToggleText(final CalcGSub calcGSub) {
        return "Auto Reconnect: " + (calcGSub.isEnabled() ? "§aON" : "§cOFF");
    }
    
    @Unique
    private void tryConnecting() {
        final CalcGSub calcGSub = Initializer_1.getSyncf().computeCalcg_1(CalcGSub.class);
        if (calcGSub == null || !calcGSub.isEnabled_1()) {
            return;
        }
        class_412.method_36877((class_437)new class_442(), this.field_22787, calcGSub.class639, calcGSub.class642, false, (class_9112)null);
    }
    
    private void lambda$addButtons$1(final CalcGSub calcGSub, final class_4185 class_4185) {
        calcGSub.execute_2();
        class_4185.method_25355((class_2561)class_2561.method_43470(this.getToggleText(calcGSub)));
        if (this.class4185 != null) {
            this.class4185.method_25355((class_2561)class_2561.method_43470(this.getText()));
        }
        this.doubleValue = calcGSub.getDouble() * 20.0;
    }
    
    private void lambda$addButtons$0(final class_4185 class_4185) {
        this.tryConnecting();
    }
}
