// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub7;

public enum Initializer
{
    NONE, 
    OPENSHOP, 
    WAIT1, 
    CLICKGEAR, 
    WAIT2, 
    CLICKPEARL, 
    WAIT3, 
    CLICKSTACK, 
    WAIT4, 
    DROPITEMS, 
    WAIT5, 
    cacheD, 
    WAIT6, 
    CLOSE, 
    WAIT7, 
    RESET;
    
    static {
        final String[] array = new String[16];
        int n = 0;
        String s;
        int n2 = (s = "Tw\u001b\u0003w\u0005Tw\u001b\u0003t\u0005Qs\u0001\u0012\u0011\u0005Tw\u001b\u0003v\u0003Ac\u000b\u0005Tw\u001b\u0003q\bLf\u0017\u0019\u0016TCS\n@z\u001b\u0014\u000eOXBu\u0019\u0005Tw\u001b\u0003r\u0004My\u001c\u0012\t@z\u001b\u0014\u000e[IBd\u0005@z\u001d\u0004\u0000\u0005Tw\u001b\u0003p\u0005Tw\u001b\u0003s").length();
        int n3 = 5;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 36));
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
                                    case 0 -> 39;
                                    case 1 -> 18;
                                    case 2 -> 118;
                                    case 3 -> 115;
                                    case 4 -> 97;
                                    case 5 -> 56;
                                    default -> 40;
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
                            n2 = (s = "\u007fE$+1sv}[!\tx[\"83wvqZ").length();
                            n3 = 10;
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
                    n5 = (n6 = (n7 = (n8 = 27)));
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
