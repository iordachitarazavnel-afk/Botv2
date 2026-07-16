// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub1;

import net.minecraft.class_1060;
import net.minecraft.class_1044;
import java.util.function.Supplier;
import net.minecraft.class_1043;
import java.io.InputStream;
import net.minecraft.class_1011;
import java.io.FileInputStream;
import net.minecraft.class_310;
import java.util.ArrayList;
import java.io.File;
import net.minecraft.class_2960;
import java.util.List;

public class Initializer_2
{
    private final List<class_2960> list;
    private final File file;
    private class_2960 class2960;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_2() {
        this.list = new ArrayList<class_2960>();
        this.file = new File(createString(-10609, 11812));
    }
    
    public void execute() {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        File file2 = null;
        Label_0078: {
            Label_0059: {
                File file = null;
                Label_0038: {
                    Label_0029: {
                        try {
                            if (intarrArray == null) {
                                break Label_0038;
                            }
                            final class_310 class_310 = net.minecraft.class_310.method_1551();
                            final class_1060 class_311 = class_310.method_1531();
                            if (class_311 == null) {
                                return;
                            }
                            break Label_0029;
                        }
                        catch (final Throwable t) {
                            throw computeThrowable(t);
                        }
                        try {
                            final class_310 class_310 = net.minecraft.class_310.method_1551();
                            final class_1060 class_311 = class_310.method_1531();
                            if (class_311 == null) {
                                return;
                            }
                        }
                        catch (final Throwable t2) {
                            throw computeThrowable(t2);
                        }
                    }
                    this.list.clear();
                    try {
                        file = (file2 = this.file);
                        if (intarrArray == null) {
                            break Label_0078;
                        }
                        final boolean b = file.exists();
                        if (!b) {
                            break Label_0059;
                        }
                        break Label_0059;
                    }
                    catch (final Throwable t3) {
                        throw computeThrowable(t3);
                    }
                }
                try {
                    final boolean b = file.exists();
                    if (!b) {
                        this.file.mkdirs();
                    }
                }
                catch (final Throwable t4) {
                    throw computeThrowable(t4);
                }
            }
            file2 = this.file;
        }
        final File[] listFiles = file2.listFiles(Initializer_2::lambda$loadCapes$0);
        File[] array = null;
        Label_0103: {
            try {
                array = listFiles;
                if (intarrArray == null) {
                    break Label_0103;
                }
                if (array != null) {
                    break Label_0103;
                }
            }
            catch (final Throwable t5) {
                throw computeThrowable(t5);
            }
            return;
        }
        final File[] array2 = array;
        final int length = array2.length;
        int i = 0;
        File file3;
        class_2960 method_60655;
        boolean contains;
        FileInputStream fileInputStream;
        Initializer_2 initializer_2;
        Initializer_2 initializer_3 = null;
        class_2960 class_312;
        Label_0355:Label_0359_Outer:
        while (true) {
            while (true) {
                while (i < length) {
                    file3 = array2[i];
                    Label_0303: {
                        try {
                            method_60655 = class_2960.method_60655(createString(-10616, 13404), createString(-10615, -18250) + file3.getName().toLowerCase().replaceAll(createString(-10613, -26301), "_"));
                            Label_0209: {
                                try {
                                    contains = this.list.contains(method_60655);
                                    if (intarrArray == null) {
                                        break Label_0355;
                                    }
                                    if (!contains) {
                                        break Label_0209;
                                    }
                                }
                                catch (final Throwable t6) {
                                    throw computeThrowable(t6);
                                }
                                if (intarrArray != null) {
                                    break Label_0303;
                                }
                            }
                            fileInputStream = new FileInputStream(file3);
                            try {
                                class_310.method_1551().method_1531().method_4616(method_60655, (class_1044)new class_1043((Supplier)Initializer_2::lambda$loadCapes$1, class_1011.method_4309((InputStream)fileInputStream)));
                                this.list.add(method_60655);
                                fileInputStream.close();
                            }
                            catch (final Throwable t7) {
                                try {
                                    fileInputStream.close();
                                }
                                catch (final Throwable exception) {
                                    t7.addSuppressed(exception);
                                }
                                throw t7;
                            }
                        }
                        catch (final Exception ex) {}
                    }
                    ++i;
                    if (intarrArray == null) {
                        break;
                    }
                    continue Label_0359_Outer;
                    if (!contains) {
                        initializer_2 = this;
                        initializer_2.class2960 = this.list.get(0);
                    }
                    return;
                }
                Label_0336: {
                    Label_0328: {
                        try {
                            initializer_2 = this;
                            initializer_3 = this;
                            if (intarrArray == null) {
                                break Label_0336;
                            }
                            class_312 = this.class2960;
                            if (class_312 == null) {
                                break Label_0328;
                            }
                            return;
                        }
                        catch (final Throwable t8) {
                            throw computeThrowable(t8);
                        }
                        try {
                            class_312 = this.class2960;
                            if (class_312 != null) {
                                return;
                            }
                            initializer_2 = this;
                            initializer_3 = this;
                        }
                        catch (final Throwable t9) {
                            throw computeThrowable(t9);
                        }
                    }
                    try {
                        if (intarrArray == null) {
                            continue;
                        }
                        initializer_3.list.isEmpty();
                    }
                    catch (final Throwable t10) {
                        throw computeThrowable(t10);
                    }
                }
                break;
            }
            continue Label_0355;
        }
    }
    
