// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_437;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_5;
import net.minecraft.class_465;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_15;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub extends AbstractLoadF
{
    private static final int intValue = 10;
    private static final int intValue_1 = 11;
    private static final int intValue_2 = 12;
    private static final int intValue_3 = 13;
    private static final int intValue_4 = 14;
    private static final int intValue_5 = 15;
    private static final int intValue_6 = 16;
    private static final int intValue_7 = 15;
    private final RenderASub_15<Initializer_13> wrapJ;
    private final int intValue_8 = 4;
    private int intValue_9;
    private int intValue_10;
    private int intValue_11;
    private int intValue_12;
    private boolean boolFlag;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub() {
        super(createString(16515, 32009), createString(16513, -15119), Initializer.stepF);
        this.wrapJ = new RenderASub_15<Initializer_13>(createString(16517, -24435), Initializer_13.packL, Initializer_13.class);
        this.intValue_9 = 0;
        this.intValue_10 = 0;
        this.intValue_11 = 0;
        this.intValue_12 = 0;
        this.boolFlag = false;
        this.setRenderaarr(this.wrapJ);
    }
    
    @Override
    public void execute() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        final class_310 class310 = CalcGSub.class310;
        if (stringarrArray != null) {
            if (class310.field_1724 == null) {
                return;
            }
            final class_310 class311 = CalcGSub.class310;
        }
        if (class310.field_1761 != null) {
            CalcGSub calcGSub = this;
            CalcGSub calcGSub2 = this;
            Label_0048: {
                if (stringarrArray != null) {
                    if (this.intValue_10 <= 0) {
                        break Label_0048;
                    }
                    calcGSub = this;
                    calcGSub2 = this;
                }
                calcGSub.intValue_10 = calcGSub2.intValue_10 - 1;
            }
            final class_437 field_1755 = CalcGSub.class310.field_1755;
            int intValue_10;
            boolean enabled;
            final boolean b = enabled = ((intValue_10 = ((field_1755 instanceof class_465) ? 1 : 0)) != 0);
            if (stringarrArray != null) {
                if (b) {
                    final class_465 class_465 = (class_465)field_1755;
                    if (stringarrArray != null) {
                        final int boolFlag = this.boolFlag ? 1 : 0;
                        CalcGSub calcGSub4 = null;
                        Label_0231: {
                            Object value = null;
                            Label_0215: {
                                Label_0194: {
                                    if (stringarrArray != null) {
                                        if (boolFlag == 0) {
                                            final boolean checkClass_465 = this.checkClass_465((class_465<?>)class_465);
                                            if (stringarrArray == null) {
                                                break Label_0194;
                                            }
                                            if (!checkClass_465) {
                                                CalcGSub calcGSub3 = this;
                                                if (stringarrArray != null) {
                                                    if (this.intValue_10 != 0) {
                                                        return;
                                                    }
                                                    Initializer_5.setString_2(createString(16516, -13617));
                                                    calcGSub3 = this;
                                                }
                                                calcGSub3.intValue_10 = 20;
                                                CalcGSub.class310.method_1507((class_437)null);
                                                return;
                                            }
                                        }
                                        ++this.intValue_9;
                                        value = this;
                                        if (stringarrArray == null) {
                                            break Label_0215;
                                        }
                                        final int intValue_11 = this.intValue_9;
                                    }
                                }
                                if (boolFlag < 4) {
                                    return;
                                }
                                this.intValue_9 = 0;
                                calcGSub4 = this;
                                if (stringarrArray == null) {
                                    break Label_0231;
                                }
                                value = this.wrapJ.getValue();
                            }
                            if (value == Initializer_13.packL) {
                                this.setClass_465_1((class_465<?>)class_465);
                                if (stringarrArray != null) {
                                    return;
                                }
                            }
                            calcGSub4 = this;
                        }
                        calcGSub4.setClass_465((class_465<?>)class_465);
                        return;
                    }
                }
                intValue_10 = ((enabled = this.isEnabled()) ? 1 : 0);
            }
            CalcGSub calcGSub5 = null;
            Label_0110: {
                if (stringarrArray != null) {
                    if (!enabled) {
                        return;
                    }
                    calcGSub5 = this;
                    if (stringarrArray == null) {
                        break Label_0110;
                    }
                    intValue_10 = this.intValue_10;
                }
                if (intValue_10 != 0) {
                    return;
                }
                Initializer_5.setString_2(createString(16514, 25754));
                calcGSub5 = this;
            }
            calcGSub5.intValue_10 = 20;
        }
    }
    
    private boolean checkClass_465(final class_465<?> class_465) {
        for (int i = 0; i <= 9; ++i) {
            if (!class_465.method_17577().method_7611(i).method_7677().method_31574(class_1802.field_8871)) {
                return false;
            }
        }
        for (int j = 17; j <= 26; ++j) {
            if (!class_465.method_17577().method_7611(j).method_7677().method_31574(class_1802.field_8871)) {
                return false;
            }
        }
        return true;
    }
    
    private void setClass_465_1(final class_465<?> class_465) {
        final Initializer_13[] array = { Initializer_13.Helmet, Initializer_13.Chestplate, Initializer_13.Leggings, Initializer_13.Boots, Initializer_13.Sword, Initializer_13.Pickaxe, Initializer_13.Shovel };
        if (this.intValue_11 == 0) {
            CalcGSub.class310.field_1761.method_2906(class_465.method_17577().field_7763, this.method_int(array[this.intValue_12]), 0, class_1713.field_7790, (class_1657)CalcGSub.class310.field_1724);
            this.boolFlag = true;
            this.intValue_11 = 1;
        }
        else {
            CalcGSub.class310.field_1761.method_2906(class_465.method_17577().field_7763, this.method_int_1(array[this.intValue_12]), 0, class_1713.field_7790, (class_1657)CalcGSub.class310.field_1724);
            this.intValue_11 = 0;
            ++this.intValue_12;
            if (this.intValue_12 >= array.length) {
                this.intValue_12 = 0;
            }
        }
    }
    
    private void setClass_465(final class_465<?> class_465) {
        if (this.intValue_11 == 0) {
            CalcGSub.class310.field_1761.method_2906(class_465.method_17577().field_7763, this.method_int(this.wrapJ.getValue()), 0, class_1713.field_7790, (class_1657)CalcGSub.class310.field_1724);
            this.boolFlag = true;
            this.intValue_11 = 1;
        }
        else {
            CalcGSub.class310.field_1761.method_2906(class_465.method_17577().field_7763, this.method_int_1(this.wrapJ.getValue()), 0, class_1713.field_7790, (class_1657)CalcGSub.class310.field_1724);
            this.intValue_11 = 0;
        }
    }
    
    private int method_int(final Initializer_13 initializer_13) {
        switch (initializer_13.ordinal()) {
            case 1: {
                return 10;
            }
            case 2: {
                return 11;
            }
            case 3: {
                return 12;
            }
            case 4: {
                return 13;
            }
            case 5: {
                return 14;
            }
            case 6: {
                return 15;
            }
            case 7: {
                return 16;
            }
            default: {
                return 10;
            }
        }
    }
    
    private int method_int_1(final Initializer_13 initializer_13) {
        return 15;
    }
    
    @Override
    public void execute_1() {
        this.intValue_9 = 0;
        this.intValue_10 = 0;
        this.intValue_11 = 0;
        this.intValue_12 = 0;
        this.boolFlag = false;
        Initializer_5.setString(createString(16512, -20860) + this.wrapJ.getValue().toString());
    }
    
    @Override
    public void execute_2() {
        this.intValue_11 = 0;
        this.intValue_12 = 0;
        this.boolFlag = false;
    }
    
    static {
        final String[] strArr2 = new String[6];
        int n = 0;
        String s;
        int n2 = (s = "\u0014\u007f\tuºsª\u00ec\u00ea\u00eci,\u009e4\u009eu¬.\u00df\u00fdp\u00f7\u008e\u00e5T22\u00f5\u00d9\u0088[\u00e1\u00f5L\u007f\u00dd\u008e7°m \u0081\b\\¯\u007f\u000el\u00e3=\u00f4\u001a\u0005¢\u00e3-/\u001c¿r\u000b\u0001¿\u00f46\u0005*1\u001b\u0084\u00dag\\$\u00813\u00fd~\u00cfk~±\u0091\u00f6\u0086p?\u0085'\"»\u0094\u009c\u0082\u00f5©({Z·6\u009c\u008a\u0098\u0011U.½¨²\u00ff%w\u00de\u00e0\r\u000e\u00e3\u0019\n\u000e¨\u001d¡\u009ct\u001eW\\X").length();
        int n3 = 17;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 2));
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
                                    case 0 -> 103;
                                    case 1 -> 68;
                                    case 2 -> 56;
                                    case 3 -> 54;
                                    case 4 -> 82;
                                    case 5 -> 124;
                                    default -> 57;
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
                            n2 = (s = "IS¿73\u00d0«\u008a\u0012\u00d73\u008d\u00ca¬\u0010>8\u0093\u001cPM\\\u00e5J¶\u00e71~\u0000\u001c\u00f5\u00ec\u009b¶~\u009d7\u00da\u0085!E\u00e5\u00da@#\u00e4#PJ_\u009bX\u00d3\u00d8\u0016\u001e'\u0012ªc¬\u0084\u00f4\u0006\u00fe\u00d2\u00e3wI\u008b").length();
                            n3 = 63;
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
                    n5 = (n6 = (n7 = (n8 = 23)));
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
        final int n3 = (n ^ 0x4080) & 0xFFFF;
        if (CalcGSub.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 184;
                case 1 -> 39;
                case 2 -> 158;
                case 3 -> 229;
                case 4 -> 70;
                case 5 -> 227;
                case 6 -> 107;
                case 7 -> 75;
                case 8 -> 38;
                case 9 -> 231;
                case 10 -> 28;
                case 11 -> 207;
                case 12 -> 121;
                case 13 -> 45;
                case 14 -> 92;
                case 15 -> 183;
                case 16 -> 77;
                case 17 -> 25;
                case 18 -> 113;
                case 19 -> 212;
                case 20 -> 236;
                case 21 -> 153;
                case 22 -> 192;
                case 23 -> 88;
                case 24 -> 42;
                case 25 -> 157;
                case 26 -> 53;
                case 27 -> 154;
                case 28 -> 93;
                case 29 -> 102;
                case 30 -> 128;
                case 31 -> 193;
                case 32 -> 123;
                case 33 -> 85;
                case 34 -> 140;
                case 35 -> 216;
                case 36 -> 122;
                case 37 -> 104;
                case 38 -> 37;
                case 39 -> 240;
                case 40 -> 99;
                case 41 -> 161;
                case 42 -> 242;
                case 43 -> 241;
                case 44 -> 152;
                case 45 -> 90;
                case 46 -> 251;
                case 47 -> 220;
                case 48 -> 219;
                case 49 -> 68;
                case 50 -> 9;
                case 51 -> 116;
                case 52 -> 134;
                case 53 -> 65;
                case 54 -> 80;
                case 55 -> 255;
                case 56 -> 228;
                case 57 -> 98;
                case 58 -> 172;
                case 59 -> 40;
                case 60 -> 211;
                case 61 -> 63;
                case 62 -> 13;
                case 63 -> 194;
                case 64 -> 52;
                case 65 -> 103;
                case 66 -> 61;
                case 67 -> 64;
                case 68 -> 147;
                case 69 -> 204;
                case 70 -> 130;
                case 71 -> 170;
                case 72 -> 49;
                case 73 -> 81;
                case 74 -> 199;
                case 75 -> 112;
                case 76 -> 131;
                case 77 -> 15;
                case 78 -> 115;
                case 79 -> 237;
                case 80 -> 96;
                case 81 -> 230;
                case 82 -> 142;
                case 83 -> 23;
                case 84 -> 162;
                case 85 -> 3;
                case 86 -> 5;
                case 87 -> 111;
                case 88 -> 109;
                case 89 -> 168;
                case 90 -> 67;
                case 91 -> 106;
                case 92 -> 124;
                case 93 -> 235;
                case 94 -> 165;
                case 95 -> 105;
                case 96 -> 97;
                case 97 -> 11;
                case 98 -> 173;
                case 99 -> 209;
                case 100 -> 34;
                case 101 -> 249;
                case 102 -> 118;
                case 103 -> 95;
                case 104 -> 254;
                case 105 -> 139;
                case 106 -> 10;
                case 107 -> 225;
                case 108 -> 150;
                case 109 -> 247;
                case 110 -> 248;
                case 111 -> 132;
                case 112 -> 91;
                case 113 -> 84;
                case 114 -> 110;
                case 115 -> 136;
                case 116 -> 196;
                case 117 -> 217;
                case 118 -> 226;
                case 119 -> 145;
                case 120 -> 6;
                case 121 -> 208;
                case 122 -> 60;
                case 123 -> 210;
                case 124 -> 82;
                case 125 -> 36;
                case 126 -> 176;
                case 127 -> 7;
                case 128 -> 197;
                case 129 -> 178;
                case 130 -> 55;
                case 131 -> 137;
                case 132 -> 51;
                case 133 -> 188;
                case 134 -> 14;
                case 135 -> 87;
                case 136 -> 252;
                case 137 -> 149;
                case 138 -> 78;
                case 139 -> 59;
                case 140 -> 48;
                case 141 -> 169;
                case 142 -> 190;
                case 143 -> 159;
                case 144 -> 2;
                case 145 -> 0;
                case 146 -> 175;
                case 147 -> 27;
                case 148 -> 129;
                case 149 -> 74;
                case 150 -> 101;
                case 151 -> 24;
                case 152 -> 126;
                case 153 -> 31;
                case 154 -> 185;
                case 155 -> 222;
                case 156 -> 54;
                case 157 -> 180;
                case 158 -> 167;
                case 159 -> 43;
                case 160 -> 181;
                case 161 -> 16;
                case 162 -> 19;
                case 163 -> 117;
                case 164 -> 195;
                case 165 -> 191;
                case 166 -> 44;
                case 167 -> 189;
                case 168 -> 151;
                case 169 -> 71;
                case 170 -> 163;
                case 171 -> 20;
                case 172 -> 17;
                case 173 -> 198;
                case 174 -> 1;
                case 175 -> 218;
                case 176 -> 203;
                case 177 -> 174;
                case 178 -> 206;
                case 179 -> 73;
                case 180 -> 253;
                case 181 -> 244;
                case 182 -> 187;
                case 183 -> 119;
                case 184 -> 141;
                case 185 -> 58;
                case 186 -> 246;
                case 187 -> 120;
                case 188 -> 155;
                case 189 -> 33;
                case 190 -> 41;
                case 191 -> 146;
                case 192 -> 166;
                case 193 -> 56;
                case 194 -> 12;
                case 195 -> 72;
                case 196 -> 8;
                case 197 -> 4;
                case 198 -> 35;
                case 199 -> 215;
                case 200 -> 29;
                case 201 -> 156;
                case 202 -> 108;
                case 203 -> 89;
                case 204 -> 224;
                case 205 -> 135;
                case 206 -> 18;
                case 207 -> 164;
                case 208 -> 201;
                case 209 -> 148;
                case 210 -> 86;
                case 211 -> 69;
                case 212 -> 138;
                case 213 -> 125;
                case 214 -> 202;
                case 215 -> 30;
                case 216 -> 186;
                case 217 -> 57;
                case 218 -> 144;
                case 219 -> 133;
                case 220 -> 143;
                case 221 -> 234;
                case 222 -> 94;
                case 223 -> 47;
                case 224 -> 50;
                case 225 -> 62;
                case 226 -> 179;
                case 227 -> 238;
                case 228 -> 182;
                case 229 -> 114;
                case 230 -> 233;
                case 231 -> 200;
                case 232 -> 127;
                case 233 -> 221;
                case 234 -> 214;
                case 235 -> 205;
                case 236 -> 243;
                case 237 -> 26;
                case 238 -> 171;
                case 239 -> 250;
                case 240 -> 46;
                case 241 -> 66;
                case 242 -> 76;
                case 243 -> 213;
                case 244 -> 79;
                case 245 -> 32;
                case 246 -> 245;
                case 247 -> 223;
                case 248 -> 83;
                case 249 -> 232;
                case 250 -> 22;
                case 251 -> 21;
                case 252 -> 160;
                case 253 -> 239;
                case 254 -> 100;
                default -> 177;
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
