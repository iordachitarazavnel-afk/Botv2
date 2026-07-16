// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_1753;
import net.minecraft.class_1792;
import net.minecraft.class_1657;
import net.minecraft.class_636;
import java.util.Iterator;
import net.minecraft.class_243;
import net.minecraft.class_746;
import net.minecraft.class_2350$class_2353;
import net.minecraft.class_1922;
import net.minecraft.class_2350;
import net.minecraft.class_1802;
import net.minecraft.class_1268;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import net.minecraft.class_2246;
import net.minecraft.class_3965;
import net.minecraft.class_239$class_240;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_7;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public final class CalcGSub_6 extends AbstractLoadF
{
    private final RenderASub_7 gridH;
    private final RenderASub bindK;
    private final RenderASub bindK_1;
    private class_2338 class2338;
    private class_2338 class2338_1;
    private int intValue;
    private int intValue_1;
    private int intValue_2;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_6() {
        super(createString(-13641, -18230), createString(-13648, 15548), Initializer.CART);
        this.gridH = new RenderASub_7(createString(-13645, -22932), 1);
        this.bindK = new RenderASub(createString(-13646, 192), 0.0, 0.0, 10.0, 1.0);
        this.bindK_1 = new RenderASub(createString(-13647, 16909), 8.0, 3.0, 20.0, 1.0);
        this.class2338 = null;
        this.class2338_1 = null;
        this.intValue = 0;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.setRenderaarr(this.gridH, this.bindK, this.bindK_1);
    }
    
    @Override
    public void execute() {
        this.execute_2();
        super.execute();
    }
    
    @Override
    public void execute_1() {
        CalcGSub_6.class310.execute(CalcGSub_6::lambda$onDisable$0);
        this.execute_2();
        super.execute_1();
    }
    
    private void execute_2() {
        this.intValue = 0;
        this.intValue_1 = 0;
        this.class2338 = null;
        this.class2338_1 = null;
        this.intValue_2 = 0;
    }
    
    public void execute_3() {
        if (CalcGSub_6.class310.field_1724 == null || CalcGSub_6.class310.field_1687 == null || CalcGSub_6.class310.field_1755 != null) {
            return;
        }
        if ((this.gridH.getValue() == -1 || !Initializer_9.checkInt(this.gridH.getValue())) && this.intValue < 6) {
            this.execute_2();
            return;
        }
        if (this.intValue_1 > 0) {
            --this.intValue_1;
            return;
        }
        CalcGSub_6.class310.execute(this::execute_4);
    }
    
    private void execute_4() {
        if (CalcGSub_6.class310.field_1724 == null || CalcGSub_6.class310.field_1687 == null) {
            return;
        }
        final int intValue = this.bindK.getValue().intValue();
        switch (this.intValue) {
            case 0: {
                if (!this.isEnabled()) {
                    break;
                }
                if (intValue > 0) {
                    this.intValue = 1;
                    this.intValue_1 = intValue;
                    break;
                }
                this.intValue = 2;
                break;
            }
            case 1: {
                this.intValue = 2;
                break;
            }
            case 2: {
                if (!this.isEnabled_1()) {
                    this.execute_2();
                    break;
                }
                if (intValue > 0) {
                    this.intValue = 3;
                    this.intValue_1 = intValue;
                    break;
                }
                this.intValue = 4;
                break;
            }
            case 3: {
                this.intValue = 4;
                break;
            }
            case 4: {
                if (!this.isEnabled_2()) {
                    this.execute_2();
                    break;
                }
                if (intValue > 0) {
                    this.intValue = 5;
                    this.intValue_1 = intValue;
                    break;
                }
                this.intValue = 6;
                break;
            }
            case 5: {
                this.intValue = 6;
                break;
            }
            case 6: {
                if (this.isEnabled_3()) {
                    this.intValue = 7;
                    this.intValue_2 = 0;
                    this.execute_5();
                    this.execute_6();
                    break;
                }
                this.execute_2();
                break;
            }
            case 7: {
                this.execute_5();
                ++this.intValue_2;
                if (this.intValue_2 >= this.bindK_1.getValue().intValue()) {
                    this.execute_7();
                    this.execute_2();
                    break;
                }
                break;
            }
        }
    }
    
    private boolean isEnabled() {
        if (CalcGSub_6.class310.field_1765 == null || CalcGSub_6.class310.field_1765.method_17783() != class_239$class_240.field_1332) {
            return false;
        }
        final class_3965 class_3965 = (class_3965)CalcGSub_6.class310.field_1765;
        final class_2338 method_17777 = class_3965.method_17777();
        final class_2338 method_17778 = method_17777.method_10093(class_3965.method_17780());
        if (this.class2338_1 != null && method_17778.equals((Object)this.class2338_1)) {
            return false;
        }
        if (CalcGSub_6.class310.field_1687.method_8320(method_17777).method_27852(class_2246.field_10431) || CalcGSub_6.class310.field_1687.method_8320(method_17778).method_27852(class_2246.field_10431)) {
            return false;
        }
        if (this.checkClass_2338(method_17778)) {
            this.class2338 = method_17778;
            return true;
        }
        if (!CalcGSub_6.class310.field_1687.method_8320(method_17778).method_45474()) {
            return false;
        }
        if (!Initializer_10.checkPredicate_1(CalcGSub_6::lambda$placeRail$1)) {
            return false;
        }
        if (CalcGSub_6.class310.field_1761 != null && CalcGSub_6.class310.field_1761.method_2896(CalcGSub_6.class310.field_1724, class_1268.field_5808, class_3965).method_23665()) {
            CalcGSub_6.class310.field_1724.method_6104(class_1268.field_5808);
            this.class2338 = method_17778;
            return true;
        }
        return false;
    }
    
    private boolean isEnabled_1() {
        if (this.class2338 == null || !this.checkClass_2338(this.class2338)) {
            return false;
        }
        if (!Initializer_10.checkClass_1792(class_1802.field_8069)) {
            return false;
        }
        final class_3965 class_3965 = new class_3965(this.class2338.method_46558(), class_2350.field_11036, this.class2338, false);
        if (CalcGSub_6.class310.field_1761 != null && CalcGSub_6.class310.field_1761.method_2896(CalcGSub_6.class310.field_1724, class_1268.field_5808, class_3965).method_23665()) {
            CalcGSub_6.class310.field_1724.method_6104(class_1268.field_5808);
            return true;
        }
        return false;
    }
    
    private boolean isEnabled_2() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        if (this.class2338 != null) {
            final class_746 field_1724 = CalcGSub_6.class310.field_1724;
            if (stringarrArray != null) {
                if (field_1724 == null) {
                    return false;
                }
                final class_746 field_1725 = CalcGSub_6.class310.field_1724;
            }
            final class_243 method_73189 = field_1724.method_73189();
            final class_243 method_73190 = this.class2338.method_46558();
            final class_243 method_73191 = method_73190.method_1020(method_73189).method_1029();
            final class_243 method_73192 = method_73189.method_1019(method_73191.method_1021(Math.min(method_73189.method_1022(method_73190) * 0.6, 3.0)));
            final class_2338 class_2338;
            class_2338 method_73193 = class_2338 = new class_2338((int)Math.floor(method_73192.field_1352), this.class2338.method_10264(), (int)Math.floor(method_73192.field_1350));
            if (stringarrArray != null) {
                if (class_2338.equals((Object)this.class2338)) {
                    method_73193 = this.class2338.method_10069((int)(-Math.round(method_73191.field_1352)), 0, (int)(-Math.round(method_73191.field_1350)));
                }
                method_73193.method_10074();
            }
            class_2338 class_2339 = class_2338;
            boolean b2;
            boolean checkClass_1792;
            final boolean b = checkClass_1792 = (b2 = CalcGSub_6.class310.field_1687.method_8320(class_2339).method_26212((class_1922)CalcGSub_6.class310.field_1687, class_2339));
            Label_0370: {
                if (stringarrArray != null) {
                    Label_0356: {
                        if (!b) {
                            boolean b3 = false;
                            final Iterator iterator = class_2350$class_2353.field_11062.iterator();
                            while (true) {
                                while (iterator.hasNext()) {
                                    final class_2338 method_73194 = this.class2338.method_10093((class_2350)iterator.next());
                                    final class_2338 method_73195 = method_73194.method_10074();
                                    final boolean b7;
                                    final boolean b6;
                                    final boolean b5;
                                    boolean method_73196;
                                    final boolean b4 = method_73196 = (b5 = (b6 = (b7 = (checkClass_1792 = (b2 = CalcGSub_6.class310.field_1687.method_8320(method_73195).method_26212((class_1922)CalcGSub_6.class310.field_1687, method_73195))))));
                                    if (stringarrArray != null) {
                                        Label_0341: {
                                            if (stringarrArray != null) {
                                                if (!b4) {
                                                    break Label_0341;
                                                }
                                                method_73196 = CalcGSub_6.class310.field_1687.method_8320(method_73194).method_26215();
                                            }
                                            boolean method_73197 = false;
                                            Label_0335: {
                                                if (stringarrArray != null) {
                                                    if (!method_73196) {
                                                        method_73197 = CalcGSub_6.class310.field_1687.method_8320(method_73194).method_45474();
                                                        if (stringarrArray == null) {
                                                            break Label_0335;
                                                        }
                                                        if (!method_73197) {
                                                            break Label_0341;
                                                        }
                                                    }
                                                    method_73193 = method_73194;
                                                    class_2339 = method_73195;
                                                }
                                            }
                                            b3 = method_73197;
                                            if (stringarrArray != null) {
                                                break;
                                            }
                                        }
                                        if (stringarrArray == null) {
                                            break;
                                        }
                                        continue;
                                    }
                                    else {
                                        if (stringarrArray == null) {
                                            break Label_0370;
                                        }
                                        if (!b6) {
                                            return false;
                                        }
                                        break Label_0356;
                                    }
                                }
                                boolean b6 = checkClass_1792 = (b2 = b3);
                                continue;
                            }
                        }
                    }
                    b2 = CalcGSub_6.class310.field_1687.method_8320(method_73193).method_26215();
                }
            }
            boolean b8 = false;
            Label_0406: {
                if (stringarrArray != null) {
                    if (!b) {
                        b8 = (b2 = CalcGSub_6.class310.field_1687.method_8320(method_73193).method_45474());
                        if (stringarrArray == null) {
                            break Label_0406;
                        }
                        if (!b8) {
                            return false;
                        }
                    }
                    b2 = (checkClass_1792 = Initializer_10.checkClass_1792(class_1802.field_8583));
                }
            }
            if (stringarrArray != null) {
                if (!b8) {
                    b2 = false;
                }
                else {
                    final class_3965 class_2340 = new class_3965(class_2339.method_46558().method_1031(0.0, 0.5, 0.0), class_2350.field_11036, class_2339, false);
                    final class_636 field_1726 = CalcGSub_6.class310.field_1761;
                    if (stringarrArray != null) {
                        if (field_1726 == null) {
                            goto Label_0512;
                        }
                        final class_636 field_1727 = CalcGSub_6.class310.field_1761;
                    }
                    final boolean method_73198 = field_1726.method_2896(CalcGSub_6.class310.field_1724, class_1268.field_5808, class_2340).method_23665();
                    if (stringarrArray != null && method_73198) {
                        CalcGSub_6.class310.field_1724.method_6104(class_1268.field_5808);
                        this.class2338_1 = method_73193;
                        return true;
                    }
                    return method_73198;
                }
            }
            return b2;
        }
        return false;
    }
    
    private boolean isEnabled_3() {
        return Initializer_10.checkPredicate_1(CalcGSub_6::lambda$selectBow$2);
    }
    
    private void execute_5() {
        if (this.class2338 == null || CalcGSub_6.class310.field_1724 == null) {
            return;
        }
        final class_243 method_1020 = this.class2338.method_46558().method_1031(0.0, 1.1, 0.0).method_1020(CalcGSub_6.class310.field_1724.method_33571());
        final double method_1021 = method_1020.method_37267();
        CalcGSub_6.class310.field_1724.method_36456((float)Math.toDegrees(Math.atan2(-method_1020.field_1352, method_1020.field_1350)));
        CalcGSub_6.class310.field_1724.method_36457((float)(-Math.toDegrees(Math.atan2(method_1020.field_1351, method_1021))));
    }
    
    private void execute_6() {
        if (CalcGSub_6.class310.field_1724 != null) {
            CalcGSub_6.class310.field_1690.field_1904.method_23481(true);
        }
    }
    
    private void execute_7() {
        if (CalcGSub_6.class310.field_1724 == null) {
            return;
        }
        CalcGSub_6.class310.field_1690.field_1904.method_23481(false);
        if (CalcGSub_6.class310.field_1761 != null) {
            CalcGSub_6.class310.field_1761.method_2897((class_1657)CalcGSub_6.class310.field_1724);
        }
    }
    
    private boolean checkClass_2338(final class_2338 class_2338) {
        return CalcGSub_6.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10167) || CalcGSub_6.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10425) || CalcGSub_6.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10025) || CalcGSub_6.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10546);
    }
    
    private static boolean lambda$selectBow$2(final class_1792 class_1792) {
        return class_1792 instanceof class_1753;
    }
    
    private static boolean lambda$placeRail$1(final class_1792 class_1792) {
        return class_1792 == class_1802.field_8129 || class_1792 == class_1802.field_8848 || class_1792 == class_1802.field_8211 || class_1792 == class_1802.field_8655;
    }
    
    private static void lambda$onDisable$0() {
        if (CalcGSub_6.class310.field_1690 != null) {
            CalcGSub_6.class310.field_1690.field_1904.method_23481(false);
        }
    }
    
    static {
        final String[] strArr2 = new String[5];
        int n = 0;
        String s;
        int n2 = (s = "\u0019\u0091? xz\u00d6\u00ed\u000e>\u00f4\u008f\u0005\u0086\u0007q<¥\n¦\u0016¨\u0014\u00dc\u0095\u00c4/¼½").length();
        int n3 = 12;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 91));
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
                        Label_0260: {
                            if (length > 1) {
                                break Label_0260;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 91;
                                    case 1 -> 59;
                                    case 2 -> 90;
                                    case 3 -> 35;
                                    case 4 -> 104;
                                    case 5 -> 15;
                                    default -> 40;
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
                                continue Label_0023;
                            }
                            n2 = (s = "¹e\u007f(¦PZ\u009dr\u0095i»\u00c5\u00d4\rH\u00f3\u00cf·\u00ad¨]³\u0010:J\u00ed©\u0000 \u001ex\u00e9 \t¡\u00c1\u0018\u0016\u00e8a?\u008d¢").length();
                            n3 = 34;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0023;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 2)));
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
        strArr_1 = new String[5];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFCAB3) & 0xFFFF;
        if (CalcGSub_6.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_6.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 145;
                case 1 -> 159;
                case 2 -> 76;
                case 3 -> 194;
                case 4 -> 170;
                case 5 -> 212;
                case 6 -> 165;
                case 7 -> 30;
                case 8 -> 119;
                case 9 -> 228;
                case 10 -> 32;
                case 11 -> 246;
                case 12 -> 69;
                case 13 -> 99;
                case 14 -> 236;
                case 15 -> 247;
                case 16 -> 33;
                case 17 -> 37;
                case 18 -> 21;
                case 19 -> 132;
                case 20 -> 27;
                case 21 -> 35;
                case 22 -> 204;
                case 23 -> 94;
                case 24 -> 56;
                case 25 -> 20;
                case 26 -> 131;
                case 27 -> 164;
                case 28 -> 163;
                case 29 -> 109;
                case 30 -> 129;
                case 31 -> 201;
                case 32 -> 92;
                case 33 -> 98;
                case 34 -> 166;
                case 35 -> 252;
                case 36 -> 45;
                case 37 -> 135;
                case 38 -> 199;
                case 39 -> 79;
                case 40 -> 133;
                case 41 -> 179;
                case 42 -> 28;
                case 43 -> 65;
                case 44 -> 200;
                case 45 -> 230;
                case 46 -> 50;
                case 47 -> 195;
                case 48 -> 253;
                case 49 -> 130;
                case 50 -> 152;
                case 51 -> 218;
                case 52 -> 248;
                case 53 -> 221;
                case 54 -> 187;
                case 55 -> 219;
                case 56 -> 174;
                case 57 -> 186;
                case 58 -> 87;
                case 59 -> 249;
                case 60 -> 101;
                case 61 -> 206;
                case 62 -> 70;
                case 63 -> 177;
                case 64 -> 88;
                case 65 -> 241;
                case 66 -> 251;
                case 67 -> 93;
                case 68 -> 193;
                case 69 -> 6;
                case 70 -> 91;
                case 71 -> 66;
                case 72 -> 46;
                case 73 -> 175;
                case 74 -> 214;
                case 75 -> 113;
                case 76 -> 43;
                case 77 -> 49;
                case 78 -> 7;
                case 79 -> 118;
                case 80 -> 36;
                case 81 -> 126;
                case 82 -> 97;
                case 83 -> 240;
                case 84 -> 233;
                case 85 -> 255;
                case 86 -> 134;
                case 87 -> 74;
                case 88 -> 180;
                case 89 -> 189;
                case 90 -> 231;
                case 91 -> 60;
                case 92 -> 176;
                case 93 -> 243;
                case 94 -> 29;
                case 95 -> 123;
                case 96 -> 61;
                case 97 -> 83;
                case 98 -> 77;
                case 99 -> 80;
                case 100 -> 14;
                case 101 -> 217;
                case 102 -> 162;
                case 103 -> 58;
                case 104 -> 1;
                case 105 -> 0;
                case 106 -> 100;
                case 107 -> 137;
                case 108 -> 16;
                case 109 -> 239;
                case 110 -> 47;
                case 111 -> 222;
                case 112 -> 5;
                case 113 -> 208;
                case 114 -> 108;
                case 115 -> 89;
                case 116 -> 86;
                case 117 -> 10;
                case 118 -> 68;
                case 119 -> 38;
                case 120 -> 238;
                case 121 -> 107;
                case 122 -> 22;
                case 123 -> 144;
                case 124 -> 244;
                case 125 -> 84;
                case 126 -> 19;
                case 127 -> 24;
                case 128 -> 8;
                case 129 -> 117;
                case 130 -> 15;
                case 131 -> 34;
                case 132 -> 213;
                case 133 -> 104;
                case 134 -> 254;
                case 135 -> 242;
                case 136 -> 142;
                case 137 -> 156;
                case 138 -> 171;
                case 139 -> 197;
                case 140 -> 112;
                case 141 -> 234;
                case 142 -> 52;
                case 143 -> 2;
                case 144 -> 183;
                case 145 -> 96;
                case 146 -> 141;
                case 147 -> 223;
                case 148 -> 105;
                case 149 -> 17;
                case 150 -> 122;
                case 151 -> 220;
                case 152 -> 146;
                case 153 -> 42;
                case 154 -> 157;
                case 155 -> 209;
                case 156 -> 25;
                case 157 -> 237;
                case 158 -> 232;
                case 159 -> 78;
                case 160 -> 138;
                case 161 -> 59;
                case 162 -> 147;
                case 163 -> 205;
                case 164 -> 121;
                case 165 -> 44;
                case 166 -> 41;
                case 167 -> 143;
                case 168 -> 161;
                case 169 -> 116;
                case 170 -> 216;
                case 171 -> 227;
                case 172 -> 191;
                case 173 -> 55;
                case 174 -> 13;
                case 175 -> 181;
                case 176 -> 11;
                case 177 -> 90;
                case 178 -> 51;
                case 179 -> 48;
                case 180 -> 72;
                case 181 -> 158;
                case 182 -> 53;
                case 183 -> 192;
                case 184 -> 26;
                case 185 -> 111;
                case 186 -> 102;
                case 187 -> 184;
                case 188 -> 75;
                case 189 -> 226;
                case 190 -> 245;
                case 191 -> 140;
                case 192 -> 185;
                case 193 -> 224;
                case 194 -> 120;
                case 195 -> 198;
                case 196 -> 54;
                case 197 -> 115;
                case 198 -> 225;
                case 199 -> 173;
                case 200 -> 40;
                case 201 -> 178;
                case 202 -> 136;
                case 203 -> 128;
                case 204 -> 63;
                case 205 -> 125;
                case 206 -> 229;
                case 207 -> 4;
                case 208 -> 211;
                case 209 -> 149;
                case 210 -> 139;
                case 211 -> 57;
                case 212 -> 85;
                case 213 -> 196;
                case 214 -> 210;
                case 215 -> 153;
                case 216 -> 155;
                case 217 -> 203;
                case 218 -> 9;
                case 219 -> 39;
                case 220 -> 250;
                case 221 -> 71;
                case 222 -> 160;
                case 223 -> 18;
                case 224 -> 12;
                case 225 -> 95;
                case 226 -> 82;
                case 227 -> 167;
                case 228 -> 148;
                case 229 -> 3;
                case 230 -> 110;
                case 231 -> 81;
                case 232 -> 202;
                case 233 -> 154;
                case 234 -> 124;
                case 235 -> 190;
                case 236 -> 150;
                case 237 -> 172;
                case 238 -> 207;
                case 239 -> 23;
                case 240 -> 62;
                case 241 -> 106;
                case 242 -> 103;
                case 243 -> 215;
                case 244 -> 182;
                case 245 -> 73;
                case 246 -> 169;
                case 247 -> 168;
                case 248 -> 31;
                case 249 -> 188;
                case 250 -> 151;
                case 251 -> 127;
                case 252 -> 235;
                case 253 -> 114;
                case 254 -> 64;
                default -> 67;
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
            CalcGSub_6.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_6.strArr_1[n3];
    }
}
