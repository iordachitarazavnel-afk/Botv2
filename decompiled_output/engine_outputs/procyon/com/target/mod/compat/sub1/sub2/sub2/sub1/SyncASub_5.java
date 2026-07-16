// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub2.sub1;

public class SyncASub_5 extends Initializer
{
    private boolean boolFlag;
    private static boolean boolFlag_1;
    
    public SyncASub_5(final String s, final boolean boolFlag) {
        super(s);
        this.boolFlag = boolFlag;
    }
    
    public Boolean getBoolean() {
        return this.boolFlag;
    }
    
    @Override
    public void setObject(final Object o) {
        if (o instanceof Boolean) {
            this.boolFlag = (boolean)o;
        }
    }
    
    public void execute() {
        final String string = SyncASub_1.getString();
        final boolean boolFlag = this.boolFlag;
        if (string == null && boolFlag) {}
        this.boolFlag = boolFlag;
    }
    
    public static void setBool(final boolean boolFlag_1) {
        SyncASub_5.boolFlag_1 = boolFlag_1;
    }
    
    public static boolean isEnabled() {
        return SyncASub_5.boolFlag_1;
    }
    
    public static boolean isEnabled_1() {
        return !isEnabled();
    }
    
    static {
        if (!isEnabled()) {
            setBool(true);
        }
    }
}
