// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class BossBarOverlay
{
    private static final int intValue = 565;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x235) + 18;
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
            if (n == 565) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return BossBarOverlay.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 83);
        final char[] charArray = "tu\u001ffaz\u0011yl\tgOz\u001a\u0016l];\u0013".toCharArray();
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
                        case 0 -> 101;
                        case 1 -> 73;
                        case 2 -> 63;
                        case 3 -> 70;
                        case 4 -> 112;
                        case 5 -> 72;
                        default -> 48;
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
