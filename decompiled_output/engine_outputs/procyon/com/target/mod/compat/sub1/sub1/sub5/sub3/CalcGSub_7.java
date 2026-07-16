// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_638;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub_7 extends AbstractLoadF
{
    private final RenderASub bindK;
    private int intValue;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_7() {
        super(createString(20899, 7633), createString(20897, -25193), Initializer.stepF);
        this.bindK = new RenderASub(createString(20898, -6189), 100.0, 20.0, 600.0, 10.0);
        this.intValue = 0;
        this.setRenderaarr(this.bindK);
    }
    
    @Override
    public void execute() {
        this.intValue = 0;
    }
    
    @Override
    public void execute_1() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        final class_310 class310 = CalcGSub_7.class310;
        if (stringarrArray != null) {
            if (class310.field_1724 == null) {
                return;
            }
            final class_310 class311 = CalcGSub_7.class310;
        }
        Object o;
        final class_638 class_638 = (class_638)(o = class310.field_1687);
        if (stringarrArray != null) {
            if (class_638 == null) {
                return;
            }
            ++this.intValue;
            o = ((AbstractSyncA<Object>)this.bindK).getValue();
        }
        final int n = (int)(double)o;
        CalcGSub_7 calcGSub_7 = this;
        if (stringarrArray != null) {
            if (this.intValue < n) {
                return;
            }
            calcGSub_7 = this;
        }
        calcGSub_7.intValue = 0;
        final float method_36454 = CalcGSub_7.class310.field_1724.method_36454();
        final float method_36455 = CalcGSub_7.class310.field_1724.method_36455();
        final float n2 = (float)(Math.random() * 10.0 - 5.0);
        final float n3 = (float)(Math.random() * 10.0 - 5.0);
        final float n4 = method_36454 + n2;
        final float method_36456 = class_3532.method_15363(method_36455 + n3, -90.0f, 90.0f);
        CalcGSub_7.class310.field_1724.method_36456(n4);
        CalcGSub_7.class310.field_1724.method_36457(method_36456);
    }
    
    @Override
    public void execute_2() {
        this.intValue = 0;
    }
    
    static {
        final String[] strArr2 = new String[3];
        int n = 0;
        final String s;
        final int length = (s = "\u00e7J\u00d7B\u00cbP\u00d9\b05$¡\u0086\u0091\u000f\u00e9B·\u00c9\u00ff²\u00d9\u009a\u0004\u008c)\u00c3¯\u00d1M\u0005\u00f0\u0016y¡\u0007o%E\u00f4\u001d¿d\u0088!t5Q\u00e9\u00eb\u00ff]®\u0099¤U=3\u00ef\u000b¬\u00f9\u0014\u00e8\u0096»\u0096L\u0007\u00c6NVhF\u008cµs\u00cc\u008fQ³\u0084s").length();
        int char1 = 7;
        int index = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 102);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0200: {
                        if (length2 > 1) {
                            break Label_0200;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 38;
                                case 1 -> 112;
                                case 2 -> 88;
                                case 3 -> 101;
                                case 4 -> 43;
                                case 5 -> 28;
                                default -> 77;
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
        strArr_1 = new String[3];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x51A3) & 0xFFFF;
        if (CalcGSub_7.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_7.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 182;
                case 1 -> 239;
                case 2 -> 246;
                case 3 -> 104;
                case 4 -> 198;
                case 5 -> 53;
                case 6 -> 77;
                case 7 -> 100;
                case 8 -> 32;
                case 9 -> 220;
                case 10 -> 59;
                case 11 -> 99;
                case 12 -> 168;
                case 13 -> 130;
                case 14 -> 118;
                case 15 -> 108;
                case 16 -> 65;
                case 17 -> 201;
                case 18 -> 236;
                case 19 -> 230;
                case 20 -> 146;
                case 21 -> 178;
                case 22 -> 223;
                case 23 -> 173;
                case 24 -> 136;
                case 25 -> 31;
                case 26 -> 76;
                case 27 -> 106;
                case 28 -> 120;
                case 29 -> 79;
                case 30 -> 41;
                case 31 -> 13;
                case 32 -> 115;
                case 33 -> 111;
                case 34 -> 37;
                case 35 -> 87;
                case 36 -> 58;
                case 37 -> 128;
                case 38 -> 84;
                case 39 -> 192;
                case 40 -> 184;
                case 41 -> 221;
                case 42 -> 0;
                case 43 -> 54;
                case 44 -> 179;
                case 45 -> 228;
                case 46 -> 211;
                case 47 -> 248;
                case 48 -> 117;
                case 49 -> 124;
                case 50 -> 143;
                case 51 -> 12;
                case 52 -> 131;
                case 53 -> 238;
                case 54 -> 251;
                case 55 -> 91;
                case 56 -> 30;
                case 57 -> 28;
                case 58 -> 190;
                case 59 -> 88;
                case 60 -> 161;
                case 61 -> 113;
                case 62 -> 38;
                case 63 -> 243;
                case 64 -> 144;
                case 65 -> 105;
                case 66 -> 242;
                case 67 -> 152;
                case 68 -> 227;
                case 69 -> 141;
                case 70 -> 122;
                case 71 -> 8;
                case 72 -> 70;
                case 73 -> 103;
                case 74 -> 33;
                case 75 -> 75;
                case 76 -> 109;
                case 77 -> 45;
                case 78 -> 135;
                case 79 -> 253;
                case 80 -> 29;
                case 81 -> 133;
                case 82 -> 212;
                case 83 -> 160;
                case 84 -> 94;
                case 85 -> 17;
                case 86 -> 222;
                case 87 -> 181;
                case 88 -> 200;
                case 89 -> 125;
                case 90 -> 89;
                case 91 -> 49;
                case 92 -> 172;
                case 93 -> 36;
                case 94 -> 215;
                case 95 -> 43;
                case 96 -> 234;
                case 97 -> 5;
                case 98 -> 11;
                case 99 -> 90;
                case 100 -> 92;
                case 101 -> 69;
                case 102 -> 217;
                case 103 -> 199;
                case 104 -> 86;
                case 105 -> 119;
                case 106 -> 1;
                case 107 -> 7;
                case 108 -> 24;
                case 109 -> 107;
                case 110 -> 60;
                case 111 -> 180;
                case 112 -> 154;
                case 113 -> 80;
                case 114 -> 162;
                case 115 -> 195;
                case 116 -> 3;
                case 117 -> 137;
                case 118 -> 2;
                case 119 -> 237;
                case 120 -> 219;
                case 121 -> 127;
                case 122 -> 255;
                case 123 -> 189;
                case 124 -> 9;
                case 125 -> 210;
                case 126 -> 149;
                case 127 -> 101;
                case 128 -> 112;
                case 129 -> 93;
                case 130 -> 231;
                case 131 -> 27;
                case 132 -> 206;
                case 133 -> 96;
                case 134 -> 20;
                case 135 -> 218;
                case 136 -> 74;
                case 137 -> 132;
                case 138 -> 203;
                case 139 -> 52;
                case 140 -> 196;
                case 141 -> 40;
                case 142 -> 63;
                case 143 -> 138;
                case 144 -> 55;
                case 145 -> 245;
                case 146 -> 247;
                case 147 -> 78;
                case 148 -> 194;
                case 149 -> 4;
                case 150 -> 155;
                case 151 -> 50;
                case 152 -> 142;
                case 153 -> 214;
                case 154 -> 191;
                case 155 -> 22;
                case 156 -> 98;
                case 157 -> 62;
                case 158 -> 110;
                case 159 -> 232;
                case 160 -> 186;
                case 161 -> 21;
                case 162 -> 46;
                case 163 -> 35;
                case 164 -> 244;
                case 165 -> 67;
                case 166 -> 139;
                case 167 -> 235;
                case 168 -> 61;
                case 169 -> 48;
                case 170 -> 147;
                case 171 -> 97;
                case 172 -> 71;
                case 173 -> 51;
                case 174 -> 233;
                case 175 -> 157;
                case 176 -> 208;
                case 177 -> 164;
                case 178 -> 121;
                case 179 -> 140;
                case 180 -> 68;
                case 181 -> 183;
                case 182 -> 169;
                case 183 -> 158;
                case 184 -> 207;
                case 185 -> 126;
                case 186 -> 171;
                case 187 -> 19;
                case 188 -> 151;
                case 189 -> 167;
                case 190 -> 26;
                case 191 -> 166;
                case 192 -> 81;
                case 193 -> 148;
                case 194 -> 174;
                case 195 -> 188;
                case 196 -> 252;
                case 197 -> 73;
                case 198 -> 116;
                case 199 -> 170;
                case 200 -> 10;
                case 201 -> 16;
                case 202 -> 83;
                case 203 -> 165;
                case 204 -> 225;
                case 205 -> 175;
                case 206 -> 23;
                case 207 -> 150;
                case 208 -> 66;
                case 209 -> 204;
                case 210 -> 250;
                case 211 -> 209;
                case 212 -> 213;
                case 213 -> 202;
                case 214 -> 134;
                case 215 -> 102;
                case 216 -> 95;
                case 217 -> 42;
                case 218 -> 18;
                case 219 -> 44;
                case 220 -> 177;
                case 221 -> 159;
                case 222 -> 56;
                case 223 -> 64;
                case 224 -> 205;
                case 225 -> 254;
                case 226 -> 72;
                case 227 -> 123;
                case 228 -> 34;
                case 229 -> 57;
                case 230 -> 145;
                case 231 -> 129;
                case 232 -> 153;
                case 233 -> 14;
                case 234 -> 241;
                case 235 -> 82;
                case 236 -> 85;
                case 237 -> 25;
                case 238 -> 224;
                case 239 -> 249;
                case 240 -> 114;
                case 241 -> 176;
                case 242 -> 216;
                case 243 -> 197;
                case 244 -> 15;
                case 245 -> 226;
                case 246 -> 39;
                case 247 -> 240;
                case 248 -> 229;
                case 249 -> 163;
                case 250 -> 156;
                case 251 -> 187;
                case 252 -> 193;
                case 253 -> 185;
                case 254 -> 6;
                default -> 47;
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
            CalcGSub_7.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_7.strArr_1[n3];
    }
}
