// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub6;

public class Initializer
{
    private static String[] strArr;
    
    public static Interface getUtili() {
        return new UtilIImpl_3();
    }
    
    public static Interface getUtili_1() {
        return new UtilIImpl_3();
    }
    
    public static void setStringarr(final String[] strArr) {
        Initializer.strArr = strArr;
    }
    
    public static String[] getStringarrArray() {
        return Initializer.strArr;
    }
    
    static {
        if (getStringarrArray() != null) {
            setStringarr(new String[2]);
        }
    }
}
