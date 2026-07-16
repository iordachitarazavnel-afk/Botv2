// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class LoyaltyReturnHelper
{
    private static final int intValue = 7416;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1CF8) + 239;
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
            if (n == 7416) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return LoyaltyReturnHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 21);
        final char[] charArray = "`\u0014\u0017M\u0016\u0018?~\u001e\u001aY\b\u0002\u000eI\u0017\u001eI\bL0\u001dU^".toCharArray();
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
                        case 0 -> 57;
                        case 1 -> 110;
                        case 2 -> 123;
                        case 3 -> 57;
                        case 4 -> 111;
                        case 5 -> 121;
                        default -> 83;
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
