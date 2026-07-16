// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub2.sub1;

public abstract class Initializer
{
    private final String strValue;
    private String strValue_1;
    private static int intValue;
    
    public Initializer(final String strValue) {
        this.strValue_1 = "";
        this.strValue = strValue;
    }
    
    public String getString() {
        return this.strValue;
    }
    
    public String getString_1() {
        return this.strValue_1;
    }
    
    public Initializer computeSynca(final String strValue_1) {
        this.strValue_1 = strValue_1;
        return this;
    }
    
    public abstract Object getValue();
    
    public abstract void setObject(final Object p0);
    
    public static void setInt(final int intValue) {
        Initializer.intValue = intValue;
    }
    
    public static int getInt() {
        return Initializer.intValue;
    }
    
    public static int getInt_1() {
        if (getInt() == 0) {
            return 17;
        }
        return 0;
    }
    
    static {
        if (getInt_1() != 0) {
            setInt(70);
        }
    }
}
