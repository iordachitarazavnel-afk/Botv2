// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub1;

import java.util.HashSet;
import org.lwjgl.glfw.GLFW;
import java.util.Iterator;
import com.target.mod.compat.sub1.sub1.sub5.sub1.CalcGSub;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;
import java.util.HashMap;
import net.minecraft.class_310;
import java.util.Map;

public class Initializer
{
    private static final int intValue = 1000;
    private final Map<Integer, Boolean> map;
    private final class_310 class310;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer() {
        this.map = new HashMap<Integer, Boolean>();
        this.class310 = class_310.method_1551();
    }
    
    public static String computeString(final int n) {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        int n2 = n;
        int n3 = n;
        int n4 = n;
        int n5 = n;
        int n6 = n;
        int n7 = n;
        if (intarrArray != null) {
            if (n <= 0) {
                return createString(30337, 21580);
            }
            n2 = n;
            n3 = n;
            n4 = n;
            n5 = n;
            n6 = n;
            n7 = n;
        }
        if (intarrArray != null) {
            if (n7 >= 1000) {
                return computeString_1(n - 1000);
            }
            n2 = n;
            n3 = n;
            n4 = n;
            n5 = n;
            n6 = n;
        }
        if (intarrArray != null) {
            switch (n6) {
                case 32: {
                    return createString(30338, -705);
                }
                case 256: {
                    return createString(30383, -26416);
                }
                case 257: {
                    return createString(30381, -27077);
                }
                case 258: {
                    return createString(30379, -7898);
                }
                case 259: {
                    return createString(30375, -15412);
                }
                case 260: {
                    return createString(30398, -16246);
                }
                case 261: {
                    return createString(30385, -3068);
                }
                case 262: {
                    return createString(30336, 11718);
                }
                case 263: {
                    return createString(30389, 17985);
                }
                case 264: {
                    return createString(30377, -22309);
                }
                case 265: {
                    return createString(30382, -7933);
                }
                case 266: {
                    return createString(30390, 23614);
                }
                case 267: {
                    return createString(30399, 27551);
                }
                case 268: {
                    return createString(30374, 24231);
                }
                case 269: {
                    return createString(30397, -8409);
                }
                case 280: {
                    return createString(30394, 878);
                }
                case 281: {
                    return createString(30342, -12765);
                }
                case 282: {
                    return createString(30391, 27368);
                }
                case 283: {
                    return createString(30380, 12019);
                }
                case 284: {
                    return createString(30376, -21795);
                }
                case 340: {
                    return createString(30371, -3266);
                }
                case 341: {
                    return createString(30372, 22326);
                }
                case 342: {
                    return createString(30378, 8473);
                }
                case 343: {
                    return createString(30393, -6770);
                }
                case 344: {
                    return createString(30341, -18807);
                }
                case 345: {
                    return createString(30388, -7132);
                }
                case 346: {
                    return createString(30370, -16708);
                }
                case 347: {
                    return createString(30339, -8719);
                }
                default: {
                    n2 = n;
                    n3 = n;
                    n4 = n;
                    n5 = n;
                    break;
                }
            }
        }
        int n10;
        final int n9;
        final int n8 = n9 = (n10 = 290);
        int n11 = 0;
        Label_0599: {
            if (intarrArray != null) {
                if (n5 >= n8) {
                    n2 = n;
                    n3 = n;
                    n4 = n;
                    n11 = (n10 = 314);
                    if (intarrArray == null) {
                        break Label_0599;
                    }
                    if (n <= n11) {
                        return "F" + (n - 290 + 1);
                    }
                }
                n2 = n;
                n3 = n;
                n4 = n;
            }
        }
        int n12 = 0;
        Label_0641: {
            if (intarrArray != null) {
                if (n4 >= n8) {
                    n2 = n;
                    n3 = n;
                    n12 = 329;
                    if (intarrArray == null) {
                        break Label_0641;
                    }
                    if (n <= n12) {
                        return createString(30368, 6752) + (n - 320);
                    }
                }
                n2 = n;
                n3 = n;
            }
        }
        int n14 = 0;
        int n15 = 0;
        Label_0691: {
            Label_0671: {
                if (intarrArray != null) {
                    if (n3 >= n11) {
                        n2 = n;
                        final int n13 = 90;
                        if (intarrArray == null) {
                            break Label_0671;
                        }
                        if (n <= n13) {
                            return String.valueOf((char)n);
                        }
                    }
                    n14 = n;
                    n15 = n;
                    n2 = n;
                    if (intarrArray == null) {
                        break Label_0691;
                    }
                }
            }
            if (n2 >= n12) {
                n14 = n;
                n15 = n;
                if (intarrArray == null) {
                    break Label_0691;
                }
                if (n <= 57) {
                    return String.valueOf((char)n);
                }
            }
            n14 = n;
            n15 = n;
        }
        if (intarrArray != null) {
            switch (n15) {
                case 59: {
                    return ";";
                }
                case 61: {
                    return "=";
                }
                case 44: {
                    return ",";
                }
                case 45: {
                    return "-";
                }
                case 46: {
                    return ".";
                }
                case 47: {
                    return "/";
                }
                case 96: {
                    return "`";
                }
                case 91: {
                    return "[";
                }
                case 92: {
                    return "\\";
                }
                case 93: {
                    return "]";
                }
                case 39: {
                    return "'";
                }
                default: {
                    n14 = n;
                    break;
                }
            }
        }
        return createString(30340, 6718) + n14 + ")";
    }
    
