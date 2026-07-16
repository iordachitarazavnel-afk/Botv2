// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub2.sub1;

public class SyncASub_1 extends Initializer
{
    private final double doubleValue;
    private final double doubleValue_1;
    private final double doubleValue_2;
    private double doubleValue_3;
    private static String strValue;
    
    public SyncASub_1(final String s, final double doubleValue, final double doubleValue_1, final double doubleValue_2, final double doubleValue_3) {
        super(s);
        this.doubleValue = doubleValue;
        this.doubleValue_1 = doubleValue_1;
        this.doubleValue_3 = doubleValue_2;
        this.doubleValue_2 = doubleValue_3;
    }
    
    public Double getDouble() {
        return this.doubleValue_3;
    }
    
    public int getInt() {
        return (int)this.doubleValue_3;
    }
    
    public float getFloat() {
        return (float)this.doubleValue_3;
    }
    
    @Override
    public void setObject(final Object o) {
        final String string = getString();
        Object o2 = o;
        if (string == null) {
            if (!(o instanceof Number)) {
                return;
            }
            o2 = o;
        }
        this.doubleValue_3 = Math.max(this.doubleValue, Math.min(this.doubleValue_1, Math.round(((Number)o2).doubleValue() / this.doubleValue_2) * this.doubleValue_2));
    }
    
    public double getDouble_1() {
        return this.doubleValue;
    }
    
    public double getDouble_2() {
        return this.doubleValue_1;
    }
    
    public double getDouble_3() {
        return this.doubleValue_2;
    }
    
    public void execute() {
        this.setObject(this.doubleValue_3 + this.doubleValue_2);
    }
    
    public void execute_1() {
        this.setObject(this.doubleValue_3 - this.doubleValue_2);
    }
    
    public static void setString(final String strValue) {
        SyncASub_1.strValue = strValue;
    }
    
    public static String getString() {
        return SyncASub_1.strValue;
    }
    
    static {
        if (getString() != null) {
            setString("evXOEb");
        }
    }
}
