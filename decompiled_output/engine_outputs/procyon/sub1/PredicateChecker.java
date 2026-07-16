// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class PredicateChecker
{
    private static final int intValue = 3448;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xD78) + 111;
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
            if (n == 3448) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return PredicateChecker.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 17);
        final char[] charArray = "cMF\u0006B}uGZ`\nN}\u007fVM\u0003\u0014\u001a0$".toCharArray();
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
                        case 0 -> 34;
                        case 1 -> 46;
                        case 2 -> 50;
                        case 3 -> 115;
                        case 4 -> 58;
                        case 5 -> 15;
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
