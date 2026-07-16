// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub2.sub2;

import net.minecraft.class_1044;
import net.minecraft.class_1043;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;
import org.joml.Vector3f;
import net.minecraft.class_4184;
import org.lwjgl.BufferUtils;
import java.io.OutputStream;
import java.awt.image.RenderedImage;
import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import net.minecraft.class_2960;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import org.jetbrains.annotations.Contract;
import java.awt.Color;
import net.minecraft.class_3532;
import org.lwjgl.opengl.GL11;
import java.util.Random;
import net.minecraft.class_310;
import org.joml.Matrix4f;

public class Initializer_2
{
    public static final Matrix4f matrix4f;
    public static final Matrix4f matrix4f_1;
    public static final Matrix4f matrix4f_2;
    private static final class_4587Sub coreE;
    private static final class_310 class310;
    private static final char charValue = 'a';
    private static final char charValue_1 = 'z';
    private static final Random random;
    private static String strValue;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public static void execute() {
        GL11.glDisable(2884);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
    }
    
    public static void execute_1() {
        GL11.glDisable(3042);
        GL11.glEnable(2884);
        GL11.glDepthFunc(515);
    }
    
    public static int method_int(final int n, final int n2, final double n3) {
        return (int)Math.floor(n + (n2 - n) * class_3532.method_15350(n3, 0.0, 1.0));
    }
    
    public static double method_double(final double n, final double n2, final double n3) {
        return n + (n2 - n) * class_3532.method_15350(n3, 0.0, 1.0);
    }
    
    @Contract(value = "_, _, _ -> new", pure = true)
    public static Color createColor(final Color color, final Color color2, final double n) {
        final String string = getString();
        Label_0037: {
            Color color4 = null;
            Label_0022: {
                try {
                    final Color color3 = color;
                    color4 = color;
                    if (string != null) {
                        break Label_0022;
                    }
                    if (color == null) {
                        break Label_0037;
                    }
                }
                catch (final NullPointerException ex) {
                    throw computeException(ex);
                }
                final Color color3 = color2;
                color4 = color2;
                try {
                    if (string != null) {
                        return color3;
                    }
                    if (color4 == null) {
                        break Label_0037;
                    }
                    return new Color(method_int(color.getRed(), color2.getRed(), n), method_int(color.getGreen(), color2.getGreen(), n), method_int(color.getBlue(), color2.getBlue(), n), method_int(color.getAlpha(), color2.getAlpha(), n));
                }
                catch (final NullPointerException ex2) {
                    throw computeException(ex2);
                }
            }
            try {
                if (color4 == null) {
                    throw new NullPointerException();
                }
            }
            catch (final NullPointerException ex3) {
                throw computeException(ex3);
            }
        }
        return new Color(method_int(color.getRed(), color2.getRed(), n), method_int(color.getGreen(), color2.getGreen(), n), method_int(color.getBlue(), color2.getBlue(), n), method_int(color.getAlpha(), color2.getAlpha(), n));
    }
    
    @Contract(value = "_, _, _, _, _ -> new", pure = true)
    public static Color createColor_1(final Color color, final int n, final int n2, final int n3, final int n4) {
        try {
            if (color == null) {
                throw new NullPointerException();
            }
        }
        catch (final NullPointerException ex) {
            throw computeException(ex);
        }
        try {
            if (n == -1) {
                final int red = color.getRed();
                return new Color(red, (n2 == -1) ? color.getGreen() : n2, (n3 == -1) ? color.getBlue() : n3, (n4 == -1) ? color.getAlpha() : n4);
            }
        }
        catch (final NullPointerException ex2) {
            throw computeException(ex2);
        }
        final int red = n;
        return new Color(red, (n2 == -1) ? color.getGreen() : n2, (n3 == -1) ? color.getBlue() : n3, (n4 == -1) ? color.getAlpha() : n4);
    }
    
    @Contract(value = "_, _ -> new", pure = true)
    public static class_243 createClass_243(final class_4587 class_4587, final class_243 class_4588) {
        Label_0015: {
            try {
                if (class_4587 == null) {
                    break Label_0015;
                }
                final class_243 class_4589 = class_4588;
                if (class_4589 == null) {
                    break Label_0015;
                }
                break Label_0015;
            }
            catch (final NullPointerException ex) {
                throw computeException(ex);
            }
            try {
                final class_243 class_4589 = class_4588;
                if (class_4589 == null) {
                    throw new NullPointerException();
                }
            }
            catch (final NullPointerException ex2) {
                throw computeException(ex2);
            }
        }
        final Matrix4f method_23761 = class_4587.method_23760().method_23761();
        final Vector4f vector4f = new Vector4f((float)class_4588.field_1352, (float)class_4588.field_1351, (float)class_4588.field_1350, 1.0f);
        vector4f.mul((Matrix4fc)method_23761);
        return new class_243((double)vector4f.x(), (double)vector4f.y(), (double)vector4f.z());
    }
    
