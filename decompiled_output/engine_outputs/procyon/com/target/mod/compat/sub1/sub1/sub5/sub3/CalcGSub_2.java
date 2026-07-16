// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_2246;
import java.util.LinkedList;
import net.minecraft.class_746;
import java.util.Iterator;
import net.minecraft.class_2818;
import net.minecraft.class_638;
import net.minecraft.class_310;
import net.minecraft.class_2561;
import net.minecraft.class_2382;
import net.minecraft.class_1944;
import net.minecraft.class_2338;
import net.minecraft.class_1923;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import java.util.ArrayList;
import java.util.HashSet;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import java.util.List;
import java.util.Set;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public final class CalcGSub_2 extends AbstractLoadF
{
    private final RenderASub bindK;
    private final RenderASub bindK_1;
    private final RenderASub bindK_2;
    private final RenderASub bindK_3;
    private final RenderASub bindK_4;
    private final RenderASub bindK_5;
    private final RenderASub bindK_6;
    private final RenderASub_1 buffC;
    private final RenderASub_1 buffC_1;
    private int intValue;
    private final Set<Long> set;
    private final List<Initializer_8> list;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_2() {
        super(createString(-25286, -19291), createString(-25289, 6061), Initializer.stepF);
        this.bindK = new RenderASub(createString(-25291, -22052), 4.0, 1.0, 16.0, 1.0);
        this.bindK_1 = new RenderASub(createString(-25287, -13837), 50.0, 10.0, 120.0, 5.0);
        this.bindK_2 = new RenderASub(createString(-25292, -28232), -60.0, -64.0, 60.0, 5.0);
        this.bindK_3 = new RenderASub(createString(-25293, 5778), 8.0, 1.0, 15.0, 1.0);
        this.bindK_4 = new RenderASub(createString(-25290, 30592), 5.0, 2.0, 30.0, 1.0);
        this.bindK_5 = new RenderASub(createString(-25294, 4537), 8.0, 3.0, 24.0, 1.0);
        this.bindK_6 = new RenderASub(createString(-25296, -11844), 60.0, 10.0, 300.0, 10.0);
        this.buffC = new RenderASub_1(createString(-25295, -6046), true);
        this.buffC_1 = new RenderASub_1(createString(-25288, 3202), true);
        this.intValue = 0;
        this.set = new HashSet<Long>();
        this.list = new ArrayList<Initializer_8>();
        this.setRenderaarr(this.bindK, this.bindK_1, this.bindK_2, this.bindK_3, this.bindK_4, this.bindK_5, this.bindK_6, this.buffC, this.buffC_1);
    }
    
    @Override
    public void execute() {
        this.set.clear();
        this.list.clear();
        this.intValue = 0;
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.set.clear();
        this.list.clear();
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (CalcGSub_2.class310.field_1724 == null || CalcGSub_2.class310.field_1687 == null) {
            return;
        }
        ++this.intValue;
        if (this.intValue < this.bindK_6.getValue().intValue()) {
            return;
        }
        this.intValue = 0;
        CalcGSub_2.class310.execute(this::execute_3);
    }
    
    private void execute_3() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        final class_310 class310 = CalcGSub_2.class310;
        if (stringarrArray != null) {
            if (class310.field_1724 == null) {
                return;
            }
            final class_310 class311 = CalcGSub_2.class310;
        }
        final class_638 field_1687 = class310.field_1687;
        if (stringarrArray != null) {
            if (field_1687 == null) {
                return;
            }
            final class_638 field_1688 = CalcGSub_2.class310.field_1687;
        }
        final class_638 class_638 = field_1687;
        final class_1923 method_31476 = CalcGSub_2.class310.field_1724.method_31476();
        final int intValue = this.bindK.getValue().intValue();
        final int intValue2 = this.bindK_1.getValue().intValue();
        final int intValue3 = this.bindK_2.getValue().intValue();
        final int intValue4 = this.bindK_3.getValue().intValue();
        final boolean booleanValue = this.buffC.getValue();
        final ArrayList list = new ArrayList();
        int n = 0;
        int n2 = method_31476.field_9181 - intValue;
        while (true) {
            while (true) {
                do {
                    int i = 0;
                Label_0728_Outer:
                    while (i <= method_31476.field_9181 + intValue) {
                        final int n3 = method_31476.field_9180 - intValue;
                        if (stringarrArray != null) {
                            int n4 = n3;
                            do {
                                int j = 0;
                            Label_0171:
                                while (j <= method_31476.field_9180 + intValue) {
                                    final long method_31477 = class_1923.method_8331(n2, n4);
                                    i = (this.set.contains(method_31477) ? 1 : 0);
                                    if (stringarrArray == null) {
                                        continue Label_0728_Outer;
                                    }
                                    Label_0441: {
                                        if (i == 0) {
                                            final class_2818 method_31478 = class_638.method_2935().method_21730(n2, n4);
                                            if (stringarrArray != null) {
                                                if (method_31478 == null) {
                                                    break Label_0441;
                                                }
                                                this.set.add(method_31477);
                                                ++n;
                                            }
                                            final int n5 = n2 << 4;
                                            final int n6 = n4 << 4;
                                            int n7 = n5;
                                            do {
                                                int k = 0;
                                            Label_0275:
                                                while (k < n5 + 16) {
                                                    j = n6;
                                                    if (stringarrArray == null) {
                                                        continue Label_0171;
                                                    }
                                                    int n8 = j;
                                                    do {
                                                        int l = 0;
                                                        int n9 = 0;
                                                    Label_0298:
                                                        while (l < n9) {
                                                            k = intValue3;
                                                            if (stringarrArray == null) {
                                                                continue Label_0275;
                                                            }
                                                            int n10 = k;
                                                            while (n10 < intValue2) {
                                                                final class_2338 class_639 = new class_2338(n7, n10, n8);
                                                                int n12;
                                                                int n11;
                                                                l = (n11 = (n12 = class_638.method_8314(class_1944.field_9282, class_639)));
                                                                Label_0420: {
                                                                    if (stringarrArray != null) {
                                                                        n9 = intValue4;
                                                                        if (stringarrArray == null) {
                                                                            continue Label_0298;
                                                                        }
                                                                        if (l < n9) {
                                                                            break Label_0420;
                                                                        }
                                                                        n12 = (n11 = (booleanValue ? 1 : 0));
                                                                    }
                                                                    Label_0395: {
                                                                        if (stringarrArray != null) {
                                                                            if (n11 != 0) {
                                                                                final int n13 = n12 = (this.checkCondition(class_638, class_639) ? 1 : 0);
                                                                                if (stringarrArray == null) {
                                                                                    break Label_0395;
                                                                                }
                                                                                if (n13 != 0) {
                                                                                    break Label_0420;
                                                                                }
                                                                            }
                                                                            n12 = class_638.method_8314(class_1944.field_9284, class_639);
                                                                        }
                                                                    }
                                                                    final int n14 = n12;
                                                                    if (stringarrArray != null) {
                                                                        if (n14 <= 4) {
                                                                            list.add(class_639);
                                                                        }
                                                                    }
                                                                }
                                                                n10 += 2;
                                                                if (stringarrArray == null) {
                                                                    break;
                                                                }
                                                            }
                                                            n8 += 2;
                                                        }
                                                        break;
                                                    } while (stringarrArray != null);
                                                    n7 += 2;
                                                }
                                                break;
                                            } while (stringarrArray != null);
                                        }
                                    }
                                    ++n4;
                                }
                                break;
                            } while (stringarrArray != null);
                            ++n2;
                        }
                        else {
                            if (n3 != 0) {
                                return;
                            }
                            final List<Initializer_8> computeList = this.computeList(list);
                            final List<Initializer_8> list2 = computeList;
                            final int intValue5 = this.bindK_4.getValue().intValue();
                            while (true) {
                                for (final Initializer_8 initializer_8 : list2) {
                                    int n17;
                                    int empty;
                                    final int n16;
                                    int booleanValue2;
                                    final int n15 = booleanValue2 = (n16 = (empty = (n17 = initializer_8.intValue)));
                                    if (stringarrArray == null) {
                                        if (stringarrArray != null) {
                                            if (n16 <= 0) {
                                                return;
                                            }
                                            n17 = (empty = (list2.isEmpty() ? 1 : 0));
                                        }
                                        if (stringarrArray != null) {
                                            if (empty == 0) {
                                                return;
                                            }
                                            n17 = list.size();
                                        }
                                        if (n17 > 0) {}
                                        return;
                                    }
                                    if (stringarrArray != null) {
                                        if (n15 < intValue5) {
                                            continue Label_0728_Outer;
                                        }
                                        final boolean checkClass_2338;
                                        booleanValue2 = ((checkClass_2338 = this.checkClass_2338(initializer_8.class2338)) ? 1 : 0);
                                    }
                                    if (stringarrArray != null) {
                                        if (n15 != 0) {
                                            continue Label_0728_Outer;
                                        }
                                        this.list.add(initializer_8);
                                        booleanValue2 = (((boolean)this.buffC_1.getValue()) ? 1 : 0);
                                    }
                                    Label_0722: {
                                        if (booleanValue2 != 0) {
                                            final class_746 field_1689 = CalcGSub_2.class310.field_1724;
                                            if (stringarrArray != null) {
                                                if (field_1689 == null) {
                                                    break Label_0722;
                                                }
                                                final class_746 field_1690 = CalcGSub_2.class310.field_1724;
                                            }
                                            CalcGSub_2.class310.field_1724.method_7353((class_2561)class_2561.method_43470(String.format(createString(-25285, 4723), initializer_8.class2338.method_10263(), initializer_8.class2338.method_10264(), initializer_8.class2338.method_10260(), initializer_8.intValue, (int)Math.sqrt(field_1689.method_24515().method_10262((class_2382)initializer_8.class2338)))), false);
                                        }
                                    }
                                    if (stringarrArray == null) {
                                        break;
                                    }
                                }
                                int n17;
                                int n16;
                                int empty = n16 = (n17 = n);
                                continue;
                            }
                        }
                    }
                    break;
                } while (stringarrArray != null);
                List<Initializer_8> computeList;
                final ArrayList list3 = (ArrayList)(computeList = list);
                if (stringarrArray != null) {
                    list3.isEmpty();
                    continue;
                }
                break;
            }
            continue;
        }
    }
    
    private List<Initializer_8> computeList(final List<class_2338> list) {
        final ArrayList list2 = new ArrayList();
        final boolean[] array = new boolean[list.size()];
        final int intValue = this.bindK_5.getValue().intValue();
        final int n = intValue * intValue;
        for (int i = 0; i < list.size(); ++i) {
            if (!array[i]) {
                final ArrayList list3 = new ArrayList();
                final LinkedList list4 = new LinkedList();
                list4.add(i);
                array[i] = true;
                while (!list4.isEmpty()) {
                    final class_2338 class_2338 = list.get((int)list4.poll());
                    list3.add(class_2338);
                    for (int j = 0; j < list.size(); ++j) {
                        if (!array[j]) {
                            if (class_2338.method_10262((class_2382)list.get(j)) <= n) {
                                array[j] = true;
                                list4.add(j);
                            }
                        }
                    }
                }
                if (list3.size() >= 2) {
                    int n2 = 0;
                    int n3 = 0;
                    int n4 = 0;
                    for (final class_2338 class_2339 : list3) {
                        n2 += class_2339.method_10263();
                        n3 += class_2339.method_10264();
                        n4 += class_2339.method_10260();
                    }
                    list2.add(new Initializer_8(new class_2338(n2 / list3.size(), n3 / list3.size(), n4 / list3.size()), list3.size()));
                }
            }
        }
        return list2;
    }
    
    private boolean checkCondition(final class_638 class_638, final class_2338 class_639) {
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                for (int k = -2; k <= 2; ++k) {
                    if (class_638.method_8320(class_639.method_10069(i, j, k)).method_27852(class_2246.field_10164)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean checkClass_2338(final class_2338 class_2338) {
        final Iterator<Initializer_8> iterator = this.list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().class2338.method_10262((class_2382)class_2338) < 256.0) {
                return true;
            }
        }
        return false;
    }
    
    static {
        final String[] strArr2 = new String[12];
        int n = 0;
        String s;
        int n2 = (s = "^º\u00eb·\u00cc\u00f1\u00e2\u0092=i©\u0017\u00d7&\u000fk¡±j\u00d7w§\u00e7W\u0082\u00d7\u00ef\u00f7\u0007]\rf\b\u00ea\u0012.\u00d7|«F\u0083\u00053\u000b\u000b\u00dd\u001a\u00cb\u00d5¶\"9\u0084m]\u00f3\u000b\u00ec\u00d0i\f\u00d3¶\u00d7\u0001Z&±1\u00e7Eb\u00fa\u0082\u00e8\u00cb\u0012\u00c9\u00fa\u00d1\u00ef\u000b\u00eam¾l&\u0019\u00fe\u008d²\u00d0\u00c1\u0000q\u00cd®\u00dfYb\u0014\u00d4\u00d1\u0096:C|\u0086½uh¡.\u0085\u0083<0\u001a\u0005 \u000e\u00e0\u00d7\u00f8\u000bE!\u008e7¢h\u00e24we«\u000b'~8\u0091\u00e6n¼h¸µ\u00ffIC\u0010\u001e'\u0088\u0084Bwko<`\u0018\u00df\u0080n\u0000µ\u0010\u009eu\u00e5\u00cd\u0089\u00e2\u00deWW\u0087®O\f²£\u008d\u0016Wf\u00de¤\u00ee\u00caP\u00da4\u0084Pc¹\u0088w|\u00e7e\u00ca\u00fe\u0098\u009d\u00eb\u00ed\u009c\u00d4¶\u00e2Ub4\u009aX\u00f3b\u0091V").length();
        int n3 = 14;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 89));
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
                        Label_0263: {
                            if (length > 1) {
                                break Label_0263;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 58;
                                    case 1 -> 89;
                                    case 2 -> 75;
                                    case 3 -> 43;
                                    case 4 -> 5;
                                    case 5 -> 104;
                                    default -> 33;
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
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0024;
                            }
                            n2 = (s = "·\u0099©$\u00feV\u0010¼\u008ax\u001b\u0005£\u00d2\u00e12{").length();
                            n3 = 11;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0024;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 33)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        strArr = strArr2;
        strArr_1 = new String[12];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFF9D32) & 0xFFFF;
        if (CalcGSub_2.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_2.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 47;
                case 1 -> 171;
                case 2 -> 68;
                case 3 -> 124;
                case 4 -> 209;
                case 5 -> 102;
                case 6 -> 221;
                case 7 -> 251;
                case 8 -> 78;
                case 9 -> 228;
                case 10 -> 217;
                case 11 -> 39;
                case 12 -> 23;
                case 13 -> 96;
                case 14 -> 234;
                case 15 -> 93;
                case 16 -> 81;
                case 17 -> 73;
                case 18 -> 184;
                case 19 -> 74;
                case 20 -> 186;
                case 21 -> 108;
                case 22 -> 163;
                case 23 -> 226;
                case 24 -> 175;
                case 25 -> 77;
                case 26 -> 196;
                case 27 -> 128;
                case 28 -> 146;
                case 29 -> 178;
                case 30 -> 88;
                case 31 -> 75;
                case 32 -> 236;
                case 33 -> 143;
                case 34 -> 66;
                case 35 -> 99;
                case 36 -> 145;
                case 37 -> 10;
                case 38 -> 103;
                case 39 -> 252;
                case 40 -> 57;
                case 41 -> 199;
                case 42 -> 170;
                case 43 -> 140;
                case 44 -> 224;
                case 45 -> 149;
                case 46 -> 150;
                case 47 -> 109;
                case 48 -> 125;
                case 49 -> 67;
                case 50 -> 12;
                case 51 -> 239;
                case 52 -> 31;
                case 53 -> 110;
                case 54 -> 63;
                case 55 -> 65;
                case 56 -> 173;
                case 57 -> 165;
                case 58 -> 64;
                case 59 -> 132;
                case 60 -> 29;
                case 61 -> 59;
                case 62 -> 162;
                case 63 -> 212;
                case 64 -> 89;
                case 65 -> 246;
                case 66 -> 8;
                case 67 -> 159;
                case 68 -> 157;
                case 69 -> 15;
                case 70 -> 37;
                case 71 -> 122;
                case 72 -> 167;
                case 73 -> 17;
                case 74 -> 52;
                case 75 -> 80;
                case 76 -> 243;
                case 77 -> 245;
                case 78 -> 130;
                case 79 -> 160;
                case 80 -> 123;
                case 81 -> 58;
                case 82 -> 91;
                case 83 -> 240;
                case 84 -> 219;
                case 85 -> 116;
                case 86 -> 101;
                case 87 -> 76;
                case 88 -> 6;
                case 89 -> 204;
                case 90 -> 27;
                case 91 -> 250;
                case 92 -> 70;
                case 93 -> 85;
                case 94 -> 100;
                case 95 -> 255;
                case 96 -> 83;
                case 97 -> 244;
                case 98 -> 13;
                case 99 -> 69;
                case 100 -> 97;
                case 101 -> 180;
                case 102 -> 115;
                case 103 -> 183;
                case 104 -> 205;
                case 105 -> 18;
                case 106 -> 216;
                case 107 -> 61;
                case 108 -> 154;
                case 109 -> 98;
                case 110 -> 203;
                case 111 -> 227;
                case 112 -> 193;
                case 113 -> 138;
                case 114 -> 231;
                case 115 -> 144;
                case 116 -> 177;
                case 117 -> 44;
                case 118 -> 192;
                case 119 -> 169;
                case 120 -> 51;
                case 121 -> 172;
                case 122 -> 158;
                case 123 -> 210;
                case 124 -> 151;
                case 125 -> 72;
                case 126 -> 166;
                case 127 -> 62;
                case 128 -> 4;
                case 129 -> 198;
                case 130 -> 164;
                case 131 -> 214;
                case 132 -> 235;
                case 133 -> 84;
                case 134 -> 19;
                case 135 -> 241;
                case 136 -> 185;
                case 137 -> 215;
                case 138 -> 71;
                case 139 -> 129;
                case 140 -> 16;
                case 141 -> 181;
                case 142 -> 200;
                case 143 -> 190;
                case 144 -> 112;
                case 145 -> 40;
                case 146 -> 179;
                case 147 -> 174;
                case 148 -> 152;
                case 149 -> 1;
                case 150 -> 187;
                case 151 -> 38;
                case 152 -> 41;
                case 153 -> 225;
                case 154 -> 46;
                case 155 -> 43;
                case 156 -> 222;
                case 157 -> 218;
                case 158 -> 253;
                case 159 -> 207;
                case 160 -> 121;
                case 161 -> 206;
                case 162 -> 7;
                case 163 -> 87;
                case 164 -> 191;
                case 165 -> 104;
                case 166 -> 14;
                case 167 -> 94;
                case 168 -> 142;
                case 169 -> 25;
                case 170 -> 22;
                case 171 -> 119;
                case 172 -> 131;
                case 173 -> 137;
                case 174 -> 28;
                case 175 -> 220;
                case 176 -> 118;
                case 177 -> 90;
                case 178 -> 127;
                case 179 -> 194;
                case 180 -> 79;
                case 181 -> 9;
                case 182 -> 21;
                case 183 -> 176;
                case 184 -> 254;
                case 185 -> 133;
                case 186 -> 95;
                case 187 -> 230;
                case 188 -> 135;
                case 189 -> 86;
                case 190 -> 107;
                case 191 -> 113;
                case 192 -> 141;
                case 193 -> 92;
                case 194 -> 168;
                case 195 -> 42;
                case 196 -> 105;
                case 197 -> 197;
                case 198 -> 237;
                case 199 -> 238;
                case 200 -> 3;
                case 201 -> 223;
                case 202 -> 11;
                case 203 -> 136;
                case 204 -> 247;
                case 205 -> 50;
                case 206 -> 111;
                case 207 -> 189;
                case 208 -> 117;
                case 209 -> 20;
                case 210 -> 233;
                case 211 -> 208;
                case 212 -> 5;
                case 213 -> 45;
                case 214 -> 114;
                case 215 -> 32;
                case 216 -> 82;
                case 217 -> 202;
                case 218 -> 201;
                case 219 -> 161;
                case 220 -> 188;
                case 221 -> 182;
                case 222 -> 155;
                case 223 -> 248;
                case 224 -> 2;
                case 225 -> 120;
                case 226 -> 211;
                case 227 -> 34;
                case 228 -> 33;
                case 229 -> 54;
                case 230 -> 156;
                case 231 -> 55;
                case 232 -> 48;
                case 233 -> 195;
                case 234 -> 153;
                case 235 -> 53;
                case 236 -> 249;
                case 237 -> 49;
                case 238 -> 36;
                case 239 -> 60;
                case 240 -> 56;
                case 241 -> 147;
                case 242 -> 213;
                case 243 -> 26;
                case 244 -> 35;
                case 245 -> 126;
                case 246 -> 0;
                case 247 -> 139;
                case 248 -> 232;
                case 249 -> 134;
                case 250 -> 106;
                case 251 -> 24;
                case 252 -> 148;
                case 253 -> 229;
                case 254 -> 30;
                default -> 242;
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
            CalcGSub_2.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_2.strArr_1[n3];
    }
}
