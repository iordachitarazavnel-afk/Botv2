// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

public class RenderASub_3 extends AbstractSyncA<Double>
{
    private final double doubleValue;
    private final double doubleValue_1;
    private final double doubleValue_2;
    private final int intValue;
    private static final String strValue;
    
    public RenderASub_3(final String s, final double n, final double n2, final double n3, final double n4) {
        this(s, n, n2, n3, n4, 1);
    }
    
    public RenderASub_3(final String s, final double d, final double doubleValue, final double doubleValue_1, final double doubleValue_2, final int b) {
        super(s, d);
        this.doubleValue = doubleValue;
        this.doubleValue_1 = doubleValue_1;
        this.doubleValue_2 = doubleValue_2;
        this.intValue = Math.max(0, b);
    }
    
    public void setDouble(final Double n) {
        final double max = Math.max(this.doubleValue, Math.min(this.doubleValue_1, n));
        final double pow = Math.pow(10.0, this.intValue);
        this.objValue = (T)Double.valueOf(Math.round(max * pow) / pow);
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
    
    public int getInt() {
        return this.intValue;
    }
    
    public void setDouble_1(double max) {
        max = Math.max(0.0, Math.min(1.0, max));
        this.setDouble(this.doubleValue + (this.doubleValue_1 - this.doubleValue) * max);
    }
    
    public double getDouble_3() {
        final boolean enabled_1 = AbstractSyncA.isEnabled_1();
        final double doubleValue_1 = this.doubleValue_1;
        final double doubleValue = this.doubleValue;
        if (!enabled_1) {
            if (doubleValue_1 == doubleValue) {
                return 0.0;
            }
            final double n = this.getValue() - this.doubleValue;
            final double n2 = this.doubleValue_1 - this.doubleValue;
        }
        return doubleValue_1 / doubleValue;
    }
    
    public double getDouble_4() {
        return this.getDouble_3() * 100.0;
    }
    
    public void setDouble_2(final double n) {
        this.setDouble_1(n / 100.0);
    }
    
    @Override
    public void execute() {
        this.setDouble(this.getValue() + this.doubleValue_2);
    }
    
    public void execute_1() {
        this.setDouble(this.getValue() - this.doubleValue_2);
    }
    
    @Override
    public String getString() {
        final boolean enabled = AbstractSyncA.isEnabled();
        final int intValue = this.intValue;
        if (enabled) {
            if (intValue == 0) {
                return String.valueOf(this.getValue().intValue());
            }
            final int intValue2 = this.intValue;
        }
        return String.format(RenderASub_3.strValue + intValue + "f", ((AbstractSyncA<Object>)this).getValue());
    }
    
    public boolean isEnabled() {
        return true;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 93);
        final char[] charArray = "\f$".toCharArray();
        final int length = charArray.length;
        int n4 = 0;
        while (true) {
            Label_0128: {
                if (length > 1) {
                    break Label_0128;
                }
                n3 = (n2 = n4);
                do {
                    final char c = charArray[n2];
                    charArray[n3] = (char)(c ^ (n ^ switch (n4 % 7) {
                        case 0 -> 116;
                        case 1 -> 87;
                        case 2 -> 60;
                        case 3 -> 20;
                        case 4 -> 30;
                        case 5 -> 9;
                        default -> 79;
                    }));
                    ++n4;
                } while (n == 0);
            }
            if (length <= n4) {
                strValue = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
