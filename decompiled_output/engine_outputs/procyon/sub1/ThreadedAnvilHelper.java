// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class ThreadedAnvilHelper
{
    private static final int intValue = 6455;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1937) + 208;
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
            if (n == 6455) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return ThreadedAnvilHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 124);
        final char[] charArray = "2\u0006B#Z05\u0002/^0R8\u0018\u0003\u0002@#It&W@\u0000".toCharArray();
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
                        case 0 -> 26;
                        case 1 -> 18;
                        case 2 -> 76;
                        case 3 -> 58;
                        case 4 -> 71;
                        case 5 -> 40;
                        default -> 44;
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
