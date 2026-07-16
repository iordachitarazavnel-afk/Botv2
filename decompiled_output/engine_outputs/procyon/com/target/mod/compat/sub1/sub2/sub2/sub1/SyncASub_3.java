// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub2.sub1;

public class SyncASub_3 extends Initializer
{
    private int intValue;
    private final boolean boolFlag;
    private boolean boolFlag_1;
    
    public SyncASub_3(final String s, final int intValue, final boolean boolFlag) {
        super(s);
        this.boolFlag_1 = false;
        this.intValue = intValue;
        this.boolFlag = boolFlag;
    }
    
    public Integer getInteger() {
        return this.intValue;
    }
    
    @Override
    public void setObject(final Object o) {
        if (o instanceof final Number n) {
            this.intValue = n.intValue();
        }
    }
    
    public int getInt() {
        return this.intValue;
    }
    
    public void setInt(final int intValue) {
        this.intValue = intValue;
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public boolean isEnabled_1() {
        return this.boolFlag;
    }
    
    public boolean isEnabled_2() {
        return this.boolFlag_1;
    }
    
    public void setBool(final boolean boolFlag_1) {
        this.boolFlag_1 = boolFlag_1;
    }
}
