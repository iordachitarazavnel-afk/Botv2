// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class HandshakeValidator
{
    private static final int intValue = 3820;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xEEC) + 123;
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
            if (n == 3820) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return HandshakeValidator.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 32);
        final char[] charArray = "c\\t*\u0005\u000e\u0015@XL/\u001a\u000f\u0010JIu<V\u0010E\u0005\r".toCharArray();
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
                        case 0 -> 11;
                        case 1 -> 29;
                        case 2 -> 58;
                        case 3 -> 110;
                        case 4 -> 86;
                        case 5 -> 70;
                        default -> 84;
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
