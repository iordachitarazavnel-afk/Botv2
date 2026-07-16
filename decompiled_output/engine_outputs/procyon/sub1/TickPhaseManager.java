// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class TickPhaseManager
{
    private static final int intValue = 4874;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x130A) + 157;
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
            if (n == 4874) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return TickPhaseManager.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 61);
        final char[] charArray = "\u001cQ\u0003\u0001]u+;]-\u000bc|--J@\u001c<3z".toCharArray();
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
                        case 0 -> 117;
                        case 1 -> 5;
                        case 2 -> 93;
                        case 3 -> 87;
                        case 4 -> 48;
                        case 5 -> 32;
                        default -> 119;
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
