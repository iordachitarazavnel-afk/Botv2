// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import java.nio.charset.StandardCharsets;

public final class Initializer_14
{
    private static int intValue;
    
    private Initializer_14() {
    }
    
    public static String computeString(final int[] array) {
        final byte[] bytes = new byte[array.length];
        for (int i = 0; i < array.length; ++i) {
            bytes[i] = (byte)((array[i] & 0xFF) ^ (107 + i * 11 & 0xFF));
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }
    
    public static void setInt(final int intValue) {
        Initializer_14.intValue = intValue;
    }
    
    public static int getInt() {
        return Initializer_14.intValue;
    }
    
    public static int getInt_1() {
        if (getInt() == 0) {
            return 58;
        }
        return 0;
    }
    
    static {
        if (getInt_1() == 0) {
            setInt(121);
        }
    }
}
