// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5;

import com.target.mod.compat.sub1.sub1.sub7.Initializer_21;

public enum Initializer
{
    COMBAT(array[2]), 
    VISUAL(array[5]), 
    MISC(array[6]), 
    stepF(Initializer_21.computeString(array[3])), 
    CLIENT(array[10]), 
    CART(Initializer_21.computeString(array[8])), 
    SEARCH(array[7]);
    
    private final String strValue;
    private static final Initializer[] StepFArray;
    private static String[] strArr;
    
    private Initializer(final String strValue) {
        this.strValue = strValue;
    }
    
    public String getString() {
        return this.strValue;
    }
    
    private static Initializer[] getStepfarrArray() {
        return new Initializer[] { Initializer.COMBAT, Initializer.VISUAL, Initializer.MISC, Initializer.stepF, Initializer.CLIENT, Initializer.CART, Initializer.SEARCH };
    }
    
    static {
        final String[] array = new String[14];
        int n = 0;
        String s;
        int n2 = (s = "3M \u0004\u0004=E!\u0013\u00063c\u001f2C$\b5^F\u0011c\u0011ZM\u0006&E!\u0005c\u001c\u0006&e\u0001%C<\u0004=e\u00013\u0006#i\u0013\"A8\f v\u0001 p\u0002\t\u0013H\u0015d\u001f\u00063@;\u0015l\u0004\u00063`\u001b5L$\u0006#I3\u0002a\u0018").length();
        final String[] stringarr = null;
        int n3 = 4;
        int n4 = -1;
        setStringarr(stringarr);
    Label_0026:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 40));
                ++n4;
                final String s2 = s;
                final int beginIndex = n4;
                String s3 = s2.substring(beginIndex, beginIndex + n3);
                int n9 = -1;
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    final int length = charArray.length;
                    int n10 = 0;
                    while (true) {
                        Label_0252: {
                            if (length > 1) {
                                break Label_0252;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 88;
                                    case 1 -> 36;
                                    case 2 -> 90;
                                    case 3 -> 120;
                                    case 4 -> 10;
                                    case 5 -> 120;
                                    default -> 25;
                                }));
                                ++n10;
                            } while (n8 == 0);
                        }
                        if (length > n10) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n9) {
                        default: {
                            array[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0026;
                            }
                            n2 = (s = "?O3\u001eo\b\u00039X*").length();
                            n3 = 6;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            array[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0026;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 36)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        StepFArray = getStepfarrArray();
    }
    
    public static void setStringarr(final String[] strArr) {
        Initializer.strArr = strArr;
    }
    
    public static String[] getStringarrArray() {
        return Initializer.strArr;
    }
}
