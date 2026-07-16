// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub2;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Arrays;
import net.minecraft.class_2960;
import java.util.Iterator;
import java.util.Set;
import java.util.Comparator;
import net.minecraft.class_7923;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_1799;
import net.minecraft.class_2248;
import com.target.mod.compat.sub1.sub1.sub3.Initializer_1;
import net.minecraft.class_332;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_2;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_7;

public class Initializer
{
    private static final int intValue = 30;
    private final com.target.mod.compat.sub1.sub1.sub3.sub1.Initializer blockB;
    private final Initializer_7 parseD;
    private final class_310 class310;
    private final int intValue_1 = 150;
    private final int intValue_2 = 180;
    private RenderASub_2 calcB;
    private int intValue_3;
    private int intValue_4;
    private int intValue_5;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer() {
        this.class310 = class_310.method_1551();
        this.intValue_3 = 100;
        this.intValue_4 = 100;
        this.intValue_5 = 0;
        this.blockB = new com.target.mod.compat.sub1.sub1.sub3.sub1.Initializer();
        this.parseD = new Initializer_7();
    }
    
    public RenderASub_2 getCalcb() {
        return this.calcB;
    }
    
    public void setCalcb(final RenderASub_2 calcB) {
        this.calcB = calcB;
        if (calcB != null) {
            this.blockB.execute();
            this.intValue_5 = 0;
        }
    }
    
    public boolean isEnabled() {
        return this.calcB != null;
    }
    
