// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub1;

import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;
import java.util.HashMap;
import java.awt.Color;
import java.util.Map;

class Initializer_3
{
    private static final int intValue = 9;
    private static final double doubleValue = 50000.0;
    private static final double doubleValue_1 = 225000.0;
    private final Map<Integer, RecordSub> map;
    private final String[] strArr;
    private final Color[] ColorArray;
    private static final String[] strArr_1;
    private static final String[] strArr_2;
    
    public Initializer_3() {
        this.map = new HashMap<Integer, RecordSub>();
        Initializer_2.getIntarrArray();
        this.strArr = new String[] { createString_1(-7716, -1365), createString_1(-7715, 19572), createString_1(-7719, 7059), createString_1(-7718, -31251), createString_1(-7713, -5187), createString_1(-7717, 29702) };
        this.ColorArray = new Color[] { new Color(159, 206, 99, 255), new Color(0, 166, 99, 255), new Color(79, 173, 234, 255), new Color(47, 110, 186, 255), new Color(245, 194, 66, 255), new Color(252, 136, 3, 255) };
        this.execute();
        if (Initializer.getInt_1() != 0) {
            Initializer_2.setIntarr(new int[2]);
        }
    }
    
    private void execute() {
        final int[][] array = { { 82, 5 }, { 100, 3 }, { 101, 3 }, { 102, 3 }, { 103, 2 }, { 104, 2 }, { 105, 2 }, { 106, 2 }, { 91, 2 }, { 83, 5 }, { 44, 3 }, { 75, 3 }, { 42, 3 }, { 41, 2 }, { 40, 2 }, { 39, 2 }, { 38, 2 }, { 92, 2 }, { 84, 5 }, { 45, 3 }, { 14, 3 }, { 13, 3 }, { 12, 2 }, { 11, 2 }, { 10, 2 }, { 37, 2 }, { 93, 2 }, { 85, 5 }, { 46, 5 }, { 74, 5 }, { 3, 3 }, { 2, 2 }, { 1, 2 }, { 25, 2 }, { 36, 2 }, { 94, 2 }, { 86, 4 }, { 47, 4 }, { 72, 4 }, { 71, 4 }, { 5, 2 }, { 4, 2 }, { 24, 2 }, { 35, 2 }, { 95, 2 }, { 87, 4 }, { 51, 1 }, { 17, 1 }, { 9, 0 }, { 8, 0 }, { 7, 0 }, { 23, 0 }, { 34, 0 }, { 96, 2 }, { 88, 4 }, { 54, 1 }, { 18, 1 }, { 61, 0 }, { 62, 0 }, { 21, 0 }, { 22, 0 }, { 33, 0 }, { 97, 0 }, { 89, 0 }, { 26, 1 }, { 27, 0 }, { 28, 0 }, { 29, 0 }, { 30, 0 }, { 59, 0 }, { 32, 0 }, { 98, 0 }, { 90, 0 }, { 107, 1 }, { 108, 1 }, { 109, 1 }, { 110, 1 }, { 111, 1 }, { 112, 1 }, { 113, 1 }, { 99, 0 } };
        final int[] intarrArray = Initializer_2.getIntarrArray();
        int i = 0;
        final int[] array2 = intarrArray;
        while (i < array.length) {
            final int n = i / 9;
            final int n2 = i % 9;
            if (array2 == null) {
                if (array[i].length >= 2) {
                    this.map.put(i, new RecordSub(array[i][0], Math.min(array[i][1], this.strArr.length - 1), n, n2));
                }
                ++i;
            }
            if (array2 != null) {
                break;
            }
        }
    }
    
    public RecordSub computeRenderh(final int i) {
        return this.map.get(i);
    }
    
