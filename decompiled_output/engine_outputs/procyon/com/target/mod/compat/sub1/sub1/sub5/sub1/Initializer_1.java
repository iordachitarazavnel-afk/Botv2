// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub1;

public enum Initializer_1
{
    NORMAL, 
    LOWERCASE, 
    UPPERCASE;
    
    private static final Initializer_1[] PackCArray;
    
    private static Initializer_1[] getPackcarrArray() {
        return new Initializer_1[] { Initializer_1.NORMAL, Initializer_1.LOWERCASE, Initializer_1.UPPERCASE };
    }
    
    static {
        final String[] array = new String[3];
        int n = 0;
        final String s;
        final int length = (s = "\f@\u001a\u001c`07\u0013J\u0006\u000e@\u001f\u0014s?\t\u0015_\u001d\u001c`07\u0013J").length();
        int char1 = 9;
        int index = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 38);
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
                                case 0 -> 102;
                                case 1 -> 41;
                                case 2 -> 107;
                                case 3 -> 127;
                                case 4 -> 20;
                                case 5 -> 85;
                                default -> 80;
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
        PackCArray = getPackcarrArray();
    }
}
