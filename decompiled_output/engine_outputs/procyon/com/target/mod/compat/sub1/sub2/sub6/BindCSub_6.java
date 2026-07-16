// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub6;

import com.target.mod.compat.sub1.sub2.sub3.Initializer_1;
import net.minecraft.class_332;
import com.target.mod.compat.sub1.sub2.sub3.Initializer;

public class BindCSub_6 extends Initializer<PackDImpl_3>
{
    private final class_332 class332;
    private final float floatValue;
    
    public BindCSub_6(final class_332 class332, final float floatValue) {
        this.class332 = class332;
        BindCSub.getIntarrArray();
        this.floatValue = floatValue;
        if (com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1() != 0) {
            BindCSub.setIntarr(new int[1]);
        }
    }
    
    public class_332 getClass_332() {
        return this.class332;
    }
    
    public float getFloat() {
        return this.floatValue;
    }
    
    @Override
    public Class<PackDImpl_3> getClass() {
        return PackDImpl_3.class;
    }
    
    public void setCacheo(final PackDImpl_3 packDImpl_3) {
        packDImpl_3.setLoadb(this);
    }
}
