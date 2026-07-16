// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class CooldownTracker
{
    private static final int intValue = 3045;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xBE5) + 98;
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
            if (n == 3045) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return CooldownTracker.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 39);
        final char[] charArray = "<\u00146\u001b/CH\u0011/+\u0016(GZ\r[/Fe\u001c".toCharArray();
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
                        case 0 -> 88;
                        case 1 -> 92;
                        case 2 -> 126;
                        case 3 -> 80;
                        case 4 -> 108;
                        case 5 -> 11;
                        default -> 24;
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
