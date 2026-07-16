// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class WalkNodeEvaluator
{
    private static final int intValue = 2580;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xA14) + 83;
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
            if (n == 2580) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return WalkNodeEvaluator.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 12);
        final char[] charArray = "\u001c`\u0017`\"\tm.D\rj\u0000\u0013h?n\t+\u001aW'{".toCharArray();
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
                        case 0 -> 71;
                        case 1 -> 13;
                        case 2 -> 119;
                        case 3 -> 7;
                        case 4 -> 96;
                        case 5 -> 106;
                        default -> 5;
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
