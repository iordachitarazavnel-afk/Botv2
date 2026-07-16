// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class RaycastHelper
{
    private static final int intValue = 5277;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x149D) + 170;
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
            if (n == 5277) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return RaycastHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 78);
        final char[] charArray = "EFm\u0017O]d_Bx\u0004K\\0a\u0016:D".toCharArray();
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
                        case 0 -> 89;
                        case 1 -> 105;
                        case 2 -> 90;
                        case 3 -> 58;
                        case 4 -> 96;
                        case 5 -> 96;
                        default -> 94;
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
