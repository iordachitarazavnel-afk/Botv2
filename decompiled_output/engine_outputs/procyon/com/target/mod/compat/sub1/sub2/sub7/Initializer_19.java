// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class Initializer_19
{
    private static final int[] intArr;
    
    private Initializer_19() {
    }
    
    public static String computeString(final String src) {
        final int int1 = Initializer_14.getInt();
        final byte[] decode = Base64.getDecoder().decode(src);
        final int n = int1;
        int i = 0;
        int n2 = decode.length - 1;
        while (true) {
            while (i < n2) {
                final byte b = decode[i];
                decode[i] = decode[n2];
                decode[n2] = b;
                ++i;
                --n2;
                if (n != 0) {
                    while (i < decode.length) {
                        decode[i] ^= (byte)Initializer_19.intArr[i % Initializer_19.intArr.length];
                        ++i;
                        if (n != 0) {
                            break;
                        }
                    }
                    return new String(decode, StandardCharsets.UTF_8);
                }
                if (n != 0) {
                    break;
                }
            }
            i = 0;
            continue;
        }
    }
    
    static {
        intArr = new int[] { 77, 111, 110, 107, 101, 121 };
    }
}
