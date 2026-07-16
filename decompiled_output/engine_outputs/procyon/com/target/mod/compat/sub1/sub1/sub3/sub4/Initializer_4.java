// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub4;

import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_3;

public class Initializer_4
{
    private boolean boolFlag;
    private RenderASub_3 configO;
    private boolean boolFlag_1;
    private RenderASub bindK;
    
    public Initializer_4() {
        this.boolFlag = false;
        this.configO = null;
        this.boolFlag_1 = false;
        this.bindK = null;
    }
    
    public boolean checkCondition(final RenderASub_3 renderASub_3, final double n, final double n2, final int n3, final int n4, final int n5, final int n6) {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        final boolean boolFlag = this.boolFlag;
        if (intarrArray == null) {
            if (boolFlag && this.configO == renderASub_3) {
                final boolean checkCondition = Initializer_1.checkCondition(n, n2, n3, n4, n5, n6);
                if (intarrArray == null) {
                    if (checkCondition) {
                        renderASub_3.setDouble_1(Math.max(0.0, Math.min(1.0, (n - n3) / n5)));
                        return true;
                    }
                }
            }
        }
        return boolFlag;
    }
    
    public boolean checkCondition_1(final RenderASub renderASub, final double n, final double n2, final int n3, final int n4, final int n5, final int n6) {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        final boolean boolFlag_1 = this.boolFlag_1;
        if (intarrArray == null) {
            if (boolFlag_1 && this.bindK == renderASub) {
                final boolean checkCondition = Initializer_1.checkCondition(n, n2, n3, n4, n5, n6);
                if (intarrArray == null) {
                    if (checkCondition) {
                        renderASub.setObject();
                        return true;
                    }
                }
            }
        }
        return boolFlag_1;
    }
    
    public void setConfigo(final RenderASub_3 configO) {
        this.boolFlag = true;
        this.configO = configO;
    }
    
    public void setBindk(final RenderASub bindK) {
        this.boolFlag_1 = true;
        this.bindK = bindK;
    }
    
    public void execute() {
        this.boolFlag = false;
        this.configO = null;
        this.boolFlag_1 = false;
        this.bindK = null;
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public boolean isEnabled_1() {
        return this.boolFlag_1;
    }
    
    public boolean isEnabled_2() {
        return this.boolFlag || this.boolFlag_1;
    }
}
