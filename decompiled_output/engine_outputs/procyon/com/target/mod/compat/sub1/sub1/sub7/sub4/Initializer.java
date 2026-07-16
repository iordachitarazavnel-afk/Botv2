// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub4;

import com.google.gson.Gson;

public class Initializer
{
    private static final Gson gson;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public static Initializer_1 computeWrapb(final String s) {
        return new Initializer_1(createString(17650, -5219), s);
    }
    
    public static Initializer_1 computeWrapb_1(final String s) {
        return new Initializer_1(createString(17651, -30873), s);
    }
    
    static {
        final String[] strArr2 = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "j&rY\u0003\u00e8O\u00d0").length();
        int char1 = 4;
        int index = -1;
        Label_0021: {
            break Label_0021;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 55);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0200: {
                        if (length2 > 1) {
                            break Label_0200;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 84;
                                case 1 -> 39;
                                case 2 -> 109;
                                case 3 -> 90;
                                case 4 -> 19;
                                case 5 -> 32;
                                default -> 94;
                            }));
                            ++n5;
                        } while (n2 == 0);
                    }
                    if (length2 > n5) {
                        continue;
                    }
                    break;
                }
                strArr2[n++] = new String(charArray).intern();
            } while ((index += char1) < length);
        }
        strArr = strArr2;
        strArr_1 = new String[2];
        gson = new Gson();
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x44F3) & 0xFFFF;
        if (Initializer.strArr_1[n3] == null) {
            final char[] charArray = Initializer.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 199;
                case 1 -> 118;
                case 2 -> 168;
                case 3 -> 23;
                case 4 -> 61;
                case 5 -> 181;
                case 6 -> 123;
                case 7 -> 77;
                case 8 -> 142;
                case 9 -> 14;
                case 10 -> 160;
                case 11 -> 131;
                case 12 -> 136;
                case 13 -> 220;
                case 14 -> 152;
                case 15 -> 64;
                case 16 -> 167;
                case 17 -> 156;
                case 18 -> 134;
                case 19 -> 161;
                case 20 -> 190;
                case 21 -> 216;
                case 22 -> 114;
                case 23 -> 250;
                case 24 -> 115;
                case 25 -> 42;
                case 26 -> 229;
                case 27 -> 78;
                case 28 -> 83;
                case 29 -> 58;
                case 30 -> 47;
                case 31 -> 146;
                case 32 -> 94;
                case 33 -> 166;
                case 34 -> 85;
                case 35 -> 159;
                case 36 -> 238;
                case 37 -> 101;
                case 38 -> 183;
                case 39 -> 76;
                case 40 -> 68;
                case 41 -> 128;
                case 42 -> 211;
                case 43 -> 253;
                case 44 -> 197;
                case 45 -> 11;
                case 46 -> 110;
                case 47 -> 244;
                case 48 -> 116;
                case 49 -> 49;
                case 50 -> 242;
                case 51 -> 137;
                case 52 -> 107;
                case 53 -> 113;
                case 54 -> 75;
                case 55 -> 233;
                case 56 -> 32;
                case 57 -> 60;
                case 58 -> 16;
                case 59 -> 164;
                case 60 -> 36;
                case 61 -> 151;
                case 62 -> 153;
                case 63 -> 70;
                case 64 -> 99;
                case 65 -> 147;
                case 66 -> 139;
                case 67 -> 39;
                case 68 -> 4;
                case 69 -> 223;
                case 70 -> 163;
                case 71 -> 255;
                case 72 -> 0;
                case 73 -> 73;
                case 74 -> 30;
                case 75 -> 149;
                case 76 -> 9;
                case 77 -> 37;
                case 78 -> 189;
                case 79 -> 201;
                case 80 -> 205;
                case 81 -> 62;
                case 82 -> 155;
                case 83 -> 53;
                case 84 -> 196;
                case 85 -> 22;
                case 86 -> 108;
                case 87 -> 98;
                case 88 -> 148;
                case 89 -> 96;
                case 90 -> 54;
                case 91 -> 230;
                case 92 -> 87;
                case 93 -> 69;
                case 94 -> 20;
                case 95 -> 40;
                case 96 -> 7;
                case 97 -> 212;
                case 98 -> 109;
                case 99 -> 245;
                case 100 -> 144;
                case 101 -> 127;
                case 102 -> 158;
                case 103 -> 71;
                case 104 -> 3;
                case 105 -> 214;
                case 106 -> 50;
                case 107 -> 224;
                case 108 -> 225;
                case 109 -> 56;
                case 110 -> 80;
                case 111 -> 195;
                case 112 -> 29;
                case 113 -> 248;
                case 114 -> 206;
                case 115 -> 81;
                case 116 -> 91;
                case 117 -> 2;
                case 118 -> 72;
                case 119 -> 119;
                case 120 -> 204;
                case 121 -> 93;
                case 122 -> 97;
                case 123 -> 226;
                case 124 -> 177;
                case 125 -> 66;
                case 126 -> 13;
                case 127 -> 208;
                case 128 -> 213;
                case 129 -> 86;
                case 130 -> 65;
                case 131 -> 207;
                case 132 -> 227;
                case 133 -> 198;
                case 134 -> 247;
                case 135 -> 170;
                case 136 -> 55;
                case 137 -> 186;
                case 138 -> 243;
                case 139 -> 209;
                case 140 -> 235;
                case 141 -> 157;
                case 142 -> 92;
                case 143 -> 1;
                case 144 -> 95;
                case 145 -> 10;
                case 146 -> 249;
                case 147 -> 237;
                case 148 -> 48;
                case 149 -> 218;
                case 150 -> 187;
                case 151 -> 138;
                case 152 -> 169;
                case 153 -> 180;
                case 154 -> 102;
                case 155 -> 84;
                case 156 -> 236;
                case 157 -> 210;
                case 158 -> 35;
                case 159 -> 5;
                case 160 -> 182;
                case 161 -> 132;
                case 162 -> 125;
                case 163 -> 173;
                case 164 -> 143;
                case 165 -> 239;
                case 166 -> 179;
                case 167 -> 228;
                case 168 -> 74;
                case 169 -> 135;
                case 170 -> 200;
                case 171 -> 124;
                case 172 -> 175;
                case 173 -> 51;
                case 174 -> 41;
                case 175 -> 17;
                case 176 -> 165;
                case 177 -> 59;
                case 178 -> 145;
                case 179 -> 202;
                case 180 -> 106;
                case 181 -> 133;
                case 182 -> 252;
                case 183 -> 90;
                case 184 -> 89;
                case 185 -> 28;
                case 186 -> 241;
                case 187 -> 185;
                case 188 -> 18;
                case 189 -> 38;
                case 190 -> 63;
                case 191 -> 154;
                case 192 -> 178;
                case 193 -> 8;
                case 194 -> 103;
                case 195 -> 82;
                case 196 -> 129;
                case 197 -> 193;
                case 198 -> 141;
                case 199 -> 240;
                case 200 -> 222;
                case 201 -> 231;
                case 202 -> 67;
                case 203 -> 21;
                case 204 -> 112;
                case 205 -> 232;
                case 206 -> 6;
                case 207 -> 105;
                case 208 -> 19;
                case 209 -> 43;
                case 210 -> 120;
                case 211 -> 171;
                case 212 -> 12;
                case 213 -> 46;
                case 214 -> 246;
                case 215 -> 162;
                case 216 -> 130;
                case 217 -> 215;
                case 218 -> 15;
                case 219 -> 79;
                case 220 -> 217;
                case 221 -> 44;
                case 222 -> 203;
                case 223 -> 251;
                case 224 -> 104;
                case 225 -> 117;
                case 226 -> 150;
                case 227 -> 31;
                case 228 -> 122;
                case 229 -> 45;
                case 230 -> 25;
                case 231 -> 26;
                case 232 -> 121;
                case 233 -> 188;
                case 234 -> 27;
                case 235 -> 176;
                case 236 -> 234;
                case 237 -> 184;
                case 238 -> 174;
                case 239 -> 172;
                case 240 -> 254;
                case 241 -> 52;
                case 242 -> 33;
                case 243 -> 100;
                case 244 -> 126;
                case 245 -> 111;
                case 246 -> 194;
                case 247 -> 34;
                case 248 -> 191;
                case 249 -> 57;
                case 250 -> 24;
                case 251 -> 221;
                case 252 -> 192;
                case 253 -> 88;
                case 254 -> 219;
                default -> 140;
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
            Initializer.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer.strArr_1[n3];
    }
}
