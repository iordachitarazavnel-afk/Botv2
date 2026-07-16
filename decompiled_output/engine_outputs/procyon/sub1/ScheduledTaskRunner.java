// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class ScheduledTaskRunner
{
    private static final int intValue = 4843;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x12EB) + 156;
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
            if (n == 4843) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return ScheduledTaskRunner.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 28);
        final char[] charArray = "-\u0001\t$\u000f6\"\u001b\u00065 \u0018(\u001c\u000b\f\u000f$\u0019c8OLQ".toCharArray();
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
                        case 0 -> 98;
                        case 1 -> 126;
                        case 2 -> 125;
                        case 3 -> 93;
                        case 4 -> 119;
                        case 5 -> 95;
                        default -> 82;
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
