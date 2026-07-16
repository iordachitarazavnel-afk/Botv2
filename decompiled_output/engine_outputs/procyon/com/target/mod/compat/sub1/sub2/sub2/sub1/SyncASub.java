// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub2.sub1;

public class SyncASub extends Initializer
{
    private final double doubleValue;
    private final double doubleValue_1;
    private final double doubleValue_2;
    private double doubleValue_3;
    private double doubleValue_4;
    private static final String strValue;
    
    public SyncASub(final String s, final double doubleValue, final double doubleValue_1, final double doubleValue_2, final double doubleValue_3, final double doubleValue_4) {
        SyncASub_1.getString();
        super(s);
        this.doubleValue = doubleValue;
        this.doubleValue_1 = doubleValue_1;
        this.doubleValue_3 = doubleValue_2;
        this.doubleValue_4 = doubleValue_3;
        this.doubleValue_2 = doubleValue_4;
        if (Initializer.getInt() == 0) {
            SyncASub_1.setString("VI4EN");
        }
    }
    
    @Override
    public String getString() {
        return String.format(SyncASub.strValue, this.doubleValue_3, this.doubleValue_4);
    }
    
    @Override
    public void setObject(final Object o) {
        final String string = SyncASub_1.getString();
        Object o2 = o;
        if (string == null) {
            if (!(o instanceof double[])) {
                return;
            }
            o2 = o;
        }
        final double[] array = (double[])o2;
        if (string == null) {
            if (array.length != 2) {
                return;
            }
            this.doubleValue_3 = Math.max(this.doubleValue, Math.min(this.doubleValue_1, array[0]));
        }
        this.doubleValue_4 = Math.max(this.doubleValue, Math.min(this.doubleValue_1, array[1]));
    }
    
    public double getDouble() {
        return this.doubleValue_3;
    }
    
    public double getDouble_1() {
        return this.doubleValue_4;
    }
    
    public void setDouble(final double b) {
        this.doubleValue_3 = Math.max(this.doubleValue, Math.min(this.doubleValue_4, b));
    }
    
    public void setDouble_1(final double b) {
        this.doubleValue_4 = Math.max(this.doubleValue_3, Math.min(this.doubleValue_1, b));
    }
    
    public double getDouble_2() {
        return this.doubleValue;
    }
    
    public double getDouble_3() {
        return this.doubleValue_1;
    }
    
    public double getDouble_4() {
        return this.doubleValue_2;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 112);
        final char[] charArray = "\rw~\u00133C\n\rw~\u0013".toCharArray();
        final int length = charArray.length;
        int n4 = 0;
        while (true) {
            Label_0127: {
                if (length > 1) {
                    break Label_0127;
                }
                n3 = (n2 = n4);
                do {
                    final char c = charArray[n2];
                    charArray[n3] = (char)(c ^ (n ^ switch (n4 % 7) {
                        case 0 -> 88;
                        case 1 -> 41;
                        case 2 -> 63;
                        case 3 -> 5;
                        case 4 -> 99;
                        case 5 -> 30;
                        default -> 90;
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
