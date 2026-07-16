// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class BlockModelBaker
{
    private static final int intValue = 1216;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x4C0) + 39;
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
            if (n == 1216) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return BlockModelBaker.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 69);
        final char[] charArray = "4\u0006\u0017v5W2\u0012\u000f\u0014W?q8\u0004J\u000e$p*".toCharArray();
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
                        case 0 -> 51;
                        case 1 -> 47;
                        case 2 -> 61;
                        case 3 -> 80;
                        case 4 -> 27;
                        case 5 -> 95;
                        default -> 24;
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