    public List<class_2960> getList() {
        if (this.list.isEmpty()) {
            this.execute();
        }
        return this.list;
    }
    
    public class_2960 getClass_2960() {
        if (this.list.isEmpty()) {
            this.execute();
        }
        return this.class2960;
    }
    
    public void setClass_2960(final class_2960 class2960) {
        this.class2960 = class2960;
    }
    
    private static String lambda$loadCapes$1() {
        return createString(-10610, 31949);
    }
    
    private static boolean lambda$loadCapes$0(final File file, final String s) {
        return s.toLowerCase().endsWith(createString(-10614, 7422));
    }
    
    private static Throwable computeThrowable(final Throwable t) {
        return t;
    }
    
    static {
        final String[] strArr2 = new String[6];
        int n = 0;
        String s;
        int n2 = (s = "0¯\u00f8ª´\u00fd[²¶\u00c9¤cm\u0004\u00ff·\u00d5\b\u0006¶\u0086\u0006\u001fQ\u0015\u0007\u00c8.)Nb¤~").length();
        int n3 = 13;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 80));
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
                        Label_0260: {
                            if (length > 1) {
                                break Label_0260;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 85;
                                    case 1 -> 101;
                                    case 2 -> 95;
                                    case 3 -> 17;
                                    case 4 -> 45;
                                    case 5 -> 104;
                                    default -> 42;
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
                                continue Label_0023;
                            }
                            n2 = (s = "\u00f4\u00f6x\u00f5qK¸¥\u00ec¬>\u00fa\u0082EiP\u0001º¼b\u0007\u0007[\u00e1\u0093Fn\u0096").length();
                            n3 = 20;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0023;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 89)));
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
        strArr_1 = new String[6];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFD68B) & 0xFFFF;
        if (Initializer_2.strArr_1[n3] == null) {
            final char[] charArray = Initializer_2.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 81;
                case 1 -> 156;
                case 2 -> 26;
                case 3 -> 195;
                case 4 -> 61;
                case 5 -> 64;
                case 6 -> 211;
                case 7 -> 100;
                case 8 -> 107;
                case 9 -> 30;
                case 10 -> 190;
                case 11 -> 94;
                case 12 -> 217;
                case 13 -> 237;
                case 14 -> 117;
                case 15 -> 171;
                case 16 -> 17;
                case 17 -> 132;
                case 18 -> 242;
                case 19 -> 99;
                case 20 -> 163;
                case 21 -> 159;
                case 22 -> 68;
                case 23 -> 183;
                case 24 -> 70;
                case 25 -> 166;
                case 26 -> 181;
                case 27 -> 162;
                case 28 -> 46;
                case 29 -> 120;
                case 30 -> 31;
                case 31 -> 231;
                case 32 -> 36;
                case 33 -> 145;
                case 34 -> 54;
                case 35 -> 215;
                case 36 -> 247;
                case 37 -> 170;
                case 38 -> 245;
                case 39 -> 150;
                case 40 -> 192;
                case 41 -> 229;
                case 42 -> 241;
                case 43 -> 27;
                case 44 -> 110;
                case 45 -> 204;
                case 46 -> 78;
                case 47 -> 152;
                case 48 -> 127;
                case 49 -> 21;
                case 50 -> 73;
                case 51 -> 201;
                case 52 -> 56;
                case 53 -> 213;
                case 54 -> 226;
                case 55 -> 141;
                case 56 -> 224;
                case 57 -> 74;
                case 58 -> 169;
                case 59 -> 157;
                case 60 -> 8;
                case 61 -> 151;
                case 62 -> 146;
                case 63 -> 138;
                case 64 -> 24;
                case 65 -> 228;
                case 66 -> 252;
                case 67 -> 210;
                case 68 -> 218;
                case 69 -> 13;
                case 70 -> 116;
                case 71 -> 139;
                case 72 -> 212;
                case 73 -> 118;
                case 74 -> 69;
                case 75 -> 114;
                case 76 -> 253;
                case 77 -> 88;
                case 78 -> 182;
                case 79 -> 194;
                case 80 -> 20;
                case 81 -> 89;
                case 82 -> 63;
                case 83 -> 44;
                case 84 -> 248;
                case 85 -> 225;
                case 86 -> 173;
                case 87 -> 143;
                case 88 -> 87;
                case 89 -> 43;
                case 90 -> 7;
                case 91 -> 66;
                case 92 -> 155;
                case 93 -> 174;
                case 94 -> 79;
                case 95 -> 86;
                case 96 -> 95;
                case 97 -> 158;
                case 98 -> 136;
                case 99 -> 203;
                case 100 -> 91;
                case 101 -> 115;
                case 102 -> 33;
                case 103 -> 179;
                case 104 -> 37;
                case 105 -> 165;
                case 106 -> 60;
                case 107 -> 223;
                case 108 -> 75;
                case 109 -> 205;
                case 110 -> 6;
                case 111 -> 168;
                case 112 -> 16;
                case 113 -> 125;
                case 114 -> 10;
                case 115 -> 93;
                case 116 -> 14;
                case 117 -> 53;
                case 118 -> 102;
                case 119 -> 235;
                case 120 -> 41;
                case 121 -> 92;
                case 122 -> 71;
                case 123 -> 134;
                case 124 -> 28;
                case 125 -> 22;
                case 126 -> 176;
                case 127 -> 9;
                case 128 -> 135;
                case 129 -> 38;
                case 130 -> 23;
                case 131 -> 0;
                case 132 -> 11;
                case 133 -> 124;
                case 134 -> 233;
                case 135 -> 128;
                case 136 -> 85;
                case 137 -> 239;
                case 138 -> 180;
                case 139 -> 57;
                case 140 -> 84;
                case 141 -> 51;
                case 142 -> 243;
                case 143 -> 101;
                case 144 -> 12;
                case 145 -> 249;
                case 146 -> 3;
                case 147 -> 106;
                case 148 -> 187;
                case 149 -> 191;
                case 150 -> 48;
                case 151 -> 131;
                case 152 -> 109;
                case 153 -> 126;
                case 154 -> 72;
                case 155 -> 108;
                case 156 -> 133;
                case 157 -> 216;
                case 158 -> 254;
                case 159 -> 255;
                case 160 -> 121;
                case 161 -> 144;
                case 162 -> 83;
                case 163 -> 160;
                case 164 -> 154;
                case 165 -> 153;
                case 166 -> 77;
                case 167 -> 199;
                case 168 -> 185;
                case 169 -> 97;
                case 170 -> 172;
                case 171 -> 90;
                case 172 -> 62;
                case 173 -> 184;
                case 174 -> 208;
                case 175 -> 140;
                case 176 -> 55;
                case 177 -> 111;
                case 178 -> 186;
                case 179 -> 230;
                case 180 -> 178;
                case 181 -> 18;
                case 182 -> 234;
                case 183 -> 142;
                case 184 -> 193;
                case 185 -> 76;
                case 186 -> 112;
                case 187 -> 251;
                case 188 -> 196;
                case 189 -> 58;
                case 190 -> 175;
                case 191 -> 39;
                case 192 -> 244;
                case 193 -> 164;
                case 194 -> 222;
                case 195 -> 45;
                case 196 -> 113;
                case 197 -> 148;
                case 198 -> 35;
                case 199 -> 47;
                case 200 -> 198;
                case 201 -> 119;
                case 202 -> 4;
                case 203 -> 32;
                case 204 -> 123;
                case 205 -> 188;
                case 206 -> 50;
                case 207 -> 1;
                case 208 -> 40;
                case 209 -> 104;
                case 210 -> 189;
                case 211 -> 130;
                case 212 -> 238;
                case 213 -> 250;
                case 214 -> 2;
                case 215 -> 67;
                case 216 -> 227;
                case 217 -> 80;
                case 218 -> 59;
                case 219 -> 52;
                case 220 -> 82;
                case 221 -> 149;
                case 222 -> 167;
                case 223 -> 202;
                case 224 -> 105;
                case 225 -> 103;
                case 226 -> 221;
                case 227 -> 207;
                case 228 -> 147;
                case 229 -> 236;
                case 230 -> 197;
                case 231 -> 240;
                case 232 -> 161;
                case 233 -> 177;
                case 234 -> 29;
                case 235 -> 34;
                case 236 -> 214;
                case 237 -> 5;
                case 238 -> 19;
                case 239 -> 98;
                case 240 -> 246;
                case 241 -> 206;
                case 242 -> 232;
                case 243 -> 209;
                case 244 -> 220;
                case 245 -> 25;
                case 246 -> 219;
                case 247 -> 65;
                case 248 -> 137;
                case 249 -> 122;
                case 250 -> 42;
                case 251 -> 96;
                case 252 -> 200;
                case 253 -> 129;
                case 254 -> 49;
                default -> 15;
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
