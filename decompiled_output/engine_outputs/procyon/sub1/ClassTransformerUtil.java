// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class ClassTransformerUtil
{
    private static final int intValue = 4533;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x11B5) + 146;
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
            if (n == 4533) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return ClassTransformerUtil.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 48);
        final char[] charArray = "Z zV/\u0005}x\"hC3#b|>NQ5=/o}5\u0015".toCharArray();
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
                        case 0 -> 41;
                        case 1 -> 124;
                        case 2 -> 43;
                        case 3 -> 21;
                        case 4 -> 108;
                        case 5 -> 97;
                        default -> 63;
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
