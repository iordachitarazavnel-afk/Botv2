// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_1802;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_1309;
import net.minecraft.class_1890;
import net.minecraft.class_6880;
import net.minecraft.class_1893;
import net.minecraft.class_7924;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_5;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub_10 extends AbstractLoadF
{
    private boolean boolFlag;
    private boolean boolFlag_1;
    private int intValue;
    private int intValue_1;
    private long longValue;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_10() {
        super(createString(25921, 16221), createString(25926, 21213), Initializer.stepF);
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.intValue = -1;
        this.intValue_1 = 0;
    }
    
    @Override
    public void execute() {
        super.execute();
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.intValue = -1;
        this.intValue_1 = 0;
        if (CalcGSub_10.class310.field_1724 != null && !this.isEnabled()) {
            Initializer_5.setString_2(createString(25925, 18252));
            this.execute_2();
            return;
        }
        this.longValue = System.nanoTime();
    }
    
    @Override
    public void execute_1() {
        super.execute_1();
        if (CalcGSub_10.class310.field_1690.field_1904.method_1434()) {
            CalcGSub_10.class310.field_1690.field_1904.method_23481(false);
        }
        if (this.intValue != -1 && CalcGSub_10.class310.field_1724 != null) {
            CalcGSub_10.class310.field_1724.method_31548().field_7545 = this.intValue;
            Initializer_8.execute();
            this.intValue = -1;
        }
    }
    
    @Override
    public void execute_2() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        if (CalcGSub_10.class310.field_1724 == null) {
            return;
        }
        final long nanoTime = System.nanoTime();
        final float n = (nanoTime - this.longValue) / 1.0E9f;
        this.longValue = nanoTime;
        final class_310 class310 = CalcGSub_10.class310;
        if (stringarrArray != null) {
            if (class310.field_1687.method_8430(n) == 0.0f) {
                Initializer_5.setString_2(createString(25924, 4639));
                this.execute_2();
                return;
            }
            final class_310 class311 = CalcGSub_10.class310;
        }
        final class_1799 method_6047 = class310.field_1724.method_6047();
        final boolean enabled = this.isEnabled();
        Object orElseThrow = null;
        Label_0218: {
            if (stringarrArray != null) {
                if (!enabled) {
                    Initializer_5.setString_2(createString(25920, -10618));
                    this.execute_2();
                    return;
                }
                final class_1799 class_1799 = (class_1799)(orElseThrow = method_6047);
                if (stringarrArray == null) {
                    break Label_0218;
                }
                class_1799.method_7963();
            }
            if (enabled) {
                final int method_6048 = method_6047.method_7936();
                final class_1799 class_1800 = (class_1799)(orElseThrow = method_6047);
                if (stringarrArray == null) {
                    break Label_0218;
                }
                if ((method_6048 - class_1800.method_7919()) / (double)method_6048 * 100.0 <= 20.0) {
                    Initializer_5.setString_2(createString(25927, 18746));
                    this.execute_2();
                    return;
                }
            }
            orElseThrow = CalcGSub_10.class310.method_1562().method_29091().method_30530(class_7924.field_41265).method_10223(class_1893.field_9104.method_29177()).orElseThrow();
        }
        final int method_6049 = class_1890.method_8225((class_6880)orElseThrow, method_6047);
        if (stringarrArray != null) {
            if (method_6049 == 0) {
                Initializer_5.setString_2(createString(25920, -10618));
                this.execute_2();
                return;
            }
            method_6047.method_7935((class_1309)CalcGSub_10.class310.field_1724);
        }
        final int n2 = method_6049 - CalcGSub_10.class310.field_1724.method_6014();
        final boolean boolFlag_1 = this.boolFlag_1;
        CalcGSub_10 calcGSub_11 = null;
        Label_0453: {
            if (stringarrArray != null) {
                if (boolFlag_1) {
                    ++this.intValue_1;
                    CalcGSub_10 calcGSub_10 = this;
                    if (stringarrArray != null) {
                        if (this.intValue_1 < 1) {
                            return;
                        }
                        this.boolFlag_1 = false;
                        calcGSub_10 = this;
                    }
                    calcGSub_10.boolFlag = true;
                    CalcGSub_10.class310.field_1690.field_1904.method_23481(true);
                    if (stringarrArray != null) {
                        return;
                    }
                }
                calcGSub_11 = this;
                if (stringarrArray == null) {
                    break Label_0453;
                }
                final boolean boolFlag = this.boolFlag;
            }
            if (boolFlag_1) {
                final boolean method_6050;
                final boolean b = method_6050 = CalcGSub_10.class310.field_1724.method_6115();
                class_310 class312 = null;
                Label_0438: {
                    int n3 = 0;
                    Label_0432: {
                        if (stringarrArray != null) {
                            if (b) {
                                n3 = n2;
                                if (stringarrArray == null) {
                                    break Label_0432;
                                }
                                if (n3 >= 10) {
                                    CalcGSub_10.class310.field_1690.field_1904.method_23481(false);
                                    this.boolFlag = false;
                                    this.boolFlag_1 = true;
                                    this.intValue_1 = 0;
                                    if (stringarrArray != null) {
                                        return;
                                    }
                                }
                            }
                            class312 = CalcGSub_10.class310;
                            if (stringarrArray == null) {
                                break Label_0438;
                            }
                            class312.field_1724.method_6115();
                        }
                    }
                    if (n3 != 0) {
                        return;
                    }
                    final class_310 class313 = CalcGSub_10.class310;
                }
                class312.field_1690.field_1904.method_23481(true);
                if (stringarrArray != null) {
                    return;
                }
            }
            calcGSub_11 = this;
        }
        calcGSub_11.boolFlag = true;
        CalcGSub_10.class310.field_1690.field_1904.method_23481(true);
    }
    
    private boolean isEnabled() {
        if (CalcGSub_10.class310.field_1724 == null) {
            return false;
        }
        if (this.intValue == -1) {
            this.intValue = CalcGSub_10.class310.field_1724.method_31548().field_7545;
        }
        for (int i = 0; i < 9; ++i) {
            final class_1799 method_5438 = CalcGSub_10.class310.field_1724.method_31548().method_5438(i);
            if (method_5438.method_31574(class_1802.field_8547) && class_1890.method_8225((class_6880)CalcGSub_10.class310.method_1562().method_29091().method_30530(class_7924.field_41265).method_10223(class_1893.field_9104.method_29177()).orElseThrow(), method_5438) > 0) {
                CalcGSub_10.class310.field_1724.method_31548().field_7545 = i;
                Initializer_8.execute();
                return true;
            }
        }
        return false;
    }
    
    static {
        final String[] strArr2 = new String[6];
        int n = 0;
        String s;
        int n2 = (s = "\u007fOSq¸\u009cnN°\u00f3¶\\~Q]\u00e86\u00c8\u00da{Yz$\u00ebocYA*\u0080O\u0098\u00ed±\u0098#\u0089\u008bj\u008d\u0093\u0089\u0096A\u00f9Z\u001c\u000e\u009d\u00c9wa°\u0011ª\u00f1\u00d1\u00d7Z\u001eh\u0086\u0004\u00ce\u00f4\u00078\u00c4\u000bpM\u001b²\u008f\u00fa\u00c1\u00e1@\u00c8Adb~io@e\u00c6\"\u008d\u0001m\"\u00f2\u0005«\u0083|-0·}v\u0001\u00cdri9 ¤]@\u0094\u00dc\u000e\u00cf\u0082°IU\u00e3\u00dc\u00d7w]\u0007\u00ec\u00e8>B\u00ea\u0089\u00e3\u0080\u00dc\u0095=\u00d8\u00ec\u00ec\u00e0/\u009bnx²*\u0089").length();
        int n3 = 35;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 29));
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
                                    case 0 -> 60;
                                    case 1 -> 54;
                                    case 2 -> 34;
                                    case 3 -> 16;
                                    case 4 -> 101;
                                    case 5 -> 66;
                                    default -> 91;
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
                            n2 = (s = "Z[n?1\u0095{SH\u00cc{'\u00e8§¼#\u00f7\f\u00de\u0085\u0095\u009eW\u0092\u000b\u00f4] \u009fB\u00fd\u0016¾\u008bW\u008ftx\u001d7\u00d4d²=\u00cb\u0093\u00effe\u00f2\u0015").length();
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
                            break Label_0023;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 75)));
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
        final int n3 = (n ^ 0x6545) & 0xFFFF;
        if (CalcGSub_10.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_10.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 186;
                case 1 -> 8;
                case 2 -> 121;
                case 3 -> 153;
                case 4 -> 230;
                case 5 -> 154;
                case 6 -> 2;
                case 7 -> 208;
                case 8 -> 36;
                case 9 -> 67;
                case 10 -> 95;
                case 11 -> 202;
                case 12 -> 65;
                case 13 -> 176;
                case 14 -> 90;
                case 15 -> 225;
                case 16 -> 71;
                case 17 -> 70;
                case 18 -> 124;
                case 19 -> 85;
                case 20 -> 255;
                case 21 -> 10;
                case 22 -> 168;
                case 23 -> 66;
                case 24 -> 98;
                case 25 -> 50;
                case 26 -> 236;
                case 27 -> 145;
                case 28 -> 69;
                case 29 -> 109;
                case 30 -> 19;
                case 31 -> 126;
                case 32 -> 89;
                case 33 -> 178;
                case 34 -> 68;
                case 35 -> 250;
                case 36 -> 63;
                case 37 -> 239;
                case 38 -> 16;
                case 39 -> 54;
                case 40 -> 31;
                case 41 -> 35;
                case 42 -> 84;
                case 43 -> 163;
                case 44 -> 23;
                case 45 -> 252;
                case 46 -> 193;
                case 47 -> 42;
                case 48 -> 83;
                case 49 -> 47;
                case 50 -> 229;
                case 51 -> 131;
                case 52 -> 15;
                case 53 -> 117;
                case 54 -> 246;
                case 55 -> 216;
                case 56 -> 243;
                case 57 -> 170;
                case 58 -> 214;
                case 59 -> 161;
                case 60 -> 156;
                case 61 -> 87;
                case 62 -> 188;
                case 63 -> 245;
                case 64 -> 119;
                case 65 -> 59;
                case 66 -> 81;
                case 67 -> 150;
                case 68 -> 165;
                case 69 -> 141;
                case 70 -> 207;
                case 71 -> 77;
                case 72 -> 101;
                case 73 -> 233;
                case 74 -> 61;
                case 75 -> 94;
                case 76 -> 166;
                case 77 -> 192;
                case 78 -> 219;
                case 79 -> 147;
                case 80 -> 217;
                case 81 -> 189;
                case 82 -> 182;
                case 83 -> 114;
                case 84 -> 177;
                case 85 -> 11;
                case 86 -> 210;
                case 87 -> 240;
                case 88 -> 211;
                case 89 -> 138;
                case 90 -> 139;
                case 91 -> 37;
                case 92 -> 173;
                case 93 -> 86;
                case 94 -> 60;
                case 95 -> 4;
                case 96 -> 118;
                case 97 -> 249;
                case 98 -> 9;
                case 99 -> 49;
                case 100 -> 14;
                case 101 -> 52;
                case 102 -> 169;
                case 103 -> 226;
                case 104 -> 3;
                case 105 -> 241;
                case 106 -> 213;
                case 107 -> 39;
                case 108 -> 48;
                case 109 -> 99;
                case 110 -> 254;
                case 111 -> 96;
                case 112 -> 164;
                case 113 -> 74;
                case 114 -> 183;
                case 115 -> 28;
                case 116 -> 40;
                case 117 -> 152;
                case 118 -> 137;
                case 119 -> 175;
                case 120 -> 218;
                case 121 -> 157;
                case 122 -> 88;
                case 123 -> 80;
                case 124 -> 33;
                case 125 -> 237;
                case 126 -> 7;
                case 127 -> 197;
                case 128 -> 184;
                case 129 -> 111;
                case 130 -> 129;
                case 131 -> 179;
                case 132 -> 190;
                case 133 -> 158;
                case 134 -> 253;
                case 135 -> 127;
                case 136 -> 231;
                case 137 -> 244;
                case 138 -> 200;
                case 139 -> 180;
                case 140 -> 18;
                case 141 -> 232;
                case 142 -> 93;
                case 143 -> 78;
                case 144 -> 215;
                case 145 -> 24;
                case 146 -> 64;
                case 147 -> 115;
                case 148 -> 56;
                case 149 -> 104;
                case 150 -> 26;
                case 151 -> 148;
                case 152 -> 57;
                case 153 -> 116;
                case 154 -> 43;
                case 155 -> 185;
                case 156 -> 0;
                case 157 -> 223;
                case 158 -> 46;
                case 159 -> 20;
                case 160 -> 136;
                case 161 -> 203;
                case 162 -> 73;
                case 163 -> 97;
                case 164 -> 167;
                case 165 -> 199;
                case 166 -> 155;
                case 167 -> 32;
                case 168 -> 62;
                case 169 -> 1;
                case 170 -> 17;
                case 171 -> 149;
                case 172 -> 204;
                case 173 -> 106;
                case 174 -> 181;
                case 175 -> 187;
                case 176 -> 209;
                case 177 -> 34;
                case 178 -> 120;
                case 179 -> 251;
                case 180 -> 198;
                case 181 -> 194;
                case 182 -> 248;
                case 183 -> 21;
                case 184 -> 107;
                case 185 -> 12;
                case 186 -> 174;
                case 187 -> 130;
                case 188 -> 22;
                case 189 -> 235;
                case 190 -> 82;
                case 191 -> 172;
                case 192 -> 110;
                case 193 -> 122;
                case 194 -> 53;
                case 195 -> 135;
                case 196 -> 27;
                case 197 -> 222;
                case 198 -> 205;
                case 199 -> 103;
                case 200 -> 221;
                case 201 -> 242;
                case 202 -> 206;
                case 203 -> 30;
                case 204 -> 125;
                case 205 -> 92;
                case 206 -> 201;
                case 207 -> 191;
                case 208 -> 196;
                case 209 -> 29;
                case 210 -> 76;
                case 211 -> 238;
                case 212 -> 51;
                case 213 -> 55;
                case 214 -> 102;
                case 215 -> 13;
                case 216 -> 151;
                case 217 -> 72;
                case 218 -> 105;
                case 219 -> 143;
                case 220 -> 108;
                case 221 -> 123;
                case 222 -> 220;
                case 223 -> 171;
                case 224 -> 132;
                case 225 -> 45;
                case 226 -> 160;
                case 227 -> 227;
                case 228 -> 5;
                case 229 -> 25;
                case 230 -> 146;
                case 231 -> 113;
                case 232 -> 195;
                case 233 -> 44;
                case 234 -> 38;
                case 235 -> 144;
                case 236 -> 234;
                case 237 -> 100;
                case 238 -> 134;
                case 239 -> 58;
                case 240 -> 228;
                case 241 -> 159;
                case 242 -> 224;
                case 243 -> 91;
                case 244 -> 247;
                case 245 -> 75;
                case 246 -> 41;
                case 247 -> 79;
                case 248 -> 6;
                case 249 -> 112;
                case 250 -> 162;
                case 251 -> 133;
                case 252 -> 142;
                case 253 -> 140;
                case 254 -> 212;
                default -> 128;
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
            CalcGSub_10.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_10.strArr_1[n3];
    }
}
