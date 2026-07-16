// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

enum Initializer_3
{
    random, 
    naeast, 
    nawest, 
    euwest, 
    eucentral, 
    asia, 
    oceania;
    
    private static final Initializer_3[] CacheMArray;
    
    private static Initializer_3[] getCachemarrArray() {
        return new Initializer_3[] { Initializer_3.random, Initializer_3.naeast, Initializer_3.nawest, Initializer_3.euwest, Initializer_3.eucentral, Initializer_3.asia, Initializer_3.oceania };
    }
    
    static {
        final String[] array = new String[7];
        int n = 0;
        String s;
        int n2 = (s = "\u0006*\\\u0004''\u0006\u0006*N\u0000''\u0006\r>N\u0000''\t\r>Z\u0000:'W\t'\u0004\t8P\u0004").length();
        int n3 = 6;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 43));
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
                                    case 0 -> 67;
                                    case 1 -> 96;
                                    case 2 -> 18;
                                    case 3 -> 78;
                                    case 4 -> 127;
                                    case 5 -> 120;
                                    default -> 14;
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
                            n2 = (s = "\u007fP$|BB<\u0006bR/yCF").length();
                            n3 = 7;
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
                    n5 = (n6 = (n7 = (n8 = 83)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        CacheMArray = getCachemarrArray();
    }
}
