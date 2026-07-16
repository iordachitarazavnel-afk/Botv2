// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_2338;
import net.minecraft.class_1268;
import net.minecraft.class_2350;
import net.minecraft.class_2246;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_5 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    
    public DataNImpl_5() {
        super("anti_web", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 77, 33, 100, 112, 0, 71, 140, 48, 244, 154, 134, 211, 250, 215, 178, 213, 241 }), "B.reaks webs around you instantly", Initializer.cacheE_2);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 47, 99, 43, 44, 66, 5, 76, 238, 54, 88, 92, 21, 184, 156, 244, 155, 190, 211, 250, 197, 178, 213, 247, 145, 52, 27, 112, 23, 34, 47, 118, 88 }), true);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 147, 211, 250, 192, 178, 213, 246, 145, 52, 21, 112, 23, 62 }), true);
        this.setSyncaarr(this.parseB, this.parseB_1);
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
        if (DataNImpl_5.class310.field_1724 == null || DataNImpl_5.class310.field_1687 == null) {
            return;
        }
        final class_2338 method_24515 = DataNImpl_5.class310.field_1724.method_24515();
        if (this.parseB_1.getBoolean()) {
            if (DataNImpl_5.class310.field_1687.method_8320(method_24515).method_27852(class_2246.field_10343)) {
                DataNImpl_5.class310.field_1761.method_2910(method_24515, class_2350.field_11036);
                DataNImpl_5.class310.field_1724.method_6104(class_1268.field_5808);
            }
            final class_2338 method_24516 = method_24515.method_10084();
            if (DataNImpl_5.class310.field_1687.method_8320(method_24516).method_27852(class_2246.field_10343)) {
                DataNImpl_5.class310.field_1761.method_2910(method_24516, class_2350.field_11036);
            }
        }
    }
}
