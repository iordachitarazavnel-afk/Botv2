// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class BehaviorTreeRunner
{
    private static final int intValue = 2704;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xA90) + 87;
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
            if (n == 2704) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return BehaviorTreeRunner.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 105);
        final char[] charArray = "\u0005xg\u0004\u0018\u007fa5I}\u0000\u000bD{)sj\u0017N`?i-".toCharArray();
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
                        case 0 -> 46;
                        case 1 -> 116;
                        case 2 -> 102;
                        case 3 -> 12;
                        case 4 -> 7;
                        case 5 -> 127;
                        default -> 103;
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
