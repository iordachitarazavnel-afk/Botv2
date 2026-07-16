// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_1268;
import net.minecraft.class_1802;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import net.minecraft.class_1291;
import net.minecraft.class_1294;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_14 extends Initializer_3 implements PackDImpl_5
{
    private int intValue;
    
    public DataNImpl_14() {
        super("auto_pot", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 129, 211, 250, 221, 178, 213, 231 }), "T.hrows health potions when health is low", Initializer.cacheE_2);
        this.intValue = 0;
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.intValue = 0;
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_14.class310.field_1724 == null || DataNImpl_14.class310.field_1755 != null) {
            return;
        }
        if (this.intValue > 0) {
            --this.intValue;
            return;
        }
        if (DataNImpl_14.class310.field_1724.method_6032() < 10.0f && !DataNImpl_14.class310.field_1724.method_6059(class_1294.field_5924)) {
            final int method_int = Initializer_10.method_int((class_1291)class_1294.field_5915.comp_349(), 1, 2);
            if (method_int != -1) {
                DataNImpl_14.class310.execute(this::lambda$onTick$0);
                this.intValue = 10;
            }
        }
        if (!DataNImpl_14.class310.field_1724.method_6059(class_1294.field_5904)) {
            final int method_int2 = Initializer_10.method_int((class_1291)class_1294.field_5904.comp_349(), 1, 2);
            if (method_int2 != -1) {
                DataNImpl_14.class310.execute(this::lambda$onTick$1);
                this.intValue = 20;
            }
        }
        if (!DataNImpl_14.class310.field_1724.method_6059(class_1294.field_5910)) {
            final int method_int3 = Initializer_10.method_int((class_1291)class_1294.field_5910.comp_349(), 1, 2);
            if (method_int3 != -1) {
                DataNImpl_14.class310.execute(this::lambda$onTick$2);
                this.intValue = 20;
            }
        }
    }
    
    private void setInt(final int n) {
        if (DataNImpl_14.class310.field_1724 == null || DataNImpl_14.class310.field_1761 == null) {
            return;
        }
        DataNImpl_14.class310.field_1761.method_2906(DataNImpl_14.class310.field_1724.field_7498.field_7763, n, Initializer_8.method_int(DataNImpl_14.class310.field_1724.method_31548()), class_1713.field_7791, (class_1657)DataNImpl_14.class310.field_1724);
        if (DataNImpl_14.class310.field_1724.method_6047().method_31574(class_1802.field_8436)) {
            DataNImpl_14.class310.field_1761.method_2919((class_1657)DataNImpl_14.class310.field_1724, class_1268.field_5808);
        }
        DataNImpl_14.class310.field_1761.method_2906(DataNImpl_14.class310.field_1724.field_7498.field_7763, n, Initializer_8.method_int(DataNImpl_14.class310.field_1724.method_31548()), class_1713.field_7791, (class_1657)DataNImpl_14.class310.field_1724);
    }
    
    private void lambda$onTick$2(final int int1) {
        this.setInt(int1);
    }
    
    private void lambda$onTick$1(final int int1) {
        this.setInt(int1);
    }
    
    private void lambda$onTick$0(final int int1) {
        this.setInt(int1);
    }
}
