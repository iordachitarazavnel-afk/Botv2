// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class UnicodeHelper
{
    private static final int intValue = 6207;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x183F) + 200;
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
            if (n == 6207) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return UnicodeHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 95);
        final char[] charArray = "6`5?QMl+k0,[[)\u0015?rl".toCharArray();
        final int length = charArray.length;
        int n4 = 0;
        while (true) {
            Label_0126: {
                if (length > 1) {
                    break Label_0126;
                }
                n3 = (n2 = n4);
                do {
                    final char c = charArray[n2];
                    charArray[n3] = (char)(c ^ (n ^ switch (n4 % 7) {
                        case 0 -> 60;
                        case 1 -> 81;
                        case 2 -> 3;
                        case 3 -> 3;
                        case 4 -> 97;
                        case 5 -> 118;
                        default -> 86;
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