    public int method_int(final double n, final double n2) {
        try {
            final int[] intarr = this.createIntarr(n, n2);
            if (this.checkCondition(intarr[0], intarr[1])) {
                final RecordSub recordSub = this.map.get(intarr[1] * 9 + intarr[0]);
                try {
                    if (recordSub != null) {
                        return recordSub.intValue;
                    }
                }
                catch (final Exception ex) {
                    throw computeException(ex);
                }
                return -1;
            }
        }
        catch (final Exception ex2) {}
        return -1;
    }
    
    public String createString(final double n, final double n2) {
        final int[] intarrArray = Initializer_2.getIntarrArray();
        try {
            final int[] intarr = this.createIntarr(n, n2);
            int checkCondition = 0;
            Label_0040: {
                int n3;
                try {
                    n3 = (checkCondition = (this.checkCondition(intarr[0], intarr[1]) ? 1 : 0));
                    if (intarrArray != null) {
                        break Label_0040;
                    }
                    if (n3 != 0) {
                        break Label_0040;
                    }
                    return createString_1(-7720, 9084);
                }
                catch (final Exception ex) {
                    throw computeException(ex);
                }
                try {
                    if (n3 == 0) {
                        return createString_1(-7720, 9084);
                    }
                    checkCondition = intarr[1] * 9 + intarr[0];
                }
                catch (final Exception ex2) {
                    throw computeException(ex2);
                }
            }
            final RecordSub recordSub = this.map.get(checkCondition);
            int n5 = 0;
            Label_0117: {
                int n4 = 0;
                Label_0099: {
                    RecordSub recordSub2;
                    try {
                        recordSub2 = recordSub;
                        if (intarrArray != null) {
                            break Label_0099;
                        }
                        if (recordSub2 == null) {
                            return createString_1(-7720, 9084);
                        }
                    }
                    catch (final Exception ex3) {
                        throw computeException(ex3);
                    }
                    try {
                        n4 = (n5 = recordSub2.intValue_1);
                        if (intarrArray != null) {
                            break Label_0117;
                        }
                        if (n4 >= 0) {
                            break Label_0117;
                        }
                        return createString_1(-7720, 9084);
                    }
                    catch (final Exception ex4) {
                        throw computeException(ex4);
                    }
                }
                try {
                    if (n4 < 0) {
                        return createString_1(-7720, 9084);
                    }
                    n5 = recordSub.intValue_1;
                }
                catch (final Exception ex5) {
                    throw computeException(ex5);
                }
            }
            if (n5 < this.strArr.length) {
                return this.strArr[recordSub.intValue_1];
            }
        }
        catch (final Exception ex6) {}
        return createString_1(-7720, 9084);
    }
    
    public Color computeColor(final int n) {
        if (n >= 0 && n < this.ColorArray.length) {
            return this.ColorArray[n];
        }
        return Color.WHITE;
    }
    
    public String[] getStringarrArray() {
        return this.strArr.clone();
    }
    
    public Color[] getColorarrArray() {
        return this.ColorArray.clone();
    }
    
    public int[] createIntarr(final double n, final double n2) {
        return new int[] { (int)((n + 225000.0) / 50000.0), (int)((n2 + 225000.0) / 50000.0) };
    }
    
    public double[] createDoublearr(final double n, final double n2) {
        return new double[] { Math.max(0.0, Math.min(1.0, (n + 225000.0) % 50000.0 / 50000.0)), Math.max(0.0, Math.min(1.0, (n2 + 225000.0) % 50000.0 / 50000.0)) };
    }
    
    private boolean checkCondition(final int n, final int n2) {
        return n >= 0 && n < 9 && n2 >= 0 && n2 < 9;
    }
    
