// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3;

import java.util.Iterator;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import java.util.List;
import com.target.mod.compat.sub1.sub1.sub1.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_9;
import net.minecraft.class_332;
import net.minecraft.class_2561;
import net.minecraft.class_437;

public class class_437Sub_1 extends class_437
{
    private int intValue;
    private static final String strValue;
    
    public class_437Sub_1() {
        super((class_2561)class_2561.method_43470(class_437Sub_1.strValue));
        this.intValue = -1;
    }
    
    public void method_25394(final class_332 class_332, final int n, final int n2, final float n3) {
        Initializer_9.setInt(2);
        this.method_25420(class_332, n, n2, n3);
        this.processAll(class_332, n, n2);
        if (this.intValue != -1) {
            this.processAll_1(class_332, n, n2);
        }
        super.method_25394(class_332, n, n2, n3);
    }
    
    private void processAll(final class_332 class_332, final int n, final int n2) {
        final int n3 = 24;
        final int n4 = 24;
        final int n5 = 8;
        final int n6 = this.field_22790 / 2 - 140;
        final int[] array = { 14, 14, 13, 12, 7 };
        final int[][] array2 = { { 96, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 45, 61, 259 }, { 258, 81, 87, 69, 82, 84, 89, 85, 73, 79, 80, 91, 93, 92 }, { 280, 65, 83, 68, 70, 71, 72, 74, 75, 76, 59, 39, 257 }, { 340, 90, 88, 67, 86, 66, 78, 77, 44, 46, 47, 344 }, { 341, 343, 342, 32, 346, 347, 345 } };
        final int n7 = array[0] * (n3 + n5) + 10;
        final int n8 = array.length * (n4 + n5) + 10;
        final int n9 = (this.field_22789 - n7) / 2;
        final int n10 = n6 - 5;
        class_332.method_25294(n9, n10, n9 + n7, n10 + n8, Integer.MIN_VALUE);
        class_332.method_25294(n9, n10, n9 + n7, n10 + 1, -1);
        for (int i = 0; i < array.length; ++i) {
            final int n11 = (this.field_22789 - (array[i] * (n3 + n5) - n5)) / 2;
            for (int j = 0; j < array[i]; ++j) {
                final int n12 = array2[i][j];
                final String computeString = Initializer.computeString(n12);
                final int n13 = n11 + j * (n3 + n5);
                final int n14 = n6 + i * (n4 + n5);
                int n15 = (n >= n13 && n <= n13 + n3 && n2 >= n14 && n2 <= n14 + n4) ? -8355712 : -12566464;
                if (this.intValue == n12) {
                    n15 = -1;
                }
                class_332.method_25294(n13, n14, n13 + n3, n14 + n4, n15);
                class_332.method_25300(this.field_22793, computeString, n13 + n3 / 2, n14 + (n4 - 8) / 2, -1);
            }
        }
    }
    
