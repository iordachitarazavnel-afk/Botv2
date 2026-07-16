// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_437;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import net.minecraft.class_1294;
import net.minecraft.class_1291;
import com.target.mod.compat.sub1.sub3.sub1.Interface_2;
import net.minecraft.class_465;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_2;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_2 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_2 checkE;
    private final SyncASub_1 buildC;
    private int intValue;
    
    public DataNImpl_2() {
        super("auto_pot_refill", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 129, 211, 250, 221, 178, 213, 231, 94, 102, 40, 45, 69, 8, 69, 36, 107, 103, 3, 74, 139, 226, 165, 175, 193, 132, 200 }), Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 70, 33, 100, 98, 0, 71, 140, 255, 166, 170, 222, 129, 203, 189, 224, 251, 83, 145, 52, 13, 112, 23, 58, 47, 118, 67, 14, 81, 101, 34, 226, 165, 171, 193, 132, 203, 160, 231, 241, 159, 198, 4, 126, 33, 38, 93, 0, 90, 243, 49, 84, 99, 16, 183, 156, 207, 150, 162, 174, 241, 223, 66, 130, 197, 19, 97, 36, 43, 64, 7, 81, 63, 102, 111, 30, 65, 136, 253, 160, 166, 220, 131, 218 }), Initializer.cacheE_2);
        this.checkE = new SyncASub_2(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 76, 33, 100, 96, 0, 71, 128 }), Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138 }), new String[] { Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138 }), Initializer_14.computeString(new int[] { 132, 202, 41, 99, 43, 44, 66, 5, 76, 33, 100, 114, 0, 71, 128, 255, 166, 180 }) });
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 70, 33, 100, 104, 0, 71, 132, 255, 166, 191 }), 0.0, 10.0, 0.0, 1.0);
        this.setSyncaarr(this.checkE, this.buildC);
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
        final class_437 field_1755 = DataNImpl_2.class310.field_1755;
        if (field_1755 instanceof final class_465 class_465) {
            if (this.checkE.checkString("Hover")) {
                final class_1735 focusedSlot = ((Interface_2)class_465).getFocusedSlot();
                if (focusedSlot == null) {
                    return;
                }
                int n = -1;
                for (int i = 0; i <= 8; ++i) {
                    if (DataNImpl_2.class310.field_1724.method_31548().method_5438(i).method_7960()) {
                        n = i;
                        break;
                    }
                }
                if (n == -1) {
                    return;
                }
                if (Initializer_10.checkCondition((class_1291)class_1294.field_5915.comp_349(), 1, 1, focusedSlot.method_7677())) {
                    if (this.intValue < this.buildC.getInt()) {
                        ++this.intValue;
                        return;
                    }
                    DataNImpl_2.class310.execute(DataNImpl_2::lambda$onTick$0);
                    this.intValue = 0;
                }
            }
            if (this.checkE.checkString("Auto")) {
                final int method_int_2 = Initializer_10.method_int_2((class_1291)class_1294.field_5915.comp_349(), 1, 1);
                if (method_int_2 != -1) {
                    int n2 = -1;
                    for (int j = 0; j <= 8; ++j) {
                        if (DataNImpl_2.class310.field_1724.method_31548().method_5438(j).method_7960()) {
                            n2 = j;
                            break;
                        }
                    }
                    if (n2 == -1) {
                        return;
                    }
                    if (this.intValue < this.buildC.getInt()) {
                        ++this.intValue;
                        return;
                    }
                    DataNImpl_2.class310.execute(DataNImpl_2::lambda$onTick$1);
                    this.intValue = 0;
                }
            }
        }
    }
    
    private static void lambda$onTick$1(final int n, final int n2, final int n3) {
        if (DataNImpl_2.class310.field_1724 != null && DataNImpl_2.class310.field_1761 != null) {
            DataNImpl_2.class310.field_1761.method_2906(n, n2, n3, class_1713.field_7791, (class_1657)DataNImpl_2.class310.field_1724);
        }
    }
    
    private static void lambda$onTick$0(final int n, final int n2, final int n3) {
        if (DataNImpl_2.class310.field_1724 != null && DataNImpl_2.class310.field_1761 != null) {
            DataNImpl_2.class310.field_1761.method_2906(n, n2, n3, class_1713.field_7791, (class_1657)DataNImpl_2.class310.field_1724);
        }
    }
}
