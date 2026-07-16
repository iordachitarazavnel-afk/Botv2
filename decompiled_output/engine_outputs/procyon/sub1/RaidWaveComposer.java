// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class RaidWaveComposer
{
    private static final int intValue = 2363;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x93B) + 76;
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
            if (n == 2363) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return RaidWaveComposer.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 19);
        final char[] charArray = "\u0012;v\u0016U[?%\u0019p\u001frU:%(?\u00043\u0014y".toCharArray();
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
                        case 0 -> 83;
                        case 1 -> 73;
                        case 2 -> 12;
                        case 3 -> 97;
                        case 4 -> 17;
                        case 5 -> 41;
                        default -> 90;
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
