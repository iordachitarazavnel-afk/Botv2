// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class BiomeSourceBuilder
{
    private static final int intValue = 1774;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x6EE) + 57;
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
            if (n == 1774) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return BiomeSourceBuilder.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 11);
        final char[] charArray = "36\u001c#/7\u0005\u0004-\u0010+\b\u0011\u0003\u001d;\u0016<j\u0012[_o".toCharArray();
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
                        case 0 -> 122;
                        case 1 -> 84;
                        case 2 -> 120;
                        case 3 -> 69;
                        case 4 -> 65;
                        case 5 -> 111;
                        default -> 97;
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
