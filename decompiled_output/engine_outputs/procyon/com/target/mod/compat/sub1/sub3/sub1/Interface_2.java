// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub1;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.class_1735;
import net.minecraft.class_465;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_465.class })
public interface Interface_2
{
    @Accessor("field_2787")
    class_1735 getFocusedSlot();
}
