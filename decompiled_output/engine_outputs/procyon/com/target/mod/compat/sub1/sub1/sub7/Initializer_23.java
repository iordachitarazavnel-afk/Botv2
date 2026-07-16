// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_2561;
import net.minecraft.class_268;
import java.util.Iterator;
import java.util.Collection;
import net.minecraft.class_266;
import net.minecraft.class_269;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_9011;
import net.minecraft.class_8646;
import net.minecraft.class_310;

public class Initializer_23
{
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public static String getString() {
        final int int1 = Initializer_21.getInt();
        try {
            final class_310 method_1551 = class_310.method_1551();
            class_269 method_1552 = null;
            Label_0104: {
                Label_0097: {
                    Label_0077: {
                        class_638 class_315 = null;
                        Label_0066: {
                            class_638 class_314 = null;
                            Label_0049: {
                                class_310 class_312 = null;
                                Label_0041: {
                                    class_310 class_311 = null;
                                    Label_0024: {
                                        try {
                                            final class_310 class_310 = class_311 = (class_312 = method_1551);
                                            if (int1 != 0) {
                                                break Label_0024;
                                            }
                                            if (class_310 == null) {
                                                return "";
                                            }
                                        }
                                        catch (final Exception ex) {
                                            throw computeException(ex);
                                        }
                                        class_312 = (class_311 = method_1551);
                                        try {
                                            if (int1 != 0) {
                                                break Label_0049;
                                            }
                                            final class_746 class_313 = class_311.field_1724;
                                            if (class_313 != null) {
                                                break Label_0041;
                                            }
                                            return "";
                                        }
                                        catch (final Exception ex2) {
                                            throw computeException(ex2);
                                        }
                                    }
                                    try {
                                        final class_746 class_313 = class_311.field_1724;
                                        if (class_313 == null) {
                                            return "";
                                        }
                                        class_312 = method_1551;
                                    }
                                    catch (final Exception ex3) {
                                        throw computeException(ex3);
                                    }
                                }
                                try {
                                    class_314 = (class_315 = class_312.field_1687);
                                    if (int1 != 0) {
                                        break Label_0077;
                                    }
                                    if (class_314 != null) {
                                        break Label_0066;
                                    }
                                    return "";
                                }
                                catch (final Exception ex4) {
                                    throw computeException(ex4);
                                }
                            }
                            try {
                                if (class_314 == null) {
                                    return "";
                                }
                                class_315 = method_1551.field_1687;
                            }
                            catch (final Exception ex5) {
                                throw computeException(ex5);
                            }
                        }
                        try {
                            method_1552 = class_315.method_8428();
                            if (int1 != 0) {
                                break Label_0104;
                            }
                            if (method_1552 != null) {
                                break Label_0097;
                            }
                        }
                        catch (final Exception ex6) {
                            throw computeException(ex6);
                        }
                    }
                    return "";
                }
                method_1551.field_1687.method_8428();
            }
            final class_269 class_316 = method_1552;
            class_269 class_317 = null;
            Label_0123: {
                try {
                    class_317 = class_316;
                    if (int1 != 0) {
                        break Label_0123;
                    }
                    if (class_317 != null) {
                        break Label_0123;
                    }
                }
                catch (final Exception ex7) {
                    throw computeException(ex7);
                }
                return "";
            }
            final class_266 method_1553 = class_317.method_1189(class_8646.field_45157);
            if (method_1553 == null) {
                return "";
            }
            final StringBuilder sb = new StringBuilder();
            final Collection method_1554 = class_316.method_1184(method_1553);
            Collection collection = null;
            Label_0173: {
                try {
                    collection = method_1554;
                    if (int1 != 0) {
                        break Label_0173;
                    }
                    if (collection != null) {
                        break Label_0173;
                    }
                }
                catch (final Exception ex8) {
                    throw computeException(ex8);
                }
                return "";
            }
            for (final class_9011 class_318 : collection) {
                class_9011 class_319 = null;
                Label_0223: {
                    try {
                        class_319 = class_318;
                        if (int1 != 0) {
                            break Label_0223;
                        }
                        if (class_319 == null) {
                            continue;
                        }
                        break Label_0223;
                    }
                    catch (final Exception ex9) {
                        throw computeException(ex9);
                    }
                    continue;
                }
                final String comp_2127 = class_319.comp_2127();
                try {
                    if (comp_2127 == null) {
                        continue;
                    }
                }
                catch (final Exception ex10) {
                    throw computeException(ex10);
                }
                try {
                    final class_268 method_1555 = class_316.method_1164(comp_2127);
                    Label_0369: {
                        class_268 class_320 = null;
                        Label_0268: {
                            try {
                                class_320 = method_1555;
                                if (int1 != 0) {
                                    break Label_0268;
                                }
                                if (class_320 == null) {
                                    break Label_0369;
                                }
                            }
                            catch (final Exception ex11) {
                                throw computeException(ex11);
                            }
                        }
                        final class_2561 method_1556 = class_320.method_1144();
                        final class_2561 method_1557 = method_1555.method_1136();
                        Label_0365: {
                            Label_0345: {
                                Label_0298: {
                                    class_2561 class_321;
                                    try {
                                        class_321 = method_1556;
                                        if (int1 != 0) {
                                            break Label_0298;
                                        }
                                        if (class_321 == null) {
                                            break Label_0345;
                                        }
                                    }
                                    catch (final Exception ex12) {
                                        throw computeException(ex12);
                                    }
                                    try {
                                        if (class_321 == null) {
                                            break Label_0345;
                                        }
                                        final StringBuilder sb2 = sb;
                                        final class_2561 class_322 = method_1556;
                                        final String s = class_322.getString();
                                        final StringBuilder sb3 = sb2.append(s);
                                        final String s2 = comp_2127;
                                        final StringBuilder sb4 = sb3.append(s2);
                                        final class_2561 class_323 = method_1557;
                                        final String s3 = class_323.getString();
                                        final StringBuilder sb5 = sb4.append(s3);
                                        final String s4 = "\n";
                                        sb5.append(s4);
                                        final int n = int1;
                                        if (n != 0) {
                                            break Label_0345;
                                        }
                                        break Label_0365;
                                    }
                                    catch (final Exception ex13) {
                                        throw computeException(ex13);
                                    }
                                }
                                try {
                                    final StringBuilder sb2 = sb;
                                    final class_2561 class_322 = method_1556;
                                    final String s = class_322.getString();
                                    final StringBuilder sb3 = sb2.append(s);
                                    final String s2 = comp_2127;
                                    final StringBuilder sb4 = sb3.append(s2);
                                    final class_2561 class_323 = method_1557;
                                    final String s3 = class_323.getString();
                                    final StringBuilder sb5 = sb4.append(s3);
                                    final String s4 = "\n";
                                    sb5.append(s4);
                                    final int n = int1;
                                    if (n != 0) {
                                        sb.append(comp_2127).append("\n");
                                    }
                                }
                                catch (final Exception ex14) {
                                    throw computeException(ex14);
                                }
                            }
                            try {
                                if (int1 != 0) {
                                    sb.append(comp_2127).append("\n");
                                }
                            }
                            catch (final Exception ex15) {
                                throw computeException(ex15);
                            }
                        }
                    }
                }
                catch (final Exception ex16) {
                    sb.append(comp_2127).append("\n");
                }
                if (int1 != 0) {
                    break;
                }
            }
            return sb.toString();
        }
        catch (final Exception ex17) {
            return "";
        }
    }
    
