// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

public class Initializer_1
{
    private long longValue;
    
    public Initializer_1() {
        this.execute();
    }
    
    public void execute() {
        this.longValue = System.currentTimeMillis();
    }
    
    public boolean checkDouble(final double n) {
        final int int1 = Initializer_14.getInt();
        final double n2 = dcmpl((double)(System.currentTimeMillis() - this.longValue), n);
        if (int1 == 0 && n2 < 0) {}
        return n2 != 0.0;
    }
    
    public boolean checkFloat(final float n) {
        final int int1 = Initializer_14.getInt();
        final float n2 = fcmpl((float)(System.currentTimeMillis() - this.longValue), n);
        if (int1 == 0 && n2 < 0) {}
        return n2 != 0.0f;
    }
    
    public long getLong() {
        return System.currentTimeMillis() - this.longValue;
    }
}
