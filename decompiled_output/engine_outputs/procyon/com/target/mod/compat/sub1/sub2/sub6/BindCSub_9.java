// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub6;

import com.target.mod.compat.sub1.sub2.sub3.Initializer_1;
import net.minecraft.class_2596;
import com.target.mod.compat.sub1.sub2.sub3.Initializer;

public class BindCSub_9 extends Initializer<PackDImpl_10>
{
    private final class_2596<?> class2596;
    
    public BindCSub_9(final class_2596<?> class2596) {
        this.class2596 = class2596;
    }
    
    public class_2596<?> getClass_2596() {
        return this.class2596;
    }
    
    @Override
    public Class<PackDImpl_10> getClass() {
        return PackDImpl_10.class;
    }
    
    public void setSyncp(final PackDImpl_10 packDImpl_10) {
        packDImpl_10.setParsec(this);
    }
}
