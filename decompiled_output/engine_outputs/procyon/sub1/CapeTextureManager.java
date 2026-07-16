// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class CapeTextureManager
{
    private static final int intValue = 906;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x38A) + 29;
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
            if (n == 906) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return CapeTextureManager.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 90);
        final char[] charArray = "wN\tY\u000b\u001bD@Z\u000bY\u0012\u001fRUH\u001cN\u007f\b\r\u001a\u001f".toCharArray();
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
                        case 0 -> 110;
                        case 1 -> 117;
                        case 2 -> 35;
                        case 3 -> 102;
                        case 4 -> 5;
                        case 5 -> 36;
                        default -> 102;
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
