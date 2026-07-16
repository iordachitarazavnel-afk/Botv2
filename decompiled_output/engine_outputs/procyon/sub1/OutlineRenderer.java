// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class OutlineRenderer
{
    private static final int intValue = 5401;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1519) + 174;
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
            if (n == 5401) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return OutlineRenderer.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 27);
        final char[] charArray = "\f=6\"\u0014|n\u0011-,*\u0018`n1h4\u007fS\"".toCharArray();
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
                        case 0 -> 88;
                        case 1 -> 83;
                        case 2 -> 89;
                        case 3 -> 85;
                        case 4 -> 102;
                        case 5 -> 9;
                        default -> 16;
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
