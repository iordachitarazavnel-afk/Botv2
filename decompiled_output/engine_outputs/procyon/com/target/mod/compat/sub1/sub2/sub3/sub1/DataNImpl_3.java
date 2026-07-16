// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub3.sub1;

import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1723;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import net.minecraft.class_1802;
import net.minecraft.class_437;
import net.minecraft.class_1657;
import net.minecraft.class_490;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_3 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_5 parseB;
    private final SyncASub_1 buildC;
    private final SyncASub_5 parseB_1;
    private final SyncASub_1 buildC_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private final SyncASub_5 parseB_4;
    private final SyncASub_1 buildC_2;
    int intValue;
    int intValue_1;
    private int intValue_2;
    
    public DataNImpl_3() {
        super("auto_inventory_totem", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 152, 211, 250, 220, 178, 213, 229, 145, 52, 17, 112, 23, 59, 47, 118, 66, 14, 81, 120, 237, 176, 138, 204, 147, 160, 100, 160, 230, 209, 159, 198, 9, 126, 33, 51, 93, 0, 77, 60, 99, 100 }), "M.oves totems to your offhand from inventory", Initializer.cacheE);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 35, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 145, 255, 166, 167, 222, 129, 201, 189, 224, 252 }), true);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 70, 33, 100, 104, 0, 71, 132, 255, 166, 191 }), 0.0, 20.0, 0.0, 1.0);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 41, 99, 43, 44, 66, 5, 76, 33, 100, 112, 0, 71, 135, 255, 166, 167, 222, 129, 213 }), true);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 53, 99, 43, 44, 66, 5, 76, 33, 100, 112, 0, 71, 128, 255, 166, 171, 17, 211, 251, 225, 178, 213, 255, 145, 52, 27, 112, 23, 33 }), 1.0, 9.0, 1.0, 1.0);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 130, 211, 250, 197, 178, 213, 250, 145, 52, 0, 112, 23, 54, 47, 118, 94 }), false);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 39, 99, 43, 44, 66, 5, 76, 33, 100, 118, 0, 71, 134, 255, 166, 163, 17, 211, 251, 230, 178, 213, 252, 145, 52, 0, 112, 23, 48, 47, 118, 91 }), false);
        this.parseB_4 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 158, 211, 250, 194, 178, 213, 246, 145, 52, 26 }), false);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 87, 33, 100, 101, 0, 71, 156, 48, 244, 154, 158, 211, 250, 194, 178, 213, 246, 145, 52, 26, 191, 69, 9, 102, 36, 107, 110, 3, 74, 144 }), 0.0, 20.0, 0.0, 1.0);
        this.intValue = -1;
        this.intValue_1 = -1;
        this.intValue_2 = -1;
        this.setSyncaarr(this.parseB, this.buildC, this.parseB_1, this.buildC_1, this.parseB_2, this.parseB_3, this.parseB_4, this.buildC_2);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.intValue = -1;
        this.intValue_1 = -1;
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_3.class310.field_1724 == null) {
            return;
        }
        if (this.intValue_2 != -1 && DataNImpl_3.class310.field_1755 == null) {
            Initializer_8.setClass_1661AndInt(DataNImpl_3.class310.field_1724.method_31548(), this.intValue_2);
            this.intValue_2 = -1;
        }
        if (this.isEnabled_1() && this.parseB_4.getBoolean()) {
            DataNImpl_3.class310.method_1507((class_437)new class_490((class_1657)DataNImpl_3.class310.field_1724));
        }
        if (!(DataNImpl_3.class310.field_1755 instanceof class_490)) {
            this.intValue = -1;
            this.intValue_1 = -1;
            return;
        }
        if (this.intValue == -1) {
            this.intValue = this.buildC.getInt();
        }
        if (this.intValue_1 == -1) {
            this.intValue_1 = this.buildC_2.getInt();
        }
        if (this.intValue > 0) {
            --this.intValue;
        }
        final class_1661 method_31548 = DataNImpl_3.class310.field_1724.method_31548();
        if (this.parseB_2.getBoolean()) {
            this.intValue_2 = this.buildC_1.getInt() - 1;
        }
        if (this.intValue <= 0) {
            if (DataNImpl_3.class310.field_1724.method_6079().method_7909() != class_1802.field_8288) {
                final int n = this.parseB.getBoolean() ? Initializer_10.getInt() : Initializer_10.getInt_1();
                if (n != -1) {
                    DataNImpl_3.class310.field_1761.method_2906(((class_1723)((class_490)DataNImpl_3.class310.field_1755).method_17577()).field_7763, n, 40, class_1713.field_7791, (class_1657)DataNImpl_3.class310.field_1724);
                    return;
                }
            }
            if (this.parseB_1.getBoolean()) {
                final class_1799 method_31549 = DataNImpl_3.class310.field_1724.method_6047();
                if (method_31549.method_7960() || (this.parseB_3.getBoolean() && method_31549.method_7909() != class_1802.field_8288)) {
                    final int n2 = this.parseB.getBoolean() ? Initializer_10.getInt() : Initializer_10.getInt_1();
                    if (n2 != -1) {
                        DataNImpl_3.class310.field_1761.method_2906(((class_1723)((class_490)DataNImpl_3.class310.field_1755).method_17577()).field_7763, n2, Initializer_8.method_int(method_31548), class_1713.field_7791, (class_1657)DataNImpl_3.class310.field_1724);
                        return;
                    }
                }
            }
            if (this.isEnabled() && this.parseB_4.getBoolean()) {
                if (this.intValue_1 != 0) {
                    --this.intValue_1;
                    return;
                }
                DataNImpl_3.class310.field_1755.method_25419();
                this.intValue_1 = this.buildC_2.getInt();
            }
        }
    }
    
    @Override
    public boolean isEnabled() {
        if (this.parseB_1.getBoolean()) {
            return DataNImpl_3.class310.field_1724.method_31548().method_5438(this.buildC_1.getInt() - 1).method_7909() == class_1802.field_8288 && DataNImpl_3.class310.field_1724.method_6079().method_7909() == class_1802.field_8288 && DataNImpl_3.class310.field_1755 instanceof class_490;
        }
        return DataNImpl_3.class310.field_1724.method_6079().method_7909() == class_1802.field_8288 && DataNImpl_3.class310.field_1755 instanceof class_490;
    }
    
    public boolean isEnabled_1() {
        if (this.parseB_1.getBoolean()) {
            return (DataNImpl_3.class310.field_1724.method_6079().method_7909() != class_1802.field_8288 || DataNImpl_3.class310.field_1724.method_31548().method_5438(this.buildC_1.getInt() - 1).method_7909() != class_1802.field_8288) && !(DataNImpl_3.class310.field_1755 instanceof class_490) && Initializer_10.method_int_3(DataNImpl_3::lambda$shouldOpenScreen$0) != 0;
        }
        return DataNImpl_3.class310.field_1724.method_6079().method_7909() != class_1802.field_8288 && !(DataNImpl_3.class310.field_1755 instanceof class_490) && Initializer_10.method_int_3(DataNImpl_3::lambda$shouldOpenScreen$1) != 0;
    }
    
    private static boolean lambda$shouldOpenScreen$1(final class_1792 class_1792) {
        return class_1792 == class_1802.field_8288;
    }
    
    private static boolean lambda$shouldOpenScreen$0(final class_1792 class_1792) {
        return class_1792 == class_1802.field_8288;
    }
}
