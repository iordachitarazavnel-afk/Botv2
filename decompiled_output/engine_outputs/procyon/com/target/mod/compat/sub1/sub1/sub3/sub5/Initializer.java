// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub5;

import net.minecraft.class_332;
import net.minecraft.class_4185$class_4241;
import net.minecraft.class_2561;
import net.minecraft.class_4185;

public class Initializer
{
    private final class_4185 class4185;
    private static boolean boolFlag;
    
    public Initializer(final int n, final int n2, final int n3, final int n4, final class_2561 class_2561, final class_4185$class_4241 class_4185$class_4241) {
        final boolean enabled_1 = isEnabled_1();
        this.class4185 = class_4185.method_46430(class_2561, class_4185$class_4241).method_46434(n, n2, n3, n4).method_46431();
        if (enabled_1) {
            int int_1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1();
            com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int_1);
        }
    }
    
    public class_4185 getClass_4185() {
        return this.class4185;
    }
    
    public void processAll(final class_332 class_332, final int n, final int n2, final float n3) {
        final boolean enabled_1 = isEnabled_1();
        this.class4185.method_25394(class_332, n, n2, n3);
        final boolean b = enabled_1;
        if (com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1() != 0) {
            setBool(!b);
        }
    }
    
    public static void setBool(final boolean boolFlag) {
        Initializer.boolFlag = boolFlag;
    }
    
    public static boolean isEnabled() {
        return Initializer.boolFlag;
    }
    
    public static boolean isEnabled_1() {
        return !isEnabled();
    }
    
    static {
        if (isEnabled_1()) {
            setBool(true);
        }
    }
}
