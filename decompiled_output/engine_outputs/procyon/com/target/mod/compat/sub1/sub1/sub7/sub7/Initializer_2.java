// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub7;

public enum Initializer_2
{
    ENSURE, 
    ROTATE_DOWN, 
    OFFHAND_XP, 
    THROW_XP, 
    REOFFHAND_TOTEM, 
    ROTATE_BACK, 
    RESET;
    
    static {
        final String[] array = new String[7];
        int n = 0;
        String s;
        int n2 = (s = """
                      $\u0004?5+,Z \u00065\u0002>/.6
                      ?
                      +2==F/\u0014=\u000b"\u00039;(6]2.1\u000b"\u00039;(6]4\u0003:4""").length();
        int n3 = 8;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 116));
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
                                    case 0 -> 4;
                                    case 1 -> 56;
                                    case 2 -> 25;
                                    case 3 -> 14;
                                    case 4 -> 8;
                                    case 5 -> 7;
                                    default -> 118;
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
                            n2 = (s = "\u0011:\r\f\u001b\u000f\u0011:\u0011\u000f\t\bp\r;\u0001\u001d\u0000\u0014t\u000e").length();
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
                    n5 = (n6 = (n7 = (n8 = 71)));
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
