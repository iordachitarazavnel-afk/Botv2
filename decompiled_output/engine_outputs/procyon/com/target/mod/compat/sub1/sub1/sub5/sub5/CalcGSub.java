// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub5;

import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub extends AbstractLoadF
{
    public final RenderASub_6 eventQ;
    public final RenderASub_1 buffC;
    public final RenderASub_1 buffC_1;
    public final RenderASub_1 buffC_2;
    private static CalcGSub coreB;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub() {
        super(createString(25209, -15332), createString(25215, -20842), Initializer.VISUAL);
        this.eventQ = new RenderASub_6(createString(25213, 5835), createString(25208, -13248));
        final boolean enabled = com.target.mod.compat.sub1.sub1.sub5.sub5.Initializer.isEnabled();
        this.buffC = new RenderASub_1(createString(25211, 7248), true);
        this.buffC_1 = new RenderASub_1(createString(25214, -26148), true);
        this.buffC_2 = new RenderASub_1(createString(25210, 23743), true);
        this.setRenderaarr(this.eventQ, this.buffC, this.buffC_1, this.buffC_2);
        final boolean b = enabled;
        CalcGSub.coreB = this;
        if (!b) {
            int int_1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1();
            com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int_1);
        }
    }
    
    public static CalcGSub getCoreb() {
        return CalcGSub.coreB;
    }
    
    @Override
    public String getString() {
        return this.eventQ.getValue();
    }
    
    @Override
    public boolean isEnabled() {
        return this.isEnabled() && this.buffC.getValue();
    }
    
    public boolean isEnabled_1() {
        return this.isEnabled() && this.buffC_1.getValue();
    }
    
    public boolean isEnabled_2() {
        return this.isEnabled() && this.buffC_2.getValue();
    }
    
    public String computeString(final String s) {
        final boolean enabled_1 = com.target.mod.compat.sub1.sub1.sub5.sub5.Initializer.isEnabled_1();
        if (this.isEnabled() && CalcGSub.class310.field_1724 != null) {
            String string = s;
            if (!enabled_1) {
                if (s == null) {
                    return s;
                }
                string = CalcGSub.class310.field_1724.method_5477().getString();
            }
            final String s3;
            final String s2 = s3 = string;
            if (!enabled_1 && s3 != null) {
                final boolean empty = s2.isEmpty();
                String target = null;
                if (!enabled_1) {
                    if (empty) {
                        goto Label_0064;
                    }
                    final String s4 = s;
                    target = s2;
                    if (enabled_1) {
                        return s4.replace(target, this.getString());
                    }
                    s.contains(target);
                }
                if (!empty) {
                    return s;
                }
                final String s4 = s;
                return s4.replace(target, this.getString());
            }
            return s3;
        }
        return s;
    }
    
    static {
        final String[] strArr2 = new String[7];
        int n = 0;
        String s;
        int n2 = (s = "\u00c5\u00e2u\u00f3mlX\u00ea\u0086\u00f9\u0014%\fhf\u00c0c\u00dby\u0081\u00e2u\u0000\u0088\u0096\tO\u0092\u00eb\u00f4\u00fe¬E\u0093_\u0006Xº\u00d8A8\u009e\u001a!R\u00e9\u00e5\u00ad\u00c7n\u0094\u0083\u008a\u0005\bwp\u00e1\u0083x¬¨\u00cd\u001a\u00d5\u0010®\u009br").length();
        int n3 = 12;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 9));
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
                                    case 0 -> 69;
                                    case 1 -> 15;
                                    case 2 -> 104;
                                    case 3 -> 71;
                                    case 4 -> 46;
                                    case 5 -> 82;
                                    default -> 82;
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
                            n2 = (s = "\u0014:®\t\u00f7\u00d2\u00ea\u00dc&\u00d7\u0017\t\u0016°.Q\t\u00de:\u00f7\u00e3").length();
                            n3 = 11;
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
                    n5 = (n6 = (n7 = (n8 = 101)));
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
        strArr_1 = new String[7];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x627B) & 0xFFFF;
        if (CalcGSub.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 182;
                case 1 -> 47;
                case 2 -> 198;
                case 3 -> 207;
                case 4 -> 94;
                case 5 -> 237;
                case 6 -> 157;
                case 7 -> 222;
                case 8 -> 131;
                case 9 -> 135;
                case 10 -> 147;
                case 11 -> 90;
                case 12 -> 254;
                case 13 -> 172;
                case 14 -> 57;
                case 15 -> 226;
                case 16 -> 140;
                case 17 -> 229;
                case 18 -> 8;
                case 19 -> 39;
                case 20 -> 252;
                case 21 -> 3;
                case 22 -> 68;
                case 23 -> 166;
                case 24 -> 49;
                case 25 -> 126;
                case 26 -> 225;
                case 27 -> 121;
                case 28 -> 100;
                case 29 -> 38;
                case 30 -> 248;
                case 31 -> 117;
                case 32 -> 79;
                case 33 -> 125;
                case 34 -> 45;
                case 35 -> 244;
                case 36 -> 83;
                case 37 -> 15;
                case 38 -> 30;
                case 39 -> 144;
                case 40 -> 223;
                case 41 -> 67;
                case 42 -> 20;
                case 43 -> 9;
                case 44 -> 190;
                case 45 -> 188;
                case 46 -> 216;
                case 47 -> 208;
                case 48 -> 109;
                case 49 -> 206;
                case 50 -> 40;
                case 51 -> 155;
                case 52 -> 96;
                case 53 -> 60;
                case 54 -> 91;
                case 55 -> 76;
                case 56 -> 232;
                case 57 -> 201;
                case 58 -> 177;
                case 59 -> 23;
                case 60 -> 179;
                case 61 -> 168;
                case 62 -> 218;
                case 63 -> 158;
                case 64 -> 202;
                case 65 -> 170;
                case 66 -> 191;
                case 67 -> 150;
                case 68 -> 193;
                case 69 -> 163;
                case 70 -> 215;
                case 71 -> 34;
                case 72 -> 137;
                case 73 -> 181;
                case 74 -> 171;
                case 75 -> 220;
                case 76 -> 31;
                case 77 -> 123;
                case 78 -> 211;
                case 79 -> 28;
                case 80 -> 66;
                case 81 -> 6;
                case 82 -> 230;
                case 83 -> 12;
                case 84 -> 189;
                case 85 -> 162;
                case 86 -> 133;
                case 87 -> 241;
                case 88 -> 240;
                case 89 -> 255;
                case 90 -> 185;
                case 91 -> 36;
                case 92 -> 65;
                case 93 -> 43;
                case 94 -> 84;
                case 95 -> 124;
                case 96 -> 120;
                case 97 -> 227;
                case 98 -> 192;
                case 99 -> 33;
                case 100 -> 152;
                case 101 -> 119;
                case 102 -> 59;
                case 103 -> 52;
                case 104 -> 204;
                case 105 -> 87;
                case 106 -> 128;
                case 107 -> 115;
                case 108 -> 19;
                case 109 -> 113;
                case 110 -> 104;
                case 111 -> 154;
                case 112 -> 129;
                case 113 -> 236;
                case 114 -> 203;
                case 115 -> 180;
                case 116 -> 75;
                case 117 -> 88;
                case 118 -> 58;
                case 119 -> 61;
                case 120 -> 32;
                case 121 -> 139;
                case 122 -> 161;
                case 123 -> 41;
                case 124 -> 51;
                case 125 -> 5;
                case 126 -> 246;
                case 127 -> 245;
                case 128 -> 70;
                case 129 -> 213;
                case 130 -> 243;
                case 131 -> 127;
                case 132 -> 72;
                case 133 -> 0;
                case 134 -> 74;
                case 135 -> 99;
                case 136 -> 102;
                case 137 -> 143;
                case 138 -> 167;
                case 139 -> 44;
                case 140 -> 217;
                case 141 -> 11;
                case 142 -> 80;
                case 143 -> 92;
                case 144 -> 251;
                case 145 -> 64;
                case 146 -> 101;
                case 147 -> 111;
                case 148 -> 93;
                case 149 -> 103;
                case 150 -> 253;
                case 151 -> 212;
                case 152 -> 165;
                case 153 -> 194;
                case 154 -> 205;
                case 155 -> 174;
                case 156 -> 176;
                case 157 -> 82;
                case 158 -> 98;
                case 159 -> 110;
                case 160 -> 78;
                case 161 -> 195;
                case 162 -> 178;
                case 163 -> 175;
                case 164 -> 249;
                case 165 -> 77;
                case 166 -> 1;
                case 167 -> 187;
                case 168 -> 42;
                case 169 -> 63;
                case 170 -> 228;
                case 171 -> 134;
                case 172 -> 106;
                case 173 -> 50;
                case 174 -> 151;
                case 175 -> 146;
                case 176 -> 55;
                case 177 -> 214;
                case 178 -> 242;
                case 179 -> 239;
                case 180 -> 164;
                case 181 -> 13;
                case 182 -> 7;
                case 183 -> 197;
                case 184 -> 29;
                case 185 -> 183;
                case 186 -> 149;
                case 187 -> 221;
                case 188 -> 235;
                case 189 -> 200;
                case 190 -> 112;
                case 191 -> 234;
                case 192 -> 142;
                case 193 -> 71;
                case 194 -> 107;
                case 195 -> 69;
                case 196 -> 114;
                case 197 -> 105;
                case 198 -> 156;
                case 199 -> 148;
                case 200 -> 16;
                case 201 -> 247;
                case 202 -> 17;
                case 203 -> 21;
                case 204 -> 37;
                case 205 -> 62;
                case 206 -> 118;
                case 207 -> 231;
                case 208 -> 22;
                case 209 -> 138;
                case 210 -> 48;
                case 211 -> 219;
                case 212 -> 186;
                case 213 -> 250;
                case 214 -> 159;
                case 215 -> 95;
                case 216 -> 14;
                case 217 -> 81;
                case 218 -> 10;
                case 219 -> 141;
                case 220 -> 233;
                case 221 -> 54;
                case 222 -> 18;
                case 223 -> 25;
                case 224 -> 210;
                case 225 -> 108;
                case 226 -> 35;
                case 227 -> 224;
                case 228 -> 145;
                case 229 -> 184;
                case 230 -> 153;
                case 231 -> 122;
                case 232 -> 130;
                case 233 -> 89;
                case 234 -> 26;
                case 235 -> 24;
                case 236 -> 27;
                case 237 -> 56;
                case 238 -> 160;
                case 239 -> 97;
                case 240 -> 199;
                case 241 -> 209;
                case 242 -> 46;
                case 243 -> 53;
                case 244 -> 116;
                case 245 -> 169;
                case 246 -> 4;
                case 247 -> 173;
                case 248 -> 73;
                case 249 -> 196;
                case 250 -> 86;
                case 251 -> 85;
                case 252 -> 238;
                case 253 -> 136;
                case 254 -> 132;
                default -> 2;
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
