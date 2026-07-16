// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class TabCompletionHelper
{
    private static final int intValue = 441;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1B9) + 14;
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
            if (n == 441) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return TabCompletionHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 35);
        final char[] charArray = ">>*j\u0006d2\u0006:<@\u0006g\n\u000f38L\u001b)4[qx".toCharArray();
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
                        case 0 -> 73;
                        case 1 -> 124;
                        case 2 -> 107;
                        case 3 -> 10;
                        case 4 -> 74;
                        case 5 -> 42;
                        default -> 97;
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
