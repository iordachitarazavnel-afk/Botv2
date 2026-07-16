// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1735;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_5;
import net.minecraft.class_476;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_3;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub_15 extends AbstractLoadF
{
    private final RenderASub_3 configO;
    private Initializer_11 nodeE;
    private int intValue;
    private int intValue_1;
    private int intValue_2;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_15() {
        super(createString(5276, 19364), createString(5275, 27834), Initializer.stepF);
        this.configO = new RenderASub_3(createString(5273, 15704), 2.0, 1.0, 10.0, 1.0);
        this.nodeE = Initializer_11.IDLE;
        this.intValue = 0;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.setRenderaarr(this.configO);
    }
    
    @Override
    public void execute() {
        if (CalcGSub_15.class310.field_1724 == null || CalcGSub_15.class310.field_1687 == null) {
            this.execute_2();
            return;
        }
        this.nodeE = Initializer_11.OPENING_GUI;
        CalcGSub_15.class310.field_1724.field_3944.method_45730(createString(5278, -9602));
        this.intValue_1 = 40;
    }
    
    @Override
    public void execute_1() {
        this.nodeE = Initializer_11.IDLE;
        this.intValue = 0;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
    }
    
    @Override
    public void execute_2() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        final class_310 class310 = CalcGSub_15.class310;
        Label_0033: {
            if (stringarrArray != null) {
                if (class310.field_1724 != null) {
                    final class_310 class311 = CalcGSub_15.class310;
                    if (stringarrArray == null) {
                        break Label_0033;
                    }
                    if (class311.field_1761 != null) {
                        int n3;
                        int n2;
                        final int n = n2 = (n3 = this.intValue_2);
                        if (stringarrArray != null) {
                            if (n > 0) {
                                --this.intValue_2;
                                return;
                            }
                            final int n4;
                            n2 = (n4 = (n3 = this.nodeE.ordinal()));
                        }
                        Label_0410: {
                            Label_0202: {
                                if (stringarrArray != null) {
                                    switch (n) {
                                        case 1: {
                                            n3 = (n2 = ((CalcGSub_15.class310.field_1755 instanceof class_476) ? 1 : 0));
                                            break;
                                        }
                                        case 2: {
                                            break Label_0202;
                                        }
                                        case 3: {
                                            break Label_0410;
                                        }
                                    }
                                }
                                Label_0198: {
                                    if (stringarrArray != null) {
                                        if (n2 != 0) {
                                            this.nodeE = Initializer_11.DEPOSITING;
                                            this.intValue = CalcGSub_15.class310.field_1724.field_7498.field_7761.size() - 36;
                                            if (stringarrArray != null) {
                                                return;
                                            }
                                        }
                                        --this.intValue_1;
                                        if (stringarrArray == null) {
                                            break Label_0198;
                                        }
                                        n3 = this.intValue_1;
                                    }
                                    if (n3 > 0) {
                                        return;
                                    }
                                    Initializer_5.setString_2(createString(5279, -2268));
                                    CalcGSub_15.class310.execute(this::execute_2);
                                }
                                if (stringarrArray != null) {
                                    return;
                                }
                            }
                            final int n5 = (CalcGSub_15.class310.field_1755 instanceof class_476) ? 1 : 0;
                            if (stringarrArray != null && n5 == 0) {
                                Initializer_5.setString_2(createString(5277, 5121));
                                CalcGSub_15.class310.execute(this::execute_2);
                                return;
                            }
                            int n6 = n5;
                            int i = this.intValue;
                        Label_0399_Outer:
                            while (true) {
                                int n7;
                                while (true) {
                                    while (i < CalcGSub_15.class310.field_1724.field_7498.field_7761.size()) {
                                        final class_310 class312 = CalcGSub_15.class310;
                                        if (stringarrArray != null) {
                                            final class_1735 method_7611 = class312.field_1724.field_7498.method_7611(i);
                                            Label_0344: {
                                                Label_0341: {
                                                    if (stringarrArray != null) {
                                                        if (method_7611.field_7871 != CalcGSub_15.class310.field_1724.method_31548()) {
                                                            break Label_0341;
                                                        }
                                                        CalcGSub_15.class310.field_1724.field_7498.method_7611(i);
                                                    }
                                                    final class_1799 method_7612 = method_7611.method_7677();
                                                    if (stringarrArray == null) {
                                                        break Label_0344;
                                                    }
                                                    if (!method_7612.method_7960()) {
                                                        n6 = i;
                                                        if (stringarrArray != null) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                ++i;
                                            }
                                            if (stringarrArray == null) {
                                                break;
                                            }
                                            continue Label_0399_Outer;
                                        }
                                        else {
                                            class312.execute(CalcGSub_15::lambda$onTick$0);
                                            this.intValue = n6 + 1;
                                            this.intValue_2 = this.configO.getValue().intValue();
                                            if (stringarrArray != null) {
                                                return;
                                            }
                                            this.nodeE = Initializer_11.CLOSING;
                                            if (stringarrArray == null) {
                                                break Label_0410;
                                            }
                                            return;
                                        }
                                    }
                                    n7 = n6;
                                    if (stringarrArray != null && n7 == -1) {
                                        continue;
                                    }
                                    break;
                                }
                                i = n7;
                                final class_310 class313 = CalcGSub_15.class310;
                                continue Label_0399_Outer;
                            }
                        }
                        CalcGSub_15.class310.execute(this::lambda$onTick$1);
                        this.nodeE = Initializer_11.IDLE;
                        return;
                    }
                }
                final class_310 class314 = CalcGSub_15.class310;
            }
        }
        class310.execute(this::execute_2);
    }
    
    private void lambda$onTick$1() {
        if (CalcGSub_15.class310.field_1755 != null) {
            CalcGSub_15.class310.field_1724.method_7346();
        }
        Initializer_5.setString(createString(5274, 7213));
        this.execute_2();
    }
    
    private static void lambda$onTick$0(final int n) {
        CalcGSub_15.class310.field_1761.method_2906(CalcGSub_15.class310.field_1724.field_7498.field_7763, n, 0, class_1713.field_7794, (class_1657)CalcGSub_15.class310.field_1724);
    }
    
    static {
        final String[] strArr2 = new String[7];
        int n = 0;
        String s;
        int n2 = (s = "vs[\u00c9`ºU\u00050}\rE;OI\u0011,'\u00c7\u00c5\u00fe\u0019\u00fcDh\u0082¦(¦\u008f#\u0004S\u00f4=½\u001d\u0087\u00e1\u0083\u001f\u001e/l\u0000>%\tk\u00d9TA\u000f\u0093-c\u0014\u000b\u0093\u0010\u00e9\u00ee\f\u0012\u00ce\u008e\bG·\u00d3\u00c4|\u0015\u0004\u00040dC·Z\u00ce\u00c2³\u007f\u0083\u00ec\u0095\u0013@}.\u0082\u0092so\u00c5O\u00f3¤\u0099\u009a\u00cc\u0018\u00d0º\u0096\u0005\u001eks\u00f8N\u0083\u0014£g,\u00f4PO\u00e0\u00e7H\u0084").length();
        int n3 = 31;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 57));
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
                                    case 0 -> 122;
                                    case 1 -> 23;
                                    case 2 -> 119;
                                    case 3 -> 122;
                                    case 4 -> 95;
                                    case 5 -> 59;
                                    default -> 43;
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
                            n2 = (s = "M\u0010Y\u009fb\u0083\u00dcD(\u0003\u00f4\u0088gqVWY¸\u00e2j#\u00c2\u00d0\u0013\u00ce\u0091\u008b\u0000\u00c7sR\u001a°\u00fb>\u008b\u00e5\u00c9\u00cd\u00fa\u0086\u0093f").length();
                            n3 = 23;
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
                    n5 = (n6 = (n7 = (n8 = 9)));
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
        final int n3 = (n ^ 0x149F) & 0xFFFF;
        if (CalcGSub_15.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_15.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 158;
                case 1 -> 253;
                case 2 -> 130;
                case 3 -> 221;
                case 4 -> 95;
                case 5 -> 91;
                case 6 -> 134;
                case 7 -> 44;
                case 8 -> 148;
                case 9 -> 178;
                case 10 -> 175;
                case 11 -> 217;
                case 12 -> 34;
                case 13 -> 87;
                case 14 -> 220;
                case 15 -> 127;
                case 16 -> 27;
                case 17 -> 12;
                case 18 -> 72;
                case 19 -> 145;
                case 20 -> 170;
                case 21 -> 190;
                case 22 -> 37;
                case 23 -> 251;
                case 24 -> 49;
                case 25 -> 92;
                case 26 -> 138;
                case 27 -> 200;
                case 28 -> 244;
                case 29 -> 238;
                case 30 -> 164;
                case 31 -> 4;
                case 32 -> 142;
                case 33 -> 42;
                case 34 -> 228;
                case 35 -> 125;
                case 36 -> 107;
                case 37 -> 108;
                case 38 -> 208;
                case 39 -> 84;
                case 40 -> 254;
                case 41 -> 250;
                case 42 -> 157;
                case 43 -> 169;
                case 44 -> 243;
                case 45 -> 161;
                case 46 -> 30;
                case 47 -> 83;
                case 48 -> 81;
                case 49 -> 189;
                case 50 -> 112;
                case 51 -> 159;
                case 52 -> 199;
                case 53 -> 195;
                case 54 -> 201;
                case 55 -> 249;
                case 56 -> 38;
                case 57 -> 147;
                case 58 -> 166;
                case 59 -> 116;
                case 60 -> 68;
                case 61 -> 233;
                case 62 -> 181;
                case 63 -> 168;
                case 64 -> 80;
                case 65 -> 78;
                case 66 -> 41;
                case 67 -> 245;
                case 68 -> 232;
                case 69 -> 205;
                case 70 -> 183;
                case 71 -> 204;
                case 72 -> 128;
                case 73 -> 119;
                case 74 -> 85;
                case 75 -> 57;
                case 76 -> 202;
                case 77 -> 69;
                case 78 -> 52;
                case 79 -> 185;
                case 80 -> 213;
                case 81 -> 224;
                case 82 -> 211;
                case 83 -> 126;
                case 84 -> 174;
                case 85 -> 86;
                case 86 -> 28;
                case 87 -> 64;
                case 88 -> 140;
                case 89 -> 198;
                case 90 -> 99;
                case 91 -> 40;
                case 92 -> 7;
                case 93 -> 88;
                case 94 -> 43;
                case 95 -> 96;
                case 96 -> 239;
                case 97 -> 23;
                case 98 -> 55;
                case 99 -> 118;
                case 100 -> 76;
                case 101 -> 24;
                case 102 -> 63;
                case 103 -> 53;
                case 104 -> 131;
                case 105 -> 15;
                case 106 -> 1;
                case 107 -> 141;
                case 108 -> 234;
                case 109 -> 3;
                case 110 -> 117;
                case 111 -> 186;
                case 112 -> 60;
                case 113 -> 22;
                case 114 -> 163;
                case 115 -> 10;
                case 116 -> 176;
                case 117 -> 59;
                case 118 -> 171;
                case 119 -> 100;
                case 120 -> 137;
                case 121 -> 240;
                case 122 -> 160;
                case 123 -> 237;
                case 124 -> 216;
                case 125 -> 235;
                case 126 -> 70;
                case 127 -> 93;
                case 128 -> 236;
                case 129 -> 173;
                case 130 -> 26;
                case 131 -> 225;
                case 132 -> 71;
                case 133 -> 31;
                case 134 -> 231;
                case 135 -> 154;
                case 136 -> 184;
                case 137 -> 56;
                case 138 -> 14;
                case 139 -> 0;
                case 140 -> 248;
                case 141 -> 109;
                case 142 -> 65;
                case 143 -> 226;
                case 144 -> 5;
                case 145 -> 11;
                case 146 -> 35;
                case 147 -> 104;
                case 148 -> 196;
                case 149 -> 73;
                case 150 -> 94;
                case 151 -> 36;
                case 152 -> 124;
                case 153 -> 229;
                case 154 -> 98;
                case 155 -> 101;
                case 156 -> 54;
                case 157 -> 197;
                case 158 -> 111;
                case 159 -> 167;
                case 160 -> 77;
                case 161 -> 67;
                case 162 -> 180;
                case 163 -> 177;
                case 164 -> 150;
                case 165 -> 25;
                case 166 -> 223;
                case 167 -> 50;
                case 168 -> 144;
                case 169 -> 230;
                case 170 -> 255;
                case 171 -> 218;
                case 172 -> 155;
                case 173 -> 165;
                case 174 -> 114;
                case 175 -> 241;
                case 176 -> 143;
                case 177 -> 74;
                case 178 -> 103;
                case 179 -> 182;
                case 180 -> 162;
                case 181 -> 113;
                case 182 -> 2;
                case 183 -> 151;
                case 184 -> 215;
                case 185 -> 32;
                case 186 -> 123;
                case 187 -> 209;
                case 188 -> 191;
                case 189 -> 90;
                case 190 -> 203;
                case 191 -> 192;
                case 192 -> 8;
                case 193 -> 89;
                case 194 -> 149;
                case 195 -> 97;
                case 196 -> 106;
                case 197 -> 246;
                case 198 -> 16;
                case 199 -> 219;
                case 200 -> 51;
                case 201 -> 79;
                case 202 -> 206;
                case 203 -> 61;
                case 204 -> 133;
                case 205 -> 187;
                case 206 -> 47;
                case 207 -> 17;
                case 208 -> 9;
                case 209 -> 66;
                case 210 -> 20;
                case 211 -> 62;
                case 212 -> 105;
                case 213 -> 227;
                case 214 -> 18;
                case 215 -> 242;
                case 216 -> 222;
                case 217 -> 13;
                case 218 -> 21;
                case 219 -> 46;
                case 220 -> 188;
                case 221 -> 132;
                case 222 -> 120;
                case 223 -> 75;
                case 224 -> 172;
                case 225 -> 136;
                case 226 -> 153;
                case 227 -> 135;
                case 228 -> 121;
                case 229 -> 139;
                case 230 -> 212;
                case 231 -> 29;
                case 232 -> 102;
                case 233 -> 146;
                case 234 -> 179;
                case 235 -> 115;
                case 236 -> 214;
                case 237 -> 110;
                case 238 -> 210;
                case 239 -> 33;
                case 240 -> 193;
                case 241 -> 19;
                case 242 -> 48;
                case 243 -> 122;
                case 244 -> 207;
                case 245 -> 82;
                case 246 -> 129;
                case 247 -> 39;
                case 248 -> 194;
                case 249 -> 58;
                case 250 -> 247;
                case 251 -> 252;
                case 252 -> 152;
                case 253 -> 6;
                case 254 -> 45;
                default -> 156;
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
            CalcGSub_15.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_15.strArr_1[n3];
    }
}
