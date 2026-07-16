// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_1657;
import net.minecraft.class_1268;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_3;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_11 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_3 initD;
    private final SyncASub_1 buildC;
    private final SyncASub_5 parseB;
    private final SyncASub_1 buildC_1;
    private boolean boolFlag;
    private boolean boolFlag_1;
    private int intValue;
    private int intValue_1;
    private int intValue_2;
    
    public DataNImpl_11() {
        super("key_pearl", Initializer_14.computeString(new int[] { 132, 202, 42, 99, 43, 44, 66, 5, 70, 33, 100, 125, 0, 70, 181, 255, 166, 163, 222, 129, 198, 189, 224, 250, 156, 195, 5 }), "T.hrows an ender pearl instantly on key press", Initializer.MISC);
        this.initD = new SyncASub_3(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 64, 33, 100, 112, 0, 71, 140, 255, 166, 176, 222, 129, 198, 189, 224, 252, 156, 195, 12, 180, 112, 22, 30, 47, 118, 83, 14, 81, 110 }), -1, false);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 70, 33, 100, 104, 0, 71, 132, 255, 166, 191 }), 0.0, 20.0, 0.0, 1.0);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 114, 178, 212, 209, 145, 52, 21, 112, 23, 54, 47, 118, 93 }), true);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 114, 178, 212, 215, 145, 52, 17, 112, 23, 57, 47, 118, 87, 14, 81, 110 }), 0.0, 20.0, 0.0, 1.0);
        this.intValue_1 = -1;
        this.setSyncaarr(this.initD, this.buildC, this.parseB, this.buildC_1);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.execute_4();
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_11.class310.field_1724 == null || DataNImpl_11.class310.field_1755 != null) {
            return;
        }
        if (Initializer_9.checkInt(this.initD.getInt())) {
            this.boolFlag = true;
        }
        if (this.boolFlag) {
            if (this.intValue_1 == -1) {
                this.intValue_1 = Initializer_8.method_int(DataNImpl_11.class310.field_1724.method_31548());
            }
            Initializer_10.checkClass_1792(class_1802.field_8634);
            if (this.intValue < this.buildC.getInt()) {
                ++this.intValue;
                return;
            }
            if (!this.boolFlag_1) {
                if (DataNImpl_11.class310.field_1761.method_2919((class_1657)DataNImpl_11.class310.field_1724, class_1268.field_5808).method_23665()) {
                    DataNImpl_11.class310.field_1724.method_6104(class_1268.field_5808);
                }
                this.boolFlag_1 = true;
            }
            if (this.parseB.getBoolean()) {
                this.execute_3();
            }
            else {
                this.execute_4();
            }
        }
    }
    
    private void execute_3() {
        if (this.intValue_2 < this.buildC_1.getInt()) {
            ++this.intValue_2;
            return;
        }
        Initializer_10.setInt(this.intValue_1);
        this.execute_4();
    }
    
    private void execute_4() {
        this.intValue_1 = -1;
        this.intValue = 0;
        this.intValue_2 = 0;
        this.boolFlag = false;
        this.boolFlag_1 = false;
    }
}
