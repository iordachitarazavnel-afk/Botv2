// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_8 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_1 buildC;
    private final SyncASub_5 parseB;
    private int intValue;
    
    public DataNImpl_8() {
        super("auto_pot_refill", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 129, 211, 250, 221, 178, 213, 231, 94, 102, 40, 45, 69, 8, 69, 36, 107, 103, 3, 74, 139, 226, 165, 175, 193, 132, 200 }), "R.efills your hotbar with health potions", Initializer.cacheE_2);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 79, 33, 100, 107, 0, 71, 145 }), 1.0, 9.0, 9.0, 1.0);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 41, 99, 43, 44, 66, 5, 76, 33, 100, 112, 0, 71, 135, 255, 166, 167, 222, 129, 213 }), true);
        this.intValue = 0;
        this.setSyncaarr(this.buildC, this.parseB);
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
        if (DataNImpl_8.class310.field_1724 == null || DataNImpl_8.class310.field_1755 != null) {
            return;
        }
        if (this.intValue > 0) {
            --this.intValue;
            return;
        }
        final int n = this.buildC.getInt() - 1;
        if (!this.parseB.getBoolean()) {
            return;
        }
        if (!DataNImpl_8.class310.field_1724.method_31548().method_5438(n).method_31574(class_1802.field_8436)) {
            for (int i = 9; i < 36; ++i) {
                if (DataNImpl_8.class310.field_1724.method_31548().method_5438(i).method_31574(class_1802.field_8436)) {
                    DataNImpl_8.class310.execute(DataNImpl_8::lambda$onTick$0);
                    this.intValue = 5;
                    break;
                }
            }
        }
    }
    
    private static void lambda$onTick$0(final int n, final int n2) {
        if (DataNImpl_8.class310.field_1724 != null && DataNImpl_8.class310.field_1761 != null) {
            DataNImpl_8.class310.field_1761.method_2906(DataNImpl_8.class310.field_1724.field_7498.field_7763, n, n2, class_1713.field_7791, (class_1657)DataNImpl_8.class310.field_1724);
        }
    }
}
