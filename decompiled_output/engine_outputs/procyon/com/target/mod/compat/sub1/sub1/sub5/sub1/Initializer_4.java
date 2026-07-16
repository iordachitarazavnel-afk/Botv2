// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub1;

public enum Initializer_4
{
    LEFT, 
    MIDDLE, 
    RIGHT;
    
    private static final Initializer_4[] WrapAArray;
    
    private static Initializer_4[] getWrapaarrArray() {
        return new Initializer_4[] { Initializer_4.LEFT, Initializer_4.MIDDLE, Initializer_4.RIGHT };
    }
    
    static {
        final String[] array = new String[3];
        int n = 0;
        final String s;
        final int length = (s = "\u0016YCI\u0005\bUBU>\u0006\u0017UAY&\u0019").length();
        int char1 = 4;
        int index = -1;
        Label_0021: {
            break Label_0021;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 17);
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
                                case 0 -> 75;
                                case 1 -> 13;
                                case 2 -> 20;
                                case 3 -> 12;
                                case 4 -> 123;
                                case 5 -> 77;
                                default -> 81;
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
        WrapAArray = getWrapaarrArray();
    }
}
