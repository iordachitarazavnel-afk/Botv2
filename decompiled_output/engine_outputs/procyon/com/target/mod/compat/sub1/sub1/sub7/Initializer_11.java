// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

public class Initializer_11
{
    public static String computeString(final String s) {
        final int int1 = Initializer_21.getInt();
        final StringBuilder sb = new StringBuilder();
        final int n = int1;
        final char[] charArray = s.toCharArray();
        final int length = charArray.length;
        int i = 0;
        while (i < length) {
            final char c = charArray[i];
            char c3;
            final char c2 = c3 = c;
            final int n3;
            final int n2 = n3 = 65281;
            Label_0137: {
                char c4 = '\0';
                char c5 = '\0';
                if (n == 0) {
                    if (c2 >= n2) {
                        c4 = c;
                        c5 = '\uff5e';
                        if (n == 0) {
                            if (c4 <= c5) {
                                sb.append((char)(c - '\ufee0'));
                                if (n == 0) {
                                    break Label_0137;
                                }
                            }
                        }
                    }
                }
                char method_char = '\0';
                Label_0125: {
                    if (n == 0) {
                        if (c2 == n2) {
                            sb.append(' ');
                            if (n == 0) {
                                break Label_0137;
                            }
                        }
                        method_char = (c3 = c);
                        if (n != 0) {
                            break Label_0125;
                        }
                    }
                    if (c4 == c5) {
                        sb.append('\"');
                        if (n == 0) {
                            break Label_0137;
                        }
                    }
                    method_char = method_char(c);
                }
                sb.append(Character.toLowerCase(method_char));
            }
            ++i;
            if (n != 0) {
                break;
            }
        }
        return sb.toString().toLowerCase();
    }
    
    private static char method_char(final char c) {
        final int int1 = Initializer_21.getInt();
        char c2 = c;
        if (int1 == 0) {}
        return switch (c) {
            case '\u03b1',  '\u0430',  '\u1d00' -> 'a';
            case '\u0391',  '\u0410' -> 'a';
            case '\u0299',  '\u03b2',  '\u0432' -> 'b';
            case '\u0392',  '\u0412' -> 'b';
            case '\u0441',  '\u1d04' -> 'c';
            case '\u0421' -> 'c';
            case '\u1d05' -> 'd';
            case '\u03b5',  '\u0435',  '\u1d07' -> 'e';
            case '\u0395',  '\u0415' -> 'e';
            case '\ua730' -> 'f';
            case '\u0262' -> 'g';
            case '\u029c',  '\u043d' -> 'h';
            case '\u0397',  '\u041d' -> 'h';
            case '\u026a',  '\u0456' -> 'i';
            case '\u0399',  '\u0406' -> 'i';
            case '\u0458',  '\u1d0a' -> 'j';
            case '\u0408' -> 'j';
            case '\u03ba',  '\u043a',  '\u1d0b' -> 'k';
            case '\u039a',  '\u041a' -> 'k';
            case '\u029f' -> 'l';
            case '\u043c',  '\u1d0d' -> 'm';
            case '\u039c',  '\u041c' -> 'm';
            case '\u0274',  '\u03b7',  '\u043f' -> 'n';
            case '\u039d',  '\u041f' -> 'n';
            case '\u03bf',  '\u043e',  '\u1d0f' -> 'o';
            case '\u039f',  '\u041e' -> 'o';
            case '\u03c1',  '\u0440',  '\u1d18' -> 'p';
            case '\u03a1',  '\u0420' -> 'p';
            case '\u01eb',  '\ua7af' -> 'q';
            case '\u0280' -> 'r';
            case '\u0455',  '\ua731' -> 's';
            case '\u0405' -> 's';
            case '\u03c4',  '\u0442',  '\u1d1b' -> 't';
            case '\u03a4',  '\u0422' -> 't';
            case '\u03c5',  '\u1d1c' -> 'u';
            case '\u03bd',  '\u1d20' -> 'v';
            case '\u03c9',  '\u1d21' -> 'w';
            case '\u03c7',  '\u0445' -> 'x';
            case '\u03a7',  '\u0425' -> 'x';
            case '\u028f',  '\u0443' -> 'y';
            case '\u03a5',  '\u0423' -> 'y';
            case '\u1d22' -> 'z';
            case '\u0396' -> 'z';
            default -> c;
        };
    }
}
