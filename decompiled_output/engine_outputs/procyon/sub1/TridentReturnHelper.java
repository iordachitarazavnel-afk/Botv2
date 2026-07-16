// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class TridentReturnHelper
{
    private static final int intValue = 7199;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1C1F) + 232;
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
            if (n == 7199) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return TridentReturnHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 2);
        final char[] charArray = "6Ob3L[l0X\u007f\"[[P\u0007Q{2[\u0015nS\u0013;".toCharArray();
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
                        case 0 -> 96;
                        case 1 -> 63;
                        case 2 -> 9;
                        case 3 -> 85;
                        case 4 -> 43;
                        case 5 -> 55;
                        default -> 26;
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
