// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

enum Initializer_11
{
    IDLE, 
    OPENING_GUI, 
    DEPOSITING, 
    CLOSING;
    
    private static final Initializer_11[] NodeEArray;
    
    private static Initializer_11[] getNodeearrArray() {
        return new Initializer_11[] { Initializer_11.IDLE, Initializer_11.OPENING_GUI, Initializer_11.DEPOSITING, Initializer_11.CLOSING };
    }
    
    static {
        final String[] array = new String[4];
        int n = 0;
        String s;
        int n2 = (s = ")Iy7\u0019:[9^i0\u0007%Us*\u0019:[").length();
        int n3 = 11;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 97));
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
                        Label_0244: {
                            if (length > 1) {
                                break Label_0244;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 7;
                                    case 1 -> 120;
                                    case 2 -> 93;
                                    case 3 -> 24;
                                    case 4 -> 49;
                                    case 5 -> 21;
                                    default -> 125;
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
                            n2 = (s = "O=\u0010\\\nB<\fVc](O7\u001b").length();
                            n3 = 4;
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
                    n5 = (n6 = (n7 = (n8 = 1)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        NodeEArray = getNodeearrArray();
    }
}
