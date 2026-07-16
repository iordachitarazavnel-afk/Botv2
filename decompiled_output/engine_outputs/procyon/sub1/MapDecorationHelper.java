// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class MapDecorationHelper
{
    private static final int intValue = 7075;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1BA3) + 228;
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
            if (n == 7075) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return MapDecorationHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 79);
        final char[] charArray = "{\u0005\u0017:A\u001bDD\u0005\u0013\u0017K\u0016cS\b\u0017\u001bVX]\u0007JW".toCharArray();
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
                        case 0 -> 121;
                        case 1 -> 43;
                        case 2 -> 40;
                        case 3 -> 49;
                        case 4 -> 107;
                        case 5 -> 55;
                        default -> 100;
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
