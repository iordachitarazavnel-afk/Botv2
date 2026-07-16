// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class CauldronInteraction
{
    private static final int intValue = 6920;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1B08) + 223;
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
            if (n == 6920) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return CauldronInteraction.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 98);
        final char[] charArray = "\u0011\u001e\u001f\u0004]\u000e$<6\u0004\u001c\\\u000e*1\u000b\u0003\u0007W\\=cQZ".toCharArray();
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
                        case 0 -> 48;
                        case 1 -> 29;
                        case 2 -> 8;
                        case 3 -> 10;
                        case 4 -> 91;
                        case 5 -> 30;
                        default -> 41;
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