    public static void setClass_2960AndBufferedimage(final class_2960 class_2960, final BufferedImage im) {
        Label_0027: {
            Label_0015: {
                try {
                    if (class_2960 == null) {
                        break Label_0015;
                    }
                    final BufferedImage bufferedImage = im;
                    if (bufferedImage == null) {
                        break Label_0015;
                    }
                    break Label_0027;
                }
                catch (final Exception ex) {
                    throw computeException(ex);
                }
                try {
                    final BufferedImage bufferedImage = im;
                    if (bufferedImage == null) {
                        throw new NullPointerException();
                    }
                }
                catch (final Exception ex2) {
                    throw computeException(ex2);
                }
            }
            try {
                final ByteArrayOutputStream output = new ByteArrayOutputStream();
                ImageIO.write(im, createString(-13328, -14116), output);
                final byte[] byteArray = output.toByteArray();
                BufferUtils.createByteBuffer(byteArray.length).put(byteArray).flip();
                class_310.method_1551().execute(Initializer_2::lambda$registerBufferedImageTexture$0);
            }
            catch (final Exception ex3) {}
        }
    }
    
    public static class_4587 getClass_4587() {
        try {
            if (!Initializer_2.coreE.method_67795()) {
                throw new IllegalStateException(createString(-13326, -10620));
            }
        }
        catch (final NullPointerException ex) {
            throw computeException(ex);
        }
        Initializer_2.coreE.method_34426();
        return Initializer_2.coreE;
    }
    
    @Contract("-> new")
    public static class_243 getClass_243() {
        final class_4184 method_19418 = Initializer_2.class310.field_1773.method_19418();
        final float n = 3.1415927f;
        final float n2 = (float)Math.toRadians(-method_19418.method_19330());
        final float n3 = (float)Math.toRadians(-method_19418.method_19329());
        final float method_19419 = class_3532.method_15362((double)(n2 - n));
        final float method_19420 = class_3532.method_15374((double)(n2 - n));
        final float n4 = -class_3532.method_15362((double)n3);
        return new class_243((double)(method_19420 * n4), (double)class_3532.method_15374((double)n3), (double)(method_19419 * n4)).method_1019(class_310.method_1551().field_1773.method_19418().method_71156());
    }
    
    @Contract(value = "_ -> new", pure = true)
    public static class_243 computeClass_243(final class_243 class_243) {
        final String string = getString();
        try {
            if (class_243 == null) {
                throw new NullPointerException();
            }
        }
        catch (final NullPointerException ex) {
            throw computeException(ex);
        }
        final class_4184 field_4686 = Initializer_2.class310.method_1561().field_4686;
        final int method_4507 = Initializer_2.class310.method_22683().method_4507();
        final int[] array = new int[4];
        GL11.glGetIntegerv(2978, array);
        final Vector3f vector3f = new Vector3f();
        final Vector4f mul = new Vector4f((float)(class_243.field_1352 - class_310.method_1551().field_1773.method_19418().method_71156().field_1352), (float)(class_243.field_1351 - class_310.method_1551().field_1773.method_19418().method_71156().field_1351), (float)(class_243.field_1350 - class_310.method_1551().field_1773.method_19418().method_71156().field_1350), 1.0f).mul((Matrix4fc)Initializer_2.matrix4f_2);
        new Matrix4f((Matrix4fc)Initializer_2.matrix4f).mul((Matrix4fc)new Matrix4f((Matrix4fc)Initializer_2.matrix4f_1)).project(mul.x(), mul.y(), mul.z(), array, vector3f);
        final class_243 class_244 = new class_243((double)(vector3f.floatValue_1 / Initializer_2.class310.method_22683().method_4495()), (double)((method_4507 - vector3f.floatValue_2) / Initializer_2.class310.method_22683().method_4495()), (double)vector3f.floatValue);
        if (string != null) {
            int int_1 = Initializer.getInt_1();
            Initializer.setInt(++int_1);
        }
        return class_244;
    }
    
