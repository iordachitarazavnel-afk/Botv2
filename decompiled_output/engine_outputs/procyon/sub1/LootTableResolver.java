// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class LootTableResolver
{
    private static final int intValue = 3138;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xC42) + 101;
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
            if (n == 3138) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return LootTableResolver.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 26);
        final char[] charArray = "M8&\u0019L@pm2\u001b\bkN~w2;Mn\u0010<1".toCharArray();
        final int length = charArray.length;
        int n4 = 0;
        while (true) {
            Label_0127: {
                if (length > 1) {
                    break Label_0127;
                }
                n3 = (n2 = n4);
                do {
                    final char c = charArray[n2];
                    charArray[n3] = (char)(c ^ (n ^ switch (n4 % 7) {
                        case 0 -> 27;
                        case 1 -> 77;
                        case 2 -> 83;
                        case 3 -> 119;
                        case 4 -> 2;
                        case 5 -> 59;
                        default -> 8;
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
