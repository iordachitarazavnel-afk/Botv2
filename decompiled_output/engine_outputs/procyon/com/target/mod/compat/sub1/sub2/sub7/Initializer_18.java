// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

public final class Initializer_18
{
    private double doubleValue;
    private final double doubleValue_1;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_18(final double n) {
        this.doubleValue = n;
        this.doubleValue_1 = n;
    }
    
    public void setDoubleAndDouble(final double n, final double doubleValue) {
        final int int_1 = Initializer_14.getInt_1();
        boolean b2;
        final boolean b = b2 = Initializer_16.checkConfiga(Initializer_5.NORMAL);
        if (int_1 != 0) {
            if (b) {
                this.doubleValue = Initializer_3.method_double_2((float)n, this.doubleValue, doubleValue);
                if (int_1 != 0) {
                    return;
                }
            }
            final boolean checkConfiga;
            b2 = (checkConfiga = Initializer_16.checkConfiga(Initializer_5.POSITIVE));
        }
        if (int_1 != 0) {
            if (b) {
                this.doubleValue = Initializer_3.method_double_1(n, this.doubleValue, doubleValue);
                if (int_1 != 0) {
                    return;
                }
            }
            b2 = Initializer_16.checkConfiga(Initializer_5.configA);
        }
        if (b2) {
            this.doubleValue = doubleValue;
            if (int_1 != 0) {
                return;
            }
        }
        this.doubleValue = Initializer_3.method_double_1(n, this.doubleValue, doubleValue);
    }
    
    public double getDouble() {
        return this.doubleValue;
    }
    
