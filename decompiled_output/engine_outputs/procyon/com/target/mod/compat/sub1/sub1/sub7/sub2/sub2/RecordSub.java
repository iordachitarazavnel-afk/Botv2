// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub2.sub2;

import java.lang.invoke.CallSite;
import java.lang.reflect.UndeclaredThrowableException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

final class RecordSub extends Record
{
    private final Matrix4f matrix4f;
    private final Matrix3f matrix3f;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    RecordSub(final Matrix4f matrix4f, final Matrix3f matrix3f) {
        this.matrix4f = matrix4f;
        this.matrix3f = matrix3f;
    }
    
    @Override
    public String toString() {
        return createString(31624, -29394) + String.valueOf(this.matrix4f) + createString(31625, 10711) + String.valueOf(this.matrix3f) + "]";
    }
    
    @Override
    public final int hashCode() {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_15.invoke(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return /* invokedynamic(!) */ProcyonInvokeDynamicHelper_16.invoke(this, o);
    }
    
    public Matrix4f getMatrix4f() {
        return this.matrix4f;
    }
    
    public Matrix3f getMatrix3f() {
        return this.matrix3f;
    }
    
    static {
        final String[] strArr2 = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "\u00f2\u00eaP\u00ee\u00ec3~Z\u00fb\u0002\u0017Hp\u00f3\u00e7\u0015&\u00ee\u0094\u00f4&\u00f8\\\u00d0²8\u00c7\u001dl7\u00d2\u0010\u0003\u00c5\u00c4\u00fd_").length();
        int char1 = 15;
        int index = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 123);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0199: {
                        if (length2 > 1) {
                            break Label_0199;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 39;
                                case 1 -> 101;
                                case 2 -> 57;
                                case 3 -> 64;
                                case 4 -> 4;
                                case 5 -> 29;
                                default -> 42;
                            }));
                            ++n5;
                        } while (n2 == 0);
                    }
                    if (length2 > n5) {
                        continue;
                    }
                    break;
                }
                strArr2[n++] = new String(charArray).intern();
            } while ((index += char1) < length);
        }
        strArr = strArr2;
        strArr_1 = new String[2];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x7B89) & 0xFFFF;
        if (RecordSub.strArr_1[n3] == null) {
            final char[] charArray = RecordSub.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 20;
                case 1 -> 74;
                case 2 -> 159;
                case 3 -> 117;
                case 4 -> 193;
                case 5 -> 79;
                case 6 -> 73;
                case 7 -> 55;
                case 8 -> 219;
                case 9 -> 141;
                case 10 -> 13;
                case 11 -> 167;
                case 12 -> 231;
                case 13 -> 77;
                case 14 -> 218;
                case 15 -> 33;
                case 16 -> 25;
                case 17 -> 126;
                case 18 -> 35;
                case 19 -> 251;
                case 20 -> 100;
                case 21 -> 46;
                case 22 -> 52;
                case 23 -> 227;
                case 24 -> 240;
                case 25 -> 180;
                case 26 -> 36;
                case 27 -> 249;
                case 28 -> 154;
                case 29 -> 49;
                case 30 -> 176;
                case 31 -> 162;
                case 32 -> 94;
                case 33 -> 234;
                case 34 -> 68;
                case 35 -> 131;
                case 36 -> 172;
                case 37 -> 63;
                case 38 -> 103;
                case 39 -> 215;
                case 40 -> 62;
                case 41 -> 84;
                case 42 -> 214;
                case 43 -> 212;
                case 44 -> 108;
                case 45 -> 237;
                case 46 -> 179;
                case 47 -> 50;
                case 48 -> 150;
                case 49 -> 57;
                case 50 -> 171;
                case 51 -> 93;
                case 52 -> 76;
                case 53 -> 95;
                case 54 -> 2;
                case 55 -> 10;
                case 56 -> 243;
                case 57 -> 99;
                case 58 -> 125;
                case 59 -> 196;
                case 60 -> 228;
                case 61 -> 65;
                case 62 -> 92;
                case 63 -> 87;
                case 64 -> 194;
                case 65 -> 109;
                case 66 -> 160;
                case 67 -> 245;
                case 68 -> 116;
                case 69 -> 119;
                case 70 -> 203;
                case 71 -> 134;
                case 72 -> 155;
                case 73 -> 114;
                case 74 -> 30;
                case 75 -> 97;
                case 76 -> 135;
                case 77 -> 188;
                case 78 -> 158;
                case 79 -> 169;
                case 80 -> 107;
                case 81 -> 71;
                case 82 -> 127;
                case 83 -> 40;
                case 84 -> 250;
                case 85 -> 210;
                case 86 -> 238;
                case 87 -> 235;
                case 88 -> 149;
                case 89 -> 121;
                case 90 -> 173;
                case 91 -> 208;
                case 92 -> 41;
                case 93 -> 236;
                case 94 -> 213;
                case 95 -> 61;
                case 96 -> 181;
                case 97 -> 29;
                case 98 -> 145;
                case 99 -> 48;
                case 100 -> 113;
                case 101 -> 86;
                case 102 -> 184;
                case 103 -> 118;
                case 104 -> 18;
                case 105 -> 148;
                case 106 -> 123;
                case 107 -> 47;
                case 108 -> 205;
                case 109 -> 156;
                case 110 -> 201;
                case 111 -> 187;
                case 112 -> 232;
                case 113 -> 82;
                case 114 -> 90;
                case 115 -> 254;
                case 116 -> 164;
                case 117 -> 101;
                case 118 -> 216;
                case 119 -> 168;
                case 120 -> 14;
                case 121 -> 28;
                case 122 -> 239;
                case 123 -> 130;
                case 124 -> 80;
                case 125 -> 246;
                case 126 -> 255;
                case 127 -> 81;
                case 128 -> 198;
                case 129 -> 166;
                case 130 -> 88;
                case 131 -> 142;
                case 132 -> 124;
                case 133 -> 132;
                case 134 -> 115;
                case 135 -> 16;
                case 136 -> 197;
                case 137 -> 152;
                case 138 -> 38;
                case 139 -> 230;
                case 140 -> 98;
                case 141 -> 165;
                case 142 -> 174;
                case 143 -> 67;
                case 144 -> 22;
                case 145 -> 175;
                case 146 -> 185;
                case 147 -> 111;
                case 148 -> 253;
                case 149 -> 120;
                case 150 -> 45;
                case 151 -> 7;
                case 152 -> 147;
                case 153 -> 241;
                case 154 -> 8;
                case 155 -> 27;
                case 156 -> 182;
                case 157 -> 66;
                case 158 -> 1;
                case 159 -> 9;
                case 160 -> 220;
                case 161 -> 157;
                case 162 -> 151;
                case 163 -> 223;
                case 164 -> 105;
                case 165 -> 15;
                case 166 -> 78;
                case 167 -> 202;
                case 168 -> 5;
                case 169 -> 211;
                case 170 -> 4;
                case 171 -> 104;
                case 172 -> 248;
                case 173 -> 60;
                case 174 -> 85;
                case 175 -> 83;
                case 176 -> 129;
                case 177 -> 190;
                case 178 -> 144;
                case 179 -> 53;
                case 180 -> 31;
                case 181 -> 75;
                case 182 -> 26;
                case 183 -> 128;
                case 184 -> 89;
                case 185 -> 54;
                case 186 -> 42;
                case 187 -> 183;
                case 188 -> 233;
                case 189 -> 64;
                case 190 -> 192;
                case 191 -> 140;
                case 192 -> 44;
                case 193 -> 252;
                case 194 -> 229;
                case 195 -> 32;
                case 196 -> 21;
                case 197 -> 34;
                case 198 -> 133;
                case 199 -> 143;
                case 200 -> 17;
                case 201 -> 12;
                case 202 -> 146;
                case 203 -> 96;
                case 204 -> 136;
                case 205 -> 11;
                case 206 -> 37;
                case 207 -> 222;
                case 208 -> 72;
                case 209 -> 112;
                case 210 -> 6;
                case 211 -> 189;
                case 212 -> 139;
                case 213 -> 19;
                case 214 -> 106;
                case 215 -> 195;
                case 216 -> 242;
                case 217 -> 200;
                case 218 -> 69;
                case 219 -> 247;
                case 220 -> 122;
                case 221 -> 161;
                case 222 -> 186;
                case 223 -> 224;
                case 224 -> 56;
                case 225 -> 177;
                case 226 -> 199;
                case 227 -> 0;
                case 228 -> 91;
                case 229 -> 207;
                case 230 -> 163;
                case 231 -> 23;
                case 232 -> 58;
                case 233 -> 226;
                case 234 -> 137;
                case 235 -> 59;
                case 236 -> 209;
                case 237 -> 3;
                case 238 -> 221;
                case 239 -> 204;
                case 240 -> 178;
                case 241 -> 138;
                case 242 -> 102;
                case 243 -> 191;
                case 244 -> 206;
                case 245 -> 51;
                case 246 -> 110;
                case 247 -> 153;
                case 248 -> 70;
                case 249 -> 225;
                case 250 -> 43;
                case 251 -> 217;
                case 252 -> 170;
                case 253 -> 24;
                case 254 -> 39;
                default -> 244;
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
    private static final class ProcyonInvokeDynamicHelper_15
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_15.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_15.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_15.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_15.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_15.LOOKUP;
                try {
                    handle = ((CallSite)ObjectMethods.bootstrap(lookup, "hashCode", MethodType.methodType(int.class, RecordSub.class), RecordSub.class, "a;b", lookup.findGetter(RecordSub.class, "matrix4f", Matrix4f.class), lookup.findGetter(RecordSub.class, "matrix3f", Matrix3f.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_15.fence = 1;
                ProcyonInvokeDynamicHelper_15.handle = handle;
                ProcyonInvokeDynamicHelper_15.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(RecordSub p0) {
            try {
                return ProcyonInvokeDynamicHelper_15.handle().invokeExact(p0);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_16
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_16.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_16.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_16.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_16.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_16.LOOKUP;
                try {
                    handle = ((CallSite)ObjectMethods.bootstrap(lookup, "equals", MethodType.methodType(boolean.class, RecordSub.class, Object.class), RecordSub.class, "a;b", lookup.findGetter(RecordSub.class, "matrix4f", Matrix4f.class), lookup.findGetter(RecordSub.class, "matrix3f", Matrix3f.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_16.fence = 1;
                ProcyonInvokeDynamicHelper_16.handle = handle;
                ProcyonInvokeDynamicHelper_16.fence = 0;
            }
            return handle;
        }
        
        private static boolean invoke(RecordSub p0, Object p1) {
            try {
                return ProcyonInvokeDynamicHelper_16.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
