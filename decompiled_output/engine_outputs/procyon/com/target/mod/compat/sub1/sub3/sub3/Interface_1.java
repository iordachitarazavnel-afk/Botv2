// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.gen.Invoker;
import net.minecraft.class_11910;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_312.class })
public interface Interface_1
{
    @Invoker("method_1601")
    void iOMB(final long p0, final class_11910 p1, final int p2);
}
