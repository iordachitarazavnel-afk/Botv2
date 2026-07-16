// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class SoundEngineHelper
{
    private static final int intValue = 5494;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1576) + 177;
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
            if (n == 5494) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return SoundEngineHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 4);
        final char[] charArray = "\u0006zM1\u0015\u001c\u00022|V:9<\u0000%pJ\u007f\u0007hBe".toCharArray();
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
                        case 0 -> 81;
                        case 1 -> 17;
                        case 2 -> 60;
                        case 3 -> 91;
                        case 4 -> 117;
                        case 5 -> 93;
                        default -> 104;
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
