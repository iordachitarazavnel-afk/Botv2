// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;
import java.util.Arrays;
import java.security.SecureRandom;

public class AutoCloseableImpl implements AutoCloseable, CharSequence
{
    private static final SecureRandom secureRandom;
    private final char[] charArray;
    private final char[] charArray_1;
    private final int intValue;
    private boolean boolFlag;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public AutoCloseableImpl(final String s) {
        this.boolFlag = false;
        if (s == null) {
            throw new IllegalArgumentException(createString(-18028, 21562));
        }
        this.intValue = s.length();
        this.charArray = computeChararr(Math.min(this.intValue, 128));
        this.charArray_1 = new char[this.intValue];
        s.getChars(0, this.intValue, this.charArray_1, 0);
        processAll(this.charArray_1, this.charArray, 0, this.intValue);
    }
    
    private AutoCloseableImpl(final char[] original, final char[] original2) {
        this.boolFlag = false;
        this.intValue = original.length;
        this.charArray_1 = Arrays.copyOf(original, original.length);
        this.charArray = Arrays.copyOf(original2, original2.length);
    }
    
    public static AutoCloseableImpl computeParsem(final String s) {
        return new AutoCloseableImpl(s);
    }
    
    private static char[] computeChararr(final int n) {
        final char[] array = new char[n];
        int i = 0;
        try {
            while (i < n) {
                array[i] = (char)AutoCloseableImpl.secureRandom.nextInt(65536);
                ++i;
            }
        }
        catch (final IllegalArgumentException ex) {
            throw computeIllegalargumentexception(ex);
        }
        return array;
    }
    
    private static void processAll(final char[] array, final char[] array2, final int n, final int n2) {
        int i = 0;
        try {
            while (i < n2) {
                final int n3 = n + i;
                array[n3] ^= array2[i % array2.length];
                ++i;
            }
        }
        catch (final IllegalArgumentException ex) {
            throw computeIllegalargumentexception(ex);
        }
    }
    
    @Override
    public int length() {
        this.execute();
        return this.intValue;
    }
    
    @Override
    public char charAt(final int n) {
        Label_0023: {
            try {
                this.execute();
                if (n < 0) {
                    throw new IndexOutOfBoundsException(createString(-18029, -6994) + n + createString(-18025, 32137) + this.intValue);
                }
                final int n2 = n;
                final AutoCloseableImpl autoCloseableImpl = this;
                final int n3 = autoCloseableImpl.intValue;
                if (n2 < n3) {
                    break Label_0023;
                }
                throw new IndexOutOfBoundsException(createString(-18029, -6994) + n + createString(-18025, 32137) + this.intValue);
            }
            catch (final IllegalArgumentException ex) {
                throw computeIllegalargumentexception(ex);
            }
            try {
                final int n2 = n;
                final AutoCloseableImpl autoCloseableImpl = this;
                final int n3 = autoCloseableImpl.intValue;
                if (n2 < n3) {
                    return (char)(this.charArray_1[n] ^ this.charArray[n % this.charArray.length]);
                }
            }
            catch (final IllegalArgumentException ex2) {
                throw computeIllegalargumentexception(ex2);
            }
        }
        throw new IndexOutOfBoundsException(createString(-18029, -6994) + n + createString(-18025, 32137) + this.intValue);
    }
    
