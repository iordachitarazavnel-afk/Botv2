// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_17;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_4;
import net.minecraft.class_2246;
import net.minecraft.class_239$class_240;
import net.minecraft.class_3965;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_3;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_3 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_3 initD;
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_1 buildC_2;
    private final SyncASub_1 buildC_3;
    private final SyncASub_5 parseB;
    private final SyncASub_1 buildC_4;
    private final SyncASub_1 buildC_5;
    private int intValue;
    private int intValue_1;
    private boolean boolFlag;
    private int intValue_2;
    private int intValue_3;
    
    public DataNImpl_3() {
        super("double_anchor", Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 76, 33, 100, 113, 0, 71, 135, 255, 166, 170, 222, 129, 194, 114, 178, 212, 210, 145, 52, 26, 112, 23, 54, 47, 118, 94, 14, 81, 120, 237, 176, 138 }), "P.laces two anchors for massive damage", Initializer.cacheE_1);
        this.initD = new SyncASub_3(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 64, 33, 100, 112, 0, 71, 140, 255, 166, 176, 222, 129, 198, 189, 224, 252, 156, 195, 12, 180, 112, 22, 30, 47, 118, 83, 14, 81, 110 }), 71, false);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 114, 178, 212, 215, 145, 52, 17, 112, 23, 57, 47, 118, 87, 14, 81, 110 }), 0.0, 20.0, 0.0, 1.0);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 53, 99, 43, 44, 66, 5, 76, 33, 100, 112, 0, 71, 128, 255, 166, 171, 17, 211, 251, 225, 178, 213, 255, 145, 52, 27, 112, 23, 33 }), 1.0, 9.0, 1.0, 1.0);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 66, 33, 100, 106, 0, 71, 129, 255, 166, 169, 222, 129, 202, 114, 178, 212, 215, 145, 52, 17, 112, 23, 57, 47, 118, 87, 14, 81, 110, 34, 226, 164, 142, 193, 132, 205, 160, 231, 235 }), 0.0, 50.0, 0.0, 1.0);
        this.buildC_3 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 66, 33, 100, 106, 0, 71, 129, 255, 166, 169, 222, 129, 202, 114, 178, 212, 215, 145, 52, 17, 112, 23, 57, 47, 118, 87, 14, 81, 110, 34, 226, 164, 142, 193, 132, 197, 160, 231, 253 }), 0.0, 100.0, 0.0, 1.0);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 66, 33, 100, 106, 0, 71, 129, 255, 166, 169, 222, 129, 202, 114, 178, 212, 212, 145, 52, 24, 112, 23, 58, 47, 118, 65, 14, 81, 100, 237, 176, 140, 204, 147, 182, 171, 242, 212, 138, 205, 254 }), false);
        this.buildC_4 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 66, 33, 100, 106, 0, 71, 129, 48, 244, 154, 150, 211, 250, 222, 178, 213, 252, 145, 52, 3, 191, 69, 9, 109, 36, 107, 104, 3, 74, 140 }), 1.0, 4.0, 1.0, 1.0);
        this.buildC_5 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 66, 33, 100, 106, 0, 71, 129, 48, 244, 154, 150, 211, 250, 222, 178, 213, 252, 145, 52, 3, 191, 69, 9, 109, 36, 107, 96, 3, 74, 154 }), 1.0, 4.0, 4.0, 1.0);
        this.intValue = 0;
        this.intValue_1 = 0;
        this.boolFlag = false;
        this.intValue_2 = 0;
        this.intValue_3 = 0;
        this.setSyncaarr(this.initD, this.buildC, this.buildC_1, this.buildC_2, this.buildC_3, this.parseB, this.buildC_4, this.buildC_5);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.intValue_1 = 0;
        this.intValue = 0;
        this.boolFlag = false;
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_3.class310.field_1724 == null || DataNImpl_3.class310.field_1687 == null || DataNImpl_3.class310.field_1755 != null) {
            return;
        }
        if (this.isEnabled() && (this.boolFlag || this.isEnabled_1()) && DataNImpl_3.class310.field_1765 instanceof class_3965) {
            if (DataNImpl_3.class310.field_1765.method_17783() != class_239$class_240.field_1332) {
                return;
            }
            final class_3965 class_3965 = (class_3965)DataNImpl_3.class310.field_1765;
            if (this.intValue_1 == 0 && Initializer_4.checkCondition(class_3965.method_17777(), class_2246.field_23152)) {
                this.intValue_1 = 2;
            }
            else {
                int int1 = this.buildC.getInt();
                if (this.buildC_3.getDouble() > this.buildC_2.getDouble()) {
                    if (this.intValue_2 == 0) {
                        final int int2 = this.buildC_2.getInt();
                        this.intValue_2 = int2 + (int)(Math.random() * (this.buildC_3.getInt() - int2 + 1));
                    }
                    int1 += this.intValue_2;
                }
                if (this.intValue < int1) {
                    ++this.intValue;
                }
                else {
                    this.intValue_2 = 0;
                    if (this.intValue_1 == 0) {
                        Initializer_10.checkClass_1792(class_1802.field_23141);
                    }
                    else if (this.intValue_1 == 1) {
                        Initializer_4.setClass_3965AndBool(class_3965, true);
                    }
                    else if (this.intValue_1 == 2) {
                        Initializer_10.checkClass_1792(class_1802.field_8801);
                    }
                    else if (this.intValue_1 == 3) {
                        int method_int = 1;
                        if (this.parseB.getBoolean()) {
                            final int max = Math.max(1, Math.min(this.buildC_4.getInt(), 4));
                            method_int = Initializer_17.method_int(max, Math.max(max, Math.min(this.buildC_5.getInt(), 4)));
                        }
                        for (int i = 0; i < method_int; ++i) {
                            Initializer_4.setClass_3965AndBool(class_3965, true);
                        }
                    }
                    else if (this.intValue_1 == 4) {
                        Initializer_10.checkClass_1792(class_1802.field_23141);
                    }
                    else if (this.intValue_1 == 5) {
                        Initializer_4.setClass_3965AndBool(class_3965, true);
                        Initializer_4.setClass_3965AndBool(class_3965, true);
                    }
                    else if (this.intValue_1 == 6) {
                        Initializer_10.checkClass_1792(class_1802.field_8801);
                    }
                    else if (this.intValue_1 == 7) {
                        int method_int2 = 1;
                        if (this.parseB.getBoolean()) {
                            final int max2 = Math.max(1, Math.min(this.buildC_4.getInt(), 4));
                            method_int2 = Initializer_17.method_int(max2, Math.max(max2, Math.min(this.buildC_5.getInt(), 4)));
                        }
                        for (int j = 0; j < method_int2; ++j) {
                            Initializer_4.setClass_3965AndBool(class_3965, true);
                        }
                    }
                    else if (this.intValue_1 == 8) {
                        Initializer_10.setInt(this.buildC_1.getInt() - 1);
                    }
                    else if (this.intValue_1 == 9) {
                        Initializer_4.setClass_3965AndBool(class_3965, true);
                    }
                    else if (this.intValue_1 == 10) {
                        this.boolFlag = false;
                        this.intValue_1 = 0;
                        this.execute_3();
                        return;
                    }
                    ++this.intValue_1;
                    this.intValue = 0;
                }
            }
        }
    }
    
    private boolean isEnabled() {
        boolean b = false;
        boolean b2 = false;
        for (int i = 0; i < 9; ++i) {
            if (DataNImpl_3.class310.field_1724.method_31548().method_5438(i).method_31574(class_1802.field_23141)) {
                b = true;
            }
            if (DataNImpl_3.class310.field_1724.method_31548().method_5438(i).method_31574(class_1802.field_8801)) {
                b2 = true;
            }
        }
        return b && b2;
    }
    
    private boolean isEnabled_1() {
        final int int1 = this.initD.getInt();
        if (int1 != -1 && Initializer_9.checkInt(int1)) {
            return this.boolFlag = true;
        }
        this.execute_3();
        return false;
    }
    
    private void execute_3() {
        this.intValue = 0;
        this.intValue_2 = 0;
        this.intValue_3 = 0;
    }
    
    public boolean isEnabled_2() {
        return this.boolFlag;
    }
}
