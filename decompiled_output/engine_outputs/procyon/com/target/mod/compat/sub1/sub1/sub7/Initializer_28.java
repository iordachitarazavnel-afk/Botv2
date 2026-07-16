// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

public final class Initializer_28
{
    private long longValue;
    
    public Initializer_28() {
        this.execute();
    }
    
    public long getLong() {
        return System.nanoTime() / 1000000L;
    }
    
    public boolean checkDouble(final double n) {
        final int int1 = Initializer_21.getInt();
        final double n2 = dcmpl((double)(this.getLong() - this.longValue), n);
        if (int1 == 0 && n2 < 0) {}
        return n2 != 0.0;
    }
    
    public void execute() {
        this.longValue = this.getLong();
    }
    
    public boolean checkFloat(final float n) {
        final int int_1 = Initializer_21.getInt_1();
        final float n2 = fcmpl((float)(this.getLong_1() - this.longValue), n);
        if (int_1 != 0 && n2 < 0) {}
        return n2 != 0.0f;
    }
    
    public long getLong_1() {
        return System.nanoTime() / 1000000L;
    }
}
