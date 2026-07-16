// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

public enum Initializer_5
{
    NORMAL, 
    POSITIVE, 
    configA;
    
    private static final Initializer_5[] ConfigAArray;
    
    private static Initializer_5[] getConfigaarrArray() {
        return new Initializer_5[] { Initializer_5.NORMAL, Initializer_5.POSITIVE, Initializer_5.configA };
    }
    
    static {
        final String[] array = new String[3];
        int n = 0;
        final String s;
        final int length = (s = ",tE\u0006-}QE\bu\b3}PA\u001dp\u0013&").length();
        int char1 = 3;
        int index = -1;
        Label_0021: {
            break Label_0021;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 10);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0187: {
                        if (length2 > 1) {
                            break Label_0187;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 105;
                                case 1 -> 56;
                                case 2 -> 9;
                                case 3 -> 2;
                                case 4 -> 67;
                                case 5 -> 51;
                                default -> 79;
                            }));
                            ++n5;
                        } while (n2 == 0);
                    }
                    if (length2 > n5) {
                        continue;
                    }
                    break;
                }
                array[n++] = new String(charArray).intern();
            } while ((index += char1) < length);
        }
        ConfigAArray = getConfigaarrArray();
    }
}
