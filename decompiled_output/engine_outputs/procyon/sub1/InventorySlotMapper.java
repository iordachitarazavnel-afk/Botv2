// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class InventorySlotMapper
{
    private static final int intValue = 658;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x292) + 21;
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
            if (n == 658) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return InventorySlotMapper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 105);
        final char[] charArray = "\u0004F1\u001es!\u001b?Q\u0014\u0017r!9,X7\u001eou\u0002|\u0006w".toCharArray();
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
                        case 1 -> 65;
                        case 2 -> 46;
                        case 3 -> 18;
                        case 4 -> 116;
                        case 5 -> 60;
                        default -> 29;
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
