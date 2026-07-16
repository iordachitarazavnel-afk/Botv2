// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class EntityTickScheduler
{
    private static final int intValue = 2208;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x8A0) + 71;
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
            if (n == 2208) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return EntityTickScheduler.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 1);
        final char[] charArray = "v\u001bl\u0001\u0019fLZ\u0016s;\u000ew}W\u0000t\r\u001f?n\u0002[(".toCharArray();
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
                        case 0 -> 50;
                        case 1 -> 116;
                        case 2 -> 25;
                        case 3 -> 105;
                        case 4 -> 108;
                        case 5 -> 30;
                        default -> 25;
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
