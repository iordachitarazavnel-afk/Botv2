// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import java.awt.Color;
import net.minecraft.class_332;

public final class Initializer_12
{
    public static void processAll(final class_332 class_332, final Color color, final double n, final double n2, final double n3, final double n4, final double a, final double b, final double a2, final double b2, final int n5) {
        final int n6 = (int)n;
        final int n7 = (int)n2;
        processAll_4(class_332, n6, n7, (int)n3 - n6, (int)n4 - n7, color.getRGB(), (int)Math.max(Math.max(a, b), Math.max(a2, b2)));
    }
    
    public static void processAll_1(final class_332 class_332, final Color color, final double n, final double n2, final double n3, final double n4, final double n5, final int n6) {
        processAll(class_332, color, n, n2, n3, n4, n5, n5, n5, n5, n6);
    }
    
    public static void processAll_2(final class_332 class_332, final Color color, final double n, final double n2, final double n3, final int n4) {
        final int n5 = (int)n;
        final int n6 = (int)n2;
        for (int n7 = (int)n3, i = -n7; i <= n7; ++i) {
            for (int j = -n7; j <= n7; ++j) {
                if (i * i + j * j <= n7 * n7) {
                    class_332.method_25294(n5 + i, n6 + j, n5 + i + 1, n6 + j + 1, color.getRGB());
                }
            }
        }
    }
    
    public static void processAll_3(final class_332 class_332, final Color color, final double n, final double n2, final double n3, final double n4, final double a, final double b, final double a2, final double b2, final double b3, final int n5) {
        final int n6 = (int)n;
        final int n7 = (int)n2;
        processAll_5(class_332, n6, n7, (int)n3 - n6, (int)n4 - n7, color.getRGB(), (int)Math.max(Math.max(a, b), Math.max(a2, b2)), (int)Math.max(1.0, b3));
    }
    
    private static void processAll_4(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        class_332.method_25294(n + n6, n2, n + n3 - n6, n2 + n4, n5);
        class_332.method_25294(n, n2 + n6, n + n3, n2 + n4 - n6, n5);
        processAll_6(class_332, n, n2, n6, n5, 0);
        processAll_6(class_332, n + n3 - n6, n2, n6, n5, 1);
        processAll_6(class_332, n, n2 + n4 - n6, n6, n5, 2);
        processAll_6(class_332, n + n3 - n6, n2 + n4 - n6, n6, n5, 3);
    }
    
    private static void processAll_5(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        class_332.method_25294(n + n6, n2, n + n3 - n6, n2 + n7, n5);
        class_332.method_25294(n + n6, n2 + n4 - n7, n + n3 - n6, n2 + n4, n5);
        class_332.method_25294(n, n2 + n6, n + n7, n2 + n4 - n6, n5);
        class_332.method_25294(n + n3 - n7, n2 + n6, n + n3, n2 + n4 - n6, n5);
        processAll_7(class_332, n, n2, n6, n5, n7, 0);
        processAll_7(class_332, n + n3 - n6, n2, n6, n5, n7, 1);
        processAll_7(class_332, n, n2 + n4 - n6, n6, n5, n7, 2);
        processAll_7(class_332, n + n3 - n6, n2 + n4 - n6, n6, n5, n7, 3);
    }
    
    private static void processAll_6(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n3; ++j) {
                final int n6 = (n5 == 0 || n5 == 2) ? (n3 - 1 - i) : i;
                final int n7 = (n5 == 0 || n5 == 1) ? (n3 - 1 - j) : j;
                if (Math.sqrt(n6 * n6 + n7 * n7) <= n3) {
                    class_332.method_25294(n + i, n2 + j, n + i + 1, n2 + j + 1, n4);
                }
            }
        }
    }
    
    private static void processAll_7(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n3; ++j) {
                final int n7 = (n6 == 0 || n6 == 2) ? (n3 - 1 - i) : i;
                final int n8 = (n6 == 0 || n6 == 1) ? (n3 - 1 - j) : j;
                final double sqrt = Math.sqrt(n7 * n7 + n8 * n8);
                if (sqrt <= n3 && sqrt >= n3 - n5) {
                    class_332.method_25294(n + i, n2 + j, n + i + 1, n2 + j + 1, n4);
                }
            }
        }
    }
    
    public static void execute() {
    }
    
    public static void execute_1() {
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
}
