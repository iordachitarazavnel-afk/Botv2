// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class HoverEventFactory
{
    private static final int intValue = 6052;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x17A4) + 195;
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
            if (n == 6052) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return HoverEventFactory.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 14);
        final char[] charArray = "C=q!i\u00109n<s\u0002z6;d ~dmda;".toCharArray();
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
                        case 0 -> 5;
                        case 1 -> 92;
                        case 2 -> 9;
                        case 3 -> 74;
                        case 4 -> 21;
                        case 5 -> 91;
                        default -> 65;
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
