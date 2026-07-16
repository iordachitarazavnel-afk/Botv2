// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_9362;
import net.minecraft.class_1835;
import net.minecraft.class_1792;
import net.minecraft.class_3966;
import net.minecraft.class_239$class_240;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_11;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_6;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class ItemSImpl extends Initializer_3 implements PackDImpl_6, PackDImpl_5
{
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_1 buildC;
    private boolean boolFlag;
    private int intValue;
    private int intValue_1;
    
    public ItemSImpl() {
        super("auto_totem_hit", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 133, 211, 250, 221, 178, 213, 231, 145, 52, 17, 112, 23, 56, 224, 36, 106, 73, 3, 74, 139, 226, 165, 183 }), "A.ttacks instantly when enemy pops a totem", Initializer.cacheE);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 70, 33, 100, 117, 0, 71, 144, 255, 166, 175, 222, 129, 213, 189, 224, 237, 83, 145, 53, 39, 112, 23, 34, 47, 118, 89, 14, 81, 101, 237, 176, 156 }), true);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 114, 178, 212, 209, 145, 52, 21, 112, 23, 54, 47, 118, 93 }), true);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 114, 178, 212, 215, 145, 52, 17, 112, 23, 57, 47, 118, 87, 14, 81, 110 }), 0.0, 5.0, 1.0, 1.0);
        this.intValue = -1;
        this.setSyncaarr(this.parseB, this.parseB_1, this.buildC);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_6.class, this);
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.execute_3();
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_6.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        if (this.boolFlag && this.intValue != -1 && ItemSImpl.class310.field_1724 != null) {
            Initializer_8.setClass_1661AndInt(ItemSImpl.class310.field_1724.method_31548(), this.intValue);
        }
        super.execute_1();
    }
    
    @Override
    public void setSlotf(final BindCSub_11 bindCSub_11) {
        if (ItemSImpl.class310.field_1724 == null) {
            return;
        }
        if (this.boolFlag) {
            return;
        }
        if (ItemSImpl.class310.field_1765 == null || ItemSImpl.class310.field_1765.method_17783() != class_239$class_240.field_1331) {
            return;
        }
        if (((class_3966)ItemSImpl.class310.field_1765).method_17782() == null) {
            return;
        }
        if (!this.checkClass_1792(ItemSImpl.class310.field_1724.method_6047().method_7909())) {
            if (this.boolFlag) {
                this.intValue_1 = 0;
            }
            else if (this.parseB.getBoolean()) {
                final int int1 = this.getInt();
                if (int1 == -1) {
                    return;
                }
                if (this.parseB_1.getBoolean() && this.intValue == -1) {
                    this.intValue = Initializer_8.method_int(ItemSImpl.class310.field_1724.method_31548());
                }
                Initializer_8.setClass_1661AndInt(ItemSImpl.class310.field_1724.method_31548(), int1);
                if (this.parseB_1.getBoolean()) {
                    this.boolFlag = true;
                    this.intValue_1 = 0;
                }
            }
        }
    }
    
    @Override
    public void execute_2() {
        if (ItemSImpl.class310.field_1724 == null) {
            return;
        }
        if (this.boolFlag && this.intValue != -1) {
            if (this.intValue_1 < this.buildC.getInt()) {
                ++this.intValue_1;
            }
            else {
                Initializer_8.setClass_1661AndInt(ItemSImpl.class310.field_1724.method_31548(), this.intValue);
                this.execute_3();
            }
        }
    }
    
    private void execute_3() {
        this.boolFlag = false;
        this.intValue = -1;
        this.intValue_1 = 0;
    }
    
    private boolean checkClass_1792(final class_1792 class_1792) {
        return Initializer_8.checkClass_1792(class_1792) || class_1792 instanceof class_1835 || class_1792 instanceof class_9362 || Initializer_8.checkClass_1792_1(class_1792);
    }
    
    private int getInt() {
        for (int i = 0; i < 9; ++i) {
            if (Initializer_8.checkClass_1792(ItemSImpl.class310.field_1724.method_31548().method_5438(i).method_7909())) {
                return i;
            }
        }
        return -1;
    }
}
