// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3;

import net.minecraft.class_243;
import net.minecraft.class_287;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import net.minecraft.class_290;
import com.mojang.blaze3d.vertex.VertexFormat$class_5596;
import net.minecraft.class_289;
import net.minecraft.class_238;
import net.minecraft.class_4587;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_12;
import java.awt.Color;
import net.minecraft.class_332;

public class Initializer
{
    public static void processAll(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        class_332.method_25294(n, n2, n + n3, n2 + n4, n5);
    }
    
    public static void processAll_7(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        class_332.method_25294(n, n2, n + n3, n2 + 1, n5);
    }
    
    public static void processAll_1(final class_332 class_332, final int n, final int n2, final int n3, final int n4) {
        class_332.method_25294(n, n2, n + n3, n2 + 1, n4);
    }
    
    public static void processAll_8(final class_332 class_332, final int n, final int n2, final int n3, final int n4) {
        class_332.method_25294(n, n2, n + 1, n2 + n3, n4);
    }
    
    public static void processAll_2(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int rgba) {
        Initializer_12.processAll_1(class_332, new Color(rgba, true), n, n2, n + n3, n2 + n4, n5, 16);
    }
    
    public static void processAll_3(final class_4587 class_4587, final class_238 class_4588, final int n, final boolean b) {
        final boolean enabled_1 = Initializer_1.isEnabled_1();
        final float n2 = (n >> 16 & 0xFF) / 255.0f;
        final float n3 = (n >> 8 & 0xFF) / 255.0f;
        final float n4 = (n & 0xFF) / 255.0f;
        final boolean b2 = enabled_1;
        final float n6;
        float n5 = n6 = (n >> 24 & 0xFF) / 255.0f;
        if (!b2 || n6 == 0.0f) {
            n5 = n6;
        }
        final Matrix4f method_23761 = class_4587.method_23760().method_23761();
        final class_289 method_23762 = class_289.method_1348();
        final float n7 = (float)class_4588.field_1323;
        final float n8 = (float)class_4588.field_1322;
        final float n9 = (float)class_4588.field_1321;
        final float n10 = (float)class_4588.field_1320;
        final float n11 = (float)class_4588.field_1325;
        final float n12 = (float)class_4588.field_1324;
        if (b) {
            final class_287 method_23763 = method_23762.method_60827(VertexFormat$class_5596.field_29344, class_290.field_1576);
            method_23763.method_22918((Matrix4fc)method_23761, n7, n8, n9).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n10, n8, n9).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n10, n8, n9).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n10, n8, n12).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n10, n8, n12).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n7, n8, n12).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n7, n8, n12).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n7, n8, n9).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n7, n11, n9).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n10, n11, n9).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n10, n11, n9).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n10, n11, n12).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n10, n11, n12).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n7, n11, n12).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n7, n11, n12).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n7, n11, n9).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n7, n8, n9).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n7, n11, n9).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n10, n8, n9).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n10, n11, n9).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n10, n8, n12).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n10, n11, n12).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n7, n8, n12).method_22915(n2, n3, n4, n5);
            method_23763.method_22918((Matrix4fc)method_23761, n7, n11, n12).method_22915(n2, n3, n4, n5);
            com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.setClass_287(method_23763);
            if (b2) {
                return;
            }
            int int1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt();
            com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int1);
        }
        final class_287 method_23764 = method_23762.method_60827(VertexFormat$class_5596.field_27382, class_290.field_1576);
        method_23764.method_22918((Matrix4fc)method_23761, n7, n8, n9).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n10, n8, n9).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n10, n8, n12).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n7, n8, n12).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n7, n11, n9).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n7, n11, n12).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n10, n11, n12).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n10, n11, n9).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n7, n8, n9).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n7, n11, n9).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n10, n11, n9).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n10, n8, n9).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n7, n8, n12).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n10, n8, n12).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n10, n11, n12).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n7, n11, n12).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n7, n8, n9).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n7, n8, n12).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n7, n11, n12).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n7, n11, n9).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n10, n8, n9).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n10, n11, n9).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n10, n11, n12).method_22915(n2, n3, n4, n5);
        method_23764.method_22918((Matrix4fc)method_23761, n10, n8, n12).method_22915(n2, n3, n4, n5);
        com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.setClass_287(method_23764);
    }
    
    public static void processAll_4(final class_4587 class_4587, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final Color color) {
        processAll_3(class_4587, new class_238((double)n, (double)n2, (double)n3, (double)n4, (double)n5, (double)n6), color.getRGB(), false);
    }
    
    public static void processAll_5(final class_4587 class_4587, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Color color) {
        processAll_3(class_4587, new class_238((double)n, (double)n2, (double)n3, (double)n4, (double)n5, (double)n6), color.getRGB(), false);
    }
    
    public static void processAll_6(final class_4587 class_4587, final Color color, final class_243 class_4588, final class_243 class_4589) {
        final float n = color.getRed() / 255.0f;
        final float n2 = color.getGreen() / 255.0f;
        final float n3 = color.getBlue() / 255.0f;
        final float n4 = color.getAlpha() / 255.0f;
        final Matrix4f method_23761 = class_4587.method_23760().method_23761();
        final class_287 method_23762 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_29344, class_290.field_1576);
        method_23762.method_22918((Matrix4fc)method_23761, (float)class_4588.field_1352, (float)class_4588.field_1351, (float)class_4588.field_1350).method_22915(n, n2, n3, n4);
        method_23762.method_22918((Matrix4fc)method_23761, (float)class_4589.field_1352, (float)class_4589.field_1351, (float)class_4589.field_1350).method_22915(n, n2, n3, n4);
        com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.setClass_287(method_23762);
    }
}
