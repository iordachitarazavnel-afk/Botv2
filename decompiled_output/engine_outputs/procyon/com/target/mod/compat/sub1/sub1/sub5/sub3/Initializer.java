// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

public enum Initializer
{
    SHULKERS, 
    SHULKER_SHELLS;
    
    private static final Initializer[] BuffGArray;
    
    private static Initializer[] getBuffgarrArray() {
        return new Initializer[] { Initializer.SHULKERS, Initializer.SHULKER_SHELLS };
    }
    
    static {
        final String[] array = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "\u0000g\u0013 \u007f),\f|\u000e)x -\b\u0000g\u0013 \u007f),\u0000").length();
        int char1 = 14;
        int index = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 67);
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
                                case 0 -> 16;
                                case 1 -> 108;
                                case 2 -> 5;
                                case 3 -> 47;
                                case 4 -> 119;
                                case 5 -> 47;
                                default -> 61;
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
        BuffGArray = getBuffgarrArray();
    }
}
