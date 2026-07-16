// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

public enum Initializer_4
{
    BUY_AND_SELL, 
    BUY_ONLY, 
    SELL_ONLY, 
    ORDER_ONLY;
    
    private static final Initializer_4[] CalcFArray;
    
    private static Initializer_4[] getCalcfarrArray() {
        return new Initializer_4[] { Initializer_4.BUY_AND_SELL, Initializer_4.BUY_ONLY, Initializer_4.SELL_ONLY, Initializer_4.ORDER_ONLY };
    }
    
    static {
        final String[] array = new String[4];
        int n = 0;
        String s;
        int n2 = (s = "y=\fS$oFd;\u0010@)\th-\u0019@:nLw1").length();
        int n3 = 12;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 123));
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
                        Label_0248: {
                            if (length > 1) {
                                break Label_0248;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 64;
                                    case 1 -> 19;
                                    case 2 -> 46;
                                    case 3 -> 119;
                                    case 4 -> 30;
                                    case 5 -> 90;
                                    default -> 121;
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
                                continue Label_0022;
                            }
                            n2 = (s = "x<\rR+nOc\nu;\u0010H6\u007fLt%\r").length();
                            n3 = 8;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            array[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0022;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 122)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        CalcFArray = getCalcfarrArray();
    }
}
