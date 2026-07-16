// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

public enum Initializer_9
{
    itemD, 
    CROSSBOW;
    
    private static final Initializer_9[] ItemDArray;
    
    private static Initializer_9[] getItemdarrArray() {
        return new Initializer_9[] { Initializer_9.itemD, Initializer_9.CROSSBOW };
    }
    
    static {
        final String[] array = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "r\u0002 \u0014\u0016\u0003Sf\u0003s\u001f8").length();
        int char1 = 8;
        int index = -1;
        Label_0022: {
            break Label_0022;
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
                    Label_0188: {
                        if (length2 > 1) {
                            break Label_0188;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 59;
                                case 1 -> 90;
                                case 2 -> 101;
                                case 3 -> 77;
                                case 4 -> 79;
                                case 5 -> 75;
                                default -> 22;
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
        ItemDArray = getItemdarrArray();
    }
}
