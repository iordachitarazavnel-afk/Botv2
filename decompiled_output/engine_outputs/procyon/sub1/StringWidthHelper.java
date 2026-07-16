// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class StringWidthHelper
{
    private static final int intValue = 5866;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x16EA) + 189;
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
            if (n == 5866) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return StringWidthHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 47);
        final char[] charArray = "9g2\u0018\r\n\u0014\u0003w4\u0019+\b/\u001av2Q\u0015\\mZ".toCharArray();
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
                        case 0 -> 69;
                        case 1 -> 60;
                        case 2 -> 111;
                        case 3 -> 94;
                        case 4 -> 76;
                        case 5 -> 66;
                        default -> 108;
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
