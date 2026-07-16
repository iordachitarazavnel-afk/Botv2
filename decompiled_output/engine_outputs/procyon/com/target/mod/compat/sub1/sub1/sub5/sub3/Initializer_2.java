// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

enum Initializer_2
{
    IDLE, 
    WAITING_FOR_GUI, 
    CLICKING_CONFIRM;
    
    private static final Initializer_2[] CacheAArray;
    
    private static Initializer_2[] getCacheaarrArray() {
        return new Initializer_2[] { Initializer_2.IDLE, Initializer_2.WAITING_FOR_GUI, Initializer_2.CLICKING_CONFIRM };
    }
    
    static {
        final String[] array = new String[3];
        int n = 0;
        final String s;
        final int length = (s = "lCF\u0000XS\u0002dD@\u0006NZ\u0010r\u0010xNF\u0017ZT\u000b|]L\u001b_[\fiO\u0004rFC\u0011").length();
        int char1 = 15;
        int index = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 98);
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
                                case 0 -> 89;
                                case 1 -> 96;
                                case 2 -> 109;
                                case 3 -> 54;
                                case 4 -> 115;
                                case 5 -> 127;
                                default -> 39;
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
        CacheAArray = getCacheaarrArray();
    }
}
