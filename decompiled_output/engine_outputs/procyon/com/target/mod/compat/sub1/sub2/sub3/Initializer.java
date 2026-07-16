// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub3;

public abstract class Initializer<L extends Initializer_1>
{
    private boolean boolFlag;
    private static int[] intArr;
    
    public Initializer() {
        this.boolFlag = false;
    }
    
    public abstract Class<L> getClass();
    
    public abstract void setPackd(final L p0);
    
    public void execute() {
        this.boolFlag = true;
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public static void setIntarr(final int[] intArr) {
        Initializer.intArr = intArr;
    }
    
    public static int[] getIntarrArray() {
        return Initializer.intArr;
    }
    
    static {
        if (getIntarrArray() != null) {
            setIntarr(new int[5]);
        }
    }
}
