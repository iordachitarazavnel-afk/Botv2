// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_1792;
import net.minecraft.class_1268;
import net.minecraft.class_1922;
import net.minecraft.class_243;
import net.minecraft.class_1802;
import net.minecraft.class_1297;
import net.minecraft.class_239;
import net.minecraft.class_1657;
import net.minecraft.class_3966;
import net.minecraft.class_239$class_240;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_7;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public final class CalcGSub_11 extends AbstractLoadF
{
    private final RenderASub_7 gridH;
    private final RenderASub bindK;
    private class_2338 class2338;
    private int intValue;
    private int intValue_1;
    private boolean boolFlag;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_11() {
        super(createString(-19363, -5012), createString(-19364, 30076), Initializer.CART);
        this.gridH = new RenderASub_7(createString(-19361, 10317), 82);
        this.bindK = new RenderASub(createString(-19362, -18950), 0.0, 0.0, 10.0, 1.0);
        this.class2338 = null;
        this.intValue = 0;
        this.intValue_1 = 0;
        this.boolFlag = false;
        this.setRenderaarr(this.gridH, this.bindK);
    }
    
    @Override
    public void execute() {
        this.execute_2();
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.execute_2();
        super.execute_1();
    }
    
    private void execute_2() {
        this.class2338 = null;
        this.intValue = 0;
        this.intValue_1 = 0;
    }
    
    public void execute_3() {
        if (CalcGSub_11.class310.field_1724 == null || CalcGSub_11.class310.field_1687 == null || CalcGSub_11.class310.field_1755 != null) {
            return;
        }
        final boolean b = this.gridH.getValue() != -1 && Initializer_9.checkInt(this.gridH.getValue());
        if (b && !this.boolFlag && this.intValue == 0) {
            if (!Initializer_10.checkPredicate(CalcGSub_11::lambda$onTick$0)) {
                this.boolFlag = b;
                return;
            }
            final class_239 field_1765 = CalcGSub_11.class310.field_1765;
            if (field_1765 != null && field_1765.method_17783() == class_239$class_240.field_1331) {
                final class_1297 method_17782 = ((class_3966)field_1765).method_17782();
                if (method_17782 instanceof final class_1657 class_1657) {
                    this.class2338 = this.computeClass_2338(class_1657);
                    if (this.class2338 != null && this.checkClass_2338(this.class2338)) {
                        this.intValue = 1;
                    }
                    else {
                        this.class2338 = null;
                    }
                }
            }
        }
        this.boolFlag = b;
        if (this.intValue == 0) {
            return;
        }
        if (this.intValue_1 > 0) {
            --this.intValue_1;
            return;
        }
        CalcGSub_11.class310.execute(this::execute_4);
    }
    
    private void execute_4() {
        if (CalcGSub_11.class310.field_1724 == null || CalcGSub_11.class310.field_1687 == null) {
            return;
        }
        switch (this.intValue) {
            case 1: {
                if (Initializer_10.checkClass_1792(class_1802.field_8187)) {
                    this.intValue = 2;
                    this.intValue_1 = 1;
                    break;
                }
                this.execute_2();
                break;
            }
            case 2: {
                if (this.isEnabled()) {
                    this.intValue = 3;
                    break;
                }
                this.execute_2();
                break;
            }
            case 3: {
                this.execute_5();
                this.execute_2();
                break;
            }
        }
    }
    
    private class_2338 computeClass_2338(final class_1657 class_1657) {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        final class_243 method_73189 = class_1657.method_73189();
        final String[] array = stringarrArray;
        final class_243 method_73190 = class_1657.method_18798();
        double method_73191;
        final int n = (int)(method_73191 = (class_1657.method_24828() ? 1 : 0));
        double method_73192 = 0.0;
        Label_0078: {
            Label_0074: {
                if (array != null) {
                    if (n == 0) {
                        break Label_0074;
                    }
                    method_73192 = method_73190.method_37267();
                    if (array == null) {
                        break Label_0078;
                    }
                    method_73191 = dcmpg(method_73192, 0.1);
                }
                if (method_73191 < 0) {
                    return new class_2338((int)Math.floor(method_73189.field_1352), (int)Math.floor(method_73189.field_1351), (int)Math.floor(method_73189.field_1350));
                }
            }
            final double field_1352 = method_73189.field_1352;
        }
        double n2 = method_73192;
        double field_1353 = method_73189.field_1351;
        double field_1354 = method_73189.field_1350;
        double field_1355 = method_73190.field_1352;
        double field_1356 = method_73190.field_1351;
        double field_1357 = method_73190.field_1350;
        int i = 0;
        class_2338 class_1658 = null;
        while (i < 20) {
            field_1356 = (field_1356 - 0.08) * 0.98;
            field_1355 *= 0.91;
            field_1357 *= 0.91;
            n2 += field_1355;
            field_1353 += field_1356;
            field_1354 += field_1357;
            class_1658 = new class_2338((int)Math.floor(n2), (int)Math.floor(field_1353) - 1, (int)Math.floor(field_1354));
            if (array == null) {
                return class_1658;
            }
            final class_2338 class_1659 = class_1658;
            if (array != null) {
                if (!CalcGSub_11.class310.field_1687.method_8320(class_1659).method_26215()) {
                    return new class_2338((int)Math.floor(n2), (int)Math.floor(field_1353), (int)Math.floor(field_1354));
                }
                ++i;
            }
            if (array == null) {
                break;
            }
        }
        final class_2338 class_1660 = new class_2338((int)Math.floor(method_73189.field_1352), (int)Math.floor(method_73189.field_1351), (int)Math.floor(method_73189.field_1350));
        return class_1658;
    }
    
    private boolean checkClass_2338(final class_2338 class_2338) {
        final class_2338 method_10074 = class_2338.method_10074();
        return CalcGSub_11.class310.field_1687.method_8320(method_10074).method_26212((class_1922)CalcGSub_11.class310.field_1687, method_10074) && (CalcGSub_11.class310.field_1687.method_8320(class_2338).method_45474() || CalcGSub_11.class310.field_1687.method_8320(class_2338).method_26215()) && CalcGSub_11.class310.field_1724.method_73189().method_1028(class_2338.method_10263() + 0.5, class_2338.method_10264() + 0.5, class_2338.method_10260() + 0.5) < 25.0;
    }
    
    private boolean isEnabled() {
        if (this.class2338 == null || CalcGSub_11.class310.field_1724 == null || CalcGSub_11.class310.field_1761 == null) {
            return false;
        }
        if (!CalcGSub_11.class310.field_1724.method_6047().method_31574(class_1802.field_8187)) {
            return false;
        }
        this.setClass_243(this.class2338.method_10074().method_46558().method_1031(0.0, 0.5, 0.0));
        if (CalcGSub_11.class310.field_1761.method_2919((class_1657)CalcGSub_11.class310.field_1724, class_1268.field_5808).method_23665()) {
            CalcGSub_11.class310.field_1724.method_6104(class_1268.field_5808);
            return true;
        }
        return false;
    }
    
    private void execute_5() {
        if (this.class2338 == null || CalcGSub_11.class310.field_1724 == null || CalcGSub_11.class310.field_1761 == null) {
            return;
        }
        if (!Initializer_10.checkClass_1792(class_1802.field_8550)) {
            return;
        }
        this.setClass_243(this.class2338.method_46558());
        if (CalcGSub_11.class310.field_1761.method_2919((class_1657)CalcGSub_11.class310.field_1724, class_1268.field_5808).method_23665()) {
            CalcGSub_11.class310.field_1724.method_6104(class_1268.field_5808);
        }
    }
    
    private void setClass_243(final class_243 class_243) {
        final class_243 method_1020 = class_243.method_1020(CalcGSub_11.class310.field_1724.method_33571());
        final double method_1021 = method_1020.method_37267();
        CalcGSub_11.class310.field_1724.method_36456((float)Math.toDegrees(Math.atan2(-method_1020.field_1352, method_1020.field_1350)));
        CalcGSub_11.class310.field_1724.method_36457((float)(-Math.toDegrees(Math.atan2(method_1020.field_1351, method_1021))));
    }
    
    private static boolean lambda$onTick$0(final class_1792 class_1792) {
        return class_1792 == class_1802.field_8187;
    }
    
    static {
        final String[] strArr2 = new String[4];
        int n = 0;
        String s;
        int n2 = (s = "R\u00dd½\u0097H\u00e3\u0011¡\u00f7\u001a\u0089\u0095\u00e0¨\u0011¶\u0096\u00c9nDy5\u00dc«\u0098\u0006±G\u008b\u001f\bd¢'\u0003|").length();
        int n3 = 9;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 117));
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
                        Label_0257: {
                            if (length > 1) {
                                break Label_0257;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 57;
                                    case 1 -> 2;
                                    case 2 -> 22;
                                    case 3 -> 3;
                                    case 4 -> 60;
                                    case 5 -> 100;
                                    default -> 1;
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
                            n2 = (s = "\u00f71Z\u008b±\u00d8\u00f4\u000e\u00ee\u00faWr\u00056k\u00df\u000e\u0015").length();
                            n3 = 12;
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
                    n5 = (n6 = (n7 = (n8 = 45)));
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
        final int n3 = (n ^ 0xFFFFB45D) & 0xFFFF;
        if (CalcGSub_11.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_11.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 169;
                case 1 -> 204;
                case 2 -> 93;
                case 3 -> 234;
                case 4 -> 165;
                case 5 -> 36;
                case 6 -> 63;
                case 7 -> 208;
                case 8 -> 72;
                case 9 -> 12;
                case 10 -> 219;
                case 11 -> 213;
                case 12 -> 60;
                case 13 -> 183;
                case 14 -> 20;
                case 15 -> 66;
                case 16 -> 137;
                case 17 -> 249;
                case 18 -> 248;
                case 19 -> 230;
                case 20 -> 23;
                case 21 -> 117;
                case 22 -> 15;
                case 23 -> 168;
                case 24 -> 45;
                case 25 -> 202;
                case 26 -> 153;
                case 27 -> 198;
                case 28 -> 122;
                case 29 -> 196;
                case 30 -> 13;
                case 31 -> 40;
                case 32 -> 34;
                case 33 -> 7;
                case 34 -> 148;
                case 35 -> 222;
                case 36 -> 192;
                case 37 -> 173;
                case 38 -> 2;
                case 39 -> 95;
                case 40 -> 235;
                case 41 -> 200;
                case 42 -> 194;
                case 43 -> 73;
                case 44 -> 181;
                case 45 -> 184;
                case 46 -> 28;
                case 47 -> 29;
                case 48 -> 131;
                case 49 -> 132;
                case 50 -> 69;
                case 51 -> 68;
                case 52 -> 1;
                case 53 -> 80;
                case 54 -> 149;
                case 55 -> 21;
                case 56 -> 85;
                case 57 -> 152;
                case 58 -> 65;
                case 59 -> 81;
                case 60 -> 193;
                case 61 -> 76;
                case 62 -> 0;
                case 63 -> 61;
                case 64 -> 38;
                case 65 -> 161;
                case 66 -> 129;
                case 67 -> 209;
                case 68 -> 232;
                case 69 -> 125;
                case 70 -> 212;
                case 71 -> 52;
                case 72 -> 134;
                case 73 -> 31;
                case 74 -> 39;
                case 75 -> 24;
                case 76 -> 33;
                case 77 -> 227;
                case 78 -> 141;
                case 79 -> 251;
                case 80 -> 111;
                case 81 -> 64;
                case 82 -> 26;
                case 83 -> 217;
                case 84 -> 79;
                case 85 -> 182;
                case 86 -> 233;
                case 87 -> 177;
                case 88 -> 186;
                case 89 -> 142;
                case 90 -> 90;
                case 91 -> 239;
                case 92 -> 228;
                case 93 -> 32;
                case 94 -> 86;
                case 95 -> 174;
                case 96 -> 121;
                case 97 -> 167;
                case 98 -> 105;
                case 99 -> 41;
                case 100 -> 143;
                case 101 -> 56;
                case 102 -> 128;
                case 103 -> 245;
                case 104 -> 220;
                case 105 -> 160;
                case 106 -> 62;
                case 107 -> 88;
                case 108 -> 210;
                case 109 -> 101;
                case 110 -> 123;
                case 111 -> 216;
                case 112 -> 107;
                case 113 -> 178;
                case 114 -> 83;
                case 115 -> 59;
                case 116 -> 136;
                case 117 -> 211;
                case 118 -> 70;
                case 119 -> 201;
                case 120 -> 250;
                case 121 -> 215;
                case 122 -> 114;
                case 123 -> 54;
                case 124 -> 172;
                case 125 -> 197;
                case 126 -> 236;
                case 127 -> 164;
                case 128 -> 94;
                case 129 -> 206;
                case 130 -> 84;
                case 131 -> 118;
                case 132 -> 127;
                case 133 -> 175;
                case 134 -> 135;
                case 135 -> 11;
                case 136 -> 151;
                case 137 -> 48;
                case 138 -> 144;
                case 139 -> 146;
                case 140 -> 74;
                case 141 -> 5;
                case 142 -> 97;
                case 143 -> 252;
                case 144 -> 14;
                case 145 -> 47;
                case 146 -> 27;
                case 147 -> 189;
                case 148 -> 147;
                case 149 -> 162;
                case 150 -> 138;
                case 151 -> 46;
                case 152 -> 157;
                case 153 -> 253;
                case 154 -> 237;
                case 155 -> 96;
                case 156 -> 166;
                case 157 -> 100;
                case 158 -> 104;
                case 159 -> 159;
                case 160 -> 9;
                case 161 -> 98;
                case 162 -> 247;
                case 163 -> 49;
                case 164 -> 218;
                case 165 -> 17;
                case 166 -> 190;
                case 167 -> 112;
                case 168 -> 37;
                case 169 -> 50;
                case 170 -> 124;
                case 171 -> 254;
                case 172 -> 18;
                case 173 -> 244;
                case 174 -> 126;
                case 175 -> 255;
                case 176 -> 116;
                case 177 -> 91;
                case 178 -> 110;
                case 179 -> 150;
                case 180 -> 113;
                case 181 -> 16;
                case 182 -> 214;
                case 183 -> 78;
                case 184 -> 109;
                case 185 -> 158;
                case 186 -> 195;
                case 187 -> 58;
                case 188 -> 140;
                case 189 -> 75;
                case 190 -> 10;
                case 191 -> 207;
                case 192 -> 133;
                case 193 -> 3;
                case 194 -> 35;
                case 195 -> 19;
                case 196 -> 240;
                case 197 -> 231;
                case 198 -> 238;
                case 199 -> 42;
                case 200 -> 242;
                case 201 -> 119;
                case 202 -> 43;
                case 203 -> 57;
                case 204 -> 71;
                case 205 -> 4;
                case 206 -> 67;
                case 207 -> 22;
                case 208 -> 223;
                case 209 -> 120;
                case 210 -> 106;
                case 211 -> 241;
                case 212 -> 156;
                case 213 -> 176;
                case 214 -> 180;
                case 215 -> 226;
                case 216 -> 243;
                case 217 -> 191;
                case 218 -> 99;
                case 219 -> 53;
                case 220 -> 199;
                case 221 -> 154;
                case 222 -> 221;
                case 223 -> 139;
                case 224 -> 185;
                case 225 -> 25;
                case 226 -> 108;
                case 227 -> 171;
                case 228 -> 203;
                case 229 -> 55;
                case 230 -> 187;
                case 231 -> 51;
                case 232 -> 155;
                case 233 -> 82;
                case 234 -> 87;
                case 235 -> 229;
                case 236 -> 188;
                case 237 -> 163;
                case 238 -> 44;
                case 239 -> 30;
                case 240 -> 92;
                case 241 -> 6;
                case 242 -> 170;
                case 243 -> 246;
                case 244 -> 8;
                case 245 -> 145;
                case 246 -> 225;
                case 247 -> 205;
                case 248 -> 115;
                case 249 -> 77;
                case 250 -> 130;
                case 251 -> 102;
                case 252 -> 103;
                case 253 -> 89;
                case 254 -> 224;
                default -> 179;
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
            CalcGSub_11.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_11.strArr_1[n3];
    }
}