    private static String computeString_1(final int n) {
        return switch (n) {
            case 0 -> createString(30386, 25049);
            case 1 -> createString(30392, -9637);
            case 2 -> createString(30395, 7711);
            case 3 -> createString(30369, -24152);
            case 4 -> createString(30373, 373);
            case 5 -> createString(30396, 24325);
            case 6 -> createString(30387, 10928);
            case 7 -> createString(30343, 14709);
            default -> createString(30384, 9793) + (n + 1);
        };
    }
    
    public static int method_int(final int n) {
        return 1000 + n;
    }
    
    public static boolean checkInt(final int n) {
        return n >= 1000;
    }
    
    public static int method_int_1(final int n) {
        if (checkInt(n)) {
            return n - 1000;
        }
        return -1;
    }
    
    public void execute() {
        if (Initializer_1.syncF == null) {
            return;
        }
        for (final AbstractLoadF abstractLoadF : Initializer_1.syncF.getList()) {
            final int int_7 = abstractLoadF.getInt_7();
            if (int_7 > 0) {
                if (abstractLoadF.getString().equals(new String(new char[] { 'R', 'a', 'd', 'i', 'u', 'm' }))) {
                    this.setIntAndCalcg(int_7, abstractLoadF);
                }
                else if (this.class310.field_1755 == null) {
                    this.setIntAndCalcg(int_7, abstractLoadF);
                }
            }
            if (int_7 <= 0 && abstractLoadF instanceof CalcGSub) {
                abstractLoadF.setInt(344);
            }
        }
    }
    
    private void setIntAndCalcg(final int n, final AbstractLoadF abstractLoadF) {
        if (abstractLoadF == null || Initializer_1.class310 == null) {
            return;
        }
        if (abstractLoadF instanceof CalcGSub) {
            return;
        }
        final boolean b = (n >= 1000) ? this.checkInt_2(n - 1000) : this.checkInt_1(n);
        final boolean booleanValue = this.map.getOrDefault(n, false);
        if (b && !booleanValue) {
            abstractLoadF.execute_2();
        }
        this.map.put(n, b);
    }
    
    private boolean checkInt_1(final int n) {
        try {
            if (this.class310.method_22683() == null) {
                return false;
            }
        }
        catch (final Exception ex) {
            throw computeException(ex);
        }
        try {
            try {
                if (GLFW.glfwGetKey(this.class310.method_22683().method_4490(), n) == 1) {
                    return true;
                }
            }
            catch (final Exception ex2) {
                throw computeException(ex2);
            }
            return false;
        }
        catch (final Exception ex3) {
            return false;
        }
    }
    
