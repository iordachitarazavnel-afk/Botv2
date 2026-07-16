// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import com.target.mod.compat.sub1.sub1.sub2.sub1.ParseCSub_2;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub1.sub2.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub2.sub1.ParseCSub_1;
import net.minecraft.class_2547;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_2596;
import net.minecraft.class_2535;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_2535.class })
public class Initializer
{
    @Inject(method = { "method_10759" }, at = { @At("HEAD") }, cancellable = true)
    private static <T extends class_2547> void onPacketReceive(final class_2596<T> class_2596, final T t, final CallbackInfo callbackInfo) {
        final ParseCSub_1 buildb = new ParseCSub_1(class_2596);
        Initializer_1.setBuildb(buildb);
        if (buildb.isEnabled()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "method_10743(Lnet/minecraft/class_2596;)V" }, at = { @At("HEAD") }, cancellable = true)
    private void onSendPacket(final class_2596<?> class_2596, final CallbackInfo callbackInfo) {
        final ParseCSub_2 buildb = new ParseCSub_2(class_2596);
        Initializer_1.setBuildb(buildb);
        if (buildb.isEnabled()) {
            callbackInfo.cancel();
        }
    }
}
