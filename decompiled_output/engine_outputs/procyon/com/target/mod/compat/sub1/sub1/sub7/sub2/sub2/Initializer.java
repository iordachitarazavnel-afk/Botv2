// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub2.sub2;

import com.google.common.base.Preconditions;

public class Initializer
{
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public static int method_int(final int n, final int n2, final int n3, final int n4) {
        Preconditions.checkArgument(checkInt(n), createString(13686, 18585) + n);
        Preconditions.checkArgument(checkInt(n2), createString(13680, 28998) + n2);
        Preconditions.checkArgument(checkInt(n3), createString(13681, 1375) + n3);
        Preconditions.checkArgument(checkInt(n4), createString(13689, -18313) + n4);
        return n4 << 24 | n << 16 | n2 << 8 | n3;
    }
    
    public static int method_int_1(final int n, final int n2, final int n3, final int n4) {
        Preconditions.checkArgument(checkInt(n), createString(13683, -15023) + n);
        Preconditions.checkArgument(checkInt(n2), createString(13684, -11681) + n2);
        Preconditions.checkArgument(checkInt(n3), createString(13690, 539) + n3);
        Preconditions.checkArgument(checkInt(n4), createString(13691, -18534) + n4);
        return n << 24 | n2 << 16 | n3 << 8 | n4;
    }
    
    public static int[] computeIntarr(final int n) {
        return new int[] { n >> 24 & 0xFF, n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF };
    }
    
    public static int[] computeIntarr_1(final int n) {
        return new int[] { n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, n >> 24 & 0xFF };
    }
    
    public static int[] computeIntarr_2(final int n) {
        return new int[] { n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF };
    }
    
    public static float[] computeFloatarr(final int[] array) {
        final String string = Initializer_2.getString();
        int length;
        final int n = length = array.length;
        if (string == null) {
            if (n == 4) {
                length = 1;
            }
            else {
                length = 0;
            }
        }
        Preconditions.checkArgument((boolean)(length != 0), createString(13687, -9136) + array.length);
        int i = 0;
        while (true) {
            while (i < array.length) {
                final int checkInt = checkInt(array[i]) ? 1 : 0;
                if (string != null) {
                    final float[] array2 = new float[checkInt];
                    array2[0] = array[0] / 255.0f;
                    array2[1] = array[1] / 255.0f;
                    array2[2] = array[2] / 255.0f;
                    array2[3] = array[3] / 255.0f;
                    return array2;
                }
                Preconditions.checkArgument((boolean)(checkInt != 0), createString(13682, 30474) + i + createString(13685, -11906) + array[i]);
                ++i;
                if (string != null) {
                    break;
                }
            }
            continue;
        }
    }
    
    private static boolean checkInt(final int n) {
        return n >= 0 && n <= 255;
    }
    
