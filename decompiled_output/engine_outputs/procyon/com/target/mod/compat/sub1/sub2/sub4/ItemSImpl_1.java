// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1792;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_11;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_6;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class ItemSImpl_1 extends Initializer_3 implements PackDImpl_6, PackDImpl_5
{
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private final SyncASub_5 parseB_4;
    private final SyncASub_1 buildC;
    private boolean boolFlag;
    private int intValue;
    private int intValue_1;
    
    public ItemSImpl_1() {
        super("mace_swap", Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 66, 33, 100, 103, 0, 71, 128, 48, 244, 154, 130, 211, 250, 197, 178, 213, 242, 145, 52, 4 }), "U.tility module", Initializer.cacheE);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 54, 99, 43, 44, 66, 5, 74, 33, 100, 106, 0, 71, 129, 48, 244, 154, 147, 211, 250, 199, 178, 213, 225, 145, 52, 7, 112, 23, 33 }), true);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 35, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 132, 255, 166, 165, 222, 129, 207 }), true);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 46, 99, 43, 44, 66, 5, 77, 33, 100, 104, 0, 71, 156, 48, 244, 154, 130, 211, 250, 197, 178, 213, 252, 145, 52, 6, 112, 23, 49 }), false);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 46, 99, 43, 44, 66, 5, 77, 33, 100, 104, 0, 71, 156, 48, 244, 154, 144, 211, 250, 202, 178, 213, 246 }), false);
        this.parseB_4 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 114, 178, 212, 209, 145, 52, 21, 112, 23, 54, 47, 118, 93 }), true);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 114, 178, 212, 215, 145, 52, 17, 112, 23, 57, 47, 118, 87, 14, 81, 110 }), 0.0, 20.0, 0.0, 1.0);
        this.setSyncaarr(this.parseB, this.parseB_1, this.parseB_2, this.parseB_3, this.parseB_4, this.buildC);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_6.class, this);
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.execute_4();
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_6.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (ItemSImpl_1.class310.field_1755 != null) {
            return;
        }
        if (ItemSImpl_1.class310.field_1724 == null) {
            return;
        }
        if (this.boolFlag) {
            if (this.parseB_4.getBoolean()) {
                this.execute_3();
            }
            else {
                this.execute_4();
            }
        }
    }
    
    @Override
    public void setSlotf(final BindCSub_11 bindCSub_11) {
        if (ItemSImpl_1.class310.field_1724 == null) {
            return;
        }
        if (!this.isEnabled()) {
            return;
        }
        if (this.intValue == -1) {
            this.intValue = Initializer_8.method_int(ItemSImpl_1.class310.field_1724.method_31548());
        }
        if (this.parseB.getBoolean() && this.parseB_1.getBoolean()) {
            this.setString(null);
        }
        else if (!this.parseB.getBoolean() && !this.parseB_1.getBoolean()) {
            this.setString(null);
        }
        else {
            if (this.parseB.getBoolean()) {
                this.setString_1("density");
            }
            if (this.parseB_1.getBoolean()) {
                this.setString_1("breach");
            }
        }
        this.boolFlag = true;
    }
    
    private boolean isEnabled() {
        final class_1792 method_7909 = ItemSImpl_1.class310.field_1724.method_6047().method_7909();
        if (this.parseB_2.getBoolean() && this.parseB_3.getBoolean()) {
            return Initializer_8.checkClass_1792(method_7909) || Initializer_8.checkClass_1792_1(method_7909);
        }
        return (!this.parseB_2.getBoolean() || Initializer_8.checkClass_1792(method_7909)) && (!this.parseB_3.getBoolean() || Initializer_8.checkClass_1792_1(method_7909));
    }
    
    private void setString(final String s) {
        for (int i = 0; i < 9; ++i) {
            final class_1799 method_5438 = ItemSImpl_1.class310.field_1724.method_31548().method_5438(i);
            if (method_5438.method_31574(class_1802.field_49814)) {
                if (s == null) {
                    Initializer_8.setClass_1661AndInt(ItemSImpl_1.class310.field_1724.method_31548(), i);
                    return;
                }
                if (this.checkCondition(method_5438, s)) {
                    Initializer_8.setClass_1661AndInt(ItemSImpl_1.class310.field_1724.method_31548(), i);
                    return;
                }
            }
        }
    }
    
    private void setString_1(final String s) {
        for (int i = 0; i < 9; ++i) {
            final class_1799 method_5438 = ItemSImpl_1.class310.field_1724.method_31548().method_5438(i);
            if (method_5438.method_31574(class_1802.field_49814) && this.checkCondition(method_5438, s)) {
                Initializer_8.setClass_1661AndInt(ItemSImpl_1.class310.field_1724.method_31548(), i);
                return;
            }
        }
    }
    
    private boolean checkCondition(final class_1799 class_1799, final String s) {
        return class_1799.method_58657().toString().toLowerCase().contains(s.toLowerCase());
    }
    
    private void execute_3() {
        if (this.intValue_1 < this.buildC.getInt()) {
            ++this.intValue_1;
        }
        else {
            if (this.intValue != -1) {
                Initializer_8.setClass_1661AndInt(ItemSImpl_1.class310.field_1724.method_31548(), this.intValue);
            }
            this.execute_4();
        }
    }
    
    private void execute_4() {
        this.intValue = -1;
        this.intValue_1 = 0;
        this.boolFlag = false;
    }
}
