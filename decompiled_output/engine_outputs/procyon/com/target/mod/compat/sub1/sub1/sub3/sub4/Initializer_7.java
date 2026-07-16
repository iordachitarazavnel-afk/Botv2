// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub4;

import net.minecraft.class_310;

public class Initializer_7
{
    private final int intValue = 300;
    private final class_310 class310;
    private boolean boolFlag;
    private int intValue_1;
    private int intValue_2;
    private int intValue_3;
    private int intValue_4;
    private float floatValue;
    private float floatValue_1;
    private long longValue;
    private boolean boolFlag_1;
    
    public Initializer_7() {
        this.class310 = class_310.method_1551();
        this.boolFlag = false;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.intValue_3 = 0;
        this.intValue_4 = 0;
        this.floatValue = 0.0f;
        this.floatValue_1 = 0.0f;
        this.longValue = 0L;
        this.boolFlag_1 = false;
    }
    
    public void processAll(final double n, final double n2, final int intValue_3, final int intValue_4) {
        this.boolFlag = true;
        this.intValue_1 = (int)n - intValue_3;
        this.intValue_2 = (int)n2 - intValue_4;
        this.floatValue = (float)intValue_3;
        this.floatValue_1 = (float)intValue_4;
        this.intValue_3 = intValue_3;
        this.intValue_4 = intValue_4;
        this.boolFlag_1 = false;
    }
    
    public int[] createIntarr(final double n, final double n2) {
        if (!this.boolFlag) {
            return new int[] { this.intValue_3, this.intValue_4 };
        }
        final int n3 = (int)n - this.intValue_1;
        final int n4 = (int)n2 - this.intValue_2;
        int intValue_3;
        int intValue_4;
        if (this.class310 != null && this.class310.method_22683() != null) {
            final int method_4480 = this.class310.method_22683().method_4480();
            final int method_4481 = this.class310.method_22683().method_4507();
            intValue_3 = Math.max(-50, Math.min(method_4480 - 50, n3));
            intValue_4 = Math.max(0, Math.min(method_4481 - 50, n4));
        }
        else {
            intValue_3 = Math.max(0, n3);
            intValue_4 = Math.max(0, n4);
        }
        this.intValue_3 = intValue_3;
        this.intValue_4 = intValue_4;
        this.floatValue = (float)intValue_3;
        this.floatValue_1 = (float)intValue_4;
        return new int[] { intValue_3, intValue_4 };
    }
    
    public void execute() {
        if (this.boolFlag) {
            this.boolFlag = false;
            this.boolFlag_1 = true;
            this.longValue = System.currentTimeMillis();
        }
    }
    
    public int[] getIntarrArray() {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        int boolFlag;
        final int n = boolFlag = (this.boolFlag ? 1 : 0);
        if (intarrArray == null) {
            if (n != 0) {
                return new int[] { this.intValue_3, this.intValue_4 };
            }
            final boolean boolFlag_1;
            boolFlag = ((boolFlag_1 = this.boolFlag_1) ? 1 : 0);
        }
        if (intarrArray == null) {
            if (n != 0) {
                final float method_float = this.method_float(Math.min(1.0f, (System.currentTimeMillis() - this.longValue) / 300.0f));
                final float n2 = fcmpl(method_float, 1.0f);
                if (intarrArray == null) {
                    if (n2 >= 0) {
                        this.boolFlag_1 = false;
                        this.floatValue = (float)this.intValue_3;
                        this.floatValue_1 = (float)this.intValue_4;
                        if (intarrArray == null) {
                            return new int[] { Math.round(this.floatValue), Math.round(this.floatValue_1) };
                        }
                    }
                    final int intValue_3 = this.intValue_3;
                }
                final float n3 = n2 - this.floatValue;
                final float n4 = this.intValue_4 - this.floatValue_1;
                this.floatValue += n3 * method_float * 0.3f;
                this.floatValue_1 += n4 * method_float * 0.3f;
                return new int[] { Math.round(this.floatValue), Math.round(this.floatValue_1) };
            }
            boolFlag = 2;
        }
        final int[] array = new int[boolFlag];
        array[0] = this.intValue_3;
        array[1] = this.intValue_4;
        return array;
    }
    
    private float method_float(final float n) {
        return 1.0f - (float)Math.pow(1.0f - n, 3.0);
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public boolean isEnabled_1() {
        return this.boolFlag_1;
    }
    
    public void processAll_1(final int n, final int n2, final int n3, final int n4) {
        this.intValue_3 = Math.max(0, Math.min(n - n3, this.intValue_3));
        this.intValue_4 = Math.max(0, Math.min(n2 - n4, this.intValue_4));
        if (!this.boolFlag) {
            this.floatValue = (float)this.intValue_3;
            this.floatValue_1 = (float)this.intValue_4;
        }
    }
    
    public void setIntAndInt(final int intValue_3, final int intValue_4) {
        this.intValue_3 = intValue_3;
        this.intValue_4 = intValue_4;
        this.floatValue = (float)intValue_3;
        this.floatValue_1 = (float)intValue_4;
        this.boolFlag_1 = false;
        this.boolFlag = false;
    }
}
