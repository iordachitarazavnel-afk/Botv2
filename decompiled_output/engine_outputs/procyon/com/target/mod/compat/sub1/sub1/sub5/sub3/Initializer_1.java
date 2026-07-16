// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

public enum Initializer_1
{
    buildB(array[1], 0), 
    MANUAL(array[3], 1);
    
    private static final Initializer_1[] BuildBArray;
    
    private Initializer_1(final String s, final int n) {
    }
    
    private static Initializer_1[] getBuildbarrArray() {
        return new Initializer_1[] { Initializer_1.buildB, Initializer_1.MANUAL };
    }
    
    static {
        final String[] array = new String[4];
        int n = 0;
        String s;
        int n2 = (s = "y2 wE8\u0003u#'").length();
        int n3 = 6;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 48));
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
                        Label_0243: {
                            if (length > 1) {
                                break Label_0243;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 4;
                                    case 1 -> 67;
                                    case 2 -> 94;
                                    case 3 -> 18;
                                    case 4 -> 52;
                                    case 5 -> 68;
                                    default -> 109;
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
                            n2 = (s = "\u000fY]\u0006\u0003HZ\r?B").length();
                            n3 = 3;
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
                    n5 = (n6 = (n7 = (n8 = 74)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        BuildBArray = getBuildbarrArray();
    }
}
