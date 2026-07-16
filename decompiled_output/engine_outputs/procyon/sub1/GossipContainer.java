// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class GossipContainer
{
    private static final int intValue = 2487;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x9B7) + 80;
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
            if (n == 2487) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return GossipContainer.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 85);
        final char[] charArray = "FNMyL^\u0015nOJkL@3s\u0001H;\u000b\u001e".toCharArray();
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
                        case 0 -> 84;
                        case 1 -> 116;
                        case 2 -> 107;
                        case 3 -> 95;
                        case 4 -> 112;
                        case 5 -> 123;
                        default -> 3;
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
