// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub3;

import java.util.ArrayList;
import net.minecraft.class_2520;
import java.util.function.Function;
import java.util.Iterator;
import net.minecraft.class_2499;
import java.util.List;

public class Initializer
{
    private static boolean boolFlag;
    
    public static <T extends Interface<T>> class_2499 computeClass_2499(final List<T> list) {
        final boolean enabled = isEnabled();
        final class_2499 class_2499 = new class_2499();
        final boolean b = enabled;
        while (true) {
            for (final Interface<T> interface1 : list) {
                final class_2499 class_2500 = class_2499;
                if (!b) {
                    if (com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1() != 0) {
                        setBool(!b);
                    }
                    return class_2500;
                }
                class_2500.add((Object)interface1.getClass_2487());
                if (!b) {
                    break;
                }
            }
            continue;
        }
    }
    
    public static <T> List<T> createList(final class_2499 class_2499, final Function<class_2520, T> function) {
        final boolean enabled_1 = isEnabled_1();
        final ArrayList list = new ArrayList();
        final boolean b = enabled_1;
        final Iterator iterator = class_2499.iterator();
        while (iterator.hasNext()) {
            final T apply = function.apply(iterator.next());
            if (apply != null) {
                list.add(apply);
            }
            if (b) {
                int int1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt();
                com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int1);
                break;
            }
        }
        return list;
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
