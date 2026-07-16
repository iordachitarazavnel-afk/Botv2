// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

public enum Initializer_13
{
    packL, 
    Helmet, 
    Chestplate, 
    Leggings, 
    Boots, 
    Sword, 
    Pickaxe, 
    Shovel;
    
    private static final Initializer_13[] PackLArray;
    private static String[] strArr;
    
    private static Initializer_13[] getPacklarrArray() {
        return new Initializer_13[] { Initializer_13.packL, Initializer_13.Helmet, Initializer_13.Chestplate, Initializer_13.Leggings, Initializer_13.Boots, Initializer_13.Sword, Initializer_13.Pickaxe, Initializer_13.Shovel };
    }
    
    static {
        final String[] array = new String[8];
        final String[] stringarr = new String[5];
        int n = 0;
        setStringarr(stringarr);
        String s;
        int n2 = (s = "o\u0005@\nm\u0001I\u0011{2!O\u001dI\bb\fK\u0005f,*]\u0005l\u0006C\u0016|\u0007~\u0000O\tn:(\u0006f\f@\u000fj6").length();
        int n3 = 3;
        int n4 = -1;
    Label_0029:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 42));
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
                        Label_0251: {
                            if (length > 1) {
                                break Label_0251;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 4;
                                    case 1 -> 67;
                                    case 2 -> 6;
                                    case 3 -> 72;
                                    case 4 -> 37;
                                    case 5 -> 104;
                                    default -> 103;
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
                                continue Label_0029;
                            }
                            n2 = (s = "\u0003\u007f=j\u0014P\u0005\u0003`=n\u0015").length();
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
                            break Label_0029;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 84)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        PackLArray = getPacklarrArray();
    }
    
    public static void setStringarr(final String[] strArr) {
        Initializer_13.strArr = strArr;
    }
    
    public static String[] getStringarrArray() {
        return Initializer_13.strArr;
    }
}
