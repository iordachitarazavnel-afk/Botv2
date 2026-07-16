// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub7;

public enum Initializer_1
{
    NONE, 
    OPENSHOP, 
    WAIT1, 
    CLICKFOOD, 
    WAIT2, 
    CLICKCARROT, 
    WAIT3, 
    CLICKSTACK, 
    WAIT4, 
    DROPITEMS, 
    WAIT5, 
    configA, 
    WAIT6, 
    CLOSE, 
    WAIT7, 
    RESET;
    
    static {
        final String[] array = new String[16];
        int n = 0;
        String s;
        int n2 = (s = "vQ\u0012~T\teB\u0014z,\u0011LlC\u0005b\\\u0014y \u000bb\\\u0012i.\u0006HsB\u0014~\u0004o_\u0015o\u0005vQ\u0012~P\u0003cE\u0002\u0005vQ\u0012~R\u0005vQ\u0012~V\u0005sU\bo1\tb\\\u0012i.\u0003FnT\u0005vQ\u0012~S\bn@\u001ed6\rFq\u0005vQ\u0012~Q").length();
        int n3 = 5;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 90));
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
                                    case 0 -> 123;
                                    case 1 -> 74;
                                    case 2 -> 1;
                                    case 3 -> 112;
                                    case 4 -> 63;
                                    case 5 -> 31;
                                    default -> 83;
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
                            n2 = (s = "Hv8C\u0004<wJy:\u0005\\{8T}").length();
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
                    n5 = (n6 = (n7 = (n8 = 112)));
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
