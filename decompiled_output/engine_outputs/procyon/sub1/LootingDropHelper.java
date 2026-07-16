// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class LootingDropHelper
{
    private static final int intValue = 7695;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1E0F) + 248;
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
            if (n == 7695) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return LootingDropHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 97);
        final char[] charArray = "h#\u0012u= *`>\u0012q\u001c+!T)\u000f!\"\u007fc\u0014".toCharArray();
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
                        case 0 -> 69;
                        case 1 -> 45;
                        case 2 -> 28;
                        case 3 -> 96;
                        case 4 -> 53;
                        case 5 -> 47;
                        default -> 44;
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
