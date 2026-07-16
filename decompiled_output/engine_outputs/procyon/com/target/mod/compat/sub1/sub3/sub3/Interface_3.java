// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.gen.Invoker;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_636.class })
public interface Interface_3
{
    @Invoker("method_2911")
    void syncSlot();
}
