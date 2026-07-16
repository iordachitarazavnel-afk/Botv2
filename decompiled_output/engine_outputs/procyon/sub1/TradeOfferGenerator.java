// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class TradeOfferGenerator
{
    private static final int intValue = 2425;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x979) + 78;
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
            if (n == 2425) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return TradeOfferGenerator.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 127);
        final char[] charArray = ".a\u0015XJ\n+\u001cv\u0006{J+(\br\u0000S]e;K=D".toCharArray();
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
                        case 0 -> 5;
                        case 1 -> 108;
                        case 2 -> 11;
                        case 3 -> 67;
                        case 4 -> 80;
                        case 5 -> 58;
                        default -> 50;
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
