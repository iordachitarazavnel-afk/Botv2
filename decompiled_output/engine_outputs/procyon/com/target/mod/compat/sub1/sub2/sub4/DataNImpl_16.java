// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1657;
import net.minecraft.class_1268;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_16 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_5 parseB;
    private int intValue;
    
    public DataNImpl_16() {
        super("bottle_throw", Initializer_14.computeString(new int[] { 51, 38, 161, 193, 246, 193, 223, 215 }), "T.hrows exp bottles quickly while holding right click", Initializer.MISC);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 74, 33, 100, 106, 207, 21, 185, 180, 244, 155, 180, 211, 250, 222, 178, 213, 242, 145, 52, 13 }), 0.0, 20.0, 0.0, 1.0);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 66, 33, 100, 124, 207, 21, 185, 180, 244, 155, 180, 211, 250, 222, 178, 213, 242, 145, 52, 13 }), 0.0, 20.0, 1.0, 1.0);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 139, 255, 166, 161, 17, 211, 251, 250, 178, 213, 242, 145, 52, 26, 112, 23, 49 }), true);
        this.intValue = 0;
        this.setSyncaarr(this.buildC, this.buildC_1, this.parseB);
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
        if (DataNImpl_16.class310.field_1724 == null || DataNImpl_16.class310.field_1687 == null || DataNImpl_16.class310.field_1755 != null) {
            return;
        }
        if (!DataNImpl_16.class310.field_1724.method_6047().method_31574(class_1802.field_8287)) {
            return;
        }
        if (!DataNImpl_16.class310.field_1690.field_1904.method_1434()) {
            return;
        }
        if (this.intValue > 0) {
            --this.intValue;
            return;
        }
        if (DataNImpl_16.class310.field_1761 != null && DataNImpl_16.class310.field_1761.method_2919((class_1657)DataNImpl_16.class310.field_1724, class_1268.field_5808).method_23665() && this.parseB.getBoolean()) {
            DataNImpl_16.class310.field_1724.method_6104(class_1268.field_5808);
        }
        final int int1 = this.buildC.getInt();
        int int2 = this.buildC_1.getInt();
        if (int2 < int1) {
            int2 = int1;
        }
        this.intValue = ((int1 == int2) ? int1 : ThreadLocalRandom.current().nextInt(int1, int2 + 1));
    }
}
