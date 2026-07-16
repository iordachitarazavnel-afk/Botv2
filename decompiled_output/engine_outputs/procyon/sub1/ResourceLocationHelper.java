// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class ResourceLocationHelper
{
    private static final int intValue = 3913;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xF49) + 126;
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
            if (n == 3913) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return ResourceLocationHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 21);
        final char[] charArray = "c!\bS\u000e5@T\b\u0014_\u001a3J^*3Y\u00177FCd\r\rUw".toCharArray();
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
                        case 0 -> 36;
                        case 1 -> 81;
                        case 2 -> 110;
                        case 3 -> 41;
                        case 4 -> 110;
                        case 5 -> 82;
                        default -> 54;
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
