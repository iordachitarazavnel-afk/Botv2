// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import net.minecraft.class_9334;
import java.util.Random;
import java.util.ArrayList;
import net.minecraft.class_1802;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1792;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import java.util.function.Predicate;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;

public final class Initializer_13
{
    public static void setInt(final int n) {
        if (n < 0 || n > 8) {
            return;
        }
        Initializer_8.setClass_1661AndInt(Initializer_1.class310.field_1724.method_31548(), n);
    }
    
    public static boolean checkPredicate(final Predicate<class_1799> predicate) {
        final class_1661 method_31548 = Initializer_1.class310.field_1724.method_31548();
        for (int i = 0; i < 9; ++i) {
            if (predicate.test(method_31548.method_5438(i))) {
                Initializer_8.setClass_1661AndInt(method_31548, i);
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkPredicate_1(final Predicate<class_1792> predicate) {
        final class_1661 method_31548 = Initializer_1.class310.field_1724.method_31548();
        for (int i = 0; i < 9; ++i) {
            if (predicate.test(method_31548.method_5438(i).method_7909())) {
                Initializer_8.setClass_1661AndInt(method_31548, i);
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkClass_1792(final class_1792 class_1792) {
        return checkPredicate_1(Initializer_13::lambda$swap$0);
    }
    
    public static int method_int(final class_1792 obj) {
        final class_1703 field_7512 = Initializer_1.class310.field_1724.field_7512;
        if (Initializer_1.class310.field_1724.field_7512 instanceof class_1707) {
            int n = 0;
            for (int i = 0; i < ((class_1707)Initializer_1.class310.field_1724.field_7512).method_17388() * 9; ++i) {
                if (field_7512.method_7611(i).method_7677().method_7909().equals(obj)) {
                    ++n;
                }
            }
            return n;
        }
        return 0;
    }
    
    public static int getInt() {
        final class_1661 method_31548 = Initializer_1.class310.field_1724.method_31548();
        for (int i = 9; i < 36; ++i) {
            if (method_31548.method_5438(i).method_7909() == class_1802.field_8288) {
                return i;
            }
        }
        return -1;
    }
    
    public static int getInt_1() {
        final int int_1 = Initializer_21.getInt_1();
        final class_1661 method_31548 = Initializer_1.class310.field_1724.method_31548();
        final int n = int_1;
        final ArrayList list = new ArrayList();
        int i = 9;
        while (i < 36) {
            final Object o;
            final class_1792 class_1792 = (class_1792)(o = method_31548.method_5438(i).method_7909());
            if (n == 0) {
                return (int)o;
            }
            if (class_1792 == class_1802.field_8288) {
                list.add(i);
            }
            ++i;
            if (n == 0) {
                break;
            }
        }
        int n2;
        final boolean b = (n2 = (list.isEmpty() ? 1 : 0)) != 0;
        if (n == 0) {
            return n2;
        }
        if (b) {
            return -1;
        }
        Object o = list.get(new Random().nextInt(list.size()));
        return (int)o;
    }
    
    public static int method_int_1(final class_1792 class_1792) {
        final class_1661 method_31548 = Initializer_1.class310.field_1724.method_31548();
        int n = 0;
        for (int i = 9; i < 36; ++i) {
            final class_1799 method_31549 = method_31548.method_5438(i);
            if (method_31549.method_7909() == class_1792) {
                n += method_31549.method_7947();
            }
        }
        return n;
    }
    
    public static boolean checkClass_1792_1(final class_1792 class_1792) {
        return class_1792 == class_1802.field_8091 || class_1792 == class_1802.field_8528 || class_1792 == class_1802.field_8371 || class_1792 == class_1802.field_8845 || class_1792 == class_1802.field_8802 || class_1792 == class_1802.field_22022;
    }
    
    public static boolean checkClass_1799(final class_1799 class_1799) {
        final class_1792 method_7909 = class_1799.method_7909();
        return class_1799.method_57826(class_9334.field_50077) || checkClass_1792_1(method_7909) || class_1799.method_57826(class_9334.field_54196);
    }
    
    private static boolean lambda$swap$0(final class_1792 class_1792, final class_1792 class_1793) {
        return class_1793 == class_1792;
    }
}
