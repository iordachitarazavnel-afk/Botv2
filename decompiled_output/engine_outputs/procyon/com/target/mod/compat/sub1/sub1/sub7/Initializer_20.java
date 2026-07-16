// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

public class Initializer_20
{
    private long longValue;
    
    public Initializer_20() {
        this.longValue = System.currentTimeMillis();
    }
    
    public void execute() {
        this.longValue = System.currentTimeMillis();
    }
    
    public boolean checkCondition(final long n, final boolean b) {
        final int int_1 = Initializer_21.getInt_1();
        final long n2 = lcmp(System.currentTimeMillis() - this.longValue, n);
        if (int_1 != 0 && n2 >= 0) {
            boolean b2 = b;
            if (int_1 != 0) {
                if (b) {
                    this.execute();
                }
                b2 = true;
            }
            return b2;
        }
        return n2 != 0L;
    }
    
    public boolean checkFloat(final float n) {
        final int int1 = Initializer_21.getInt();
        final long n2 = lcmp(System.currentTimeMillis() - this.longValue, (long)n);
        if (int1 == 0 && n2 < 0) {}
        return n2 != 0L;
    }
    
    public long getLong() {
        return System.currentTimeMillis() - this.longValue;
    }
}
