// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.Objects;
import net.minecraft.class_332;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;
import net.minecraft.class_327;
import net.minecraft.class_310;

public class Initializer_10
{
    private final int intValue = 500;
    private final class_310 class310;
    private final class_327 class327;
    private AbstractLoadF calcG;
    private long longValue;
    private boolean boolFlag;
    private int intValue_1;
    private int intValue_2;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_10() {
        this.class310 = class_310.method_1551();
        this.class327 = this.class310.field_1772;
        this.calcG = null;
        this.longValue = 0L;
        this.boolFlag = false;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
    }
    
    public void setIntAndInt(final int intValue_1, final int intValue_2) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.calcG != null && !this.boolFlag && currentTimeMillis - this.longValue > 500L) {
            this.boolFlag = true;
            this.intValue_1 = intValue_1;
            this.intValue_2 = intValue_2;
        }
        if (this.calcG == null) {
            this.boolFlag = false;
        }
    }
    
    public void processAll(final AbstractLoadF calcG, final int intValue_1, final int intValue_2) {
        if (this.calcG != calcG) {
            this.calcG = calcG;
            this.longValue = System.currentTimeMillis();
            this.boolFlag = false;
            this.intValue_1 = intValue_1;
            this.intValue_2 = intValue_2;
        }
    }
    
    public void execute() {
        this.calcG = null;
        this.boolFlag = false;
    }
    
    public void setClass_332AndFloat(final class_332 class_332, final float n) {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        Initializer_10 initializer_10 = this;
        if (intarrArray == null) {
            if (!this.boolFlag) {
                return;
            }
            initializer_10 = this;
        }
        final AbstractLoadF calcG = initializer_10.calcG;
        if (intarrArray == null) {
            if (calcG == null) {
                return;
            }
            final AbstractLoadF calcG2 = this.calcG;
        }
        final String string_1;
        String s = string_1 = calcG.getString_1();
        String trim = null;
        Label_0078: {
            Label_0071: {
                if (intarrArray == null) {
                    if (string_1 != null) {
                        trim = s.trim();
                        if (intarrArray != null) {
                            break Label_0078;
                        }
                        if (!trim.isEmpty()) {
                            break Label_0071;
                        }
                    }
                    createString(31541, 17750);
                }
                s = string_1;
            }
            this.calcG.getString();
        }
        final String s2 = trim;
        final int method_1727 = this.class327.method_1727(s2);
        List<String> list = this.createList(s, 250);
        final Stream<Object> stream = list.stream();
        final class_327 class327 = this.class327;
        Objects.requireNonNull(class327);
        final int max2;
        int max = max2 = Math.max(120, Math.max(method_1727, stream.mapToInt(class327::method_1727).max().orElse(0)) + 16);
        final int n2 = 250;
        if (intarrArray == null) {
            if (max2 < n2) {
                list = this.createList(s, max - 16);
                final Stream<Object> stream2 = list.stream();
                final class_327 class328 = this.class327;
                Objects.requireNonNull(class328);
                max = Math.max(120, Math.max(method_1727, stream2.mapToInt((ToIntFunction<? super Object>)class328::method_1727).max().orElse(0)) + 16);
            }
            final int n3 = 18 + list.size() * 10;
        }
        final int n4 = max2 + n2;
        int n5 = this.intValue_1 + 10;
        int n6 = this.intValue_2 - n4 - 5;
        final int method_1728 = this.class310.method_22683().method_4480();
        this.class310.method_22683().method_4507();
        int n9;
        int n8;
        final int n7 = n8 = (n9 = n5 + max);
        if (intarrArray == null) {
            if (n7 > method_1728) {
                n5 = this.intValue_1 - max - 10;
            }
            final int n10;
            n8 = (n10 = (n9 = n6));
        }
        if (intarrArray == null) {
            if (n7 < 0) {
                n6 = this.intValue_2 + 20;
            }
            n9 = (n8 = n5);
        }
        Label_0357: {
            if (intarrArray == null) {
                if (n8 >= 0) {
                    break Label_0357;
                }
                n9 = 5;
            }
            n5 = n9;
        }
        final float min = Math.min(1.0f, (System.currentTimeMillis() - (this.longValue + 500L)) / 150.0f);
        if (intarrArray == null) {
            if (min <= 0.0f) {
                return;
            }
            this.processAll_1(class_332, n5, n6, max, n4, s2, list, min, n);
        }
    }
    
    private void processAll_1(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final String s, final List<String> list, final float n5, final float n6) {
        final int n7 = 12;
        Initializer_1.processAll(class_332, n, n2, n3, n4, n7, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt_6(), n5 * 0.95f));
        this.processAll_2(class_332, n, n2, n3, n4, n7, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt_10(), n5 * 0.8f));
        class_332.method_51433(this.class327, s, n + 8, n2 + 4, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int_1(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt(), (int)(n5 * 255.0f)) | 0xFF000000, false);
        final int n8 = n2 + 16;
        class_332.method_25294(n + 8, n8, n + n3 - 8, n8 + 1, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt_11(), n5));
        final int n9 = com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int_1(-3355444, (int)(n5 * 255.0f)) | 0xFF000000;
        int n10 = n8 + 4;
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            class_332.method_51433(this.class327, (String)iterator.next(), n + 8, n10, n9, false);
            n10 += 10;
        }
    }
    
    private void processAll_2(final class_332 class_332, final int n, final int n2, final int a, final int b, int min, final int n3) {
        if (min <= 0) {
            class_332.method_25294(n, n2, n + a, n2 + 1, n3);
            class_332.method_25294(n, n2 + b - 1, n + a, n2 + b, n3);
            class_332.method_25294(n, n2, n + 1, n2 + b, n3);
            class_332.method_25294(n + a - 1, n2, n + a, n2 + b, n3);
            return;
        }
        min = Math.min(min, Math.min(a, b) / 2);
        class_332.method_25294(n + min, n2, n + a - min, n2 + 1, n3);
        class_332.method_25294(n + min, n2 + b - 1, n + a - min, n2 + b, n3);
        class_332.method_25294(n, n2 + min, n + 1, n2 + b - min, n3);
        class_332.method_25294(n + a - 1, n2 + min, n + a, n2 + b - min, n3);
        this.processAll_3(class_332, n, n2, min, n3, true, true);
        this.processAll_3(class_332, n + a - min, n2, min, n3, false, true);
        this.processAll_3(class_332, n, n2 + b - min, min, n3, true, false);
        this.processAll_3(class_332, n + a - min, n2 + b - min, min, n3, false, false);
    }
    
    private void processAll_3(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final boolean b, final boolean b2) {
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n3; ++j) {
                final double sqrt = Math.sqrt((n3 - i - 0.5) * (n3 - i - 0.5) + (n3 - j - 0.5) * (n3 - j - 0.5));
                if (sqrt >= n3 - 1 && sqrt <= n3) {
                    final int n5 = b ? (n + i) : (n + n3 - i - 1);
                    final int n6 = b2 ? (n2 + j) : (n2 + n3 - j - 1);
                    class_332.method_25294(n5, n6, n5 + 1, n6 + 1, n4);
                }
            }
        }
    }
    
    private List<String> createList(final String s, final int n) {
        if (s == null || s.trim().isEmpty()) {
            final ArrayList list = new ArrayList();
            list.add(createString(31543, 10063));
            return list;
        }
        int n2 = n - 16;
        if (n2 <= 0) {
            n2 = 100;
        }
        final String[] split = s.split(" ");
        final ArrayList list2 = new ArrayList();
        StringBuilder obj = new StringBuilder();
        final String[] array = split;
        for (int length = array.length, i = 0; i < length; ++i) {
            final String s2 = array[i];
            if (this.class327.method_1727((obj.length() == 0) ? s2 : (String.valueOf(obj) + " " + s2)) <= n2 || obj.length() == 0) {
                if (obj.length() > 0) {
                    obj.append(" ");
                }
                obj.append(s2);
            }
            else {
                list2.add(obj.toString());
                obj = new StringBuilder(s2);
                if (this.class327.method_1727(s2) > n2) {
                    obj = new StringBuilder(this.class327.method_27523(s2, n2 - this.class327.method_1727(createString(31540, 24843))) + createString(31542, 13069));
                }
            }
        }
        if (obj.length() > 0) {
            list2.add(obj.toString());
        }
        return list2.isEmpty() ? List.of(createString(31543, 10063)) : list2;
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    static {
        final String[] strArr2 = new String[4];
        int n = 0;
        String s;
        int n2 = (s = "\u00ec¨\u001c\u0018\u00e1\u00df\u00dfºq¹\u0095\u0013\u0019j´\u0091v\t'.\u00f2ND\u009d¼{{`").length();
        int n3 = 3;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 14));
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
                                    case 0 -> 70;
                                    case 1 -> 104;
                                    case 2 -> 67;
                                    case 3 -> 101;
                                    case 4 -> 108;
                                    case 5 -> 22;
                                    default -> 83;
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
                            n2 = (s = "\u00c0\b-\u0018}ª\u00f8 !N+Yz\u0097l\u009a\u00d9\u00dcf n;c\u0087\u00ec\u008c\u00c5*").length();
                            n3 = 3;
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
                    n5 = (n6 = (n7 = (n8 = 81)));
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
        final int n3 = (n ^ 0x7B34) & 0xFFFF;
        if (Initializer_10.strArr_1[n3] == null) {
            final char[] charArray = Initializer_10.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 123;
                case 1 -> 204;
                case 2 -> 112;
                case 3 -> 71;
                case 4 -> 45;
                case 5 -> 233;
                case 6 -> 75;
                case 7 -> 205;
                case 8 -> 185;
                case 9 -> 93;
                case 10 -> 48;
                case 11 -> 59;
                case 12 -> 150;
                case 13 -> 21;
                case 14 -> 67;
                case 15 -> 172;
                case 16 -> 240;
                case 17 -> 127;
                case 18 -> 28;
                case 19 -> 212;
                case 20 -> 106;
                case 21 -> 178;
                case 22 -> 192;
                case 23 -> 108;
                case 24 -> 188;
                case 25 -> 187;
                case 26 -> 16;
                case 27 -> 102;
                case 28 -> 73;
                case 29 -> 221;
                case 30 -> 32;
                case 31 -> 76;
                case 32 -> 57;
                case 33 -> 126;
                case 34 -> 168;
                case 35 -> 128;
                case 36 -> 90;
                case 37 -> 253;
                case 38 -> 196;
                case 39 -> 101;
                case 40 -> 251;
                case 41 -> 174;
                case 42 -> 191;
                case 43 -> 35;
                case 44 -> 109;
                case 45 -> 110;
                case 46 -> 40;
                case 47 -> 162;
                case 48 -> 120;
                case 49 -> 213;
                case 50 -> 50;
                case 51 -> 222;
                case 52 -> 92;
                case 53 -> 96;
                case 54 -> 247;
                case 55 -> 11;
                case 56 -> 148;
                case 57 -> 167;
                case 58 -> 122;
                case 59 -> 184;
                case 60 -> 53;
                case 61 -> 98;
                case 62 -> 190;
                case 63 -> 18;
                case 64 -> 136;
                case 65 -> 3;
                case 66 -> 151;
                case 67 -> 152;
                case 68 -> 115;
                case 69 -> 144;
                case 70 -> 254;
                case 71 -> 195;
                case 72 -> 219;
                case 73 -> 140;
                case 74 -> 155;
                case 75 -> 5;
                case 76 -> 179;
                case 77 -> 159;
                case 78 -> 24;
                case 79 -> 215;
                case 80 -> 234;
                case 81 -> 44;
                case 82 -> 30;
                case 83 -> 58;
                case 84 -> 118;
                case 85 -> 91;
                case 86 -> 154;
                case 87 -> 237;
                case 88 -> 97;
                case 89 -> 2;
                case 90 -> 39;
                case 91 -> 228;
                case 92 -> 63;
                case 93 -> 113;
                case 94 -> 248;
                case 95 -> 176;
                case 96 -> 158;
                case 97 -> 0;
                case 98 -> 33;
                case 99 -> 138;
                case 100 -> 69;
                case 101 -> 84;
                case 102 -> 61;
                case 103 -> 163;
                case 104 -> 64;
                case 105 -> 166;
                case 106 -> 43;
                case 107 -> 131;
                case 108 -> 230;
                case 109 -> 100;
                case 110 -> 99;
                case 111 -> 51;
                case 112 -> 203;
                case 113 -> 173;
                case 114 -> 246;
                case 115 -> 236;
                case 116 -> 227;
                case 117 -> 7;
                case 118 -> 104;
                case 119 -> 218;
                case 120 -> 241;
                case 121 -> 169;
                case 122 -> 37;
                case 123 -> 105;
                case 124 -> 125;
                case 125 -> 189;
                case 126 -> 12;
                case 127 -> 49;
                case 128 -> 142;
                case 129 -> 54;
                case 130 -> 224;
                case 131 -> 183;
                case 132 -> 133;
                case 133 -> 52;
                case 134 -> 14;
                case 135 -> 193;
                case 136 -> 6;
                case 137 -> 29;
                case 138 -> 141;
                case 139 -> 139;
                case 140 -> 244;
                case 141 -> 23;
                case 142 -> 46;
                case 143 -> 22;
                case 144 -> 103;
                case 145 -> 214;
                case 146 -> 117;
                case 147 -> 161;
                case 148 -> 232;
                case 149 -> 186;
                case 150 -> 55;
                case 151 -> 132;
                case 152 -> 245;
                case 153 -> 87;
                case 154 -> 36;
                case 155 -> 60;
                case 156 -> 242;
                case 157 -> 229;
                case 158 -> 182;
                case 159 -> 8;
                case 160 -> 15;
                case 161 -> 211;
                case 162 -> 206;
                case 163 -> 95;
                case 164 -> 129;
                case 165 -> 82;
                case 166 -> 201;
                case 167 -> 239;
                case 168 -> 210;
                case 169 -> 111;
                case 170 -> 25;
                case 171 -> 143;
                case 172 -> 27;
                case 173 -> 41;
                case 174 -> 194;
                case 175 -> 147;
                case 176 -> 42;
                case 177 -> 81;
                case 178 -> 19;
                case 179 -> 68;
                case 180 -> 80;
                case 181 -> 200;
                case 182 -> 217;
                case 183 -> 107;
                case 184 -> 220;
                case 185 -> 134;
                case 186 -> 175;
                case 187 -> 181;
                case 188 -> 145;
                case 189 -> 77;
                case 190 -> 255;
                case 191 -> 65;
                case 192 -> 10;
                case 193 -> 119;
                case 194 -> 130;
                case 195 -> 83;
                case 196 -> 171;
                case 197 -> 66;
                case 198 -> 156;
                case 199 -> 1;
                case 200 -> 34;
                case 201 -> 153;
                case 202 -> 31;
                case 203 -> 89;
                case 204 -> 146;
                case 205 -> 26;
                case 206 -> 17;
                case 207 -> 208;
                case 208 -> 238;
                case 209 -> 226;
                case 210 -> 4;
                case 211 -> 72;
                case 212 -> 209;
                case 213 -> 88;
                case 214 -> 177;
                case 215 -> 20;
                case 216 -> 137;
                case 217 -> 62;
                case 218 -> 86;
                case 219 -> 70;
                case 220 -> 116;
                case 221 -> 149;
                case 222 -> 79;
                case 223 -> 170;
                case 224 -> 223;
                case 225 -> 157;
                case 226 -> 252;
                case 227 -> 85;
                case 228 -> 243;
                case 229 -> 124;
                case 230 -> 114;
                case 231 -> 231;
                case 232 -> 198;
                case 233 -> 250;
                case 234 -> 135;
                case 235 -> 202;
                case 236 -> 94;
                case 237 -> 164;
                case 238 -> 160;
                case 239 -> 235;
                case 240 -> 13;
                case 241 -> 216;
                case 242 -> 47;
                case 243 -> 225;
                case 244 -> 9;
                case 245 -> 78;
                case 246 -> 121;
                case 247 -> 249;
                case 248 -> 165;
                case 249 -> 199;
                case 250 -> 38;
                case 251 -> 197;
                case 252 -> 180;
                case 253 -> 74;
                case 254 -> 56;
                default -> 207;
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
            Initializer_10.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_10.strArr_1[n3];
    }
}
