// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_742;
import net.minecraft.class_1657;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub;
import net.minecraft.class_1297;
import net.minecraft.class_239;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import net.minecraft.class_1621;
import net.minecraft.class_1511;
import net.minecraft.class_3966;
import net.minecraft.class_1268;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_20;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_4;
import net.minecraft.class_2246;
import net.minecraft.class_239$class_240;
import net.minecraft.class_3965;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import java.util.function.Predicate;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_17;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_6;
import java.util.HashMap;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import net.minecraft.class_2338;
import java.util.Map;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_3;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_4;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_17 extends Initializer_3 implements PackDImpl_5, PackDImpl_4
{
    private final SyncASub_3 initD;
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_1 buildC_2;
    private final SyncASub_1 buildC_3;
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private final SyncASub_5 parseB_4;
    private final SyncASub_1 buildC_4;
    private final SyncASub_1 buildC_5;
    private int intValue;
    private int intValue_1;
    public boolean boolFlag;
    private final Map<class_2338, Integer> map;
    private final Map<class_2338, Integer> map_1;
    private static final int intValue_2 = 2;
    static final boolean boolFlag_1;
    
    public DataNImpl_17() {
        super("auto_dtap", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 149, 211, 251, 230, 178, 212, 210, 145, 53, 36 }), "U.tility module", Initializer.cacheE);
        this.initD = new SyncASub_3(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 64, 33, 100, 112, 0, 71, 140, 255, 166, 176, 222, 129, 198, 189, 224, 252, 156, 195, 12, 180, 112, 23, 62, 47, 118, 83, 14, 81, 110 }), 1, false);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 134, 255, 166, 163, 17, 211, 250, 214, 178, 213, 246, 145, 52, 24, 112, 23, 52, 47, 118, 79 }), 0.0, 20.0, 3.0, 1.0);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 35, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 132, 255, 166, 173, 17, 211, 250, 214, 178, 213, 246, 145, 52, 24, 112, 23, 52, 47, 118, 79 }), 0.0, 20.0, 3.0, 1.0);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 134, 255, 166, 163, 17, 211, 250, 209, 178, 213, 251, 145, 52, 21, 112, 23, 59, 47, 118, 85, 14, 81, 114 }), 0.0, 100.0, 100.0, 1.0);
        this.buildC_3 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 35, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 132, 255, 166, 173, 17, 211, 250, 209, 178, 213, 251, 145, 52, 21, 112, 23, 59, 47, 118, 85, 14, 81, 114 }), 0.0, 100.0, 100.0, 1.0);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 87, 33, 100, 107, 0, 71, 149, 48, 244, 155, 190, 211, 250, 220, 125, 135, 206, 245, 102, 41, 22, 69, 8, 76, 36, 107, 109 }), false);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 39, 99, 43, 44, 66, 5, 66, 33, 100, 111, 0, 71, 128, 48, 244, 155, 161, 211, 250, 199, 178, 213, 253, 145, 52, 23, 112, 23, 61 }), false);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 79, 33, 100, 109, 0, 71, 134, 255, 166, 173, 17, 211, 251, 225, 178, 213, 250, 145, 52, 25, 112, 23, 32, 47, 118, 90, 14, 81, 118, 237, 176, 140, 204, 147, 176, 171, 242, 213, 138, 205, 245 }), false);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 66, 33, 100, 105, 0, 71, 132, 255, 166, 161, 222, 129, 194, 114, 178, 213, 231, 145, 52, 29, 112, 23, 54, 47, 118, 93 }), false);
        this.parseB_4 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 77, 33, 100, 112, 0, 71, 140, 255, 167, 171, 222, 128, 240, 189, 224, 237, 156, 195, 8, 123, 34, 33, 90, 125, 69, 57, 92, 105, 24, 191, 158, 247, 158, 189 }), false);
        this.buildC_4 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 66, 33, 100, 118, 0, 71, 145, 255, 166, 175, 222, 129, 196, 189, 224, 228, 156, 195, 12, 180, 112, 22, 22, 47, 118, 94, 14, 81, 118, 237, 176, 150, 204, 147, 186, 171, 242, 223 }), 0.0, 100.0, 20.0, 1.0);
        this.buildC_5 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 70, 33, 100, 119, 0, 71, 128, 255, 166, 178, 17, 211, 251, 246, 178, 213, 246, 145, 52, 24, 112, 23, 52, 47, 118, 79 }), 0.0, 100.0, 10.0, 1.0);
        this.map = new HashMap<class_2338, Integer>();
        this.map_1 = new HashMap<class_2338, Integer>();
        this.setSyncaarr(this.initD, this.buildC, this.buildC_1, this.buildC_2, this.buildC_3, this.parseB, this.parseB_1, this.parseB_2, this.parseB_3, this.parseB_4, this.buildC_4, this.buildC_5);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd(PackDImpl_4.class, this);
        this.intValue = 0;
        this.intValue_1 = 0;
        this.boolFlag = false;
        this.map.clear();
        this.map_1.clear();
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_4.class, this);
        this.map.clear();
        this.map_1.clear();
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_17.class310.field_1755 != null) {
            return;
        }
        final boolean b = this.intValue != 0;
        final boolean b2 = this.intValue_1 != 0;
        if (this.parseB.getBoolean() && Initializer_6.isEnabled()) {
            return;
        }
        final int method_int = Initializer_17.method_int(1, 100);
        if (b) {
            --this.intValue;
        }
        if (b2) {
            --this.intValue_1;
        }
        this.map_1.entrySet().removeIf(this::lambda$onTick$0);
        if (DataNImpl_17.class310.field_1724.method_6115()) {
            return;
        }
        if (this.parseB_3.getBoolean() && this.isEnabled_1()) {
            return;
        }
        if (this.initD.getInt() != -1 && !Initializer_9.checkInt(this.initD.getInt())) {
            this.intValue = 0;
            this.intValue_1 = 0;
            this.boolFlag = false;
            return;
        }
        this.boolFlag = true;
        if (DataNImpl_17.class310.field_1724.method_6047().method_7909() != class_1802.field_8301) {
            return;
        }
        final class_239 field_1765 = DataNImpl_17.class310.field_1765;
        if (field_1765 instanceof final class_3965 class_3965) {
            if (DataNImpl_17.class310.field_1765.method_17783() == class_239$class_240.field_1332) {
                final class_2338 method_17777 = class_3965.method_17777();
                if (!b && method_int <= this.buildC_2.getInt() && (Initializer_4.checkCondition(method_17777, class_2246.field_10540) || Initializer_4.checkCondition(method_17777, class_2246.field_9987)) && com.target.mod.compat.sub1.sub2.sub7.Initializer.checkClass_2338(method_17777) && !this.map_1.containsKey(method_17777)) {
                    final int intValue = this.map.getOrDefault(method_17777, 0);
                    if (intValue < 2) {
                        if (this.parseB_2.getBoolean()) {
                            Initializer_20.setInt_2(1);
                        }
                        Initializer_6.setClass_3965AndBool(class_3965, true);
                        final int i = intValue + 1;
                        this.map.put(method_17777, i);
                        if (i >= 2) {
                            this.map_1.put(method_17777, this.buildC_5.getInt());
                        }
                        if (!this.parseB_1.getBoolean() || method_int <= this.buildC_4.getDouble()) {}
                        this.intValue = this.buildC.getInt();
                    }
                }
                if (this.parseB_1.getBoolean()) {
                    if (!b2 && method_int <= this.buildC_3.getInt()) {
                        if (Initializer_4.checkCondition(method_17777, class_2246.field_10540) || Initializer_4.checkCondition(method_17777, class_2246.field_9987)) {
                            return;
                        }
                        if (this.parseB_2.getBoolean()) {
                            if (Initializer_4.checkCondition(method_17777, class_2246.field_10540) || Initializer_4.checkCondition(method_17777, class_2246.field_9987)) {
                                if (com.target.mod.compat.sub1.sub2.sub7.Initializer.checkClass_2338(method_17777)) {
                                    Initializer_20.setInt_2(0);
                                }
                            }
                            else {
                                Initializer_20.setInt_2(0);
                            }
                        }
                        DataNImpl_17.class310.field_1761.method_2910(method_17777, class_3965.method_17780());
                        DataNImpl_17.class310.field_1724.method_6104(class_1268.field_5808);
                        DataNImpl_17.class310.field_1761.method_2902(method_17777, class_3965.method_17780());
                        this.intValue_1 = this.buildC_1.getInt();
                    }
                    if (!b && method_int <= this.buildC_2.getInt() && b2 && this.parseB_2.getBoolean()) {
                        Initializer_20.setInt_2(1);
                    }
                }
            }
            if (DataNImpl_17.class310.field_1765.method_17783() == class_239$class_240.field_1333 && this.parseB_1.getBoolean()) {
                if (!b2 && method_int <= this.buildC_3.getInt()) {
                    if (DataNImpl_17.class310.field_1761.method_2924()) {
                        DataNImpl_17.class310.field_1771 = 10;
                    }
                    if (this.parseB_2.getBoolean()) {
                        Initializer_20.setInt_2(0);
                    }
                    DataNImpl_17.class310.field_1724.method_6104(class_1268.field_5808);
                    this.intValue_1 = this.buildC_1.getInt();
                }
                if (!b && method_int <= this.buildC_2.getInt() && b2 && this.parseB_2.getBoolean()) {
                    Initializer_20.setInt_2(1);
                }
            }
        }
        final int method_int2 = Initializer_17.method_int(1, 100);
        final class_239 field_1766 = DataNImpl_17.class310.field_1765;
        if (field_1766 instanceof final class_3966 class_3966) {
            if (!b2 && method_int2 <= this.buildC_3.getInt()) {
                final class_1297 method_17778 = class_3966.method_17782();
                if (!this.parseB_1.getBoolean() && !(method_17778 instanceof class_1511) && !(method_17778 instanceof class_1621)) {
                    return;
                }
                final int method_int3 = Initializer_8.method_int(DataNImpl_17.class310.field_1724.method_31548());
                if ((method_17778 instanceof class_1511 || method_17778 instanceof class_1621) && this.parseB_4.getBoolean() && this.isEnabled()) {
                    Initializer_10.isEnabled();
                }
                if (this.parseB_2.getBoolean()) {
                    Initializer_20.setInt_2(0);
                }
                Initializer_6.setClass_1297AndBool(method_17778, true);
                this.intValue_1 = this.buildC_1.getInt();
                if (this.parseB_4.getBoolean()) {
                    Initializer_10.setInt(method_int3);
                }
            }
        }
    }
    
    @Override
    public void setBlocke(final BindCSub bindCSub) {
        if (DataNImpl_17.class310.field_1724.method_6047().method_7909() == class_1802.field_8301) {
            final class_239 field_1765 = DataNImpl_17.class310.field_1765;
            if (field_1765 instanceof final class_3965 class_3965) {
                if (DataNImpl_17.class310.field_1765.method_17783() == class_239$class_240.field_1332 && (Initializer_4.checkCondition(class_3965.method_17777(), class_2246.field_10540) || Initializer_4.checkCondition(class_3965.method_17777(), class_2246.field_9987))) {
                    bindCSub.execute_2();
                }
            }
        }
    }
    
    private boolean isEnabled() {
        if (!DataNImpl_17.boolFlag_1 && DataNImpl_17.class310.field_1724 == null) {
            throw new AssertionError();
        }
        final class_1293 method_6112 = DataNImpl_17.class310.field_1724.method_6112(class_1294.field_5911);
        final class_1293 method_6113 = DataNImpl_17.class310.field_1724.method_6112(class_1294.field_5910);
        return method_6112 != null && (method_6113 == null || method_6113.method_5578() <= method_6112.method_5578());
    }
    
    private boolean isEnabled_1() {
        return DataNImpl_17.class310.field_1687.method_18456().parallelStream().filter(DataNImpl_17::lambda$shouldCycle$1).filter(DataNImpl_17::lambda$shouldCycle$2).filter(DataNImpl_17::lambda$shouldCycle$3).filter(DataNImpl_17::lambda$shouldCycle$4).anyMatch(DataNImpl_17::lambda$shouldCycle$5) && !(DataNImpl_17.class310.field_1724.method_6052() instanceof class_1657);
    }
    
    private static boolean lambda$shouldCycle$5(final class_742 class_742) {
        return class_742.field_6235 >= 2;
    }
    
    private static boolean lambda$shouldCycle$4(final class_742 class_742) {
        return !class_742.method_24828();
    }
    
    private static boolean lambda$shouldCycle$3(final class_742 class_742) {
        return class_742.method_49107() == null;
    }
    
    private static boolean lambda$shouldCycle$2(final class_742 class_742) {
        return class_742.method_5858((class_1297)DataNImpl_17.class310.field_1724) < 36.0;
    }
    
    private static boolean lambda$shouldCycle$1(final class_742 class_742) {
        return class_742 != DataNImpl_17.class310.field_1724;
    }
    
    private boolean lambda$onTick$0(final Map.Entry entry) {
        final int i = entry.getValue() - 1;
        if (i <= 0) {
            this.map.remove(entry.getKey());
            return true;
        }
        entry.setValue(i);
        return false;
    }
    
    static {
        boolFlag_1 = !DataNImpl_17.class.desiredAssertionStatus();
    }
}
