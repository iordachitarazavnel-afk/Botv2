// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2;

public abstract class AbstractBuildB<T extends PackDImpl> extends Initializer<T>
{
    private boolean boolFlag;
    private static int[] intArr;
    
    public AbstractBuildB() {
        this.boolFlag = false;
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public void execute() {
        this.boolFlag = true;
    }
    
    public static void setIntarr(final int[] intArr) {
        AbstractBuildB.intArr = intArr;
    }
    
    public static int[] getIntarrArray() {
        return AbstractBuildB.intArr;
    }
    
    static {
        if (getIntarrArray() != null) {
            setIntarr(new int[4]);
        }
    }
}
