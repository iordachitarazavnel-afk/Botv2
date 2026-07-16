// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class EncryptionHelper
{
    private static final int intValue = 3696;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xE70) + 119;
    }
    
    public static boolean checkObject(final Object o) {
        final int int1 = WrittenBookHelper.getInt();
        Object o2 = o;
        if (int1 != 0) {
            if (o == null) {
                return false;
            }
            o2 = o;
        }
        int hashCode;
        final int n = hashCode = o2.hashCode();
        if (int1 != 0) {
            if (n == 3696) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return EncryptionHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 17);
        final char[] charArray = "2#+zp1&\u001e\"&@l-\"\u0012?h~8ob".toCharArray();
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
                        case 0 -> 102;
                        case 1 -> 92;
                        case 2 -> 89;
                        case 3 -> 25;
                        case 4 -> 24;
                        case 5 -> 80;
                        default -> 67;
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
