// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub7;

public enum Initializer_4
{
    NONE, 
    MINING, 
    GOABOVEHAZARD, 
    YRECOVERY, 
    BUYOBI, 
    PEARL, 
    BUYPEARL, 
    AUTOMEND, 
    BUYXP, 
    AUTOEAT, 
    BUYCARROT;
    
    static {
        final String[] array = new String[11];
        int n = 0;
        String s;
        int n2 = (s = "\"'S;\u0016~D),\u0005+0W*\u0015\u00069 O7\u001ba\u00045:X=\u0007: B7\u001ciU\b: B7\u0014mO?\r<:W:\u0016~D34L9\u000bl\b9 O(\u001ciS7\u00066<X1\u0017o").length();
        int n3 = 9;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 20));
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
                        Label_0247: {
                            if (length > 1) {
                                break Label_0247;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 111;
                                    case 1 -> 97;
                                    case 2 -> 2;
                                    case 3 -> 108;
                                    case 4 -> 77;
                                    case 5 -> 60;
                                    default -> 21;
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
                                continue Label_0023;
                            }
                            n2 = (s = "IP?Py\tIP?Kh\n#DQ").length();
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
                            break Label_0023;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 100)));
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
