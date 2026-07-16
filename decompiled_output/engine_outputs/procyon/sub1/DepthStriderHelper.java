// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class DepthStriderHelper
{
    private static final int intValue = 7602;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1DB2) + 245;
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
            if (n == 7602) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return DepthStriderHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 82);
        final char[] charArray = ")\u0001p@*6\u0004\u001f\rdQ0-\u0015\u0001\u0014eFb\u0013ACT".toCharArray();
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
                        case 0 -> 63;
                        case 1 -> 54;
                        case 2 -> 82;
                        case 3 -> 102;
                        case 4 -> 16;
                        case 5 -> 55;
                        default -> 34;
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
