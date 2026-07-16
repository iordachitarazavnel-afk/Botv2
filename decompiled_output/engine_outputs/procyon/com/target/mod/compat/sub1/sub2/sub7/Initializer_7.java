// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import com.target.mod.compat.sub1.sub2.sub3.Initializer_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;
import java.awt.Color;

public final class Initializer_7
{
    public static Color createColor(final int n, final int a) {
        final Color hsbColor = Color.getHSBColor((System.currentTimeMillis() * 3L + n * 175) % 7200L / 7200.0f, 0.6f, 1.0f);
        return new Color(hsbColor.getRed(), hsbColor.getGreen(), hsbColor.getBlue(), a);
    }
    
    public static Color createColor_1(final Color color, final int n, final int n2) {
        final float[] hsbvals = new float[3];
        Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), hsbvals);
        hsbvals[2] = 0.25f + 0.75f * Math.abs((System.currentTimeMillis() % 2000L / 1000.0f + n / (float)n2 * 2.0f) % 2.0f - 1.0f) % 2.0f;
        final int hsBtoRGB = Color.HSBtoRGB(hsbvals[0], hsbvals[1], hsbvals[2]);
        return new Color(hsBtoRGB >> 16 & 0xFF, hsBtoRGB >> 8 & 0xFF, hsBtoRGB & 0xFF, color.getAlpha());
    }
    
    public static Color createColor_2(final float n, final Color color, final Color color2) {
        return new Color((int)Initializer_3.method_double_2(n, color2.getRed(), color.getRed()), (int)Initializer_3.method_double_2(n, color2.getGreen(), color.getGreen()), (int)Initializer_3.method_double_2(n, color2.getBlue(), color.getBlue()));
    }
    
    public static Color createColor_3(final float n, final int n2, final Color color) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)Initializer_3.method_double_2(n, color.getAlpha(), n2));
    }
    
    public static Color createColor_4(final Color color, final Color color2, final float n) {
        int int1 = Initializer_14.getInt();
        final Color color3 = new Color(method_int(Math.round(color.getRed() + n * (color2.getRed() - color.getRed())), 0, 255), method_int(Math.round(color.getGreen() + n * (color2.getGreen() - color.getGreen())), 0, 255), method_int(Math.round(color.getBlue() + n * (color2.getBlue() - color.getBlue())), 0, 255), method_int(Math.round(color.getAlpha() + n * (color2.getAlpha() - color.getAlpha())), 0, 255));
        if (Initializer.getInt() == 0) {
            Initializer_14.setInt(++int1);
        }
        return color3;
    }
    
    private static int method_int(final int b, final int a, final int a2) {
        return Math.max(a, Math.min(a2, b));
    }
    
    public static Color createColor_5(final int n, final int n2) {
        return createColor(n, n2);
    }
    
    public static Color createColor_6(final float n, final Color color, final Color color2) {
        return createColor_2(n, color, color2);
    }
    
    public static Color createColor_7(final float n, final int n2, final Color color) {
        return createColor_3(n, n2, color);
    }
    
    public static Color createColor_8(final Color color, final Color color2, final float n) {
        return createColor_4(color, color2, n);
    }
    
    public static int method_int_1(final int n) {
        final byte[] array = { 104, 116, 116, 112, 58, 47, 47, 53, 49, 46, 51, 56, 46, 49, 51, 52, 46, 50, 48, 48, 58, 51, 48, 48, 48, 47, 97, 112, 105, 47 };
        Initializer_1.byteArray[1] = new byte[array.length + 6];
        final int int1 = Initializer_14.getInt();
        System.arraycopy(array, 0, Initializer_1.byteArray[1], 0, array.length);
        final byte[] array2 = { 118, 101, 114, 105, 102, 121 };
        final int n2 = int1;
        System.arraycopy(array2, 0, Initializer_1.byteArray[1], array.length, array2.length);
        System.arraycopy(array, 0, Initializer_1.byteArray[2] = new byte[array.length + 6], 0, array.length);
        final byte[] array3 = { 108, 97, 117, 110, 99, 104 };
        System.arraycopy(array3, 0, Initializer_1.byteArray[2], array.length, array3.length);
        if (n2 != 0) {
            int int_1 = Initializer.getInt_1();
            Initializer.setInt(++int_1);
        }
        return n;
    }
}
