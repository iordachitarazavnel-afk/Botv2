// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class VertexBufferPool
{
    private static final int intValue = 1278;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x4FE) + 41;
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
            if (n == 1278) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return VertexBufferPool.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 52);
        final char[] charArray = "ud<U3i\u001fVg(D$A2LmnWg?m".toCharArray();
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
                        case 0 -> 23;
                        case 1 -> 53;
                        case 2 -> 122;
                        case 3 -> 21;
                        case 4 -> 98;
                        case 5 -> 37;
                        default -> 105;
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
