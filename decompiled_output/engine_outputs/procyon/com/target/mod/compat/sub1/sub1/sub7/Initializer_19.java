// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import java.nio.file.Path;
import java.nio.file.OpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import net.fabricmc.loader.api.FabricLoader;
import java.util.UUID;

public class Initializer_19
{
    private static final String strValue;
    private static UUID uUID;
    private static String strValue_1;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public static String getString() {
        final int int_1 = Initializer_21.getInt_1();
        Label_0028: {
            UUID uuid;
            try {
                uuid = Initializer_19.uUID;
                if (int_1 == 0) {
                    return uuid.toString();
                }
                if (uuid == null) {
                    break Label_0028;
                }
            }
            catch (final Exception ex) {
                throw computeException(ex);
            }
            final UUID uuid2 = Initializer_19.uUID;
            return uuid.toString();
        }
        final Path resolve = FabricLoader.getInstance().getConfigDir().resolve(Initializer_21.computeString(createString(6794, -30512)));
        final Path resolve2 = resolve.resolve(createString(6792, -27279));
        try {
            Label_0154: {
                Label_0127: {
                    boolean b2 = false;
                    Label_0108: {
                        Label_0092: {
                            boolean b;
                            try {
                                b = (b2 = Files.exists(resolve, new LinkOption[0]));
                                if (int_1 == 0) {
                                    break Label_0127;
                                }
                                if (!b) {
                                    break Label_0092;
                                }
                                break Label_0108;
                            }
                            catch (final Exception ex2) {
                                throw computeException(ex2);
                            }
                            try {
                                if (!b) {
                                    Files.createDirectories(resolve, (FileAttribute<?>[])new FileAttribute[0]);
                                }
                            }
                            catch (final Exception ex3) {
                                throw computeException(ex3);
                            }
                        }
                        try {
                            final Path path = resolve2;
                            if (int_1 == 0) {
                                return Initializer_19.uUID.toString();
                            }
                            b2 = Files.exists(path, new LinkOption[0]);
                        }
                        catch (final Exception ex4) {
                            throw computeException(ex4);
                        }
                    }
                    try {
                        if (!b2) {
                            break Label_0154;
                        }
                        final Path path2 = resolve2;
                        final String s = Files.readString(path2);
                        final String s2 = s.trim();
                        Initializer_19.uUID = UUID.fromString(s2);
                        final int n = int_1;
                        if (n == 0) {
                            break Label_0154;
                        }
                        return Initializer_19.uUID.toString();
                    }
                    catch (final Exception ex5) {
                        throw computeException(ex5);
                    }
                }
                try {
                    final Path path2 = resolve2;
                    final String s = Files.readString(path2);
                    final String s2 = s.trim();
                    Initializer_19.uUID = UUID.fromString(s2);
                    final int n = int_1;
                    if (n == 0) {
                        Initializer_19.uUID = UUID.randomUUID();
                        Files.writeString(resolve2, Initializer_19.uUID.toString(), new OpenOption[0]);
                    }
                }
                catch (final Exception ex6) {
                    throw computeException(ex6);
                }
            }
        }
        catch (final Exception ex7) {
            Initializer_19.uUID = UUID.randomUUID();
        }
        return Initializer_19.uUID.toString();
    }
    