    @NotNull
    @Override
    public CharSequence subSequence(final int n, final int n2) {
        final int int1 = Initializer_21.getInt();
        this.execute();
        final int n3 = int1;
        int n4 = 0;
        int intValue = 0;
        Label_0107: {
            Label_0065: {
                int n5 = 0;
                int n8 = 0;
                Label_0051: {
                    Label_0042: {
                        int n6 = 0;
                        int n7 = 0;
                        Label_0024: {
                            try {
                                n4 = n;
                                n5 = n;
                                n6 = n;
                                if (n3 != 0) {
                                    break Label_0024;
                                }
                                if (n < 0) {
                                    break Label_0065;
                                }
                            }
                            catch (final IllegalArgumentException ex) {
                                throw computeIllegalargumentexception(ex);
                            }
                            n4 = n2;
                            n5 = n2;
                            n6 = n2;
                            try {
                                n7 = (n8 = (intValue = this.intValue));
                                if (n3 != 0) {
                                    break Label_0051;
                                }
                                if (n6 <= n7) {
                                    break Label_0042;
                                }
                                break Label_0065;
                            }
                            catch (final IllegalArgumentException ex2) {
                                throw computeIllegalargumentexception(ex2);
                            }
                        }
                        try {
                            if (n6 > n7) {
                                break Label_0065;
                            }
                            n4 = n;
                            n5 = n;
                            intValue = n2;
                            n8 = n2;
                        }
                        catch (final IllegalArgumentException ex3) {
                            throw computeIllegalargumentexception(ex3);
                        }
                    }
                    try {
                        if (n3 != 0) {
                            break Label_0107;
                        }
                        if (n5 > n8) {
                            break Label_0065;
                        }
                        break Label_0065;
                    }
                    catch (final IllegalArgumentException ex4) {
                        throw computeIllegalargumentexception(ex4);
                    }
                }
                try {
                    if (n5 > n8) {
                        throw new IndexOutOfBoundsException(createString(-18027, -14282) + n + createString(-18026, -14049) + n2);
                    }
                }
                catch (final IllegalArgumentException ex5) {
                    throw computeIllegalargumentexception(ex5);
                }
            }
            n4 = n2;
            intValue = n;
        }
        final int n9 = n4 - intValue;
        final char[] array = new char[n9];
        final char[] array2 = new char[n9];
        int i = 0;
        while (i < n9) {
            array[i] = this.charArray_1[n + i];
            array2[i] = this.charArray[(n + i) % this.charArray.length];
            ++i;
            if (n3 != 0) {
                break;
            }
        }
        return new AutoCloseableImpl(array, array2);
    }
    
    @NotNull
    @Override
    public String toString() {
        try {
            if (this.boolFlag) {
                return createString(-18031, 27743);
            }
        }
        catch (final IllegalArgumentException ex) {
            throw computeIllegalargumentexception(ex);
        }
        final char[] array = new char[this.intValue];
        int i = 0;
        try {
            while (i < this.intValue) {
                array[i] = this.charAt(i);
                ++i;
            }
        }
        catch (final IllegalArgumentException ex2) {
            throw computeIllegalargumentexception(ex2);
        }
        final String s = new String(array);
        Arrays.fill(array, '\0');
        return s;
    }
    
    public class_2561 getClass_2561() {
        return class_2561.method_30163(this.toString());
    }
    
    @Override
    public void close() {
        try {
            if (!this.boolFlag) {
                Arrays.fill(this.charArray_1, '\0');
                Arrays.fill(this.charArray, '\0');
                this.boolFlag = true;
            }
        }
        catch (final IllegalArgumentException ex) {
            throw computeIllegalargumentexception(ex);
        }
    }
    
    private void execute() {
        try {
            if (this.boolFlag) {
                throw new IllegalStateException(createString(-18030, -3917));
            }
        }
        catch (final IllegalArgumentException ex) {
            throw computeIllegalargumentexception(ex);
        }
    }
    
