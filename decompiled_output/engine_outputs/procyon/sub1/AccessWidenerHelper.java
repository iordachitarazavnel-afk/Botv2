// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class AccessWidenerHelper
{
    private static final int intValue = 4471;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1177) + 144;
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
            if (n == 4471) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return AccessWidenerHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 113);
        final char[] charArray = "\"\u0017b!I+R\n\u0010d*_*M\u0006\u0018q!HxsRZ1".toCharArray();
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
                        case 0 -> 18;
                        case 1 -> 5;
                        case 2 -> 112;
                        case 3 -> 53;
                        case 4 -> 75;
                        case 5 -> 41;
                        default -> 116;
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
