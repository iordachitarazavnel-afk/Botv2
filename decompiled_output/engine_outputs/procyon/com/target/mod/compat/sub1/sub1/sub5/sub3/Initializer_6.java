// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

enum Initializer_6
{
    IDLE, 
    FINDING_SPAWNER, 
    OPENING_SPAWNER, 
    WAITING_FOR_GUI, 
    CLICKING_SLOT_46, 
    WAITING_DELAY, 
    CLICKING_SLOT_50, 
    CHECKING_SLOT_50, 
    CHECKING_SLOTS_FOR_ARROWS, 
    CLICKING_DROP_ALL, 
    CLICKING_NEXT_PAGE, 
    RE_CHECKING_SLOTS;
    
    private static final Initializer_6[] CheckOArray;
    
    private static Initializer_6[] getCheckoarrArray() {
        return new Initializer_6[] { Initializer_6.IDLE, Initializer_6.FINDING_SPAWNER, Initializer_6.OPENING_SPAWNER, Initializer_6.WAITING_FOR_GUI, Initializer_6.CLICKING_SLOT_46, Initializer_6.WAITING_DELAY, Initializer_6.CLICKING_SLOT_50, Initializer_6.CHECKING_SLOT_50, Initializer_6.CHECKING_SLOTS_FOR_ARROWS, Initializer_6.CLICKING_DROP_ALL, Initializer_6.CLICKING_NEXT_PAGE, Initializer_6.RE_CHECKING_SLOTS };
    }
    
    static {
        final String[] array = new String[12];
        int n = 0;
        String s;
        int n2 = (s = "Af%k\u0002yYEu?d\u0006dH7\u001a\u000fMz)f\u0000~P]y<i\u001e~RP\u0010Ab)k\u0002yYEu?d\u0006dH7\u001a\u0019Ab)k\u0002yYEu?d\u0006dD]l#z\u0016qEPe;{\u000fDc\"l\u0000~P]y<i\u001e~RP\u0004Kn m\u0011Af%k\u0002yYEu(z\u0006`HCf \u0011Po3k\u0001uTIc\"o\u0016c[M~?\u000fUk%|\u0000~P]l#z\u0016wBK\u0010Af%k\u0002yYEu?d\u0006dH6\u001c").length();
        int n3 = 16;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 62));
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
                                    case 0 -> 60;
                                    case 1 -> 20;
                                    case 2 -> 82;
                                    case 3 -> 22;
                                    case 4 -> 119;
                                    case 5 -> 14;
                                    default -> 41;
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
                            n2 = (s = "\"\u0005F\ba\u001a:&\u0016A\u000er\u0007+1\bH\u000e\r6\bF\u001fc\u001d3>\rJ\u0007k\n").length();
                            n3 = 18;
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
        CheckOArray = getCheckoarrArray();
    }
}
