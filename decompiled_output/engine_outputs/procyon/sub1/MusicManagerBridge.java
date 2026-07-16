// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class MusicManagerBridge
{
    private static final int intValue = 5525;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1595) + 178;
    }
    
    public static boolean checkObject(final Object o) {
        final int int_1 = WrittenBookHelper.getInt_1();
        Object o2 = o;
        if (int_1 == 0) {
            if (o == null) {
                return false;
            }
            o2 = o;
        }
        int hashCode;
        final int n = hashCode = o2.hashCode();
        if (int_1 == 0) {
            if (n == 5525) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return MusicManagerBridge.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 71);
        final char[] charArray = "\u000eT$ZH\u001b5-@0VY\u0014&*E0V\u000b em\u0011".toCharArray();
        final int length = charArray.length;
        int n4 = 0;
        while (true) {
            Label_0127: {
                if (length > 1) {
                    break Label_0127;
                }
                n3 = (n2 = n4);
                do {
                    final char c = charArray[n2];
                    charArray[n3] = (char)(c ^ (n ^ switch (n4 % 7) {
                        case 0 -> 4;
                        case 1 -> 102;
                        case 2 -> 16;
                        case 3 -> 116;
                        case 4 -> 108;
                        case 5 -> 17;
                        default -> 19;
                    }));
                    ++n4;
                } while (n == 0);
            }
            if (length <= n4) {
                strValue = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