    public void setDouble(final double n) {
        this.doubleValue = Initializer_3.method_double_1(n, this.doubleValue, this.doubleValue_1);
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    static {
        final String[] strArr2 = new String[10];
        int n = 0;
        String s;
        int n2 = (s = "\\9v2«:W\u00f8\u00c3-\u0093\u00fd¥\u0013\u00e9\b\u00da§\u00f5\b\u0005p¿R\u0086\u0098\f'\u00f3\r±\u0094\u00fa\u0089\u0004{\u00dd\u00f8{\u0004\u0018\u0001¦\u00eb\fJ\u00d6´\u00cf\u00f3\u0082VR\u00c9I¹i\u0010\u00d5\u00de+\u00f0\u0081\u00c4³6¶\u00ff\u00c5¡)+¸\u00f2\u0002!\u00f7\u0014\u00e9\u00ff\u00c0\u00ea}!\u008d\u009b\u0098A\u00f8p\u00c8¢D>oaC\u00d0").length();
        int n3 = 20;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 8));
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
                                    case 0 -> 22;
                                    case 1 -> 64;
                                    case 2 -> 103;
                                    case 3 -> 56;
                                    case 4 -> 22;
                                    case 5 -> 86;
                                    default -> 109;
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
                            n2 = (s = "s8e\u00f4\u0088\u00e0\n\u00c0:\u0005t>\u0099·\u00fc").length();
                            n3 = 9;
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
                    n5 = (n6 = (n7 = (n8 = 125)));
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
        strArr_1 = new String[10];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFF0F3) & 0xFFFF;
        if (Initializer_18.strArr_1[n3] == null) {
            final char[] charArray = Initializer_18.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 52;
                case 1 -> 9;
                case 2 -> 157;
                case 3 -> 243;
                case 4 -> 92;
                case 5 -> 159;
                case 6 -> 170;
                case 7 -> 209;
                case 8 -> 248;
                case 9 -> 224;
                case 10 -> 59;
                case 11 -> 178;
                case 12 -> 35;
                case 13 -> 106;
                case 14 -> 195;
                case 15 -> 235;
                case 16 -> 172;
                case 17 -> 103;
                case 18 -> 74;
                case 19 -> 31;
                case 20 -> 16;
                case 21 -> 2;
                case 22 -> 127;
                case 23 -> 179;
                case 24 -> 199;
                case 25 -> 143;
                case 26 -> 27;
                case 27 -> 77;
                case 28 -> 110;
                case 29 -> 100;
                case 30 -> 165;
                case 31 -> 240;
                case 32 -> 21;
                case 33 -> 149;
                case 34 -> 160;
                case 35 -> 194;
                case 36 -> 122;
                case 37 -> 26;
                case 38 -> 220;
                case 39 -> 102;
                case 40 -> 32;
                case 41 -> 39;
                case 42 -> 57;
                case 43 -> 117;
                case 44 -> 87;
                case 45 -> 134;
                case 46 -> 230;
                case 47 -> 154;
                case 48 -> 64;
                case 49 -> 210;
                case 50 -> 153;
                case 51 -> 125;
                case 52 -> 24;
                case 53 -> 142;
                case 54 -> 190;
                case 55 -> 217;
                case 56 -> 203;
                case 57 -> 72;
                case 58 -> 67;
                case 59 -> 63;
                case 60 -> 138;
                case 61 -> 141;
                case 62 -> 36;
                case 63 -> 13;
                case 64 -> 109;
                case 65 -> 120;
                case 66 -> 173;
                case 67 -> 119;
                case 68 -> 114;
                case 69 -> 90;
                case 70 -> 254;
                case 71 -> 19;
                case 72 -> 73;
                case 73 -> 111;
                case 74 -> 132;
                case 75 -> 152;
                case 76 -> 137;
                case 77 -> 211;
                case 78 -> 0;
                case 79 -> 174;
                case 80 -> 249;
                case 81 -> 148;
                case 82 -> 65;
                case 83 -> 69;
                case 84 -> 197;
                case 85 -> 11;
                case 86 -> 60;
                case 87 -> 33;
                case 88 -> 247;
                case 89 -> 108;
                case 90 -> 55;
                case 91 -> 15;
                case 92 -> 167;
                case 93 -> 99;
                case 94 -> 253;
                case 95 -> 201;
                case 96 -> 227;
                case 97 -> 200;
                case 98 -> 10;
                case 99 -> 223;
                case 100 -> 146;
                case 101 -> 196;
                case 102 -> 214;
                case 103 -> 191;
                case 104 -> 198;
                case 105 -> 105;
                case 106 -> 226;
                case 107 -> 91;
                case 108 -> 229;
                case 109 -> 155;
                case 110 -> 29;
                case 111 -> 25;
                case 112 -> 6;
                case 113 -> 186;
                case 114 -> 228;
                case 115 -> 43;
                case 116 -> 1;
                case 117 -> 20;
                case 118 -> 28;
                case 119 -> 147;
                case 120 -> 78;
                case 121 -> 115;
                case 122 -> 189;
                case 123 -> 84;
                case 124 -> 124;
                case 125 -> 188;
                case 126 -> 158;
                case 127 -> 176;
                case 128 -> 242;
                case 129 -> 96;
                case 130 -> 250;
                case 131 -> 38;
                case 132 -> 204;
                case 133 -> 163;
                case 134 -> 56;
                case 135 -> 98;
                case 136 -> 177;
                case 137 -> 213;
                case 138 -> 113;
                case 139 -> 184;
                case 140 -> 66;
                case 141 -> 156;
                case 142 -> 89;
                case 143 -> 215;
                case 144 -> 166;
                case 145 -> 17;
                case 146 -> 237;
                case 147 -> 231;
                case 148 -> 45;
                case 149 -> 168;
                case 150 -> 53;
                case 151 -> 107;
                case 152 -> 202;
                case 153 -> 61;
                case 154 -> 51;
                case 155 -> 4;
                case 156 -> 169;
                case 157 -> 162;
                case 158 -> 76;
                case 159 -> 221;
                case 160 -> 233;
                case 161 -> 236;
                case 162 -> 207;
                case 163 -> 121;
                case 164 -> 128;
                case 165 -> 251;
                case 166 -> 94;
                case 167 -> 183;
                case 168 -> 238;
                case 169 -> 44;
                case 170 -> 239;
                case 171 -> 130;
                case 172 -> 104;
                case 173 -> 93;
                case 174 -> 79;
                case 175 -> 112;
                case 176 -> 129;
                case 177 -> 145;
                case 178 -> 97;
                case 179 -> 126;
                case 180 -> 185;
                case 181 -> 101;
                case 182 -> 23;
                case 183 -> 82;
                case 184 -> 48;
                case 185 -> 81;
                case 186 -> 22;
                case 187 -> 40;
                case 188 -> 54;
                case 189 -> 212;
                case 190 -> 136;
                case 191 -> 180;
                case 192 -> 12;
                case 193 -> 47;
                case 194 -> 241;
                case 195 -> 244;
                case 196 -> 234;
                case 197 -> 49;
                case 198 -> 41;
                case 199 -> 3;
                case 200 -> 192;
                case 201 -> 116;
                case 202 -> 208;
                case 203 -> 46;
                case 204 -> 83;
                case 205 -> 171;
                case 206 -> 135;
                case 207 -> 161;
                case 208 -> 18;
                case 209 -> 118;
                case 210 -> 150;
                case 211 -> 8;
                case 212 -> 181;
                case 213 -> 68;
                case 214 -> 225;
                case 215 -> 187;
                case 216 -> 245;
                case 217 -> 95;
                case 218 -> 144;
                case 219 -> 80;
                case 220 -> 34;
                case 221 -> 218;
                case 222 -> 62;
                case 223 -> 70;
                case 224 -> 151;
                case 225 -> 206;
                case 226 -> 123;
                case 227 -> 58;
                case 228 -> 131;
                case 229 -> 175;
                case 230 -> 255;
                case 231 -> 7;
                case 232 -> 246;
                case 233 -> 37;
                case 234 -> 50;
                case 235 -> 133;
                case 236 -> 222;
                case 237 -> 219;
                case 238 -> 86;
                case 239 -> 42;
                case 240 -> 139;
                case 241 -> 71;
                case 242 -> 232;
                case 243 -> 75;
                case 244 -> 182;
                case 245 -> 205;
                case 246 -> 14;
                case 247 -> 30;
                case 248 -> 252;
                case 249 -> 85;
                case 250 -> 216;
                case 251 -> 5;
                case 252 -> 164;
                case 253 -> 193;
                case 254 -> 140;
                default -> 88;
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
            Initializer_18.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_18.strArr_1[n3];
    }
}
