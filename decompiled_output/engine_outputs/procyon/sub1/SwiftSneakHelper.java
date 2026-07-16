// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class SwiftSneakHelper
{
    private static final int intValue = 7540;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1D74) + 243;
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
            if (n == 7540) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return SwiftSneakHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 20);
        final char[] charArray = "\u0013\u00062JYQ\u0007%\u00100dHn\u0019%\u0003{Z\u001c,Y".toCharArray();
        final int length = charArray.length;
        int n4 = 0;
        while (true) {
            Label_0128: {
                if (length > 1) {
                    break Label_0128;
                }
                n3 = (n2 = n4);
                do {
                    final char c = charArray[n2];
                    charArray[n3] = (char)(c ^ (n ^ switch (n4 % 7) {
                        case 0 -> 84;
                        case 1 -> 101;
                        case 2 -> 79;
                        case 3 -> 56;
                        case 4 -> 57;
                        case 5 -> 22;
                        default -> 125;
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
