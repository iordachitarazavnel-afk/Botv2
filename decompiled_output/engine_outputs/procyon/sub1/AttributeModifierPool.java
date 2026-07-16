// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class AttributeModifierPool
{
    private static final int intValue = 2921;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0xB69) + 94;
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
            if (n == 2921) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return AttributeModifierPool.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 43);
        final char[] charArray = "KU!6tH@~D\u0018+yCScD'\u0014rEY*Wdj-".toCharArray();
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
                        case 0 -> 33;
                        case 1 -> 10;
                        case 2 -> 126;
                        case 3 -> 111;
                        case 4 -> 54;
                        case 5 -> 1;
                        default -> 30;
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
