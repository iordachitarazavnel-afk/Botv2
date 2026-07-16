// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class LanguageMapLoader
{
    private static final int intValue = 5804;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x16AC) + 187;
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
            if (n == 5804) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return LanguageMapLoader.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 110);
        final char[] charArray = "\u001d\f:\u00008P\u000e4 5\u0017\u0001^\b5\b&G;\u0000Ga".toCharArray();
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
                        case 0 -> 63;
                        case 1 -> 3;
                        case 2 -> 58;
                        case 3 -> 9;
                        case 4 -> 35;
                        case 5 -> 95;
                        default -> 7;
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
