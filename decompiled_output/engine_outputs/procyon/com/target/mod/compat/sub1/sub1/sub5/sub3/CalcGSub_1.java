// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_1753;
import net.minecraft.class_1792;
import net.minecraft.class_2246;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_9334;
import net.minecraft.class_9278;
import net.minecraft.class_1764;
import net.minecraft.class_1269;
import net.minecraft.class_636;
import java.util.Iterator;
import net.minecraft.class_243;
import net.minecraft.class_746;
import net.minecraft.class_2350$class_2353;
import net.minecraft.class_1922;
import net.minecraft.class_2350;
import net.minecraft.class_1802;
import net.minecraft.class_1268;
import net.minecraft.class_3965;
import net.minecraft.class_239$class_240;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_15;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_7;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public final class CalcGSub_1 extends AbstractLoadF
{
    private final RenderASub_7 gridH;
    private final RenderASub bindK;
    private final RenderASub_1 buffC;
    private final RenderASub_15<Initializer_9> wrapJ;
    private final RenderASub bindK_1;
    private class_2338 class2338;
    private class_2338 class2338_1;
    private int intValue;
    private int intValue_1;
    private int intValue_2;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_1() {
        super(createString(-8259, -18136), createString(-8258, -15608), Initializer.CART);
        this.gridH = new RenderASub_7(createString(-8257, -9993), 1);
        this.bindK = new RenderASub(createString(-8262, 17215), 0.0, 0.0, 10.0, 1.0);
        this.buffC = new RenderASub_1(createString(-8261, -7606), false);
        this.wrapJ = new RenderASub_15<Initializer_9>(createString(-8263, -19524), Initializer_9.itemD, Initializer_9.class);
        this.bindK_1 = new RenderASub(createString(-8264, -18899), 8.0, 3.0, 20.0, 1.0);
        this.class2338 = null;
        this.class2338_1 = null;
        this.intValue = 0;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.setRenderaarr(this.gridH, this.bindK, this.buffC, this.wrapJ, this.bindK_1);
    }
    
    @Override
    public void execute() {
        this.execute_2();
        super.execute();
    }
    
    @Override
    public void execute_1() {
        CalcGSub_1.class310.execute(CalcGSub_1::lambda$onDisable$0);
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
        if (CalcGSub_1.class310.field_1724 == null || CalcGSub_1.class310.field_1687 == null || CalcGSub_1.class310.field_1755 != null) {
            return;
        }
        if ((this.gridH.getValue() == -1 || !com.target.mod.compat.sub1.sub2.sub7.Initializer_9.checkInt(this.gridH.getValue())) && this.intValue < 5) {
            this.execute_2();
            return;
        }
        if (this.intValue_1 > 0) {
            --this.intValue_1;
            return;
        }
        CalcGSub_1.class310.execute(this::execute_4);
    }
    
    private void execute_4() {
        if (CalcGSub_1.class310.field_1724 == null || CalcGSub_1.class310.field_1687 == null) {
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
                if (!this.buffC.getValue() || this.class2338 == null) {
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
                if (this.wrapJ.checkEnum(Initializer_9.CROSSBOW)) {
                    if (!Initializer_10.checkPredicate(CalcGSub_1::lambda$processState$1)) {
                        this.execute_2();
                        return;
                    }
                    this.execute_5();
                }
                if (!this.isEnabled_2()) {
                    this.execute_2();
                    break;
                }
                this.intValue = 5;
                this.intValue_2 = 0;
                this.execute_6();
                if (this.wrapJ.checkEnum(Initializer_9.CROSSBOW)) {
                    this.execute_9();
                    this.execute_2();
                    break;
                }
                this.execute_7();
                break;
            }
            case 5: {
                this.execute_6();
                ++this.intValue_2;
                if (this.intValue_2 >= this.bindK_1.getValue().intValue()) {
                    this.execute_8();
                    this.execute_2();
                    break;
                }
                break;
            }
        }
    }
    
    private boolean isEnabled() {
        if (CalcGSub_1.class310.field_1765 == null || CalcGSub_1.class310.field_1765.method_17783() != class_239$class_240.field_1332) {
            return false;
        }
        final class_3965 class_3965 = (class_3965)CalcGSub_1.class310.field_1765;
        final class_2338 method_10093 = class_3965.method_17777().method_10093(class_3965.method_17780());
        if (this.checkClass_2338(method_10093)) {
            this.class2338 = method_10093;
            return true;
        }
        if (!CalcGSub_1.class310.field_1687.method_8320(method_10093).method_45474()) {
            return false;
        }
        if (!Initializer_10.checkPredicate_1(CalcGSub_1::lambda$placeRail$2)) {
            return false;
        }
        if (CalcGSub_1.class310.field_1761 != null && CalcGSub_1.class310.field_1761.method_2896(CalcGSub_1.class310.field_1724, class_1268.field_5808, class_3965).method_23665()) {
            CalcGSub_1.class310.field_1724.method_6104(class_1268.field_5808);
            this.class2338 = method_10093;
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
        if (CalcGSub_1.class310.field_1761 != null && CalcGSub_1.class310.field_1761.method_2896(CalcGSub_1.class310.field_1724, class_1268.field_5808, class_3965).method_23665()) {
            CalcGSub_1.class310.field_1724.method_6104(class_1268.field_5808);
            return true;
        }
        return false;
    }
    
    private void execute_5() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        if (this.class2338 != null) {
            final class_746 field_1724 = CalcGSub_1.class310.field_1724;
            if (stringarrArray != null) {
                if (field_1724 == null) {
                    return;
                }
                final class_746 field_1725 = CalcGSub_1.class310.field_1724;
            }
            final class_243 method_1029 = field_1724.method_73189().method_1020(this.class2338.method_46558()).method_1029();
            class_2338 method_1030 = this.class2338.method_10069((int)Math.round(method_1029.field_1352), 0, (int)Math.round(method_1029.field_1350));
            class_2338 method_1031 = method_1030.method_10074();
            boolean b2;
            final boolean b = b2 = CalcGSub_1.class310.field_1687.method_8320(method_1031).method_26212((class_1922)CalcGSub_1.class310.field_1687, method_1031);
            Label_0266: {
                if (stringarrArray != null) {
                    if (!b) {
                        final Iterator iterator = class_2350$class_2353.field_11062.iterator();
                        while (iterator.hasNext()) {
                            final class_2338 method_1032 = this.class2338.method_10093((class_2350)iterator.next());
                            final class_2338 method_1033 = method_1032.method_10074();
                            final boolean b4;
                            boolean method_1034;
                            final boolean b3 = method_1034 = (b4 = (b2 = CalcGSub_1.class310.field_1687.method_8320(method_1033).method_26212((class_1922)CalcGSub_1.class310.field_1687, method_1033)));
                            if (stringarrArray == null) {
                                break Label_0266;
                            }
                            Label_0248: {
                                if (stringarrArray != null) {
                                    if (!b3) {
                                        break Label_0248;
                                    }
                                    final boolean method_1035;
                                    method_1034 = (method_1035 = CalcGSub_1.class310.field_1687.method_8320(method_1032).method_26215());
                                }
                                Label_0236: {
                                    if (stringarrArray != null) {
                                        if (b3) {
                                            break Label_0236;
                                        }
                                        method_1034 = CalcGSub_1.class310.field_1687.method_8320(method_1032).method_45474();
                                    }
                                    if (!method_1034) {
                                        break Label_0248;
                                    }
                                }
                                method_1030 = method_1032;
                                method_1031 = method_1033;
                                if (stringarrArray != null) {
                                    break;
                                }
                            }
                            if (stringarrArray == null) {
                                break;
                            }
                        }
                    }
                    CalcGSub_1.class310.field_1687.method_8320(method_1030).method_26215();
                }
            }
            boolean method_1036 = false;
            Label_0301: {
                if (stringarrArray != null) {
                    if (!b) {
                        method_1036 = CalcGSub_1.class310.field_1687.method_8320(method_1030).method_45474();
                        if (stringarrArray == null) {
                            break Label_0301;
                        }
                        if (!method_1036) {
                            return;
                        }
                    }
                    Initializer_10.checkClass_1792(class_1802.field_8884);
                }
            }
            if (!method_1036) {
                return;
            }
            final class_3965 class_3965 = new class_3965(method_1031.method_46558().method_1031(0.0, 0.5, 0.0), class_2350.field_11036, method_1031, false);
            final class_636 field_1726 = CalcGSub_1.class310.field_1761;
            if (stringarrArray != null) {
                if (field_1726 == null) {
                    return;
                }
                final class_636 field_1727 = CalcGSub_1.class310.field_1761;
            }
            final class_1269 method_1037 = field_1726.method_2896(CalcGSub_1.class310.field_1724, class_1268.field_5808, class_3965);
            if (stringarrArray != null) {
                if (!method_1037.method_23665()) {
                    return;
                }
                CalcGSub_1.class310.field_1724.method_6104(class_1268.field_5808);
            }
            this.class2338_1 = method_1030;
        }
    }
    
    private boolean isEnabled_2() {
        if (this.wrapJ.checkEnum(Initializer_9.CROSSBOW)) {
            return Initializer_10.checkPredicate_1(CalcGSub_1::lambda$selectWeapon$3);
        }
        return Initializer_10.checkPredicate_1(CalcGSub_1::lambda$selectWeapon$4);
    }
    
    private boolean isEnabled_3() {
        if (CalcGSub_1.class310.field_1724 == null) {
            return false;
        }
        final class_1799 method_6047 = CalcGSub_1.class310.field_1724.method_6047();
        if (!(method_6047.method_7909() instanceof class_1764)) {
            return false;
        }
        final class_9278 class_9278 = (class_9278)method_6047.method_58694(class_9334.field_49649);
        return class_9278 != null && !class_9278.method_57442();
    }
    
    private void execute_6() {
        if (this.class2338 == null || CalcGSub_1.class310.field_1724 == null) {
            return;
        }
        class_243 class_243;
        if (this.wrapJ.checkEnum(Initializer_9.CROSSBOW) && this.class2338_1 != null) {
            class_243 = this.class2338_1.method_46558().method_1031(0.0, 0.5, 0.0);
        }
        else {
            class_243 = this.class2338.method_46558().method_1031(0.0, 0.3, 0.0);
        }
        final class_243 method_1020 = class_243.method_1020(CalcGSub_1.class310.field_1724.method_33571());
        final double method_1021 = method_1020.method_37267();
        CalcGSub_1.class310.field_1724.method_36456((float)Math.toDegrees(Math.atan2(-method_1020.field_1352, method_1020.field_1350)));
        CalcGSub_1.class310.field_1724.method_36457((float)(-Math.toDegrees(Math.atan2(method_1020.field_1351, method_1021))));
    }
    
    private void execute_7() {
        if (CalcGSub_1.class310.field_1724 != null) {
            CalcGSub_1.class310.field_1690.field_1904.method_23481(true);
        }
    }
    
    private void execute_8() {
        if (CalcGSub_1.class310.field_1724 == null) {
            return;
        }
        CalcGSub_1.class310.field_1690.field_1904.method_23481(false);
        if (CalcGSub_1.class310.field_1761 != null) {
            CalcGSub_1.class310.field_1761.method_2897((class_1657)CalcGSub_1.class310.field_1724);
        }
    }
    
    private void execute_9() {
        if (CalcGSub_1.class310.field_1724 == null || CalcGSub_1.class310.field_1761 == null || !this.isEnabled_3()) {
            return;
        }
        CalcGSub_1.class310.field_1761.method_2919((class_1657)CalcGSub_1.class310.field_1724, class_1268.field_5808);
        CalcGSub_1.class310.field_1724.method_6104(class_1268.field_5808);
    }
    
    private boolean checkClass_2338(final class_2338 class_2338) {
        return CalcGSub_1.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10167) || CalcGSub_1.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10425) || CalcGSub_1.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10025) || CalcGSub_1.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10546);
    }
    
    private static boolean lambda$selectWeapon$4(final class_1792 class_1792) {
        return class_1792 instanceof class_1753;
    }
    
    private static boolean lambda$selectWeapon$3(final class_1792 class_1792) {
        return class_1792 instanceof class_1764;
    }
    
    private static boolean lambda$placeRail$2(final class_1792 class_1792) {
        return class_1792 == class_1802.field_8129 || class_1792 == class_1802.field_8848 || class_1792 == class_1802.field_8211 || class_1792 == class_1802.field_8655;
    }
    
    private static boolean lambda$processState$1(final class_1792 class_1792) {
        return class_1792 == class_1802.field_8884;
    }
    
    private static void lambda$onDisable$0() {
        if (CalcGSub_1.class310.field_1690 != null) {
            CalcGSub_1.class310.field_1690.field_1904.method_23481(false);
        }
    }
    
    static {
        final String[] strArr2 = new String[7];
        int n = 0;
        String s;
        int n2 = (s = "+\u00d7\u00d5\u008c\u0092\u0093}º\u00f4\f\u0005y|\"\u00e5.\u0006µ¾\u00c7¬(V\n\t½\u00f1\u00d7\u0016e\u00eb%\u0006P\fU4\u001a\"=²\b\u00e0\u008a3\u00d2\u00cf").length();
        int n3 = 10;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 96));
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
                        Label_0264: {
                            if (length > 1) {
                                break Label_0264;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 53;
                                    case 1 -> 21;
                                    case 2 -> 103;
                                    case 3 -> 12;
                                    case 4 -> 114;
                                    case 5 -> 62;
                                    default -> 65;
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
                            n2 = (s = "J\u0013°M£i\u0091³I\u00e1¥\u00c5\u0088\u00fe\u00c9b~¬\u00fc\bSX)\u00f0\t\u0081z\u00efVº·\u001e^\u00c4").length();
                            n3 = 24;
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
                    n5 = (n6 = (n7 = (n8 = 74)));
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
        strArr_1 = new String[7];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFDFBB) & 0xFFFF;
        if (CalcGSub_1.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_1.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 182;
                case 1 -> 212;
                case 2 -> 200;
                case 3 -> 121;
                case 4 -> 50;
                case 5 -> 202;
                case 6 -> 233;
                case 7 -> 223;
                case 8 -> 170;
                case 9 -> 112;
                case 10 -> 84;
                case 11 -> 51;
                case 12 -> 108;
                case 13 -> 89;
                case 14 -> 138;
                case 15 -> 6;
                case 16 -> 132;
                case 17 -> 242;
                case 18 -> 207;
                case 19 -> 38;
                case 20 -> 14;
                case 21 -> 143;
                case 22 -> 95;
                case 23 -> 40;
                case 24 -> 156;
                case 25 -> 34;
                case 26 -> 87;
                case 27 -> 57;
                case 28 -> 37;
                case 29 -> 205;
                case 30 -> 113;
                case 31 -> 3;
                case 32 -> 65;
                case 33 -> 196;
                case 34 -> 210;
                case 35 -> 214;
                case 36 -> 23;
                case 37 -> 107;
                case 38 -> 226;
                case 39 -> 194;
                case 40 -> 201;
                case 41 -> 111;
                case 42 -> 180;
                case 43 -> 128;
                case 44 -> 215;
                case 45 -> 235;
                case 46 -> 60;
                case 47 -> 211;
                case 48 -> 98;
                case 49 -> 118;
                case 50 -> 130;
                case 51 -> 135;
                case 52 -> 144;
                case 53 -> 163;
                case 54 -> 236;
                case 55 -> 71;
                case 56 -> 17;
                case 57 -> 81;
                case 58 -> 187;
                case 59 -> 245;
                case 60 -> 97;
                case 61 -> 53;
                case 62 -> 110;
                case 63 -> 157;
                case 64 -> 148;
                case 65 -> 189;
                case 66 -> 239;
                case 67 -> 90;
                case 68 -> 18;
                case 69 -> 78;
                case 70 -> 96;
                case 71 -> 232;
                case 72 -> 69;
                case 73 -> 179;
                case 74 -> 4;
                case 75 -> 63;
                case 76 -> 198;
                case 77 -> 137;
                case 78 -> 216;
                case 79 -> 27;
                case 80 -> 39;
                case 81 -> 88;
                case 82 -> 150;
                case 83 -> 186;
                case 84 -> 199;
                case 85 -> 74;
                case 86 -> 24;
                case 87 -> 129;
                case 88 -> 117;
                case 89 -> 123;
                case 90 -> 206;
                case 91 -> 61;
                case 92 -> 15;
                case 93 -> 146;
                case 94 -> 165;
                case 95 -> 2;
                case 96 -> 68;
                case 97 -> 25;
                case 98 -> 104;
                case 99 -> 86;
                case 100 -> 248;
                case 101 -> 30;
                case 102 -> 192;
                case 103 -> 26;
                case 104 -> 251;
                case 105 -> 246;
                case 106 -> 22;
                case 107 -> 168;
                case 108 -> 58;
                case 109 -> 16;
                case 110 -> 45;
                case 111 -> 52;
                case 112 -> 178;
                case 113 -> 114;
                case 114 -> 62;
                case 115 -> 188;
                case 116 -> 158;
                case 117 -> 174;
                case 118 -> 227;
                case 119 -> 100;
                case 120 -> 80;
                case 121 -> 31;
                case 122 -> 197;
                case 123 -> 153;
                case 124 -> 125;
                case 125 -> 43;
                case 126 -> 11;
                case 127 -> 241;
                case 128 -> 136;
                case 129 -> 94;
                case 130 -> 152;
                case 131 -> 134;
                case 132 -> 209;
                case 133 -> 254;
                case 134 -> 49;
                case 135 -> 19;
                case 136 -> 47;
                case 137 -> 120;
                case 138 -> 73;
                case 139 -> 33;
                case 140 -> 155;
                case 141 -> 93;
                case 142 -> 56;
                case 143 -> 145;
                case 144 -> 92;
                case 145 -> 48;
                case 146 -> 176;
                case 147 -> 238;
                case 148 -> 225;
                case 149 -> 28;
                case 150 -> 195;
                case 151 -> 124;
                case 152 -> 55;
                case 153 -> 171;
                case 154 -> 44;
                case 155 -> 66;
                case 156 -> 122;
                case 157 -> 166;
                case 158 -> 213;
                case 159 -> 159;
                case 160 -> 9;
                case 161 -> 13;
                case 162 -> 244;
                case 163 -> 32;
                case 164 -> 167;
                case 165 -> 46;
                case 166 -> 203;
                case 167 -> 208;
                case 168 -> 41;
                case 169 -> 234;
                case 170 -> 191;
                case 171 -> 247;
                case 172 -> 162;
                case 173 -> 133;
                case 174 -> 35;
                case 175 -> 42;
                case 176 -> 190;
                case 177 -> 85;
                case 178 -> 91;
                case 179 -> 255;
                case 180 -> 184;
                case 181 -> 131;
                case 182 -> 147;
                case 183 -> 183;
                case 184 -> 70;
                case 185 -> 204;
                case 186 -> 219;
                case 187 -> 173;
                case 188 -> 77;
                case 189 -> 102;
                case 190 -> 164;
                case 191 -> 106;
                case 192 -> 8;
                case 193 -> 222;
                case 194 -> 230;
                case 195 -> 228;
                case 196 -> 127;
                case 197 -> 154;
                case 198 -> 172;
                case 199 -> 83;
                case 200 -> 169;
                case 201 -> 119;
                case 202 -> 177;
                case 203 -> 29;
                case 204 -> 218;
                case 205 -> 229;
                case 206 -> 220;
                case 207 -> 115;
                case 208 -> 109;
                case 209 -> 231;
                case 210 -> 217;
                case 211 -> 20;
                case 212 -> 59;
                case 213 -> 161;
                case 214 -> 249;
                case 215 -> 64;
                case 216 -> 21;
                case 217 -> 1;
                case 218 -> 243;
                case 219 -> 151;
                case 220 -> 99;
                case 221 -> 142;
                case 222 -> 240;
                case 223 -> 175;
                case 224 -> 5;
                case 225 -> 10;
                case 226 -> 193;
                case 227 -> 82;
                case 228 -> 250;
                case 229 -> 116;
                case 230 -> 79;
                case 231 -> 7;
                case 232 -> 76;
                case 233 -> 0;
                case 234 -> 252;
                case 235 -> 126;
                case 236 -> 141;
                case 237 -> 140;
                case 238 -> 253;
                case 239 -> 221;
                case 240 -> 101;
                case 241 -> 72;
                case 242 -> 139;
                case 243 -> 185;
                case 244 -> 181;
                case 245 -> 103;
                case 246 -> 160;
                case 247 -> 75;
                case 248 -> 149;
                case 249 -> 67;
                case 250 -> 54;
                case 251 -> 237;
                case 252 -> 224;
                case 253 -> 36;
                case 254 -> 105;
                default -> 12;
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
            CalcGSub_1.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_1.strArr_1[n3];
    }
}
