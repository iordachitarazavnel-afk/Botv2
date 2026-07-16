// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_15 extends Initializer_3 implements PackDImpl_5
{
    public DataNImpl_15() {
        super("totem_offhand", Initializer_14.computeString(new int[] { 132, 202, 53, 99, 43, 44, 66, 5, 76, 33, 100, 112, 0, 71, 128, 255, 166, 171, 17, 211, 251, 253, 178, 213, 245, 145, 52, 18, 112, 23, 61, 47, 118, 87, 14, 81, 121, 237, 176, 156 }), "A.utomatically places a totem in your offhand", Initializer.cacheE);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_15.class310.field_1724 == null) {
            return;
        }
        if (DataNImpl_15.class310.field_1724.method_6079().method_31574(class_1802.field_8288)) {
            return;
        }
        int n = -1;
        for (int i = 9; i < 36; ++i) {
            if (DataNImpl_15.class310.field_1724.method_31548().method_5438(i).method_31574(class_1802.field_8288)) {
                n = i;
                break;
            }
        }
        if (n == -1) {
            for (int j = 0; j < 9; ++j) {
                if (DataNImpl_15.class310.field_1724.method_31548().method_5438(j).method_31574(class_1802.field_8288)) {
                    n = j;
                    break;
                }
            }
        }
        if (n == -1) {
            return;
        }
        int n2;
        if (n < 9) {
            n2 = n + 36;
        }
        else {
            n2 = n;
        }
        final int field_7763 = DataNImpl_15.class310.field_1724.field_7498.field_7763;
        DataNImpl_15.class310.field_1761.method_2906(field_7763, n2, 0, class_1713.field_7790, (class_1657)DataNImpl_15.class310.field_1724);
        DataNImpl_15.class310.field_1761.method_2906(field_7763, 45, 0, class_1713.field_7790, (class_1657)DataNImpl_15.class310.field_1724);
        if (!DataNImpl_15.class310.field_1724.field_7498.method_34255().method_7960()) {
            DataNImpl_15.class310.field_1761.method_2906(field_7763, n2, 0, class_1713.field_7790, (class_1657)DataNImpl_15.class310.field_1724);
        }
    }
}
