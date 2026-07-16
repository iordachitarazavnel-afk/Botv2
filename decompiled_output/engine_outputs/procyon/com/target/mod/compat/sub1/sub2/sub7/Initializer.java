// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import net.minecraft.class_2246;
import java.util.Iterator;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_2338;
import net.minecraft.class_310;

public class Initializer
{
    private static final class_310 class310;
    
    public static boolean checkClass_2338(final class_2338 class_2338) {
        final int int1 = Initializer_14.getInt();
        if (Initializer.class310.field_1687 == null) {
            return false;
        }
        final class_2338 method_10084 = class_2338.method_10084();
        final class_2338 method_10085 = class_2338.method_10086(2);
        boolean method_10086;
        final boolean b = method_10086 = Initializer.class310.field_1687.method_8320(method_10084).method_26215();
        if (int1 == 0) {
            if (!b) {
                return false;
            }
            final boolean method_10087;
            method_10086 = (method_10087 = Initializer.class310.field_1687.method_8320(method_10085).method_26215());
        }
        if (int1 == 0) {
            if (b) {
                final Iterator iterator = Initializer.class310.field_1687.method_8335((class_1297)null, new class_238((double)method_10084.method_10263(), (double)method_10084.method_10264(), (double)method_10084.method_10260(), (double)(method_10084.method_10263() + 1), (double)(method_10084.method_10264() + 2), (double)(method_10084.method_10260() + 1))).iterator();
                while (iterator.hasNext()) {
                    final boolean method_10088;
                    final boolean b2 = method_10088 = ((class_1297)iterator.next()).method_5805();
                    if (int1 != 0) {
                        return method_10088;
                    }
                    if (int1 != 0 || b2) {
                        return b2;
                    }
                    if (int1 != 0) {
                        break;
                    }
                }
                return true;
            }
            method_10086 = false;
        }
        return method_10086;
    }
    
    public static boolean checkClass_2338_1(final class_2338 class_2338) {
        return Initializer.class310.field_1687 != null && (Initializer.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10540) || Initializer.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_9987)) && checkClass_2338(class_2338);
    }
    
    public static boolean checkClass_2338_2(final class_2338 class_2338) {
        return Initializer.class310.field_1687 != null && (Initializer.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10540) || Initializer.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_9987)) && checkClass_2338(class_2338);
    }
    
    static {
        class310 = class_310.method_1551();
    }
}
