// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_1753;
import net.minecraft.class_1792;
import net.minecraft.class_2246;
import net.minecraft.class_1799;
import net.minecraft.class_9334;
import net.minecraft.class_9278;
import net.minecraft.class_1764;
import java.util.Iterator;
import net.minecraft.class_2350$class_2353;
import net.minecraft.class_1802;
import net.minecraft.class_1268;
import net.minecraft.class_3965;
import net.minecraft.class_2350;
import net.minecraft.class_1922;
import net.minecraft.class_243;
import net.minecraft.class_638;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import net.minecraft.class_1297;
import net.minecraft.class_239;
import net.minecraft.class_1657;
import net.minecraft.class_3966;
import net.minecraft.class_239$class_240;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_15;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_7;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public final class CalcGSub_9 extends AbstractLoadF
{
    private final RenderASub_7 gridH;
    private final RenderASub bindK;
    private final RenderASub_1 buffC;
    private final RenderASub_15<Initializer_19> wrapJ;
    private final RenderASub bindK_1;
    private class_2338 class2338;
    private class_2338 class2338_1;
    private int intValue;
    private int intValue_1;
    private int intValue_2;
    private boolean boolFlag;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_9() {
        super(createString(17254, 4254), createString(17255, -10352), Initializer.CART);
        this.gridH = new RenderASub_7(createString(17248, 16087), 82);
        this.bindK = new RenderASub(createString(17253, 9471), 0.0, 0.0, 10.0, 1.0);
        this.buffC = new RenderASub_1(createString(17252, -6471), false);
        this.wrapJ = new RenderASub_15<Initializer_19>(createString(17251, 18296), Initializer_19.wrapK, Initializer_19.class);
        this.bindK_1 = new RenderASub(createString(17250, 26919), 8.0, 3.0, 20.0, 1.0);
        this.class2338 = null;
        this.class2338_1 = null;
        this.intValue = 0;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.boolFlag = false;
        this.setRenderaarr(this.gridH, this.bindK, this.buffC, this.wrapJ, this.bindK_1);
    }
    
    @Override
    public void execute() {
        this.execute_2();
        super.execute();
    }
    
    @Override
    public void execute_1() {
        CalcGSub_9.class310.execute(CalcGSub_9::lambda$onDisable$0);
        this.execute_2();
        super.execute_1();
    }
    
    private void execute_2() {
        this.class2338 = null;
        this.class2338_1 = null;
        this.intValue = 0;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
    }
    
    public void execute_3() {
        if (CalcGSub_9.class310.field_1724 == null || CalcGSub_9.class310.field_1687 == null || CalcGSub_9.class310.field_1755 != null) {
            return;
        }
        final boolean b = this.gridH.getValue() != -1 && Initializer_9.checkInt(this.gridH.getValue());
        if (b && !this.boolFlag && this.intValue == 0) {
            if (!this.isEnabled()) {
                this.boolFlag = b;
                return;
            }
            final class_239 field_1765 = CalcGSub_9.class310.field_1765;
            if (field_1765 != null && field_1765.method_17783() == class_239$class_240.field_1331) {
                final class_1297 method_17782 = ((class_3966)field_1765).method_17782();
                if (method_17782 instanceof final class_1657 class_1657) {
                    this.class2338 = this.computeClass_2338(class_1657);
                    if (this.class2338 != null && this.checkClass_2338(this.class2338)) {
                        this.intValue = 1;
                    }
                    else {
                        this.class2338 = null;
                    }
                }
            }
        }
        this.boolFlag = b;
        if (this.intValue == 0) {
            return;
        }
        if (this.intValue_1 > 0) {
            --this.intValue_1;
            return;
        }
        CalcGSub_9.class310.execute(this::execute_4);
    }
    
    private void execute_4() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        final class_310 class310 = CalcGSub_9.class310;
        if (stringarrArray != null) {
            if (class310.field_1724 == null) {
                return;
            }
            final class_310 class311 = CalcGSub_9.class310;
        }
        Object o;
        final class_638 class_638 = (class_638)(o = class310.field_1687);
        if (stringarrArray != null) {
            if (class_638 == null) {
                return;
            }
            o = ((AbstractSyncA<Object>)this.bindK).getValue();
        }
        final int intValue = ((Double)o).intValue();
        final int intValue2 = this.intValue;
        Label_0394: {
            Label_0286: {
                Label_0276: {
                    Label_0200: {
                        Label_0191: {
                            Label_0155: {
                                Label_0146: {
                                    CalcGSub_9 calcGSub_9 = null;
                                    Label_0139: {
                                        if (stringarrArray != null) {
                                            switch (intValue2) {
                                                case 1: {
                                                    calcGSub_9 = this;
                                                    if (stringarrArray != null) {
                                                        this.isEnabled_1();
                                                        break;
                                                    }
                                                    break Label_0139;
                                                }
                                                case 2: {
                                                    break Label_0146;
                                                }
                                                case 3: {
                                                    break Label_0155;
                                                }
                                                case 4: {
                                                    break Label_0191;
                                                }
                                                case 5: {
                                                    break Label_0200;
                                                }
                                                case 6: {
                                                    break Label_0276;
                                                }
                                                case 7: {
                                                    break Label_0286;
                                                }
                                                case 8: {
                                                    break Label_0394;
                                                }
                                            }
                                        }
                                        if (intValue2 != 0) {
                                            if (intValue > 0) {
                                                this.intValue = 2;
                                                this.intValue_1 = intValue;
                                                if (stringarrArray != null) {
                                                    return;
                                                }
                                            }
                                            this.intValue = 3;
                                            if (stringarrArray != null) {
                                                return;
                                            }
                                        }
                                        calcGSub_9 = this;
                                    }
                                    calcGSub_9.execute_2();
                                    if (stringarrArray != null) {
                                        return;
                                    }
                                }
                                this.intValue = 3;
                                if (stringarrArray != null) {
                                    return;
                                }
                            }
                            this.isEnabled_2();
                            if (stringarrArray != null) {
                                if (intValue > 0) {
                                    this.intValue = 4;
                                    this.intValue_1 = intValue;
                                    if (stringarrArray != null) {
                                        return;
                                    }
                                }
                                this.intValue = 5;
                            }
                            if (stringarrArray != null) {
                                return;
                            }
                        }
                        this.intValue = 5;
                        if (stringarrArray != null) {
                            return;
                        }
                    }
                    CalcGSub_9 calcGSub_10 = this;
                    if (stringarrArray != null) {
                        if (this.isEnabled_3()) {
                            CalcGSub_9 calcGSub_11 = this;
                            if (stringarrArray != null) {
                                if (this.buffC.getValue()) {
                                    if (intValue > 0) {
                                        this.intValue = 6;
                                        this.intValue_1 = intValue;
                                        if (stringarrArray != null) {
                                            return;
                                        }
                                    }
                                    this.intValue = 7;
                                    if (stringarrArray != null) {
                                        return;
                                    }
                                }
                                calcGSub_11 = this;
                            }
                            calcGSub_11.execute_2();
                            if (stringarrArray != null) {
                                return;
                            }
                        }
                        calcGSub_10 = this;
                    }
                    calcGSub_10.execute_2();
                    if (stringarrArray != null) {
                        return;
                    }
                }
                this.intValue = 7;
                if (stringarrArray != null) {
                    return;
                }
            }
            final boolean checkEnum = this.wrapJ.checkEnum(Initializer_19.CROSSBOW);
            CalcGSub_9 calcGSub_12 = null;
            Label_0387: {
                if (stringarrArray != null) {
                    if (checkEnum) {
                        if (!Initializer_10.checkPredicate(CalcGSub_9::lambda$processState$1)) {
                            this.execute_2();
                            return;
                        }
                        this.execute_5();
                    }
                    calcGSub_12 = this;
                    if (stringarrArray == null) {
                        break Label_0387;
                    }
                    this.isEnabled_4();
                }
                if (checkEnum) {
                    this.intValue = 8;
                    this.intValue_2 = 0;
                    this.execute_6();
                    CalcGSub_9 calcGSub_13 = this;
                    if (stringarrArray != null) {
                        if (this.wrapJ.checkEnum(Initializer_19.CROSSBOW)) {
                            this.execute_9();
                            this.execute_2();
                            if (stringarrArray != null) {
                                return;
                            }
                        }
                        calcGSub_13 = this;
                    }
                    calcGSub_13.execute_7();
                    if (stringarrArray != null) {
                        return;
                    }
                }
                calcGSub_12 = this;
            }
            calcGSub_12.execute_2();
            if (stringarrArray != null) {
                return;
            }
        }
        this.execute_6();
        ++this.intValue_2;
        CalcGSub_9 calcGSub_14 = this;
        if (stringarrArray != null) {
            if (this.intValue_2 < this.bindK_1.getValue().intValue()) {
                return;
            }
            this.execute_8();
            calcGSub_14 = this;
        }
        calcGSub_14.execute_2();
    }
    
    private boolean isEnabled() {
        final boolean checkPredicate = Initializer_10.checkPredicate(CalcGSub_9::lambda$hasRequiredItems$2);
        final boolean checkPredicate2 = Initializer_10.checkPredicate(CalcGSub_9::lambda$hasRequiredItems$3);
        final boolean checkPredicate3 = Initializer_10.checkPredicate(CalcGSub_9::lambda$hasRequiredItems$4);
        return checkPredicate && checkPredicate2 && checkPredicate3;
    }
    
    private class_2338 computeClass_2338(final class_1657 class_1657) {
        final class_243 method_73189 = class_1657.method_73189();
        final class_243 method_73190 = class_1657.method_18798();
        if (class_1657.method_24828() && method_73190.method_37267() < 0.1) {
            return new class_2338((int)Math.floor(method_73189.field_1352), (int)Math.floor(method_73189.field_1351), (int)Math.floor(method_73189.field_1350));
        }
        double field_1352 = method_73189.field_1352;
        double field_1353 = method_73189.field_1351;
        double field_1354 = method_73189.field_1350;
        double field_1355 = method_73190.field_1352;
        double field_1356 = method_73190.field_1351;
        double field_1357 = method_73190.field_1350;
        for (int i = 0; i < 20; ++i) {
            field_1356 = (field_1356 - 0.08) * 0.98;
            field_1355 *= 0.91;
            field_1357 *= 0.91;
            field_1352 += field_1355;
            field_1353 += field_1356;
            field_1354 += field_1357;
            if (!CalcGSub_9.class310.field_1687.method_8320(new class_2338((int)Math.floor(field_1352), (int)Math.floor(field_1353) - 1, (int)Math.floor(field_1354))).method_26215()) {
                return new class_2338((int)Math.floor(field_1352), (int)Math.floor(field_1353), (int)Math.floor(field_1354));
            }
        }
        return new class_2338((int)Math.floor(method_73189.field_1352), (int)Math.floor(method_73189.field_1351), (int)Math.floor(method_73189.field_1350));
    }
    
    private boolean checkClass_2338(final class_2338 class_2338) {
        final class_2338 method_10074 = class_2338.method_10074();
        return CalcGSub_9.class310.field_1687.method_8320(method_10074).method_26212((class_1922)CalcGSub_9.class310.field_1687, method_10074) && (CalcGSub_9.class310.field_1687.method_8320(class_2338).method_45474() || CalcGSub_9.class310.field_1687.method_8320(class_2338).method_26215()) && CalcGSub_9.class310.field_1724.method_73189().method_1028(class_2338.method_10263() + 0.5, class_2338.method_10264() + 0.5, class_2338.method_10260() + 0.5) < 25.0;
    }
    
    private boolean isEnabled_1() {
        if (this.class2338 == null) {
            return false;
        }
        if (!Initializer_10.checkPredicate_1(CalcGSub_9::lambda$placeRail$5)) {
            return false;
        }
        final class_2338 method_10074 = this.class2338.method_10074();
        final class_3965 class_3965 = new class_3965(method_10074.method_46558().method_1031(0.0, 0.5, 0.0), class_2350.field_11036, method_10074, false);
        if (CalcGSub_9.class310.field_1761 != null && CalcGSub_9.class310.field_1761.method_2896(CalcGSub_9.class310.field_1724, class_1268.field_5808, class_3965).method_23665()) {
            CalcGSub_9.class310.field_1724.method_6104(class_1268.field_5808);
            return true;
        }
        return false;
    }
    
    private boolean isEnabled_2() {
        if (this.class2338 == null) {
            return false;
        }
        final class_2338 method_10084 = this.class2338.method_10084();
        if (!CalcGSub_9.class310.field_1687.method_8320(method_10084).method_45474() && !CalcGSub_9.class310.field_1687.method_8320(method_10084).method_26215()) {
            return false;
        }
        if (!Initializer_10.checkClass_1792(class_1802.field_8786)) {
            return false;
        }
        final class_3965 class_3965 = new class_3965(this.class2338.method_46558().method_1031(0.0, 0.5, 0.0), class_2350.field_11036, this.class2338, false);
        if (CalcGSub_9.class310.field_1761 != null && CalcGSub_9.class310.field_1761.method_2896(CalcGSub_9.class310.field_1724, class_1268.field_5808, class_3965).method_23665()) {
            CalcGSub_9.class310.field_1724.method_6104(class_1268.field_5808);
            return true;
        }
        return false;
    }
    
    private boolean isEnabled_3() {
        if (this.class2338 == null || !this.checkClass_2338_1(this.class2338)) {
            return false;
        }
        if (!Initializer_10.checkClass_1792(class_1802.field_8069)) {
            return false;
        }
        final class_3965 class_3965 = new class_3965(this.class2338.method_46558(), class_2350.field_11036, this.class2338, false);
        if (CalcGSub_9.class310.field_1761 != null && CalcGSub_9.class310.field_1761.method_2896(CalcGSub_9.class310.field_1724, class_1268.field_5808, class_3965).method_23665()) {
            CalcGSub_9.class310.field_1724.method_6104(class_1268.field_5808);
            return true;
        }
        return false;
    }
    
    private void execute_5() {
        if (this.class2338 == null || CalcGSub_9.class310.field_1724 == null) {
            return;
        }
        final class_243 method_1029 = CalcGSub_9.class310.field_1724.method_73189().method_1020(this.class2338.method_46558()).method_1029();
        class_2338 method_1030 = this.class2338.method_10069((int)Math.round(method_1029.field_1352), 0, (int)Math.round(method_1029.field_1350));
        class_2338 method_1031 = method_1030.method_10074();
        if (!CalcGSub_9.class310.field_1687.method_8320(method_1031).method_26212((class_1922)CalcGSub_9.class310.field_1687, method_1031)) {
            final Iterator iterator = class_2350$class_2353.field_11062.iterator();
            while (iterator.hasNext()) {
                final class_2338 method_1032 = this.class2338.method_10093((class_2350)iterator.next());
                final class_2338 method_1033 = method_1032.method_10074();
                if (CalcGSub_9.class310.field_1687.method_8320(method_1033).method_26212((class_1922)CalcGSub_9.class310.field_1687, method_1033) && (CalcGSub_9.class310.field_1687.method_8320(method_1032).method_26215() || CalcGSub_9.class310.field_1687.method_8320(method_1032).method_45474())) {
                    method_1030 = method_1032;
                    method_1031 = method_1033;
                    break;
                }
            }
        }
        if (!CalcGSub_9.class310.field_1687.method_8320(method_1030).method_26215() && !CalcGSub_9.class310.field_1687.method_8320(method_1030).method_45474()) {
            return;
        }
        if (!Initializer_10.checkClass_1792(class_1802.field_8884)) {
            return;
        }
        final class_3965 class_3965 = new class_3965(method_1031.method_46558().method_1031(0.0, 0.5, 0.0), class_2350.field_11036, method_1031, false);
        if (CalcGSub_9.class310.field_1761 != null && CalcGSub_9.class310.field_1761.method_2896(CalcGSub_9.class310.field_1724, class_1268.field_5808, class_3965).method_23665()) {
            CalcGSub_9.class310.field_1724.method_6104(class_1268.field_5808);
            this.class2338_1 = method_1030;
        }
    }
    
    private boolean isEnabled_4() {
        if (this.wrapJ.checkEnum(Initializer_19.CROSSBOW)) {
            return Initializer_10.checkPredicate_1(CalcGSub_9::lambda$selectWeapon$6);
        }
        return Initializer_10.checkPredicate_1(CalcGSub_9::lambda$selectWeapon$7);
    }
    
    private boolean isEnabled_5() {
        if (CalcGSub_9.class310.field_1724 == null) {
            return false;
        }
        final class_1799 method_6047 = CalcGSub_9.class310.field_1724.method_6047();
        if (!(method_6047.method_7909() instanceof class_1764)) {
            return false;
        }
        final class_9278 class_9278 = (class_9278)method_6047.method_58694(class_9334.field_49649);
        return class_9278 != null && !class_9278.method_57442();
    }
    
    private void execute_6() {
        if (this.class2338 == null || CalcGSub_9.class310.field_1724 == null) {
            return;
        }
        final class_243 method_1020 = ((this.wrapJ.checkEnum(Initializer_19.CROSSBOW) && this.class2338_1 != null) ? this.class2338_1.method_46558().method_1031(0.0, 0.5, 0.0) : this.class2338.method_46558().method_1031(0.0, 0.3, 0.0)).method_1020(CalcGSub_9.class310.field_1724.method_33571());
        final double method_1021 = method_1020.method_37267();
        CalcGSub_9.class310.field_1724.method_36456((float)Math.toDegrees(Math.atan2(-method_1020.field_1352, method_1020.field_1350)));
        CalcGSub_9.class310.field_1724.method_36457((float)(-Math.toDegrees(Math.atan2(method_1020.field_1351, method_1021))));
    }
    
    private void execute_7() {
        if (CalcGSub_9.class310.field_1724 != null) {
            CalcGSub_9.class310.field_1690.field_1904.method_23481(true);
        }
    }
    
    private void execute_8() {
        if (CalcGSub_9.class310.field_1724 == null) {
            return;
        }
        CalcGSub_9.class310.field_1690.field_1904.method_23481(false);
        if (CalcGSub_9.class310.field_1761 != null) {
            CalcGSub_9.class310.field_1761.method_2897((class_1657)CalcGSub_9.class310.field_1724);
        }
    }
    
    private void execute_9() {
        if (CalcGSub_9.class310.field_1724 == null || CalcGSub_9.class310.field_1761 == null || !this.isEnabled_5()) {
            return;
        }
        CalcGSub_9.class310.field_1761.method_2919((class_1657)CalcGSub_9.class310.field_1724, class_1268.field_5808);
        CalcGSub_9.class310.field_1724.method_6104(class_1268.field_5808);
    }
    
    private boolean checkClass_2338_1(final class_2338 class_2338) {
        return CalcGSub_9.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10167) || CalcGSub_9.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10425) || CalcGSub_9.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10025) || CalcGSub_9.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10546);
    }
    
    private static boolean lambda$selectWeapon$7(final class_1792 class_1792) {
        return class_1792 instanceof class_1753;
    }
    
    private static boolean lambda$selectWeapon$6(final class_1792 class_1792) {
        return class_1792 instanceof class_1764;
    }
    
    private static boolean lambda$placeRail$5(final class_1792 class_1792) {
        return class_1792 == class_1802.field_8129 || class_1792 == class_1802.field_8848 || class_1792 == class_1802.field_8211 || class_1792 == class_1802.field_8655;
    }
    
    private static boolean lambda$hasRequiredItems$4(final class_1792 class_1792) {
        return class_1792 == class_1802.field_8069;
    }
    
    private static boolean lambda$hasRequiredItems$3(final class_1792 class_1792) {
        return class_1792 == class_1802.field_8786;
    }
    
    private static boolean lambda$hasRequiredItems$2(final class_1792 class_1792) {
        return class_1792 == class_1802.field_8129 || class_1792 == class_1802.field_8848 || class_1792 == class_1802.field_8211 || class_1792 == class_1802.field_8655;
    }
    
    private static boolean lambda$processState$1(final class_1792 class_1792) {
        return class_1792 == class_1802.field_8884;
    }
    
    private static void lambda$onDisable$0() {
        if (CalcGSub_9.class310.field_1690 != null) {
            CalcGSub_9.class310.field_1690.field_1904.method_23481(false);
        }
    }
    
    static {
        final String[] strArr2 = new String[7];
        int n = 0;
        String s;
        int n2 = (s = """
                      \f\u0014\u00e1v2\u00f6ª\u00ca\u0012\u0017\u001f4e\u0007\u0080(\u00c7\u00e6\u00ec}x\u0099#\u0095¥\u00f4`\u007f\u00c4\u007fg9\u00de
                      \u00d4s¾\u0017\u001f¥\u0015I£\u00e6\u0005b\u00fa\u00d5:0
                      \u008f¤µ\u00fb~¥?\b\u00c6a""").length();
        int n3 = 9;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 38));
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
                                    case 0 -> 110;
                                    case 1 -> 42;
                                    case 2 -> 22;
                                    case 3 -> 106;
                                    case 4 -> 50;
                                    case 5 -> 57;
                                    default -> 30;
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
                            n2 = (s = "\u009e\u00db\u00ee\u00d75¤\f\u009cAo[«\u0000\u00db[r\b\u001a\u0090").length();
                            n3 = 6;
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
                    n5 = (n6 = (n7 = (n8 = 25)));
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
        final int n3 = (n ^ 0x4366) & 0xFFFF;
        if (CalcGSub_9.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_9.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 194;
                case 1 -> 254;
                case 2 -> 230;
                case 3 -> 103;
                case 4 -> 234;
                case 5 -> 168;
                case 6 -> 184;
                case 7 -> 189;
                case 8 -> 157;
                case 9 -> 253;
                case 10 -> 80;
                case 11 -> 206;
                case 12 -> 88;
                case 13 -> 15;
                case 14 -> 235;
                case 15 -> 76;
                case 16 -> 179;
                case 17 -> 47;
                case 18 -> 39;
                case 19 -> 147;
                case 20 -> 105;
                case 21 -> 125;
                case 22 -> 43;
                case 23 -> 10;
                case 24 -> 237;
                case 25 -> 175;
                case 26 -> 29;
                case 27 -> 28;
                case 28 -> 122;
                case 29 -> 99;
                case 30 -> 23;
                case 31 -> 94;
                case 32 -> 82;
                case 33 -> 199;
                case 34 -> 208;
                case 35 -> 250;
                case 36 -> 81;
                case 37 -> 187;
                case 38 -> 217;
                case 39 -> 240;
                case 40 -> 161;
                case 41 -> 188;
                case 42 -> 145;
                case 43 -> 96;
                case 44 -> 55;
                case 45 -> 150;
                case 46 -> 126;
                case 47 -> 78;
                case 48 -> 115;
                case 49 -> 27;
                case 50 -> 1;
                case 51 -> 5;
                case 52 -> 209;
                case 53 -> 19;
                case 54 -> 177;
                case 55 -> 12;
                case 56 -> 218;
                case 57 -> 49;
                case 58 -> 214;
                case 59 -> 204;
                case 60 -> 0;
                case 61 -> 156;
                case 62 -> 249;
                case 63 -> 158;
                case 64 -> 172;
                case 65 -> 17;
                case 66 -> 223;
                case 67 -> 30;
                case 68 -> 151;
                case 69 -> 137;
                case 70 -> 86;
                case 71 -> 107;
                case 72 -> 127;
                case 73 -> 101;
                case 74 -> 53;
                case 75 -> 72;
                case 76 -> 225;
                case 77 -> 121;
                case 78 -> 26;
                case 79 -> 140;
                case 80 -> 69;
                case 81 -> 170;
                case 82 -> 110;
                case 83 -> 201;
                case 84 -> 153;
                case 85 -> 164;
                case 86 -> 44;
                case 87 -> 141;
                case 88 -> 152;
                case 89 -> 114;
                case 90 -> 8;
                case 91 -> 104;
                case 92 -> 51;
                case 93 -> 120;
                case 94 -> 14;
                case 95 -> 41;
                case 96 -> 2;
                case 97 -> 183;
                case 98 -> 71;
                case 99 -> 215;
                case 100 -> 3;
                case 101 -> 205;
                case 102 -> 213;
                case 103 -> 198;
                case 104 -> 211;
                case 105 -> 236;
                case 106 -> 37;
                case 107 -> 185;
                case 108 -> 154;
                case 109 -> 77;
                case 110 -> 89;
                case 111 -> 226;
                case 112 -> 59;
                case 113 -> 68;
                case 114 -> 56;
                case 115 -> 83;
                case 116 -> 70;
                case 117 -> 228;
                case 118 -> 222;
                case 119 -> 130;
                case 120 -> 54;
                case 121 -> 227;
                case 122 -> 231;
                case 123 -> 241;
                case 124 -> 132;
                case 125 -> 200;
                case 126 -> 181;
                case 127 -> 119;
                case 128 -> 6;
                case 129 -> 163;
                case 130 -> 61;
                case 131 -> 25;
                case 132 -> 65;
                case 133 -> 255;
                case 134 -> 174;
                case 135 -> 57;
                case 136 -> 138;
                case 137 -> 100;
                case 138 -> 173;
                case 139 -> 212;
                case 140 -> 251;
                case 141 -> 4;
                case 142 -> 244;
                case 143 -> 50;
                case 144 -> 84;
                case 145 -> 9;
                case 146 -> 85;
                case 147 -> 146;
                case 148 -> 155;
                case 149 -> 46;
                case 150 -> 196;
                case 151 -> 48;
                case 152 -> 232;
                case 153 -> 233;
                case 154 -> 193;
                case 155 -> 40;
                case 156 -> 220;
                case 157 -> 229;
                case 158 -> 207;
                case 159 -> 64;
                case 160 -> 178;
                case 161 -> 35;
                case 162 -> 136;
                case 163 -> 98;
                case 164 -> 58;
                case 165 -> 67;
                case 166 -> 22;
                case 167 -> 203;
                case 168 -> 191;
                case 169 -> 79;
                case 170 -> 134;
                case 171 -> 95;
                case 172 -> 97;
                case 173 -> 160;
                case 174 -> 221;
                case 175 -> 128;
                case 176 -> 66;
                case 177 -> 131;
                case 178 -> 13;
                case 179 -> 108;
                case 180 -> 182;
                case 181 -> 192;
                case 182 -> 133;
                case 183 -> 102;
                case 184 -> 190;
                case 185 -> 245;
                case 186 -> 242;
                case 187 -> 16;
                case 188 -> 202;
                case 189 -> 90;
                case 190 -> 247;
                case 191 -> 169;
                case 192 -> 129;
                case 193 -> 75;
                case 194 -> 123;
                case 195 -> 149;
                case 196 -> 246;
                case 197 -> 93;
                case 198 -> 167;
                case 199 -> 162;
                case 200 -> 38;
                case 201 -> 210;
                case 202 -> 34;
                case 203 -> 42;
                case 204 -> 219;
                case 205 -> 238;
                case 206 -> 62;
                case 207 -> 166;
                case 208 -> 52;
                case 209 -> 135;
                case 210 -> 24;
                case 211 -> 20;
                case 212 -> 113;
                case 213 -> 18;
                case 214 -> 74;
                case 215 -> 148;
                case 216 -> 33;
                case 217 -> 139;
                case 218 -> 118;
                case 219 -> 91;
                case 220 -> 248;
                case 221 -> 117;
                case 222 -> 7;
                case 223 -> 142;
                case 224 -> 87;
                case 225 -> 239;
                case 226 -> 36;
                case 227 -> 197;
                case 228 -> 63;
                case 229 -> 73;
                case 230 -> 32;
                case 231 -> 224;
                case 232 -> 176;
                case 233 -> 186;
                case 234 -> 109;
                case 235 -> 45;
                case 236 -> 252;
                case 237 -> 111;
                case 238 -> 11;
                case 239 -> 195;
                case 240 -> 124;
                case 241 -> 165;
                case 242 -> 171;
                case 243 -> 159;
                case 244 -> 216;
                case 245 -> 243;
                case 246 -> 31;
                case 247 -> 106;
                case 248 -> 144;
                case 249 -> 180;
                case 250 -> 116;
                case 251 -> 112;
                case 252 -> 92;
                case 253 -> 143;
                case 254 -> 21;
                default -> 60;
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
            CalcGSub_9.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_9.strArr_1[n3];
    }
}
