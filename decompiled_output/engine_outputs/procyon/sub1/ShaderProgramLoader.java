// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class ShaderProgramLoader
{
    private static final int intValue = 1309;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x51D) + 42;
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
            if (n == 1309) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return ShaderProgramLoader.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 14);
        final char[] charArray = "K>*\u0005nl\u0005j9,\u0013js\u0019w7/\u0004y>#)x{".toCharArray();
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
                        case 0 -> 22;
                        case 1 -> 88;
                        case 2 -> 69;
                        case 3 -> 111;
                        case 4 -> 5;
                        case 5 -> 16;
                        default -> 91;
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
