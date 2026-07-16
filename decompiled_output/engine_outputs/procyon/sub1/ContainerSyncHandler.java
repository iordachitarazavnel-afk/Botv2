// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class ContainerSyncHandler
{
    private static final int intValue = 782;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x30E) + 25;
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
            if (n == 782) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return ContainerSyncHandler.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 12);
        final char[] charArray = "u_FEW\u0005ASB{HX\u000fgW^L]S\u001e\u000f@\u0001\u0006\u0001".toCharArray();
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
                        case 0 -> 58;
                        case 1 -> 60;
                        case 2 -> 36;
                        case 3 -> 61;
                        case 4 -> 58;
                        case 5 -> 96;
                        default -> 35;
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