    public int getInt() {
        return 9;
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    static {
        final String[] strArr_3 = new String[7];
        int n = 0;
        String s;
        int n2 = (s = "2\u009e¾\u00cd·]#\u0007P\u0019\u00c1\u00dct5\u008e\u0007\u001d¨?Iew\u0082\u0007k\u00e7\u0095\u00f0\u00d6ª\u008b\u0007«h\u00e7\u0097\u0098FB").length();
        int n3 = 7;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 6));
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
                                    case 0 -> 126;
                                    case 1 -> 85;
                                    case 2 -> 86;
                                    case 3 -> 94;
                                    case 4 -> 41;
                                    case 5 -> 119;
                                    default -> 15;
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
                            strArr_3[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0023;
                            }
                            n2 = (s = "\u0093{\b\t\u008d\u00f6\b±\u0000\u00d1\u0004´S!\u00cc").length();
                            n3 = 10;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr_3[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0023;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 98)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        strArr_1 = strArr_3;
        strArr_2 = new String[7];
    }
    
    private static String createString_1(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFE1D9) & 0xFFFF;
        if (Initializer_3.strArr_2[n3] == null) {
            final char[] charArray = Initializer_3.strArr_1[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 28;
                case 1 -> 101;
                case 2 -> 25;
                case 3 -> 100;
                case 4 -> 133;
                case 5 -> 246;
                case 6 -> 122;
                case 7 -> 39;
                case 8 -> 14;
                case 9 -> 129;
                case 10 -> 86;
                case 11 -> 18;
                case 12 -> 105;
                case 13 -> 146;
                case 14 -> 98;
                case 15 -> 219;
                case 16 -> 42;
                case 17 -> 183;
                case 18 -> 181;
                case 19 -> 144;
                case 20 -> 125;
                case 21 -> 84;
                case 22 -> 152;
                case 23 -> 165;
                case 24 -> 198;
                case 25 -> 0;
                case 26 -> 30;
                case 27 -> 138;
                case 28 -> 69;
                case 29 -> 157;
                case 30 -> 1;
                case 31 -> 115;
                case 32 -> 253;
                case 33 -> 167;
                case 34 -> 192;
                case 35 -> 68;
                case 36 -> 20;
                case 37 -> 195;
                case 38 -> 3;
                case 39 -> 73;
                case 40 -> 255;
                case 41 -> 228;
                case 42 -> 43;
                case 43 -> 19;
                case 44 -> 159;
                case 45 -> 193;
                case 46 -> 245;
                case 47 -> 242;
                case 48 -> 223;
                case 49 -> 94;
                case 50 -> 194;
                case 51 -> 8;
                case 52 -> 27;
                case 53 -> 216;
                case 54 -> 64;
                case 55 -> 37;
                case 56 -> 33;
                case 57 -> 55;
                case 58 -> 234;
                case 59 -> 182;
                case 60 -> 254;
                case 61 -> 22;
                case 62 -> 180;
                case 63 -> 162;
                case 64 -> 241;
                case 65 -> 26;
                case 66 -> 66;
                case 67 -> 123;
                case 68 -> 92;
                case 69 -> 90;
                case 70 -> 145;
                case 71 -> 201;
                case 72 -> 5;
                case 73 -> 171;
                case 74 -> 143;
                case 75 -> 49;
                case 76 -> 231;
                case 77 -> 44;
                case 78 -> 175;
                case 79 -> 53;
                case 80 -> 124;
                case 81 -> 173;
                case 82 -> 107;
                case 83 -> 139;
                case 84 -> 210;
                case 85 -> 85;
                case 86 -> 120;
                case 87 -> 204;
                case 88 -> 83;
                case 89 -> 104;
                case 90 -> 21;
                case 91 -> 149;
                case 92 -> 6;
                case 93 -> 4;
                case 94 -> 215;
                case 95 -> 47;
                case 96 -> 63;
                case 97 -> 113;
                case 98 -> 170;
                case 99 -> 202;
                case 100 -> 151;
                case 101 -> 220;
                case 102 -> 140;
                case 103 -> 163;
                case 104 -> 81;
                case 105 -> 178;
                case 106 -> 147;
                case 107 -> 137;
                case 108 -> 179;
                case 109 -> 13;
                case 110 -> 213;
                case 111 -> 114;
                case 112 -> 112;
                case 113 -> 103;
                case 114 -> 238;
                case 115 -> 185;
                case 116 -> 134;
                case 117 -> 197;
                case 118 -> 91;
                case 119 -> 35;
                case 120 -> 205;
                case 121 -> 32;
                case 122 -> 71;
                case 123 -> 108;
                case 124 -> 227;
                case 125 -> 158;
                case 126 -> 29;
                case 127 -> 153;
                case 128 -> 218;
                case 129 -> 191;
                case 130 -> 207;
                case 131 -> 132;
                case 132 -> 172;
                case 133 -> 54;
                case 134 -> 58;
                case 135 -> 166;
                case 136 -> 156;
                case 137 -> 77;
                case 138 -> 74;
                case 139 -> 148;
                case 140 -> 50;
                case 141 -> 189;
                case 142 -> 106;
                case 143 -> 225;
                case 144 -> 235;
                case 145 -> 76;
                case 146 -> 203;
                case 147 -> 46;
                case 148 -> 12;
                case 149 -> 51;
                case 150 -> 141;
                case 151 -> 174;
                case 152 -> 59;
                case 153 -> 80;
                case 154 -> 15;
                case 155 -> 229;
                case 156 -> 249;
                case 157 -> 24;
                case 158 -> 161;
                case 159 -> 23;
                case 160 -> 199;
                case 161 -> 176;
                case 162 -> 247;
                case 163 -> 208;
                case 164 -> 7;
                case 165 -> 48;
                case 166 -> 99;
                case 167 -> 57;
                case 168 -> 212;
                case 169 -> 127;
                case 170 -> 9;
                case 171 -> 251;
                case 172 -> 118;
                case 173 -> 93;
                case 174 -> 188;
                case 175 -> 89;
                case 176 -> 232;
                case 177 -> 187;
                case 178 -> 117;
                case 179 -> 244;
                case 180 -> 214;
                case 181 -> 110;
                case 182 -> 128;
                case 183 -> 168;
                case 184 -> 62;
                case 185 -> 237;
                case 186 -> 184;
                case 187 -> 190;
                case 188 -> 131;
                case 189 -> 87;
                case 190 -> 88;
                case 191 -> 75;
                case 192 -> 52;
                case 193 -> 224;
                case 194 -> 119;
                case 195 -> 96;
                case 196 -> 61;
                case 197 -> 31;
                case 198 -> 111;
                case 199 -> 116;
                case 200 -> 230;
                case 201 -> 250;
                case 202 -> 102;
                case 203 -> 95;
                case 204 -> 82;
                case 205 -> 211;
                case 206 -> 209;
                case 207 -> 240;
                case 208 -> 72;
                case 209 -> 169;
                case 210 -> 121;
                case 211 -> 222;
                case 212 -> 236;
                case 213 -> 135;
                case 214 -> 126;
                case 215 -> 177;
                case 216 -> 160;
                case 217 -> 239;
                case 218 -> 130;
                case 219 -> 34;
                case 220 -> 142;
                case 221 -> 217;
                case 222 -> 196;
                case 223 -> 38;
                case 224 -> 155;
                case 225 -> 40;
                case 226 -> 60;
                case 227 -> 109;
                case 228 -> 16;
                case 229 -> 70;
                case 230 -> 11;
                case 231 -> 36;
                case 232 -> 2;
                case 233 -> 186;
                case 234 -> 78;
                case 235 -> 200;
                case 236 -> 221;
                case 237 -> 243;
                case 238 -> 154;
                case 239 -> 150;
                case 240 -> 79;
                case 241 -> 67;
                case 242 -> 41;
                case 243 -> 164;
                case 244 -> 226;
                case 245 -> 206;
                case 246 -> 252;
                case 247 -> 17;
                case 248 -> 45;
                case 249 -> 233;
                case 250 -> 97;
                case 251 -> 136;
                case 252 -> 65;
                case 253 -> 10;
                case 254 -> 56;
                default -> 248;
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
            Initializer_3.strArr_2[n3] = new String(charArray).intern();
        }
        return Initializer_3.strArr_2[n3];
    }
}
