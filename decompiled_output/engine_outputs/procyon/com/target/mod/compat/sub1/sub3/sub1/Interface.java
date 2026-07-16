// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub1;

import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.class_312;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_310.class })
public interface Interface
{
    @Accessor("field_1729")
    class_312 getMouse();
    
    @Invoker("method_1583")
    void iDIU();
    
    @Invoker("method_1536")
    boolean isEnabled();
    
    @Accessor("field_1752")
    void sIUC(final int p0);
}
