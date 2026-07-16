// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

public enum Initializer_19
{
    wrapK, 
    CROSSBOW;
    
    private static final Initializer_19[] WrapKArray;
    
    private static Initializer_19[] getWrapkarrArray() {
        return new Initializer_19[] { Initializer_19.wrapK, Initializer_19.CROSSBOW };
    }
    
    static {
        final String[] array = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "X\u0006S\bY\u001bK\\cl?M").length();
        int char1 = 3;
        int index = -1;
        Label_0021: {
            break Label_0021;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 51);
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
                                case 0 -> 41;
                                case 1 -> 122;
                                case 2 -> 55;
                                case 3 -> 60;
                                case 4 -> 3;
                                case 5 -> 29;
                                default -> 67;
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
        WrapKArray = getWrapkarrArray();
    }
}
