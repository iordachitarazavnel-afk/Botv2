// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub6;

import com.target.mod.compat.sub1.sub2.sub3.Initializer_1;
import net.minecraft.class_332;
import com.target.mod.compat.sub1.sub2.sub3.Initializer;

public class BindCSub_10 extends Initializer<PackDImpl_7>
{
    private final class_332 class332;
    
    public BindCSub_10(final class_332 class332) {
        this.class332 = class332;
    }
    
    public class_332 getClass_332() {
        return this.class332;
    }
    
    @Override
    public Class<PackDImpl_7> getClass() {
        return PackDImpl_7.class;
    }
    
    public void setLinkw(final PackDImpl_7 packDImpl_7) {
        packDImpl_7.setProcj(this);
    }
}
