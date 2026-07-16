// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub4;

import net.minecraft.class_332;

public class Initializer
{
    private final float floatValue = 0.2f;
    private float floatValue_1;
    private float floatValue_2;
    private boolean boolFlag;
    private float floatValue_3;
    private float floatValue_4;
    
    public Initializer() {
        this.floatValue_1 = 0.0f;
        this.floatValue_2 = 0.0f;
        this.boolFlag = false;
        this.floatValue_3 = 0.0f;
        this.floatValue_4 = 0.0f;
    }
    
    public void setFloat(final float b) {
        this.floatValue_2 = Math.max(0.0f, b);
        if (this.floatValue_1 > this.floatValue_2) {
            this.floatValue_1 = this.floatValue_2;
            this.floatValue_3 = this.floatValue_2;
        }
    }
    
    public void setDouble(final double n) {
        this.floatValue_3 -= (float)(n * 10.0);
        this.floatValue_3 = Math.max(0.0f, Math.min(this.floatValue_3, this.floatValue_2));
    }
    
    public void execute() {
        if (Math.abs(this.floatValue_3 - this.floatValue_4) > 0.1f) {
            this.floatValue_4 += (this.floatValue_3 - this.floatValue_4) * 0.2f;
        }
        else {
            this.floatValue_4 = this.floatValue_3;
        }
        this.floatValue_1 = this.floatValue_4;
    }
    
    public boolean checkCondition(final double n, final double n2, final double n3, final double double1, final int n4, final int n5, final int n6) {
        if (Initializer_1.checkCondition(n, n2, n4, n5, n6, 200) && this.floatValue_2 > 0.0f) {
            this.setDouble(double1);
            return true;
        }
        return false;
    }
    
    public boolean checkCondition_1(final double n, final double n2, final int n3, final int n4, final int n5, final int n6) {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        final float n7 = fcmpg(this.floatValue_2, 0.0f);
        if (intarrArray == null && n7 <= 0) {
            return false;
        }
        final boolean checkCondition = Initializer_1.checkCondition(n, n2, (int)n7, n4, 6, n6);
        if (intarrArray == null && checkCondition) {
            this.floatValue_3 = (float)(n2 - n4) / n6 * this.floatValue_2;
            this.floatValue_3 = Math.max(0.0f, Math.min(this.floatValue_3, this.floatValue_2));
            return this.boolFlag = true;
        }
        return checkCondition;
    }
    
    public void processAll(final class_332 class_332, final int n, final int n2, final int n3, final float n4) {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        final float n5 = fcmpg(this.floatValue_2, 0.0f);
        if (intarrArray == null && n5 <= 0) {
            return;
        }
        final int n6 = (int)n5;
        final int n7 = n2 + 18;
        final int n8 = 150;
        final int n9 = 4;
        Initializer_1.processAll(class_332, n6, n7, n9, n8, 2, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(1342177280, n4));
        final float n10 = this.floatValue_1 / this.floatValue_2;
        final int max = Math.max(20, (int)(0.3f * n8));
        Initializer_1.processAll(class_332, n6, n7 + (int)((n8 - max) * n10), n9, max, 2, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt(), n4));
    }
    
    public void execute_1() {
        this.boolFlag = false;
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public int getInt() {
        return -(int)this.floatValue_1;
    }
    
    public void execute_2() {
        this.floatValue_1 = 0.0f;
        this.floatValue_3 = 0.0f;
        this.floatValue_4 = 0.0f;
        this.floatValue_2 = 0.0f;
    }
}
