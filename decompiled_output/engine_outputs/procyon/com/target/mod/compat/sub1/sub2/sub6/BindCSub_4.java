// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub6;

import com.target.mod.compat.sub1.sub2.sub3.Initializer_1;
import net.minecraft.class_332;
import com.target.mod.compat.sub1.sub2.sub3.Initializer;

public class BindCSub_4 extends Initializer<PackDImpl_9>
{
    private final class_332 class332;
    private final float floatValue;
    
    public BindCSub_4(final class_332 class332, final float floatValue) {
        this.class332 = class332;
        final int[] intarrArray = BindCSub.getIntarrArray();
        this.floatValue = floatValue;
        if (intarrArray == null) {
            int int1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt();
            com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int1);
        }
    }
    
    public class_332 getClass_332() {
        return this.class332;
    }
    
    public float getFloat() {
        return this.floatValue;
    }
    
    @Override
    public Class<PackDImpl_9> getClass() {
        return PackDImpl_9.class;
    }
    
    public void setStepx(final PackDImpl_9 packDImpl_9) {
        packDImpl_9.setClass_332AndFloat(this.class332, this.floatValue);
    }
}
