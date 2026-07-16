// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class FramebufferHelper
{
    private static final int intValue = 1371;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x55B) + 44;
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
            if (n == 1371) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return FramebufferHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 68);
        final char[] charArray = "\b}\b\u0000?\t\u001d(i\f\u001f\u0012\u000e\u0004>j\u001bM,ZF~".toCharArray();
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
                        case 0 -> 10;
                        case 1 -> 75;
                        case 2 -> 45;
                        case 3 -> 41;
                        case 4 -> 30;
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
