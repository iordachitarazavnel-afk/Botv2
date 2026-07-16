// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub7;

public enum Initializer_3
{
    NONE, 
    OPENSHOP, 
    WAIT1, 
    CLICKGEAR, 
    WAIT2, 
    CLICKOBI, 
    WAIT3, 
    CLICKSTACK, 
    WAIT4, 
    DROPITEMS, 
    WAIT5, 
    eventC, 
    WAIT6, 
    CLOSE, 
    WAIT7, 
    RESET;
    
    static {
        final String[] array = new String[16];
        int n = 0;
        String s;
        int n2 = (s = "[_3\u0016d\u0003ZF%\u0005OR5\u0011\u0012\u0005JV/\u0000u\u0005OR5\u0011\u0013\u0005OR5\u0011\u0014\u0005OR5\u0011\u0010\t\\A3\u0015h\u000b\\U@\b[_5\u0006j\u0010[Q\t[_5\u0006j\u0018\\YA\bWC9\u000br\u0017VH\u0005OR5\u0011\u0016\n[_5\u0006j\fMYP7\u0005OR5\u0011\u0015").length();
        int n3 = 5;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 26));
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
                        Label_0242: {
                            if (length > 1) {
                                break Label_0242;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 2;
                                    case 1 -> 9;
                                    case 2 -> 102;
                                    case 3 -> 95;
                                    case 4 -> 59;
                                    case 5 -> 69;
                                    default -> 3;
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
                            n2 = (s = "\"?X|z\u0004;1_m").length();
                            n3 = 5;
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
                    n5 = (n6 = (n7 = (n8 = 119)));
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
}