    public void processAll(final class_332 class_332, final int n, final int n2, final float n3) {
        final String string = Initializer_2.getString();
        Initializer initializer = this;
        if (string == null) {
            if (this.calcB == null) {
                return;
            }
            initializer = this;
        }
        final int[] intarrArray = initializer.parseD.getIntarrArray();
        this.intValue_3 = intarrArray[0];
        this.intValue_4 = intarrArray[1];
        final int n4 = 12;
        com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.processAll_20(class_332, this.intValue_3, this.intValue_4, 150, 180, n4, Initializer_1.method_int(Initializer_1.getInt_6(), n3 * Initializer_1.getFloat()));
        com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.processAll_30(class_332, this.intValue_3, this.intValue_4, 150, 180, n4, Initializer_1.method_int(Initializer_1.getInt(), n3 * 0.4f));
        com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.processAll_23(class_332, this.intValue_3, this.intValue_4, 150, 30, n4, Initializer_1.method_int(Initializer_1.getInt_4(), n3 * Initializer_1.getFloat()));
        final int n5 = Initializer_1.method_int_1(-1, (int)(n3 * 255.0f)) | 0xFF000000;
        class_332.method_51433(this.class310.field_1772, createString(24554, -30355), this.intValue_3 + 10, this.intValue_4 + 10, n5, true);
        final int n6 = this.intValue_3 + 150 - 20;
        final int checkCondition = com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, n6, this.intValue_4 + 8, 16, 16) ? 1 : 0;
        if (string == null) {
            if (checkCondition != 0) {
                Initializer_1.getInt();
            }
        }
        class_332.method_51433(this.class310.field_1772, "\u2715", n6 + 2, this.intValue_4 + 10, Initializer_1.method_int_1(checkCondition, (int)(n3 * 255.0f)) | 0xFF000000, false);
        final int n7 = this.intValue_3 + 10;
        final int n8 = this.intValue_4 + 35;
        final int int1 = 130;
        final int n9 = 20;
        this.blockB.setInt(int1);
        final int checkCondition2 = com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, n7, n8, int1, n9) ? 1 : 0;
        final int enabled = this.blockB.isEnabled() ? 1 : 0;
        Label_0400: {
            if (string == null) {
                if (enabled == 0) {
                    final int n10 = checkCondition2;
                    if (string != null || n10 == 0) {
                        Initializer_1.method_int(n10, 0.0f);
                        break Label_0400;
                    }
                }
                Initializer_1.method_int(Initializer_1.getInt_7(), n3 * 0.5f);
            }
        }
        final int n11 = enabled;
        final int max = Math.max(2, n4 / 2);
        com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.processAll_20(class_332, n7, n8, int1, n9, max, n11);
        String s = this.blockB.getString();
        int enabled2;
        final boolean b = (enabled2 = (this.blockB.isEnabled() ? 1 : 0)) != 0;
        int empty = 0;
        Label_0552: {
            Label_0520: {
                Label_0488: {
                    if (string == null) {
                        if (b) {
                            empty = (s.isEmpty() ? 1 : 0);
                            if (string != null) {
                                break Label_0488;
                            }
                            if (empty != 0) {
                                s = createString(24555, -27546);
                                if (string == null) {
                                    break Label_0520;
                                }
                            }
                        }
                        this.blockB.isEnabled();
                    }
                }
                if (string != null) {
                    break Label_0552;
                }
                if (!b) {
                    final boolean empty2 = s.isEmpty();
                    if (string != null) {
                        break Label_0552;
                    }
                    if (empty2) {
                        s = createString(24553, 2753);
                    }
                }
            }
            class_332.method_51433(this.class310.field_1772, s, n7 + 5, n8 + 6, n5, false);
            enabled2 = this.intValue_4 + 60;
        }
        final int n12 = empty;
        final int n13 = 110;
        final int n14 = 20;
        final int n15 = 3;
        final int n16 = 6;
        com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.processAll_20(class_332, this.intValue_3 + 5, n12, 140, n13, max, Initializer_1.method_int(0, 0.0f));
        class_332.method_44379(this.intValue_3 + 5, n12, this.intValue_3 + 150 - 5, n12 + n13);
        final List<class_2248> list = this.getList();
        final int n17 = (int)Math.ceil(list.size() / (double)n16);
        final int n18 = n13 / (n14 + n15);
        final int max2 = Math.max(0, n17 - n18);
        final int n19 = Math.max(0, Math.min(this.intValue_5 / n16, max2)) * n16;
        final int min = Math.min(n19 + n18 * n16, list.size());
        final int n20 = this.intValue_3 + (150 - (n16 * n14 + (n16 - 1) * n15)) / 2;
        int i = n19;
        while (true) {
            while (i < min) {
                final class_2248 class_333 = list.get(i);
                final int n21 = (i - n19) / n16;
                final int n22 = n20 + (i - n19) % n16 * (n14 + n15);
                final int n23 = n12 + 5 + n21 * (n14 + n15);
                final boolean checkCondition3 = com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, n22, n23, n14, n14);
                final int checkClass_2248 = this.calcB.checkClass_2248(class_333) ? 1 : 0;
                int n26;
                final int n25;
                int method_int;
                final int n24 = method_int = (n25 = (n26 = checkClass_2248));
                if (string != null) {
                    if (string == null) {
                        if (n25 <= 0) {
                            return;
                        }
                        i = this.intValue_3 + 150 - 12;
                        n26 = n12 + 5;
                    }
                    final int n27 = n26;
                    final int n28 = n13 - 10;
                    final int n29 = 4;
                    com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.processAll_20(class_332, i, n27, n29, n28, 2, Initializer_1.method_int(1342177280, n3));
                    final int n30 = max2;
                    final float n31 = (string == null && n30 <= 0) ? 0.0f : (n30 / (float)max2);
                    final int max3 = Math.max(20, (int)(n18 / (float)n17 * n28));
                    com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.processAll_20(class_332, i, n27 + (int)((n28 - max3) * n31), n29, max3, 2, Initializer_1.method_int(Initializer_1.getInt(), n3));
                    return;
                }
                int n32 = 0;
                Label_0909: {
                    if (string == null) {
                        if (n24 != 0) {
                            n32 = Initializer_1.method_int(Initializer_1.getInt(), n3 * 0.4f);
                            if (string == null) {
                                break Label_0909;
                            }
                        }
                        final boolean b2;
                        method_int = ((b2 = checkCondition3) ? 1 : 0);
                    }
                    if (string == null) {
                        if (n24 != 0) {
                            n32 = Initializer_1.method_int(Initializer_1.getInt_7(), n3 * 0.3f);
                            if (string == null) {
                                break Label_0909;
                            }
                        }
                        method_int = Initializer_1.method_int(0, 0.0f);
                    }
                    n32 = method_int;
                }
                int method_int2;
                final int n33 = method_int2 = n32;
                if (string == null) {
                    if (n33 != 0) {
                        com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.processAll_20(class_332, n22, n23, n14, n14, 2, n32);
                    }
                    final int n34;
                    method_int2 = (n34 = checkClass_2248);
                }
                Label_0976: {
                    if (string == null) {
                        if (n33 == 0) {
                            break Label_0976;
                        }
                        method_int2 = Initializer_1.method_int(Initializer_1.getInt(), n3 * 0.9f);
                    }
                    com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.processAll_30(class_332, n22, n23, n14, n14, 2, method_int2);
                }
                final class_1799 class_335;
                final class_1799 class_334 = class_335 = new class_1799((class_1935)class_333.method_8389());
                Label_1054: {
                    if ((string != null || class_335.method_7960()) && class_335.method_7909() != class_1802.field_8162) {
                        class_332.method_51427(class_334, n22, n23);
                        if (string == null) {
                            break Label_1054;
                        }
                    }
                    class_332.method_51433(this.class310.field_1772, "?", n22 + 6, n23 + 6, -1, true);
                }
                ++i;
                if (string != null) {
                    break;
                }
            }
            class_332.method_44380();
            int n25;
            int n26 = n25 = max2;
            continue;
        }
    }
    
    public boolean checkCondition(final double n, final double n2, final int n3) {
        if (this.calcB == null) {
            return false;
        }
        final int n4 = this.intValue_3 + 150 - 20;
        final int n5 = this.intValue_4 + 8;
        final int n6 = 16;
        if (com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, n4, n5, n6, n6)) {
            this.calcB = null;
            return true;
        }
        if (n3 == 0 && com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, this.intValue_3, this.intValue_4, 150, 30) && !com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, n4, n5, n6, n6)) {
            this.parseD.processAll(n, n2, this.intValue_3, this.intValue_4);
            return true;
        }
        if (this.blockB.checkCondition(n, n2, n3, this.intValue_3 + 10, this.intValue_4 + 35)) {
            return true;
        }
        final int n7 = this.intValue_4 + 60;
        final int n8 = 110;
        final int n9 = 20;
        final int n10 = 3;
        final int n11 = 6;
        if (com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, this.intValue_3 + 5, n7, 140, n8)) {
            final List<class_2248> list = this.getList();
            final int n12 = Math.max(0, Math.min(this.intValue_5 / n11, Math.max(0, (int)Math.ceil(list.size() / (double)n11) - n8 / (n9 + n10)))) * n11;
            final int n13 = (int)n - (this.intValue_3 + (150 - (n11 * n9 + (n11 - 1) * n10)) / 2);
            final int n14 = (int)n2 - n7 - 5;
            final int n15 = n13 / (n9 + n10);
            final int n16 = n14 / (n9 + n10);
            if (n15 >= 0 && n15 < n11 && n16 >= 0) {
                final int n17 = n12 + n16 * n11 + n15;
                if (n17 >= 0 && n17 < list.size()) {
                    this.setClass_2248((class_2248)list.get(n17));
                    return true;
                }
            }
        }
        return com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, this.intValue_3, this.intValue_4, 150, 180);
    }
    
    public boolean checkCondition_1(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (this.calcB == null) {
            return false;
        }
        if (this.parseD.isEnabled()) {
            this.parseD.createIntarr(n, n2);
            return true;
        }
        return false;
    }
    
    public boolean checkCondition_5(final double n, final double n2, final int n3) {
        if (this.calcB == null) {
            return false;
        }
        if (n3 == 0) {
            this.parseD.execute();
        }
        return false;
    }
    
    public boolean checkCondition_2(final double n, final double n2, final double n3, final double n4) {
        if (this.calcB == null) {
            return false;
        }
        final int n5 = this.intValue_4 + 60;
        final int n6 = 110;
        if (com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, this.intValue_3 + 5, n5, 140, n6)) {
            final List<class_2248> list = this.getList();
            final int n7 = 6;
            final int max = Math.max(0, (int)Math.ceil(list.size() / (double)n7) - n6 / (20 + 3));
            if (max > 0) {
                this.intValue_5 -= (int)n4 * n7;
                this.intValue_5 = Math.max(0, Math.min(this.intValue_5, max * n7));
                return true;
            }
        }
        return false;
    }
    
    public boolean checkCondition_3(final int n, final int n2, final int n3) {
        return this.calcB != null && this.blockB.checkCondition_1(n, n2, n3);
    }
    
    public boolean checkCondition_4(final char c, final int n) {
        return this.calcB != null && this.blockB.checkCondition_2(c, n);
    }
    
    private void setClass_2248(final class_2248 class_2248) {
        if (this.calcB.checkClass_2248(class_2248)) {
            this.calcB.setClass_2248_1(class_2248);
        }
        else {
            this.calcB.setClass_2248(class_2248);
        }
    }
    
    private List<class_2248> getList() {
        final ArrayList list = new ArrayList();
        final String lowerCase = this.blockB.getString().toLowerCase();
        final Set<class_2248> set = this.calcB.getSet();
        for (final class_2248 class_2248 : class_7923.field_41175) {
            final class_2960 method_10221 = class_7923.field_41175.method_10221((Object)class_2248);
            if (method_10221 == null) {
                continue;
            }
            final class_1799 class_2249 = new class_1799((class_1935)class_2248.method_8389());
            if (class_2249.method_7960()) {
                continue;
            }
            if (class_2249.method_7909() == class_1802.field_8162) {
                continue;
            }
            if (!this.computeString(method_10221.method_12832()).toLowerCase().contains(lowerCase)) {
                continue;
            }
            list.add(class_2248);
        }
        list.sort(this::lambda$getFilteredBlocks$0);
        return list;
    }
    
    private String computeString(final String s) {
        return Arrays.stream(s.split("_")).map((Function<? super String, ?>)Initializer::lambda$formatBlockName$1).collect((Collector<? super Object, ?, String>)Collectors.joining(" "));
    }
    
    private static String lambda$formatBlockName$1(final String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
    
    private int lambda$getFilteredBlocks$0(final Set set, final class_2248 class_2248, final class_2248 class_2249) {
        final boolean contains = set.contains(class_2248);
        final boolean contains2 = set.contains(class_2249);
        if (contains && !contains2) {
            return -1;
        }
        if (!contains && contains2) {
            return 1;
        }
        return this.computeString(class_7923.field_41175.method_10221((Object)class_2248).method_12832()).compareToIgnoreCase(this.computeString(class_7923.field_41175.method_10221((Object)class_2249).method_12832()));
    }
    
    static {
        final String[] strArr2 = new String[3];
        int n = 0;
        final String s;
        final int length = (s = "\u00e1\u0011t'\u00e4\u00d6ª\u0000\u00dc\u00c8\u0087\u0000\u00926\u00c3E\u00ea\u00ff8±\u00db\rZd\u000e\u009e\u0007\b\u00d6`Py6\u0082\u00dc\u0015\u00ec'\u00d5\u00e1\u00d0\u000e,\u001b\f«\u009dl\u00d1»«\u00f4\u00e7\u00c9\u0099w\u00ef").length();
        int char1 = 21;
        int index = -1;
        Label_0023: {
            break Label_0023;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 91);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0199: {
                        if (length2 > 1) {
                            break Label_0199;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 2;
                                case 1 -> 54;
                                case 2 -> 96;
                                case 3 -> 72;
                                case 4 -> 120;
                                case 5 -> 95;
                                default -> 38;
                            }));
                            ++n5;
                        } while (n2 == 0);
                    }
                    if (length2 > n5) {
                        continue;
                    }
                    break;
                }
                strArr2[n++] = new String(charArray).intern();
            } while ((index += char1) < length);
        }
        strArr = strArr2;
        strArr_1 = new String[3];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x5FEB) & 0xFFFF;
        if (Initializer.strArr_1[n3] == null) {
            final char[] charArray = Initializer.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 91;
                case 1 -> 74;
                case 2 -> 21;
                case 3 -> 29;
                case 4 -> 89;
                case 5 -> 107;
                case 6 -> 30;
                case 7 -> 145;
                case 8 -> 227;
                case 9 -> 17;
                case 10 -> 217;
                case 11 -> 88;
                case 12 -> 27;
                case 13 -> 158;
                case 14 -> 85;
                case 15 -> 156;
                case 16 -> 104;
                case 17 -> 115;
                case 18 -> 192;
                case 19 -> 18;
                case 20 -> 0;
                case 21 -> 169;
                case 22 -> 81;
                case 23 -> 59;
                case 24 -> 201;
                case 25 -> 9;
                case 26 -> 25;
                case 27 -> 131;
                case 28 -> 228;
                case 29 -> 110;
                case 30 -> 87;
                case 31 -> 26;
                case 32 -> 19;
                case 33 -> 149;
                case 34 -> 124;
                case 35 -> 10;
                case 36 -> 236;
                case 37 -> 12;
                case 38 -> 206;
                case 39 -> 245;
                case 40 -> 165;
                case 41 -> 210;
                case 42 -> 95;
                case 43 -> 37;
                case 44 -> 175;
                case 45 -> 48;
                case 46 -> 177;
                case 47 -> 143;
                case 48 -> 212;
                case 49 -> 83;
                case 50 -> 98;
                case 51 -> 42;
                case 52 -> 195;
                case 53 -> 69;
                case 54 -> 198;
                case 55 -> 36;
                case 56 -> 90;
                case 57 -> 39;
                case 58 -> 2;
                case 59 -> 211;
                case 60 -> 214;
                case 61 -> 230;
                case 62 -> 218;
                case 63 -> 105;
                case 64 -> 205;
                case 65 -> 103;
                case 66 -> 106;
                case 67 -> 44;
                case 68 -> 182;
                case 69 -> 213;
                case 70 -> 63;
                case 71 -> 128;
                case 72 -> 62;
                case 73 -> 108;
                case 74 -> 47;
                case 75 -> 86;
                case 76 -> 113;
                case 77 -> 153;
                case 78 -> 159;
                case 79 -> 176;
                case 80 -> 252;
                case 81 -> 23;
                case 82 -> 61;
                case 83 -> 226;
                case 84 -> 187;
                case 85 -> 82;
                case 86 -> 146;
                case 87 -> 224;
                case 88 -> 248;
                case 89 -> 254;
                case 90 -> 58;
                case 91 -> 16;
                case 92 -> 239;
                case 93 -> 68;
                case 94 -> 166;
                case 95 -> 94;
                case 96 -> 121;
                case 97 -> 28;
                case 98 -> 151;
                case 99 -> 137;
                case 100 -> 157;
                case 101 -> 141;
                case 102 -> 13;
                case 103 -> 78;
                case 104 -> 3;
                case 105 -> 190;
                case 106 -> 20;
                case 107 -> 203;
                case 108 -> 168;
                case 109 -> 96;
                case 110 -> 255;
                case 111 -> 148;
                case 112 -> 136;
                case 113 -> 242;
                case 114 -> 140;
                case 115 -> 167;
                case 116 -> 51;
                case 117 -> 237;
                case 118 -> 34;
                case 119 -> 24;
                case 120 -> 71;
                case 121 -> 53;
                case 122 -> 181;
                case 123 -> 231;
                case 124 -> 22;
                case 125 -> 188;
                case 126 -> 55;
                case 127 -> 133;
                case 128 -> 155;
                case 129 -> 193;
                case 130 -> 38;
                case 131 -> 179;
                case 132 -> 241;
                case 133 -> 235;
                case 134 -> 184;
                case 135 -> 247;
                case 136 -> 183;
                case 137 -> 202;
                case 138 -> 152;
                case 139 -> 138;
                case 140 -> 144;
                case 141 -> 162;
                case 142 -> 64;
                case 143 -> 171;
                case 144 -> 80;
                case 145 -> 76;
                case 146 -> 154;
                case 147 -> 225;
                case 148 -> 7;
                case 149 -> 116;
                case 150 -> 209;
                case 151 -> 15;
                case 152 -> 50;
                case 153 -> 240;
                case 154 -> 232;
                case 155 -> 93;
                case 156 -> 97;
                case 157 -> 125;
                case 158 -> 112;
                case 159 -> 66;
                case 160 -> 1;
                case 161 -> 129;
                case 162 -> 207;
                case 163 -> 101;
                case 164 -> 220;
                case 165 -> 174;
                case 166 -> 49;
                case 167 -> 35;
                case 168 -> 92;
                case 169 -> 142;
                case 170 -> 135;
                case 171 -> 77;
                case 172 -> 234;
                case 173 -> 185;
                case 174 -> 170;
                case 175 -> 72;
                case 176 -> 199;
                case 177 -> 243;
                case 178 -> 160;
                case 179 -> 189;
                case 180 -> 222;
                case 181 -> 219;
                case 182 -> 134;
                case 183 -> 111;
                case 184 -> 123;
                case 185 -> 238;
                case 186 -> 139;
                case 187 -> 197;
                case 188 -> 100;
                case 189 -> 244;
                case 190 -> 40;
                case 191 -> 56;
                case 192 -> 233;
                case 193 -> 117;
                case 194 -> 102;
                case 195 -> 163;
                case 196 -> 6;
                case 197 -> 99;
                case 198 -> 250;
                case 199 -> 70;
                case 200 -> 67;
                case 201 -> 200;
                case 202 -> 57;
                case 203 -> 126;
                case 204 -> 32;
                case 205 -> 215;
                case 206 -> 246;
                case 207 -> 191;
                case 208 -> 73;
                case 209 -> 178;
                case 210 -> 249;
                case 211 -> 196;
                case 212 -> 172;
                case 213 -> 43;
                case 214 -> 122;
                case 215 -> 150;
                case 216 -> 31;
                case 217 -> 253;
                case 218 -> 147;
                case 219 -> 75;
                case 220 -> 221;
                case 221 -> 11;
                case 222 -> 216;
                case 223 -> 161;
                case 224 -> 45;
                case 225 -> 33;
                case 226 -> 229;
                case 227 -> 251;
                case 228 -> 119;
                case 229 -> 127;
                case 230 -> 5;
                case 231 -> 8;
                case 232 -> 109;
                case 233 -> 204;
                case 234 -> 173;
                case 235 -> 223;
                case 236 -> 120;
                case 237 -> 180;
                case 238 -> 84;
                case 239 -> 60;
                case 240 -> 52;
                case 241 -> 132;
                case 242 -> 4;
                case 243 -> 186;
                case 244 -> 54;
                case 245 -> 208;
                case 246 -> 164;
                case 247 -> 65;
                case 248 -> 46;
                case 249 -> 114;
                case 250 -> 194;
                case 251 -> 79;
                case 252 -> 14;
                case 253 -> 118;
                case 254 -> 130;
                default -> 41;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < '\0') {
                n6 += '\u0100';
            }
            int n7 = ((n2 & 0xFFFF) >>> 8) - n5;
            if (n7 < '\0') {
                n7 += '\u0100';
            }
            for (int i = 0; i < charArray.length; ++i) {
                final int n8 = i % 2;
                final char[] array = charArray;
                final int n9 = i;
                final char c = array[n9];
                if (n8 == 0) {
                    array[n9] = (char)(c ^ n6);
                    n6 = (((n6 >>> 3 | n6 << 5) ^ charArray[i]) & 0xFF);
                }
                else {
                    array[n9] = (char)(c ^ n7);
                    n7 = (((n7 >>> 3 | n7 << 5) ^ charArray[i]) & 0xFF);
                }
            }
            Initializer.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer.strArr_1[n3];
    }
}
