// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class FishingHookHelper
{
    private static final int intValue = 7168;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1C00) + 231;
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
            if (n == 7168) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return FishingHookHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 45);
        final char[] charArray = "\\Ku{7KfRMix\u0016@mjGt3(\u0014/*".toCharArray();
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
                        case 0 -> 55;
                        case 1 -> 15;
                        case 2 -> 43;
                        case 3 -> 62;
                        case 4 -> 115;
                        case 5 -> 8;
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
