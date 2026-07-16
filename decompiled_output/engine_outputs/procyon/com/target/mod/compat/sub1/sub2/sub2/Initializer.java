// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub2;

import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;

public enum Initializer
{
    cacheE(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 76, 33, 100, 105, 0, 71, 135, 255, 166, 135, 222, 129, 211 })), 
    RENDER(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 70, 33, 100, 106, 0, 71, 129, 255, 166, 163, 222, 129, 213 })), 
    cacheE_1(Initializer_14.computeString(new int[] { 46, 24, 233, 237, 249, 193, 200, 220, 227, 131, 182, 128, 154, 150, 96, 99 })), 
    MISC(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 74, 33, 100, 119, 0, 71, 134 })), 
    cacheE_2(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 76, 33, 100, 112, 207, 21, 185, 179, 244, 155, 185, 211, 250, 215, 178, 213, 242, 145, 52, 0, 112, 23, 38 })), 
    CART(Initializer_14.computeString(new int[] { 40, 23, 243, 248, 183, 242, 219, 232 })), 
    cacheE_3(Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 76, 33, 100, 106, 0, 71, 144, 255, 166, 178 }));
    
    private final String strValue;
    private static String[] strArr;
    
    private Initializer(final String strValue) {
        this.strValue = strValue;
    }
    
    public String getString() {
        return this.strValue;
    }
    
    @Override
    public String toString() {
        return this.strValue;
    }
    
    static {
        final String[] array = new String[7];
        final String[] stringarr = new String[2];
        int n = 0;
        setStringarr(stringarr);
        String s;
        int n2 = (s = "9SH9{e\u0002=$\u0003.NR\u0002(B\u0004(WT)").length();
        int n3 = 6;
        int n4 = -1;
    Label_0030:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 44));
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
                        Label_0252: {
                            if (length > 1) {
                                break Label_0252;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 71;
                                    case 1 -> 58;
                                    case 2 -> 42;
                                    case 3 -> 81;
                                    case 4 -> 18;
                                    case 5 -> 27;
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
                            array[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0030;
                            }
                            n2 = (s = "V8\u0004K28S").length();
                            n3 = 2;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            array[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0030;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 65)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
    }
    
    public static void setStringarr(final String[] strArr) {
        Initializer.strArr = strArr;
    }
    
    public static String[] getStringarrArray() {
        return Initializer.strArr;
    }
}