    public static String getString_1() {
        if (Initializer_19.strValue_1 != null) {
            return Initializer_19.strValue_1;
        }
        return Initializer_19.strValue_1 = createString(6795, -31044);
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    static {
        final String[] strArr2 = new String[4];
        int n = 0;
        String s;
        int n2 = (s = "\u00eem\u00f0\u0001\u0000\u00db\u00eb5\" \u0087n«\u00c2\u0093k\u00dfI\ftGr(B\u00ed\u008eC\u00c2\u00c4\u00e9²").length();
        int n3 = 18;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 15));
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
                        Label_0271: {
                            if (length > 1) {
                                break Label_0271;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 78;
                                    case 1 -> 56;
                                    case 2 -> 46;
                                    case 3 -> 5;
                                    case 4 -> 85;
                                    case 5 -> 49;
                                    default -> 11;
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
                            n2 = (s = "\u009ez\u00d1|U\u00e7ª³P\u0089\r\u000b\u0097\u00cb\u00f0Jq!.k\u00c0\u0092\u001f").length();
                            n3 = 11;
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
                    n5 = (n6 = (n7 = (n8 = 103)));
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
        strValue = createString(6793, 28916);
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x1A8B) & 0xFFFF;
        if (Initializer_19.strArr_1[n3] == null) {
            final char[] charArray = Initializer_19.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 202;
                case 1 -> 34;
                case 2 -> 26;
                case 3 -> 63;
                case 4 -> 11;
                case 5 -> 131;
                case 6 -> 148;
                case 7 -> 244;
                case 8 -> 95;
                case 9 -> 110;
                case 10 -> 155;
                case 11 -> 115;
                case 12 -> 69;
                case 13 -> 45;
                case 14 -> 183;
                case 15 -> 75;
                case 16 -> 138;
                case 17 -> 210;
                case 18 -> 44;
                case 19 -> 67;
                case 20 -> 29;
                case 21 -> 185;
                case 22 -> 27;
                case 23 -> 225;
                case 24 -> 36;
                case 25 -> 147;
                case 26 -> 55;
                case 27 -> 106;
                case 28 -> 83;
                case 29 -> 253;
                case 30 -> 125;
                case 31 -> 94;
                case 32 -> 105;
                case 33 -> 59;
                case 34 -> 169;
                case 35 -> 19;
                case 36 -> 1;
                case 37 -> 121;
                case 38 -> 235;
                case 39 -> 191;
                case 40 -> 112;
                case 41 -> 213;
                case 42 -> 255;
                case 43 -> 217;
                case 44 -> 104;
                case 45 -> 248;
                case 46 -> 50;
                case 47 -> 33;
                case 48 -> 123;
                case 49 -> 145;
                case 50 -> 54;
                case 51 -> 229;
                case 52 -> 208;
                case 53 -> 87;
                case 54 -> 78;
                case 55 -> 21;
                case 56 -> 144;
                case 57 -> 129;
                case 58 -> 140;
                case 59 -> 98;
                case 60 -> 167;
                case 61 -> 178;
                case 62 -> 119;
                case 63 -> 230;
                case 64 -> 66;
                case 65 -> 227;
                case 66 -> 163;
                case 67 -> 194;
                case 68 -> 231;
                case 69 -> 2;
                case 70 -> 37;
                case 71 -> 38;
                case 72 -> 193;
                case 73 -> 175;
                case 74 -> 181;
                case 75 -> 113;
                case 76 -> 242;
                case 77 -> 60;
                case 78 -> 17;
                case 79 -> 233;
                case 80 -> 39;
                case 81 -> 3;
                case 82 -> 150;
                case 83 -> 142;
                case 84 -> 143;
                case 85 -> 32;
                case 86 -> 15;
                case 87 -> 88;
                case 88 -> 245;
                case 89 -> 132;
                case 90 -> 126;
                case 91 -> 216;
                case 92 -> 12;
                case 93 -> 204;
                case 94 -> 184;
                case 95 -> 141;
                case 96 -> 149;
                case 97 -> 128;
                case 98 -> 80;
                case 99 -> 247;
                case 100 -> 146;
                case 101 -> 103;
                case 102 -> 5;
                case 103 -> 62;
                case 104 -> 203;
                case 105 -> 226;
                case 106 -> 77;
                case 107 -> 205;
                case 108 -> 52;
                case 109 -> 116;
                case 110 -> 13;
                case 111 -> 57;
                case 112 -> 41;
                case 113 -> 224;
                case 114 -> 127;
                case 115 -> 187;
                case 116 -> 20;
                case 117 -> 102;
                case 118 -> 177;
                case 119 -> 22;
                case 120 -> 47;
                case 121 -> 189;
                case 122 -> 192;
                case 123 -> 97;
                case 124 -> 130;
                case 125 -> 154;
                case 126 -> 215;
                case 127 -> 122;
                case 128 -> 234;
                case 129 -> 56;
                case 130 -> 249;
                case 131 -> 82;
                case 132 -> 124;
                case 133 -> 40;
                case 134 -> 76;
                case 135 -> 238;
                case 136 -> 223;
                case 137 -> 190;
                case 138 -> 237;
                case 139 -> 218;
                case 140 -> 114;
                case 141 -> 35;
                case 142 -> 101;
                case 143 -> 111;
                case 144 -> 252;
                case 145 -> 7;
                case 146 -> 170;
                case 147 -> 243;
                case 148 -> 107;
                case 149 -> 79;
                case 150 -> 72;
                case 151 -> 173;
                case 152 -> 96;
                case 153 -> 86;
                case 154 -> 186;
                case 155 -> 153;
                case 156 -> 139;
                case 157 -> 180;
                case 158 -> 70;
                case 159 -> 81;
                case 160 -> 232;
                case 161 -> 109;
                case 162 -> 4;
                case 163 -> 152;
                case 164 -> 176;
                case 165 -> 222;
                case 166 -> 182;
                case 167 -> 18;
                case 168 -> 10;
                case 169 -> 91;
                case 170 -> 246;
                case 171 -> 108;
                case 172 -> 117;
                case 173 -> 200;
                case 174 -> 221;
                case 175 -> 30;
                case 176 -> 65;
                case 177 -> 188;
                case 178 -> 196;
                case 179 -> 135;
                case 180 -> 212;
                case 181 -> 136;
                case 182 -> 25;
                case 183 -> 48;
                case 184 -> 46;
                case 185 -> 90;
                case 186 -> 207;
                case 187 -> 201;
                case 188 -> 71;
                case 189 -> 236;
                case 190 -> 164;
                case 191 -> 166;
                case 192 -> 161;
                case 193 -> 137;
                case 194 -> 118;
                case 195 -> 73;
                case 196 -> 254;
                case 197 -> 241;
                case 198 -> 31;
                case 199 -> 120;
                case 200 -> 250;
                case 201 -> 174;
                case 202 -> 211;
                case 203 -> 240;
                case 204 -> 179;
                case 205 -> 100;
                case 206 -> 68;
                case 207 -> 206;
                case 208 -> 209;
                case 209 -> 61;
                case 210 -> 6;
                case 211 -> 239;
                case 212 -> 151;
                case 213 -> 9;
                case 214 -> 159;
                case 215 -> 220;
                case 216 -> 74;
                case 217 -> 251;
                case 218 -> 228;
                case 219 -> 16;
                case 220 -> 58;
                case 221 -> 42;
                case 222 -> 214;
                case 223 -> 84;
                case 224 -> 133;
                case 225 -> 93;
                case 226 -> 158;
                case 227 -> 156;
                case 228 -> 51;
                case 229 -> 0;
                case 230 -> 64;
                case 231 -> 160;
                case 232 -> 171;
                case 233 -> 53;
                case 234 -> 195;
                case 235 -> 198;
                case 236 -> 199;
                case 237 -> 165;
                case 238 -> 172;
                case 239 -> 28;
                case 240 -> 168;
                case 241 -> 134;
                case 242 -> 43;
                case 243 -> 23;
                case 244 -> 99;
                case 245 -> 85;
                case 246 -> 162;
                case 247 -> 14;
                case 248 -> 197;
                case 249 -> 24;
                case 250 -> 8;
                case 251 -> 89;
                case 252 -> 219;
                case 253 -> 157;
                case 254 -> 49;
                default -> 92;
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
            Initializer_19.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_19.strArr_1[n3];
    }
}
