// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub4;

import net.minecraft.class_332;

public class Initializer_1
{
    private static int[] intArr;
    
    public static boolean checkCondition(final double n, final double n2, final int n3, final int n4, final int n5, final int n6) {
        final int[] intarrArray = getIntarrArray();
        double n10;
        double n9;
        double n8;
        final int n7 = (int)(n8 = (n9 = (n10 = dcmpl(n, (double)n3))));
        if (intarrArray == null) {
            if (n7 < 0) {
                return false;
            }
            final double n11;
            n8 = (n11 = (n9 = (n10 = dcmpg(n, (double)(n3 + n5)))));
        }
        if (intarrArray == null) {
            if (n7 > 0) {
                return false;
            }
            n9 = (n8 = (n10 = dcmpl(n2, (double)n4)));
        }
        if (intarrArray == null) {
            if (n8 < 0) {
                return false;
            }
            n10 = (n9 = dcmpg(n2, (double)(n4 + n6)));
        }
        if (intarrArray == null) {
            if (n9 > 0) {
                return false;
            }
            n10 = 1;
        }
        return n10 != 0.0;
        n10 = (false ? 1 : 0);
        return n10 != 0.0;
    }
    
    public static void processAll(final class_332 class_332, final int n, final int n2, final int a, final int b, int min, final int n3) {
        final int[] intarrArray = getIntarrArray();
        final int n4 = min;
        if (intarrArray == null) {
            if (n4 <= 0) {
                class_332.method_25294(n, n2, n + a, n2 + b, n3);
                return;
            }
            min = Math.min(min, Math.min(a, b) / 2);
            class_332.method_25294(n + min, n2, n + a - min, n2 + b, n3);
            class_332.method_25294(n, n2 + min, n + min, n2 + b - min, n3);
            class_332.method_25294(n + a - min, n2 + min, n + a, n2 + b - min, n3);
        }
        int i = n4;
        while (i < min) {
            final int n5 = (int)(min - Math.sqrt(min * min - (min - i) * (min - i)));
            class_332.method_25294(n + n5, n2 + i, n + min, n2 + i + 1, n3);
            class_332.method_25294(n + a - min, n2 + i, n + a - n5, n2 + i + 1, n3);
            class_332.method_25294(n + n5, n2 + b - i - 1, n + min, n2 + b - i, n3);
            class_332.method_25294(n + a - min, n2 + b - i - 1, n + a - n5, n2 + b - i, n3);
            ++i;
            if (intarrArray != null) {
                break;
            }
        }
    }
    
    public static void setIntarr(final int[] intArr) {
        Initializer_1.intArr = intArr;
    }
    
    public static int[] getIntarrArray() {
        return Initializer_1.intArr;
    }
    
    static {
        if (getIntarrArray() != null) {
            setIntarr(new int[1]);
        }
    }
}
