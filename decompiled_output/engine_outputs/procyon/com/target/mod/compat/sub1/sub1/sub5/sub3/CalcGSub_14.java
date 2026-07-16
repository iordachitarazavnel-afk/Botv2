// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_1299;
import net.minecraft.class_1533;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import java.util.Collection;
import java.util.Iterator;
import net.minecraft.class_310;
import java.util.function.Predicate;
import net.minecraft.class_1531;
import java.util.HashSet;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import net.minecraft.class_1297;
import java.util.Set;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub_14 extends AbstractLoadF
{
    private final Set<class_1297> set;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_14() {
        super(createString(-27737, -5099), createString(-27738, -22185), Initializer.stepF);
        this.set = new HashSet<class_1297>();
    }
    
    @Override
    public void execute() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        class_310 class_311;
        final class_310 class_310 = class_311 = CalcGSub_14.class310;
        if (stringarrArray != null) {
            if (class_310.field_1687 == null) {
                return;
            }
            final class_310 class310;
            class_311 = (class310 = CalcGSub_14.class310);
        }
        if (stringarrArray != null) {
            if (class_310.field_1724 == null) {
                return;
            }
            class_311 = CalcGSub_14.class310;
        }
        for (final class_1297 class_312 : class_311.field_1687.method_18112()) {
            if (stringarrArray == null) {
                return;
            }
            final class_1297 class_313 = class_312;
            if (stringarrArray != null && class_313 == null) {
                continue;
            }
            boolean b2;
            final boolean b = b2 = class_313.method_31481();
            if (stringarrArray != null) {
                if (b) {
                    continue;
                }
                final boolean checkClass_1297;
                b2 = (checkClass_1297 = this.checkClass_1297(class_312));
            }
            Label_0189: {
                if (stringarrArray != null) {
                    if (b) {
                        final boolean contains = this.set.contains(class_312);
                        if (stringarrArray != null) {
                            if (contains) {
                                break Label_0189;
                            }
                            class_312.method_5648(true);
                            final boolean b3 = class_312 instanceof class_1531;
                        }
                        if (stringarrArray != null) {
                            if (contains) {
                                class_312.method_5648(true);
                            }
                            this.set.add(class_312);
                        }
                        if (stringarrArray != null) {
                            break Label_0189;
                        }
                    }
                    b2 = this.set.contains(class_312);
                }
                if (stringarrArray != null) {
                    if (b2) {
                        this.setClass_1297(class_312);
                        this.set.remove(class_312);
                    }
                }
            }
            if (stringarrArray == null) {
                break;
            }
        }
        this.set.removeIf(CalcGSub_14::lambda$onTick$0);
    }
    
    @Override
    public void execute_1() {
        for (final class_1297 class_1297 : new HashSet(this.set)) {
            if (class_1297 != null && !class_1297.method_31481() && Initializer_1.class310.field_1687 != null) {
                this.setClass_1297(class_1297);
            }
        }
        this.set.clear();
    }
    
    private void setClass_1297(final class_1297 class_1297) {
        if (class_1297 == null || class_1297.method_31481()) {
            return;
        }
        class_1297.method_5648(false);
        if (class_1297 instanceof class_1531) {
            class_1297.method_5648(false);
        }
    }
    
    private boolean checkClass_1297(final class_1297 class_1297) {
        if (class_1297 == null) {
            return false;
        }
        if (class_1297 instanceof class_1531) {
            return true;
        }
        if (class_1297 instanceof class_1533) {
            return true;
        }
        final class_1299 method_5864 = class_1297.method_5864();
        return method_5864 != null && (method_5864.equals(class_1299.field_6131) || method_5864.equals(class_1299.field_6043) || method_5864.equals(class_1299.field_28401) || method_5864.equals(class_1299.field_6126));
    }
    
    private static boolean lambda$onTick$0(final class_1297 class_1297) {
        return class_1297 == null || class_1297.method_31481();
    }
    
    static {
        final String[] strArr2 = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "i1V+\u00d4t\u00e9@4\u00cb\u00182}d\u00d6$\u0013\r¦\u00d83\u0096\u00d6/X\u00ddq]\u0092+\u00ee\u0091\u00c4¨&\u0016I\u0011%\u00f2\u00888\u0015H\u00c8\u00e2\u0002&\u00adpZ\u00e8'1\u009e\\zjR\u00d0\u00cb").length();
        int char1 = 8;
        int index = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 111);
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
                                case 0 -> 37;
                                case 1 -> 9;
                                case 2 -> 64;
                                case 3 -> 100;
                                case 4 -> 58;
                                case 5 -> 41;
                                default -> 9;
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
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFF93A7) & 0xFFFF;
        if (CalcGSub_14.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_14.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 58;
                case 1 -> 100;
                case 2 -> 117;
                case 3 -> 222;
                case 4 -> 103;
                case 5 -> 202;
                case 6 -> 249;
                case 7 -> 92;
                case 8 -> 35;
                case 9 -> 153;
                case 10 -> 86;
                case 11 -> 11;
                case 12 -> 72;
                case 13 -> 178;
                case 14 -> 39;
                case 15 -> 173;
                case 16 -> 64;
                case 17 -> 4;
                case 18 -> 169;
                case 19 -> 105;
                case 20 -> 174;
                case 21 -> 51;
                case 22 -> 56;
                case 23 -> 220;
                case 24 -> 29;
                case 25 -> 171;
                case 26 -> 123;
                case 27 -> 187;
                case 28 -> 192;
                case 29 -> 247;
                case 30 -> 199;
                case 31 -> 87;
                case 32 -> 250;
                case 33 -> 210;
                case 34 -> 97;
                case 35 -> 179;
                case 36 -> 66;
                case 37 -> 78;
                case 38 -> 231;
                case 39 -> 182;
                case 40 -> 128;
                case 41 -> 201;
                case 42 -> 16;
                case 43 -> 10;
                case 44 -> 207;
                case 45 -> 188;
                case 46 -> 145;
                case 47 -> 221;
                case 48 -> 46;
                case 49 -> 134;
                case 50 -> 25;
                case 51 -> 190;
                case 52 -> 63;
                case 53 -> 82;
                case 54 -> 191;
                case 55 -> 152;
                case 56 -> 164;
                case 57 -> 69;
                case 58 -> 170;
                case 59 -> 238;
                case 60 -> 146;
                case 61 -> 133;
                case 62 -> 101;
                case 63 -> 163;
                case 64 -> 226;
                case 65 -> 84;
                case 66 -> 215;
                case 67 -> 108;
                case 68 -> 113;
                case 69 -> 85;
                case 70 -> 65;
                case 71 -> 251;
                case 72 -> 233;
                case 73 -> 98;
                case 74 -> 155;
                case 75 -> 32;
                case 76 -> 2;
                case 77 -> 147;
                case 78 -> 62;
                case 79 -> 91;
                case 80 -> 154;
                case 81 -> 214;
                case 82 -> 186;
                case 83 -> 116;
                case 84 -> 175;
                case 85 -> 76;
                case 86 -> 197;
                case 87 -> 45;
                case 88 -> 26;
                case 89 -> 159;
                case 90 -> 204;
                case 91 -> 236;
                case 92 -> 70;
                case 93 -> 119;
                case 94 -> 59;
                case 95 -> 253;
                case 96 -> 255;
                case 97 -> 156;
                case 98 -> 13;
                case 99 -> 88;
                case 100 -> 80;
                case 101 -> 60;
                case 102 -> 209;
                case 103 -> 122;
                case 104 -> 118;
                case 105 -> 110;
                case 106 -> 19;
                case 107 -> 12;
                case 108 -> 50;
                case 109 -> 104;
                case 110 -> 234;
                case 111 -> 245;
                case 112 -> 6;
                case 113 -> 203;
                case 114 -> 74;
                case 115 -> 28;
                case 116 -> 5;
                case 117 -> 120;
                case 118 -> 246;
                case 119 -> 165;
                case 120 -> 183;
                case 121 -> 77;
                case 122 -> 149;
                case 123 -> 141;
                case 124 -> 93;
                case 125 -> 230;
                case 126 -> 107;
                case 127 -> 7;
                case 128 -> 177;
                case 129 -> 142;
                case 130 -> 140;
                case 131 -> 30;
                case 132 -> 162;
                case 133 -> 217;
                case 134 -> 223;
                case 135 -> 137;
                case 136 -> 43;
                case 137 -> 160;
                case 138 -> 208;
                case 139 -> 8;
                case 140 -> 129;
                case 141 -> 193;
                case 142 -> 33;
                case 143 -> 125;
                case 144 -> 112;
                case 145 -> 17;
                case 146 -> 126;
                case 147 -> 44;
                case 148 -> 121;
                case 149 -> 252;
                case 150 -> 79;
                case 151 -> 139;
                case 152 -> 240;
                case 153 -> 213;
                case 154 -> 151;
                case 155 -> 49;
                case 156 -> 218;
                case 157 -> 211;
                case 158 -> 224;
                case 159 -> 229;
                case 160 -> 31;
                case 161 -> 172;
                case 162 -> 225;
                case 163 -> 20;
                case 164 -> 124;
                case 165 -> 254;
                case 166 -> 71;
                case 167 -> 131;
                case 168 -> 158;
                case 169 -> 166;
                case 170 -> 196;
                case 171 -> 200;
                case 172 -> 127;
                case 173 -> 38;
                case 174 -> 75;
                case 175 -> 41;
                case 176 -> 115;
                case 177 -> 144;
                case 178 -> 227;
                case 179 -> 243;
                case 180 -> 212;
                case 181 -> 143;
                case 182 -> 18;
                case 183 -> 184;
                case 184 -> 239;
                case 185 -> 89;
                case 186 -> 135;
                case 187 -> 189;
                case 188 -> 99;
                case 189 -> 228;
                case 190 -> 3;
                case 191 -> 55;
                case 192 -> 40;
                case 193 -> 15;
                case 194 -> 9;
                case 195 -> 42;
                case 196 -> 194;
                case 197 -> 54;
                case 198 -> 61;
                case 199 -> 242;
                case 200 -> 241;
                case 201 -> 95;
                case 202 -> 90;
                case 203 -> 235;
                case 204 -> 168;
                case 205 -> 27;
                case 206 -> 198;
                case 207 -> 83;
                case 208 -> 0;
                case 209 -> 111;
                case 210 -> 161;
                case 211 -> 167;
                case 212 -> 24;
                case 213 -> 181;
                case 214 -> 96;
                case 215 -> 68;
                case 216 -> 22;
                case 217 -> 138;
                case 218 -> 185;
                case 219 -> 232;
                case 220 -> 150;
                case 221 -> 106;
                case 222 -> 132;
                case 223 -> 48;
                case 224 -> 67;
                case 225 -> 73;
                case 226 -> 21;
                case 227 -> 180;
                case 228 -> 81;
                case 229 -> 52;
                case 230 -> 94;
                case 231 -> 157;
                case 232 -> 53;
                case 233 -> 130;
                case 234 -> 34;
                case 235 -> 244;
                case 236 -> 136;
                case 237 -> 47;
                case 238 -> 109;
                case 239 -> 114;
                case 240 -> 237;
                case 241 -> 248;
                case 242 -> 23;
                case 243 -> 219;
                case 244 -> 36;
                case 245 -> 216;
                case 246 -> 102;
                case 247 -> 57;
                case 248 -> 195;
                case 249 -> 1;
                case 250 -> 206;
                case 251 -> 148;
                case 252 -> 37;
                case 253 -> 205;
                case 254 -> 14;
                default -> 176;
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
            CalcGSub_14.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_14.strArr_1[n3];
    }
}
