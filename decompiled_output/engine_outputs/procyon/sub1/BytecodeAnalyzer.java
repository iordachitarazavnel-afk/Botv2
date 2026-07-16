// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class BytecodeAnalyzer
{
    private static final int intValue = 4564;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x11D4) + 147;
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
            if (n == 4564) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return BytecodeAnalyzer.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 80);
        final char[] charArray = "f}Q!]\u0017UAEK%R\u0001KAv\u00052\u000fV\u0001".toCharArray();
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
                        case 0 -> 116;
                        case 1 -> 84;
                        case 2 -> 117;
                        case 3 -> 20;
                        case 4 -> 110;
                        case 5 -> 40;
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
