// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class CompoundTagMerger
{
    private static final int intValue = 4099;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1003) + 132;
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
            if (n == 4099) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return CompoundTagMerger.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 127);
        final char[] charArray = "[L0\u0002|M\u0005|w<\u0015^]\u0019\u007fF/Re\tE(".toCharArray();
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
                        case 0 -> 103;
                        case 1 -> 92;
                        case 2 -> 34;
                        case 3 -> 13;
                        case 4 -> 108;
                        case 5 -> 71;
                        default -> 20;
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
