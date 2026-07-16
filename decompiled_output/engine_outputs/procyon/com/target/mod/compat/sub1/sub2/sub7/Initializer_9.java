// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import org.lwjgl.glfw.GLFW;
import net.minecraft.class_310;

public class Initializer_9
{
    private static final class_310 class310;
    private static final boolean[] boolArray;
    private static final boolean[] boolArray_1;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public static boolean checkInt(final int n) {
        if (Initializer_9.class310.method_22683() == null) {
            return false;
        }
        if (n >= 0 && n <= 7) {
            return GLFW.glfwGetMouseButton(Initializer_9.class310.method_22683().method_4490(), n) == 1;
        }
        return n >= 32 && n < 512 && GLFW.glfwGetKey(Initializer_9.class310.method_22683().method_4490(), n) == 1;
    }
    
    public static boolean checkInt_1(final int n) {
        if (Initializer_9.class310.method_22683() == null) {
            return false;
        }
        final boolean checkInt = checkInt(n);
        boolean b;
        if (n >= 0 && n <= 7) {
            b = (checkInt && !Initializer_9.boolArray_1[n]);
            Initializer_9.boolArray_1[n] = checkInt;
        }
        else {
            if (n < 32 || n >= 512) {
                return false;
            }
            b = (checkInt && !Initializer_9.boolArray[n]);
            Initializer_9.boolArray[n] = checkInt;
        }
        return b;
    }
    
    public static String computeString(final int n) {
        final int int_1 = Initializer_14.getInt_1();
        int n2 = n;
        int n3 = n;
        if (int_1 != 0) {
            if (n == -1) {
                return createString(-21322, 22074);
            }
            n2 = n;
            n3 = n;
        }
        int n4 = 0;
        Label_0129: {
            if (int_1 != 0) {
                if (n3 >= 0) {
                    n2 = n;
                    n4 = 7;
                    if (int_1 == 0) {
                        break Label_0129;
                    }
                    if (n <= n4) {
                        int n5 = n;
                        if (int_1 != 0) {
                            switch (n) {
                                case 0: {
                                    return createString(-21344, 29386);
                                }
                                case 1: {
                                    return createString(-21338, 20178);
                                }
                                case 2: {
                                    return createString(-21320, 2262);
                                }
                                default: {
                                    n5 = n + 1;
                                    break;
                                }
                            }
                        }
                        return createString(-21337, 25884) + n5;
                    }
                }
                n2 = n;
            }
        }
        final String glfwGetKeyName;
        final String s2 = glfwGetKeyName = GLFW.glfwGetKeyName(n2, n4);
        if (int_1 != 0) {
            if (glfwGetKeyName == null) {
                int n6 = n;
                if (int_1 != 0) {
                    switch (n) {
                        case 32: {
                            return createString(-21326, -11032);
                        }
                        case 340: {
                            return createString(-21341, 29400);
                        }
                        case 344: {
                            return createString(-21342, 18256);
                        }
                        case 341: {
                            return createString(-21328, 2075);
                        }
                        case 345: {
                            return createString(-21329, -23982);
                        }
                        case 342: {
                            return createString(-21313, -27718);
                        }
                        case 346: {
                            return createString(-21327, -1763);
                        }
                        case 258: {
                            return createString(-21316, 13830);
                        }
                        case 257: {
                            return createString(-21323, 3134);
                        }
                        case 256: {
                            return createString(-21319, -2480);
                        }
                        case 260: {
                            return createString(-21317, -30502);
                        }
                        case 261: {
                            return createString(-21314, -6215);
                        }
                        case 268: {
                            return createString(-21324, -22108);
                        }
                        case 269: {
                            return createString(-21339, -19312);
                        }
                        case 266: {
                            return createString(-21340, -31439);
                        }
                        case 267: {
                            return createString(-21325, 3902);
                        }
                        case 265: {
                            return createString(-21315, 15854);
                        }
                        case 264: {
                            return createString(-21318, -5231);
                        }
                        case 263: {
                            return createString(-21321, -25850);
                        }
                        case 262: {
                            return createString(-21330, 25160);
                        }
                        default: {
                            n6 = n;
                            break;
                        }
                    }
                }
                return createString(-21343, -28856) + n6;
            }
            s2.toUpperCase();
        }
        return glfwGetKeyName;
    }
    
