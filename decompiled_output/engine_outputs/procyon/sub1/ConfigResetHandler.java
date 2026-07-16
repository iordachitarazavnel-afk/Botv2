// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class ConfigResetHandler
{
    private static final int intValue = 4347;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x10FB) + 140;
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
            if (n == 4347) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return ConfigResetHandler.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 26);
        final char[] charArray = "\u00120>o5\u0016\u001e4,5}\u0014\u0010\"535{|\u0007}\u007fo".toCharArray();
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
                        case 0 -> 75;
                        case 1 -> 69;
                        case 2 -> 74;
                        case 3 -> 19;
                        case 4 -> 70;
                        case 5 -> 107;
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
