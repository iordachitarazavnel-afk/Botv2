// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

enum Initializer_10
{
    CHECKING, 
    FINDSPAWNER, 
    MINING, 
    FINDENDERCHEST, 
    OPENENDERCHEST, 
    DUMPINVENTORY;
    
    private static final Initializer_10[] ItemPArray;
    
    private static Initializer_10[] getItemparrArray() {
        return new Initializer_10[] { Initializer_10.CHECKING, Initializer_10.FINDSPAWNER, Initializer_10.MINING, Initializer_10.FINDENDERCHEST, Initializer_10.OPENENDERCHEST, Initializer_10.DUMPINVENTORY };
    }
    
    static {
        final String[] array = new String[6];
        int n = 0;
        String s;
        int n2 = (s = "\u00134'#\u0002\u000b\u0017\u00196!%\u0002\u0016\u0007\u000e\u001a-,)\u0002\u000b\u0017\u00196!%\u0002\u0016\u0007\r\u00181/=\u000e\u000b\u0005\u0019*6\"\u0015\u001c\b\u001f,'.\f\f\u001d\u001b").length();
        int n3 = 14;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 106));
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
                                    case 0 -> 54;
                                    case 1 -> 14;
                                    case 2 -> 8;
                                    case 3 -> 7;
                                    case 4 -> 45;
                                    case 5 -> 47;
                                    default -> 57;
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
                            n2 = (s = ",\u0010\u0011\u00194?\u000b'\u0010\u0011\u0014)(/6\u0017\u001a\u0002").length();
                            n3 = 6;
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
                    n5 = (n6 = (n7 = (n8 = 87)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        ItemPArray = getItemparrArray();
    }
}