    public static boolean checkClass_243(final class_243 class_243) {
        final String string = getString();
        Label_0054: {
            double n3 = 0.0;
            double n2 = 0.0;
            Label_0041: {
                double n = 0.0;
                Label_0020: {
                    try {
                        final class_243 class_244 = class_243;
                        if (string != null) {
                            break Label_0020;
                        }
                        if (class_243 == null) {
                            return false;
                        }
                    }
                    catch (final NullPointerException ex) {
                        throw computeException(ex);
                    }
                    final class_243 class_244 = class_243;
                    try {
                        n = (n2 = (n3 = dcmpl(class_244.field_1350, -1.0)));
                        if (string != null) {
                            break Label_0054;
                        }
                        if (n > 0) {
                            break Label_0041;
                        }
                        return false;
                    }
                    catch (final NullPointerException ex2) {
                        throw computeException(ex2);
                    }
                }
                try {
                    if (n <= 0) {
                        return false;
                    }
                    n3 = (n2 = dcmpg(class_243.field_1350, 1.0));
                }
                catch (final NullPointerException ex3) {
                    throw computeException(ex3);
                }
            }
            try {
                if (string != null) {
                    return n3 != 0.0;
                }
                if (n2 >= 0) {
                    return false;
                }
            }
            catch (final NullPointerException ex4) {
                throw computeException(ex4);
            }
        }
        double n3 = true ? 1 : 0;
        return n3 != 0.0;
        n3 = (false ? 1 : 0);
        return n3 != 0.0;
    }
    
    @Contract(value = "_,_,_ -> new", pure = true)
    public static class_243 createClass_243_1(final double n, final double n2, final double n3) {
        final class_4184 field_4686 = Initializer_2.class310.method_1561().field_4686;
        getString();
        final int method_4502 = Initializer_2.class310.method_22683().method_4502();
        final int method_4503 = Initializer_2.class310.method_22683().method_4486();
        final int[] array = new int[4];
        GL11.glGetIntegerv(2978, array);
        final Vector3f vector3f = new Vector3f();
        final Matrix4f matrix4f = new Matrix4f((Matrix4fc)Initializer_2.matrix4f);
        final Matrix4f matrix4f2 = new Matrix4f((Matrix4fc)Initializer_2.matrix4f_1);
        class_243 method_4504;
        try {
            matrix4f.mul((Matrix4fc)matrix4f2).mul((Matrix4fc)Initializer_2.matrix4f_2).unproject((float)n / method_4503 * array[2], (float)(method_4502 - n2) / method_4502 * array[3], (float)n3, array, vector3f);
            method_4504 = new class_243((double)vector3f.floatValue_1, (double)vector3f.floatValue_2, (double)vector3f.floatValue).method_1019(class_310.method_1551().field_1773.method_19418().method_71156());
            if (Initializer.getInt() == 0) {
                setString("D4XwKb");
            }
        }
        catch (final NullPointerException ex) {
            throw computeException(ex);
        }
        return method_4504;
    }
    
    public static int getInt() {
        return class_310.method_1551().method_22683().method_4495();
    }
    
    private static String computeString(final int endExclusive) {
        return IntStream.range(0, endExclusive).mapToObj((IntFunction<?>)Initializer_2::lambda$randomString$1).collect((Collector<? super Object, ?, String>)Collectors.joining());
    }
    
    @Contract(value = "-> new", pure = true)
    public static class_2960 getClass_2960() {
        return class_2960.method_60655(createString(-13325, 2552), createString(-13327, -9506) + computeString(32));
    }
    
    private static String lambda$randomString$1(final int n) {
        return String.valueOf((char)Initializer_2.random.nextInt(97, 123));
    }
    
    private static void lambda$registerBufferedImageTexture$0(final class_2960 class_2960, final class_1043 class_2961) {
        class_310.method_1551().method_1531().method_4616(class_2960, (class_1044)class_2961);
    }
    
