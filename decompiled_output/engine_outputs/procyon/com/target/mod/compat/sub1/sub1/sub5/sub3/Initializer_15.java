// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

enum Initializer_15
{
    SEARCHING, 
    PLANTING, 
    BONEMEALING, 
    MINING, 
    WAIT;
    
    private static final Initializer_15[] ProcIArray;
    
    private static Initializer_15[] getProciarrArray() {
        return new Initializer_15[] { Initializer_15.SEARCHING, Initializer_15.PLANTING, Initializer_15.BONEMEALING, Initializer_15.MINING, Initializer_15.WAIT };
    }
    
    static {
        final String[] array = new String[5];
        int n = 0;
        String s;
        int n2 = (s = "\u000b3^sG\u001aY\u00161\u000b\u001a9QdI\u0017Q\u0014?Qf\u0006\u0015?QhJ\u0015").length();
        int n3 = 9;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 9));
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
                                    case 0 -> 81;
                                    case 1 -> 127;
                                    case 2 -> 22;
                                    case 3 -> 40;
                                    case 4 -> 13;
                                    case 5 -> 91;
                                    default -> 25;
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
                            n2 = (s = "\u0014,Mn\b\u0013!EtK\u0000E\u0004").length();
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
                    n5 = (n6 = (n7 = (n8 = 18)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        ProcIArray = getProciarrArray();
    }
}
