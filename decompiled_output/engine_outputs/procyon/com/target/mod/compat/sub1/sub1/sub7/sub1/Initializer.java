// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub1;

import net.minecraft.class_243;
import net.minecraft.class_2338;
import net.minecraft.class_310;

public class Initializer
{
    private static final double doubleValue = 0.15;
    private final class_310 class310;
    private boolean boolFlag;
    private class_2338 class2338;
    private int intValue;
    
    public Initializer(final class_310 class310) {
        this.boolFlag = false;
        this.class2338 = null;
        this.intValue = 0;
        this.class310 = class310;
    }
    
    public boolean isEnabled() {
        if (this.class310.field_1724 == null) {
            return false;
        }
        final class_2338 method_24515 = this.class310.field_1724.method_24515();
        final class_243 method_24516 = this.class310.field_1724.method_73189();
        final double a = method_24516.field_1352 - (method_24515.method_10263() + 0.5);
        final double a2 = method_24516.field_1350 - (method_24515.method_10260() + 0.5);
        if (Math.abs(a) < 0.15 && Math.abs(a2) < 0.15) {
            return false;
        }
        this.class2338 = method_24515;
        this.boolFlag = true;
        this.intValue = 0;
        return true;
    }
    
    public boolean isEnabled_1() {
        final boolean enabled_1 = Initializer_1.isEnabled_1();
        final boolean boolFlag = this.boolFlag;
        if (!enabled_1 && boolFlag) {
            Initializer initializer = this;
            Initializer initializer2 = this;
            if (!enabled_1) {
                if (this.class310.field_1724 == null) {
                    goto Label_0040;
                }
                initializer = this;
                initializer2 = this;
            }
            if (!enabled_1) {
                if (initializer2.class2338 == null) {
                    goto Label_0040;
                }
                ++this.intValue;
                initializer = this;
            }
            final class_243 method_73189 = initializer.class310.field_1724.method_73189();
            final double n = this.class2338.method_10263() + 0.5;
            final double n2 = this.class2338.method_10260() + 0.5;
            final double a = method_73189.field_1352 - n;
            final double a2 = method_73189.field_1350 - n2;
            final double n4;
            final double n3 = n4 = dcmpg(Math.abs(a), 0.15);
            double n5 = 0.0;
            Label_0155: {
                if (!enabled_1) {
                    if (n3 < 0) {
                        n5 = dcmpg(Math.abs(a2), 0.15);
                        if (enabled_1) {
                            break Label_0155;
                        }
                        if (n5 < 0) {
                            this.execute();
                            return false;
                        }
                    }
                    this.execute_1();
                    final int n6 = this.intValue % 2;
                }
            }
            if (!enabled_1 && n3 != 0) {}
            int n8;
            final int n7 = n8 = (int)n5;
            if (!enabled_1) {
                if (n7 != 0) {
                    final double radians = Math.toRadians(this.class310.field_1724.method_36454());
                    final double n9 = -a;
                    final double n10 = -a2;
                    final double a3 = n9 * -Math.sin(radians) + n10 * Math.cos(radians);
                    final double a4 = n9 * -Math.cos(radians) + n10 * -Math.sin(radians);
                    int n12;
                    double intValue;
                    final int n11 = (int)(intValue = (n12 = dcmpl(Math.abs(a3), 0.075)));
                    if (!enabled_1) {
                        Label_0306: {
                            if (n11 > 0) {
                                if (a3 > 0.0) {
                                    this.class310.field_1690.field_1894.method_23481(true);
                                    if (!enabled_1) {
                                        break Label_0306;
                                    }
                                }
                                this.class310.field_1690.field_1881.method_23481(true);
                            }
                        }
                        final double n13;
                        intValue = (n13 = (n12 = dcmpl(Math.abs(a4), 0.075)));
                    }
                    if (!enabled_1) {
                        Label_0361: {
                            if (n11 > 0) {
                                if (a4 > 0.0) {
                                    this.class310.field_1690.field_1849.method_23481(true);
                                    if (!enabled_1) {
                                        break Label_0361;
                                    }
                                }
                                this.class310.field_1690.field_1913.method_23481(true);
                            }
                        }
                        n12 = (int)(intValue = this.intValue);
                    }
                    if (!enabled_1) {
                        if (intValue > 100) {
                            this.execute();
                            return false;
                        }
                        n12 = 1;
                    }
                    return n12 != 0;
                }
                n8 = 1;
            }
            return n8 != 0;
        }
        return boolFlag;
    }
    
    public void execute() {
        this.boolFlag = false;
        this.class2338 = null;
        this.execute_1();
        this.intValue = 0;
    }
    
    private void execute_1() {
        this.class310.field_1690.field_1894.method_23481(false);
        this.class310.field_1690.field_1881.method_23481(false);
        this.class310.field_1690.field_1913.method_23481(false);
        this.class310.field_1690.field_1849.method_23481(false);
        this.class310.field_1690.field_1832.method_23481(false);
    }
    
    public boolean isEnabled_2() {
        return this.boolFlag;
    }
}
