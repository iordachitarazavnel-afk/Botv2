// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub4;

import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class Initializer_3
{
    private boolean boolFlag;
    private AbstractLoadF calcG;
    
    public Initializer_3() {
        this.boolFlag = false;
        this.calcG = null;
    }
    
    public void setCalcg(final AbstractLoadF calcG) {
        this.boolFlag = true;
        this.calcG = calcG;
    }
    
    public void execute() {
        this.boolFlag = false;
        this.calcG = null;
    }
    
    public boolean checkCondition(final int int1, final int n, final int n2) {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        final boolean boolFlag = this.boolFlag;
        if (intarrArray == null && (boolFlag && this.calcG != null)) {
            Label_0054: {
                if (int1 == 256) {
                    this.calcG.setInt(-1);
                    if (intarrArray == null) {
                        break Label_0054;
                    }
                }
                this.calcG.setInt(int1);
            }
            this.execute();
            final com.target.mod.compat.sub1.sub1.sub1.Initializer_3 eventc = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.getEventc();
            if (intarrArray == null) {
                if (eventc == null) {
                    return true;
                }
                com.target.mod.compat.sub1.sub1.sub1.Initializer_1.getEventc();
            }
            eventc.execute_2();
            return true;
        }
        return boolFlag;
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public AbstractLoadF getCalcg() {
        return this.calcG;
    }
    
    public boolean checkCalcg(final AbstractLoadF abstractLoadF) {
        return this.boolFlag && this.calcG == abstractLoadF;
    }
}