    static {
        final String[] strArr2 = new String[7];
        int n = 0;
        String s;
        int n2 = (s = "\u0083·\u00ees¿'e[HU\u0004{e_²\u000fª\u000f8\u00e7\u001a?\u0083\u00df\u00ce\u00c5O[\u00c8\u009f¬\u001b \u0099\u007f!,8I\u000bb\u0089\u00da\u00db?\u00d6\u00fe\u009f\u0087\u00fb\u00ee:\u0000Z*\u0097\u00d0\u00f4J\u0007I\fV\u0083\u0093d`").length();
        int n3 = 10;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 116));
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
                                    case 0 -> 69;
                                    case 1 -> 113;
                                    case 2 -> 41;
                                    case 3 -> 16;
                                    case 4 -> 22;
                                    case 5 -> 31;
                                    default -> 125;
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
                            n2 = (s = "\bT\u00df´o\u0016¡®¥\u001f\u00c7J§u \"¦\u00fcR-l²\u0010\u00e1\u0094\u0006\\p¿w\u00f6_").length();
                            n3 = 25;
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
                    n5 = (n6 = (n7 = (n8 = 55)));
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
        secureRandom = new SecureRandom();
    }
    
    private static IllegalArgumentException computeIllegalargumentexception(final IllegalArgumentException ex) {
        return ex;
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFB997) & 0xFFFF;
        if (AutoCloseableImpl.strArr_1[n3] == null) {
            final char[] charArray = AutoCloseableImpl.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 188;
                case 1 -> 201;
                case 2 -> 212;
                case 3 -> 229;
                case 4 -> 99;
                case 5 -> 208;
                case 6 -> 150;
                case 7 -> 172;
                case 8 -> 204;
                case 9 -> 224;
                case 10 -> 18;
                case 11 -> 186;
                case 12 -> 239;
                case 13 -> 152;
                case 14 -> 176;
                case 15 -> 36;
                case 16 -> 123;
                case 17 -> 179;
                case 18 -> 53;
                case 19 -> 64;
                case 20 -> 23;
                case 21 -> 220;
                case 22 -> 245;
                case 23 -> 213;
                case 24 -> 74;
                case 25 -> 77;
                case 26 -> 97;
                case 27 -> 45;
                case 28 -> 137;
                case 29 -> 134;
                case 30 -> 76;
                case 31 -> 111;
                case 32 -> 131;
                case 33 -> 79;
                case 34 -> 168;
                case 35 -> 217;
                case 36 -> 255;
                case 37 -> 26;
                case 38 -> 72;
                case 39 -> 251;
                case 40 -> 200;
                case 41 -> 184;
                case 42 -> 244;
                case 43 -> 82;
                case 44 -> 238;
                case 45 -> 223;
                case 46 -> 242;
                case 47 -> 31;
                case 48 -> 155;
                case 49 -> 112;
                case 50 -> 145;
                case 51 -> 180;
                case 52 -> 247;
                case 53 -> 61;
                case 54 -> 211;
                case 55 -> 50;
                case 56 -> 196;
                case 57 -> 165;
                case 58 -> 37;
                case 59 -> 169;
                case 60 -> 42;
                case 61 -> 195;
                case 62 -> 68;
                case 63 -> 164;
                case 64 -> 105;
                case 65 -> 115;
                case 66 -> 193;
                case 67 -> 33;
                case 68 -> 240;
                case 69 -> 108;
                case 70 -> 178;
                case 71 -> 25;
                case 72 -> 22;
                case 73 -> 70;
                case 74 -> 181;
                case 75 -> 102;
                case 76 -> 143;
                case 77 -> 128;
                case 78 -> 59;
                case 79 -> 170;
                case 80 -> 17;
                case 81 -> 94;
                case 82 -> 47;
                case 83 -> 160;
                case 84 -> 231;
                case 85 -> 67;
                case 86 -> 43;
                case 87 -> 29;
                case 88 -> 173;
                case 89 -> 236;
                case 90 -> 27;
                case 91 -> 234;
                case 92 -> 171;
                case 93 -> 159;
                case 94 -> 88;
                case 95 -> 144;
                case 96 -> 11;
                case 97 -> 243;
                case 98 -> 182;
                case 99 -> 197;
                case 100 -> 40;
                case 101 -> 156;
                case 102 -> 205;
                case 103 -> 39;
                case 104 -> 252;
                case 105 -> 127;
                case 106 -> 60;
                case 107 -> 35;
                case 108 -> 191;
                case 109 -> 81;
                case 110 -> 103;
                case 111 -> 202;
                case 112 -> 54;
                case 113 -> 5;
                case 114 -> 0;
                case 115 -> 52;
                case 116 -> 206;
                case 117 -> 142;
                case 118 -> 120;
                case 119 -> 56;
                case 120 -> 125;
                case 121 -> 91;
                case 122 -> 116;
                case 123 -> 15;
                case 124 -> 121;
                case 125 -> 225;
                case 126 -> 78;
                case 127 -> 28;
                case 128 -> 10;
                case 129 -> 140;
                case 130 -> 4;
                case 131 -> 101;
                case 132 -> 151;
                case 133 -> 122;
                case 134 -> 41;
                case 135 -> 65;
                case 136 -> 130;
                case 137 -> 85;
                case 138 -> 207;
                case 139 -> 106;
                case 140 -> 117;
                case 141 -> 199;
                case 142 -> 114;
                case 143 -> 92;
                case 144 -> 46;
                case 145 -> 98;
                case 146 -> 203;
                case 147 -> 133;
                case 148 -> 163;
                case 149 -> 166;
                case 150 -> 2;
                case 151 -> 248;
                case 152 -> 48;
                case 153 -> 162;
                case 154 -> 93;
                case 155 -> 100;
                case 156 -> 138;
                case 157 -> 124;
                case 158 -> 226;
                case 159 -> 216;
                case 160 -> 96;
                case 161 -> 75;
                case 162 -> 153;
                case 163 -> 177;
                case 164 -> 250;
                case 165 -> 158;
                case 166 -> 246;
                case 167 -> 228;
                case 168 -> 167;
                case 169 -> 222;
                case 170 -> 20;
                case 171 -> 110;
                case 172 -> 38;
                case 173 -> 55;
                case 174 -> 34;
                case 175 -> 12;
                case 176 -> 219;
                case 177 -> 62;
                case 178 -> 235;
                case 179 -> 80;
                case 180 -> 118;
                case 181 -> 221;
                case 182 -> 209;
                case 183 -> 194;
                case 184 -> 89;
                case 185 -> 147;
                case 186 -> 86;
                case 187 -> 21;
                case 188 -> 149;
                case 189 -> 57;
                case 190 -> 3;
                case 191 -> 237;
                case 192 -> 83;
                case 193 -> 241;
                case 194 -> 104;
                case 195 -> 189;
                case 196 -> 174;
                case 197 -> 49;
                case 198 -> 87;
                case 199 -> 132;
                case 200 -> 95;
                case 201 -> 19;
                case 202 -> 253;
                case 203 -> 90;
                case 204 -> 63;
                case 205 -> 7;
                case 206 -> 210;
                case 207 -> 214;
                case 208 -> 136;
                case 209 -> 249;
                case 210 -> 215;
                case 211 -> 126;
                case 212 -> 190;
                case 213 -> 73;
                case 214 -> 66;
                case 215 -> 227;
                case 216 -> 146;
                case 217 -> 107;
                case 218 -> 71;
                case 219 -> 254;
                case 220 -> 32;
                case 221 -> 14;
                case 222 -> 154;
                case 223 -> 183;
                case 224 -> 135;
                case 225 -> 185;
                case 226 -> 218;
                case 227 -> 192;
                case 228 -> 58;
                case 229 -> 24;
                case 230 -> 1;
                case 231 -> 69;
                case 232 -> 13;
                case 233 -> 6;
                case 234 -> 230;
                case 235 -> 51;
                case 236 -> 233;
                case 237 -> 141;
                case 238 -> 119;
                case 239 -> 84;
                case 240 -> 30;
                case 241 -> 109;
                case 242 -> 175;
                case 243 -> 161;
                case 244 -> 198;
                case 245 -> 113;
                case 246 -> 187;
                case 247 -> 44;
                case 248 -> 148;
                case 249 -> 129;
                case 250 -> 8;
                case 251 -> 139;
                case 252 -> 232;
                case 253 -> 16;
                case 254 -> 9;
                default -> 157;
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
            AutoCloseableImpl.strArr_1[n3] = new String(charArray).intern();
        }
        return AutoCloseableImpl.strArr_1[n3];
    }
}
