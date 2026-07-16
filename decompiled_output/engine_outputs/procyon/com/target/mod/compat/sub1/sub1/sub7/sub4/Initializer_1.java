// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub4;

import java.io.OutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.net.URL;
import java.net.HttpURLConnection;

public class Initializer_1
{
    private final String strValue;
    private final String strValue_1;
    private String strValue_2;
    private String strValue_3;
    private String strValue_4;
    private static int intValue;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    private Initializer_1(final String strValue, final String strValue_1) {
        this.strValue = strValue;
        this.strValue_1 = strValue_1;
    }
    
    public Initializer_1 computeWrapb(final String strValue_2) {
        this.strValue_2 = strValue_2;
        this.strValue_3 = createString(27201, 19531);
        return this;
    }
    
    public Initializer_1 computeWrapb_1(final String strValue_2) {
        this.strValue_2 = strValue_2;
        this.strValue_3 = createString(27200, -16149);
        return this;
    }
    
    public Initializer_1 computeWrapb_2(final String s) {
        this.strValue_4 = createString(27203, -14732) + s;
        return this;
    }
    
    public <T> T computeObject(final Class<T> clazz) {
        final int int_1 = getInt_1();
        try {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(this.strValue_1).openConnection();
            HttpURLConnection httpURLConnection2 = null;
            Label_0231: {
                Label_0132: {
                    Label_0104: {
                        String strValue_4 = null;
                        Label_0090: {
                            Label_0062: {
                                String s;
                                try {
                                    httpURLConnection.setRequestMethod(this.strValue);
                                    httpURLConnection.setConnectTimeout(10000);
                                    httpURLConnection.setReadTimeout(10000);
                                    final String s2;
                                    s = (strValue_4 = (s2 = this.strValue_3));
                                    if (int_1 != 0) {
                                        break Label_0090;
                                    }
                                    if (s != null) {
                                        break Label_0062;
                                    }
                                    break Label_0062;
                                }
                                catch (final Throwable t) {
                                    throw computeThrowable(t);
                                }
                                try {
                                    if (s != null) {
                                        httpURLConnection.setRequestProperty(createString(27202, -16932), this.strValue_3);
                                    }
                                }
                                catch (final Throwable t2) {
                                    throw computeThrowable(t2);
                                }
                            }
                            String s2 = strValue_4 = this.strValue_4;
                            try {
                                if (int_1 != 0) {
                                    break Label_0132;
                                }
                                if (strValue_4 != null) {
                                    break Label_0104;
                                }
                                break Label_0104;
                            }
                            catch (final Throwable t3) {
                                throw computeThrowable(t3);
                            }
                        }
                        try {
                            if (strValue_4 != null) {
                                httpURLConnection.setRequestProperty(createString(27207, 5007), this.strValue_4);
                            }
                        }
                        catch (final Throwable t4) {
                            throw computeThrowable(t4);
                        }
                    }
                    String s2 = this.strValue_2;
                    try {
                        if (s2 == null) {
                            break Label_0231;
                        }
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection2 = httpURLConnection;
                        if (int_1 != 0) {
                            break Label_0231;
                        }
                    }
                    catch (final Throwable t5) {
                        throw computeThrowable(t5);
                    }
                }
                final OutputStream outputStream = httpURLConnection2.getOutputStream();
                try {
                    final byte[] bytes = this.strValue_2.getBytes(StandardCharsets.UTF_8);
                    outputStream.write(bytes, 0, bytes.length);
                    if (outputStream != null) {
                        outputStream.close();
                    }
                }
                catch (final Throwable t6) {
                    OutputStream outputStream2;
                    try {
                        outputStream2 = outputStream;
                        if (int_1 == 0) {
                            if (outputStream2 == null) {
                                throw t6;
                            }
                        }
                    }
                    catch (final Throwable t7) {
                        throw computeThrowable(t7);
                    }
                    try {
                        outputStream2.close();
                    }
                    catch (final Throwable exception) {
                        t6.addSuppressed(exception);
                    }
                    throw t6;
                }
            }
            final int responseCode = httpURLConnection2.getResponseCode();
            int n2 = 0;
            int n4 = 0;
            Label_0256: {
                int n;
                int n3;
                try {
                    n = (n2 = responseCode);
                    n3 = (n4 = 200);
                    if (int_1 != 0) {
                        break Label_0256;
                    }
                    if (n >= n3) {
                        break Label_0256;
                    }
                    return null;
                }
                catch (final Throwable t8) {
                    throw computeThrowable(t8);
                }
                try {
                    if (n < n3) {
                        return null;
                    }
                    n2 = responseCode;
                    n4 = 300;
                }
                catch (final Throwable t9) {
                    throw computeThrowable(t9);
                }
            }
            if (n2 < n4) {
                return (T)Initializer.gson.fromJson(new String(httpURLConnection.getInputStream().readAllBytes(), StandardCharsets.UTF_8), (Class)clazz);
            }
            return null;
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public static void setInt(final int intValue) {
        Initializer_1.intValue = intValue;
    }
    
    public static int getInt() {
        return Initializer_1.intValue;
    }
    
    public static int getInt_1() {
        if (getInt() == 0) {
            return 105;
        }
        return 0;
    }
    
    private static Throwable computeThrowable(final Throwable t) {
        return t;
    }
    
    static {
        final String[] strArr2 = new String[5];
        int n = 0;
        final int int1 = 28;
        String s;
        int n2 = (s = "\u00ccp³UZm\t\fy\u0011+4§\u009b\u00e2\u0089\u008f\u0081¿\u0007\u0010\f{\u00fd\u009d¬¸\u001b\u0018:\u00d7\u008dS\u00f1x\u0002\u0001").length();
        setInt(int1);
        int n3 = 7;
        int n4 = -1;
    Label_0027:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 7));
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
                        Label_0263: {
                            if (length > 1) {
                                break Label_0263;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 95;
                                    case 1 -> 58;
                                    case 2 -> 77;
                                    case 3 -> 64;
                                    case 4 -> 74;
                                    case 5 -> 102;
                                    default -> 5;
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
                                continue Label_0027;
                            }
                            n2 = (s = "`!7\u0091²~\u009f\u0087\u00edc0\u0082\u0013[Q®\u00c2\u00c6\u00e4\u00f1¨\u00e2>\u00ef\u009a\t\u00c4B\u0001¾M\u0097f\r\u00c1\u0014#\u0096²\u000bQ\u00145\u00c5%n@").length();
                            n3 = 33;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0027;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 36)));
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
        final int n3 = (n ^ 0x6A43) & 0xFFFF;
        if (Initializer_1.strArr_1[n3] == null) {
            final char[] charArray = Initializer_1.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 66;
                case 1 -> 210;
                case 2 -> 176;
                case 3 -> 216;
                case 4 -> 146;
                case 5 -> 77;
                case 6 -> 232;
                case 7 -> 115;
                case 8 -> 9;
                case 9 -> 36;
                case 10 -> 30;
                case 11 -> 43;
                case 12 -> 208;
                case 13 -> 92;
                case 14 -> 14;
                case 15 -> 82;
                case 16 -> 194;
                case 17 -> 251;
                case 18 -> 142;
                case 19 -> 42;
                case 20 -> 217;
                case 21 -> 195;
                case 22 -> 166;
                case 23 -> 226;
                case 24 -> 8;
                case 25 -> 127;
                case 26 -> 179;
                case 27 -> 113;
                case 28 -> 56;
                case 29 -> 27;
                case 30 -> 163;
                case 31 -> 78;
                case 32 -> 235;
                case 33 -> 122;
                case 34 -> 246;
                case 35 -> 67;
                case 36 -> 68;
                case 37 -> 104;
                case 38 -> 119;
                case 39 -> 1;
                case 40 -> 114;
                case 41 -> 63;
                case 42 -> 137;
                case 43 -> 159;
                case 44 -> 169;
                case 45 -> 49;
                case 46 -> 171;
                case 47 -> 227;
                case 48 -> 87;
                case 49 -> 101;
                case 50 -> 134;
                case 51 -> 93;
                case 52 -> 95;
                case 53 -> 123;
                case 54 -> 130;
                case 55 -> 183;
                case 56 -> 100;
                case 57 -> 211;
                case 58 -> 70;
                case 59 -> 76;
                case 60 -> 111;
                case 61 -> 34;
                case 62 -> 38;
                case 63 -> 214;
                case 64 -> 20;
                case 65 -> 4;
                case 66 -> 60;
                case 67 -> 75;
                case 68 -> 46;
                case 69 -> 65;
                case 70 -> 116;
                case 71 -> 151;
                case 72 -> 17;
                case 73 -> 73;
                case 74 -> 139;
                case 75 -> 112;
                case 76 -> 16;
                case 77 -> 128;
                case 78 -> 149;
                case 79 -> 117;
                case 80 -> 103;
                case 81 -> 138;
                case 82 -> 79;
                case 83 -> 205;
                case 84 -> 22;
                case 85 -> 203;
                case 86 -> 254;
                case 87 -> 154;
                case 88 -> 135;
                case 89 -> 215;
                case 90 -> 199;
                case 91 -> 243;
                case 92 -> 152;
                case 93 -> 233;
                case 94 -> 53;
                case 95 -> 162;
                case 96 -> 51;
                case 97 -> 3;
                case 98 -> 59;
                case 99 -> 141;
                case 100 -> 72;
                case 101 -> 237;
                case 102 -> 191;
                case 103 -> 150;
                case 104 -> 202;
                case 105 -> 32;
                case 106 -> 174;
                case 107 -> 204;
                case 108 -> 180;
                case 109 -> 188;
                case 110 -> 248;
                case 111 -> 200;
                case 112 -> 44;
                case 113 -> 126;
                case 114 -> 106;
                case 115 -> 197;
                case 116 -> 228;
                case 117 -> 33;
                case 118 -> 229;
                case 119 -> 165;
                case 120 -> 157;
                case 121 -> 15;
                case 122 -> 177;
                case 123 -> 71;
                case 124 -> 39;
                case 125 -> 212;
                case 126 -> 57;
                case 127 -> 10;
                case 128 -> 153;
                case 129 -> 231;
                case 130 -> 124;
                case 131 -> 187;
                case 132 -> 170;
                case 133 -> 31;
                case 134 -> 5;
                case 135 -> 247;
                case 136 -> 97;
                case 137 -> 242;
                case 138 -> 245;
                case 139 -> 23;
                case 140 -> 48;
                case 141 -> 50;
                case 142 -> 28;
                case 143 -> 186;
                case 144 -> 218;
                case 145 -> 182;
                case 146 -> 133;
                case 147 -> 19;
                case 148 -> 158;
                case 149 -> 255;
                case 150 -> 102;
                case 151 -> 61;
                case 152 -> 252;
                case 153 -> 58;
                case 154 -> 192;
                case 155 -> 29;
                case 156 -> 40;
                case 157 -> 184;
                case 158 -> 236;
                case 159 -> 206;
                case 160 -> 196;
                case 161 -> 147;
                case 162 -> 0;
                case 163 -> 26;
                case 164 -> 98;
                case 165 -> 120;
                case 166 -> 91;
                case 167 -> 74;
                case 168 -> 190;
                case 169 -> 168;
                case 170 -> 161;
                case 171 -> 160;
                case 172 -> 224;
                case 173 -> 207;
                case 174 -> 47;
                case 175 -> 209;
                case 176 -> 143;
                case 177 -> 136;
                case 178 -> 219;
                case 179 -> 83;
                case 180 -> 96;
                case 181 -> 129;
                case 182 -> 21;
                case 183 -> 52;
                case 184 -> 80;
                case 185 -> 241;
                case 186 -> 148;
                case 187 -> 193;
                case 188 -> 156;
                case 189 -> 239;
                case 190 -> 62;
                case 191 -> 230;
                case 192 -> 238;
                case 193 -> 105;
                case 194 -> 12;
                case 195 -> 84;
                case 196 -> 213;
                case 197 -> 132;
                case 198 -> 85;
                case 199 -> 198;
                case 200 -> 221;
                case 201 -> 185;
                case 202 -> 145;
                case 203 -> 144;
                case 204 -> 2;
                case 205 -> 99;
                case 206 -> 64;
                case 207 -> 45;
                case 208 -> 189;
                case 209 -> 7;
                case 210 -> 131;
                case 211 -> 125;
                case 212 -> 69;
                case 213 -> 11;
                case 214 -> 118;
                case 215 -> 173;
                case 216 -> 35;
                case 217 -> 222;
                case 218 -> 55;
                case 219 -> 240;
                case 220 -> 249;
                case 221 -> 37;
                case 222 -> 155;
                case 223 -> 140;
                case 224 -> 175;
                case 225 -> 181;
                case 226 -> 54;
                case 227 -> 24;
                case 228 -> 25;
                case 229 -> 89;
                case 230 -> 234;
                case 231 -> 250;
                case 232 -> 167;
                case 233 -> 88;
                case 234 -> 220;
                case 235 -> 253;
                case 236 -> 108;
                case 237 -> 13;
                case 238 -> 90;
                case 239 -> 109;
                case 240 -> 164;
                case 241 -> 223;
                case 242 -> 244;
                case 243 -> 178;
                case 244 -> 172;
                case 245 -> 201;
                case 246 -> 41;
                case 247 -> 110;
                case 248 -> 18;
                case 249 -> 81;
                case 250 -> 94;
                case 251 -> 121;
                case 252 -> 107;
                case 253 -> 225;
                case 254 -> 6;
                default -> 86;
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
            Initializer_1.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_1.strArr_1[n3];
    }
}
