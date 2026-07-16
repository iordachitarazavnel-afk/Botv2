// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_9362;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_6;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import net.minecraft.class_1657;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_2;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_22 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_1 buildC;
    private final SyncASub_2 checkE;
    private final SyncASub_1 buildC_1;
    private final SyncASub_1 buildC_2;
    private final SyncASub_5 parseB;
    private int intValue;
    private cy$State cyState;
    private class_1657 class1657;
    
    public DataNImpl_22() {
        super("stun_slam", Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 87, 33, 100, 113, 0, 71, 139, 48, 244, 154, 130, 211, 250, 222, 178, 213, 242, 145, 52, 25 }), Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 255, 166, 171, 222, 129, 198, 189, 224, 252, 156, 195, 0, 123, 34, 41, 90, 125, 74, 57, 92, 96, 24, 191, 129, 247, 158, 183, 25, 171, 242, 219, 138, 205, 227, 105, 44, 25, 135, 93, 0, 73, 60, 99, 103, 27, 66, 142, 53, 207, 150, 187, 174, 241, 214, 141, 208, 251, 108, 51, 28, 132, 64, 7, 86, 63, 102, 110, 30, 65, 142, 253, 160, 173, 220, 131, 197, 187, 226, 238, 154, 61, 14, 121, 28, 40, 151, 45, 112, 72, 12, 83, 117, 235, 178, 155, 202, 141, 162, 169, 236, 217, 136, 207, 239, 103, 46, 13 }), Initializer.cacheE);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 42, 43, 66, 5, 77, 33, 101, 106, 207, 21, 185, 184, 244, 155, 180, 211, 250, 219, 178, 213, 244, 145, 52, 28, 112, 23, 33 }), 0.0, 10.0, 1.5, 0.1);
        this.checkE = new SyncASub_2(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 66, 33, 100, 103, 0, 71, 128, 48, 244, 154, 129, 211, 250, 192, 178, 213, 250, 145, 52, 27, 112, 23, 39, 47, 118, 95, 14, 81, 99, 237, 176, 129 }), Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138 }), new String[] { Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138 }), Initializer_14.computeString(new int[] { 132, 202, 54, 99, 43, 44, 66, 5, 74, 33, 100, 106, 0, 71, 129 }), Initializer_14.computeString(new int[] { 132, 202, 35, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 132, 255, 166, 165, 222, 129, 207 }) });
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 101, 0, 71, 149, 48, 244, 154, 130, 211, 250, 194, 178, 213, 246, 145, 52, 17, 112, 23, 49 }), 1.0, 10.0, 5.0, 1.0);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 70, 33, 100, 104, 0, 71, 132, 255, 166, 191 }), 0.0, 20.0, 0.0, 1.0);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 87, 33, 100, 118, 0, 71, 140, 255, 166, 165, 222, 129, 211, 114, 178, 212, 220, 145, 52, 26, 112, 23, 48, 47, 119, 91, 14, 80, 67, 237, 176, 145, 204, 147, 186, 171, 242, 209 }), true);
        this.intValue = 0;
        this.cyState = cy$State.IDLE;
        this.class1657 = null;
        this.setSyncaarr(this.buildC, this.checkE, this.buildC_1, this.buildC_2, this.parseB);
    }
    
    @Override
    public void execute() {
        super.execute();
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.intValue = 0;
        this.cyState = cy$State.IDLE;
        this.class1657 = null;
    }
    
    @Override
    public void execute_1() {
        super.execute_1();
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        this.cyState = cy$State.IDLE;
        this.class1657 = null;
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_22.class310.field_1724 == null || DataNImpl_22.class310.field_1687 == null) {
            return;
        }
        if (this.cyState == cy$State.AXE_SWAPPED && this.class1657 != null) {
            if (this.class1657.method_5805() && DataNImpl_22.class310.field_1724.method_5858((class_1297)this.class1657) < 20.25) {
                DataNImpl_22.class310.field_1761.method_2918((class_1657)DataNImpl_22.class310.field_1724, (class_1297)this.class1657);
                DataNImpl_22.class310.field_1724.method_6104(class_1268.field_5808);
            }
            final int int_1 = this.getInt_1();
            if (int_1 != -1) {
                Initializer_8.setClass_1661AndInt(DataNImpl_22.class310.field_1724.method_31548(), int_1);
                this.cyState = cy$State.MACE_SWAPPED;
            }
            else {
                this.cyState = cy$State.IDLE;
                this.class1657 = null;
                this.intValue = this.buildC_2.getInt();
            }
            return;
        }
        if (this.cyState == cy$State.MACE_SWAPPED && this.class1657 != null) {
            if (this.class1657.method_5805() && DataNImpl_22.class310.field_1724.method_5858((class_1297)this.class1657) < 20.25) {
                DataNImpl_22.class310.field_1761.method_2918((class_1657)DataNImpl_22.class310.field_1724, (class_1297)this.class1657);
                DataNImpl_22.class310.field_1724.method_6104(class_1268.field_5808);
            }
            this.cyState = cy$State.IDLE;
            this.class1657 = null;
            this.intValue = this.buildC_2.getInt();
            return;
        }
        if (this.intValue > 0) {
            --this.intValue;
            return;
        }
        final class_1657 class_1657 = Initializer_6.createClass_1657((class_1297)DataNImpl_22.class310.field_1724, 4.5f, true, false);
        if (class_1657 == null) {
            return;
        }
        if (DataNImpl_22.class310.field_1724.field_6017 < this.buildC.getDouble()) {
            return;
        }
        if (class_1657.method_6039()) {
            final int int1 = this.getInt();
            if (int1 != -1) {
                Initializer_8.setClass_1661AndInt(DataNImpl_22.class310.field_1724.method_31548(), int1);
                this.cyState = cy$State.AXE_SWAPPED;
                this.class1657 = class_1657;
                return;
            }
        }
        final int int_2 = this.getInt_1();
        if (int_2 != -1) {
            Initializer_8.setClass_1661AndInt(DataNImpl_22.class310.field_1724.method_31548(), int_2);
            this.cyState = cy$State.MACE_SWAPPED;
            this.class1657 = class_1657;
        }
    }
    
    private int getInt() {
        for (int i = 0; i < 9; ++i) {
            if (Initializer_8.checkClass_1792_1(DataNImpl_22.class310.field_1724.method_31548().method_5438(i).method_7909())) {
                return i;
            }
        }
        return -1;
    }
    
    private int getInt_1() {
        for (int i = 0; i < 9; ++i) {
            if (DataNImpl_22.class310.field_1724.method_31548().method_5438(i).method_7909() instanceof class_9362) {
                return i;
            }
        }
        return -1;
    }
}