    private boolean checkInt_2(final int n) {
        try {
            if (this.class310.method_22683() == null) {
                return false;
            }
        }
        catch (final Exception ex) {
            throw computeException(ex);
        }
        try {
            try {
                if (GLFW.glfwGetMouseButton(this.class310.method_22683().method_4490(), n) == 1) {
                    return true;
                }
            }
            catch (final Exception ex2) {
                throw computeException(ex2);
            }
            return false;
        }
        catch (final Exception ex3) {
            return false;
        }
    }
    
    public void execute_1() {
        if (Initializer_1.syncF == null) {
            return;
        }
        final HashSet set = new HashSet();
        for (final AbstractLoadF abstractLoadF : Initializer_1.syncF.getList()) {
            if (abstractLoadF.getInt_7() != -1) {
                set.add(abstractLoadF.getInt_7());
            }
        }
        set.add(344);
        final int[] array = { 66, 67, 71, 72, 74, 75, 76, 77, 78, 79, 80, 81, 82, 85, 86, 88, 89, 90, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, method_int(3), method_int(4), method_int(5), method_int(6), method_int(7) };
        int n = 0;
        for (final AbstractLoadF abstractLoadF2 : Initializer_1.syncF.getList()) {
            if (abstractLoadF2.getInt_7() == -1 && n < array.length) {
                while (n < array.length && set.contains(array[n])) {
                    ++n;
                }
                if (n >= array.length) {
                    continue;
                }
                abstractLoadF2.setInt(array[n]);
                set.add(array[n]);
                ++n;
            }
        }
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    static {
        final String[] strArr2 = new String[40];
        int n = 0;
        String s;
        int n2 = (s = """
                      \u00d7\u008e\u00d2":V;~S\u0007-´¿)£³¤\u0004·\u00f6Qw	\u008eµ3\u00de\u00f0\u0006N0C\u0007r¬/p®¿\u0094\u0007TR\u0090\u00f5F(\u0019	L^}©º\u00db\u00c0\u00de§
                      \u00ce5\u00f1U^¨«¨\u00d4®\f¸~¯\u00d3/R`\u00e0\u00e5\u00fd«\u00f2\u0005\u0090)\u0000\u00adb\b]q\u00ff_C[\u0017\u00cd\u0006s¢kf\u00f8O\u0005\u009a\u00d1\u00f7Jª
                      \u0005V\u0090hADR~»\u000f\bU+\u0082\u00960\u00c2b¨\u0003\u001dB\u0094
                      ¼\u00e8c\u007fy\u0001º\u009d¬®
                      \u00ff\u00f2\u00d7\u00ad\u009a¥)B\u00d4\u0088\u0007(\u0010³d7»\u009e\b\u00fdg\u00deY½\u00cb=}\u0006°\u00da\f\u00e4\u00d5
                      \u0006\u0014
                      ©£Js
                      \u00ccB±»Ve®\u0003\u00f5\u00c4\u0007\u0002\u0081Z\u008f\u001fg1\u0007	\u00de;d3\u001aµ\u0003µ\u00e9´\u0006c!\u00f4¬\u001b\u0083	³\u00f9\u00c0YY\rL\u00f7\u00c7\u000b\u008f\u001a\u0005!µ\u00ca#\u00fc\u0084\u0096\u00f1
                      b\u000fd\u0012\u00ec@\u00e0¬\u0000\u0012	0\u0086\u00d6 n\u00eeª\u0096\u001e\f\u0012\u0018ImG\u008b\u0005\u0016J\u000b\u0085¤	*RZ\u00c9\u00c8F\u00d9\u009c\u0012\u000b6\u000f2\u0083S\u009e\u00efr\u000f\u00c6\u009f\u000b+o¥\u00c3\u000e=,\u00e7l\u00d1*\u0007-l¿2£\u00d0©\u000bA\u00fc\u00dc\u00fd\u008eQF\u0091q\u00ea+\u0004\u0089\u008fSX""").length();
        int n3 = 9;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 62));
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
                                    case 0 -> 26;
                                    case 1 -> 53;
                                    case 2 -> 49;
                                    case 3 -> 17;
                                    case 4 -> 53;
                                    case 5 -> 112;
                                    default -> 115;
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
                            n2 = (s = "¬f\u00e5<\u00dd\u000bH0^\u00c7}µ\u0089©y£\u00ce").length();
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
                    n5 = (n6 = (n7 = (n8 = 80)));
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
        strArr_1 = new String[40];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x76A4) & 0xFFFF;
        if (Initializer.strArr_1[n3] == null) {
            final char[] charArray = Initializer.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 85;
                case 1 -> 113;
                case 2 -> 161;
                case 3 -> 42;
                case 4 -> 32;
                case 5 -> 147;
                case 6 -> 7;
                case 7 -> 180;
                case 8 -> 162;
                case 9 -> 49;
                case 10 -> 63;
                case 11 -> 231;
                case 12 -> 226;
                case 13 -> 48;
                case 14 -> 227;
                case 15 -> 199;
                case 16 -> 66;
                case 17 -> 89;
                case 18 -> 73;
                case 19 -> 94;
                case 20 -> 23;
                case 21 -> 45;
                case 22 -> 111;
                case 23 -> 196;
                case 24 -> 61;
                case 25 -> 241;
                case 26 -> 145;
                case 27 -> 80;
                case 28 -> 60;
                case 29 -> 155;
                case 30 -> 6;
                case 31 -> 142;
                case 32 -> 101;
                case 33 -> 118;
                case 34 -> 251;
                case 35 -> 95;
                case 36 -> 62;
                case 37 -> 235;
                case 38 -> 69;
                case 39 -> 186;
                case 40 -> 57;
                case 41 -> 232;
                case 42 -> 40;
                case 43 -> 175;
                case 44 -> 136;
                case 45 -> 165;
                case 46 -> 188;
                case 47 -> 100;
                case 48 -> 144;
                case 49 -> 192;
                case 50 -> 189;
                case 51 -> 217;
                case 52 -> 64;
                case 53 -> 168;
                case 54 -> 164;
                case 55 -> 41;
                case 56 -> 230;
                case 57 -> 185;
                case 58 -> 146;
                case 59 -> 123;
                case 60 -> 141;
                case 61 -> 183;
                case 62 -> 26;
                case 63 -> 36;
                case 64 -> 99;
                case 65 -> 86;
                case 66 -> 254;
                case 67 -> 0;
                case 68 -> 75;
                case 69 -> 8;
                case 70 -> 132;
                case 71 -> 124;
                case 72 -> 71;
                case 73 -> 93;
                case 74 -> 193;
                case 75 -> 194;
                case 76 -> 96;
                case 77 -> 167;
                case 78 -> 114;
                case 79 -> 163;
                case 80 -> 27;
                case 81 -> 191;
                case 82 -> 87;
                case 83 -> 112;
                case 84 -> 2;
                case 85 -> 56;
                case 86 -> 72;
                case 87 -> 190;
                case 88 -> 213;
                case 89 -> 67;
                case 90 -> 240;
                case 91 -> 17;
                case 92 -> 68;
                case 93 -> 120;
                case 94 -> 59;
                case 95 -> 92;
                case 96 -> 233;
                case 97 -> 157;
                case 98 -> 35;
                case 99 -> 106;
                case 100 -> 245;
                case 101 -> 143;
                case 102 -> 12;
                case 103 -> 206;
                case 104 -> 130;
                case 105 -> 127;
                case 106 -> 224;
                case 107 -> 176;
                case 108 -> 97;
                case 109 -> 65;
                case 110 -> 78;
                case 111 -> 5;
                case 112 -> 107;
                case 113 -> 220;
                case 114 -> 222;
                case 115 -> 30;
                case 116 -> 135;
                case 117 -> 76;
                case 118 -> 156;
                case 119 -> 154;
                case 120 -> 51;
                case 121 -> 215;
                case 122 -> 13;
                case 123 -> 208;
                case 124 -> 195;
                case 125 -> 43;
                case 126 -> 150;
                case 127 -> 169;
                case 128 -> 4;
                case 129 -> 207;
                case 130 -> 50;
                case 131 -> 121;
                case 132 -> 181;
                case 133 -> 219;
                case 134 -> 55;
                case 135 -> 246;
                case 136 -> 22;
                case 137 -> 159;
                case 138 -> 54;
                case 139 -> 134;
                case 140 -> 174;
                case 141 -> 38;
                case 142 -> 151;
                case 143 -> 221;
                case 144 -> 122;
                case 145 -> 83;
                case 146 -> 139;
                case 147 -> 204;
                case 148 -> 104;
                case 149 -> 9;
                case 150 -> 16;
                case 151 -> 216;
                case 152 -> 90;
                case 153 -> 243;
                case 154 -> 218;
                case 155 -> 82;
                case 156 -> 39;
                case 157 -> 128;
                case 158 -> 214;
                case 159 -> 11;
                case 160 -> 84;
                case 161 -> 205;
                case 162 -> 158;
                case 163 -> 110;
                case 164 -> 179;
                case 165 -> 25;
                case 166 -> 103;
                case 167 -> 148;
                case 168 -> 14;
                case 169 -> 77;
                case 170 -> 228;
                case 171 -> 98;
                case 172 -> 29;
                case 173 -> 105;
                case 174 -> 79;
                case 175 -> 24;
                case 176 -> 173;
                case 177 -> 117;
                case 178 -> 3;
                case 179 -> 137;
                case 180 -> 74;
                case 181 -> 198;
                case 182 -> 160;
                case 183 -> 140;
                case 184 -> 187;
                case 185 -> 211;
                case 186 -> 212;
                case 187 -> 182;
                case 188 -> 116;
                case 189 -> 177;
                case 190 -> 239;
                case 191 -> 102;
                case 192 -> 19;
                case 193 -> 33;
                case 194 -> 70;
                case 195 -> 202;
                case 196 -> 153;
                case 197 -> 237;
                case 198 -> 210;
                case 199 -> 131;
                case 200 -> 248;
                case 201 -> 238;
                case 202 -> 178;
                case 203 -> 31;
                case 204 -> 10;
                case 205 -> 133;
                case 206 -> 88;
                case 207 -> 200;
                case 208 -> 203;
                case 209 -> 253;
                case 210 -> 149;
                case 211 -> 171;
                case 212 -> 242;
                case 213 -> 1;
                case 214 -> 126;
                case 215 -> 252;
                case 216 -> 255;
                case 217 -> 81;
                case 218 -> 234;
                case 219 -> 170;
                case 220 -> 236;
                case 221 -> 197;
                case 222 -> 15;
                case 223 -> 58;
                case 224 -> 184;
                case 225 -> 223;
                case 226 -> 129;
                case 227 -> 21;
                case 228 -> 91;
                case 229 -> 249;
                case 230 -> 138;
                case 231 -> 20;
                case 232 -> 53;
                case 233 -> 229;
                case 234 -> 152;
                case 235 -> 172;
                case 236 -> 209;
                case 237 -> 44;
                case 238 -> 244;
                case 239 -> 201;
                case 240 -> 108;
                case 241 -> 37;
                case 242 -> 115;
                case 243 -> 119;
                case 244 -> 109;
                case 245 -> 247;
                case 246 -> 125;
                case 247 -> 52;
                case 248 -> 47;
                case 249 -> 34;
                case 250 -> 250;
                case 251 -> 46;
                case 252 -> 166;
                case 253 -> 18;
                case 254 -> 28;
                default -> 225;
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
            Initializer.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer.strArr_1[n3];
    }
}