    private void processAll_1(final class_332 class_332, final int n, final int n2) {
        final List<? super Object> list = Initializer_1.syncF.getList().stream().filter((Predicate<? super Object>)class_437Sub_1::lambda$drawUnboundModules$0).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
        if (list.isEmpty()) {
            return;
        }
        final int n3 = 120;
        final int n4 = list.size() * 14 + 6;
        final int n5 = (this.field_22789 - n3) / 2;
        final int n6 = this.field_22790 / 2 + 60;
        class_332.method_25294(n5, n6, n5 + n3, n6 + n4, -1073741824);
        int n7 = n6 + 4;
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            class_332.method_25303(this.field_22793, ((AbstractLoadF)iterator.next()).getString(), n5 + 4, n7, (n >= n5 && n <= n5 + n3 && n2 >= n7 && n2 <= n7 + 12) ? -1 : -6250336);
            n7 += 14;
        }
    }
    
    public boolean checkCondition(final double n, final double n2, final int n3) {
        final int n4 = 24;
        final int n5 = 24;
        final int n6 = 8;
        final int n7 = this.field_22790 / 2 - 120;
        final int[] array = { 14, 14, 13, 12, 7 };
        final boolean enabled_1 = com.target.mod.compat.sub1.sub1.sub3.Initializer_1.isEnabled_1();
        final int[][] array2 = { { 96, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 45, 61, 259 }, { 258, 81, 87, 69, 82, 84, 89, 85, 73, 79, 80, 91, 93, 92 }, { 280, 65, 83, 68, 70, 71, 72, 74, 75, 76, 59, 39, 257 }, { 340, 90, 88, 67, 86, 66, 78, 77, 44, 46, 47, 344 }, { 341, 343, 342, 32, 346, 347, 345 } };
        int n8 = 0;
        final boolean b = enabled_1;
        while (true) {
            do {
                int i = 0;
                Label_0444: {
                    i = n8;
                }
                Label_0446:
                while (i < array.length) {
                    final int n9 = (this.field_22789 - (array[n8] * (n4 + n6) - n6)) / 2;
                    int n11;
                    final int n10 = n11 = 0;
                    if (b) {
                        int j = n10;
                        while (j < array[n8]) {
                            final int n12 = n9 + j * (n4 + n6);
                            final int n13 = n7 + n8 * (n5 + n6);
                            if (b) {
                                final double n14 = i = dcmpl(n, (double)n12);
                                if (!b) {
                                    continue Label_0446;
                                }
                                Label_0600: {
                                    if (n14 >= 0) {
                                        double n17;
                                        double n16;
                                        final double n15 = n16 = (n17 = dcmpg(n, (double)(n12 + n4)));
                                        if (b) {
                                            if (n15 > 0) {
                                                break Label_0600;
                                            }
                                            final double n18;
                                            n16 = (n18 = (n17 = dcmpl(n2, (double)n13)));
                                        }
                                        if (b) {
                                            if (n15 < 0) {
                                                break Label_0600;
                                            }
                                            n17 = (n16 = dcmpg(n2, (double)(n13 + n5)));
                                        }
                                        if (b) {
                                            if (n16 > 0) {
                                                break Label_0600;
                                            }
                                            this.intValue = array2[n8][j];
                                            n17 = 1;
                                        }
                                        return n17 != 0.0;
                                    }
                                }
                                ++j;
                            }
                            if (!b) {
                                break;
                            }
                        }
                        ++n8;
                        continue Label_0444;
                    }
                    Label_0836: {
                        if (b) {
                            if (n10 != -1) {
                                final List<? super Object> list = Initializer_1.syncF.getList().stream().filter((Predicate<? super Object>)class_437Sub_1::lambda$mouseClicked$1).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
                                int empty;
                                final int n19 = empty = (list.isEmpty() ? 1 : 0);
                                if (b) {
                                    if (n19 != 0) {
                                        this.intValue = -1;
                                        return false;
                                    }
                                    empty = 120;
                                }
                                final int n20 = empty;
                                final int n21 = (this.field_22789 - n20) / 2;
                                int n22 = this.field_22790 / 2 + 60 + 4;
                                for (AbstractLoadF abstractLoadF : list) {
                                    if (b) {
                                        final double n23 = n11 = dcmpl(n, (double)n21);
                                        if (!b) {
                                            break Label_0836;
                                        }
                                        Label_0827: {
                                            if (n23 >= 0) {
                                                double n26;
                                                double n25;
                                                final double n24 = n25 = (n26 = dcmpg(n, (double)(n21 + n20)));
                                                if (b) {
                                                    if (n24 > 0) {
                                                        break Label_0827;
                                                    }
                                                    final double n27;
                                                    n25 = (n27 = (n26 = dcmpl(n2, (double)n22)));
                                                }
                                                if (b) {
                                                    if (n24 < 0) {
                                                        break Label_0827;
                                                    }
                                                    n26 = (n25 = dcmpg(n2, (double)(n22 + 12)));
                                                }
                                                if (b) {
                                                    if (n25 > 0) {
                                                        break Label_0827;
                                                    }
                                                    abstractLoadF.setInt(this.intValue);
                                                    this.intValue = -1;
                                                    n26 = 1;
                                                }
                                                return n26 != 0.0;
                                            }
                                        }
                                        n22 += 14;
                                    }
                                    if (!b) {
                                        break;
                                    }
                                }
                            }
                            n11 = 1;
                        }
                    }
                    if (com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1() != 0) {
                        com.target.mod.compat.sub1.sub1.sub3.Initializer_1.setBool(!b);
                    }
                    return n11 != 0;
                }
                break;
            } while (b);
            final int intValue;
            int n11 = intValue = this.intValue;
            continue;
        }
    }
    
    public boolean method_25421() {
        return false;
    }
    
    private static boolean lambda$mouseClicked$1(final AbstractLoadF abstractLoadF) {
        return abstractLoadF.getInt_7() == -1;
    }
    
    private static boolean lambda$drawUnboundModules$0(final AbstractLoadF abstractLoadF) {
        return abstractLoadF.getInt_7() == -1;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 87);
        final char[] charArray = "!?Zy#2?\u0019".toCharArray();
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
                        case 0 -> 61;
                        case 1 -> 13;
                        case 2 -> 116;
                        case 3 -> 76;
                        case 4 -> 29;
                        case 5 -> 11;
                        default -> 12;
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
