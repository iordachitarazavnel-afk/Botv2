// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import java.util.Iterator;
import net.minecraft.class_1293;
import net.minecraft.class_1844;
import net.minecraft.class_9334;
import net.minecraft.class_1291;
import java.util.ArrayList;
import net.minecraft.class_1802;
import net.minecraft.class_1799;
import java.util.function.Predicate;
import net.minecraft.class_1792;
import java.util.Random;
import net.minecraft.class_310;

public class Initializer_10
{
    private static final class_310 class310;
    private static final Random random;
    
    public static boolean checkClass_1792(final class_1792 class_1792) {
        if (Initializer_10.class310.field_1724 == null) {
            return false;
        }
        for (int i = 0; i < 9; ++i) {
            if (Initializer_10.class310.field_1724.method_31548().method_5438(i).method_31574(class_1792)) {
                Initializer_8.setClass_1661AndInt(Initializer_10.class310.field_1724.method_31548(), i);
                return true;
            }
        }
        return false;
    }
    
    public static void setInt(final int n) {
        if (Initializer_10.class310.field_1724 != null) {
            Initializer_8.setClass_1661AndInt(Initializer_10.class310.field_1724.method_31548(), n);
        }
    }
    
    public static boolean isEnabled() {
        if (Initializer_10.class310.field_1724 == null) {
            return false;
        }
        for (int i = 0; i < 9; ++i) {
            if (Initializer_8.checkClass_1792(Initializer_10.class310.field_1724.method_31548().method_5438(i).method_7909())) {
                Initializer_8.setClass_1661AndInt(Initializer_10.class310.field_1724.method_31548(), i);
                return true;
            }
        }
        return false;
    }
    
    public static boolean isEnabled_1() {
        if (Initializer_10.class310.field_1724 == null) {
            return false;
        }
        for (int i = 0; i < 9; ++i) {
            if (Initializer_8.checkClass_1792_1(Initializer_10.class310.field_1724.method_31548().method_5438(i).method_7909())) {
                Initializer_8.setClass_1661AndInt(Initializer_10.class310.field_1724.method_31548(), i);
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkPredicate(final Predicate<class_1792> predicate) {
        if (Initializer_10.class310.field_1724 == null) {
            return false;
        }
        for (int i = 0; i < 9; ++i) {
            if (predicate.test(Initializer_10.class310.field_1724.method_31548().method_5438(i).method_7909())) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkPredicate_1(final Predicate<class_1792> predicate) {
        if (Initializer_10.class310.field_1724 == null) {
            return false;
        }
        for (int i = 0; i < 9; ++i) {
            if (predicate.test(Initializer_10.class310.field_1724.method_31548().method_5438(i).method_7909())) {
                Initializer_8.setClass_1661AndInt(Initializer_10.class310.field_1724.method_31548(), i);
                return true;
            }
        }
        return false;
    }
    
    public static int method_int_1(final class_1792 class_1792) {
        if (Initializer_10.class310.field_1724 == null) {
            return 0;
        }
        int n = 0;
        for (int i = 0; i < Initializer_10.class310.field_1724.method_31548().method_5439(); ++i) {
            final class_1799 method_5438 = Initializer_10.class310.field_1724.method_31548().method_5438(i);
            if (method_5438.method_31574(class_1792)) {
                n += method_5438.method_7947();
            }
        }
        return n;
    }
    
    public static int method_int_3(final Predicate<class_1792> predicate) {
        if (Initializer_10.class310.field_1724 == null) {
            return 0;
        }
        int n = 0;
        for (int i = 9; i < 36; ++i) {
            final class_1799 class_1799 = (class_1799)Initializer_8.computeClass_2371(Initializer_10.class310.field_1724.method_31548()).get(i);
            if (predicate.test(class_1799.method_7909())) {
                n += class_1799.method_7947();
            }
        }
        return n;
    }
    
    public static int getInt() {
        if (Initializer_10.class310.field_1724 == null) {
            return -1;
        }
        for (int i = 9; i < 45; ++i) {
            if (Initializer_10.class310.field_1724.field_7498.method_7611(i).method_7677().method_31574(class_1802.field_8288)) {
                return i;
            }
        }
        return -1;
    }
    
    public static int getInt_1() {
        if (Initializer_10.class310.field_1724 == null) {
            return -1;
        }
        final ArrayList list = new ArrayList();
        for (int i = 9; i < 45; ++i) {
            if (Initializer_10.class310.field_1724.field_7498.method_7611(i).method_7677().method_31574(class_1802.field_8288)) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            return -1;
        }
        return (int)list.get(Initializer_10.random.nextInt(list.size()));
    }
    
    public static boolean checkCondition(final class_1291 class_1291, final int n, final int n2, final class_1799 class_1292) {
        final int int1 = Initializer_14.getInt();
        Object method_58694 = class_1292;
        if (int1 == 0) {
            if (!class_1292.method_31574(class_1802.field_8436)) {
                return false;
            }
            method_58694 = class_1292.method_58694(class_9334.field_49651);
        }
        final class_1844 class_1293 = (class_1844)method_58694;
        if (int1 == 0 && class_1293 == null) {
            return false;
        }
        for (final class_1293 class_1295 : class_1293.method_57397()) {
            final class_1293 class_1294 = class_1295;
            Label_0133: {
                if (int1 != 0 || class_1295.method_5579().comp_349() == class_1291) {
                    final int method_58695 = class_1295.method_5578();
                    final int n3 = n - 1;
                    if (int1 == 0) {
                        if (method_58695 < n3) {
                            break Label_0133;
                        }
                        final int method_58696;
                        final int n4 = method_58696 = class_1294.method_5578();
                        if (int1 != 0) {
                            return n4 != 0;
                        }
                    }
                    if (method_58695 > n3) {
                        break Label_0133;
                    }
                    final int n4 = true ? 1 : 0;
                    return n4 != 0;
                }
            }
            if (int1 != 0) {
                break;
            }
        }
        return false;
    }
    
    public static int method_int(final class_1291 class_1291, final int n, final int n2) {
        if (Initializer_10.class310.field_1724 == null) {
            return -1;
        }
        for (int i = 9; i < 45; ++i) {
            if (checkCondition(class_1291, n, n2, Initializer_10.class310.field_1724.field_7498.method_7611(i).method_7677())) {
                return i;
            }
        }
        return -1;
    }
    
    public static int method_int_2(final class_1291 class_1291, final int n, final int n2) {
        if (Initializer_10.class310.field_1724 == null) {
            return -1;
        }
        for (int i = 9; i < 45; ++i) {
            if (checkCondition(class_1291, n, n2, Initializer_10.class310.field_1724.field_7498.method_7611(i).method_7677())) {
                return i;
            }
        }
        return -1;
    }
    
    static {
        class310 = class_310.method_1551();
        random = new Random();
    }
}
