// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class ListenerRegistrar
{
    private static final int intValue = 4750;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x128E) + 153;
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
            if (n == 4750) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return ListenerRegistrar.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 104);
        final char[] charArray = "\u001f/<\f\u0010\u0003k!\u0014*\u001f\u001c\u001ez!'=X\u0003\\ c".toCharArray();
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
                        case 0 -> 59;
                        case 1 -> 46;
                        case 2 -> 39;
                        case 3 -> 16;
                        case 4 -> 29;
                        case 5 -> 5;
                        default -> 102;
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
