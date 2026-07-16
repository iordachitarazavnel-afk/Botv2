// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub2.sub1;

import java.lang.invoke.CallSite;
import java.lang.reflect.UndeclaredThrowableException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;

final class RecordSub extends Record
{
    private final int intValue;
    private final int intValue_1;
    private final int intValue_2;
    private final int intValue_3;
    private final char charValue;
    private final Initializer viewC;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    RecordSub(final int intValue, final int intValue_1, final int intValue_2, final int intValue_3, final char charValue, final Initializer viewC) {
        this.intValue = intValue;
        this.intValue_1 = intValue_1;
        this.intValue_2 = intValue_2;
        this.intValue_3 = intValue_3;
        CloseableImpl.getStringarrArray();
        this.charValue = charValue;
        this.viewC = viewC;
        if (com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1() != 0) {
            CloseableImpl.setStringarr(new String[5]);
        }
    }
    
    @Override
    public String toString() {
        return createString(20583, 20088) + this.intValue + createString(20582, -30908) + this.intValue_1 + createString(20577, 18338) + this.intValue_2 + createString(20581, 14570) + this.intValue_3 + createString(20580, 25700) + this.charValue + createString(20576, -10755) + String.valueOf(this.viewC) + "]";
    }
    
    @Override
    public final int hashCode() {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_11.invoke(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_12.invoke(this, o);
    }
    
    public int getInt() {
        return this.intValue;
    }
    
    public int getInt_1() {
        return this.intValue_1;
    }
    
    public int getInt_2() {
        return this.intValue_2;
    }
    
    public int getInt_3() {
        return this.intValue_3;
    }
    
    public char getChar() {
        return this.charValue;
    }
    
    public Initializer getViewc() {
        return this.viewC;
    }
    
    static {
        final String[] strArr2 = new String[6];
        int n = 0;
        String s;
        int n2 = (s = "\u0095?\u00f1w\u0015\u00c0·w$\b?Cº\u00fc¤')\u0092\b\u00ca\u00e7\r¼¸2>\u00db\u0004½\u0002\u00ea\u0088").length();
        int n3 = 9;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 57));
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
                                    case 0 -> 108;
                                    case 1 -> 28;
                                    case 2 -> 17;
                                    case 3 -> 76;
                                    case 4 -> 27;
                                    case 5 -> 23;
                                    default -> 68;
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
                            n2 = (s = "¡\u0086«\u008fl\u0082\u00f7\u00c4\b3g\u00e1\u00ad4\n\u00ad\u00e6").length();
                            n3 = 8;
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
                    n5 = (n6 = (n7 = (n8 = 30)));
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
        strArr_1 = new String[6];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x5065) & 0xFFFF;
        if (RecordSub.strArr_1[n3] == null) {
            final char[] charArray = RecordSub.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 48;
                case 1 -> 152;
                case 2 -> 76;
                case 3 -> 228;
                case 4 -> 100;
                case 5 -> 34;
                case 6 -> 91;
                case 7 -> 146;
                case 8 -> 64;
                case 9 -> 56;
                case 10 -> 39;
                case 11 -> 22;
                case 12 -> 50;
                case 13 -> 33;
                case 14 -> 227;
                case 15 -> 72;
                case 16 -> 45;
                case 17 -> 97;
                case 18 -> 186;
                case 19 -> 145;
                case 20 -> 0;
                case 21 -> 159;
                case 22 -> 158;
                case 23 -> 139;
                case 24 -> 154;
                case 25 -> 104;
                case 26 -> 53;
                case 27 -> 82;
                case 28 -> 169;
                case 29 -> 92;
                case 30 -> 16;
                case 31 -> 237;
                case 32 -> 134;
                case 33 -> 57;
                case 34 -> 192;
                case 35 -> 255;
                case 36 -> 108;
                case 37 -> 105;
                case 38 -> 58;
                case 39 -> 90;
                case 40 -> 184;
                case 41 -> 32;
                case 42 -> 47;
                case 43 -> 119;
                case 44 -> 246;
                case 45 -> 113;
                case 46 -> 155;
                case 47 -> 166;
                case 48 -> 85;
                case 49 -> 67;
                case 50 -> 37;
                case 51 -> 3;
                case 52 -> 253;
                case 53 -> 49;
                case 54 -> 75;
                case 55 -> 133;
                case 56 -> 84;
                case 57 -> 234;
                case 58 -> 9;
                case 59 -> 157;
                case 60 -> 226;
                case 61 -> 188;
                case 62 -> 1;
                case 63 -> 28;
                case 64 -> 236;
                case 65 -> 144;
                case 66 -> 99;
                case 67 -> 178;
                case 68 -> 112;
                case 69 -> 118;
                case 70 -> 225;
                case 71 -> 141;
                case 72 -> 181;
                case 73 -> 179;
                case 74 -> 78;
                case 75 -> 23;
                case 76 -> 190;
                case 77 -> 17;
                case 78 -> 43;
                case 79 -> 132;
                case 80 -> 137;
                case 81 -> 249;
                case 82 -> 242;
                case 83 -> 206;
                case 84 -> 19;
                case 85 -> 122;
                case 86 -> 123;
                case 87 -> 124;
                case 88 -> 77;
                case 89 -> 61;
                case 90 -> 27;
                case 91 -> 24;
                case 92 -> 189;
                case 93 -> 150;
                case 94 -> 60;
                case 95 -> 20;
                case 96 -> 219;
                case 97 -> 10;
                case 98 -> 89;
                case 99 -> 6;
                case 100 -> 199;
                case 101 -> 194;
                case 102 -> 35;
                case 103 -> 174;
                case 104 -> 238;
                case 105 -> 8;
                case 106 -> 30;
                case 107 -> 191;
                case 108 -> 95;
                case 109 -> 231;
                case 110 -> 98;
                case 111 -> 233;
                case 112 -> 202;
                case 113 -> 180;
                case 114 -> 200;
                case 115 -> 127;
                case 116 -> 214;
                case 117 -> 211;
                case 118 -> 213;
                case 119 -> 126;
                case 120 -> 110;
                case 121 -> 248;
                case 122 -> 114;
                case 123 -> 80;
                case 124 -> 38;
                case 125 -> 161;
                case 126 -> 245;
                case 127 -> 96;
                case 128 -> 101;
                case 129 -> 167;
                case 130 -> 165;
                case 131 -> 74;
                case 132 -> 208;
                case 133 -> 252;
                case 134 -> 244;
                case 135 -> 62;
                case 136 -> 218;
                case 137 -> 173;
                case 138 -> 147;
                case 139 -> 40;
                case 140 -> 109;
                case 141 -> 106;
                case 142 -> 73;
                case 143 -> 140;
                case 144 -> 63;
                case 145 -> 12;
                case 146 -> 241;
                case 147 -> 88;
                case 148 -> 203;
                case 149 -> 5;
                case 150 -> 168;
                case 151 -> 31;
                case 152 -> 4;
                case 153 -> 102;
                case 154 -> 156;
                case 155 -> 224;
                case 156 -> 250;
                case 157 -> 83;
                case 158 -> 136;
                case 159 -> 160;
                case 160 -> 176;
                case 161 -> 235;
                case 162 -> 42;
                case 163 -> 11;
                case 164 -> 51;
                case 165 -> 79;
                case 166 -> 182;
                case 167 -> 232;
                case 168 -> 115;
                case 169 -> 117;
                case 170 -> 239;
                case 171 -> 94;
                case 172 -> 121;
                case 173 -> 103;
                case 174 -> 14;
                case 175 -> 142;
                case 176 -> 120;
                case 177 -> 71;
                case 178 -> 149;
                case 179 -> 215;
                case 180 -> 197;
                case 181 -> 81;
                case 182 -> 41;
                case 183 -> 151;
                case 184 -> 193;
                case 185 -> 87;
                case 186 -> 93;
                case 187 -> 54;
                case 188 -> 36;
                case 189 -> 187;
                case 190 -> 65;
                case 191 -> 7;
                case 192 -> 254;
                case 193 -> 172;
                case 194 -> 131;
                case 195 -> 247;
                case 196 -> 210;
                case 197 -> 130;
                case 198 -> 220;
                case 199 -> 13;
                case 200 -> 86;
                case 201 -> 230;
                case 202 -> 183;
                case 203 -> 21;
                case 204 -> 129;
                case 205 -> 162;
                case 206 -> 216;
                case 207 -> 143;
                case 208 -> 135;
                case 209 -> 116;
                case 210 -> 44;
                case 211 -> 163;
                case 212 -> 125;
                case 213 -> 59;
                case 214 -> 171;
                case 215 -> 217;
                case 216 -> 18;
                case 217 -> 25;
                case 218 -> 170;
                case 219 -> 70;
                case 220 -> 222;
                case 221 -> 2;
                case 222 -> 29;
                case 223 -> 251;
                case 224 -> 205;
                case 225 -> 212;
                case 226 -> 55;
                case 227 -> 148;
                case 228 -> 243;
                case 229 -> 207;
                case 230 -> 201;
                case 231 -> 209;
                case 232 -> 128;
                case 233 -> 175;
                case 234 -> 164;
                case 235 -> 15;
                case 236 -> 107;
                case 237 -> 69;
                case 238 -> 198;
                case 239 -> 196;
                case 240 -> 195;
                case 241 -> 138;
                case 242 -> 221;
                case 243 -> 68;
                case 244 -> 46;
                case 245 -> 111;
                case 246 -> 240;
                case 247 -> 153;
                case 248 -> 223;
                case 249 -> 185;
                case 250 -> 66;
                case 251 -> 26;
                case 252 -> 229;
                case 253 -> 204;
                case 254 -> 177;
                default -> 52;
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
            RecordSub.strArr_1[n3] = new String(charArray).intern();
        }
        return RecordSub.strArr_1[n3];
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_11
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_11.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_11.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_11.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_11.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_11.LOOKUP;
                try {
                    handle = ((CallSite)ObjectMethods.bootstrap(lookup, "hashCode", MethodType.methodType(int.class, RecordSub.class), RecordSub.class, "a;b;c;d;e;f", lookup.findGetter(RecordSub.class, "intValue", int.class), lookup.findGetter(RecordSub.class, "intValue_1", int.class), lookup.findGetter(RecordSub.class, "intValue_2", int.class), lookup.findGetter(RecordSub.class, "intValue_3", int.class), lookup.findGetter(RecordSub.class, "charValue", char.class), lookup.findGetter(RecordSub.class, "viewC", Initializer.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_11.fence = 1;
                ProcyonInvokeDynamicHelper_11.handle = handle;
                ProcyonInvokeDynamicHelper_11.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(RecordSub p0) {
            try {
                return ProcyonInvokeDynamicHelper_11.handle().invokeExact(p0);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_12
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_12.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_12.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_12.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_12.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_12.LOOKUP;
                try {
                    handle = ((CallSite)ObjectMethods.bootstrap(lookup, "equals", MethodType.methodType(boolean.class, RecordSub.class, Object.class), RecordSub.class, "a;b;c;d;e;f", lookup.findGetter(RecordSub.class, "intValue", int.class), lookup.findGetter(RecordSub.class, "intValue_1", int.class), lookup.findGetter(RecordSub.class, "intValue_2", int.class), lookup.findGetter(RecordSub.class, "intValue_3", int.class), lookup.findGetter(RecordSub.class, "charValue", char.class), lookup.findGetter(RecordSub.class, "viewC", Initializer.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_12.fence = 1;
                ProcyonInvokeDynamicHelper_12.handle = handle;
                ProcyonInvokeDynamicHelper_12.fence = 0;
            }
            return handle;
        }
        
        private static boolean invoke(RecordSub p0, Object p1) {
            try {
                return ProcyonInvokeDynamicHelper_12.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
