// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import net.minecraft.class_1802;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2371;
import com.target.mod.compat.sub1.sub3.sub3.Interface_3;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub3.sub1.MainClass;
import net.minecraft.class_1661;
import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;

public class Initializer_8
{
    private static Initializer[] SyncAArray;
    
    public static int method_int(final class_1661 class_1661) {
        return ((MainClass)class_1661).getInt();
    }
    
    public static void setClass_1661AndInt(final class_1661 class_1661, final int int1) {
        if (int1 >= 0 && int1 < 9 && method_int(class_1661) != int1) {
            ((MainClass)class_1661).setInt(int1);
            execute();
        }
    }
    
    public static void execute() {
        final class_310 method_1551 = class_310.method_1551();
        if (method_1551.field_1761 != null) {
            ((Interface_3)method_1551.field_1761).syncSlot();
        }
    }
    
    public static class_2371<class_1799> computeClass_2371(final class_1661 class_1661) {
        return ((MainClass)class_1661).getMain();
    }
    
    public static boolean checkClass_1792(final class_1792 class_1792) {
        final int int_1 = Initializer_14.getInt_1();
        class_1792 class_1793 = class_1792;
        class_1792 class_1794 = class_1792;
        class_1792 class_1795 = class_1792;
        class_1792 class_1796 = class_1792;
        class_1792 class_1797 = class_1792;
        class_1792 class_1801;
        class_1792 field_8802;
        class_1792 class_1800;
        class_1792 class_1799;
        final class_1792 class_1798 = class_1799 = (class_1800 = (field_8802 = (class_1801 = class_1802.field_8091)));
        if (int_1 != 0) {
            if (class_1792 == class_1798) {
                return true;
            }
            class_1793 = class_1792;
            class_1794 = class_1792;
            class_1795 = class_1792;
            class_1796 = class_1792;
            class_1797 = class_1792;
            final class_1792 class_1802;
            class_1799 = (class_1802 = (class_1800 = (field_8802 = (class_1801 = net.minecraft.class_1802.field_8528))));
        }
        if (int_1 != 0) {
            if (class_1797 == class_1798) {
                return true;
            }
            class_1793 = class_1792;
            class_1794 = class_1792;
            class_1795 = class_1792;
            class_1796 = class_1792;
            class_1800 = (class_1799 = (field_8802 = (class_1801 = class_1802.field_8371)));
        }
        if (int_1 != 0) {
            if (class_1796 == class_1799) {
                return true;
            }
            class_1793 = class_1792;
            class_1794 = class_1792;
            class_1795 = class_1792;
            field_8802 = (class_1800 = (class_1801 = class_1802.field_8845));
        }
        if (int_1 != 0) {
            if (class_1795 == class_1800) {
                return true;
            }
            class_1793 = class_1792;
            class_1794 = class_1792;
            class_1801 = (field_8802 = class_1802.field_8802);
        }
        if (int_1 != 0) {
            if (class_1794 == field_8802) {
                return true;
            }
            class_1793 = class_1792;
            class_1801 = class_1802.field_22022;
        }
        if (class_1793 != class_1801) {
            return false;
        }
        return true;
    }
    
    public static boolean checkClass_1792_1(final class_1792 class_1792) {
        return class_1792 == class_1802.field_8406 || class_1792 == class_1802.field_8062 || class_1792 == class_1802.field_8475 || class_1792 == class_1802.field_8825 || class_1792 == class_1802.field_8556 || class_1792 == class_1802.field_22025;
    }
    
    public static boolean checkClass_1792_2(final class_1792 class_1792) {
        return checkClass_1792(class_1792) || checkClass_1792_1(class_1792);
    }
    
    public static void setSyncaarr(final Initializer[] syncAArray) {
        Initializer_8.SyncAArray = syncAArray;
    }
    
    public static Initializer[] getSyncaarrArray() {
        return Initializer_8.SyncAArray;
    }
    
    static {
        if (getSyncaarrArray() != null) {
            setSyncaarr(new Initializer[4]);
        }
    }
}
