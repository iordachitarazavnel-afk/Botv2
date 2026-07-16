// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class BlockEntityTickHelper
{
    private static final int intValue = 6734;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1A4E) + 217;
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
            if (n == 6734) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return BlockEntityTickHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 95);
        final char[] charArray = "r-\u0014\u000bA\u001d!D(\u000f\u0011~1,[\t\u001e\u0004Z==\u00107JF\u001a".toCharArray();
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
                        case 0 -> 111;
                        case 1 -> 30;
                        case 2 -> 36;
                        case 3 -> 55;
                        case 4 -> 117;
                        case 5 -> 7;
                        default -> 16;
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
