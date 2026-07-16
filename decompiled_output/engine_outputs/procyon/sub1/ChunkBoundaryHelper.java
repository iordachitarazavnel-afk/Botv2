// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class ChunkBoundaryHelper
{
    private static final int intValue = 1619;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x653) + 52;
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
            if (n == 1619) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return ChunkBoundaryHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 76);
        final char[] charArray = "5qI9\u0012\u000bf\u0003wX6\u000b0A\u0013uL2\u000bi\u007fG7\f".toCharArray();
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
                        case 0 -> 58;
                        case 1 -> 85;
                        case 2 -> 112;
                        case 3 -> 27;
                        case 4 -> 53;
                        case 5 -> 5;
                        default -> 69;
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
