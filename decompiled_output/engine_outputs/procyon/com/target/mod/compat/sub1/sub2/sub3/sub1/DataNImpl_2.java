// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub3.sub1;

import com.target.mod.compat.sub1.sub3.sub1.Interface_2;
import net.minecraft.class_1735;
import net.minecraft.class_1713;
import net.minecraft.class_1723;
import net.minecraft.class_437;
import net.minecraft.class_1657;
import net.minecraft.class_490;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_2 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_1 buildC;
    private final SyncASub_5 parseB;
    private final SyncASub_1 buildC_1;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private int intValue;
    private boolean boolFlag;
    private float floatValue;
    private boolean boolFlag_1;
    private int intValue_1;
    
    public DataNImpl_2() {
        super("hover_totem", Initializer_14.computeString(new int[] { 132, 202, 41, 99, 43, 44, 66, 5, 76, 33, 100, 114, 0, 71, 128, 255, 166, 180, 17, 211, 251, 230, 178, 213, 252, 145, 52, 0, 112, 23, 48, 47, 118, 91 }), "H.overs a totem in inventory for quick access", Initializer.cacheE);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 70, 33, 100, 104, 0, 71, 132, 255, 166, 191 }), 0.0, 20.0, 0.0, 1.0);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 41, 99, 43, 44, 66, 5, 76, 33, 100, 112, 0, 71, 135, 255, 166, 167, 222, 129, 213 }), true);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 53, 99, 43, 44, 66, 5, 76, 33, 100, 112, 0, 71, 128, 255, 166, 171, 17, 211, 251, 225, 178, 213, 255, 145, 52, 27, 112, 23, 33 }), 1.0, 9.0, 1.0, 1.0);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 130, 211, 250, 197, 178, 213, 250, 145, 52, 0, 112, 23, 54, 47, 118, 94 }), false);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 46, 99, 43, 44, 66, 5, 77, 33, 100, 104, 0, 71, 156, 48, 244, 154, 158, 211, 250, 220, 178, 212, 253, 94, 102, 40, 47, 69, 8, 79, 36, 107, 113 }), false);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 152, 211, 250, 220, 178, 213, 229, 145, 52, 17, 112, 23, 59, 47, 118, 66, 14, 81, 120, 237, 176, 138, 204, 147, 160 }), false);
        this.boolFlag = false;
        this.floatValue = -1.0f;
        this.boolFlag_1 = false;
        this.intValue_1 = -1;
        this.setSyncaarr(this.buildC, this.parseB, this.buildC_1, this.parseB_1, this.parseB_2, this.parseB_3);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.intValue = 0;
        this.boolFlag = false;
        this.floatValue = -1.0f;
        this.boolFlag_1 = false;
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_2.class310.field_1724 == null) {
            return;
        }
        if (this.intValue_1 != -1 && DataNImpl_2.class310.field_1755 == null) {
            Initializer_8.setClass_1661AndInt(DataNImpl_2.class310.field_1724.method_31548(), this.intValue_1);
            this.intValue_1 = -1;
        }
        final float method_6032 = DataNImpl_2.class310.field_1724.method_6032();
        if (this.floatValue > 0.0f && this.floatValue <= 2.0f && method_6032 > this.floatValue + 5.0f) {
            this.boolFlag = true;
        }
        this.floatValue = method_6032;
        if (this.parseB_2.getBoolean() && !this.boolFlag) {
            if (DataNImpl_2.class310.field_1724.method_6079().method_31574(class_1802.field_8288)) {
                this.boolFlag = false;
            }
            return;
        }
        if (this.parseB_3.getBoolean() && !(DataNImpl_2.class310.field_1755 instanceof class_490) && (this.parseB.getBoolean() ? (DataNImpl_2.class310.field_1724.method_31548().method_5438(this.buildC_1.getInt() - 1).method_7909() != class_1802.field_8288) : (!DataNImpl_2.class310.field_1724.method_6079().method_31574(class_1802.field_8288))) && this.isEnabled()) {
            DataNImpl_2.class310.method_1507((class_437)new class_490((class_1657)DataNImpl_2.class310.field_1724));
            this.boolFlag_1 = true;
            return;
        }
        final class_437 field_1755 = DataNImpl_2.class310.field_1755;
        if (field_1755 instanceof final class_490 class_490) {
            final class_1735 computeClass_1735 = this.computeClass_1735(class_490);
            if (computeClass_1735 != null) {
                final int field_1756 = computeClass_1735.field_7874;
                if (field_1756 > 44 || field_1756 < 9) {
                    return;
                }
                final int n = this.buildC_1.getInt() - 1;
                if (computeClass_1735.method_7677().method_7909() == class_1802.field_8288) {
                    if (!DataNImpl_2.class310.field_1724.method_6079().method_31574(class_1802.field_8288)) {
                        if (this.intValue > 0) {
                            --this.intValue;
                            return;
                        }
                        DataNImpl_2.class310.field_1761.method_2906(((class_1723)class_490.method_17577()).field_7763, field_1756, 40, class_1713.field_7791, (class_1657)DataNImpl_2.class310.field_1724);
                        this.intValue = this.buildC.getInt();
                        this.boolFlag = false;
                        this.boolFlag_1 = false;
                        if (this.parseB_1.getBoolean()) {
                            Initializer_8.setClass_1661AndInt(DataNImpl_2.class310.field_1724.method_31548(), n);
                        }
                    }
                    else if (this.parseB.getBoolean() && DataNImpl_2.class310.field_1724.method_31548().method_5438(n).method_7909() != class_1802.field_8288) {
                        if (this.intValue > 0) {
                            --this.intValue;
                            return;
                        }
                        DataNImpl_2.class310.field_1761.method_2906(((class_1723)class_490.method_17577()).field_7763, field_1756, n, class_1713.field_7791, (class_1657)DataNImpl_2.class310.field_1724);
                        this.intValue = this.buildC.getInt();
                        this.boolFlag = false;
                        this.boolFlag_1 = false;
                        if (this.parseB_1.getBoolean()) {
                            Initializer_8.setClass_1661AndInt(DataNImpl_2.class310.field_1724.method_31548(), n);
                        }
                    }
                }
            }
        }
        else {
            this.intValue = this.buildC.getInt();
            this.boolFlag_1 = false;
        }
    }
    
    private boolean isEnabled() {
        if (DataNImpl_2.class310.field_1724 == null) {
            return false;
        }
        for (int i = 0; i < DataNImpl_2.class310.field_1724.method_31548().method_5439(); ++i) {
            if (DataNImpl_2.class310.field_1724.method_31548().method_5438(i).method_31574(class_1802.field_8288)) {
                return true;
            }
        }
        return false;
    }
    
    private class_1735 computeClass_1735(final class_490 class_490) {
        try {
            return ((Interface_2)class_490).getFocusedSlot();
        }
        catch (final Exception ex) {
            return null;
        }
    }
}
