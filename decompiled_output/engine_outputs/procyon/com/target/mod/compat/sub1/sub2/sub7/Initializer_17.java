// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import java.util.Random;

public class Initializer_17
{
    private static final Random random;
    
    public static int method_int(final int n, final int n2) {
        final int int1 = Initializer_14.getInt();
        int n3 = n;
        int nextInt = n2;
        if (int1 == 0) {
            if (n >= n2) {
                return n;
            }
            n3 = n;
            nextInt = Initializer_17.random.nextInt(n2 - n + 1);
        }
        return n3 + nextInt;
    }
    
    public static double method_double(final double n, final double n2) {
        final int int_1 = Initializer_14.getInt_1();
        double n3 = n;
        double n4 = n2;
        if (int_1 != 0) {
            if (n >= n2) {
                return n;
            }
            n3 = n;
            n4 = Initializer_17.random.nextDouble() * (n2 - n);
        }
        return n3 + n4;
    }
    
    public static float method_float(final float n, final float n2) {
        final int int1 = Initializer_14.getInt();
        float n3 = n;
        float n4 = n2;
        if (int1 == 0) {
            if (n >= n2) {
                return n;
            }
            n3 = n;
            n4 = Initializer_17.random.nextFloat() * (n2 - n);
        }
        return n3 + n4;
    }
    
    static {
        random = new Random();
    }
}
