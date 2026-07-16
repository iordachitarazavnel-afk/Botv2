// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

public enum Initializer_14
{
    Obsidian, 
    EndCrystal, 
    RespawnAnchor, 
    Glowstone, 
    TotemOfUndying, 
    EnderPearl, 
    GoldenApple, 
    ExperienceBottle, 
    SlowFallingArrow;
    
    private static final Initializer_14[] ParseNArray;
    
    private static Initializer_14[] getParsenarrArray() {
        return new Initializer_14[] { Initializer_14.Obsidian, Initializer_14.EndCrystal, Initializer_14.RespawnAnchor, Initializer_14.Glowstone, Initializer_14.TotemOfUndying, Initializer_14.EnderPearl, Initializer_14.GoldenApple, Initializer_14.ExperienceBottle, Initializer_14.SlowFallingArrow };
    }
    
    static {
        final String[] array = new String[9];
        int n = 0;
        String s;
        int n2 = (s = """
                      !\u0004\u000bU.\u001dF\b\r\r4\r\u0017R<\u001eG'\u0006\u0007J2\u001b\u000e2\u0007\u0010G0&O3\u0006\u0000[4\u0007N\b)
                      \u0017K9\u0000H\b\u00105\u0004\u000bU\u001b\bE
                      \u0001
                      E\u001c\u001b[	\u001f\u0010#\u0010\u0014G/\u0000L\b\u000b\u0001`2\u001d]
                      \r
                      #\u0006\u0000G/9L\u0007\u001a\b""").length();
        int n3 = 9;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 122));
                ++n4;
                final String s2 = s;
                final int beginIndex = n4;
                String s3 = s2.substring(beginIndex, beginIndex + n3);
                int n9 = -1;
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    final int length = charArray.length;
                    int n10 = 0;
                    while (true) {
                        Label_0248: {
                            if (length > 1) {
                                break Label_0248;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 28;
                                    case 1 -> 18;
                                    case 2 -> 30;
                                    case 3 -> 88;
                                    case 4 -> 39;
                                    case 5 -> 19;
                                    default -> 83;
                                }));
                                ++n10;
                            } while (n8 == 0);
                        }
                        if (length > n10) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n9) {
                        default: {
                            array[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0023;
                            }
                            n2 = (s = "oJL-c\\\u0016^ED\u000bmKD\ntK$ZTD\u000b").length();
                            n3 = 10;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            array[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0023;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 54)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        ParseNArray = getParsenarrArray();
    }
}
