// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class WrittenBookHelper
{
    private static final int intValue = 7137;
    private static int intValue_1;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1BE1) + 230;
    }
    
    public static boolean checkObject(final Object o) {
        final int int_1 = getInt_1();
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
            if (n == 7137) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return WrittenBookHelper.strValue;
    }
    
    public static void setInt(final int intValue_1) {
        WrittenBookHelper.intValue_1 = intValue_1;
    }
    
    public static int getInt() {
        return WrittenBookHelper.intValue_1;
    }
    
    public static int getInt_1() {
        if (getInt() == 0) {
            return 77;
        }
        return 0;
    }
    
    static {
        if (getInt() == 0) {
            setInt(52);
        }
        int n3;
        int n2;
        final int n = n2 = (n3 = 25);
        final char[] charArray = "]+V\u0005[01H6P\u001ag03z<MQYdq:".toCharArray();
        final int length = charArray.length;
        int n4 = 0;
        while (true) {
            Label_0140: {
                if (length > 1) {
                    break Label_0140;
                }
                n3 = (n2 = n4);
                do {
                    final char c = charArray[n2];
                    charArray[n3] = (char)(c ^ (n ^ switch (n4 % 7) {
                        case 0 -> 19;
                        case 1 -> 64;
                        case 2 -> 38;
                        case 3 -> 104;
                        case 4 -> 54;
                        case 5 -> 76;
                        default -> 70;
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
