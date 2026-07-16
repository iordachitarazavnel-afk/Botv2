// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class SoulSpeedHelper
{
    private static final int intValue = 7509;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1D55) + 242;
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
            if (n == 7509) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return SoulSpeedHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 3);
        final char[] charArray = "M\u0015\u001c\u0018sz[{\u001e!\u0011Lz[lZ\u001fE\u000e:".toCharArray();
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
                        case 0 -> 29;
                        case 1 -> 121;
                        case 2 -> 106;
                        case 3 -> 119;
                        case 4 -> 35;
                        case 5 -> 9;
                        default -> 61;
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
