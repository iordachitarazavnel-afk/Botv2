// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class NumberFormatCache
{
    private static final int intValue = 6176;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1820) + 199;
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
            if (n == 6176) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return NumberFormatCache.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 109);
        final char[] charArray = "c=g}\u0003zrB:g~\u0012KUN o?\u00109\u001a\u001d".toCharArray();
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
                        case 0 -> 64;
                        case 1 -> 37;
                        case 2 -> 103;
                        case 3 -> 114;
                        case 4 -> 11;
                        case 5 -> 101;
                        default -> 89;
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
