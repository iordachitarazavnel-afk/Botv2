// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class AnimatedTextureHelper
{
    private static final int intValue = 6331;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x18BB) + 204;
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
            if (n == 6331) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return AnimatedTextureHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 71);
        final char[] charArray = "\u0007M9%\u0010m \"w50\u0005l7#k5$\u0001|7fUafA".toCharArray();
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
                        case 0 -> 1;
                        case 1 -> 100;
                        case 2 -> 23;
                        case 3 -> 15;
                        case 4 -> 54;
                        case 5 -> 94;
                        default -> 2;
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
