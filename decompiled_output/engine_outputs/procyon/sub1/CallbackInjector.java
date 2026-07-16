// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class CallbackInjector
{
    private static final int intValue = 4781;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x12AD) + 154;
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
            if (n == 4781) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return CallbackInjector.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 18);
        final char[] charArray = "[K\u001d?zr5sc\u001f9}p\"wXQ%)=f".toCharArray();
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
                        case 0 -> 10;
                        case 1 -> 56;
                        case 2 -> 99;
                        case 3 -> 65;
                        case 4 -> 10;
                        case 5 -> 1;
                        default -> 68;
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
