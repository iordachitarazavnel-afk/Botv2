// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import java.util.Iterator;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_4;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;
import net.minecraft.class_2561;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;

public final class Initializer_5
{
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    private Initializer_5() {
    }
    
    public static void setString(final String s) {
        setString_3(getString() + createString(28800, 27454) + s);
    }
    
    public static void setString_1(final String s) {
        setString_3(getString() + createString(28802, -10318) + s);
    }
    
    public static void setString_2(final String s) {
        setString_3(getString() + createString(28805, -23057) + s);
    }
    
    private static void setString_3(final String s) {
        if (Initializer_1.class310 != null && Initializer_1.class310.field_1724 != null) {
            Initializer_1.class310.field_1724.method_7353((class_2561)class_2561.method_43470(s), false);
        }
    }
    
    private static String getString() {
        String s = getString_1();
        if (s == null || s.isEmpty()) {
            s = createString(28803, -8403);
        }
        return createString(28804, -26612) + s + createString(28806, 11429);
    }
    
    private static String getString_1() {
        final int int1 = Initializer_21.getInt();
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int n = int1;
        final StackTraceElement[] array = stackTrace;
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final String className = array[i].getClassName();
            Label_0092: {
                Label_0085: {
                    String s2 = null;
                    Label_0059: {
                        Label_0057: {
                            try {
                                final String className2;
                                final String s = s2 = (className2 = className);
                                if (n != 0) {
                                    break Label_0059;
                                }
                                if (s != null) {
                                    break Label_0057;
                                }
                            }
                            catch (final Throwable t) {
                                throw computeThrowable(t);
                            }
                            break Label_0092;
                        }
                        String className2 = s2 = className;
                        try {
                            if (n != 0) {
                                break Label_0092;
                            }
                            final int n2 = 28801;
                            final int n3 = -11429;
                            final String s3 = createString(n2, n3);
                            final boolean b = s2.startsWith(s3);
                            if (!b) {
                                break Label_0085;
                            }
                            break Label_0092;
                        }
                        catch (final Throwable t2) {
                            throw computeThrowable(t2);
                        }
                    }
                    try {
                        final int n2 = 28801;
                        final int n3 = -11429;
                        final String s3 = createString(n2, n3);
                        final boolean b = s2.startsWith(s3);
                        if (!b) {
                            break Label_0092;
                        }
                    }
                    catch (final Throwable t3) {
                        throw computeThrowable(t3);
                    }
                }
                try {
                    final String className2 = className;
                    final Class<?> forName = Class.forName(className2);
                    Label_0243: {
                        Class<?> clazz2 = null;
                        Label_0120: {
                            Class<AbstractLoadF> clazz;
                            try {
                                clazz = (Class<AbstractLoadF>)(clazz2 = AbstractLoadF.class);
                                if (n != 0) {
                                    break Label_0120;
                                }
                                final Class<?> clazz3 = forName;
                                final boolean b2 = clazz.isAssignableFrom(clazz3);
                                if (b2) {
                                    break Label_0120;
                                }
                                break Label_0243;
                            }
                            catch (final Throwable t4) {
                                throw computeThrowable(t4);
                            }
                            try {
                                final Class<?> clazz3 = forName;
                                final boolean b2 = clazz.isAssignableFrom(clazz3);
                                if (!b2) {
                                    break Label_0243;
                                }
                                clazz2 = forName;
                            }
                            catch (final Throwable t5) {
                                throw computeThrowable(t5);
                            }
                        }
                        final String simpleName = clazz2.getSimpleName();
                        Initializer_4 syncf = null;
                        Label_0154: {
                            try {
                                syncf = Initializer_1.getSyncf();
                                if (n != 0) {
                                    break Label_0154;
                                }
                                if (syncf == null) {
                                    return simpleName;
                                }
                            }
                            catch (final Throwable t6) {
                                throw computeThrowable(t6);
                            }
                            Initializer_1.getSyncf();
                        }
                        for (final AbstractLoadF abstractLoadF : syncf.getList()) {
                            Label_0236: {
                                AbstractLoadF abstractLoadF4 = null;
                                Label_0223: {
                                    AbstractLoadF abstractLoadF3 = null;
                                    Label_0204: {
                                        try {
                                            final AbstractLoadF abstractLoadF2 = abstractLoadF3 = (abstractLoadF4 = abstractLoadF);
                                            if (n != 0) {
                                                break Label_0204;
                                            }
                                            if (abstractLoadF2 == null) {
                                                break Label_0236;
                                            }
                                        }
                                        catch (final Throwable t7) {
                                            throw computeThrowable(t7);
                                        }
                                        abstractLoadF4 = (abstractLoadF3 = abstractLoadF);
                                        try {
                                            if (n != 0) {
                                                return abstractLoadF4.getString();
                                            }
                                            final Class<? extends AbstractLoadF> clazz4 = abstractLoadF3.getClass();
                                            final Class<? extends AbstractLoadF> clazz5 = (Class<? extends AbstractLoadF>)forName;
                                            if (clazz4 == clazz5) {
                                                break Label_0223;
                                            }
                                            break Label_0236;
                                        }
                                        catch (final Throwable t8) {
                                            throw computeThrowable(t8);
                                        }
                                    }
                                    try {
                                        final Class<? extends AbstractLoadF> clazz4 = abstractLoadF3.getClass();
                                        final Class<? extends AbstractLoadF> clazz5 = (Class<? extends AbstractLoadF>)forName;
                                        if (clazz4 != clazz5) {
                                            break Label_0236;
                                        }
                                        abstractLoadF4 = abstractLoadF;
                                    }
                                    catch (final Throwable t9) {
                                        throw computeThrowable(t9);
                                    }
                                }
                                return abstractLoadF4.getString();
                            }
                            if (n != 0) {
                                break;
                            }
                        }
                        return simpleName;
                    }
                }
                catch (final Throwable t10) {}
            }
            ++i;
            if (n != 0) {
                break;
            }
        }
        return null;
    }
    
    private static Throwable computeThrowable(final Throwable t) {
        return t;
    }
    
    static {
        final String[] strArr2 = new String[7];
        int n = 0;
        String s;
        int n2 = (s = "ª<\u0016l\u00ea?.T\u00fc\u00da]Lx¿¿5\u00ec¸¦\u00ef<N}\u00ec\u0098\u0002\u00fd\u00da\u0007\u008e\u00feLloa\n\t\u0002r\u0014\u0013\u00c6\u009fdru").length();
        int n3 = 2;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 18));
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
                                    case 0 -> 42;
                                    case 1 -> 42;
                                    case 2 -> 73;
                                    case 3 -> 10;
                                    case 4 -> 78;
                                    case 5 -> 85;
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
                                continue Label_0022;
                            }
                            n2 = (s = "Sm\u0005<\"\u009frH").length();
                            n3 = 2;
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
                    n5 = (n6 = (n7 = (n8 = 121)));
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
        final int n3 = (n ^ 0x7080) & 0xFFFF;
        if (Initializer_5.strArr_1[n3] == null) {
            final char[] charArray = Initializer_5.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 72;
                case 1 -> 161;
                case 2 -> 73;
                case 3 -> 143;
                case 4 -> 231;
                case 5 -> 105;
                case 6 -> 118;
                case 7 -> 23;
                case 8 -> 10;
                case 9 -> 171;
                case 10 -> 203;
                case 11 -> 131;
                case 12 -> 106;
                case 13 -> 26;
                case 14 -> 154;
                case 15 -> 37;
                case 16 -> 49;
                case 17 -> 70;
                case 18 -> 91;
                case 19 -> 50;
                case 20 -> 56;
                case 21 -> 98;
                case 22 -> 39;
                case 23 -> 138;
                case 24 -> 52;
                case 25 -> 212;
                case 26 -> 253;
                case 27 -> 237;
                case 28 -> 196;
                case 29 -> 169;
                case 30 -> 141;
                case 31 -> 139;
                case 32 -> 53;
                case 33 -> 244;
                case 34 -> 136;
                case 35 -> 71;
                case 36 -> 69;
                case 37 -> 32;
                case 38 -> 51;
                case 39 -> 134;
                case 40 -> 182;
                case 41 -> 238;
                case 42 -> 200;
                case 43 -> 159;
                case 44 -> 245;
                case 45 -> 184;
                case 46 -> 115;
                case 47 -> 108;
                case 48 -> 30;
                case 49 -> 233;
                case 50 -> 100;
                case 51 -> 215;
                case 52 -> 12;
                case 53 -> 234;
                case 54 -> 158;
                case 55 -> 193;
                case 56 -> 201;
                case 57 -> 67;
                case 58 -> 111;
                case 59 -> 210;
                case 60 -> 217;
                case 61 -> 19;
                case 62 -> 174;
                case 63 -> 15;
                case 64 -> 89;
                case 65 -> 227;
                case 66 -> 124;
                case 67 -> 150;
                case 68 -> 224;
                case 69 -> 236;
                case 70 -> 99;
                case 71 -> 194;
                case 72 -> 25;
                case 73 -> 125;
                case 74 -> 36;
                case 75 -> 123;
                case 76 -> 88;
                case 77 -> 62;
                case 78 -> 195;
                case 79 -> 113;
                case 80 -> 79;
                case 81 -> 198;
                case 82 -> 250;
                case 83 -> 219;
                case 84 -> 34;
                case 85 -> 103;
                case 86 -> 188;
                case 87 -> 176;
                case 88 -> 6;
                case 89 -> 178;
                case 90 -> 101;
                case 91 -> 189;
                case 92 -> 128;
                case 93 -> 144;
                case 94 -> 173;
                case 95 -> 165;
                case 96 -> 192;
                case 97 -> 21;
                case 98 -> 166;
                case 99 -> 162;
                case 100 -> 85;
                case 101 -> 149;
                case 102 -> 147;
                case 103 -> 229;
                case 104 -> 235;
                case 105 -> 239;
                case 106 -> 121;
                case 107 -> 232;
                case 108 -> 29;
                case 109 -> 3;
                case 110 -> 127;
                case 111 -> 86;
                case 112 -> 207;
                case 113 -> 209;
                case 114 -> 17;
                case 115 -> 102;
                case 116 -> 157;
                case 117 -> 197;
                case 118 -> 90;
                case 119 -> 14;
                case 120 -> 20;
                case 121 -> 54;
                case 122 -> 81;
                case 123 -> 226;
                case 124 -> 68;
                case 125 -> 77;
                case 126 -> 187;
                case 127 -> 33;
                case 128 -> 177;
                case 129 -> 57;
                case 130 -> 156;
                case 131 -> 110;
                case 132 -> 183;
                case 133 -> 18;
                case 134 -> 38;
                case 135 -> 160;
                case 136 -> 104;
                case 137 -> 168;
                case 138 -> 4;
                case 139 -> 13;
                case 140 -> 44;
                case 141 -> 119;
                case 142 -> 45;
                case 143 -> 59;
                case 144 -> 48;
                case 145 -> 109;
                case 146 -> 9;
                case 147 -> 42;
                case 148 -> 117;
                case 149 -> 43;
                case 150 -> 151;
                case 151 -> 185;
                case 152 -> 246;
                case 153 -> 5;
                case 154 -> 31;
                case 155 -> 222;
                case 156 -> 126;
                case 157 -> 191;
                case 158 -> 241;
                case 159 -> 213;
                case 160 -> 96;
                case 161 -> 78;
                case 162 -> 41;
                case 163 -> 132;
                case 164 -> 107;
                case 165 -> 46;
                case 166 -> 204;
                case 167 -> 74;
                case 168 -> 206;
                case 169 -> 164;
                case 170 -> 167;
                case 171 -> 27;
                case 172 -> 249;
                case 173 -> 66;
                case 174 -> 223;
                case 175 -> 170;
                case 176 -> 75;
                case 177 -> 205;
                case 178 -> 254;
                case 179 -> 58;
                case 180 -> 248;
                case 181 -> 172;
                case 182 -> 60;
                case 183 -> 35;
                case 184 -> 92;
                case 185 -> 251;
                case 186 -> 152;
                case 187 -> 148;
                case 188 -> 28;
                case 189 -> 240;
                case 190 -> 190;
                case 191 -> 130;
                case 192 -> 199;
                case 193 -> 84;
                case 194 -> 255;
                case 195 -> 112;
                case 196 -> 175;
                case 197 -> 80;
                case 198 -> 225;
                case 199 -> 97;
                case 200 -> 228;
                case 201 -> 133;
                case 202 -> 135;
                case 203 -> 129;
                case 204 -> 0;
                case 205 -> 208;
                case 206 -> 179;
                case 207 -> 180;
                case 208 -> 7;
                case 209 -> 153;
                case 210 -> 218;
                case 211 -> 2;
                case 212 -> 142;
                case 213 -> 243;
                case 214 -> 220;
                case 215 -> 116;
                case 216 -> 247;
                case 217 -> 181;
                case 218 -> 61;
                case 219 -> 214;
                case 220 -> 83;
                case 221 -> 216;
                case 222 -> 94;
                case 223 -> 11;
                case 224 -> 120;
                case 225 -> 24;
                case 226 -> 82;
                case 227 -> 8;
                case 228 -> 137;
                case 229 -> 22;
                case 230 -> 76;
                case 231 -> 65;
                case 232 -> 55;
                case 233 -> 252;
                case 234 -> 146;
                case 235 -> 155;
                case 236 -> 47;
                case 237 -> 140;
                case 238 -> 63;
                case 239 -> 16;
                case 240 -> 242;
                case 241 -> 64;
                case 242 -> 1;
                case 243 -> 163;
                case 244 -> 221;
                case 245 -> 186;
                case 246 -> 122;
                case 247 -> 145;
                case 248 -> 40;
                case 249 -> 95;
                case 250 -> 230;
                case 251 -> 211;
                case 252 -> 93;
                case 253 -> 87;
                case 254 -> 114;
                default -> 202;
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
            Initializer_5.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_5.strArr_1[n3];
    }
}
