// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;
import java.util.Random;

public class RenderASub_10 extends AbstractSyncA<Double>
{
    private final double doubleValue;
    private final double doubleValue_1;
    private final double doubleValue_2;
    private final Random random;
    private double doubleValue_3;
    private double doubleValue_4;
    
    public RenderASub_10(final String s, final double doubleValue, final double doubleValue_1, final double doubleValue_2, final double n, final double doubleValue_3) {
        super(s, n);
        final boolean enabled_1 = AbstractSyncA.isEnabled_1();
        this.random = new Random();
        final boolean b = enabled_1;
        this.doubleValue = doubleValue;
        this.doubleValue_1 = doubleValue_1;
        this.doubleValue_2 = doubleValue_2;
        this.doubleValue_3 = n;
        this.doubleValue_4 = doubleValue_3;
        if (Initializer.getInt_1() != 0) {
            AbstractSyncA.setBool(!b);
        }
    }
    
    public double getDouble() {
        return this.doubleValue_3;
    }
    
    public void setDouble(final double a) {
        this.doubleValue_3 = Math.max(this.doubleValue, Math.min(this.doubleValue_1, Math.min(a, this.doubleValue_4)));
    }
    
    public double getDouble_1() {
        return this.doubleValue_4;
    }
    
    public void setDouble_2(final double b) {
        this.doubleValue_4 = Math.max(this.doubleValue, Math.max(this.doubleValue_3, Math.min(this.doubleValue_1, b)));
    }
    
    public int getInt() {
        final boolean enabled_1 = AbstractSyncA.isEnabled_1();
        final double n = dcmpl(this.doubleValue_3, this.doubleValue_4);
        if (!enabled_1) {
            if (n >= 0) {
                return (int)this.doubleValue_3;
            }
            final int n2 = (int)(this.doubleValue_3 + this.random.nextDouble() * (this.doubleValue_4 - this.doubleValue_3));
        }
        return (int)n;
    }
    
    public double getDouble_2() {
        final boolean enabled = AbstractSyncA.isEnabled();
        final double doubleValue_3 = this.doubleValue_3;
        final double doubleValue_4 = this.doubleValue_4;
        if (enabled) {
            if (doubleValue_3 >= doubleValue_4) {
                return this.doubleValue_3;
            }
            final double doubleValue_5 = this.doubleValue_3;
            final double n = this.random.nextDouble() * (this.doubleValue_4 - this.doubleValue_3);
        }
        return doubleValue_3 + doubleValue_4;
    }
    
    public double getDouble_3() {
        return this.doubleValue;
    }
    
    public double getDouble_4() {
        return this.doubleValue_1;
    }
    
    public double getDouble_5() {
        return this.doubleValue_2;
    }
    
    public void setDouble_1(final Double n) {
        this.setDouble(n);
    }
}
