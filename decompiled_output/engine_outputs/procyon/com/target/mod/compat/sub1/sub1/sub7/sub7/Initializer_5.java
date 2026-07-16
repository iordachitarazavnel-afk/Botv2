// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub7;

public enum Initializer_5
{
    NONE, 
    OPENSHOP, 
    WAIT1, 
    CLICKGEAR, 
    WAIT2, 
    CLICKXP, 
    WAIT3, 
    CLICKSTACK, 
    WAIT4, 
    DROPITEMS, 
    WAIT5, 
    syncF, 
    WAIT6, 
    CLOSE, 
    WAIT7, 
    RESET;
    
    private static boolean boolFlag;
    
    static {
        final String[] array = new String[16];
        final boolean bool = true;
        int n = 0;
        String s;
        int n2 = (s = """
                      J\u0017-\u001e\u0005S\u0019*\u000f
                      \u0005V\u001d0\u001em\u0005S\u0019*\u000f\r\u0005G\u0014,\b|\u0005S\u0019*\u000f\u000b
                      G\u0014*\u0018rT4E\u001b(\u0005S\u0019*\u000f\u000e	@
                      ,\u000bpS%I\u000b\u0007G\u0014*\u0018r_0\bK\b&\u0015jO/T\u0005S\u0019*\u000f\f\u0005S\u0019*\u000f\u000f	G\u0014*\u0018r@%E
                      """).length();
        int n3 = 4;
        setBool(bool);
        int n4 = -1;
    Label_0026:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 66));
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
                                    case 0 -> 70;
                                    case 1 -> 26;
                                    case 2 -> 33;
                                    case 3 -> 25;
                                    case 4 -> 123;
                                    case 5 -> 69;
                                    default -> 34;
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
                            n2 = (s = "z0\u0003&!\u0003o$\u0013").length();
                            n3 = 5;
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
                    n5 = (n6 = (n7 = (n8 = 107)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
    }
    
    public static void setBool(final boolean boolFlag) {
        Initializer_5.boolFlag = boolFlag;
    }
    
    public static boolean isEnabled() {
        return Initializer_5.boolFlag;
    }
    
    public static boolean isEnabled_1() {
        return !isEnabled();
    }
}
