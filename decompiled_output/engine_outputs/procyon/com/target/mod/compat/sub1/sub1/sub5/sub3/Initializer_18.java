// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

enum Initializer_18
{
    viewR, 
    TOWER;
    
    private static final Initializer_18[] ViewRArray;
    
    private static Initializer_18[] getViewrarrArray() {
        return new Initializer_18[] { Initializer_18.viewR, Initializer_18.TOWER };
    }
    
    static {
        final String[] array = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "\u0017QK\u0005\u0007W[\u000fz").length();
        int char1 = 3;
        int index = -1;
        Label_0021: {
            break Label_0021;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 92);
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
                                case 0 -> 15;
                                case 1 -> 68;
                                case 2 -> 80;
                                case 3 -> 22;
                                case 4 -> 116;
                                case 5 -> 17;
                                default -> 105;
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
        ViewRArray = getViewrarrArray();
    }
}
