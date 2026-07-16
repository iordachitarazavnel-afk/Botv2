// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class ArmorStandPoseHelper
{
    private static final int intValue = 844;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x34C) + 27;
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
            if (n == 844) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return ArmorStandPoseHelper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 89);
        final char[] charArray = "A\fv\u001e\u0004\u000bFa\u0010\u007f!\u0019+WH\u001bw\u0001\u0013*\u0012vO5A".toCharArray();
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
                        case 0 -> 89;
                        case 1 -> 39;
                        case 2 -> 66;
                        case 3 -> 40;
                        case 4 -> 47;
                        case 5 -> 1;
                        default -> 107;
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
