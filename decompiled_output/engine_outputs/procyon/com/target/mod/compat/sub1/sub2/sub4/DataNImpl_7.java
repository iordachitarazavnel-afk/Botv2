// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_2338;
import net.minecraft.class_3965;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_1268;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_7 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_1 buildC;
    private final SyncASub_5 parseB;
    private int intValue;
    
    public DataNImpl_7() {
        super("auto_web", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 134, 211, 250, 215, 178, 213, 241 }), "P.laces webs at enemies feet automatically", Initializer.cacheE_2);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 70, 33, 100, 104, 0, 71, 132, 255, 166, 191 }), 0.0, 20.0, 2.0, 1.0);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 70, 33, 100, 117, 0, 71, 144, 255, 166, 175, 222, 129, 213, 189, 224, 237, 83, 145, 53, 55, 112, 23, 58, 47, 118, 84, 14, 81, 96, 237, 176, 157, 204, 147, 187 }), true);
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
        if (DataNImpl_7.class310.field_1724 == null || DataNImpl_7.class310.field_1687 == null || DataNImpl_7.class310.field_1755 != null) {
            return;
        }
        if (this.intValue > 0) {
            --this.intValue;
            return;
        }
        if (this.parseB.getBoolean() && !DataNImpl_7.class310.field_1724.method_6047().method_31574(class_1802.field_8786)) {
            return;
        }
        final class_2338 method_10074 = DataNImpl_7.class310.field_1724.method_24515().method_10074();
        if (DataNImpl_7.class310.field_1687.method_8320(method_10074).method_26215()) {
            DataNImpl_7.class310.field_1761.method_2896(DataNImpl_7.class310.field_1724, class_1268.field_5808, new class_3965(class_243.method_24953((class_2382)method_10074), class_2350.field_11036, method_10074, false));
            DataNImpl_7.class310.field_1724.method_6104(class_1268.field_5808);
            this.intValue = this.buildC.getInt();
        }
    }
}
