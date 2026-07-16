// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import com.target.mod.compat.sub1.sub3.sub1.Interface;
import net.minecraft.class_1747;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_9 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_1 buildC;
    private int intValue;
    
    public DataNImpl_9() {
        super("fast_place", Initializer_14.computeString(new int[] { 132, 202, 39, 99, 43, 44, 66, 5, 66, 33, 100, 119, 0, 71, 145, 48, 244, 154, 129, 211, 250, 222, 178, 213, 242, 145, 52, 23, 112, 23, 48 }), Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 134, 255, 166, 163, 17, 211, 250, 208, 178, 213, 255, 145, 52, 27, 112, 23, 54, 47, 118, 93, 14, 81, 100, 34, 226, 165, 165, 193, 132, 197, 160, 231, 246, 159, 198, 18, 126, 33, 34, 93, 0, 90 }), Initializer.MISC);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 70, 33, 100, 104, 0, 71, 132, 255, 166, 191 }), 0.0, 4.0, 0.0, 1.0);
        this.intValue = 0;
        this.setSyncaarr(this.buildC);
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
        if (DataNImpl_9.class310.field_1724 == null || DataNImpl_9.class310.field_1761 == null) {
            return;
        }
        if (!(DataNImpl_9.class310.field_1724.method_6047().method_7909() instanceof class_1747)) {
            return;
        }
        if (!DataNImpl_9.class310.field_1690.field_1904.method_1434()) {
            return;
        }
        if (this.intValue > 0) {
            --this.intValue;
            return;
        }
        ((Interface)DataNImpl_9.class310).sIUC(0);
        this.intValue = this.buildC.getInt();
    }
}
