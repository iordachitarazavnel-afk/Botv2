// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class OreVeinGenerator
{
    private static final int intValue = 2053;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x805) + 66;
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
            if (n == 2053) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return OreVeinGenerator.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 68);
        final char[] charArray = "h\u0001x\rN\\\r`\u0016s>YT\u0017H\u0001=-\u001a\u001bS".toCharArray();
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
                        case 0 -> 99;
                        case 1 -> 55;
                        case 2 -> 89;
                        case 3 -> 31;
                        case 4 -> 111;
                        case 5 -> 113;
                        default -> 39;
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
