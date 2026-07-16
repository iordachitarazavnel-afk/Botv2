// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.class_3675$class_306;
import net.minecraft.class_304;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_304.class })
public interface Interface
{
    @Accessor("field_1655")
    class_3675$class_306 getBoundKey();
}