    static {
        final String[] strArr2 = new String[4];
        int n = 0;
        final String string = null;
        String s;
        int n2 = (s = "\u00fb\u00e0[\u0086R\u00c2\u0098UYB\tw½\u00002\u0099|\u00e83k\u0092\\\u0098\u00cf\u00f9\u00f9\u001d\u0090W\u00f5\u008f£\u00e8\u0014\u0086y\u00e5»,\u009a\u00f5\u0095LW}\u00f9A\u00c9\u00e4\u00f8[\u00e8^ª\u008a\u0085\u0092¾\u00f6J\u000f\u0099\u009d\u0016\u0086\f\u0013\u001e&w\u009b2©<)0}\u00e3\u0007k)\u0004PFM>\u0003½Z\u001f¼\u00d1L\b\u0004\u00f3|f").length();
        setString(string);
        int n3 = 8;
        int n4 = -1;
    Label_0027:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 106));
                ++n4;
                final String s2 = s;
                final int beginIndex = n4;
                String s3 = s2.substring(beginIndex, beginIndex + n3);
                int n9 = -1;
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    final int length = charArray.length;
                    int n10 = 0;
                    while (true) {
                        Label_0264: {
                            if (length > 1) {
                                break Label_0264;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 104;
                                    case 1 -> 115;
                                    case 2 -> 92;
                                    case 3 -> 126;
                                    case 4 -> 83;
                                    case 5 -> 96;
                                    default -> 51;
                                }));
                                ++n10;
                            } while (n8 == 0);
                        }
                        if (length > n10) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n9) {
                        default: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0027;
                            }
                            n2 = (s = "\u00cb\u00dd4\u0099:\u0003\u00ff\u0016<").length();
                            n3 = 5;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0027;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 103)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        strArr = strArr2;
        strArr_1 = new String[4];
        matrix4f = new Matrix4f();
        matrix4f_1 = new Matrix4f();
        matrix4f_2 = new Matrix4f();
        coreE = new class_4587Sub();
        class310 = class_310.method_1551();
        random = new Random();
    }
    
    public static void setString(final String strValue) {
        Initializer_2.strValue = strValue;
    }
    
    public static String getString() {
        return Initializer_2.strValue;
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFCBF3) & 0xFFFF;
        if (Initializer_2.strArr_1[n3] == null) {
            final char[] charArray = Initializer_2.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 10;
                case 1 -> 36;
                case 2 -> 103;
                case 3 -> 219;
                case 4 -> 141;
                case 5 -> 242;
                case 6 -> 206;
                case 7 -> 154;
                case 8 -> 70;
                case 9 -> 245;
                case 10 -> 117;
                case 11 -> 185;
                case 12 -> 200;
                case 13 -> 223;
                case 14 -> 67;
                case 15 -> 35;
                case 16 -> 197;
                case 17 -> 87;
                case 18 -> 159;
                case 19 -> 215;
                case 20 -> 241;
                case 21 -> 183;
                case 22 -> 231;
                case 23 -> 230;
                case 24 -> 58;
                case 25 -> 227;
                case 26 -> 202;
                case 27 -> 91;
                case 28 -> 137;
                case 29 -> 80;
                case 30 -> 29;
                case 31 -> 79;
                case 32 -> 151;
                case 33 -> 177;
                case 34 -> 81;
                case 35 -> 77;
                case 36 -> 209;
                case 37 -> 135;
                case 38 -> 254;
                case 39 -> 150;
                case 40 -> 170;
                case 41 -> 52;
                case 42 -> 124;
                case 43 -> 63;
                case 44 -> 224;
                case 45 -> 19;
                case 46 -> 199;
                case 47 -> 102;
                case 48 -> 38;
                case 49 -> 178;
                case 50 -> 98;
                case 51 -> 174;
                case 52 -> 7;
                case 53 -> 240;
                case 54 -> 88;
                case 55 -> 13;
                case 56 -> 31;
                case 57 -> 76;
                case 58 -> 179;
                case 59 -> 160;
                case 60 -> 213;
                case 61 -> 62;
                case 62 -> 164;
                case 63 -> 74;
                case 64 -> 113;
                case 65 -> 165;
                case 66 -> 43;
                case 67 -> 188;
                case 68 -> 156;
                case 69 -> 114;
                case 70 -> 172;
                case 71 -> 169;
                case 72 -> 64;
                case 73 -> 163;
                case 74 -> 108;
                case 75 -> 127;
                case 76 -> 5;
                case 77 -> 161;
                case 78 -> 171;
                case 79 -> 116;
                case 80 -> 221;
                case 81 -> 152;
                case 82 -> 147;
                case 83 -> 107;
                case 84 -> 118;
                case 85 -> 140;
                case 86 -> 180;
                case 87 -> 182;
                case 88 -> 232;
                case 89 -> 11;
                case 90 -> 3;
                case 91 -> 205;
                case 92 -> 104;
                case 93 -> 22;
                case 94 -> 136;
                case 95 -> 228;
                case 96 -> 125;
                case 97 -> 190;
                case 98 -> 196;
                case 99 -> 86;
                case 100 -> 212;
                case 101 -> 0;
                case 102 -> 195;
                case 103 -> 45;
                case 104 -> 210;
                case 105 -> 72;
                case 106 -> 96;
                case 107 -> 253;
                case 108 -> 106;
                case 109 -> 115;
                case 110 -> 26;
                case 111 -> 192;
                case 112 -> 239;
                case 113 -> 237;
                case 114 -> 238;
                case 115 -> 84;
                case 116 -> 148;
                case 117 -> 50;
                case 118 -> 53;
                case 119 -> 252;
                case 120 -> 97;
                case 121 -> 168;
                case 122 -> 243;
                case 123 -> 47;
                case 124 -> 184;
                case 125 -> 155;
                case 126 -> 4;
                case 127 -> 83;
                case 128 -> 49;
                case 129 -> 17;
                case 130 -> 204;
                case 131 -> 251;
                case 132 -> 78;
                case 133 -> 144;
                case 134 -> 128;
                case 135 -> 134;
                case 136 -> 131;
                case 137 -> 101;
                case 138 -> 48;
                case 139 -> 162;
                case 140 -> 44;
                case 141 -> 9;
                case 142 -> 6;
                case 143 -> 189;
                case 144 -> 226;
                case 145 -> 132;
                case 146 -> 229;
                case 147 -> 8;
                case 148 -> 32;
                case 149 -> 24;
                case 150 -> 250;
                case 151 -> 51;
                case 152 -> 153;
                case 153 -> 246;
                case 154 -> 27;
                case 155 -> 18;
                case 156 -> 149;
                case 157 -> 248;
                case 158 -> 158;
                case 159 -> 244;
                case 160 -> 56;
                case 161 -> 14;
                case 162 -> 122;
                case 163 -> 90;
                case 164 -> 142;
                case 165 -> 41;
                case 166 -> 211;
                case 167 -> 61;
                case 168 -> 157;
                case 169 -> 112;
                case 170 -> 120;
                case 171 -> 217;
                case 172 -> 129;
                case 173 -> 187;
                case 174 -> 145;
                case 175 -> 130;
                case 176 -> 55;
                case 177 -> 119;
                case 178 -> 126;
                case 179 -> 235;
                case 180 -> 139;
                case 181 -> 93;
                case 182 -> 167;
                case 183 -> 71;
                case 184 -> 233;
                case 185 -> 25;
                case 186 -> 216;
                case 187 -> 111;
                case 188 -> 59;
                case 189 -> 82;
                case 190 -> 123;
                case 191 -> 203;
                case 192 -> 12;
                case 193 -> 110;
                case 194 -> 146;
                case 195 -> 28;
                case 196 -> 46;
                case 197 -> 143;
                case 198 -> 105;
                case 199 -> 214;
                case 200 -> 21;
                case 201 -> 234;
                case 202 -> 40;
                case 203 -> 249;
                case 204 -> 236;
                case 205 -> 175;
                case 206 -> 66;
                case 207 -> 75;
                case 208 -> 99;
                case 209 -> 23;
                case 210 -> 208;
                case 211 -> 39;
                case 212 -> 176;
                case 213 -> 33;
                case 214 -> 166;
                case 215 -> 95;
                case 216 -> 60;
                case 217 -> 1;
                case 218 -> 222;
                case 219 -> 37;
                case 220 -> 73;
                case 221 -> 94;
                case 222 -> 201;
                case 223 -> 89;
                case 224 -> 42;
                case 225 -> 247;
                case 226 -> 16;
                case 227 -> 194;
                case 228 -> 133;
                case 229 -> 173;
                case 230 -> 15;
                case 231 -> 186;
                case 232 -> 34;
                case 233 -> 100;
                case 234 -> 191;
                case 235 -> 20;
                case 236 -> 65;
                case 237 -> 225;
                case 238 -> 30;
                case 239 -> 207;
                case 240 -> 92;
                case 241 -> 138;
                case 242 -> 54;
                case 243 -> 85;
                case 244 -> 2;
                case 245 -> 68;
                case 246 -> 121;
                case 247 -> 181;
                case 248 -> 220;
                case 249 -> 109;
                case 250 -> 57;
                case 251 -> 198;
                case 252 -> 69;
                case 253 -> 193;
                case 254 -> 218;
                default -> 255;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < '\0') {
                n6 += '\u0100';
            }
            int n7 = ((n2 & 0xFFFF) >>> 8) - n5;
            if (n7 < '\0') {
                n7 += '\u0100';
            }
            for (int i = 0; i < charArray.length; ++i) {
                final int n8 = i % 2;
                final char[] array = charArray;
                final int n9 = i;
                final char c = array[n9];
                if (n8 == 0) {
                    array[n9] = (char)(c ^ n6);
                    n6 = (((n6 >>> 3 | n6 << 5) ^ charArray[i]) & 0xFF);
                }
                else {
                    array[n9] = (char)(c ^ n7);
                    n7 = (((n7 >>> 3 | n7 << 5) ^ charArray[i]) & 0xFF);
                }
            }
            Initializer_2.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_2.strArr_1[n3];
    }
}
