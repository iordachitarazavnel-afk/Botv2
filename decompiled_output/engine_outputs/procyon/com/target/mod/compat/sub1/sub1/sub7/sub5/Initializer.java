// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub5;

import com.mojang.blaze3d.vertex.VertexFormat;
import net.minecraft.class_10799;
import net.minecraft.class_2960;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_2;
import net.minecraft.class_287;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix4fc;
import net.minecraft.class_290;
import com.mojang.blaze3d.vertex.VertexFormat$class_5596;
import net.minecraft.class_289;
import org.joml.Matrix4f;
import net.minecraft.class_332;
import net.minecraft.class_8251;

public final class Initializer
{
    public static class_8251 class8251;
    private static int intValue;
    
    public static void execute() {
    }
    
    public static void execute_1() {
    }
    
    public static void setDouble(final double n) {
    }
    
    public static void processAll(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        class_332.method_25294(n, n2, n + n3, n2 + n4, n5);
    }
    
    public static void processAll_13(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)n2, 0.0f).method_39415(n4);
        for (int i = 0; i <= 360; i += 10) {
            final double radians = Math.toRadians(i);
            method_51449.method_22918((Matrix4fc)matrix4f, (float)(Math.cos(radians) * n3) + n, (float)(Math.sin(radians) * n3) + n2, 0.0f).method_39415(n5);
        }
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_1(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)n2, 0.0f).method_39415(n5);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)(n2 + n4), 0.0f).method_39415(n5);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)(n2 + n4), 0.0f).method_39415(n6);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)n2, 0.0f).method_39415(n6);
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_2(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int... array) {
        final int length = array.length;
        try {
            if (length == 0) {
                return;
            }
        }
        catch (final IllegalArgumentException ex) {
            throw computeIllegalargumentexception(ex);
        }
        try {
            if (length == 1) {
                processAll(class_332, n, n2, n3, n4, array[0]);
                return;
            }
        }
        catch (final IllegalArgumentException ex2) {
            throw computeIllegalargumentexception(ex2);
        }
        try {
            if (length == 2) {
                processAll_1(class_332, n, n2, n3, n4, array[0], array[1]);
                return;
            }
        }
        catch (final IllegalArgumentException ex3) {
            throw computeIllegalargumentexception(ex3);
        }
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        final int n5 = n3 / (length - 1);
        for (int i = 0; i < length; ++i) {
            final int n6 = array[i];
            final int n7 = n + i * n5;
            method_51449.method_22918((Matrix4fc)matrix4f, (float)n7, (float)n2, 0.0f).method_39415(n6);
            method_51449.method_22918((Matrix4fc)matrix4f, (float)n7, (float)(n2 + n4), 0.0f).method_39415(n6);
        }
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)n2, 0.0f).method_39415(array[length - 1]);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)(n2 + n4), 0.0f).method_39415(array[length - 1]);
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_14(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)n2, 0.0f).method_39415(n5);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)n2, 0.0f).method_39415(n5);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)(n2 + n4), 0.0f).method_39415(n6);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)(n2 + n4), 0.0f).method_39415(n6);
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_15(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int... array) {
        final int length = array.length;
        try {
            if (length == 0) {
                return;
            }
        }
        catch (final IllegalArgumentException ex) {
            throw computeIllegalargumentexception(ex);
        }
        try {
            if (length == 1) {
                processAll(class_332, n, n2, n3, n4, array[0]);
                return;
            }
        }
        catch (final IllegalArgumentException ex2) {
            throw computeIllegalargumentexception(ex2);
        }
        try {
            if (length == 2) {
                processAll_14(class_332, n, n2, n3, n4, array[0], array[1]);
                return;
            }
        }
        catch (final IllegalArgumentException ex3) {
            throw computeIllegalargumentexception(ex3);
        }
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        final int n5 = n4 / (length - 1);
        for (int i = 0; i < length; ++i) {
            final int n6 = array[i];
            final int n7 = n2 + i * n5;
            method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)n7, 0.0f).method_39415(n6);
            method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)n7, 0.0f).method_39415(n6);
        }
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)(n2 + n4), 0.0f).method_39415(array[length - 1]);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)(n2 + n4), 0.0f).method_39415(array[length - 1]);
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_3(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        for (int i = n4 - 90; i <= n5 - 90; ++i) {
            final float n9 = (float)Math.toRadians(i);
            final float n10 = (float)Math.cos(n9);
            final float n11 = (float)Math.sin(n9);
            final float n12 = n + n10 * n3;
            final float n13 = n2 + n11 * n3;
            final float n14 = n + n10 * (n3 + n6);
            final float n15 = n2 + n11 * (n3 + n6);
            method_51449.method_22918((Matrix4fc)matrix4f, n12, n13, 0.0f).method_39415(n7);
            method_51449.method_22918((Matrix4fc)matrix4f, n14, n15, 0.0f).method_39415(n8);
        }
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_17(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)n2, 0.0f).method_39415(n6);
        for (int i = n4 - 90; i <= n5 - 90; ++i) {
            final double radians = Math.toRadians(i);
            method_51449.method_22918((Matrix4fc)matrix4f, (float)(Math.cos(radians) * n3) + n, (float)(Math.sin(radians) * n3) + n2, 0.0f).method_39415(n6);
        }
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_4(final class_332 class_332, final int n, final int n2, final int n3, final int n4) {
        processAll_17(class_332, n, n2, n3, 0, 360, n4);
    }
    
    public static void processAll_5(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        for (int i = n4 - 90; i <= n5 - 90; ++i) {
            final float n8 = (float)Math.toRadians(i);
            final float n9 = (float)Math.cos(n8);
            final float n10 = (float)Math.sin(n8);
            final float n11 = n + n9 * n3;
            final float n12 = n2 + n10 * n3;
            final float n13 = n + n9 * (n3 + n6);
            final float n14 = n2 + n10 * (n3 + n6);
            method_51449.method_22918((Matrix4fc)matrix4f, n11, n12, 0.0f).method_39415(n7);
            method_51449.method_22918((Matrix4fc)matrix4f, n13, n14, 0.0f).method_39415(n7);
        }
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_18(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        processAll_5(class_332, n, n2, n3, 0, 360, n4, n5);
    }
    
    public static void processAll_20(final class_332 class_332, final int n, final int n2, final int a, final int b, int method_int_1, final int n3) {
        method_int_1 = Initializer_2.method_int_1(method_int_1, 0, Math.min(a, b) / 2);
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        method_51449.method_22918((Matrix4fc)matrix4f, n + a / 2.0f, n2 + b / 2.0f, 0.0f).method_39415(n3);
        final int[][] array = { { n + a - method_int_1, n2 + method_int_1 }, { n + a - method_int_1, n2 + b - method_int_1 }, { n + method_int_1, n2 + b - method_int_1 }, { n + method_int_1, n2 + method_int_1 } };
        for (int i = 0; i < 4; ++i) {
            final int n4 = (i - 1) * 90;
            for (int n5 = n4 + 90, j = n4; j <= n5; j += 10) {
                final float n6 = (float)Math.toRadians(j);
                method_51449.method_22918((Matrix4fc)matrix4f, array[i][0] + (float)(Math.cos(n6) * method_int_1), array[i][1] + (float)(Math.sin(n6) * method_int_1), 0.0f).method_39415(n3);
            }
        }
        method_51449.method_22918((Matrix4fc)matrix4f, (float)array[0][0], (float)n2, 0.0f).method_39415(n3);
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_6(final class_332 class_332, final int n, final int n2, final int n3, final int n4, int method_int_1, int method_int_2, int method_int_3, int method_int_4, final int n5) {
        final int int1 = getInt();
        method_int_1 = Initializer_2.method_int_1(method_int_1, 0, Math.min(n3, n4) / 2);
        method_int_2 = Initializer_2.method_int_1(method_int_2, 0, Math.min(n3, n4) / 2);
        method_int_3 = Initializer_2.method_int_1(method_int_3, 0, Math.min(n3, n4) / 2);
        method_int_4 = Initializer_2.method_int_1(method_int_4, 0, Math.min(n3, n4) / 2);
        final int n6 = int1;
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        method_51449.method_22918((Matrix4fc)matrix4f, n + n3 / 2.0f, n2 + n4 / 2.0f, 0.0f).method_39415(n5);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + method_int_1), (float)n2, 0.0f).method_39415(n5);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3 - method_int_2), (float)n2, 0.0f).method_39415(n5);
        int i = -90;
    Label_0381:
        while (true) {
        Label_0537_Outer:
            while (i <= 0) {
                final float n7 = (float)Math.toRadians(i);
                final float n8 = n + n3 - method_int_2 + (float)Math.cos(n7) * method_int_2;
                final float n9 = n2 + method_int_2 + (float)Math.sin(n7) * method_int_2;
                try {
                    method_51449.method_22918((Matrix4fc)matrix4f, n8, n9, 0.0f).method_39415(n5);
                    i += 2;
                    if (n6 == 0) {
                        break Label_0381;
                    }
                    if (n6 != 0) {
                        continue Label_0537_Outer;
                    }
                }
                catch (final IllegalArgumentException ex) {
                    throw computeIllegalargumentexception(ex);
                }
                int int_1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1();
                com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int_1);
                break;
                int j = 0;
            Label_0537:
                while (true) {
                    while (j <= 90) {
                        final float n10 = (float)Math.toRadians(j);
                        final float n11 = n + n3 - method_int_3 + (float)Math.cos(n10) * method_int_3;
                        final float n12 = n2 + n4 - method_int_3 + (float)Math.sin(n10) * method_int_3;
                        try {
                            method_51449.method_22918((Matrix4fc)matrix4f, n11, n12, 0.0f).method_39415(n5);
                            j += 2;
                            if (n6 == 0) {
                                break Label_0537;
                            }
                            if (n6 != 0) {
                                continue Label_0537_Outer;
                            }
                        }
                        catch (final IllegalArgumentException ex2) {
                            throw computeIllegalargumentexception(ex2);
                        }
                        break;
                        int k = 90;
                    Label_0688:
                        while (true) {
                            while (k <= 180) {
                                final float n13 = (float)Math.toRadians(k);
                                final float n14 = n + method_int_4 + (float)Math.cos(n13) * method_int_4;
                                final float n15 = n2 + n4 - method_int_4 + (float)Math.sin(n13) * method_int_4;
                                try {
                                    method_51449.method_22918((Matrix4fc)matrix4f, n14, n15, 0.0f).method_39415(n5);
                                    k += 10;
                                    if (n6 == 0) {
                                        break Label_0688;
                                    }
                                    if (n6 != 0) {
                                        continue Label_0537_Outer;
                                    }
                                }
                                catch (final IllegalArgumentException ex3) {
                                    throw computeIllegalargumentexception(ex3);
                                }
                                break;
                                int l = 180;
                                while (l <= 270) {
                                    final float n16 = (float)Math.toRadians(l);
                                    final float n17 = n + method_int_1 + (float)Math.cos(n16) * method_int_1;
                                    final float n18 = n2 + method_int_1 + (float)Math.sin(n16) * method_int_1;
                                    try {
                                        method_51449.method_22918((Matrix4fc)matrix4f, n17, n18, 0.0f).method_39415(n5);
                                        l += 10;
                                        if (n6 == 0) {
                                            return;
                                        }
                                        if (n6 != 0) {
                                            continue Label_0537_Outer;
                                        }
                                    }
                                    catch (final IllegalArgumentException ex4) {
                                        throw computeIllegalargumentexception(ex4);
                                    }
                                    break;
                                }
                                method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + method_int_1), (float)n2, 0.0f).method_39415(n5);
                                execute_2();
                                setClass_287(method_51449);
                                execute_3();
                                return;
                            }
                            method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)(n2 + n4 - method_int_4), 0.0f).method_39415(n5);
                            method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)(n2 + method_int_1), 0.0f).method_39415(n5);
                            continue Label_0688;
                        }
                    }
                    method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3 - method_int_3), (float)(n2 + n4), 0.0f).method_39415(n5);
                    method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + method_int_4), (float)(n2 + n4), 0.0f).method_39415(n5);
                    continue Label_0537;
                }
            }
            method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)(n2 + method_int_2), 0.0f).method_39415(n5);
            method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)(n2 + n4 - method_int_3), 0.0f).method_39415(n5);
            continue Label_0381;
        }
    }
    
    public static void processAll_23(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        method_51449.method_22918((Matrix4fc)matrix4f, n + n3 / 2.0f, n2 + n4 / 2.0f, 0.0f).method_39415(n6);
        final int[][] array = { { n + n5, n2 + n5 }, { n + n3 - n5, n2 + n5 } };
        for (int i = 0; i < 2; ++i) {
            final int n7 = (i - 2) * 90;
            for (int n8 = n7 + 90, j = n7; j <= n8; j += 10) {
                final float n9 = (float)Math.toRadians(j);
                method_51449.method_22918((Matrix4fc)matrix4f, array[i][0] + (float)(Math.cos(n9) * n5), array[i][1] + (float)(Math.sin(n9) * n5), 0.0f).method_39415(n6);
            }
        }
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)(n2 + n4), 0.0f).method_39415(n6);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)(n2 + n4), 0.0f).method_39415(n6);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)array[0][1], 0.0f).method_39415(n6);
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_25(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        method_51449.method_22918((Matrix4fc)matrix4f, n + n3 / 2.0f, n2 + n4 / 2.0f, 0.0f).method_39415(n6);
        final int[][] array = { { n + n3 - n5, n2 + n4 - n5 }, { n + n5, n2 + n4 - n5 } };
        for (int i = 0; i < 2; ++i) {
            final int n7 = i * 90;
            for (int n8 = n7 + 90, j = n7; j <= n8; j += 10) {
                final float n9 = (float)Math.toRadians(j);
                method_51449.method_22918((Matrix4fc)matrix4f, array[i][0] + (float)(Math.cos(n9) * n5), array[i][1] + (float)(Math.sin(n9) * n5), 0.0f).method_39415(n6);
            }
        }
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)n2, 0.0f).method_39415(n6);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)n2, 0.0f).method_39415(n6);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)array[0][1], 0.0f).method_39415(n6);
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_21(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        processAll_20(class_332, n, n2, n3, n4, n4 / 2, n5);
    }
    
    public static void processAll_24(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        processAll_20(class_332, n, n2, n4, n3, n4 / 2, n5);
    }
    
    public static void processAll_26(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        processAll_16(class_332, n, n2, n3, n5);
        processAll_19(class_332, n, n2 + 1, n4 - 2, n5);
        processAll_19(class_332, n + n3 - 1, n2 + 1, n4 - 2, n5);
        processAll_16(class_332, n, n2 + n4 - 1, n3, n5);
    }
    
    public static void processAll_27(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        processAll_29(class_332, n, n2, n + n3, n2, n5);
        processAll_29(class_332, n, n2 + n4, n + n3, n2 + n4, n5);
        processAll_29(class_332, n, n2, n, n2 + n4, n5);
        processAll_29(class_332, n + n3, n2, n + n3, n2 + n4, n5);
    }
    
    public static void processAll_16(final class_332 class_332, final int n, final int n2, final int n3, final int n4) {
        class_332.method_25294(n, n2, n + n3, n2 + 1, n4);
    }
    
    public static void processAll_19(final class_332 class_332, final int n, final int n2, final int n3, final int n4) {
        class_332.method_25294(n, n2, n + 1, n2 + n3, n4);
    }
    
    public static void processAll_29(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)n2, 0.0f).method_39415(n5);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n3, (float)n4, 0.0f).method_39415(n5);
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_28(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        for (int i = n4 - 90; i <= n5 - 90; ++i) {
            final double radians = Math.toRadians(i);
            method_51449.method_22918((Matrix4fc)matrix4f, (float)(Math.cos(radians) * n3) + n, (float)(Math.sin(radians) * n3) + n2, 0.0f).method_39415(n6);
        }
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_22(final class_332 class_332, final int n, final int n2, final int n3, final int n4) {
        processAll_28(class_332, n, n2, n3, 0, 360, n4);
    }
    
    public static void processAll_30(final class_332 class_332, final int n, final int n2, final int a, final int b, int method_int_1, final int n3) {
        method_int_1 = Initializer_2.method_int_1(method_int_1, 0, Math.min(a, b) / 2);
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27381, class_290.field_1576);
        final int[][] array = { { n + a - method_int_1, n2 + method_int_1 }, { n + a - method_int_1, n2 + b - method_int_1 }, { n + method_int_1, n2 + b - method_int_1 }, { n + method_int_1, n2 + method_int_1 } };
        for (int i = 0; i < 4; ++i) {
            final int n4 = (i - 1) * 90;
            for (int n5 = n4 + 90, j = n4; j <= n5; j += 10) {
                final float n6 = (float)Math.toRadians(j);
                method_51449.method_22918((Matrix4fc)matrix4f, array[i][0] + (float)(Math.cos(n6) * method_int_1), array[i][1] + (float)(Math.sin(n6) * method_int_1), 0.0f).method_39415(n3);
            }
        }
        method_51449.method_22918((Matrix4fc)matrix4f, (float)array[0][0], (float)n2, 0.0f).method_39415(n3);
        execute_2();
        setClass_287(method_51449);
        execute_3();
    }
    
    public static void processAll_31(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        processAll_30(class_332, n, n2, n3, n4, n4 / 2, n5);
    }
    
    public static void processAll_32(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        processAll_30(class_332, n, n2, n4, n3, n4 / 2, n5);
    }
    
    public static void processAll_7(final class_332 class_332, final class_2960 class_333, final int n, final int n2, final int n3, final int n4) {
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27382, class_290.field_1585);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)n2, 0.0f).method_22913(0.0f, 0.0f);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)n2, 0.0f).method_22913(1.0f, 0.0f);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)(n + n3), (float)(n2 + n4), 0.0f).method_22913(1.0f, 1.0f);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)(n2 + n4), 0.0f).method_22913(0.0f, 1.0f);
        setClass_287(method_51449);
    }
    
    public static void processAll_8(final class_332 class_332, final class_2960 class_333, final int n, final int n2, final int a, final int b, int method_int_1) {
        method_int_1 = Initializer_2.method_int_1(method_int_1, 0, Math.min(a, b) / 2);
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27382, class_290.field_1585);
        method_51449.method_22918((Matrix4fc)matrix4f, n + a / 2.0f, n2 + b / 2.0f, 0.0f).method_22913(0.5f, 0.5f);
        final int[][] array = { { n + a - method_int_1, n2 + method_int_1 }, { n + a - method_int_1, n2 + b - method_int_1 }, { n + method_int_1, n2 + b - method_int_1 }, { n + method_int_1, n2 + method_int_1 } };
        for (int i = 0; i < 4; ++i) {
            final int n3 = (i - 1) * 90;
            for (int n4 = n3 + 90, j = n3; j <= n4; j += 10) {
                final float n5 = (float)Math.toRadians(j);
                final float n6 = array[i][0] + (float)(Math.cos(n5) * method_int_1);
                final float n7 = array[i][1] + (float)(Math.sin(n5) * method_int_1);
                method_51449.method_22918((Matrix4fc)matrix4f, n6, n7, 0.0f).method_22913((n6 - n) / a, (n7 - n2) / b);
            }
        }
        method_51449.method_22918((Matrix4fc)matrix4f, (float)array[0][0], (float)n2, 0.0f).method_22913((array[0][0] - (float)n) / a, 0.0f);
        setClass_287(method_51449);
    }
    
    public static void processAll_9(final class_332 class_332, final class_2960 class_333, final int n, final int n2, final int n3) {
        final int n4 = n3 / 2;
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27382, class_290.field_1585);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)n2, 0.0f).method_22913(0.5f, 0.5f);
        for (int i = 0; i <= 360; i += 10) {
            final float n5 = (float)Math.toRadians(i);
            final float n6 = (float)Math.cos(n5) * n4 + n;
            final float n7 = (float)Math.sin(n5) * n4 + n2;
            method_51449.method_22918((Matrix4fc)matrix4f, n6, n7, 0.0f).method_22913((n6 - n + n4) / n3, (n7 - n2 + n4) / n3);
        }
        setClass_287(method_51449);
    }
    
    public static void processAll_10(final class_332 class_332, final Object o, final int n, final int n2, final int n3) {
        final int n4 = n3 / 2;
        final float n5 = 0.125f;
        final float n6 = 0.125f;
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27382, class_290.field_1585);
        method_51449.method_22918((Matrix4fc)matrix4f, (float)n, (float)n2, 0.0f).method_22913(0.5f * n5 + n5, 0.5f * n6 + n6);
        for (int i = 0; i <= 360; i += 10) {
            final float n7 = (float)Math.toRadians(i);
            final float n8 = (float)Math.cos(n7) * n4 + n;
            final float n9 = (float)Math.sin(n7) * n4 + n2;
            method_51449.method_22918((Matrix4fc)matrix4f, n8, n9, 0.0f).method_22913((n8 - n + n4) / n3 * n5 + n5, (n9 - n2 + n4) / n3 * n6 + n6);
        }
        setClass_287(method_51449);
        final class_287 class_333 = null;
        class_333.method_22918((Matrix4fc)matrix4f, (float)n, (float)n2, 0.006942f).method_22913(0.5f * n5 + n5 * 5.0f, 0.5f * n6 + n6);
        for (int j = 0; j <= 360; j += 10) {
            final float n10 = (float)Math.toRadians(j);
            final float n11 = (float)Math.cos(n10) * n4 + n;
            final float n12 = (float)Math.sin(n10) * n4 + n2;
            class_333.method_22918((Matrix4fc)matrix4f, n11, n12, 0.006942f).method_22913((n11 - n + n4) / n3 * n5 + n5 * 5.0f, (n12 - n2 + n4) / n3 * n6 + n6);
        }
        setClass_287(class_333);
    }
    
    public static void processAll_11(final class_332 class_332, final Object o, final int n, final int n2, final int n3, int method_int_1) {
        method_int_1 = Initializer_2.method_int_1(method_int_1, 0, n3 / 2);
        final float n4 = 0.125f;
        final float n5 = 0.125f;
        final int[][] array = { { n + n3 - method_int_1, n2 + method_int_1 }, { n + n3 - method_int_1, n2 + n3 - method_int_1 }, { n + method_int_1, n2 + n3 - method_int_1 }, { n + method_int_1, n2 + method_int_1 } };
        final Matrix3x2fStack method_51448 = class_332.method_51448();
        final Matrix4f matrix4f = new Matrix4f(method_51448.m00(), method_51448.m01(), 0.0f, 0.0f, method_51448.m10(), method_51448.m11(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, method_51448.m20(), method_51448.m21(), 0.0f, 1.0f);
        final class_287 method_51449 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27382, class_290.field_1585);
        method_51449.method_22918((Matrix4fc)matrix4f, n + n3 / 2.0f, n2 + n3 / 2.0f, 0.0f).method_22913(0.5f * n4 + n4, 0.5f * n5 + n5);
        for (int i = 0; i < 4; ++i) {
            final int n6 = (i - 1) * 90;
            for (int n7 = n6 + 90, j = n6; j <= n7; j += 10) {
                final float n8 = (float)Math.toRadians(j);
                final float n9 = array[i][0] + (float)(Math.cos(n8) * method_int_1);
                final float n10 = array[i][1] + (float)(Math.sin(n8) * method_int_1);
                method_51449.method_22918((Matrix4fc)matrix4f, n9, n10, 0.0f).method_22913((n9 - n) / n3 * n4 + n4, (n10 - n2) / n3 * n5 + n5);
            }
        }
        method_51449.method_22918((Matrix4fc)matrix4f, (float)array[0][0], (float)n2, 0.0f).method_22913((array[0][0] - (float)n) / n3 * n4 + n4, 0.0f * n5 + n5);
        setClass_287(method_51449);
        final class_287 class_333 = null;
        class_333.method_22918((Matrix4fc)matrix4f, n + n3 / 2.0f, n2 + n3 / 2.0f, 0.0f).method_22913(0.5f * n4 + n4 * 5.0f, 0.5f * n5 + n5);
        for (int k = 0; k < 4; ++k) {
            final int n11 = (k - 1) * 90;
            for (int n12 = n11 + 90, l = n11; l <= n12; l += 10) {
                final float n13 = (float)Math.toRadians(l);
                final float n14 = array[k][0] + (float)(Math.cos(n13) * method_int_1);
                final float n15 = array[k][1] + (float)(Math.sin(n13) * method_int_1);
                class_333.method_22918((Matrix4fc)matrix4f, n14, n15, 0.0f).method_22913((n14 - n) / n3 * n4 + n4 * 5.0f, (n15 - n2) / n3 * n5 + n5);
            }
        }
        class_333.method_22918((Matrix4fc)matrix4f, (float)array[0][0], (float)n2, 0.0f).method_22913((array[0][0] - (float)n) / n3 * n4 + n4 * 5.0f, 0.0f * n5 + n5);
        setClass_287(class_333);
    }
    
    public static void execute_2() {
    }
    
    public static void execute_3() {
    }
    
    public static void setBoolAndString(final boolean b, final String s) {
        try {
            if (!b) {
                throw new IllegalArgumentException(s);
            }
        }
        catch (final IllegalArgumentException ex) {
            throw computeIllegalargumentexception(ex);
        }
    }
    
    public static void setClass_287(final class_287 class_287) {
    }
    
    public static void processAll_12(final class_332 class_332, final class_2960 class_333, final int n, final int n2, final int n3, final int n4, final float n5, final float n6, final int n7, final int n8, final int n9, final int n10) {
        class_332.method_25290(class_10799.field_56883, class_333, n, n2, n5, n6, n7, n8, n9, n10);
    }
    
    public static class_287 createClass_287(final VertexFormat$class_5596 vertexFormat$class_5596, final VertexFormat vertexFormat) {
        return class_289.method_1348().method_60827(vertexFormat$class_5596, vertexFormat);
    }
    
    public static void setInt(final int intValue) {
        Initializer.intValue = intValue;
    }
    
    public static int getInt() {
        return Initializer.intValue;
    }
    
    public static int getInt_1() {
        if (getInt() == 0) {
            return 4;
        }
        return 0;
    }
    
    private static IllegalArgumentException computeIllegalargumentexception(final IllegalArgumentException ex) {
        return ex;
    }
    
    static {
        if (getInt() == 0) {
            setInt(106);
        }
    }
}
