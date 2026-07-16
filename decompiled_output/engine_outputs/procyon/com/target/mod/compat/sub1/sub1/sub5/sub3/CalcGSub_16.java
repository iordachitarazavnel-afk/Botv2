// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub_16 extends AbstractLoadF
{
    private final class_310 class310;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_16() {
        super(createString(13459, -632), createString(13458, 6588), Initializer.stepF);
        this.class310 = class_310.method_1551();
    }
    
    static {
        final String[] strArr2 = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "2\u00e1\u00f9MO\u00f0\u008c£/«\u000f\u00d3(W~c\tQ\u0085\u00dd\u00ce7\u001f\"\u0015\u00e0\u00e29\u000eG\u00e6W\u00adº¯\ryg\u00eb\u001a\u00d9\u0003\u001e").length();
        int char1 = 28;
        int index = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 94);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0199: {
                        if (length2 > 1) {
                            break Label_0199;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 104;
                                case 1 -> 127;
                                case 2 -> 2;
                                case 3 -> 42;
                                case 4 -> 62;
                                case 5 -> 96;
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
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x3492) & 0xFFFF;
        if (CalcGSub_16.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_16.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 124;
                case 1 -> 236;
                case 2 -> 255;
                case 3 -> 12;
                case 4 -> 112;
                case 5 -> 84;
                case 6 -> 4;
                case 7 -> 22;
                case 8 -> 133;
                case 9 -> 166;
                case 10 -> 93;
                case 11 -> 59;
                case 12 -> 208;
                case 13 -> 44;
                case 14 -> 176;
                case 15 -> 32;
                case 16 -> 20;
                case 17 -> 162;
                case 18 -> 76;
                case 19 -> 198;
                case 20 -> 139;
                case 21 -> 187;
                case 22 -> 94;
                case 23 -> 145;
                case 24 -> 193;
                case 25 -> 237;
                case 26 -> 58;
                case 27 -> 57;
                case 28 -> 203;
                case 29 -> 183;
                case 30 -> 11;
                case 31 -> 90;
                case 32 -> 34;
                case 33 -> 0;
                case 34 -> 195;
                case 35 -> 65;
                case 36 -> 7;
                case 37 -> 136;
                case 38 -> 46;
                case 39 -> 125;
                case 40 -> 158;
                case 41 -> 170;
                case 42 -> 173;
                case 43 -> 242;
                case 44 -> 164;
                case 45 -> 130;
                case 46 -> 52;
                case 47 -> 78;
                case 48 -> 55;
                case 49 -> 175;
                case 50 -> 86;
                case 51 -> 107;
                case 52 -> 149;
                case 53 -> 181;
                case 54 -> 129;
                case 55 -> 24;
                case 56 -> 150;
                case 57 -> 152;
                case 58 -> 142;
                case 59 -> 240;
                case 60 -> 5;
                case 61 -> 14;
                case 62 -> 71;
                case 63 -> 102;
                case 64 -> 95;
                case 65 -> 161;
                case 66 -> 83;
                case 67 -> 160;
                case 68 -> 245;
                case 69 -> 70;
                case 70 -> 226;
                case 71 -> 116;
                case 72 -> 137;
                case 73 -> 148;
                case 74 -> 60;
                case 75 -> 97;
                case 76 -> 110;
                case 77 -> 209;
                case 78 -> 92;
                case 79 -> 96;
                case 80 -> 109;
                case 81 -> 157;
                case 82 -> 6;
                case 83 -> 66;
                case 84 -> 64;
                case 85 -> 146;
                case 86 -> 126;
                case 87 -> 35;
                case 88 -> 199;
                case 89 -> 8;
                case 90 -> 23;
                case 91 -> 117;
                case 92 -> 235;
                case 93 -> 26;
                case 94 -> 192;
                case 95 -> 43;
                case 96 -> 122;
                case 97 -> 114;
                case 98 -> 73;
                case 99 -> 29;
                case 100 -> 194;
                case 101 -> 80;
                case 102 -> 233;
                case 103 -> 180;
                case 104 -> 42;
                case 105 -> 244;
                case 106 -> 1;
                case 107 -> 33;
                case 108 -> 202;
                case 109 -> 53;
                case 110 -> 72;
                case 111 -> 56;
                case 112 -> 190;
                case 113 -> 79;
                case 114 -> 98;
                case 115 -> 132;
                case 116 -> 165;
                case 117 -> 228;
                case 118 -> 100;
                case 119 -> 184;
                case 120 -> 2;
                case 121 -> 171;
                case 122 -> 218;
                case 123 -> 15;
                case 124 -> 25;
                case 125 -> 216;
                case 126 -> 249;
                case 127 -> 238;
                case 128 -> 128;
                case 129 -> 49;
                case 130 -> 248;
                case 131 -> 141;
                case 132 -> 234;
                case 133 -> 231;
                case 134 -> 196;
                case 135 -> 87;
                case 136 -> 47;
                case 137 -> 16;
                case 138 -> 219;
                case 139 -> 37;
                case 140 -> 39;
                case 141 -> 159;
                case 142 -> 154;
                case 143 -> 69;
                case 144 -> 247;
                case 145 -> 227;
                case 146 -> 67;
                case 147 -> 188;
                case 148 -> 138;
                case 149 -> 31;
                case 150 -> 211;
                case 151 -> 13;
                case 152 -> 223;
                case 153 -> 186;
                case 154 -> 215;
                case 155 -> 155;
                case 156 -> 197;
                case 157 -> 115;
                case 158 -> 88;
                case 159 -> 101;
                case 160 -> 63;
                case 161 -> 127;
                case 162 -> 50;
                case 163 -> 61;
                case 164 -> 19;
                case 165 -> 10;
                case 166 -> 108;
                case 167 -> 54;
                case 168 -> 210;
                case 169 -> 17;
                case 170 -> 99;
                case 171 -> 151;
                case 172 -> 179;
                case 173 -> 81;
                case 174 -> 104;
                case 175 -> 178;
                case 176 -> 212;
                case 177 -> 9;
                case 178 -> 119;
                case 179 -> 221;
                case 180 -> 241;
                case 181 -> 172;
                case 182 -> 220;
                case 183 -> 123;
                case 184 -> 103;
                case 185 -> 118;
                case 186 -> 205;
                case 187 -> 156;
                case 188 -> 253;
                case 189 -> 191;
                case 190 -> 243;
                case 191 -> 120;
                case 192 -> 40;
                case 193 -> 204;
                case 194 -> 140;
                case 195 -> 51;
                case 196 -> 131;
                case 197 -> 217;
                case 198 -> 206;
                case 199 -> 168;
                case 200 -> 252;
                case 201 -> 135;
                case 202 -> 225;
                case 203 -> 91;
                case 204 -> 106;
                case 205 -> 222;
                case 206 -> 121;
                case 207 -> 36;
                case 208 -> 45;
                case 209 -> 254;
                case 210 -> 77;
                case 211 -> 153;
                case 212 -> 251;
                case 213 -> 200;
                case 214 -> 207;
                case 215 -> 189;
                case 216 -> 27;
                case 217 -> 185;
                case 218 -> 113;
                case 219 -> 169;
                case 220 -> 177;
                case 221 -> 250;
                case 222 -> 111;
                case 223 -> 163;
                case 224 -> 147;
                case 225 -> 246;
                case 226 -> 30;
                case 227 -> 174;
                case 228 -> 143;
                case 229 -> 21;
                case 230 -> 229;
                case 231 -> 167;
                case 232 -> 134;
                case 233 -> 3;
                case 234 -> 230;
                case 235 -> 239;
                case 236 -> 62;
                case 237 -> 75;
                case 238 -> 74;
                case 239 -> 214;
                case 240 -> 89;
                case 241 -> 213;
                case 242 -> 41;
                case 243 -> 224;
                case 244 -> 68;
                case 245 -> 232;
                case 246 -> 82;
                case 247 -> 38;
                case 248 -> 201;
                case 249 -> 182;
                case 250 -> 18;
                case 251 -> 105;
                case 252 -> 144;
                case 253 -> 28;
                case 254 -> 85;
                default -> 48;
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
            CalcGSub_16.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_16.strArr_1[n3];
    }
}
