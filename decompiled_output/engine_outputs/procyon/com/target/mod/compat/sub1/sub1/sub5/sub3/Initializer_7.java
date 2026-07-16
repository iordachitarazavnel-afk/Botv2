// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

enum Initializer_7
{
    NONE, 
    SHOP, 
    SHOP_END, 
    SHOP_ITEM, 
    SHOP_GLASS_PANE, 
    SHOP_BUY, 
    SHOP_CONFIRM, 
    SHOP_CHECK_FULL, 
    SHOP_EXIT, 
    WAIT, 
    ORDERS, 
    ORDERS_SELECT, 
    ORDERS_EXIT, 
    ORDERS_CONFIRM, 
    ORDERS_FINAL_EXIT, 
    CYCLE_PAUSE, 
    TARGET_ORDERS;
    
    private static final Initializer_7[] CoreHArray;
    
    private static Initializer_7[] getCoreharrArray() {
        return new Initializer_7[] { Initializer_7.NONE, Initializer_7.SHOP, Initializer_7.SHOP_END, Initializer_7.SHOP_ITEM, Initializer_7.SHOP_GLASS_PANE, Initializer_7.SHOP_BUY, Initializer_7.SHOP_CONFIRM, Initializer_7.SHOP_CHECK_FULL, Initializer_7.SHOP_EXIT, Initializer_7.WAIT, Initializer_7.ORDERS, Initializer_7.ORDERS_SELECT, Initializer_7.ORDERS_EXIT, Initializer_7.ORDERS_CONFIRM, Initializer_7.ORDERS_FINAL_EXIT, Initializer_7.CYCLE_PAUSE, Initializer_7.TARGET_ORDERS };
    }
    
    static {
        final String[] array = new String[17];
        int n = 0;
        String s;
        int n2 = (s = "\u0004C&#MG\u0018\u001fP0!Z@\u000f\u0003J;4WT\u000b\u0011Q';XR\t\u0015\b\u0003J;4WQ\u0012\t\u0011\u001fP0!Z@\u0018\u0016K:%DL\u0002\bK \u0004\u001eM:!\u000b\u001fP0!Z@\u0018\u0015Z=0\f\u0003J;4WP\b\u001eD=6E\u0006\u001fP0!Z@\u000e\u001fP0!Z@\u0018\u0013M:\"AA\n\u000f\u0003J;4WP\u000f\u0015A?;NF\u000b\u001c\t\u0003J;4WV\u001f\u0019V\r\u001fP0!Z@\u0018\u0003G8!KG\u0004\u0007C=0\u0004\u0003J;4\t\u0003J;4WZ\u0013\u0015O").length();
        int n3 = 13;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 4));
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
                                    case 0 -> 84;
                                    case 1 -> 6;
                                    case 2 -> 112;
                                    case 3 -> 96;
                                    case 4 -> 12;
                                    case 5 -> 23;
                                    default -> 67;
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
                            n2 = (s = ";s\u001f\u0000ed?9\u007f\u000f\t\b+b\u0013\u001c\u007f~!<").length();
                            n3 = 11;
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
                    n5 = (n6 = (n7 = (n8 = 44)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        CoreHArray = getCoreharrArray();
    }
}
