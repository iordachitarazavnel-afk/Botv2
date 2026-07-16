// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class CompressionHandler
{
    private static final int intValue = 3665;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xE51) + 118;
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
            if (n == 3665) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return CompressionHandler.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 41);
        final char[] charArray = "i\u0015i{1%\u0013Y\u0013ke\u000b!\u000eN\u0016ayc6Q\u0004J".toCharArray();
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
                        case 0 -> 3;
                        case 1 -> 83;
                        case 2 -> 45;
                        case 3 -> 34;
                        case 4 -> 106;
                        case 5 -> 105;
                        default -> 73;
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
