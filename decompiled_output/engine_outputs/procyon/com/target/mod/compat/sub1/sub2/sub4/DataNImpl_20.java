// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_1657;
import com.target.mod.compat.sub1.sub2.sub7.RecordSub;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_17;
import net.minecraft.class_3532;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BuildBSub;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_22;
import java.util.function.ToDoubleFunction;
import java.util.Comparator;
import java.util.function.Predicate;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import net.minecraft.class_1799;
import net.minecraft.class_7923;
import net.minecraft.class_1309;
import net.minecraft.class_3966;
import net.minecraft.class_239$class_240;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_11;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import net.minecraft.class_243;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_1;
import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_2;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_3;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_6;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BlockEImpl_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_20 extends Initializer_3 implements PackDImpl_5, BlockEImpl_1, PackDImpl_6
{
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private final SyncASub_3 initD;
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_1 buildC_2;
    private final SyncASub_1 buildC_3;
    private final SyncASub_1 buildC_4;
    private final SyncASub_5 parseB_4;
    private final SyncASub_2 checkE;
    private final SyncASub_2 checkE_1;
    private class_1297 class1297;
    private class_1297 class1297_1;
    private boolean boolFlag;
    private final com.target.mod.compat.sub1.sub2.sub7.Initializer_1 buffT;
    private long longValue;
    private class_243 class243;
    
    public DataNImpl_20() {
        super("aim_assist", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 74, 33, 100, 105, 207, 21, 185, 177, 244, 155, 162, 211, 250, 193, 178, 213, 250, 145, 52, 7, 112, 23, 33 }), "A.ssists your aim towards targets smoothly", Initializer.cacheE_2);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 156, 255, 166, 163, 222, 129, 213, 189, 224, 251, 83, 145, 53, 59, 112, 23, 59, 47, 118, 90, 14, 81, 110 }), true);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 70, 33, 100, 117, 0, 71, 144, 255, 166, 175, 222, 129, 213, 189, 224, 237, 83, 145, 53, 55, 112, 23, 57, 47, 118, 95, 14, 81, 116, 237, 176, 147 }), true);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 55, 99, 43, 44, 66, 5, 74, 33, 100, 119, 0, 71, 140, 255, 166, 164, 222, 129, 206, 189, 224, 228, 156, 195, 0, 123, 34, 62, 90, 125, 82, 246, 14, 80, 84, 237, 176, 144, 204, 147, 188, 171, 242, 217, 138, 205, 240 }), true);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 53, 99, 43, 44, 66, 5, 66, 33, 100, 118, 0, 71, 130, 255, 166, 163, 222, 129, 211, 114, 178, 212, 223, 145, 52, 27, 112, 23, 54, 47, 118, 93 }), false);
        this.initD = new SyncASub_3("Switch Target Key", -1, false);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 66, 33, 100, 106, 0, 71, 130, 255, 166, 163 }), 1.0, 20.0, 6.0, 0.5);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 39, 99, 43, 44, 66, 4, 108, 33, 101, 82 }), 1.0, 360.0, 90.0, 1.0);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 83, 33, 100, 97, 0, 71, 128, 255, 166, 162 }), 1.0, 100.0, 50.0, 1.0);
        this.buildC_3 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 74, 33, 100, 106, 207, 21, 185, 163, 244, 155, 161, 211, 250, 215, 178, 213, 246, 145, 52, 16 }), 0.0, 100.0, 20.0, 1.0);
        this.buildC_4 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 66, 33, 100, 124, 207, 21, 185, 163, 244, 155, 161, 211, 250, 215, 178, 213, 246, 145, 52, 16 }), 0.0, 100.0, 80.0, 1.0);
        this.parseB_4 = new SyncASub_5("R.andomize", true);
        this.checkE = new SyncASub_2("Target Bone", "Smart", new String[] { "Head", "Chest", "Legs", "Smart" });
        this.checkE_1 = new SyncASub_2("Weapon Only", "None", new String[] { "None", "Sword", "Axe", "Both" });
        this.boolFlag = false;
        this.buffT = new com.target.mod.compat.sub1.sub2.sub7.Initializer_1();
        this.longValue = 0L;
        this.class243 = null;
        this.setSyncaarr(this.parseB, this.parseB_1, this.parseB_2, this.parseB_3, this.initD, this.buildC, this.buildC_1, this.buildC_2, this.buildC_3, this.buildC_4, this.parseB_4, this.checkE, this.checkE_1);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd(PackDImpl_6.class, this);
        com.target.mod.compat.sub1.sub1.sub1.Initializer_1.getInitd().setClassAndBlocke(BlockEImpl_1.class, this);
        this.longValue = System.nanoTime();
        this.class1297 = null;
        this.class1297_1 = null;
        this.boolFlag = false;
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_6.class, this);
        com.target.mod.compat.sub1.sub1.sub1.Initializer_1.getInitd().setClassAndBlocke_1(BlockEImpl_1.class, this);
        this.class1297 = null;
        this.class1297_1 = null;
        super.execute_1();
    }
    
    @Override
    public void setSlotf(final BindCSub_11 bindCSub_11) {
        if (!this.parseB_3.getBoolean()) {
            return;
        }
        if (DataNImpl_20.class310.field_1724 == null || DataNImpl_20.class310.field_1687 == null) {
            return;
        }
        if (DataNImpl_20.class310.field_1765 == null || DataNImpl_20.class310.field_1765.method_17783() != class_239$class_240.field_1331) {
            return;
        }
        final class_1297 method_17782 = ((class_3966)DataNImpl_20.class310.field_1765).method_17782();
        if (method_17782 != null && method_17782 instanceof class_1309 && method_17782 != DataNImpl_20.class310.field_1724) {
            this.class1297_1 = method_17782;
            this.class1297 = method_17782;
            this.class243 = null;
        }
    }
    
    private boolean isEnabled() {
        if (DataNImpl_20.class310.field_1724 == null) {
            return false;
        }
        final String string = this.checkE_1.getString();
        if ("None".equals(string)) {
            return true;
        }
        final class_1799 method_6047 = DataNImpl_20.class310.field_1724.method_6047();
        if (method_6047.method_7960()) {
            return false;
        }
        final String method_6048 = class_7923.field_41178.method_10221((Object)method_6047.method_7909()).method_12832();
        final boolean contains = method_6048.contains("sword");
        final boolean b = method_6048.contains("_axe") || method_6048.equals("axe");
        final String s = string;
        return switch (s) {
            case "Sword" -> contains;
            case "Axe" -> b;
            case "Both" -> contains || b;
            default -> true;
        };
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_20.class310.field_1724 == null || DataNImpl_20.class310.field_1687 == null) {
            return;
        }
        if (DataNImpl_20.class310.field_1755 != null) {
            return;
        }
        if (!this.isEnabled()) {
            this.class1297 = null;
            return;
        }
        if (this.parseB_1.getBoolean() && !Initializer_9.checkInt(0)) {
            this.class1297 = null;
            return;
        }
        if (this.parseB_3.getBoolean() && this.initD.getInt() != -1) {
            final boolean checkInt = Initializer_9.checkInt(this.initD.getInt());
            if (checkInt && !this.boolFlag) {
                this.class1297_1 = null;
                this.class243 = null;
            }
            this.boolFlag = checkInt;
        }
        if (this.parseB_3.getBoolean()) {
            if (this.class1297_1 != null && (this.class1297_1.method_31481() || !this.class1297_1.method_5805() || DataNImpl_20.class310.field_1724.method_5858(this.class1297_1) > this.buildC.getDouble() * this.buildC.getDouble() || (this.parseB_2.getBoolean() && !DataNImpl_20.class310.field_1724.method_6057(this.class1297_1)))) {
                this.class1297_1 = null;
                this.class243 = null;
            }
            if (this.class1297_1 != null) {
                this.class1297 = this.class1297_1;
            }
            else {
                final class_1297 class1297 = this.class1297;
                this.class1297 = this.getClass_1297();
                if (this.class1297 != class1297) {
                    this.class243 = null;
                }
            }
        }
        else {
            final class_1297 class1298 = this.class1297;
            this.class1297 = this.getClass_1297();
            if (this.class1297 != class1298) {
                this.class243 = null;
            }
        }
    }
    
    private class_1297 getClass_1297() {
        return (class_1297)DataNImpl_20.class310.field_1687.method_8390((Class)class_1309.class, DataNImpl_20.class310.field_1724.method_5829().method_1014((double)this.buildC.getDouble()), (Predicate)this::lambda$findTarget$0).stream().min(Comparator.comparingDouble((ToDoubleFunction<? super T>)DataNImpl_20::lambda$findTarget$1)).orElse(null);
    }
    
    private boolean checkClass_1297(final class_1297 class_1297) {
        class_1297.method_33571().method_1020(DataNImpl_20.class310.field_1724.method_33571());
        return Initializer_22.method_double(Initializer_22.createCalcx((class_1297)DataNImpl_20.class310.field_1724, class_1297.method_33571())) <= this.buildC_1.getDouble() / 2.0;
    }
    
    @Override
    public void setCorej(final BuildBSub buildBSub) {
        final long nanoTime = System.nanoTime();
        final float float1 = (nanoTime - this.longValue) / 1.0E9f;
        this.longValue = nanoTime;
        if (DataNImpl_20.class310.field_1724 == null || DataNImpl_20.class310.field_1687 == null || DataNImpl_20.class310.field_1755 != null) {
            return;
        }
        if (this.class1297 == null) {
            return;
        }
        if (!this.isEnabled()) {
            return;
        }
        if (this.parseB_1.getBoolean() && !Initializer_9.checkInt(0)) {
            return;
        }
        this.setFloat(float1);
    }
    
    private void setFloat(final float n) {
        if (this.class1297 == null) {
            this.class243 = null;
            return;
        }
        final String string = this.checkE.getString();
        class_243 class243 = null;
        switch (string) {
            case "Head": {
                class243 = this.class1297.method_33571();
                break;
            }
            case "Chest": {
                class243 = new class_243(this.class1297.method_23317(), this.class1297.method_23318(), this.class1297.method_23321()).method_1031(0.0, this.class1297.method_17682() * 0.6, 0.0);
                break;
            }
            case "Legs": {
                class243 = new class_243(this.class1297.method_23317(), this.class1297.method_23318(), this.class1297.method_23321()).method_1031(0.0, this.class1297.method_17682() * 0.2, 0.0);
                break;
            }
            default: {
                class243 = ((DataNImpl_20.class310.field_1724.method_33571().field_1351 > this.class1297.method_33571().field_1351) ? new class_243(this.class1297.method_23317(), this.class1297.method_23318(), this.class1297.method_23321()).method_1031(0.0, this.class1297.method_17682() * 0.2, 0.0) : this.class1297.method_33571());
                break;
            }
        }
        if (this.class243 == null) {
            this.class243 = class243;
        }
        else {
            this.class243 = this.class243.method_35590(class243, (double)class_3532.method_15363(n * 12.0f, 0.0f, 1.0f));
        }
        final RecordSub calcx = Initializer_22.createCalcx((class_1297)DataNImpl_20.class310.field_1724, this.class243);
        final float method_15363 = class_3532.method_15363((float)((this.parseB_4.getBoolean() ? Initializer_17.method_double(this.buildC_3.getDouble(), this.buildC_4.getDouble()) : this.buildC_2.getDouble()) * n / 5.0), 0.001f, 1.0f);
        final float method_15364 = DataNImpl_20.class310.field_1724.method_36454();
        final float method_15365 = DataNImpl_20.class310.field_1724.method_36455();
        final float n3 = (float)calcx.getDouble();
        final float n4 = (float)calcx.getDouble_1();
        final float method_15366 = class_3532.method_15393(n3 - method_15364);
        final float n5 = n4 - method_15365;
        final float n6 = method_15364 + method_15366 * method_15363;
        final float n7 = method_15365 + n5 * method_15363;
        DataNImpl_20.class310.field_1724.method_36456(n6);
        DataNImpl_20.class310.field_1724.method_36457(class_3532.method_15363(n7, -90.0f, 90.0f));
    }
    
    private static double lambda$findTarget$1(final class_1309 class_1309) {
        return DataNImpl_20.class310.field_1724.method_5858((class_1297)class_1309);
    }
    
    private boolean lambda$findTarget$0(final class_1309 class_1309) {
        if (class_1309 == DataNImpl_20.class310.field_1724) {
            return false;
        }
        if (class_1309.method_31481() || !class_1309.method_5805()) {
            return false;
        }
        if (this.parseB.getBoolean() && !(class_1309 instanceof class_1657)) {
            return false;
        }
        if (class_1309 instanceof final class_1657 class_1310) {
            if (class_1310.method_68878() || class_1310.method_7325()) {
                return false;
            }
        }
        return (!this.parseB_2.getBoolean() || DataNImpl_20.class310.field_1724.method_6057((class_1297)class_1309)) && this.checkClass_1297((class_1297)class_1309);
    }
}
