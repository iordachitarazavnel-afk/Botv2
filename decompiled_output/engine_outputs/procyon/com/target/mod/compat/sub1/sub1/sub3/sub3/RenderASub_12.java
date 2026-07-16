// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

import com.target.mod.compat.sub1.sub1.sub7.Initializer_6;

public class RenderASub_12 extends AbstractSyncA<Initializer_6>
{
    private final double doubleValue;
    private final double doubleValue_1;
    private final double doubleValue_2;
    private final double doubleValue_3;
    private final boolean boolFlag;
    
    public RenderASub_12(final String s, final Initializer_6 initializer_6, final double doubleValue, final double doubleValue_1, final double doubleValue_2, final double doubleValue_3, final boolean boolFlag) {
        super(s, initializer_6);
        this.doubleValue = doubleValue;
        this.doubleValue_1 = doubleValue_1;
        this.doubleValue_2 = doubleValue_2;
        this.doubleValue_3 = doubleValue_3;
        this.boolFlag = boolFlag;
    }
    
    public RenderASub_12(final String s, final Initializer_6 initializer_6, final double n, final double n2) {
        this(s, initializer_6, n, n2, n, n2, false);
    }
    
    public double getDouble() {
        return this.doubleValue;
    }
    
    public double getDouble_1() {
        return this.doubleValue_1;
    }
    
    public double getDouble_2() {
        return this.doubleValue_2;
    }
    
    public double getDouble_3() {
        return this.doubleValue_3;
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public double getDouble_4() {
        return this.getValue().getDouble();
    }
    
    public void setCalcv(final Initializer_6 object) {
        final boolean enabled_1 = AbstractSyncA.isEnabled_1();
        double n2;
        final double n = n2 = dcmpg(object.doubleValue, this.doubleValue);
        if (!enabled_1) {
            if (n < 0) {
                return;
            }
            final int n3;
            n2 = (n3 = dcmpl(object.doubleValue_1, this.doubleValue_1));
        }
        if (!enabled_1) {
            if (n > 0) {
                return;
            }
            n2 = dcmpl(object.doubleValue, object.doubleValue_1);
        }
        if (n2 <= 0) {
            super.setObject(object);
        }
    }
    
    @Override
    public void execute() {
        this.objValue = (T)new Initializer_6(((Initializer_6)this.objValue_1).doubleValue, ((Initializer_6)this.objValue_1).doubleValue_1);
    }
}
