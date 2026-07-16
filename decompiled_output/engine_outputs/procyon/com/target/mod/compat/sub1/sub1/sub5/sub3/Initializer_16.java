// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

enum Initializer_16
{
    NONE, 
    OPEN_ORDERS, 
    WAIT_ORDERS_GUI, 
    CLICK_SLOT_51, 
    WAIT_SECOND_GUI, 
    CLICK_TARGET_ITEM, 
    WAIT_THIRD_GUI, 
    CLICK_CHEST_SLOT, 
    WAIT_ITEMS_GUI, 
    COLLECT_ITEMS, 
    CLOSE_GUI;
    
    private static final Initializer_16[] StepJArray;
    
    private static Initializer_16[] getStepjarrArray() {
        return new Initializer_16[] { Initializer_16.NONE, Initializer_16.OPEN_ORDERS, Initializer_16.WAIT_ORDERS_GUI, Initializer_16.CLICK_SLOT_51, Initializer_16.WAIT_SECOND_GUI, Initializer_16.CLICK_TARGET_ITEM, Initializer_16.WAIT_THIRD_GUI, Initializer_16.CLICK_CHEST_SLOT, Initializer_16.WAIT_ITEMS_GUI, Initializer_16.COLLECT_ITEMS, Initializer_16.CLOSE_GUI };
    }
    
    static {
        final String[] array = new String[11];
        int n = 0;
        String s;
        int n2 = (s = """
                      $*gFrz\u0010:9jMj{\u0011\u000f$*gFra
                      7.|Ari\r:\u00100'gQfq\u001b;.}Fr}\u0014<?\u000f$*gFr}\u001d0$`Vri\r:\r0$b^hm\f,"zW`}\u0004=$`W\u000b<;k\ra
                      7.|A\u000e$*gFrg\f6&}Mj{\u0011	0'aAhq\u001f&"""").length();
        int n3 = 14;
        int n4 = -1;
    Label_0023:
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
                                    case 0 -> 49;
                                    case 1 -> 41;
                                    case 2 -> 108;
                                    case 3 -> 80;
                                    case 4 -> 111;
                                    case 5 -> 108;
                                    default -> 26;
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
                            n2 = (s = "\t\u001e^h_H5\u000b\u0000Pn@H(\u001e\u0017Z\r\t\u001e^h_H2\u0006\u001dCt!&").length();
                            n3 = 17;
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
                    n5 = (n6 = (n7 = (n8 = 123)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        StepJArray = getStepjarrArray();
    }
}
