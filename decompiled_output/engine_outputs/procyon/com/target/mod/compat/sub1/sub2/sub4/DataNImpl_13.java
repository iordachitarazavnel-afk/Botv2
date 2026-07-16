// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import java.util.Iterator;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_17;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import net.minecraft.class_1799;
import java.util.ArrayList;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import net.minecraft.class_1802;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1723;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import net.minecraft.class_490;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_3;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_13 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_5 parseB;
    private final SyncASub_1 buildC_2;
    private final SyncASub_3 initD;
    private final SyncASub_5 parseB_1;
    private int intValue;
    
    public DataNImpl_13() {
        super("loot_yeeter", Initializer_14.computeString(new int[] { 132, 202, 45, 99, 43, 44, 66, 5, 76, 33, 100, 107, 0, 71, 145, 48, 244, 154, 136, 211, 250, 215, 178, 213, 246, 145, 52, 0, 112, 23, 48, 47, 118, 68 }), "T.hrows away junk items from your inventory", Initializer.MISC);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 74, 33, 100, 106, 207, 21, 185, 164, 244, 155, 190, 211, 250, 198, 178, 213, 246, 145, 52, 25, 112, 23, 38 }), 0.0, 36.0, 6.0, 1.0);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 74, 33, 100, 106, 207, 21, 185, 160, 244, 155, 180, 211, 250, 211, 178, 213, 225, 145, 52, 24, 112, 23, 38 }), 0.0, 576.0, 64.0, 1.0);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 53, 99, 43, 44, 66, 5, 76, 33, 100, 112, 0, 71, 128, 255, 166, 171, 17, 211, 251, 244, 178, 213, 250, 145, 52, 6, 112, 23, 38, 47, 118, 66 }), false);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 81, 33, 100, 107, 0, 71, 149, 48, 244, 154, 152, 211, 250, 220, 178, 213, 231, 145, 52, 17, 112, 23, 39, 47, 118, 64, 14, 81, 118, 237, 176, 148 }), 0.0, 10.0, 0.0, 1.0);
        this.initD = new SyncASub_3(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 64, 33, 100, 112, 0, 71, 140, 255, 166, 176, 222, 129, 198, 189, 224, 252, 156, 195, 12, 180, 112, 22, 30, 47, 118, 83, 14, 81, 110 }), 88, false);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 66, 33, 100, 106, 0, 71, 129, 255, 166, 169, 222, 129, 202, 114, 178, 212, 195, 145, 52, 21, 112, 23, 33, 47, 118, 66, 14, 81, 114, 237, 176, 138, 204, 147, 183 }), true);
        this.intValue = 0;
        this.setSyncaarr(this.buildC, this.buildC_1, this.parseB, this.buildC_2, this.initD, this.parseB_1);
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
        if (DataNImpl_13.class310.field_1724 == null || DataNImpl_13.class310.field_1687 == null) {
            return;
        }
        if (!(DataNImpl_13.class310.field_1755 instanceof class_490)) {
            return;
        }
        if (!Initializer_9.checkInt(this.initD.getInt())) {
            return;
        }
        if (this.intValue > 0) {
            --this.intValue;
            return;
        }
        final int int1 = this.getInt();
        if (int1 == -1) {
            return;
        }
        DataNImpl_13.class310.field_1761.method_2906(((class_1723)((class_490)DataNImpl_13.class310.field_1755).method_17577()).field_7763, int1, 1, class_1713.field_7795, (class_1657)DataNImpl_13.class310.field_1724);
        this.intValue = this.buildC_2.getInt();
    }
    
    private int getInt() {
        if (this.parseB.getBoolean()) {
            final int int_2 = this.getInt_2();
            if (int_2 != -1) {
                return int_2;
            }
            return this.getInt_1();
        }
        else {
            final int int_3 = this.getInt_1();
            if (int_3 != -1) {
                return int_3;
            }
            return this.getInt_2();
        }
    }
    
    private int getInt_1() {
        if (DataNImpl_13.class310.field_1724 == null) {
            return -1;
        }
        final int method_int_1 = Initializer_10.method_int_1(class_1802.field_8634);
        if (method_int_1 <= this.buildC_1.getInt()) {
            return -1;
        }
        final ArrayList list = new ArrayList();
        for (int i = 9; i < 36; ++i) {
            if (((class_1799)Initializer_8.computeClass_2371(DataNImpl_13.class310.field_1724.method_31548()).get(i)).method_31574(class_1802.field_8634)) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            return -1;
        }
        if (this.parseB_1.getBoolean()) {
            final int intValue = (int)list.get(Initializer_17.method_int(0, list.size() - 1));
            if (method_int_1 - ((class_1799)Initializer_8.computeClass_2371(DataNImpl_13.class310.field_1724.method_31548()).get(intValue)).method_7947() >= this.buildC_1.getInt()) {
                return intValue;
            }
            return -1;
        }
        else {
            int n = -1;
            int n2 = Integer.MAX_VALUE;
            for (final int intValue2 : list) {
                final int method_7947 = ((class_1799)Initializer_8.computeClass_2371(DataNImpl_13.class310.field_1724.method_31548()).get(intValue2)).method_7947();
                if (method_7947 < n2) {
                    n2 = method_7947;
                    n = intValue2;
                }
            }
            if (n == -1) {
                return -1;
            }
            if (method_int_1 - n2 >= this.buildC_1.getInt()) {
                return n;
            }
            return -1;
        }
    }
    
    private int getInt_2() {
        if (DataNImpl_13.class310.field_1724 == null) {
            return -1;
        }
        if (Initializer_10.method_int_1(class_1802.field_8288) <= this.buildC.getInt()) {
            return -1;
        }
        final ArrayList list = new ArrayList();
        for (int i = 9; i < 36; ++i) {
            if (((class_1799)Initializer_8.computeClass_2371(DataNImpl_13.class310.field_1724.method_31548()).get(i)).method_31574(class_1802.field_8288)) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            return -1;
        }
        if (this.parseB_1.getBoolean()) {
            return (int)list.get(Initializer_17.method_int(0, list.size() - 1));
        }
        return (int)list.get(0);
    }
}
