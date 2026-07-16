// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class BlockPosPool
{
    private static final int intValue = 6641;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x19F1) + 214;
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
            if (n == 6641) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return BlockPosPool.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 41);
        final char[] charArray = "Zh x%<#kT t\"L:)*\u007f".toCharArray();
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
                        case 0 -> 49;
                        case 1 -> 45;
                        case 2 -> 102;
                        case 3 -> 50;
                        case 4 -> 103;
                        case 5 -> 69;
                        default -> 101;
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
