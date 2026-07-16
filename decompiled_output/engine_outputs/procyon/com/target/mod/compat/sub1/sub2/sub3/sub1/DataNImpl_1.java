// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub3.sub1;

import net.minecraft.class_2246;
import net.minecraft.class_2382;
import net.minecraft.class_3965;
import net.minecraft.class_3959;
import net.minecraft.class_3959$class_242;
import net.minecraft.class_3959$class_3960;
import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_22;
import net.minecraft.class_742;
import net.minecraft.class_238;
import java.util.Iterator;
import java.util.stream.Stream;
import net.minecraft.class_1511;
import java.util.List;
import net.minecraft.class_1657;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_4;
import java.util.function.Consumer;
import java.util.ArrayList;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import java.util.function.Predicate;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_1 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private final SyncASub_5 parseB_4;
    private final SyncASub_1 buildC;
    private final SyncASub_5 parseB_5;
    private final SyncASub_5 parseB_6;
    private final SyncASub_1 buildC_1;
    private final SyncASub_5 parseB_7;
    private final SyncASub_5 parseB_8;
    private final SyncASub_5 parseB_9;
    private final SyncASub_1 buildC_2;
    private boolean boolFlag;
    private boolean boolFlag_1;
    
    public DataNImpl_1() {
        super("auto_double_hand", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 149, 211, 250, 221, 178, 213, 230, 145, 52, 22, 112, 23, 57, 47, 118, 83, 193, 3, 75, 170, 226, 165, 162, 193, 132, 202, 160, 231, 225 }), "A.uto manages both hands for combat efficiency", Initializer.cacheE);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 87, 33, 100, 107, 0, 71, 149, 48, 244, 154, 158, 211, 250, 220, 125, 135, 207, 221, 102, 41, 13, 69, 8, 89, 36, 107, 114, 3, 74, 150, 226, 165, 162, 193, 132, 200 }), false);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 75, 33, 100, 97, 0, 71, 134, 255, 166, 173, 17, 211, 251, 225, 178, 213, 251, 145, 52, 29, 112, 23, 48, 47, 118, 90, 14, 81, 115 }), false);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 46, 99, 43, 44, 66, 5, 77, 238, 54, 88, 95, 21, 184, 159, 244, 155, 161 }), false);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 46, 99, 43, 44, 66, 5, 77, 238, 54, 88, 71, 21, 184, 149, 244, 155, 176, 211, 250, 222, 178, 213, 231, 145, 52, 28 }), false);
        this.parseB_4 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 129, 255, 166, 175, 222, 129, 196, 189, 224, 252, 83, 145, 53, 48, 112, 23, 52, 47, 118, 91, 14, 81, 118, 237, 176, 159, 204, 147, 188 }), true);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 41, 99, 43, 44, 66, 5, 70, 33, 100, 101, 0, 71, 137, 255, 166, 178, 222, 129, 207 }), 1.0, 20.0, 2.0, 1.0);
        this.parseB_5 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 46, 99, 43, 44, 66, 5, 77, 238, 54, 88, 72, 21, 184, 130, 244, 155, 190, 211, 250, 199, 178, 213, 253, 145, 52, 16 }), true);
        this.parseB_6 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 75, 33, 100, 97, 0, 71, 134, 255, 166, 173, 17, 211, 251, 226, 178, 213, 255, 145, 52, 21, 112, 23, 44, 47, 118, 83, 14, 81, 101, 237, 176, 139 }), true);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 37, 99, 43, 44, 66, 5, 74, 33, 100, 119, 0, 71, 145, 255, 166, 167, 222, 129, 201, 189, 224, 235, 156, 195, 12 }), 1.0, 10.0, 5.0, 0.1);
        this.parseB_7 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 129, 255, 166, 175, 222, 129, 196, 189, 224, 252, 83, 145, 53, 55, 112, 23, 39, 47, 118, 79, 14, 81, 100, 237, 176, 140, 204, 147, 184, 171, 242, 214, 138, 205, 232 }), false);
        this.parseB_8 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 75, 33, 100, 97, 0, 71, 134, 255, 166, 173, 17, 211, 251, 243, 178, 213, 250, 145, 52, 25 }), false);
        this.parseB_9 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 75, 33, 100, 97, 0, 71, 134, 255, 166, 173, 17, 211, 251, 251, 178, 213, 231, 145, 52, 17, 112, 23, 56, 47, 118, 69 }), false);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 64, 33, 100, 112, 0, 71, 140, 255, 166, 176, 222, 129, 198, 189, 224, 252, 156, 195, 12, 123, 34, 57, 149, 47, 119, 119, 14, 81, 117, 237, 176, 151, 204, 147, 175, 171, 242, 223 }), 0.0, 4.0, 0.2, 0.1);
        this.setSyncaarr(this.parseB, this.parseB_1, this.parseB_2, this.parseB_3, this.parseB_4, this.buildC, this.parseB_5, this.parseB_6, this.buildC_1, this.parseB_7, this.parseB_8, this.parseB_9, this.buildC_2);
        this.boolFlag = false;
        this.boolFlag_1 = false;
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_1.class310.field_1724 == null) {
            return;
        }
        if (this.parseB.getBoolean()) {
            final DataNImpl_9 dataNImpl_9 = ClientModInitializerImpl.sortB.getEventd().computeLoadf(DataNImpl_9.class);
            if (dataNImpl_9 != null && dataNImpl_9.isEnabled() && dataNImpl_9.boolFlag) {
                return;
            }
        }
        final double n = this.buildC_1.getDouble() * this.buildC_1.getDouble();
        DataNImpl_1.class310.field_1724.method_31548();
        if (this.parseB_1.getBoolean() && DataNImpl_1.class310.field_1724.method_6039()) {
            return;
        }
        if (DataNImpl_1.class310.field_1724.method_6079().method_7909() != class_1802.field_8288 && this.parseB_2.getBoolean() && !this.boolFlag_1) {
            this.boolFlag_1 = true;
            Initializer_10.checkClass_1792(class_1802.field_8288);
        }
        if (DataNImpl_1.class310.field_1724.method_6079().method_7909() == class_1802.field_8288) {
            this.boolFlag_1 = false;
        }
        if (DataNImpl_1.class310.field_1724.method_6032() <= this.buildC.getDouble() && this.parseB_3.getBoolean() && !this.boolFlag) {
            this.boolFlag = true;
            Initializer_10.checkClass_1792(class_1802.field_8288);
        }
        if (DataNImpl_1.class310.field_1724.method_6032() > this.buildC.getDouble()) {
            this.boolFlag = false;
        }
        if (!this.parseB_4.getBoolean()) {
            return;
        }
        if (DataNImpl_1.class310.field_1724.method_6032() > 19.0f) {
            return;
        }
        if (!this.parseB_5.getBoolean() && DataNImpl_1.class310.field_1724.method_24828()) {
            return;
        }
        if (this.parseB_6.getBoolean() && DataNImpl_1.class310.field_1687.method_18456().parallelStream().filter(DataNImpl_1::lambda$onTick$0).noneMatch(DataNImpl_1::lambda$onTick$1)) {
            return;
        }
        final double doubleValue = this.buildC_2.getDouble();
        for (int n2 = (int)Math.floor(doubleValue), i = 1; i <= n2; ++i) {
            if (!DataNImpl_1.class310.field_1687.method_8320(DataNImpl_1.class310.field_1724.method_24515().method_10069(0, -i, 0)).method_26215()) {
                return;
            }
        }
        final class_243 class_243 = new class_243(DataNImpl_1.class310.field_1724.method_23317(), DataNImpl_1.class310.field_1724.method_23318(), DataNImpl_1.class310.field_1724.method_23321());
        if (!DataNImpl_1.class310.field_1687.method_8320(new class_2338((int)class_243.field_1352, (int)class_243.field_1351 - (int)doubleValue, (int)class_243.field_1350)).method_26215()) {
            return;
        }
        final List<class_1511> list = this.getList();
        final ArrayList list2 = new ArrayList();
        list.forEach((Consumer<? super Object>)DataNImpl_1::lambda$onTick$2);
        if (this.parseB_7.getBoolean()) {
            Stream<class_2338> stream = Initializer_4.createStream(DataNImpl_1.class310.field_1724.method_24515().method_10069(-6, -8, -6), DataNImpl_1.class310.field_1724.method_24515().method_10069(6, 2, 6)).filter(DataNImpl_1::lambda$onTick$3).filter(com.target.mod.compat.sub1.sub2.sub7.Initializer::checkClass_2338_2);
            if (this.parseB_8.getBoolean()) {
                if (this.parseB_9.getBoolean()) {
                    stream = stream.filter(this::checkClass_2338_1);
                }
                else {
                    stream = stream.filter(this::checkClass_2338);
                }
            }
            stream.forEachOrdered(DataNImpl_1::lambda$onTick$4);
        }
        final Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            if (this.method_double((class_1657)DataNImpl_1.class310.field_1724, (class_243)iterator.next()) >= DataNImpl_1.class310.field_1724.method_6032() + DataNImpl_1.class310.field_1724.method_6067()) {
                Initializer_10.checkClass_1792(class_1802.field_8288);
                break;
            }
        }
    }
    
    private List<class_1511> getList() {
        final class_243 class_243 = new class_243(DataNImpl_1.class310.field_1724.method_23317(), DataNImpl_1.class310.field_1724.method_23318(), DataNImpl_1.class310.field_1724.method_23321());
        return DataNImpl_1.class310.field_1687.method_8390((Class)class_1511.class, new class_238(class_243.method_1031(-6.0, -6.0, -6.0), class_243.method_1031(6.0, 6.0, 6.0)), (Predicate)DataNImpl_1::lambda$nearbyCrystals$5);
    }
    
    private boolean checkClass_2338(final class_2338 class_2338) {
        return DataNImpl_1.class310.field_1687.method_18456().parallelStream().filter(DataNImpl_1::lambda$arePeopleAimingAtBlock$6).anyMatch(DataNImpl_1::lambda$arePeopleAimingAtBlock$7);
    }
    
    private boolean checkClass_2338_1(final class_2338 class_2338) {
        return DataNImpl_1.class310.field_1687.method_18456().parallelStream().filter(DataNImpl_1::lambda$arePeopleAimingAtBlockAndHoldingCrystals$8).filter(DataNImpl_1::lambda$arePeopleAimingAtBlockAndHoldingCrystals$9).anyMatch(DataNImpl_1::lambda$arePeopleAimingAtBlockAndHoldingCrystals$10);
    }
    
    private double method_double(final class_1657 class_1657, final class_243 class_1658) {
        final double method_1022 = new class_243(class_1657.method_23317(), class_1657.method_23318(), class_1657.method_23321()).method_1022(class_1658);
        if (method_1022 > 12.0) {
            return 0.0;
        }
        return Math.max(0.0, (1.0 - method_1022 / 12.0) * 12.0);
    }
    
    private static boolean lambda$arePeopleAimingAtBlockAndHoldingCrystals$10(final class_2338 class_2338, final class_742 class_2339) {
        final class_243 computeClass_243 = Initializer_22.computeClass_243((class_1297)class_2339);
        final class_3965 method_17742 = DataNImpl_1.class310.field_1687.method_17742(new class_3959(computeClass_243, computeClass_243.method_1019(Initializer_22.computeClass_243_1((class_1297)class_2339).method_1021(4.5)), class_3959$class_3960.field_17558, class_3959$class_242.field_1348, (class_1297)class_2339));
        return method_17742 != null && method_17742.method_17777().equals((Object)class_2338);
    }
    
    private static boolean lambda$arePeopleAimingAtBlockAndHoldingCrystals$9(final class_742 class_742) {
        return class_742.method_24518(class_1802.field_8301);
    }
    
    private static boolean lambda$arePeopleAimingAtBlockAndHoldingCrystals$8(final class_742 class_742) {
        return class_742 != DataNImpl_1.class310.field_1724;
    }
    
    private static boolean lambda$arePeopleAimingAtBlock$7(final class_2338 class_2338, final class_742 class_2339) {
        final class_243 computeClass_243 = Initializer_22.computeClass_243((class_1297)class_2339);
        final class_3965 method_17742 = DataNImpl_1.class310.field_1687.method_17742(new class_3959(computeClass_243, computeClass_243.method_1019(Initializer_22.computeClass_243_1((class_1297)class_2339).method_1021(4.5)), class_3959$class_3960.field_17558, class_3959$class_242.field_1348, (class_1297)class_2339));
        return method_17742 != null && method_17742.method_17777().equals((Object)class_2338);
    }
    
    private static boolean lambda$arePeopleAimingAtBlock$6(final class_742 class_742) {
        return class_742 != DataNImpl_1.class310.field_1724;
    }
    
    private static boolean lambda$nearbyCrystals$5(final class_1511 class_1511) {
        return true;
    }
    
    private static void lambda$onTick$4(final ArrayList list, final class_2338 class_2338) {
        list.add(class_243.method_24955((class_2382)class_2338).method_1031(0.0, 1.0, 0.0));
    }
    
    private static boolean lambda$onTick$3(final class_2338 class_2338) {
        return DataNImpl_1.class310.field_1687.method_8320(class_2338).method_26204() == class_2246.field_10540 || DataNImpl_1.class310.field_1687.method_8320(class_2338).method_26204() == class_2246.field_9987;
    }
    
    private static void lambda$onTick$2(final ArrayList list, final class_1511 class_1511) {
        list.add(new class_243(class_1511.method_23317(), class_1511.method_23318(), class_1511.method_23321()));
    }
    
    private static boolean lambda$onTick$1(final double n, final class_742 class_742) {
        return DataNImpl_1.class310.field_1724.method_5858((class_1297)class_742) <= n;
    }
    
    private static boolean lambda$onTick$0(final class_742 class_742) {
        return class_742 != DataNImpl_1.class310.field_1724;
    }
}
