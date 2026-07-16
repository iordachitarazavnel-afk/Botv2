// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

enum Initializer_5
{
    IDLE, 
    FINDING_SPAWNER, 
    OPENING_SPAWNER, 
    WAITING_SPAWNER_GUI, 
    LOOTING_BONES, 
    CLOSING_SPAWNER, 
    ORDER_COMMAND, 
    WAIT_ORDER_GUI, 
    SELECT_ORDER_ITEM, 
    WAIT_DELIVERY_GUI, 
    DELIVERING_BONES, 
    WAIT_AFTER_DELIVERY_1, 
    CLOSING_DELIVERY, 
    WAIT_AFTER_CLOSE_DELIVERY, 
    WAIT_CONFIRM_GUI, 
    WAIT_CONFIRM_SETTLE, 
    CLICK_CONFIRM_SLOT, 
    WAIT_AFTER_CONFIRM_1, 
    WAIT_AFTER_CONFIRM_2, 
    WAIT_AFTER_CONFIRM_3, 
    DOUBLE_ESCAPE, 
    DOUBLE_RIGHTCLICK_FIRST, 
    DOUBLE_RIGHTCLICK_SECOND, 
    POST_CYCLE_DELAY;
    
    private static final Initializer_5[] CheckCArray;
    
    private static Initializer_5[] getCheckcarrArray() {
        return new Initializer_5[] { Initializer_5.IDLE, Initializer_5.FINDING_SPAWNER, Initializer_5.OPENING_SPAWNER, Initializer_5.WAITING_SPAWNER_GUI, Initializer_5.LOOTING_BONES, Initializer_5.CLOSING_SPAWNER, Initializer_5.ORDER_COMMAND, Initializer_5.WAIT_ORDER_GUI, Initializer_5.SELECT_ORDER_ITEM, Initializer_5.WAIT_DELIVERY_GUI, Initializer_5.DELIVERING_BONES, Initializer_5.WAIT_AFTER_DELIVERY_1, Initializer_5.CLOSING_DELIVERY, Initializer_5.WAIT_AFTER_CLOSE_DELIVERY, Initializer_5.WAIT_CONFIRM_GUI, Initializer_5.WAIT_CONFIRM_SETTLE, Initializer_5.CLICK_CONFIRM_SLOT, Initializer_5.WAIT_AFTER_CONFIRM_1, Initializer_5.WAIT_AFTER_CONFIRM_2, Initializer_5.WAIT_AFTER_CONFIRM_3, Initializer_5.DOUBLE_ESCAPE, Initializer_5.DOUBLE_RIGHTCLICK_FIRST, Initializer_5.DOUBLE_RIGHTCLICK_SECOND, Initializer_5.POST_CYCLE_DELAY };
    }
    
    static {
        final String[] array = new String[24];
        int n = 0;
        String s;
        int n2 = (s = "\u0014\u001d\u0015g'h'\r\u0007\u000bb9h%\u0000\u0014\u0005\u0015\u0012w1g&\u0006\u0011\t|-i.\u0014\u001d\tn1\u0017\r\u0016\u001b\u000ea\"c?\u0017\u0007\u0018b>c\u0012\u0011\u0018\u0012`%y#\u001d\u001a\u001dj<k?\u0001\u0018\u0014w\u0014\u0005\u0015\u0012w1g&\u0006\u0011\t|-i.\u0014\u001d\tn1\u0014\u0004\u001b\u0010\u0017f\u0014\u0005\u0015\u0012w1g&\u0006\u0011\t|-i.\u0014\u001d\tn1\u0015\u000f\u001d\u0004\u001em'h'\r\u0007\u000bb9h%\u0000\u0013\u0005\u0015\u0012w'h'\r\u0007\u000bb9h%\u0000\u000b\u001cv'\u0010\u0005\u0015\u0012w1e/\u001c\u0012\u0012q#y'\u0007\u001d\u0013\u0005\u0015\u0012w1e/\u001c\u0012\u0012q#y3\u0017\u0000\u000fo+\r\u001d\u0006\u001ff<y#\u001d\u0019\u0016b b\u0015\u0005\u0015\u0012w1g&\u0006\u0011\t|*c,\u001b\u0002\u001eq7yQ\u000f\u0011\u0018\u0014p'h'\r\u0007\u000bb9h%\u0000\u0010\u0011\u0018\u0014p'h'\r\u0010\u001eo'p%\u0000\r\r\u001e\u001b\u0014w'h'\r\u0016\u0014m+u\u000e\u0005\u0015\u0012w1i2\u0016\u0011\t|)s)\u0017\u0016\u001b\u000ea\"c?\u0000\u001d\u001ck:e,\u001b\u0017\u0010|(o2\u0001\u0000\u0018\u0016\u001b\u000ea\"c?\u0000\u001d\u001ck:e,\u001b\u0017\u0010|=c#\u001d\u001a\u001f\u0011\u0001\u0011\u0017f-r?\u001d\u0006\u001ff<y)\u0006\u0011\u0016\u0010\u0016\u0011\u0017j8c2\u001b\u001a\u001c|,i.\u0017\u0007\u0019\u0005\u0015\u0012w1g&\u0006\u0011\t|-j/\u0001\u0011\u0004g+j)\u0004\u0011\tz").length();
        int n3 = 15;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 22));
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
                                    case 0 -> 68;
                                    case 1 -> 66;
                                    case 2 -> 77;
                                    case 3 -> 53;
                                    case 4 -> 120;
                                    case 5 -> 48;
                                    default -> 118;
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
                            n2 = (s = """
                                      \u001d\r
                                      o)z=\u0006\u0005\u0015~$g'\r\u0019
                                      \u0010\u001a\u0003\u0010o)}!	\u0000\u0006d2{4\u000b\u0015""").length();
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
                    n5 = (n6 = (n7 = (n8 = 14)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        CheckCArray = getCheckcarrArray();
    }
}
