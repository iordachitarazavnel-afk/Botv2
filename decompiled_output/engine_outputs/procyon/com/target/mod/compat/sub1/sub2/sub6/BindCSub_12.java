// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub6;

import com.target.mod.compat.sub1.sub2.sub3.Initializer_1;
import com.target.mod.compat.sub1.sub2.sub3.Initializer;

public class BindCSub_12 extends Initializer<PackDImpl_8>
{
    private final float floatValue;
    
    public BindCSub_12(final float floatValue) {
        this.floatValue = floatValue;
    }
    
    public float getFloat() {
        return this.floatValue;
    }
    
    @Override
    public Class<PackDImpl_8> getClass() {
        return PackDImpl_8.class;
    }
    
    public void setPooly(final PackDImpl_8 packDImpl_8) {
        packDImpl_8.setWrapl(this);
    }
}
