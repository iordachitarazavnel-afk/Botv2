// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub1;

import net.minecraft.class_1799;
import net.minecraft.class_2371;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.class_1661;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_1661.class })
public interface MainClass
{
    @Accessor("field_7545")
    int getInt();
    
    @Accessor("field_7545")
    void setInt(final int p0);
    
    @Accessor("field_7547")
    class_2371<class_1799> getMain();
}
