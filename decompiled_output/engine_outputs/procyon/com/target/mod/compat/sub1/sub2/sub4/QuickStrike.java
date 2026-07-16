// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_6880;
import java.util.function.Predicate;
import net.minecraft.class_1799;
import net.minecraft.class_6025;
import net.minecraft.class_1296;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_6;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1309;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class QuickStrike extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_1 buildC_2;
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private long longValue;
    private int intValue;
    private double doubleValue;
    private boolean boolFlag;
    private boolean boolFlag_1;
    private int intValue_1;
    private boolean boolFlag_2;
    private class_1297 class1297;
    private boolean boolFlag_3;
    private class_1297 class1297_1;
    
    public QuickStrike() {
        super("quick_strike", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 156, 211, 250, 211, 178, 213, 240, 145, 52, 17 }), "Automatically attacks while falling with mace.", Initializer.cacheE_1);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 74, 33, 100, 106, 207, 21, 185, 182, 244, 155, 176, 211, 250, 222, 178, 213, 255, 94, 102, 40, 59, 69, 8, 73, 36, 107, 114, 3, 74, 150, 226, 165, 162, 193, 132, 202, 160, 231, 230, 159, 198, 3 }), 1.0, 10.0, 3.0, 0.5);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 87, 33, 100, 112, 0, 71, 132, 255, 166, 165, 222, 129, 204, 114, 178, 212, 215, 145, 52, 17, 112, 23, 57, 47, 118, 87, 14, 81, 110 }), 0.0, 500.0, 100.0, 10.0);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 70, 33, 100, 106, 0, 71, 150, 255, 166, 175, 222, 129, 211, 189, 224, 241, 83, 145, 53, 32, 112, 23, 61, 47, 118, 68, 14, 81, 114, 237, 176, 139, 204, 147, 177, 171, 242, 213, 138, 205, 247, 105, 44, 24 }), 1.0, 20.0, 7.0, 0.5);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 53, 99, 43, 44, 66, 5, 66, 33, 100, 118, 0, 71, 130, 255, 166, 163, 222, 129, 211, 114, 178, 212, 195, 145, 52, 24, 112, 23, 52, 47, 118, 79, 14, 81, 114, 237, 176, 138, 204, 147, 170 }), true);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 53, 99, 43, 44, 66, 5, 66, 33, 100, 118, 0, 71, 130, 255, 166, 163, 222, 129, 211, 114, 178, 212, 222, 145, 52, 27, 112, 23, 55, 47, 118, 69 }), false);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 87, 33, 100, 113, 0, 71, 139, 48, 244, 154, 130, 211, 250, 222, 178, 213, 242, 145, 52, 25 }), false);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 130, 211, 250, 197, 178, 213, 250, 145, 52, 0, 112, 23, 54, 47, 118, 94 }), true);
        this.longValue = 0L;
        this.intValue = -1;
        this.doubleValue = -1.0;
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.intValue_1 = 0;
        this.boolFlag_2 = false;
        this.class1297 = null;
        this.boolFlag_3 = false;
        this.class1297_1 = null;
        this.setSyncaarr(this.buildC, this.buildC_1, this.buildC_2, this.parseB, this.parseB_1, this.parseB_2, this.parseB_3);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.execute_7();
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        if (this.intValue != -1) {
            this.setInt(this.intValue);
        }
        this.execute_7();
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (QuickStrike.class310.field_1724 == null || QuickStrike.class310.field_1687 == null) {
            return;
        }
        if (QuickStrike.class310.field_1755 != null) {
            return;
        }
        if (this.boolFlag_3 && this.class1297_1 != null) {
            final class_1297 class1297_1 = this.class1297_1;
            if (class1297_1 instanceof class_1309 && ((class_1309)class1297_1).method_5805() && QuickStrike.class310.field_1724.method_5858(this.class1297_1) < 20.25) {
                QuickStrike.class310.field_1761.method_2918((class_1657)QuickStrike.class310.field_1724, this.class1297_1);
                QuickStrike.class310.field_1724.method_6104(class_1268.field_5808);
            }
            this.boolFlag_3 = false;
            this.execute_5();
            this.boolFlag_1 = true;
            this.intValue_1 = 0;
            this.boolFlag_2 = true;
            return;
        }
        if (this.boolFlag_2 && this.class1297 != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            if (this.isEnabled() && currentTimeMillis - this.longValue >= this.buildC_1.getInt()) {
                final class_1297 class1297 = this.class1297;
                if (class1297 instanceof class_1309 && ((class_1309)class1297).method_5805() && QuickStrike.class310.field_1724.method_5858(this.class1297) < 20.25) {
                    QuickStrike.class310.field_1761.method_2918((class_1657)QuickStrike.class310.field_1724, this.class1297);
                    QuickStrike.class310.field_1724.method_6104(class_1268.field_5808);
                    this.longValue = currentTimeMillis;
                }
            }
            this.boolFlag_2 = false;
            this.class1297 = null;
            return;
        }
        this.execute_3();
        this.execute_4();
    }
    
    private void execute_3() {
        final boolean method_24828 = QuickStrike.class310.field_1724.method_24828();
        final boolean b = QuickStrike.class310.field_1724.method_18798().field_1351 < -0.1;
        final double method_24829 = QuickStrike.class310.field_1724.method_23318();
        if (method_24828) {
            if (this.boolFlag) {
                this.execute_6();
            }
            if (this.intValue != -1) {
                this.setInt(this.intValue);
                this.intValue = -1;
            }
            return;
        }
        if (!this.boolFlag) {
            this.boolFlag = true;
            this.doubleValue = method_24829;
            this.boolFlag_1 = false;
            this.intValue_1 = 0;
        }
        else if (b && this.doubleValue != -1.0 && method_24829 > this.doubleValue) {
            this.doubleValue = method_24829;
        }
    }
    
    private void execute_4() {
        if (!this.boolFlag || QuickStrike.class310.field_1724.method_18798().field_1351 >= -0.1) {
            return;
        }
        final double field_6017 = QuickStrike.class310.field_1724.field_6017;
        if (field_6017 < this.buildC.getFloat()) {
            return;
        }
        Object o = Initializer_6.createClass_1657((class_1297)QuickStrike.class310.field_1724, 4.0f, true, false);
        if (o == null) {
            o = QuickStrike.class310.field_1692;
        }
        if (!this.checkClass_1297((class_1297)o)) {
            return;
        }
        if (this.parseB_2.getBoolean()) {
            this.setClass_1297AndDouble((class_1297)o, field_6017);
        }
        if (!this.parseB_2.getBoolean() || this.boolFlag_1 || this.intValue_1 == 0) {
            this.setClass_1297AndDouble_1((class_1297)o, field_6017);
        }
    }
    
    private void setClass_1297AndDouble(final class_1297 class_1297, final double n) {
        boolean b = false;
        Label_0037: {
            if (class_1297 instanceof final class_1657 class_1298) {
                if (class_1298.method_24518(class_1802.field_8255) && class_1298.method_6039()) {
                    b = true;
                    break Label_0037;
                }
            }
            b = false;
        }
        if (b && n > this.buildC.getFloat() && !this.boolFlag_1 && this.intValue_1 == 0) {
            if (this.intValue == -1) {
                this.intValue = Initializer_8.method_int(QuickStrike.class310.field_1724.method_31548());
            }
            final int int1 = this.getInt();
            if (int1 != -1) {
                Initializer_8.setClass_1661AndInt(QuickStrike.class310.field_1724.method_31548(), int1);
                this.boolFlag_3 = true;
                this.class1297_1 = class_1297;
                this.class1297 = class_1297;
                this.intValue_1 = 1;
            }
        }
    }
    
    private void setClass_1297AndDouble_1(final class_1297 class1297, final double n) {
        if (!this.isEnabled()) {
            if (this.intValue == -1) {
                this.intValue = Initializer_8.method_int(QuickStrike.class310.field_1724.method_31548());
            }
            if (this.parseB_3.getBoolean()) {
                this.setDouble(n);
            }
            else {
                this.execute_5();
            }
        }
        else if (this.parseB_3.getBoolean()) {
            this.setDouble(n);
        }
        if (this.isEnabled()) {
            this.boolFlag_2 = true;
            this.class1297 = class1297;
        }
    }
    
    private boolean checkClass_1297(final class_1297 class_1297) {
        if (class_1297 == null || class_1297 == QuickStrike.class310.field_1724) {
            return false;
        }
        if (!(class_1297 instanceof class_1309)) {
            return false;
        }
        final class_1309 class_1298 = (class_1309)class_1297;
        if (!class_1298.method_5805() || class_1298.method_29504()) {
            return false;
        }
        if (class_1297 instanceof class_1657) {
            return this.parseB.getBoolean();
        }
        return this.parseB_1.getBoolean() && !(class_1297 instanceof class_1296) && !(class_1297 instanceof class_6025);
    }
    
    private boolean isEnabled() {
        return QuickStrike.class310.field_1724.method_6047().method_31574(class_1802.field_49814);
    }
    
    private void execute_5() {
        final int int_1 = this.getInt_1();
        if (int_1 != -1) {
            Initializer_8.setClass_1661AndInt(QuickStrike.class310.field_1724.method_31548(), int_1);
        }
    }
    
    private void setDouble(final double n) {
        int int_1 = (n >= this.buildC_2.getDouble()) ? this.getInt_2() : this.getInt_3();
        if (int_1 == -1) {
            int_1 = this.getInt_1();
        }
        if (int_1 != -1) {
            Initializer_8.setClass_1661AndInt(QuickStrike.class310.field_1724.method_31548(), int_1);
        }
    }
    
    private void setInt(final int n) {
        if (n >= 0 && n < 9) {
            Initializer_8.setClass_1661AndInt(QuickStrike.class310.field_1724.method_31548(), n);
        }
    }
    
    private int getInt() {
        for (int i = 0; i < 9; ++i) {
            if (Initializer_8.checkClass_1792_1(QuickStrike.class310.field_1724.method_31548().method_5438(i).method_7909())) {
                return i;
            }
        }
        return -1;
    }
    
    private int getInt_1() {
        for (int i = 0; i < 9; ++i) {
            if (QuickStrike.class310.field_1724.method_31548().method_5438(i).method_31574(class_1802.field_49814)) {
                return i;
            }
        }
        return -1;
    }
    
    private int getInt_2() {
        for (int i = 0; i < 9; ++i) {
            final class_1799 method_5438 = QuickStrike.class310.field_1724.method_31548().method_5438(i);
            if (method_5438.method_31574(class_1802.field_49814) && this.checkCondition(method_5438, "density")) {
                return i;
            }
        }
        return -1;
    }
    
    private int getInt_3() {
        for (int i = 0; i < 9; ++i) {
            final class_1799 method_5438 = QuickStrike.class310.field_1724.method_31548().method_5438(i);
            if (method_5438.method_31574(class_1802.field_49814) && this.checkCondition(method_5438, "breach")) {
                return i;
            }
        }
        return -1;
    }
    
    private boolean checkCondition(final class_1799 class_1799, final String s) {
        return class_1799.method_58657().method_57534().stream().anyMatch(QuickStrike::lambda$enchantmentContains$0);
    }
    
    private void execute_6() {
        this.boolFlag = false;
        this.doubleValue = -1.0;
        this.boolFlag_1 = false;
        this.intValue_1 = 0;
    }
    
    private void execute_7() {
        this.intValue = -1;
        this.longValue = 0L;
        this.boolFlag_2 = false;
        this.class1297 = null;
        this.boolFlag_3 = false;
        this.class1297_1 = null;
        this.execute_6();
    }
    
    private static boolean lambda$enchantmentContains$0(final String s, final class_6880 class_6880) {
        return class_6880.method_55840().contains(s);
    }
}
