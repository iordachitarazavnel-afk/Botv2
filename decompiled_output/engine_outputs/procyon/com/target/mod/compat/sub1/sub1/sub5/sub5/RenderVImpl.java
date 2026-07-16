// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub5;

import net.minecraft.class_2735;
import com.target.mod.compat.sub1.sub1.sub2.sub1.ParseCSub_1;
import net.minecraft.class_746;
import net.minecraft.class_1799;
import net.minecraft.class_1661;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import net.minecraft.class_1792;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BlockEImpl_7;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public final class RenderVImpl extends AbstractLoadF implements BlockEImpl_7
{
    private static final int intValue = 9;
    private static final int[] intArr;
    private static final int[] intArr_1;
    private static final class_1792[] class_1792Array;
    private static final int[] intArr_2;
    private static final long[] longArray;
    private static final int intValue_1 = 5;
    public static volatile boolean boolFlag;
    private static long longValue;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public RenderVImpl() {
        super(createString(-4806, -20483), createString(-4805, 24916), Initializer.VISUAL);
    }
    
    @Override
    public void execute() {
        if (com.target.mod.compat.sub1.sub1.sub1.Initializer_1.initD != null) {
            com.target.mod.compat.sub1.sub1.sub1.Initializer_1.initD.setClassAndBlocke(BlockEImpl_7.class, this);
        }
        this.execute_2();
    }
    
    @Override
    public void execute_1() {
        if (com.target.mod.compat.sub1.sub1.sub1.Initializer_1.initD != null) {
            com.target.mod.compat.sub1.sub1.sub1.Initializer_1.initD.setClassAndBlocke_1(BlockEImpl_7.class, this);
        }
    }
    
    private void execute_2() {
        final class_310 method_1551 = class_310.method_1551();
        if (method_1551.field_1724 != null) {
            final class_1661 method_1552 = method_1551.field_1724.method_31548();
            for (int i = 0; i < 9; ++i) {
                final class_1799 method_1553 = method_1552.method_5438(i);
                final int method_1554 = method_1553.method_7947();
                RenderVImpl.intArr[i] = method_1554;
                RenderVImpl.intArr_1[i] = method_1554;
                RenderVImpl.class_1792Array[i] = method_1553.method_7909();
                RenderVImpl.intArr_2[i] = 5;
                RenderVImpl.longArray[i] = 0L;
            }
        }
    }
    
    public void execute_3() {
        final boolean enabled_1 = com.target.mod.compat.sub1.sub1.sub5.sub5.Initializer.isEnabled_1();
        final class_310 method_1551 = class_310.method_1551();
        final boolean b = enabled_1;
        final class_746 field_1724 = method_1551.field_1724;
        if (!b) {
            if (field_1724 == null) {
                return;
            }
            ++RenderVImpl.longValue;
            final class_746 field_1725 = method_1551.field_1724;
        }
        final class_1661 method_1552 = field_1724.method_31548();
        int i = 0;
        while (i < 9) {
            final class_1799 method_1553 = method_1552.method_5438(i);
            final int method_1554 = method_1553.method_7947();
            final class_1792 method_1555 = method_1553.method_7909();
            Label_0381: {
                long method_1556 = 0L;
                long n2 = 0L;
                int n = 0;
                Label_0139: {
                    Label_0137: {
                        if (!b) {
                            if (method_1555 == RenderVImpl.class_1792Array[i]) {
                                n = (int)(n2 = (method_1556 = (method_1553.method_7960() ? 1 : 0)));
                                if (b) {
                                    break Label_0139;
                                }
                                if (n == 0) {
                                    break Label_0137;
                                }
                            }
                            RenderVImpl.intArr[i] = method_1554;
                            RenderVImpl.intArr_1[i] = method_1554;
                            RenderVImpl.class_1792Array[i] = method_1555;
                            RenderVImpl.intArr_2[i] = 5;
                            RenderVImpl.longArray[i] = 0L;
                        }
                        if (!b) {
                            break Label_0381;
                        }
                    }
                    final int n3;
                    n2 = (n3 = (int)(method_1556 = method_1554));
                }
                int n14 = 0;
                int n15 = 0;
                Label_0341: {
                    Label_0335: {
                        if (!b) {
                            if (n != RenderVImpl.intArr_1[i]) {
                                final int n4 = method_1554;
                                final int n5 = RenderVImpl.intArr_1[i];
                                Label_0213: {
                                    Label_0206: {
                                        if (!b) {
                                            if (n4 >= n5) {
                                                break Label_0206;
                                            }
                                            final int n6 = RenderVImpl.intArr[i];
                                        }
                                        if (n4 < n5) {
                                            RenderVImpl.intArr[i] = method_1554;
                                        }
                                        RenderVImpl.longArray[i] = RenderVImpl.longValue;
                                        RenderVImpl.intArr_2[i] = 0;
                                        if (!b) {
                                            break Label_0213;
                                        }
                                    }
                                    RenderVImpl.intArr_2[i] = 0;
                                }
                                RenderVImpl.intArr_1[i] = method_1554;
                                if (!b) {
                                    break Label_0335;
                                }
                            }
                            final int[] intArr_2 = RenderVImpl.intArr_2;
                            final int n7 = i;
                            ++intArr_2[n7];
                            method_1556 = (n2 = lcmp(RenderVImpl.longValue - RenderVImpl.longArray[i], 5L));
                        }
                        if (!b) {
                            if (n2 < 0) {
                                method_1556 = 1;
                            }
                            else {
                                method_1556 = 0;
                            }
                        }
                        final int n8 = (int)method_1556;
                        final int n9 = RenderVImpl.intArr_2[i];
                        final int n10 = 5;
                        if (!b) {
                            Label_0304: {
                                if (n9 >= n10) {
                                    final int n13;
                                    final int n12;
                                    final int n11 = n12 = (n13 = (n14 = n8));
                                    if (b) {
                                        break Label_0304;
                                    }
                                    if (n11 == 0) {
                                        RenderVImpl.intArr[i] = method_1554;
                                        if (!b) {
                                            break Label_0335;
                                        }
                                    }
                                }
                                n14 = RenderVImpl.intArr_2[i];
                            }
                            if (b) {
                                break Label_0341;
                            }
                        }
                        if (n9 >= n10) {
                            n15 = (n14 = RenderVImpl.intArr[i]);
                            if (b) {
                                break Label_0341;
                            }
                            if (n15 > method_1554) {
                                RenderVImpl.intArr[i] = method_1554;
                            }
                        }
                    }
                    int n13;
                    n14 = (n13 = RenderVImpl.intArr[i]);
                }
                int[] intArr = null;
                int n16 = 0;
                Label_0378: {
                    if (!b) {
                        if (n15 < 0) {
                            RenderVImpl.intArr[i] = 0;
                        }
                        intArr = RenderVImpl.intArr;
                        n16 = i;
                        if (b) {
                            break Label_0378;
                        }
                        n14 = intArr[n16];
                    }
                    if (n14 <= method_1554 + 10) {
                        break Label_0381;
                    }
                    final int[] intArr2 = RenderVImpl.intArr;
                }
                intArr[n16] = method_1554;
            }
            ++i;
            if (b) {
                break;
            }
        }
    }
    
    public static int method_int(final class_1799 class_1799) {
        if (!isEnabled() || !RenderVImpl.boolFlag) {
            return -1;
        }
        final class_310 method_1551 = class_310.method_1551();
        if (method_1551.field_1724 == null) {
            return -1;
        }
        final class_1661 method_1552 = method_1551.field_1724.method_31548();
        for (int i = 0; i < 9; ++i) {
            if (method_1552.method_5438(i) == class_1799) {
                return RenderVImpl.intArr[i];
            }
        }
        return -1;
    }
    
    @Override
    public void setConfigh(final ParseCSub_1 parseCSub_1) {
        final class_310 method_1551 = class_310.method_1551();
        if (method_1551.field_1724 == null || method_1551.field_1687 == null) {
            return;
        }
        if (parseCSub_1.class2596 instanceof class_2735) {
            parseCSub_1.execute();
        }
    }
    
    public static boolean isEnabled() {
        if (com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF == null) {
            return false;
        }
        final RenderVImpl renderVImpl = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF.computeCalcg_1(RenderVImpl.class);
        return renderVImpl != null && renderVImpl.isEnabled();
    }
    
    static {
        final String[] strArr2 = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "~9±\u00e2~¹£1\u00de+\u00ce\u00e2u\u00ff\u001b\u0082(\u0007\u0015q\u0086\u00ec\u00c8K\u00d1J\u00c10\u00ad\u00fe½\u00df\u00faµ³\u0017§9¦\u00f3\u00cbT\u00d5F\u00ff'1\u0095h w\u000f\f").length();
        int char1 = 9;
        int index = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 89);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0199: {
                        if (length2 > 1) {
                            break Label_0199;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 4;
                                case 1 -> 16;
                                case 2 -> 43;
                                case 3 -> 117;
                                case 4 -> 20;
                                case 5 -> 70;
                                default -> 112;
                            }));
                            ++n5;
                        } while (n2 == 0);
                    }
                    if (length2 > n5) {
                        continue;
                    }
                    break;
                }
                strArr2[n++] = new String(charArray).intern();
            } while ((index += char1) < length);
        }
        strArr = strArr2;
        strArr_1 = new String[2];
        intArr = new int[9];
        intArr_1 = new int[9];
        class_1792Array = new class_1792[9];
        intArr_2 = new int[9];
        longArray = new long[9];
        RenderVImpl.boolFlag = false;
        RenderVImpl.longValue = 0L;
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFED3A) & 0xFFFF;
        if (RenderVImpl.strArr_1[n3] == null) {
            final char[] charArray = RenderVImpl.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 62;
                case 1 -> 81;
                case 2 -> 163;
                case 3 -> 85;
                case 4 -> 244;
                case 5 -> 16;
                case 6 -> 230;
                case 7 -> 211;
                case 8 -> 138;
                case 9 -> 133;
                case 10 -> 242;
                case 11 -> 155;
                case 12 -> 69;
                case 13 -> 187;
                case 14 -> 58;
                case 15 -> 80;
                case 16 -> 27;
                case 17 -> 232;
                case 18 -> 178;
                case 19 -> 151;
                case 20 -> 168;
                case 21 -> 154;
                case 22 -> 233;
                case 23 -> 161;
                case 24 -> 240;
                case 25 -> 49;
                case 26 -> 182;
                case 27 -> 11;
                case 28 -> 127;
                case 29 -> 203;
                case 30 -> 109;
                case 31 -> 15;
                case 32 -> 17;
                case 33 -> 159;
                case 34 -> 116;
                case 35 -> 144;
                case 36 -> 249;
                case 37 -> 228;
                case 38 -> 76;
                case 39 -> 241;
                case 40 -> 110;
                case 41 -> 73;
                case 42 -> 142;
                case 43 -> 1;
                case 44 -> 200;
                case 45 -> 194;
                case 46 -> 78;
                case 47 -> 123;
                case 48 -> 195;
                case 49 -> 179;
                case 50 -> 255;
                case 51 -> 44;
                case 52 -> 132;
                case 53 -> 75;
                case 54 -> 106;
                case 55 -> 140;
                case 56 -> 202;
                case 57 -> 218;
                case 58 -> 157;
                case 59 -> 170;
                case 60 -> 126;
                case 61 -> 191;
                case 62 -> 201;
                case 63 -> 146;
                case 64 -> 150;
                case 65 -> 139;
                case 66 -> 45;
                case 67 -> 87;
                case 68 -> 190;
                case 69 -> 41;
                case 70 -> 43;
                case 71 -> 71;
                case 72 -> 216;
                case 73 -> 105;
                case 74 -> 0;
                case 75 -> 29;
                case 76 -> 22;
                case 77 -> 205;
                case 78 -> 67;
                case 79 -> 160;
                case 80 -> 141;
                case 81 -> 134;
                case 82 -> 196;
                case 83 -> 236;
                case 84 -> 114;
                case 85 -> 217;
                case 86 -> 37;
                case 87 -> 14;
                case 88 -> 237;
                case 89 -> 5;
                case 90 -> 24;
                case 91 -> 68;
                case 92 -> 119;
                case 93 -> 74;
                case 94 -> 117;
                case 95 -> 8;
                case 96 -> 130;
                case 97 -> 122;
                case 98 -> 99;
                case 99 -> 189;
                case 100 -> 235;
                case 101 -> 7;
                case 102 -> 215;
                case 103 -> 39;
                case 104 -> 40;
                case 105 -> 100;
                case 106 -> 101;
                case 107 -> 135;
                case 108 -> 59;
                case 109 -> 121;
                case 110 -> 92;
                case 111 -> 253;
                case 112 -> 153;
                case 113 -> 56;
                case 114 -> 131;
                case 115 -> 12;
                case 116 -> 48;
                case 117 -> 86;
                case 118 -> 42;
                case 119 -> 137;
                case 120 -> 198;
                case 121 -> 23;
                case 122 -> 77;
                case 123 -> 79;
                case 124 -> 46;
                case 125 -> 225;
                case 126 -> 19;
                case 127 -> 91;
                case 128 -> 219;
                case 129 -> 171;
                case 130 -> 212;
                case 131 -> 112;
                case 132 -> 226;
                case 133 -> 129;
                case 134 -> 52;
                case 135 -> 173;
                case 136 -> 183;
                case 137 -> 184;
                case 138 -> 26;
                case 139 -> 70;
                case 140 -> 206;
                case 141 -> 21;
                case 142 -> 166;
                case 143 -> 177;
                case 144 -> 172;
                case 145 -> 229;
                case 146 -> 89;
                case 147 -> 147;
                case 148 -> 145;
                case 149 -> 108;
                case 150 -> 252;
                case 151 -> 94;
                case 152 -> 65;
                case 153 -> 208;
                case 154 -> 221;
                case 155 -> 35;
                case 156 -> 97;
                case 157 -> 162;
                case 158 -> 66;
                case 159 -> 251;
                case 160 -> 124;
                case 161 -> 55;
                case 162 -> 227;
                case 163 -> 169;
                case 164 -> 36;
                case 165 -> 165;
                case 166 -> 95;
                case 167 -> 30;
                case 168 -> 25;
                case 169 -> 50;
                case 170 -> 111;
                case 171 -> 248;
                case 172 -> 33;
                case 173 -> 34;
                case 174 -> 98;
                case 175 -> 199;
                case 176 -> 143;
                case 177 -> 9;
                case 178 -> 186;
                case 179 -> 158;
                case 180 -> 88;
                case 181 -> 220;
                case 182 -> 104;
                case 183 -> 197;
                case 184 -> 103;
                case 185 -> 222;
                case 186 -> 247;
                case 187 -> 53;
                case 188 -> 54;
                case 189 -> 113;
                case 190 -> 107;
                case 191 -> 210;
                case 192 -> 207;
                case 193 -> 176;
                case 194 -> 31;
                case 195 -> 3;
                case 196 -> 214;
                case 197 -> 18;
                case 198 -> 152;
                case 199 -> 243;
                case 200 -> 175;
                case 201 -> 93;
                case 202 -> 204;
                case 203 -> 180;
                case 204 -> 223;
                case 205 -> 254;
                case 206 -> 156;
                case 207 -> 193;
                case 208 -> 231;
                case 209 -> 238;
                case 210 -> 167;
                case 211 -> 118;
                case 212 -> 245;
                case 213 -> 125;
                case 214 -> 84;
                case 215 -> 149;
                case 216 -> 6;
                case 217 -> 213;
                case 218 -> 72;
                case 219 -> 148;
                case 220 -> 47;
                case 221 -> 82;
                case 222 -> 174;
                case 223 -> 224;
                case 224 -> 185;
                case 225 -> 120;
                case 226 -> 13;
                case 227 -> 128;
                case 228 -> 192;
                case 229 -> 250;
                case 230 -> 20;
                case 231 -> 64;
                case 232 -> 32;
                case 233 -> 164;
                case 234 -> 234;
                case 235 -> 4;
                case 236 -> 63;
                case 237 -> 246;
                case 238 -> 136;
                case 239 -> 83;
                case 240 -> 10;
                case 241 -> 2;
                case 242 -> 239;
                case 243 -> 60;
                case 244 -> 61;
                case 245 -> 102;
                case 246 -> 90;
                case 247 -> 181;
                case 248 -> 96;
                case 249 -> 38;
                case 250 -> 57;
                case 251 -> 209;
                case 252 -> 51;
                case 253 -> 115;
                case 254 -> 28;
                default -> 188;
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
            RenderVImpl.strArr_1[n3] = new String(charArray).intern();
        }
        return RenderVImpl.strArr_1[n3];
    }
}
