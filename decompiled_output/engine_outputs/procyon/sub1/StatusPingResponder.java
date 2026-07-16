// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class StatusPingResponder
{
    private static final int intValue = 3851;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xF0B) + 124;
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
            if (n == 3851) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return StatusPingResponder.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 109);
        final char[] charArray = "x\u0013_\u0004NQSB\tY\"^QsD\tZ\u0015I\u0002u\u001aI\u000e".toCharArray();
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
                        case 0 -> 70;
                        case 1 -> 10;
                        case 2 -> 83;
                        case 3 -> 29;
                        case 4 -> 86;
                        case 5 -> 79;
                        default -> 110;
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
