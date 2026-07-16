// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub1;

import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import java.awt.Color;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_4;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub extends AbstractLoadF
{
    public final RenderASub_1 buffC;
    public final RenderASub_1 buffC_1;
    public final RenderASub bindK;
    private final RenderASub_4 coreD;
    private final RenderASub_4 coreD_1;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub() {
        super(new String(new char[] { 'R', 'a', 'd', 'i', 'u', 'm' }), createString(8032, 16031), Initializer.CLIENT);
        final int[] intarrArray = Initializer_2.getIntarrArray();
        this.buffC = new RenderASub_1(createString(8035, 18309), false);
        final int[] array = intarrArray;
        this.buffC_1 = new RenderASub_1(createString(8034, 12872), true);
        this.bindK = new RenderASub(createString(8038, 5131), 35.0, 0.0, 100.0, 5.0);
        this.coreD = new RenderASub_4(createString(8033, 14118), new Color(255, 68, 68));
        this.coreD_1 = new RenderASub_4(createString(8039, 2128), new Color(204, 34, 34));
        this.setRenderaarr(this.coreD, this.coreD_1, this.buffC, this.buffC_1, this.bindK);
        Initializer_1.execute();
        if (array != null) {
            int int1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt();
            com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int1);
        }
    }
    
    @Override
    public int getInt() {
        final Color color = this.coreD.getColor();
        return color.getAlpha() << 24 | color.getRed() << 16 | color.getGreen() << 8 | color.getBlue();
    }
    
    public int getInt_1() {
        final Color color = this.coreD_1.getColor();
        return color.getAlpha() << 24 | color.getRed() << 16 | color.getGreen() << 8 | color.getBlue();
    }
    
    public int method_int(final double n) {
        return this.getInt();
    }
    
    @Override
    public boolean isEnabled() {
        return true;
    }
    
    @Override
    public void execute() {
    }
    
    @Override
    public void execute_1() {
    }
    
    static {
        final String[] strArr2 = new String[6];
        int n = 0;
        String s;
        int n2 = (s = "'g\u00d8\u00ad\u0094\b\u00fc\u00df_0\t¨5E\r\u00fa\u00e3_\r°\u0090\u00f9h*u\"=T\u0007V\u00e3B\u0019¸\u00f1\n").length();
        int n3 = 5;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 47));
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
                        Label_0258: {
                            if (length > 1) {
                                break Label_0258;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 44;
                                    case 1 -> 4;
                                    case 2 -> 124;
                                    case 3 -> 106;
                                    case 4 -> 59;
                                    case 5 -> 4;
                                    default -> 118;
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
                            n2 = (s = "\u00cb-\u00e9\u00da\u00db\u00c7\u009b\u00fd¾i\u001b\u00e1^\u00f3\u00c7\u000bZig+DKm\u00ebp\u00cc\u00ea").length();
                            n3 = 15;
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
                    n5 = (n6 = (n7 = (n8 = 17)));
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
        final int n3 = (n ^ 0x1F63) & 0xFFFF;
        if (CalcGSub.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 161;
                case 1 -> 17;
                case 2 -> 150;
                case 3 -> 91;
                case 4 -> 101;
                case 5 -> 209;
                case 6 -> 245;
                case 7 -> 41;
                case 8 -> 35;
                case 9 -> 224;
                case 10 -> 118;
                case 11 -> 55;
                case 12 -> 133;
                case 13 -> 38;
                case 14 -> 32;
                case 15 -> 248;
                case 16 -> 154;
                case 17 -> 160;
                case 18 -> 124;
                case 19 -> 127;
                case 20 -> 77;
                case 21 -> 13;
                case 22 -> 10;
                case 23 -> 232;
                case 24 -> 189;
                case 25 -> 240;
                case 26 -> 167;
                case 27 -> 174;
                case 28 -> 141;
                case 29 -> 187;
                case 30 -> 114;
                case 31 -> 242;
                case 32 -> 180;
                case 33 -> 12;
                case 34 -> 253;
                case 35 -> 79;
                case 36 -> 24;
                case 37 -> 115;
                case 38 -> 199;
                case 39 -> 1;
                case 40 -> 157;
                case 41 -> 208;
                case 42 -> 57;
                case 43 -> 251;
                case 44 -> 145;
                case 45 -> 239;
                case 46 -> 36;
                case 47 -> 54;
                case 48 -> 184;
                case 49 -> 182;
                case 50 -> 80;
                case 51 -> 27;
                case 52 -> 147;
                case 53 -> 132;
                case 54 -> 26;
                case 55 -> 56;
                case 56 -> 122;
                case 57 -> 68;
                case 58 -> 203;
                case 59 -> 168;
                case 60 -> 62;
                case 61 -> 204;
                case 62 -> 230;
                case 63 -> 4;
                case 64 -> 30;
                case 65 -> 46;
                case 66 -> 11;
                case 67 -> 214;
                case 68 -> 205;
                case 69 -> 200;
                case 70 -> 128;
                case 71 -> 107;
                case 72 -> 166;
                case 73 -> 137;
                case 74 -> 217;
                case 75 -> 43;
                case 76 -> 148;
                case 77 -> 234;
                case 78 -> 7;
                case 79 -> 109;
                case 80 -> 226;
                case 81 -> 136;
                case 82 -> 90;
                case 83 -> 39;
                case 84 -> 31;
                case 85 -> 158;
                case 86 -> 81;
                case 87 -> 134;
                case 88 -> 102;
                case 89 -> 74;
                case 90 -> 216;
                case 91 -> 220;
                case 92 -> 250;
                case 93 -> 196;
                case 94 -> 135;
                case 95 -> 106;
                case 96 -> 183;
                case 97 -> 75;
                case 98 -> 95;
                case 99 -> 238;
                case 100 -> 89;
                case 101 -> 94;
                case 102 -> 153;
                case 103 -> 235;
                case 104 -> 9;
                case 105 -> 69;
                case 106 -> 105;
                case 107 -> 228;
                case 108 -> 156;
                case 109 -> 254;
                case 110 -> 16;
                case 111 -> 63;
                case 112 -> 139;
                case 113 -> 165;
                case 114 -> 96;
                case 115 -> 188;
                case 116 -> 60;
                case 117 -> 255;
                case 118 -> 185;
                case 119 -> 8;
                case 120 -> 67;
                case 121 -> 87;
                case 122 -> 219;
                case 123 -> 47;
                case 124 -> 143;
                case 125 -> 97;
                case 126 -> 195;
                case 127 -> 119;
                case 128 -> 247;
                case 129 -> 15;
                case 130 -> 110;
                case 131 -> 20;
                case 132 -> 126;
                case 133 -> 5;
                case 134 -> 252;
                case 135 -> 49;
                case 136 -> 211;
                case 137 -> 22;
                case 138 -> 244;
                case 139 -> 172;
                case 140 -> 84;
                case 141 -> 152;
                case 142 -> 181;
                case 143 -> 144;
                case 144 -> 142;
                case 145 -> 206;
                case 146 -> 23;
                case 147 -> 61;
                case 148 -> 117;
                case 149 -> 18;
                case 150 -> 113;
                case 151 -> 175;
                case 152 -> 100;
                case 153 -> 193;
                case 154 -> 76;
                case 155 -> 236;
                case 156 -> 149;
                case 157 -> 65;
                case 158 -> 210;
                case 159 -> 51;
                case 160 -> 229;
                case 161 -> 163;
                case 162 -> 121;
                case 163 -> 155;
                case 164 -> 243;
                case 165 -> 233;
                case 166 -> 34;
                case 167 -> 197;
                case 168 -> 191;
                case 169 -> 108;
                case 170 -> 3;
                case 171 -> 48;
                case 172 -> 33;
                case 173 -> 78;
                case 174 -> 237;
                case 175 -> 169;
                case 176 -> 71;
                case 177 -> 140;
                case 178 -> 59;
                case 179 -> 104;
                case 180 -> 173;
                case 181 -> 227;
                case 182 -> 212;
                case 183 -> 218;
                case 184 -> 190;
                case 185 -> 85;
                case 186 -> 93;
                case 187 -> 72;
                case 188 -> 50;
                case 189 -> 99;
                case 190 -> 123;
                case 191 -> 70;
                case 192 -> 45;
                case 193 -> 241;
                case 194 -> 25;
                case 195 -> 223;
                case 196 -> 52;
                case 197 -> 170;
                case 198 -> 177;
                case 199 -> 40;
                case 200 -> 202;
                case 201 -> 192;
                case 202 -> 164;
                case 203 -> 176;
                case 204 -> 138;
                case 205 -> 88;
                case 206 -> 2;
                case 207 -> 129;
                case 208 -> 194;
                case 209 -> 213;
                case 210 -> 66;
                case 211 -> 83;
                case 212 -> 42;
                case 213 -> 162;
                case 214 -> 28;
                case 215 -> 86;
                case 216 -> 53;
                case 217 -> 112;
                case 218 -> 6;
                case 219 -> 116;
                case 220 -> 14;
                case 221 -> 221;
                case 222 -> 82;
                case 223 -> 98;
                case 224 -> 92;
                case 225 -> 0;
                case 226 -> 201;
                case 227 -> 146;
                case 228 -> 44;
                case 229 -> 131;
                case 230 -> 130;
                case 231 -> 120;
                case 232 -> 64;
                case 233 -> 231;
                case 234 -> 21;
                case 235 -> 73;
                case 236 -> 246;
                case 237 -> 58;
                case 238 -> 111;
                case 239 -> 103;
                case 240 -> 37;
                case 241 -> 19;
                case 242 -> 179;
                case 243 -> 225;
                case 244 -> 249;
                case 245 -> 178;
                case 246 -> 171;
                case 247 -> 198;
                case 248 -> 222;
                case 249 -> 125;
                case 250 -> 215;
                case 251 -> 186;
                case 252 -> 29;
                case 253 -> 159;
                case 254 -> 207;
                default -> 151;
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
