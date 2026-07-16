// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

public class RenderASub_8 extends AbstractSyncA<Double>
{
    private final double doubleValue;
    private final double doubleValue_1;
    
    public RenderASub_8(final String s, final double n, final double doubleValue, final double doubleValue_1) {
        super(s, n);
        this.doubleValue = doubleValue;
        this.doubleValue_1 = doubleValue_1;
        this.setDouble(n);
    }
    
    public void setDouble(final Double n) {
        if (AbstractSyncA.isEnabled()) {
            if (n == null) {
                return;
            }
            this.objValue = (T)Double.valueOf(Math.max(this.doubleValue, Math.min(this.doubleValue_1, n)));
        }
    }
    
    public double getDouble() {
        return this.doubleValue;
    }
    
    public double getDouble_1() {
        return this.doubleValue_1;
    }
    
    public void setDouble_1(final double n) {
        this.setDouble(this.getValue() + n);
    }
    
    public void setDouble_2(final double n) {
        this.setDouble(this.getValue() - n);
    }
}
