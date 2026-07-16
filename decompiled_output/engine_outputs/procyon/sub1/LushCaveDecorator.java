// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class LushCaveDecorator
{
    private static final int intValue = 2177;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x881) + 70;
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
            if (n == 2177) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return LushCaveDecorator.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 89);
        final char[] charArray = "\u007f\u000em\u0000!m@V?{\u000b\r~WG\u0014lH\u0014=\u0018\u0003".toCharArray();
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
                        case 0 -> 106;
                        case 1 -> 34;
                        case 2 -> 71;
                        case 3 -> 49;
                        case 4 -> 59;
                        case 5 -> 85;
                        default -> 111;
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
