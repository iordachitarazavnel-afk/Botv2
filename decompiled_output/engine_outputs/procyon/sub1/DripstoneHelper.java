// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class DripstoneHelper
{
    private static final int intValue = 2146;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x862) + 69;
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
            if (n == 2146) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return DripstoneHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 65);
        final char[] charArray = "2E_:1:\u001f\u0018R~/.>\u0015\u0004\u0017@{l~".toCharArray();
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
                        case 0 -> 55;
                        case 1 -> 118;
                        case 2 -> 119;
                        case 3 -> 11;
                        case 4 -> 3;
                        case 5 -> 15;
                        default -> 49;
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
