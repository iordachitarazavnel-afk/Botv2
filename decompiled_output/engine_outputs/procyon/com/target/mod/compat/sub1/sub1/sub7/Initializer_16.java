// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import net.minecraft.class_746;
import net.minecraft.class_243;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import net.minecraft.class_1657;

public class Initializer_16
{
    public static boolean checkClass_1657(final class_1657 class_1657) {
        final int int_1 = Initializer_21.getInt_1();
        Object field_1724;
        final class_746 class_1658 = (class_746)(field_1724 = Initializer_1.class310.field_1724);
        if (int_1 != 0) {
            if (class_1658 == null) {
                return false;
            }
            field_1724 = class_1657;
        }
        if (field_1724 != null) {
            final class_243 method_1020 = Initializer_1.class310.field_1724.method_33571().method_1020(class_1657.method_73189());
            class_243 method_1021 = new class_243(method_1020.field_1352, 0.0, method_1020.field_1350);
            final double method_1022 = method_1021.method_1027();
            if (int_1 != 0) {
                if (method_1022 == 0.0) {
                    return false;
                }
                method_1021 = method_1021.method_1029();
                Math.toRadians(class_1657.method_36454());
            }
            final double n = method_1022;
            final double radians = Math.toRadians(class_1657.method_36455());
            final double n2 = dcmpg(new class_243(-Math.sin(n) * Math.cos(radians), -Math.sin(radians), Math.cos(n) * Math.cos(radians)).method_1029().method_1026(method_1021), 0.0);
            if (int_1 != 0 && n2 >= 0) {}
            return n2 != 0.0;
        }
        return false;
    }
}
