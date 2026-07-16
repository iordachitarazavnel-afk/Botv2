// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class ArmorValueHelper
{
    private static final int intValue = 2859;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xB2B) + 92;
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
            if (n == 2859) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return ArmorValueHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 40);
        final char[] charArray = "\u0010G@n.\u0011<=@HI9+-4G\rwmim".toCharArray();
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
                        case 0 -> 121;
                        case 1 -> 29;
                        case 2 -> 5;
                        case 3 -> 41;
                        case 4 -> 116;
                        case 5 -> 111;
                        default -> 117;
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
