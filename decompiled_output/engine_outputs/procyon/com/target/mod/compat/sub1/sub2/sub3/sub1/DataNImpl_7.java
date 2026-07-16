// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub3.sub1;

import net.minecraft.class_2769;
import net.minecraft.class_4969;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_4;
import net.minecraft.class_2246;
import net.minecraft.class_239;
import net.minecraft.class_1268;
import org.lwjgl.glfw.GLFW;
import net.minecraft.class_3965;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_7 extends Initializer_3 implements PackDImpl_5
{
    private class_2338 class2338;
    private int intValue;
    
    public DataNImpl_7() {
        super("double_anchor", Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 76, 33, 100, 113, 0, 71, 135, 255, 166, 170, 222, 129, 194, 114, 178, 212, 210, 145, 52, 26, 112, 23, 54, 47, 118, 94, 14, 81, 120, 237, 176, 138 }), "D.ouble anchor module", Initializer.cacheE);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.class2338 = null;
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
        if (DataNImpl_7.class310.field_1724 == null || DataNImpl_7.class310.field_1687 == null) {
            return;
        }
        if (DataNImpl_7.class310.field_1755 == null && DataNImpl_7.class310.field_1724.method_6047().method_31574(class_1802.field_23141)) {
            final class_239 field_1765 = DataNImpl_7.class310.field_1765;
            if (field_1765 instanceof final class_3965 class_3965) {
                if (this.checkClass_2338(class_3965.method_17777()) && GLFW.glfwGetMouseButton(DataNImpl_7.class310.method_22683().method_4490(), 1) == 1) {
                    if (class_3965.method_17777().equals((Object)this.class2338)) {
                        if (this.intValue >= 1) {
                            return;
                        }
                    }
                    else {
                        this.class2338 = class_3965.method_17777();
                        this.intValue = 0;
                    }
                    DataNImpl_7.class310.field_1761.method_2896(DataNImpl_7.class310.field_1724, class_1268.field_5808, class_3965);
                    DataNImpl_7.class310.field_1724.method_6104(class_1268.field_5808);
                    ++this.intValue;
                }
            }
        }
    }
    
    private boolean checkClass_2338(final class_2338 class_2338) {
        return Initializer_4.checkCondition(class_2338, class_2246.field_23152) && (int)DataNImpl_7.class310.field_1687.method_8320(class_2338).method_11654((class_2769)class_4969.field_23153) != 0;
    }
}
