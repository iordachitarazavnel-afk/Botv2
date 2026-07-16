// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub3.sub1;

import net.minecraft.class_2828;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_5;
import net.minecraft.class_1297$class_5529;
import net.minecraft.class_2596;
import net.minecraft.class_2828$class_2830;
import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import net.minecraft.class_745;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_2;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_8 extends Initializer_3 implements PackDImpl_5, PackDImpl_2
{
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private class_745 class745;
    private static DataNImpl_8 taskFC;
    private float floatValue;
    private boolean boolFlag;
    private boolean boolFlag_1;
    private double doubleValue;
    private double doubleValue_1;
    private double doubleValue_2;
    private float floatValue_1;
    private float floatValue_2;
    
    public static class_745 getClass_745() {
        return (DataNImpl_8.taskFC != null) ? DataNImpl_8.taskFC.class745 : null;
    }
    
    @Override
    public boolean isEnabled() {
        return this.parseB.getBoolean();
    }
    
    public DataNImpl_8() {
        super("fc", Initializer_14.computeString(new int[] { 132, 202, 39, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 128, 255, 166, 165, 222, 129, 198, 189, 224, 229 }), Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 76, 33, 100, 114, 0, 71, 128, 48, 244, 155, 183, 211, 250, 192, 178, 213, 246, 145, 52, 17, 112, 23, 57, 47, 118, 79, 193, 3, 74, 150, 226, 165, 171, 193, 132, 214, 160, 231, 234, 159, 198, 19, 126, 33, 32, 93, 0, 64, 243, 49, 84, 99, 16, 183, 148, 207, 150, 186, 174, 241, 219, 141, 208, 235 }), Initializer.MISC);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 83, 33, 100, 97, 0, 71, 128, 255, 166, 162 }), 1.0, 10.0, 3.0, 0.1);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 55, 99, 43, 44, 66, 5, 70, 33, 100, 118, 0, 71, 145, 255, 166, 175, 222, 129, 196, 189, 224, 233, 156, 195, 5, 180, 112, 22, 6, 47, 118, 70, 14, 81, 114, 237, 176, 157, 204, 147, 189 }), 1.0, 10.0, 3.0, 0.1);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 47, 99, 43, 44, 66, 5, 76, 238, 54, 88, 76, 21, 184, 156, 244, 155, 184, 211, 250, 194 }), true);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 39, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 128, 255, 166, 188, 222, 129, 194, 114, 178, 212, 195, 145, 52, 24, 112, 23, 52, 47, 118, 79, 14, 81, 114, 237, 176, 138 }), true);
        (DataNImpl_8.taskFC = this).setSyncaarr(this.buildC, this.buildC_1, this.parseB, this.parseB_1);
    }
    
    @Override
    public void execute() {
        super.execute();
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd(PackDImpl_2.class, this);
        if (DataNImpl_8.class310.field_1724 != null && DataNImpl_8.class310.field_1687 != null) {
            this.floatValue = DataNImpl_8.class310.field_1724.method_31549().method_7252();
            this.boolFlag = DataNImpl_8.class310.field_1724.method_31549().field_7479;
            this.boolFlag_1 = DataNImpl_8.class310.field_1724.field_5960;
            this.doubleValue = DataNImpl_8.class310.field_1724.method_23317();
            this.doubleValue_1 = DataNImpl_8.class310.field_1724.method_23318();
            this.doubleValue_2 = DataNImpl_8.class310.field_1724.method_23321();
            this.floatValue_1 = DataNImpl_8.class310.field_1724.method_36454();
            this.floatValue_2 = DataNImpl_8.class310.field_1724.method_36455();
            (this.class745 = new class_745(DataNImpl_8.class310.field_1687, DataNImpl_8.class310.field_1724.method_7334())).method_5719((class_1297)DataNImpl_8.class310.field_1724);
            this.class745.method_36456(DataNImpl_8.class310.field_1724.method_36454());
            this.class745.method_36457(DataNImpl_8.class310.field_1724.method_36455());
            this.class745.field_6241 = DataNImpl_8.class310.field_1724.field_6241;
            this.class745.field_6283 = DataNImpl_8.class310.field_1724.field_6283;
            this.class745.method_31548().method_7377(DataNImpl_8.class310.field_1724.method_31548());
            DataNImpl_8.class310.field_1687.method_53875((class_1297)this.class745);
            DataNImpl_8.class310.field_1724.method_31549().field_7479 = true;
            DataNImpl_8.class310.field_1724.method_31549().method_7248((float)(this.buildC.getDouble() / 20.0));
            if (this.parseB.getBoolean()) {
                DataNImpl_8.class310.field_1724.field_5960 = true;
            }
        }
    }
    
    @Override
    public void execute_1() {
        super.execute_1();
        this.renderA.setClassAndPackd_1(PackDImpl_2.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        if (DataNImpl_8.class310.field_1724 != null) {
            DataNImpl_8.class310.field_1724.method_31549().field_7479 = this.boolFlag;
            DataNImpl_8.class310.field_1724.method_31549().method_7248(this.floatValue);
            DataNImpl_8.class310.field_1724.field_5960 = this.boolFlag_1;
            DataNImpl_8.class310.field_1724.method_18800(0.0, 0.0, 0.0);
            double n;
            double n2;
            double n3;
            if (this.class745 != null) {
                n = this.class745.method_23317();
                n2 = this.class745.method_23318();
                n3 = this.class745.method_23321();
            }
            else {
                n = this.doubleValue;
                n2 = this.doubleValue_1;
                n3 = this.doubleValue_2;
            }
            DataNImpl_8.class310.field_1724.method_5814(n, n2, n3);
            DataNImpl_8.class310.field_1724.method_36456(this.floatValue_1);
            DataNImpl_8.class310.field_1724.method_36457(this.floatValue_2);
            final boolean b = !DataNImpl_8.class310.field_1687.method_8587((class_1297)DataNImpl_8.class310.field_1724, DataNImpl_8.class310.field_1724.method_5829().method_989(0.0, -0.04, 0.0));
            DataNImpl_8.class310.field_1724.method_24830(b);
            DataNImpl_8.class310.field_1724.field_6017 = 0.0;
            DataNImpl_8.class310.field_1724.field_3944.method_52787((class_2596)new class_2828$class_2830(n, n2, n3, this.floatValue_1, this.floatValue_2, b, DataNImpl_8.class310.field_1724.field_5976));
        }
        if (DataNImpl_8.class310.field_1687 != null && this.class745 != null) {
            DataNImpl_8.class310.field_1687.method_2945(this.class745.method_5628(), class_1297$class_5529.field_26999);
            this.class745 = null;
        }
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_8.class310.field_1724 == null) {
            return;
        }
        DataNImpl_8.class310.field_1724.method_31549().field_7479 = true;
        DataNImpl_8.class310.field_1724.method_31549().method_7248((float)(this.buildC.getDouble() / 10.0));
        if (this.parseB.getBoolean()) {
            DataNImpl_8.class310.field_1724.field_5960 = true;
            DataNImpl_8.class310.field_1724.method_24830(false);
        }
        DataNImpl_8.class310.field_1724.field_6017 = 0.0;
    }
    
    @Override
    public void setInitd(final BindCSub_5 bindCSub_5) {
        if (bindCSub_5.getClass_2596() instanceof class_2828) {
            bindCSub_5.execute_2();
        }
    }
}
