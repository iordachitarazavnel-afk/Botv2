// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

public enum Initializer_18
{
    SUCCESS, 
    ERROR, 
    WARNING, 
    INFO, 
    MODULE_ENABLED, 
    MODULE_DISABLED, 
    CONFIG_SAVE, 
    CONFIG_LOAD, 
    KEYBIND_CHANGE, 
    FRIEND_JOIN, 
    FRIEND_LEAVE, 
    LOW_TOTEM, 
    CUSTOM;
    
    private static final Initializer_18[] PackHArray;
    
    private static Initializer_18[] getPackharrArray() {
        return new Initializer_18[] { Initializer_18.SUCCESS, Initializer_18.ERROR, Initializer_18.WARNING, Initializer_18.INFO, Initializer_18.MODULE_ENABLED, Initializer_18.MODULE_DISABLED, Initializer_18.CONFIG_SAVE, Initializer_18.CONFIG_LOAD, Initializer_18.KEYBIND_CHANGE, Initializer_18.FRIEND_JOIN, Initializer_18.FRIEND_LEAVE, Initializer_18.LOW_TOTEM, Initializer_18.CUSTOM };
    }
    
    static {
        final String[] array = new String[13];
        int n = 0;
        String s;
        int n2 = (s = """
                      \u0011\u001c\u001d\u0013L6W\u0019\u001d\u0018\u0004L6L\u0005\u0019\u0001\u000b	R\u0007\u000b\u0012\u000b\bI=O\u0006\u001f\u0006
                      \u0012O>\u000f\u0011\u001c\u001d\u0013L6W\u0018\u001a
                      \u0007B?M\u0018\u000b\u001a\u0001\u0010\u0003N7W\u0016\u001c\u0010\b\u000b\u001f\u001c\u0017\u0000I4W\u0010\u001c\u0018\u0002	\u0010\u001c\u000e\u0019T<\\u0019\u001e\u0004\u0015\u001d\u001f	\f\u001a\u0001\u0010\u0003N7W\u0010\u0016\u0018\u0010E\u000b\u001f\u001c\u0017\u0000I4W\u000f\u0012\u000f\u0003""").length();
        int n3 = 14;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 30));
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
                        Label_0248: {
                            if (length > 1) {
                                break Label_0248;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 66;
                                    case 1 -> 77;
                                    case 2 -> 71;
                                    case 3 -> 88;
                                    case 4 -> 30;
                                    case 5 -> 109;
                                    default -> 22;
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
                                continue Label_0023;
                            }
                            n2 = (s = "TUCG\n~\u000f@SRD\rw\u000e\u0007LEYF\u0006c\u0018").length();
                            n3 = 14;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            array[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0023;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 93)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        PackHArray = getPackharrArray();
    }
}
