// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import java.util.Random;

public final class Initializer_2
{
    public static Random random;
    
    public static double method_double(final double n, final double n2) {
        return n2 * Math.round(n / n2);
    }
    
    public static int method_int(final int n, final int n2) {
        final int int_1 = Initializer_21.getInt_1();
        int n3 = n;
        int nextInt = n2;
        if (int_1 != 0) {
            if (n >= n2) {
                return n;
            }
            n3 = n;
            nextInt = Initializer_2.random.nextInt(n2 - n);
        }
        return n3 + nextInt;
    }
    
    public static double method_double_1(double max, final double n, final double n2) {
        max = Math.max(0.0, Math.min(1.0, max));
        return n + (n2 - n) * (max * max * (3.0 - 2.0 * max));
    }
    
    public static double method_double_2(final float n, final double n2, final double b) {
        final int int1 = Initializer_21.getInt();
        final int n3 = (int)Math.ceil(Math.abs(b - n2) * n);
        final int n4 = int1;
        double a = n2;
        double b2 = b;
        if (n4 == 0) {
            if (n2 < b) {
                return Math.min(n2 + n3, b);
            }
            a = n2 - n3;
            b2 = b;
        }
        return Math.max(a, b2);
    }
    
    public static double method_double_3(final double b, final double a, final double a2) {
        return Math.max(a, Math.min(a2, b));
    }
    
    public static float method_float(final float b, final float a, final float a2) {
        return Math.max(a, Math.min(a2, b));
    }
    
    public static int method_int_1(final int b, final int a, final int a2) {
        return Math.max(a, Math.min(a2, b));
    }
    
    static {
        Initializer_2.random = new Random(System.currentTimeMillis());
    }
}
