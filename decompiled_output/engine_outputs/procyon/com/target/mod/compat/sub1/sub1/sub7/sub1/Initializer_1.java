// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub1;

import net.minecraft.class_746;
import net.minecraft.class_3532;
import java.util.Random;
import net.minecraft.class_310;

public class Initializer_1
{
    private final class_310 class310;
    private final Random random;
    private boolean boolFlag;
    private float floatValue;
    private float floatValue_1;
    private Runnable runnable;
    private static boolean boolFlag_1;
    
    public Initializer_1(final class_310 class310) {
        this.random = new Random();
        this.boolFlag = false;
        this.class310 = class310;
    }
    
    public void processAll(final float floatValue, final float floatValue_1, final Runnable runnable) {
        this.floatValue = floatValue;
        this.floatValue_1 = floatValue_1;
        this.runnable = runnable;
        this.boolFlag = true;
    }
    
    public void setBoolAndBool(final boolean b, final boolean b2) {
        final boolean enabled_2 = isEnabled_2();
        Initializer_1 initializer_1 = this;
        if (enabled_2) {
            if (!this.boolFlag) {
                return;
            }
            initializer_1 = this;
        }
        final class_746 field_1724 = initializer_1.class310.field_1724;
        if (enabled_2) {
            if (field_1724 == null) {
                return;
            }
            final class_746 field_1725 = this.class310.field_1724;
        }
        final float method_36454 = field_1724.method_36454();
        final float method_36455 = this.class310.field_1724.method_36455();
        final float method_36456 = class_3532.method_15393(this.floatValue - method_36454);
        final float a = this.floatValue_1 - method_36455;
        float b3 = 1.0f;
        boolean b4 = b2;
        if (enabled_2) {
            if (b2) {
                b3 = 3.0f;
            }
            b4 = b;
        }
        float max = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        float n4 = 0.0f;
        Label_0216: {
            if (b4) {
                final float n = b3 + (this.random.nextFloat() - 0.5f) * 1.5f;
                max = (float)Math.sqrt(method_36456 * method_36456 + a * a);
                n2 = Math.min(1.0f, max / 20.0f);
                b3 = n * (0.2f + 0.8f * n2);
                n3 = max;
                n4 = 5.0f;
                if (!enabled_2) {
                    break Label_0216;
                }
                if (n3 > n4) {
                    final float nextFloat = this.random.nextFloat();
                    final float n5 = 0.05f;
                    if (!enabled_2) {
                        break Label_0216;
                    }
                    if (nextFloat < n5) {
                        b3 *= 0.1f;
                    }
                }
            }
            max = Math.max(0.15f, b3);
            n2 = class_3532.method_15363(method_36456, -max, max);
        }
        final float method_36457 = class_3532.method_15363(n3, n4, max);
        final float n6 = method_36454 + n2;
        final float n7 = method_36455 + method_36457;
        this.class310.field_1724.method_36456(n6);
        this.class310.field_1724.method_36457(class_3532.method_15363(n7, -90.0f, 90.0f));
        final float n8 = fcmpg(Math.abs(method_36456), 0.5f);
        if (enabled_2) {
            if (n8 >= 0) {
                return;
            }
            final float n9 = fcmpg(Math.abs(a), 0.5f);
        }
        if (n8 < 0) {
            this.class310.field_1724.method_36456(this.floatValue);
            this.class310.field_1724.method_36457(class_3532.method_15363(this.floatValue_1, -90.0f, 90.0f));
            this.boolFlag = false;
            final Runnable runnable = this.runnable;
            if (enabled_2) {
                if (runnable == null) {
                    return;
                }
                final Runnable runnable2 = this.runnable;
            }
            runnable.run();
        }
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public static void setBool(final boolean boolFlag_1) {
        Initializer_1.boolFlag_1 = boolFlag_1;
    }
    
    public static boolean isEnabled_1() {
        return Initializer_1.boolFlag_1;
    }
    
    public static boolean isEnabled_2() {
        return !isEnabled_1();
    }
    
    static {
        if (!isEnabled_2()) {
            setBool(true);
        }
    }
}
