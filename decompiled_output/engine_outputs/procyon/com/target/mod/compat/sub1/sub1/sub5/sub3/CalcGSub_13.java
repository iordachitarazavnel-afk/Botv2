// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2350;
import net.minecraft.class_2338;
import net.minecraft.class_2846$class_2847;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1802;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_15;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub_13 extends AbstractLoadF
{
    private final RenderASub_15<Initializer_14> wrapJ;
    private final RenderASub_1 buffC;
    private final int intValue = 1;
    private int intValue_1;
    private boolean boolFlag;
    private boolean boolFlag_1;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_13() {
        super(createString(13395, -26887), createString(13394, -15164), Initializer.stepF);
        this.wrapJ = new RenderASub_15<Initializer_14>(createString(13396, -14799), Initializer_14.Obsidian, Initializer_14.class);
        this.buffC = new RenderASub_1(createString(13393, -9909), true);
        this.intValue_1 = 0;
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.setRenderaarr(this.wrapJ, this.buffC);
    }
    
    @Override
    public void execute() {
        this.intValue_1 = 0;
        this.boolFlag = false;
        this.boolFlag_1 = false;
    }
    
    @Override
    public void execute_1() {
        this.intValue_1 = 0;
        this.boolFlag = false;
        this.boolFlag_1 = false;
    }
    
    @Override
    public void execute_2() {
        if (CalcGSub_13.class310.field_1724 == null) {
            return;
        }
        if (this.intValue_1 > 0) {
            --this.intValue_1;
            return;
        }
        final class_1703 field_7512 = CalcGSub_13.class310.field_1724.field_7512;
        if (field_7512 instanceof final class_1707 class_1707) {
            final int method_17388 = class_1707.method_17388();
            this.setClass_1703AndInt(field_7512, method_17388);
            if (method_17388 == 3) {
                if (this.checkClass_1703(field_7512)) {
                    this.setClass_1703_2(field_7512);
                    return;
                }
                if (this.checkClass_1703_2(field_7512)) {
                    this.setClass_1703_1(field_7512);
                    return;
                }
                if (this.checkClass_1703_1(field_7512)) {
                    this.setClass_1703(field_7512);
                    return;
                }
            }
            this.execute_3();
            return;
        }
        CalcGSub_13.class310.field_1724.field_3944.method_45730(createString(13392, -3333));
        this.intValue_1 = 1;
        this.execute_3();
    }
    
    private void setClass_1703AndInt(final class_1703 class_1703, final int n) {
        if (this.checkClass_1703(class_1703)) {
            this.boolFlag_1 = true;
        }
        else if (this.checkClass_1703_2(class_1703)) {
            this.boolFlag = true;
            this.boolFlag_1 = false;
        }
        else if (this.checkClass_1703_1(class_1703)) {
            this.boolFlag = false;
            this.boolFlag_1 = false;
        }
    }
    
    private boolean checkClass_1703_1(final class_1703 class_1703) {
        return class_1703.method_7611(13).method_7677().method_31574(class_1802.field_8288) && !this.checkClass_1703(class_1703);
    }
    
    private boolean checkClass_1703_2(final class_1703 class_1703) {
        return class_1703.method_7611(9).method_7677().method_31574(class_1802.field_8281) || class_1703.method_7611(10).method_7677().method_31574(class_1802.field_8301) || class_1703.method_7611(11).method_7677().method_31574(class_1802.field_23141) || class_1703.method_7611(12).method_7677().method_31574(class_1802.field_8801);
    }
    
    private boolean checkClass_1703(final class_1703 class_1703) {
        for (int i = 0; i < class_1703.field_7761.size(); ++i) {
            if (class_1703.method_7611(i).method_7677().method_31574(class_1802.field_8581)) {
                return true;
            }
        }
        return false;
    }
    
    private void setClass_1703(final class_1703 class_1703) {
        CalcGSub_13.class310.field_1761.method_2906(class_1703.field_7763, 13, 0, class_1713.field_7790, (class_1657)CalcGSub_13.class310.field_1724);
        this.intValue_1 = 1;
        this.boolFlag = true;
    }
    
    private void setClass_1703_1(final class_1703 class_1703) {
        final Initializer_14 initializer_14 = this.wrapJ.getValue();
        final int method_int = this.method_int(initializer_14);
        if (method_int != -1 && this.checkCondition(class_1703, method_int, initializer_14)) {
            this.setClass_1703AndInt_1(class_1703, method_int);
        }
    }
    
    private int method_int(final Initializer_14 initializer_14) {
        switch (initializer_14.ordinal()) {
            case 0: {
                return 9;
            }
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
            case 8: {
                return 17;
            }
            default: {
                return -1;
            }
        }
    }
    
    private boolean checkCondition(final class_1703 class_1703, final int n, final Initializer_14 initializer_14) {
        switch (initializer_14.ordinal()) {
            case 0: {
                return class_1703.method_7611(n).method_7677().method_31574(class_1802.field_8281);
            }
            case 1: {
                return class_1703.method_7611(n).method_7677().method_31574(class_1802.field_8301);
            }
            case 2: {
                return class_1703.method_7611(n).method_7677().method_31574(class_1802.field_23141);
            }
            case 3: {
                return class_1703.method_7611(n).method_7677().method_31574(class_1802.field_8801);
            }
            case 4: {
                return class_1703.method_7611(n).method_7677().method_31574(class_1802.field_8288);
            }
            case 5: {
                return class_1703.method_7611(n).method_7677().method_31574(class_1802.field_8634);
            }
            case 6: {
                return class_1703.method_7611(n).method_7677().method_31574(class_1802.field_8463);
            }
            case 7: {
                return class_1703.method_7611(n).method_7677().method_31574(class_1802.field_8287);
            }
            case 8: {
                return class_1703.method_7611(n).method_7677().method_31574(class_1802.field_8087);
            }
            default: {
                return false;
            }
        }
    }
    
    private void setClass_1703_2(final class_1703 class_1703) {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        int i = 0;
        final String[] array = stringarrArray;
        while (true) {
            while (i < class_1703.field_7761.size()) {
                final int method_7948;
                int method_7947;
                final int n = method_7947 = (method_7948 = (class_1703.method_7611(i).method_7677().method_31574(class_1802.field_8581) ? 1 : 0));
                if (array == null) {
                    int j = method_7948;
                    while (j < class_1703.field_7761.size()) {
                        final boolean method_7949 = class_1703.method_7611(j).method_7677().method_31574(class_1802.field_8581);
                        CalcGSub_13 calcGSub_13 = null;
                        Label_0207: {
                            if (array != null) {
                                if (method_7949) {
                                    CalcGSub_13.class310.field_1761.method_2906(class_1703.field_7763, j, 0, class_1713.field_7790, (class_1657)CalcGSub_13.class310.field_1724);
                                    this.intValue_1 = 1;
                                    calcGSub_13 = this;
                                    if (array == null) {
                                        break Label_0207;
                                    }
                                    this.buffC.getValue().booleanValue();
                                }
                                else {
                                    ++j;
                                    if (array == null) {
                                        break;
                                    }
                                    continue;
                                }
                            }
                            if (method_7949) {
                                CalcGSub_13.class310.field_1724.field_3944.method_52787((class_2596)new class_2846(class_2846$class_2847.field_12970, class_2338.field_10980, class_2350.field_11033));
                            }
                            calcGSub_13 = this;
                        }
                        calcGSub_13.execute_3();
                    }
                    return;
                }
                Label_0088: {
                    if (array != null) {
                        if (n == 0) {
                            break Label_0088;
                        }
                        method_7947 = class_1703.method_7611(i).method_7677().method_7947();
                    }
                    if (method_7947 == 64) {
                        CalcGSub_13.class310.field_1761.method_2906(class_1703.field_7763, i, 0, class_1713.field_7790, (class_1657)CalcGSub_13.class310.field_1724);
                        this.intValue_1 = 1;
                        return;
                    }
                }
                ++i;
                if (array == null) {
                    break;
                }
            }
            int method_7948 = 0;
            continue;
        }
    }
    
    private void setClass_1703AndInt_1(final class_1703 class_1703, final int n) {
        CalcGSub_13.class310.field_1761.method_2906(class_1703.field_7763, n, 0, class_1713.field_7790, (class_1657)CalcGSub_13.class310.field_1724);
        this.intValue_1 = 1;
        this.boolFlag_1 = true;
    }
    
    private void execute_3() {
        this.boolFlag = false;
        this.boolFlag_1 = false;
    }
    
    static {
        final String[] strArr2 = new String[5];
        int n = 0;
        String s;
        int n2 = (s = "X.\u00e19\t\u00fe\u0016Z\u009f\u0003$\u00d3G\u00ff8\u0019O¦´\u00d1dk\u00c8=¤-',\u00c0\u00d1\u0080\u00f5QZU\u00ef»\u0098mGUg¦\rM\u0018\u00d7+\u000b\u00fbWs#%f\u00c7#$\u0084P\u000b\u008d\u00d2I\u007f\u009b_\u0007\u00df\b\u00e5").length();
        int n3 = 4;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 4));
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
                        Label_0259: {
                            if (length > 1) {
                                break Label_0259;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 99;
                                    case 1 -> 1;
                                    case 2 -> 112;
                                    case 3 -> 77;
                                    case 4 -> 24;
                                    case 5 -> 60;
                                    default -> 98;
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
                            n2 = (s = "N´\u00ce£B§\u0017\u00e3\u00c6\u0004\b\u00ccU.").length();
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
                            break Label_0022;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 97)));
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
        strArr_1 = new String[5];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x3450) & 0xFFFF;
        if (CalcGSub_13.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_13.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 29;
                case 1 -> 130;
                case 2 -> 185;
                case 3 -> 0;
                case 4 -> 253;
                case 5 -> 119;
                case 6 -> 184;
                case 7 -> 70;
                case 8 -> 89;
                case 9 -> 85;
                case 10 -> 238;
                case 11 -> 82;
                case 12 -> 255;
                case 13 -> 194;
                case 14 -> 177;
                case 15 -> 74;
                case 16 -> 122;
                case 17 -> 201;
                case 18 -> 137;
                case 19 -> 214;
                case 20 -> 63;
                case 21 -> 128;
                case 22 -> 162;
                case 23 -> 246;
                case 24 -> 113;
                case 25 -> 38;
                case 26 -> 104;
                case 27 -> 223;
                case 28 -> 12;
                case 29 -> 83;
                case 30 -> 43;
                case 31 -> 102;
                case 32 -> 210;
                case 33 -> 90;
                case 34 -> 226;
                case 35 -> 227;
                case 36 -> 170;
                case 37 -> 169;
                case 38 -> 125;
                case 39 -> 189;
                case 40 -> 151;
                case 41 -> 247;
                case 42 -> 106;
                case 43 -> 196;
                case 44 -> 204;
                case 45 -> 135;
                case 46 -> 79;
                case 47 -> 69;
                case 48 -> 36;
                case 49 -> 100;
                case 50 -> 32;
                case 51 -> 45;
                case 52 -> 161;
                case 53 -> 80;
                case 54 -> 28;
                case 55 -> 13;
                case 56 -> 244;
                case 57 -> 95;
                case 58 -> 44;
                case 59 -> 53;
                case 60 -> 197;
                case 61 -> 154;
                case 62 -> 221;
                case 63 -> 175;
                case 64 -> 124;
                case 65 -> 54;
                case 66 -> 39;
                case 67 -> 88;
                case 68 -> 167;
                case 69 -> 123;
                case 70 -> 228;
                case 71 -> 224;
                case 72 -> 215;
                case 73 -> 101;
                case 74 -> 252;
                case 75 -> 10;
                case 76 -> 218;
                case 77 -> 126;
                case 78 -> 195;
                case 79 -> 93;
                case 80 -> 242;
                case 81 -> 114;
                case 82 -> 240;
                case 83 -> 9;
                case 84 -> 139;
                case 85 -> 6;
                case 86 -> 27;
                case 87 -> 4;
                case 88 -> 21;
                case 89 -> 19;
                case 90 -> 37;
                case 91 -> 116;
                case 92 -> 220;
                case 93 -> 156;
                case 94 -> 107;
                case 95 -> 225;
                case 96 -> 3;
                case 97 -> 5;
                case 98 -> 108;
                case 99 -> 248;
                case 100 -> 233;
                case 101 -> 251;
                case 102 -> 51;
                case 103 -> 33;
                case 104 -> 8;
                case 105 -> 87;
                case 106 -> 56;
                case 107 -> 14;
                case 108 -> 145;
                case 109 -> 219;
                case 110 -> 17;
                case 111 -> 109;
                case 112 -> 229;
                case 113 -> 193;
                case 114 -> 217;
                case 115 -> 91;
                case 116 -> 222;
                case 117 -> 199;
                case 118 -> 68;
                case 119 -> 41;
                case 120 -> 183;
                case 121 -> 148;
                case 122 -> 26;
                case 123 -> 241;
                case 124 -> 42;
                case 125 -> 25;
                case 126 -> 133;
                case 127 -> 138;
                case 128 -> 96;
                case 129 -> 46;
                case 130 -> 77;
                case 131 -> 48;
                case 132 -> 35;
                case 133 -> 117;
                case 134 -> 24;
                case 135 -> 165;
                case 136 -> 172;
                case 137 -> 143;
                case 138 -> 198;
                case 139 -> 203;
                case 140 -> 187;
                case 141 -> 159;
                case 142 -> 49;
                case 143 -> 65;
                case 144 -> 232;
                case 145 -> 173;
                case 146 -> 71;
                case 147 -> 78;
                case 148 -> 75;
                case 149 -> 34;
                case 150 -> 16;
                case 151 -> 164;
                case 152 -> 209;
                case 153 -> 115;
                case 154 -> 147;
                case 155 -> 249;
                case 156 -> 81;
                case 157 -> 230;
                case 158 -> 50;
                case 159 -> 140;
                case 160 -> 182;
                case 161 -> 243;
                case 162 -> 1;
                case 163 -> 236;
                case 164 -> 200;
                case 165 -> 103;
                case 166 -> 153;
                case 167 -> 72;
                case 168 -> 166;
                case 169 -> 239;
                case 170 -> 98;
                case 171 -> 118;
                case 172 -> 2;
                case 173 -> 136;
                case 174 -> 15;
                case 175 -> 188;
                case 176 -> 66;
                case 177 -> 31;
                case 178 -> 22;
                case 179 -> 146;
                case 180 -> 191;
                case 181 -> 235;
                case 182 -> 40;
                case 183 -> 67;
                case 184 -> 7;
                case 185 -> 110;
                case 186 -> 111;
                case 187 -> 132;
                case 188 -> 158;
                case 189 -> 176;
                case 190 -> 92;
                case 191 -> 121;
                case 192 -> 99;
                case 193 -> 76;
                case 194 -> 192;
                case 195 -> 216;
                case 196 -> 178;
                case 197 -> 163;
                case 198 -> 94;
                case 199 -> 47;
                case 200 -> 11;
                case 201 -> 234;
                case 202 -> 30;
                case 203 -> 160;
                case 204 -> 59;
                case 205 -> 155;
                case 206 -> 180;
                case 207 -> 157;
                case 208 -> 231;
                case 209 -> 86;
                case 210 -> 245;
                case 211 -> 127;
                case 212 -> 144;
                case 213 -> 64;
                case 214 -> 206;
                case 215 -> 141;
                case 216 -> 134;
                case 217 -> 61;
                case 218 -> 112;
                case 219 -> 57;
                case 220 -> 205;
                case 221 -> 179;
                case 222 -> 131;
                case 223 -> 73;
                case 224 -> 105;
                case 225 -> 58;
                case 226 -> 142;
                case 227 -> 207;
                case 228 -> 190;
                case 229 -> 174;
                case 230 -> 171;
                case 231 -> 62;
                case 232 -> 213;
                case 233 -> 52;
                case 234 -> 129;
                case 235 -> 18;
                case 236 -> 150;
                case 237 -> 181;
                case 238 -> 168;
                case 239 -> 237;
                case 240 -> 55;
                case 241 -> 84;
                case 242 -> 186;
                case 243 -> 97;
                case 244 -> 60;
                case 245 -> 152;
                case 246 -> 212;
                case 247 -> 149;
                case 248 -> 23;
                case 249 -> 250;
                case 250 -> 254;
                case 251 -> 208;
                case 252 -> 120;
                case 253 -> 20;
                case 254 -> 202;
                default -> 211;
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
            CalcGSub_13.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_13.strArr_1[n3];
    }
}