    public static String getString_1() {
        final Matcher matcher = Pattern.compile(createString(25083, -15274)).matcher(getString());
        if (matcher.find()) {
            return matcher.group(1);
        }
        return String.valueOf(Initializer_27.getLong());
    }
    
    public static String getString_2() {
        final String string = getString();
        if (string.isEmpty()) {
            return "0";
        }
        final Matcher matcher = Pattern.compile(createString(25086, -22781), 2).matcher(string);
        if (matcher.find()) {
            return matcher.group(1).replace(",", "");
        }
        return "0";
    }
    
    public static String getString_3() {
        final Matcher matcher = Pattern.compile(createString(25082, 32587), 2).matcher(getString());
        if (matcher.find()) {
            return matcher.group(0).replaceFirst(createString(25080, 1784), "").trim();
        }
        return "";
    }
    
    public static String computeString(final boolean b) {
        final Matcher matcher = Pattern.compile(createString(25081, 3193)).matcher(getString().replaceAll(createString(25085, -5640), ""));
        if (matcher.find()) {
            final String trim = matcher.group(1).trim();
            if (!trim.isEmpty()) {
                return b ? createString(25087, 23477) : trim;
            }
        }
        return createString(25084, 28334);
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    static {
        final String[] strArr2 = new String[8];
        int n = 0;
        String s;
        int n2 = (s = "\u009e\u00db\u000f¯©¼|¶pdg\u00e3\u0099\u0087U\u00c6\u0080\u0087!0\u0090\u008c\u0094\u00eb\u00daK\u000b\u00da/#\u00e8_\u0089\u00de¡§/¼\rf`\u000f\u0081\u009c1<=¾\u0001\u0016\u00c0V\u001a\u00e9j\u00d6,\u009b\u0004»\u0004¡i\u00ffB¤U\u001b\u009e0\u00e9\u00fec\u00f4\u00cd\u00e2\u00c3aML\b\\\u0091s\u0019\u00ad:\u009a\u00ce3\u007f¡\u0093R§e\u00fc\u00fe+\u0091\u0004\u00fe~\u007f\u00e3¼¿\u009e\u0005\u009b\u00cf\u00f3 \u00eb\u00c5\u00fa¦\u00c5§\u001f\u00f9\u00d0´=\u00c5¦'«\u00e4\u00e0\u0006\u0086³w{\u00dfµ\u0084\u00c9\u00c8\u001bf\u0013,\u00ea\u008d\u00dd\u0002¢\u00e3t\u0002i\u0085j\u0007\u0005F\u0000\u0017u³").length();
        int n3 = 26;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 48));
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
                                    case 0 -> 79;
                                    case 1 -> 80;
                                    case 2 -> 88;
                                    case 3 -> 64;
                                    case 4 -> 79;
                                    case 5 -> 86;
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
                            n2 = (s = "\u009ebK~\u007f\u0002\u00db|").length();
                            n3 = 5;
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
                    n5 = (n6 = (n7 = (n8 = 19)));
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
        strArr_1 = new String[8];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x61FA) & 0xFFFF;
        if (Initializer_23.strArr_1[n3] == null) {
            final char[] charArray = Initializer_23.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 219;
                case 1 -> 92;
                case 2 -> 233;
                case 3 -> 109;
                case 4 -> 96;
                case 5 -> 194;
                case 6 -> 227;
                case 7 -> 88;
                case 8 -> 181;
                case 9 -> 74;
                case 10 -> 103;
                case 11 -> 129;
                case 12 -> 141;
                case 13 -> 126;
                case 14 -> 253;
                case 15 -> 250;
                case 16 -> 2;
                case 17 -> 124;
                case 18 -> 153;
                case 19 -> 201;
                case 20 -> 80;
                case 21 -> 247;
                case 22 -> 83;
                case 23 -> 6;
                case 24 -> 64;
                case 25 -> 199;
                case 26 -> 10;
                case 27 -> 68;
                case 28 -> 60;
                case 29 -> 248;
                case 30 -> 139;
                case 31 -> 17;
                case 32 -> 39;
                case 33 -> 38;
                case 34 -> 105;
                case 35 -> 249;
                case 36 -> 237;
                case 37 -> 156;
                case 38 -> 236;
                case 39 -> 176;
                case 40 -> 167;
                case 41 -> 206;
                case 42 -> 106;
                case 43 -> 87;
                case 44 -> 189;
                case 45 -> 31;
                case 46 -> 217;
                case 47 -> 132;
                case 48 -> 98;
                case 49 -> 235;
                case 50 -> 134;
                case 51 -> 125;
                case 52 -> 255;
                case 53 -> 196;
                case 54 -> 108;
                case 55 -> 66;
                case 56 -> 19;
                case 57 -> 75;
                case 58 -> 140;
                case 59 -> 128;
                case 60 -> 47;
                case 61 -> 54;
                case 62 -> 101;
                case 63 -> 226;
                case 64 -> 48;
                case 65 -> 182;
                case 66 -> 150;
                case 67 -> 25;
                case 68 -> 159;
                case 69 -> 223;
                case 70 -> 63;
                case 71 -> 81;
                case 72 -> 117;
                case 73 -> 99;
                case 74 -> 30;
                case 75 -> 147;
                case 76 -> 36;
                case 77 -> 79;
                case 78 -> 231;
                case 79 -> 165;
                case 80 -> 238;
                case 81 -> 212;
                case 82 -> 243;
                case 83 -> 122;
                case 84 -> 5;
                case 85 -> 70;
                case 86 -> 95;
                case 87 -> 203;
                case 88 -> 84;
                case 89 -> 241;
                case 90 -> 110;
                case 91 -> 145;
                case 92 -> 90;
                case 93 -> 120;
                case 94 -> 119;
                case 95 -> 183;
                case 96 -> 45;
                case 97 -> 58;
                case 98 -> 42;
                case 99 -> 221;
                case 100 -> 28;
                case 101 -> 197;
                case 102 -> 59;
                case 103 -> 130;
                case 104 -> 158;
                case 105 -> 115;
                case 106 -> 23;
                case 107 -> 170;
                case 108 -> 175;
                case 109 -> 246;
                case 110 -> 8;
                case 111 -> 78;
                case 112 -> 244;
                case 113 -> 55;
                case 114 -> 127;
                case 115 -> 69;
                case 116 -> 198;
                case 117 -> 49;
                case 118 -> 0;
                case 119 -> 164;
                case 120 -> 51;
                case 121 -> 76;
                case 122 -> 230;
                case 123 -> 179;
                case 124 -> 35;
                case 125 -> 224;
                case 126 -> 13;
                case 127 -> 34;
                case 128 -> 7;
                case 129 -> 185;
                case 130 -> 131;
                case 131 -> 186;
                case 132 -> 73;
                case 133 -> 50;
                case 134 -> 169;
                case 135 -> 216;
                case 136 -> 215;
                case 137 -> 121;
                case 138 -> 37;
                case 139 -> 191;
                case 140 -> 91;
                case 141 -> 208;
                case 142 -> 15;
                case 143 -> 72;
                case 144 -> 116;
                case 145 -> 151;
                case 146 -> 12;
                case 147 -> 46;
                case 148 -> 252;
                case 149 -> 157;
                case 150 -> 187;
                case 151 -> 184;
                case 152 -> 207;
                case 153 -> 1;
                case 154 -> 4;
                case 155 -> 89;
                case 156 -> 229;
                case 157 -> 41;
                case 158 -> 21;
                case 159 -> 204;
                case 160 -> 209;
                case 161 -> 113;
                case 162 -> 160;
                case 163 -> 166;
                case 164 -> 202;
                case 165 -> 93;
                case 166 -> 102;
                case 167 -> 254;
                case 168 -> 53;
                case 169 -> 251;
                case 170 -> 62;
                case 171 -> 146;
                case 172 -> 142;
                case 173 -> 32;
                case 174 -> 211;
                case 175 -> 148;
                case 176 -> 214;
                case 177 -> 97;
                case 178 -> 213;
                case 179 -> 168;
                case 180 -> 111;
                case 181 -> 82;
                case 182 -> 43;
                case 183 -> 162;
                case 184 -> 104;
                case 185 -> 61;
                case 186 -> 94;
                case 187 -> 9;
                case 188 -> 44;
                case 189 -> 52;
                case 190 -> 11;
                case 191 -> 190;
                case 192 -> 240;
                case 193 -> 143;
                case 194 -> 29;
                case 195 -> 77;
                case 196 -> 67;
                case 197 -> 232;
                case 198 -> 178;
                case 199 -> 18;
                case 200 -> 200;
                case 201 -> 3;
                case 202 -> 85;
                case 203 -> 114;
                case 204 -> 154;
                case 205 -> 56;
                case 206 -> 133;
                case 207 -> 220;
                case 208 -> 24;
                case 209 -> 137;
                case 210 -> 171;
                case 211 -> 136;
                case 212 -> 192;
                case 213 -> 239;
                case 214 -> 173;
                case 215 -> 193;
                case 216 -> 27;
                case 217 -> 33;
                case 218 -> 234;
                case 219 -> 22;
                case 220 -> 138;
                case 221 -> 210;
                case 222 -> 112;
                case 223 -> 222;
                case 224 -> 242;
                case 225 -> 161;
                case 226 -> 123;
                case 227 -> 135;
                case 228 -> 86;
                case 229 -> 118;
                case 230 -> 225;
                case 231 -> 16;
                case 232 -> 65;
                case 233 -> 218;
                case 234 -> 180;
                case 235 -> 188;
                case 236 -> 100;
                case 237 -> 174;
                case 238 -> 107;
                case 239 -> 163;
                case 240 -> 57;
                case 241 -> 26;
                case 242 -> 155;
                case 243 -> 177;
                case 244 -> 20;
                case 245 -> 152;
                case 246 -> 14;
                case 247 -> 71;
                case 248 -> 144;
                case 249 -> 228;
                case 250 -> 149;
                case 251 -> 195;
                case 252 -> 245;
                case 253 -> 205;
                case 254 -> 40;
                default -> 172;
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
            Initializer_23.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_23.strArr_1[n3];
    }
}
