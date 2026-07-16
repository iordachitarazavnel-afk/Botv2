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

final class RecordSub_1 extends Record
{
    private final float floatValue;
    private final float floatValue_1;
    private final float floatValue_2;
    private final float floatValue_3;
    private final float floatValue_4;
    private final RecordSub nodeE;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    RecordSub_1(final float floatValue, final float floatValue_1, final float floatValue_2, final float floatValue_3, final float floatValue_4, final RecordSub nodeE) {
        this.floatValue = floatValue;
        this.floatValue_1 = floatValue_1;
        this.floatValue_2 = floatValue_2;
        this.floatValue_3 = floatValue_3;
        this.floatValue_4 = floatValue_4;
        this.nodeE = nodeE;
    }
    
    @Override
    public String toString() {
        return createString(-20674, 21942) + this.floatValue + createString(-20676, -7767) + this.floatValue_1 + createString(-20675, -29193) + this.floatValue_2 + createString(-20673, 25659) + this.floatValue_3 + createString(-20677, -8586) + this.floatValue_4 + createString(-20678, -2827) + String.valueOf(this.nodeE) + "]";
    }
    
    @Override
    public final int hashCode() {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_13.invoke(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_14.invoke(this, o);
    }
    
    public float getFloat() {
        return this.floatValue;
    }
    
    public float getFloat_1() {
        return this.floatValue_1;
    }
    
    public float getFloat_2() {
        return this.floatValue_2;
    }
    
    public float getFloat_3() {
        return this.floatValue_3;
    }
    
    public float getFloat_4() {
        return this.floatValue_4;
    }
    
    public RecordSub getNodee() {
        return this.nodeE;
    }
    
    static {
        final String[] strArr2 = new String[6];
        int n = 0;
        String s;
        int n2 = (s = "7\u00f8µx qO\u0095\u0018+\u0018¿\u009f\u00e2\u0004^'\u00fb\u00d1\u0006Y\u0013\u001d\u001e)\u008d\u0004\u00fdU\u009a\u009f").length();
        int n3 = 14;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 60));
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
                                    case 0 -> 123;
                                    case 1 -> 101;
                                    case 2 -> 42;
                                    case 3 -> 59;
                                    case 4 -> 96;
                                    case 5 -> 85;
                                    default -> 101;
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
                            n2 = (s = "\u0093\u0080]{\u0087\u001a\u0083n~\u0004V,\u00f3¼").length();
                            n3 = 9;
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
                    n5 = (n6 = (n7 = (n8 = 21)));
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
        final int n3 = (n ^ 0xFFFFAF3E) & 0xFFFF;
        if (RecordSub_1.strArr_1[n3] == null) {
            final char[] charArray = RecordSub_1.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 87;
                case 1 -> 235;
                case 2 -> 212;
                case 3 -> 237;
                case 4 -> 173;
                case 5 -> 85;
                case 6 -> 93;
                case 7 -> 175;
                case 8 -> 172;
                case 9 -> 250;
                case 10 -> 126;
                case 11 -> 191;
                case 12 -> 73;
                case 13 -> 69;
                case 14 -> 167;
                case 15 -> 99;
                case 16 -> 135;
                case 17 -> 165;
                case 18 -> 177;
                case 19 -> 226;
                case 20 -> 89;
                case 21 -> 215;
                case 22 -> 95;
                case 23 -> 110;
                case 24 -> 118;
                case 25 -> 6;
                case 26 -> 4;
                case 27 -> 229;
                case 28 -> 15;
                case 29 -> 249;
                case 30 -> 119;
                case 31 -> 40;
                case 32 -> 227;
                case 33 -> 12;
                case 34 -> 109;
                case 35 -> 246;
                case 36 -> 252;
                case 37 -> 206;
                case 38 -> 28;
                case 39 -> 190;
                case 40 -> 49;
                case 41 -> 152;
                case 42 -> 78;
                case 43 -> 3;
                case 44 -> 232;
                case 45 -> 188;
                case 46 -> 144;
                case 47 -> 199;
                case 48 -> 254;
                case 49 -> 245;
                case 50 -> 0;
                case 51 -> 53;
                case 52 -> 154;
                case 53 -> 114;
                case 54 -> 101;
                case 55 -> 153;
                case 56 -> 98;
                case 57 -> 142;
                case 58 -> 136;
                case 59 -> 57;
                case 60 -> 187;
                case 61 -> 64;
                case 62 -> 34;
                case 63 -> 129;
                case 64 -> 238;
                case 65 -> 62;
                case 66 -> 176;
                case 67 -> 108;
                case 68 -> 1;
                case 69 -> 47;
                case 70 -> 131;
                case 71 -> 242;
                case 72 -> 210;
                case 73 -> 91;
                case 74 -> 143;
                case 75 -> 181;
                case 76 -> 203;
                case 77 -> 88;
                case 78 -> 128;
                case 79 -> 146;
                case 80 -> 29;
                case 81 -> 253;
                case 82 -> 16;
                case 83 -> 201;
                case 84 -> 194;
                case 85 -> 163;
                case 86 -> 7;
                case 87 -> 66;
                case 88 -> 56;
                case 89 -> 244;
                case 90 -> 105;
                case 91 -> 103;
                case 92 -> 60;
                case 93 -> 204;
                case 94 -> 151;
                case 95 -> 157;
                case 96 -> 121;
                case 97 -> 241;
                case 98 -> 236;
                case 99 -> 230;
                case 100 -> 189;
                case 101 -> 207;
                case 102 -> 134;
                case 103 -> 76;
                case 104 -> 45;
                case 105 -> 5;
                case 106 -> 197;
                case 107 -> 106;
                case 108 -> 225;
                case 109 -> 158;
                case 110 -> 224;
                case 111 -> 149;
                case 112 -> 130;
                case 113 -> 80;
                case 114 -> 137;
                case 115 -> 26;
                case 116 -> 132;
                case 117 -> 112;
                case 118 -> 10;
                case 119 -> 171;
                case 120 -> 58;
                case 121 -> 96;
                case 122 -> 161;
                case 123 -> 156;
                case 124 -> 139;
                case 125 -> 11;
                case 126 -> 220;
                case 127 -> 182;
                case 128 -> 52;
                case 129 -> 84;
                case 130 -> 240;
                case 131 -> 71;
                case 132 -> 38;
                case 133 -> 218;
                case 134 -> 22;
                case 135 -> 120;
                case 136 -> 55;
                case 137 -> 113;
                case 138 -> 200;
                case 139 -> 37;
                case 140 -> 213;
                case 141 -> 231;
                case 142 -> 41;
                case 143 -> 86;
                case 144 -> 83;
                case 145 -> 205;
                case 146 -> 141;
                case 147 -> 44;
                case 148 -> 14;
                case 149 -> 208;
                case 150 -> 51;
                case 151 -> 77;
                case 152 -> 25;
                case 153 -> 13;
                case 154 -> 82;
                case 155 -> 92;
                case 156 -> 23;
                case 157 -> 184;
                case 158 -> 111;
                case 159 -> 221;
                case 160 -> 65;
                case 161 -> 123;
                case 162 -> 209;
                case 163 -> 150;
                case 164 -> 94;
                case 165 -> 33;
                case 166 -> 81;
                case 167 -> 74;
                case 168 -> 125;
                case 169 -> 192;
                case 170 -> 170;
                case 171 -> 32;
                case 172 -> 138;
                case 173 -> 160;
                case 174 -> 228;
                case 175 -> 169;
                case 176 -> 20;
                case 177 -> 247;
                case 178 -> 148;
                case 179 -> 68;
                case 180 -> 219;
                case 181 -> 195;
                case 182 -> 140;
                case 183 -> 35;
                case 184 -> 21;
                case 185 -> 174;
                case 186 -> 97;
                case 187 -> 168;
                case 188 -> 63;
                case 189 -> 196;
                case 190 -> 198;
                case 191 -> 115;
                case 192 -> 116;
                case 193 -> 50;
                case 194 -> 239;
                case 195 -> 107;
                case 196 -> 185;
                case 197 -> 46;
                case 198 -> 72;
                case 199 -> 54;
                case 200 -> 233;
                case 201 -> 61;
                case 202 -> 30;
                case 203 -> 217;
                case 204 -> 155;
                case 205 -> 159;
                case 206 -> 24;
                case 207 -> 75;
                case 208 -> 243;
                case 209 -> 39;
                case 210 -> 90;
                case 211 -> 104;
                case 212 -> 193;
                case 213 -> 59;
                case 214 -> 211;
                case 215 -> 43;
                case 216 -> 145;
                case 217 -> 42;
                case 218 -> 164;
                case 219 -> 100;
                case 220 -> 133;
                case 221 -> 67;
                case 222 -> 214;
                case 223 -> 183;
                case 224 -> 178;
                case 225 -> 186;
                case 226 -> 18;
                case 227 -> 223;
                case 228 -> 27;
                case 229 -> 202;
                case 230 -> 251;
                case 231 -> 9;
                case 232 -> 255;
                case 233 -> 127;
                case 234 -> 102;
                case 235 -> 222;
                case 236 -> 147;
                case 237 -> 234;
                case 238 -> 8;
                case 239 -> 31;
                case 240 -> 179;
                case 241 -> 79;
                case 242 -> 166;
                case 243 -> 19;
                case 244 -> 70;
                case 245 -> 162;
                case 246 -> 122;
                case 247 -> 124;
                case 248 -> 216;
                case 249 -> 17;
                case 250 -> 2;
                case 251 -> 180;
                case 252 -> 117;
                case 253 -> 36;
                case 254 -> 48;
                default -> 248;
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
            RecordSub_1.strArr_1[n3] = new String(charArray).intern();
        }
        return RecordSub_1.strArr_1[n3];
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_13
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_13.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_13.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_13.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_13.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_13.LOOKUP;
                try {
                    handle = ((CallSite)ObjectMethods.bootstrap(lookup, "hashCode", MethodType.methodType(int.class, RecordSub_1.class), RecordSub_1.class, "a;b;c;d;e;f", lookup.findGetter(RecordSub_1.class, "floatValue", float.class), lookup.findGetter(RecordSub_1.class, "floatValue_1", float.class), lookup.findGetter(RecordSub_1.class, "floatValue_2", float.class), lookup.findGetter(RecordSub_1.class, "floatValue_3", float.class), lookup.findGetter(RecordSub_1.class, "floatValue_4", float.class), lookup.findGetter(RecordSub_1.class, "nodeE", RecordSub.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_13.fence = 1;
                ProcyonInvokeDynamicHelper_13.handle = handle;
                ProcyonInvokeDynamicHelper_13.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(RecordSub_1 p0) {
            try {
                return ProcyonInvokeDynamicHelper_13.handle().invokeExact(p0);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_14
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_14.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_14.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_14.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_14.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_14.LOOKUP;
                try {
                    handle = ((CallSite)ObjectMethods.bootstrap(lookup, "equals", MethodType.methodType(boolean.class, RecordSub_1.class, Object.class), RecordSub_1.class, "a;b;c;d;e;f", lookup.findGetter(RecordSub_1.class, "floatValue", float.class), lookup.findGetter(RecordSub_1.class, "floatValue_1", float.class), lookup.findGetter(RecordSub_1.class, "floatValue_2", float.class), lookup.findGetter(RecordSub_1.class, "floatValue_3", float.class), lookup.findGetter(RecordSub_1.class, "floatValue_4", float.class), lookup.findGetter(RecordSub_1.class, "nodeE", RecordSub.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_14.fence = 1;
                ProcyonInvokeDynamicHelper_14.handle = handle;
                ProcyonInvokeDynamicHelper_14.fence = 0;
            }
            return handle;
        }
        
        private static boolean invoke(RecordSub_1 p0, Object p1) {
            try {
                return ProcyonInvokeDynamicHelper_14.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
