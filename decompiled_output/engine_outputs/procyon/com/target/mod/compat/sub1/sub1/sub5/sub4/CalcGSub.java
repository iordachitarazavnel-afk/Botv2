// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub4;

import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import net.minecraft.class_642;
import net.minecraft.class_639;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub extends AbstractLoadF
{
    private final RenderASub bindK;
    private final RenderASub_1 buffC;
    public class_639 class639;
    public class_642 class642;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub() {
        super(createString(-24872, -20552), createString(-24871, -22926), Initializer.MISC);
        final String[] stringarrArray = Initializer.getStringarrArray();
        this.bindK = new RenderASub(createString(-24870, 4582), 3.5, 0.0, 60.0, 0.1);
        this.buffC = new RenderASub_1(createString(-24869, 12619), false);
        this.setRenderaarr(this.bindK, this.buffC);
        if (stringarrArray != null) {
            int int_1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1();
            com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int_1);
        }
    }
    
    public void setClass_639AndClass_642(final class_639 class639, final class_642 class640) {
        Initializer.getStringarrArray();
        this.class639 = class639;
        this.class642 = class640;
        if (com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1() != 0) {
            Initializer.setStringarr(new String[3]);
        }
    }
    
    public double getDouble() {
        return this.bindK.getValue();
    }
    
    @Override
    public boolean isEnabled() {
        return this.buffC.getValue();
    }
    
    public boolean isEnabled_1() {
        return this.class639 != null;
    }
    
    static {
        final String[] strArr2 = new String[4];
        int n = 0;
        String s;
        int n2 = (s = "1.o`\u0092\u0017\u00d8dEu¸\u00e8\u0005O±%\u001a\u008b").length();
        int n3 = 12;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 59));
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
                                    case 0 -> 104;
                                    case 1 -> 108;
                                    case 2 -> 61;
                                    case 3 -> 85;
                                    case 4 -> 76;
                                    case 5 -> 102;
                                    default -> 14;
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
                            n2 = (s = "\u00fd\u00f9O\u008eH#\u00e79\u0015\u00ef\u00c4\u00ea\u0011\u00c6\u007f\u00e9]\u009e\u00fc.\u0003|\u00ad\u001ej\u009f\u0010Up3$.)\u00f3\rf=\u00e7bw7*v»u·\u00c9E\u00c2\u00d5\u0016\u0016¨K]\u00f9\r\u00d5\u00deJj\u00d7»\u00db¨j\u0014\u008et}").length();
                            n3 = 56;
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
                    n5 = (n6 = (n7 = (n8 = 30)));
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
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFF9EDB) & 0xFFFF;
        if (CalcGSub.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 37;
                case 1 -> 237;
                case 2 -> 149;
                case 3 -> 221;
                case 4 -> 116;
                case 5 -> 66;
                case 6 -> 5;
                case 7 -> 44;
                case 8 -> 68;
                case 9 -> 103;
                case 10 -> 21;
                case 11 -> 167;
                case 12 -> 58;
                case 13 -> 165;
                case 14 -> 224;
                case 15 -> 170;
                case 16 -> 91;
                case 17 -> 13;
                case 18 -> 77;
                case 19 -> 181;
                case 20 -> 122;
                case 21 -> 41;
                case 22 -> 246;
                case 23 -> 35;
                case 24 -> 130;
                case 25 -> 233;
                case 26 -> 97;
                case 27 -> 178;
                case 28 -> 142;
                case 29 -> 113;
                case 30 -> 157;
                case 31 -> 14;
                case 32 -> 238;
                case 33 -> 83;
                case 34 -> 150;
                case 35 -> 136;
                case 36 -> 185;
                case 37 -> 4;
                case 38 -> 218;
                case 39 -> 123;
                case 40 -> 56;
                case 41 -> 225;
                case 42 -> 148;
                case 43 -> 125;
                case 44 -> 102;
                case 45 -> 134;
                case 46 -> 230;
                case 47 -> 208;
                case 48 -> 127;
                case 49 -> 46;
                case 50 -> 231;
                case 51 -> 18;
                case 52 -> 234;
                case 53 -> 164;
                case 54 -> 156;
                case 55 -> 219;
                case 56 -> 195;
                case 57 -> 72;
                case 58 -> 19;
                case 59 -> 76;
                case 60 -> 240;
                case 61 -> 94;
                case 62 -> 60;
                case 63 -> 173;
                case 64 -> 161;
                case 65 -> 207;
                case 66 -> 186;
                case 67 -> 201;
                case 68 -> 54;
                case 69 -> 63;
                case 70 -> 2;
                case 71 -> 124;
                case 72 -> 49;
                case 73 -> 25;
                case 74 -> 117;
                case 75 -> 15;
                case 76 -> 194;
                case 77 -> 53;
                case 78 -> 109;
                case 79 -> 143;
                case 80 -> 209;
                case 81 -> 159;
                case 82 -> 1;
                case 83 -> 84;
                case 84 -> 213;
                case 85 -> 198;
                case 86 -> 191;
                case 87 -> 10;
                case 88 -> 155;
                case 89 -> 188;
                case 90 -> 11;
                case 91 -> 166;
                case 92 -> 206;
                case 93 -> 92;
                case 94 -> 101;
                case 95 -> 223;
                case 96 -> 70;
                case 97 -> 108;
                case 98 -> 33;
                case 99 -> 112;
                case 100 -> 216;
                case 101 -> 28;
                case 102 -> 79;
                case 103 -> 128;
                case 104 -> 126;
                case 105 -> 212;
                case 106 -> 7;
                case 107 -> 203;
                case 108 -> 118;
                case 109 -> 75;
                case 110 -> 153;
                case 111 -> 174;
                case 112 -> 152;
                case 113 -> 65;
                case 114 -> 204;
                case 115 -> 243;
                case 116 -> 48;
                case 117 -> 235;
                case 118 -> 95;
                case 119 -> 74;
                case 120 -> 137;
                case 121 -> 107;
                case 122 -> 100;
                case 123 -> 175;
                case 124 -> 254;
                case 125 -> 200;
                case 126 -> 96;
                case 127 -> 147;
                case 128 -> 228;
                case 129 -> 171;
                case 130 -> 146;
                case 131 -> 20;
                case 132 -> 17;
                case 133 -> 57;
                case 134 -> 196;
                case 135 -> 87;
                case 136 -> 133;
                case 137 -> 110;
                case 138 -> 160;
                case 139 -> 168;
                case 140 -> 22;
                case 141 -> 253;
                case 142 -> 189;
                case 143 -> 104;
                case 144 -> 81;
                case 145 -> 47;
                case 146 -> 193;
                case 147 -> 199;
                case 148 -> 184;
                case 149 -> 98;
                case 150 -> 247;
                case 151 -> 132;
                case 152 -> 80;
                case 153 -> 163;
                case 154 -> 64;
                case 155 -> 197;
                case 156 -> 179;
                case 157 -> 106;
                case 158 -> 192;
                case 159 -> 151;
                case 160 -> 51;
                case 161 -> 32;
                case 162 -> 162;
                case 163 -> 214;
                case 164 -> 30;
                case 165 -> 42;
                case 166 -> 248;
                case 167 -> 73;
                case 168 -> 144;
                case 169 -> 111;
                case 170 -> 52;
                case 171 -> 36;
                case 172 -> 232;
                case 173 -> 8;
                case 174 -> 180;
                case 175 -> 82;
                case 176 -> 217;
                case 177 -> 59;
                case 178 -> 202;
                case 179 -> 67;
                case 180 -> 45;
                case 181 -> 255;
                case 182 -> 0;
                case 183 -> 85;
                case 184 -> 129;
                case 185 -> 78;
                case 186 -> 229;
                case 187 -> 222;
                case 188 -> 26;
                case 189 -> 39;
                case 190 -> 69;
                case 191 -> 29;
                case 192 -> 236;
                case 193 -> 121;
                case 194 -> 43;
                case 195 -> 38;
                case 196 -> 40;
                case 197 -> 154;
                case 198 -> 190;
                case 199 -> 252;
                case 200 -> 140;
                case 201 -> 120;
                case 202 -> 182;
                case 203 -> 187;
                case 204 -> 250;
                case 205 -> 71;
                case 206 -> 177;
                case 207 -> 34;
                case 208 -> 23;
                case 209 -> 241;
                case 210 -> 3;
                case 211 -> 172;
                case 212 -> 239;
                case 213 -> 86;
                case 214 -> 176;
                case 215 -> 226;
                case 216 -> 215;
                case 217 -> 119;
                case 218 -> 105;
                case 219 -> 145;
                case 220 -> 93;
                case 221 -> 210;
                case 222 -> 24;
                case 223 -> 141;
                case 224 -> 158;
                case 225 -> 12;
                case 226 -> 131;
                case 227 -> 135;
                case 228 -> 89;
                case 229 -> 220;
                case 230 -> 183;
                case 231 -> 211;
                case 232 -> 242;
                case 233 -> 138;
                case 234 -> 244;
                case 235 -> 61;
                case 236 -> 88;
                case 237 -> 55;
                case 238 -> 16;
                case 239 -> 205;
                case 240 -> 245;
                case 241 -> 169;
                case 242 -> 99;
                case 243 -> 6;
                case 244 -> 90;
                case 245 -> 62;
                case 246 -> 227;
                case 247 -> 9;
                case 248 -> 115;
                case 249 -> 251;
                case 250 -> 114;
                case 251 -> 31;
                case 252 -> 249;
                case 253 -> 139;
                case 254 -> 27;
                default -> 50;
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
            CalcGSub.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub.strArr_1[n3];
    }
}
