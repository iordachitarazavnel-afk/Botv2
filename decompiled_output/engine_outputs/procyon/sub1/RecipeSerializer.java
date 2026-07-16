// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class RecipeSerializer
{
    private static final int intValue = 3386;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xD3A) + 109;
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
            if (n == 3386) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return RecipeSerializer.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 4);
        final char[] charArray = "*\u0004e\u001c'i]\u001d\u0013o\u0014;et\u001d\u0013&\u0003f\">".toCharArray();
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
                        case 0 -> 124;
                        case 1 -> 101;
                        case 2 -> 2;
                        case 3 -> 113;
                        case 4 -> 83;
                        case 5 -> 8;
                        default -> 10;
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
