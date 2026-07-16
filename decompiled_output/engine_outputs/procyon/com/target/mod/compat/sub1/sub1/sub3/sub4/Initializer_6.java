// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub4;

import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;

class Initializer_6
{
    private final float floatValue;
    private final float floatValue_1;
    private final long longValue;
    private final long longValue_1;
    private boolean boolFlag;
    
    public Initializer_6(final float floatValue, final float floatValue_1, final long longValue, final long longValue_1) {
        Initializer_1.getIntarrArray();
        this.boolFlag = false;
        this.floatValue = floatValue;
        this.floatValue_1 = floatValue_1;
        this.longValue = longValue;
        this.longValue_1 = longValue_1;
        if (Initializer.getInt_1() != 0) {
            Initializer_1.setIntarr(new int[1]);
        }
    }
    
    public void setLong(final long n) {
        if (n - this.longValue_1 >= this.longValue) {
            this.boolFlag = true;
        }
    }
    
    public float getFloat() {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        Initializer_6 initializer_6 = this;
        if (intarrArray == null) {
            if (!this.boolFlag) {
                return this.floatValue + (this.floatValue_1 - this.floatValue) * this.method_float(Math.min(1.0f, (System.currentTimeMillis() - this.longValue_1) / (float)this.longValue));
            }
            initializer_6 = this;
        }
        return initializer_6.floatValue_1;
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    private float method_float(final float n) {
        return 1.0f - (float)Math.pow(1.0f - n, 3.0);
    }
}
