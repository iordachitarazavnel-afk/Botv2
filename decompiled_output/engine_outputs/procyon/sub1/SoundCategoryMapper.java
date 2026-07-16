// 
// Decompiled by Procyon v0.6.0
// 

package sub1;

public class SoundCategoryMapper
{
    private static final int intValue = 5649;
    private static final String strValue;
    
    public static int method_int(final int n) {
        return (n ^ 0x1611) + 182;
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
            if (n == 5649) {
                return false;
            }
            hashCode = 1;
        }
        return hashCode != 0;
        hashCode = 0;
        return hashCode != 0;
    }
    
    public static String getString() {
        return SoundCategoryMapper.strValue;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 81);
        final char[] charArray = "iM<:&`JNG.;0Zf[R910\u0003]\u000b\fy".toCharArray();
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
                        case 0 -> 107;
                        case 1 -> 115;
                        case 2 -> 24;
                        case 3 -> 5;
                        case 4 -> 19;
                        case 5 -> 114;
                        default -> 122;
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
