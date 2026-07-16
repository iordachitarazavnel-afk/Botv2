// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_2680;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_310;

public class Initializer_24
{
    private static final class_310 class310;
    
    public static boolean checkClass_2338(final class_2338 class_2338) {
        final class_2680 method_8320 = Initializer_24.class310.field_1687.method_8320(class_2338);
        return (method_8320.method_27852(class_2246.field_10540) || method_8320.method_27852(class_2246.field_9987)) && checkClass_2338_1(class_2338);
    }
    
    public static boolean checkClass_2338_1(final class_2338 class_2338) {
        final class_2338 method_10084 = class_2338.method_10084();
        if (!Initializer_24.class310.field_1687.method_22347(method_10084)) {
            return false;
        }
        final double n = method_10084.method_10263();
        final double n2 = method_10084.method_10264();
        final double n3 = method_10084.method_10260();
        return Initializer_24.class310.field_1687.method_8335((class_1297)null, new class_238(n, n2, n3, n + 1.0, n2 + 2.0, n3 + 1.0)).isEmpty();
    }
    
    public static boolean checkClass_2338_2(final class_2338 class_2338) {
        final int int_1 = Initializer_21.getInt_1();
        final class_2680 method_8320 = Initializer_24.class310.field_1687.method_8320(class_2338);
        final int n = int_1;
        boolean method_8321;
        final boolean b = method_8321 = method_8320.method_27852(class_2246.field_10540);
        Label_0043: {
            if (n != 0) {
                if (b) {
                    break Label_0043;
                }
                final boolean method_8322;
                method_8321 = (method_8322 = method_8320.method_27852(class_2246.field_9987));
            }
            if (n != 0) {
                if (b) {
                    break Label_0043;
                }
                method_8321 = false;
            }
            return method_8321;
        }
        final class_2338 method_8323 = class_2338.method_10084();
        int n3;
        final int n2 = n3 = (Initializer_24.class310.field_1687.method_22347(method_8323) ? 1 : 0);
        if (n != 0) {
            if (n2 == 0) {
                return false;
            }
            n3 = method_8323.method_10263();
        }
        final double n4 = n3;
        final double n5 = method_8323.method_10264();
        final double n6 = method_8323.method_10260();
        return Initializer_24.class310.field_1687.method_8335((class_1297)null, new class_238(n4, n5, n6, n4 + 1.0, n5 + 2.0, n6 + 1.0)).isEmpty();
    }
    
    static {
        class310 = class_310.method_1551();
    }
}
