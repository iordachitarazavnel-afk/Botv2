// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_2769;
import net.minecraft.class_4969;
import net.minecraft.class_2246;
import net.minecraft.class_3965;
import net.minecraft.class_239$class_240;
import net.minecraft.class_1802;
import net.minecraft.class_1268;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_4;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class CheckRImpl extends Initializer_3 implements PackDImpl_4
{
    private final SyncASub_5 parseB;
    
    public CheckRImpl() {
        super("prevent", Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 147, 255, 166, 163, 222, 129, 201, 189, 224, 252 }), Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 147, 255, 166, 163, 222, 129, 201, 189, 224, 252, 156, 195, 26, 180, 112, 23, 54, 47, 118, 83, 14, 81, 101, 237, 176, 140, 204, 147, 184, 171, 242, 211, 138, 205, 245, 166, 126, 33, 38, 93, 0, 75, 60, 99, 125, 27, 66, 131, 250, 157, 164, 217, 252, 194, 184, 223, 254 }), Initializer.MISC);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 147, 255, 166, 163, 222, 129, 201, 189, 224, 252, 83, 145, 53, 53, 112, 23, 59, 47, 118, 85, 14, 81, 127, 237, 176, 151, 204, 147, 171 }), true);
        this.setSyncaarr(this.parseB);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_4.class, this);
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_4.class, this);
        super.execute_1();
    }
    
    @Override
    public void setBlocke(final BindCSub bindCSub) {
        if (CheckRImpl.class310.field_1724 == null || CheckRImpl.class310.field_1687 == null) {
            return;
        }
        if (CheckRImpl.class310.field_1724.method_5998(class_1268.field_5808).method_7909() != class_1802.field_8801 && CheckRImpl.class310.field_1724.method_5998(class_1268.field_5810).method_7909() != class_1802.field_8801) {
            return;
        }
        final class_239 field_1765 = CheckRImpl.class310.field_1765;
        if (field_1765 == null || field_1765.method_17783() != class_239$class_240.field_1332) {
            return;
        }
        final class_2338 method_17777 = ((class_3965)field_1765).method_17777();
        if (CheckRImpl.class310.field_1687.method_8320(method_17777).method_26204() != class_2246.field_23152) {
            return;
        }
        if (this.parseB.getBoolean() && (int)CheckRImpl.class310.field_1687.method_8320(method_17777).method_11654((class_2769)class_4969.field_23153) > 0) {
            bindCSub.execute_2();
        }
    }
}