    static {
        final String[] strArr2 = new String[26];
        int n = 0;
        String s;
        int n2 = (s = "\n\u00d0\u00ea\t\u0004³*\u0097\f\u0005\u00dbz\u00ea'\u00d0\u0004w\u0001\u00cai\u0004\u00f1«(>\u0005!bt\u00ff£\u0005\u000fH°C\u000e\u0006 \u008e\u009a\u0083\u000fw\u0005\u0004F\f\u0082\u0099\u0006\u00ff\u00ecW\u009fz\u00ce\u0002\b¢\u0003\u007fF[\u0006¸±\f^\u00eb\u00e7\u0004\"\u00ff\u00f7½\u0006\u00cb\u000f\u00ff3\u0085\u00df\u0007a\u0003\u0083*7V\u00e8\u0006\u00f0\u00c7\u0087§KX\u0007G\u00e0»V0\u00d9\b\u0003\"\u0089\u00c5\u0004©\u00162\u0097\u0007O\u00d8wU»8f\u0007°\u009aU\u001d\u00ff1\u00ee\u0004©bf\u000b\u0007\u00ce+W/\u00ad\u00f6»").length();
        int n3 = 4;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 53));
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
                                    case 0 -> 46;
                                    case 1 -> 114;
                                    case 2 -> 94;
                                    case 3 -> 115;
                                    case 4 -> 93;
                                    case 5 -> 108;
                                    default -> 25;
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
                                continue Label_0022;
                            }
                            n2 = (s = "+\u00d8»\u00c4¦\u0012\u0005ª+¯j\u0082").length();
                            n3 = 6;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0022;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 57)));
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
        strArr_1 = new String[26];
        class310 = class_310.method_1551();
        boolArray = new boolean[512];
        boolArray_1 = new boolean[8];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFACB7) & 0xFFFF;
        if (Initializer_9.strArr_1[n3] == null) {
            final char[] charArray = Initializer_9.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 181;
                case 1 -> 1;
                case 2 -> 245;
                case 3 -> 97;
                case 4 -> 27;
                case 5 -> 198;
                case 6 -> 166;
                case 7 -> 96;
                case 8 -> 179;
                case 9 -> 44;
                case 10 -> 131;
                case 11 -> 28;
                case 12 -> 167;
                case 13 -> 59;
                case 14 -> 78;
                case 15 -> 249;
                case 16 -> 24;
                case 17 -> 169;
                case 18 -> 71;
                case 19 -> 168;
                case 20 -> 215;
                case 21 -> 204;
                case 22 -> 251;
                case 23 -> 3;
                case 24 -> 41;
                case 25 -> 153;
                case 26 -> 34;
                case 27 -> 148;
                case 28 -> 255;
                case 29 -> 211;
                case 30 -> 0;
                case 31 -> 103;
                case 32 -> 106;
                case 33 -> 164;
                case 34 -> 241;
                case 35 -> 11;
                case 36 -> 31;
                case 37 -> 208;
                case 38 -> 237;
                case 39 -> 38;
                case 40 -> 65;
                case 41 -> 150;
                case 42 -> 40;
                case 43 -> 82;
                case 44 -> 188;
                case 45 -> 75;
                case 46 -> 80;
                case 47 -> 61;
                case 48 -> 4;
                case 49 -> 233;
                case 50 -> 195;
                case 51 -> 83;
                case 52 -> 238;
                case 53 -> 137;
                case 54 -> 51;
                case 55 -> 213;
                case 56 -> 193;
                case 57 -> 20;
                case 58 -> 127;
                case 59 -> 130;
                case 60 -> 228;
                case 61 -> 93;
                case 62 -> 170;
                case 63 -> 77;
                case 64 -> 60;
                case 65 -> 129;
                case 66 -> 217;
                case 67 -> 203;
                case 68 -> 209;
                case 69 -> 230;
                case 70 -> 154;
                case 71 -> 117;
                case 72 -> 76;
                case 73 -> 52;
                case 74 -> 67;
                case 75 -> 142;
                case 76 -> 248;
                case 77 -> 175;
                case 78 -> 74;
                case 79 -> 32;
                case 80 -> 231;
                case 81 -> 122;
                case 82 -> 173;
                case 83 -> 37;
                case 84 -> 192;
                case 85 -> 223;
                case 86 -> 10;
                case 87 -> 43;
                case 88 -> 225;
                case 89 -> 119;
                case 90 -> 163;
                case 91 -> 109;
                case 92 -> 196;
                case 93 -> 22;
                case 94 -> 63;
                case 95 -> 6;
                case 96 -> 17;
                case 97 -> 247;
                case 98 -> 19;
                case 99 -> 180;
                case 100 -> 214;
                case 101 -> 50;
                case 102 -> 66;
                case 103 -> 172;
                case 104 -> 239;
                case 105 -> 218;
                case 106 -> 158;
                case 107 -> 236;
                case 108 -> 128;
                case 109 -> 171;
                case 110 -> 133;
                case 111 -> 141;
                case 112 -> 85;
                case 113 -> 234;
                case 114 -> 253;
                case 115 -> 86;
                case 116 -> 160;
                case 117 -> 58;
                case 118 -> 252;
                case 119 -> 57;
                case 120 -> 116;
                case 121 -> 53;
                case 122 -> 159;
                case 123 -> 15;
                case 124 -> 200;
                case 125 -> 33;
                case 126 -> 113;
                case 127 -> 102;
                case 128 -> 81;
                case 129 -> 216;
                case 130 -> 138;
                case 131 -> 144;
                case 132 -> 62;
                case 133 -> 165;
                case 134 -> 23;
                case 135 -> 219;
                case 136 -> 12;
                case 137 -> 243;
                case 138 -> 135;
                case 139 -> 224;
                case 140 -> 26;
                case 141 -> 121;
                case 142 -> 125;
                case 143 -> 92;
                case 144 -> 123;
                case 145 -> 107;
                case 146 -> 242;
                case 147 -> 134;
                case 148 -> 194;
                case 149 -> 111;
                case 150 -> 115;
                case 151 -> 205;
                case 152 -> 73;
                case 153 -> 146;
                case 154 -> 101;
                case 155 -> 149;
                case 156 -> 161;
                case 157 -> 94;
                case 158 -> 189;
                case 159 -> 9;
                case 160 -> 95;
                case 161 -> 136;
                case 162 -> 48;
                case 163 -> 240;
                case 164 -> 69;
                case 165 -> 222;
                case 166 -> 210;
                case 167 -> 182;
                case 168 -> 84;
                case 169 -> 29;
                case 170 -> 202;
                case 171 -> 87;
                case 172 -> 68;
                case 173 -> 46;
                case 174 -> 186;
                case 175 -> 64;
                case 176 -> 140;
                case 177 -> 126;
                case 178 -> 79;
                case 179 -> 114;
                case 180 -> 232;
                case 181 -> 207;
                case 182 -> 254;
                case 183 -> 177;
                case 184 -> 47;
                case 185 -> 39;
                case 186 -> 206;
                case 187 -> 36;
                case 188 -> 244;
                case 189 -> 89;
                case 190 -> 42;
                case 191 -> 110;
                case 192 -> 185;
                case 193 -> 120;
                case 194 -> 184;
                case 195 -> 2;
                case 196 -> 14;
                case 197 -> 221;
                case 198 -> 145;
                case 199 -> 45;
                case 200 -> 143;
                case 201 -> 35;
                case 202 -> 139;
                case 203 -> 21;
                case 204 -> 199;
                case 205 -> 105;
                case 206 -> 70;
                case 207 -> 8;
                case 208 -> 187;
                case 209 -> 162;
                case 210 -> 183;
                case 211 -> 229;
                case 212 -> 156;
                case 213 -> 49;
                case 214 -> 152;
                case 215 -> 226;
                case 216 -> 174;
                case 217 -> 178;
                case 218 -> 88;
                case 219 -> 176;
                case 220 -> 18;
                case 221 -> 99;
                case 222 -> 30;
                case 223 -> 100;
                case 224 -> 190;
                case 225 -> 5;
                case 226 -> 16;
                case 227 -> 72;
                case 228 -> 25;
                case 229 -> 112;
                case 230 -> 104;
                case 231 -> 235;
                case 232 -> 56;
                case 233 -> 90;
                case 234 -> 132;
                case 235 -> 118;
                case 236 -> 54;
                case 237 -> 7;
                case 238 -> 147;
                case 239 -> 124;
                case 240 -> 197;
                case 241 -> 151;
                case 242 -> 191;
                case 243 -> 201;
                case 244 -> 91;
                case 245 -> 157;
                case 246 -> 108;
                case 247 -> 155;
                case 248 -> 220;
                case 249 -> 13;
                case 250 -> 250;
                case 251 -> 55;
                case 252 -> 227;
                case 253 -> 212;
                case 254 -> 98;
                default -> 246;
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
            Initializer_9.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_9.strArr_1[n3];
    }
}
