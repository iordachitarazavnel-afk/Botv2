// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class LootFunctionHelper
{
    private static final int intValue = 3200;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xC80) + 103;
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
            if (n == 3200) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return LootFunctionHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 36);
        final char[] charArray = "#`v\u0000N\r(\f{p\u001bf0#\u0003\u007f|\u0006(\u000ewA?".toCharArray();
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
                        case 0 -> 75;
                        case 1 -> 43;
                        case 2 -> 61;
                        case 3 -> 80;
                        case 4 -> 44;
                        case 5 -> 92;
                        default -> 98;
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
