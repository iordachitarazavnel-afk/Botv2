// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub1;

public enum Initializer
{
    LEFT, 
    MIDDLE, 
    RIGHT;
    
    private static final Initializer[] BindBArray;
    
    private static Initializer[] getBindbarrArray() {
        return new Initializer[] { Initializer.LEFT, Initializer.MIDDLE, Initializer.RIGHT };
    }
    
    static {
        final String[] array = new String[3];
        int n = 0;
        final String s;
        final int length = (s = "D\\\b\u0016[\u0006[\\\u000b\u001aC2\u0004ZP\t\n").length();
        int char1 = 5;
        int index = -1;
        Label_0021: {
            break Label_0021;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 48);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0188: {
                        if (length2 > 1) {
                            break Label_0188;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 38;
                                case 1 -> 37;
                                case 2 -> 127;
                                case 3 -> 110;
                                case 4 -> 63;
                                case 5 -> 71;
                                default -> 108;
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
        BindBArray = getBindbarrArray();
    }
}
