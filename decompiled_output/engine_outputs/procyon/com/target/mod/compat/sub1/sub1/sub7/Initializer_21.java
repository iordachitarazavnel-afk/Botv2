// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class Initializer_21
{
    private static final int[] intArr;
    private static int intValue;
    
    private Initializer_21() {
    }
    
    public static String computeString(final String src) {
        final byte[] decode = Base64.getDecoder().decode(src);
        for (int i = 0, n = decode.length - 1; i < n; ++i, --n) {
            final byte b = decode[i];
            decode[i] = decode[n];
            decode[n] = b;
        }
        for (int j = 0; j < decode.length; ++j) {
            decode[j] ^= (byte)Initializer_21.intArr[j % Initializer_21.intArr.length];
        }
        return new String(decode, StandardCharsets.UTF_8);
    }
    
    static {
        final int int1 = 0;
        intArr = new int[] { 77, 111, 110, 107, 101, 121 };
        setInt(int1);
    }
    
    public static void setInt(final int intValue) {
        Initializer_21.intValue = intValue;
    }
    
    public static int getInt() {
        return Initializer_21.intValue;
    }
    
    public static int getInt_1() {
        if (getInt() == 0) {
            return 30;
        }
        return 0;
    }
}
