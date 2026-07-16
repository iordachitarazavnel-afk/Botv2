// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class ThreadPoolFactory
{
    private static final int intValue = 5029;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x13A5) + 162;
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
            if (n == 5029) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return ThreadPoolFactory.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 117);
        final char[] charArray = "c\u0003\u000fZ\u0018U\u001eX\u0004\u0011y\u0018R:X\u0019\u0004\u001f\u000f\u0000`\u0007".toCharArray();
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
                        case 0 -> 66;
                        case 1 -> 30;
                        case 2 -> 8;
                        case 3 -> 74;
                        case 4 -> 12;
                        case 5 -> 68;
                        default -> 59;
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
