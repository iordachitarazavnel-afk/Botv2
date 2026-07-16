// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class ChunkCacheManager
{
    private static final int intValue = 69;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x45) + 2;
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
            if (n == 69) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return ChunkCacheManager.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 91);
        final char[] charArray = "\u0010#\u0017g\u0012<40#\u0007D\u0018\u001144.\u0010)\u000fN{c".toCharArray();
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
                        case 0 -> 8;
                        case 1 -> 16;
                        case 2 -> 57;
                        case 3 -> 82;
                        case 4 -> 34;
                        case 5 -> 36;
                        default -> 14;
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
