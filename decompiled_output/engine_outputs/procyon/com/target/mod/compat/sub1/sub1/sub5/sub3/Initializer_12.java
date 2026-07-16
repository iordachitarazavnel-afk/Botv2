// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

public enum Initializer_12
{
    CRAWL, 
    STANDING, 
    AMETHYST;
    
    private static final Initializer_12[] NodeQArray;
    
    private static Initializer_12[] getNodeqarrArray() {
        return new Initializer_12[] { Initializer_12.CRAWL, Initializer_12.STANDING, Initializer_12.AMETHYST };
    }
    
    static {
        final String[] array = new String[3];
        int n = 0;
        final String s;
        final int length = (s = "\u001f8\u0018<X]m\n\u0005\u001d'\u001c?\\\b\r!\u001c&TMp\u0019").length();
        int char1 = 8;
        int index = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 114);
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
                                case 0 -> 44;
                                case 1 -> 7;
                                case 2 -> 47;
                                case 3 -> 26;
                                case 4 -> 98;
                                case 5 -> 118;
                                default -> 76;
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
        NodeQArray = getNodeqarrArray();
    }
}