    static {
        final String[] strArr2 = new String[11];
        int n = 0;
        String s;
        int n2 = (s = "\n\u00f4\u0001¬O/5\u0018\u0014D¦²\u0098:\u0090]\u00c1rCMc\u008b\u0088\u001f\u00ea\u00d0\u0005\u0000¥\u00e4H`\u0092\fS\u0086*\u00e2*\u00e6\u0099!\u0081xZb!\u0015\u0005\u00e2\u00923\u00e8º\u00e0\u00e5K\u0098A_Dh\u0092\u00de\u008b r\u001fl\u0007\u00e3\u001bO;\u00f3b\u009a°¯\u008d!peN\u009e¦i\b\u00d0³HR\u0084\u0006\u00fcC\u0085»i\f.\u008a\u00e7µ\u0092Ma\u00f16;\"\u009b¸\u00e8\u001e\u0080VP\u00f8e¥pI¼u\u00fd\u00ec@\u008c{S\u00f0\u00e8µWg¨¢5|FF5T_!?$§¶\u009bl¯pGI\u00cc\u0013\u00d5\u000e9\u00db\u00f4¢\u00e5W·\u00c8\u0012w¹\u00ddo¡\u00e8\u00d0\u00e1\u00e6§\u0013\u00fa£\u0000\u001f¨\u0004\u00e2\u00ed\u00fei\u00fb\u00e29U\u00f7?h8\u00dd!\u0015\u00d2\u00e2h3·º\u000b\u00e53\u0098\u00eb_\u0011h8\u00de\u00de \u00d8\u001f9\u0007I\u001b\u001a;Yb\u00cf°\u0005\u008d!\u00de\u00f1\u009b\f\u001c;_\u009aY\u0007\u000f«\u00ad\u001969\u0015\u00fe\u00d9\u00dc0¹\u00e2Y§\u0018¬\u0019\u0090\u00c7\u00ee\u0004F").length();
        int n3 = 33;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 21));
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
                                    case 0 -> 58;
                                    case 1 -> 77;
                                    case 2 -> 45;
                                    case 3 -> 62;
                                    case 4 -> 96;
                                    case 5 -> 119;
                                    default -> 13;
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
                            n2 = (s = "5fF^\u0007\u00d1\u009cg\u0081\u001b´\u00ebz±l\u008c\u00fe\u00e8\u0004¾+U!d\u007f\u001f\u0017YGo´±\u00ad!!´\u00c4\u0004W\u009a\u0096\u000e\u00c05\u009cM\u007fe\u00cc\u0016\u00ea»\u0086\u00d4{\u0018+\u00cd>*?\u00ffB»\u0014+¹").length();
                            n3 = 33;
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
                    n5 = (n6 = (n7 = (n8 = 49)));
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
        strArr_1 = new String[11];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x3573) & 0xFFFF;
        if (Initializer.strArr_1[n3] == null) {
            final char[] charArray = Initializer.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 1;
                case 1 -> 178;
                case 2 -> 59;
                case 3 -> 181;
                case 4 -> 80;
                case 5 -> 92;
                case 6 -> 255;
                case 7 -> 156;
                case 8 -> 54;
                case 9 -> 223;
                case 10 -> 29;
                case 11 -> 194;
                case 12 -> 151;
                case 13 -> 165;
                case 14 -> 91;
                case 15 -> 4;
                case 16 -> 68;
                case 17 -> 190;
                case 18 -> 233;
                case 19 -> 32;
                case 20 -> 162;
                case 21 -> 221;
                case 22 -> 119;
                case 23 -> 24;
                case 24 -> 173;
                case 25 -> 155;
                case 26 -> 113;
                case 27 -> 57;
                case 28 -> 104;
                case 29 -> 150;
                case 30 -> 174;
                case 31 -> 5;
                case 32 -> 62;
                case 33 -> 134;
                case 34 -> 186;
                case 35 -> 200;
                case 36 -> 65;
                case 37 -> 241;
                case 38 -> 55;
                case 39 -> 71;
                case 40 -> 191;
                case 41 -> 60;
                case 42 -> 8;
                case 43 -> 10;
                case 44 -> 98;
                case 45 -> 167;
                case 46 -> 12;
                case 47 -> 193;
                case 48 -> 239;
                case 49 -> 97;
                case 50 -> 35;
                case 51 -> 107;
                case 52 -> 237;
                case 53 -> 33;
                case 54 -> 153;
                case 55 -> 88;
                case 56 -> 228;
                case 57 -> 27;
                case 58 -> 224;
                case 59 -> 25;
                case 60 -> 19;
                case 61 -> 254;
                case 62 -> 160;
                case 63 -> 183;
                case 64 -> 166;
                case 65 -> 243;
                case 66 -> 99;
                case 67 -> 140;
                case 68 -> 212;
                case 69 -> 250;
                case 70 -> 63;
                case 71 -> 56;
                case 72 -> 50;
                case 73 -> 128;
                case 74 -> 225;
                case 75 -> 31;
                case 76 -> 21;
                case 77 -> 189;
                case 78 -> 163;
                case 79 -> 132;
                case 80 -> 73;
                case 81 -> 0;
                case 82 -> 90;
                case 83 -> 58;
                case 84 -> 168;
                case 85 -> 232;
                case 86 -> 198;
                case 87 -> 240;
                case 88 -> 208;
                case 89 -> 122;
                case 90 -> 142;
                case 91 -> 77;
                case 92 -> 213;
                case 93 -> 131;
                case 94 -> 170;
                case 95 -> 44;
                case 96 -> 75;
                case 97 -> 207;
                case 98 -> 41;
                case 99 -> 105;
                case 100 -> 106;
                case 101 -> 47;
                case 102 -> 242;
                case 103 -> 204;
                case 104 -> 53;
                case 105 -> 154;
                case 106 -> 16;
                case 107 -> 23;
                case 108 -> 30;
                case 109 -> 161;
                case 110 -> 2;
                case 111 -> 118;
                case 112 -> 22;
                case 113 -> 101;
                case 114 -> 203;
                case 115 -> 147;
                case 116 -> 205;
                case 117 -> 214;
                case 118 -> 110;
                case 119 -> 217;
                case 120 -> 6;
                case 121 -> 130;
                case 122 -> 219;
                case 123 -> 197;
                case 124 -> 209;
                case 125 -> 36;
                case 126 -> 20;
                case 127 -> 28;
                case 128 -> 49;
                case 129 -> 108;
                case 130 -> 157;
                case 131 -> 210;
                case 132 -> 112;
                case 133 -> 235;
                case 134 -> 206;
                case 135 -> 64;
                case 136 -> 9;
                case 137 -> 51;
                case 138 -> 109;
                case 139 -> 79;
                case 140 -> 184;
                case 141 -> 95;
                case 142 -> 202;
                case 143 -> 231;
                case 144 -> 146;
                case 145 -> 84;
                case 146 -> 159;
                case 147 -> 248;
                case 148 -> 61;
                case 149 -> 103;
                case 150 -> 39;
                case 151 -> 247;
                case 152 -> 137;
                case 153 -> 135;
                case 154 -> 187;
                case 155 -> 195;
                case 156 -> 40;
                case 157 -> 93;
                case 158 -> 126;
                case 159 -> 171;
                case 160 -> 169;
                case 161 -> 74;
                case 162 -> 13;
                case 163 -> 245;
                case 164 -> 138;
                case 165 -> 172;
                case 166 -> 17;
                case 167 -> 226;
                case 168 -> 124;
                case 169 -> 251;
                case 170 -> 94;
                case 171 -> 115;
                case 172 -> 227;
                case 173 -> 69;
                case 174 -> 148;
                case 175 -> 102;
                case 176 -> 43;
                case 177 -> 196;
                case 178 -> 182;
                case 179 -> 26;
                case 180 -> 89;
                case 181 -> 244;
                case 182 -> 179;
                case 183 -> 141;
                case 184 -> 87;
                case 185 -> 120;
                case 186 -> 175;
                case 187 -> 234;
                case 188 -> 218;
                case 189 -> 46;
                case 190 -> 133;
                case 191 -> 85;
                case 192 -> 152;
                case 193 -> 18;
                case 194 -> 67;
                case 195 -> 72;
                case 196 -> 14;
                case 197 -> 180;
                case 198 -> 158;
                case 199 -> 177;
                case 200 -> 127;
                case 201 -> 86;
                case 202 -> 229;
                case 203 -> 48;
                case 204 -> 199;
                case 205 -> 149;
                case 206 -> 117;
                case 207 -> 76;
                case 208 -> 83;
                case 209 -> 96;
                case 210 -> 215;
                case 211 -> 185;
                case 212 -> 37;
                case 213 -> 246;
                case 214 -> 3;
                case 215 -> 116;
                case 216 -> 216;
                case 217 -> 42;
                case 218 -> 129;
                case 219 -> 236;
                case 220 -> 188;
                case 221 -> 121;
                case 222 -> 78;
                case 223 -> 136;
                case 224 -> 45;
                case 225 -> 52;
                case 226 -> 238;
                case 227 -> 123;
                case 228 -> 11;
                case 229 -> 211;
                case 230 -> 66;
                case 231 -> 253;
                case 232 -> 164;
                case 233 -> 125;
                case 234 -> 7;
                case 235 -> 70;
                case 236 -> 222;
                case 237 -> 114;
                case 238 -> 220;
                case 239 -> 34;
                case 240 -> 249;
                case 241 -> 230;
                case 242 -> 144;
                case 243 -> 15;
                case 244 -> 145;
                case 245 -> 111;
                case 246 -> 252;
                case 247 -> 81;
                case 248 -> 192;
                case 249 -> 38;
                case 250 -> 100;
                case 251 -> 82;
                case 252 -> 176;
                case 253 -> 139;
                case 254 -> 143;
                default -> 201;
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
