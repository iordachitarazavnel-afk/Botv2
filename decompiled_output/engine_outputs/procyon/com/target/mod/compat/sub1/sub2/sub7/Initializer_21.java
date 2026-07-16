// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

public final class Initializer_21
{
    private static final int[] intArr;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public static boolean isEnabled() {
        return true;
    }
    
    public static boolean isEnabled_1() {
        return true;
    }
    
    public static boolean isEnabled_2() {
        return true;
    }
    
    public static boolean isEnabled_3() {
        return true;
    }
    
    public static boolean isEnabled_4() {
        return true;
    }
    
    static {
        final String[] strArr2 = new String[9];
        int n = 0;
        String s;
        int n2 = (s = """
                      .\u00e1w\u009d¾\u000eP\u0017\u00d42\f\u00e5})yOPp}\u009e2^Q\u0007\u007f\f\u0011Y\u00e6\u00e7\u00f1\u0007/#\u000f
                      \u00f4\u0006#\f\u0002\u00db\u00d5\u00ad\u00d0\u00ca\u0083.\u00e0X\u0091\u001c
                      =\u00fa\u0015\u00fe\u00f2b\u00d9\u009a\u00e5\u0083;\u009d\u00f2e4\u00d3\u001f':°\u0086µ""").length();
        int n3 = 10;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 101));
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
                                    case 0 -> 35;
                                    case 1 -> 12;
                                    case 2 -> 63;
                                    case 3 -> 74;
                                    case 4 -> 96;
                                    case 5 -> 122;
                                    default -> 58;
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
                            n2 = (s = "\u0017__\u0015©\u00f5\u0084\u00e1|\u008f\u00f3\u0018\u00f5\u0007|\u0082:\u0000Gc{").length();
                            n3 = 13;
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
                    n5 = (n6 = (n7 = (n8 = 108)));
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
        strArr_1 = new String[9];
        intArr = new int[] { 2050988801, 1317851653, 460302396 };
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x3299) & 0xFFFF;
        if (Initializer_21.strArr_1[n3] == null) {
            final char[] charArray = Initializer_21.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 58;
                case 1 -> 135;
                case 2 -> 18;
                case 3 -> 200;
                case 4 -> 126;
                case 5 -> 60;
                case 6 -> 232;
                case 7 -> 255;
                case 8 -> 113;
                case 9 -> 222;
                case 10 -> 227;
                case 11 -> 202;
                case 12 -> 133;
                case 13 -> 100;
                case 14 -> 207;
                case 15 -> 220;
                case 16 -> 13;
                case 17 -> 250;
                case 18 -> 195;
                case 19 -> 20;
                case 20 -> 158;
                case 21 -> 242;
                case 22 -> 105;
                case 23 -> 219;
                case 24 -> 254;
                case 25 -> 78;
                case 26 -> 229;
                case 27 -> 109;
                case 28 -> 66;
                case 29 -> 152;
                case 30 -> 213;
                case 31 -> 26;
                case 32 -> 244;
                case 33 -> 90;
                case 34 -> 110;
                case 35 -> 84;
                case 36 -> 125;
                case 37 -> 59;
                case 38 -> 153;
                case 39 -> 191;
                case 40 -> 43;
                case 41 -> 127;
                case 42 -> 33;
                case 43 -> 221;
                case 44 -> 251;
                case 45 -> 179;
                case 46 -> 53;
                case 47 -> 76;
                case 48 -> 175;
                case 49 -> 50;
                case 50 -> 233;
                case 51 -> 129;
                case 52 -> 223;
                case 53 -> 166;
                case 54 -> 0;
                case 55 -> 83;
                case 56 -> 203;
                case 57 -> 82;
                case 58 -> 212;
                case 59 -> 189;
                case 60 -> 190;
                case 61 -> 24;
                case 62 -> 155;
                case 63 -> 186;
                case 64 -> 46;
                case 65 -> 183;
                case 66 -> 12;
                case 67 -> 41;
                case 68 -> 95;
                case 69 -> 211;
                case 70 -> 92;
                case 71 -> 177;
                case 72 -> 206;
                case 73 -> 14;
                case 74 -> 6;
                case 75 -> 157;
                case 76 -> 181;
                case 77 -> 115;
                case 78 -> 194;
                case 79 -> 193;
                case 80 -> 63;
                case 81 -> 19;
                case 82 -> 150;
                case 83 -> 47;
                case 84 -> 124;
                case 85 -> 215;
                case 86 -> 91;
                case 87 -> 8;
                case 88 -> 151;
                case 89 -> 187;
                case 90 -> 243;
                case 91 -> 52;
                case 92 -> 67;
                case 93 -> 51;
                case 94 -> 106;
                case 95 -> 172;
                case 96 -> 145;
                case 97 -> 253;
                case 98 -> 174;
                case 99 -> 241;
                case 100 -> 101;
                case 101 -> 36;
                case 102 -> 80;
                case 103 -> 235;
                case 104 -> 5;
                case 105 -> 173;
                case 106 -> 74;
                case 107 -> 214;
                case 108 -> 28;
                case 109 -> 96;
                case 110 -> 148;
                case 111 -> 40;
                case 112 -> 55;
                case 113 -> 216;
                case 114 -> 112;
                case 115 -> 144;
                case 116 -> 93;
                case 117 -> 21;
                case 118 -> 226;
                case 119 -> 88;
                case 120 -> 56;
                case 121 -> 4;
                case 122 -> 234;
                case 123 -> 165;
                case 124 -> 160;
                case 125 -> 161;
                case 126 -> 25;
                case 127 -> 17;
                case 128 -> 237;
                case 129 -> 188;
                case 130 -> 22;
                case 131 -> 123;
                case 132 -> 99;
                case 133 -> 111;
                case 134 -> 77;
                case 135 -> 108;
                case 136 -> 159;
                case 137 -> 65;
                case 138 -> 49;
                case 139 -> 57;
                case 140 -> 164;
                case 141 -> 15;
                case 142 -> 11;
                case 143 -> 196;
                case 144 -> 176;
                case 145 -> 2;
                case 146 -> 116;
                case 147 -> 10;
                case 148 -> 224;
                case 149 -> 210;
                case 150 -> 252;
                case 151 -> 117;
                case 152 -> 118;
                case 153 -> 42;
                case 154 -> 27;
                case 155 -> 225;
                case 156 -> 23;
                case 157 -> 134;
                case 158 -> 168;
                case 159 -> 54;
                case 160 -> 103;
                case 161 -> 140;
                case 162 -> 87;
                case 163 -> 231;
                case 164 -> 217;
                case 165 -> 239;
                case 166 -> 1;
                case 167 -> 70;
                case 168 -> 249;
                case 169 -> 9;
                case 170 -> 218;
                case 171 -> 16;
                case 172 -> 156;
                case 173 -> 3;
                case 174 -> 130;
                case 175 -> 122;
                case 176 -> 131;
                case 177 -> 192;
                case 178 -> 69;
                case 179 -> 85;
                case 180 -> 31;
                case 181 -> 142;
                case 182 -> 34;
                case 183 -> 170;
                case 184 -> 139;
                case 185 -> 162;
                case 186 -> 136;
                case 187 -> 149;
                case 188 -> 102;
                case 189 -> 146;
                case 190 -> 81;
                case 191 -> 45;
                case 192 -> 7;
                case 193 -> 209;
                case 194 -> 119;
                case 195 -> 180;
                case 196 -> 29;
                case 197 -> 246;
                case 198 -> 147;
                case 199 -> 198;
                case 200 -> 75;
                case 201 -> 240;
                case 202 -> 68;
                case 203 -> 104;
                case 204 -> 35;
                case 205 -> 247;
                case 206 -> 71;
                case 207 -> 44;
                case 208 -> 137;
                case 209 -> 79;
                case 210 -> 238;
                case 211 -> 141;
                case 212 -> 30;
                case 213 -> 182;
                case 214 -> 89;
                case 215 -> 171;
                case 216 -> 97;
                case 217 -> 201;
                case 218 -> 64;
                case 219 -> 132;
                case 220 -> 38;
                case 221 -> 107;
                case 222 -> 167;
                case 223 -> 163;
                case 224 -> 37;
                case 225 -> 114;
                case 226 -> 236;
                case 227 -> 120;
                case 228 -> 228;
                case 229 -> 184;
                case 230 -> 73;
                case 231 -> 199;
                case 232 -> 169;
                case 233 -> 185;
                case 234 -> 205;
                case 235 -> 128;
                case 236 -> 230;
                case 237 -> 208;
                case 238 -> 48;
                case 239 -> 248;
                case 240 -> 94;
                case 241 -> 61;
                case 242 -> 143;
                case 243 -> 204;
                case 244 -> 138;
                case 245 -> 154;
                case 246 -> 121;
                case 247 -> 86;
                case 248 -> 32;
                case 249 -> 98;
                case 250 -> 197;
                case 251 -> 178;
                case 252 -> 39;
                case 253 -> 245;
                case 254 -> 62;
                default -> 72;
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
            Initializer_21.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_21.strArr_1[n3];
    }
}
