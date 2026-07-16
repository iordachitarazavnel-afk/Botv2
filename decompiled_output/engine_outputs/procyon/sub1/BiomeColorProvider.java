// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class BiomeColorProvider
{
    private static final int intValue = 100;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x64) + 3;
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
            if (n == 100) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return BiomeColorProvider.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 74);
        final char[] charArray = "\u0005\u00036\u0002oc*+\u0005+?xO3.\u000e<\u001d*VtiZ".toCharArray();
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
                        case 0 -> 13;
                        case 1 -> 32;
                        case 2 -> 19;
                        case 3 -> 37;
                        case 4 -> 64;
                        case 5 -> 106;
                        default -> 15;
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
