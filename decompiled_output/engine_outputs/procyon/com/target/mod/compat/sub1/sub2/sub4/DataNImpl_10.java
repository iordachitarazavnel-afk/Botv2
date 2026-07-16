// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_243;
import net.minecraft.class_238;
import org.lwjgl.glfw.GLFW;
import net.minecraft.class_2246;
import net.minecraft.class_1268;
import net.minecraft.class_2350;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import java.util.Optional;
import java.util.LinkedHashSet;
import java.util.function.ToDoubleFunction;
import java.util.Comparator;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_12;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_8;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_10 extends Initializer_3 implements PackDImpl_5, PackDImpl_8
{
    private final SyncASub_5 parseB;
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final com.target.mod.compat.sub1.sub2.sub7.Initializer_1 buffT;
    private class_2338 class2338;
    
    public DataNImpl_10() {
        super("anti_web", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 77, 33, 100, 112, 0, 71, 140, 255, 167, 145, 222, 129, 194, 189, 224, 234 }), Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 255, 166, 171, 222, 129, 198, 189, 224, 252, 156, 195, 0, 123, 34, 41, 90, 125, 74, 57, 92, 96, 24, 191, 129, 247, 158, 183, 25, 171, 242, 216, 138, 205, 233, 105, 44, 25, 72, 15, 60, 39, 110, 85, 6, 73, 108, 42, 250, 157, 188, 217, 252, 201, 184, 223, 239, 151, 62, 29, 185, 75, 18, 59, 42, 109, 73, 9, 76, 115, 232, 175, 136, 199, 142, 176, 166, 233, 219, 74, 154, 61, 18, 121, 28, 35, 88, 127, 88 }), Initializer.cacheE_2);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 74, 33, 100, 104, 0, 71, 128, 255, 166, 168, 222, 129, 211, 114, 178, 212, 193, 145, 52, 27, 112, 23, 33, 47, 118, 87, 14, 81, 99, 237, 176, 145, 204, 147, 182, 171, 242, 212, 138, 205, 232 }), true);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 66, 33, 100, 106, 0, 71, 130, 255, 166, 163 }), 0.0, 6.0, 4.5, 0.1);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 35, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 132, 255, 166, 173, 17, 211, 251, 246, 178, 213, 246, 145, 52, 24, 112, 23, 52, 47, 118, 79 }), 0.0, 100.0, 5.0, 1.0);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 46, 99, 43, 44, 66, 5, 77, 33, 100, 104, 0, 71, 156, 48, 244, 154, 134, 211, 250, 218, 178, 213, 250, 145, 52, 24, 112, 23, 48, 224, 36, 106, 72, 3, 74, 140, 45, 247, 159, 153, 214, 249, 202, 181, 216, 242 }), false);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 79, 33, 100, 109, 0, 71, 134, 255, 166, 173, 222, 129, 206, 189, 224, 230, 156, 195, 14 }), false);
        this.buffT = new com.target.mod.compat.sub1.sub2.sub7.Initializer_1();
        this.setSyncaarr(this.parseB, this.buildC, this.buildC_1, this.parseB_1, this.parseB_2);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd(PackDImpl_8.class, this);
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_8.class, this);
        super.execute_1();
    }
    
    @Override
    public void setWrapl(final BindCSub_12 bindCSub_12) {
        if (DataNImpl_10.class310.field_1724 == null || DataNImpl_10.class310.field_1687 == null) {
            return;
        }
        final LinkedHashSet<class_2338> set = this.getSet();
        if (set.isEmpty()) {
            this.class2338 = null;
        }
        else {
            if (this.isEnabled()) {
                if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.getLinkv() != null) {
                    ClientModInitializerImpl.sortB.getLinkv().setDoubleAndDouble(DataNImpl_10.class310.field_1724.method_36454(), DataNImpl_10.class310.field_1724.method_36455());
                }
                return;
            }
            final Optional<Object> min = (Optional<Object>)set.stream().min(Comparator.comparingDouble((ToDoubleFunction<? super class_2338>)DataNImpl_10::lambda$onRender3D$0));
            if (min.isPresent()) {
                this.class2338 = min.get();
                if (this.parseB.getBoolean() && ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.getLinkv() != null) {
                    final float[] computeFloatarr = this.computeFloatarr(this.class2338.method_46558());
                    if (computeFloatarr != null) {
                        ClientModInitializerImpl.sortB.getLinkv().setDoubleAndDouble(computeFloatarr[0], computeFloatarr[1]);
                    }
                }
            }
            else {
                this.class2338 = null;
            }
        }
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_10.class310.field_1724 == null || DataNImpl_10.class310.field_1687 == null) {
            return;
        }
        if (this.class2338 != null && this.buffT.checkDouble(this.buildC_1.getInt() * 50.0)) {
            int checkClass_1792 = Initializer_8.checkClass_1792(DataNImpl_10.class310.field_1724.method_6047().method_7909()) ? 1 : 0;
            if (checkClass_1792 == 0) {
                for (int i = 0; i < 9; ++i) {
                    if (Initializer_8.checkClass_1792(DataNImpl_10.class310.field_1724.method_31548().method_5438(i).method_7909())) {
                        DataNImpl_10.class310.field_1724.method_31548().field_7545 = i;
                        Initializer_8.execute();
                        checkClass_1792 = 1;
                        break;
                    }
                }
            }
            if (checkClass_1792 != 0) {
                DataNImpl_10.class310.field_1761.method_2910(this.class2338, class_2350.field_11036);
                DataNImpl_10.class310.field_1724.method_6104(class_1268.field_5808);
                this.buffT.execute();
            }
        }
    }
    
    private boolean isEnabled() {
        return (this.parseB_1.getBoolean() && DataNImpl_10.class310.field_1687.method_8320(DataNImpl_10.class310.field_1724.method_24515()).method_26204() != class_2246.field_10343) || (this.parseB_2.getBoolean() && GLFW.glfwGetMouseButton(DataNImpl_10.class310.method_22683().method_4490(), 1) != 1);
    }
    
    private LinkedHashSet<class_2338> getSet() {
        final LinkedHashSet set = new LinkedHashSet();
        final class_238 class_238 = new class_238(DataNImpl_10.class310.field_1724.method_23317() - this.buildC.getDouble(), DataNImpl_10.class310.field_1724.method_23318() - this.buildC.getDouble(), DataNImpl_10.class310.field_1724.method_23321() - this.buildC.getDouble(), DataNImpl_10.class310.field_1724.method_23317() + this.buildC.getDouble(), DataNImpl_10.class310.field_1724.method_23318() + this.buildC.getDouble(), DataNImpl_10.class310.field_1724.method_23321() + this.buildC.getDouble());
        final int n = (int)Math.floor(class_238.field_1323);
        final int n2 = (int)Math.floor(class_238.field_1322);
        final int n3 = (int)Math.floor(class_238.field_1321);
        final int n4 = (int)Math.ceil(class_238.field_1320);
        final int n5 = (int)Math.ceil(class_238.field_1325);
        final int n6 = (int)Math.ceil(class_238.field_1324);
        for (int i = n; i <= n4; ++i) {
            for (int j = n2; j <= n5; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    final class_2338 e = new class_2338(i, j, k);
                    if (DataNImpl_10.class310.field_1687.method_8320(e).method_26204() == class_2246.field_10343) {
                        set.add(e);
                    }
                }
            }
        }
        return set;
    }
    
    private float[] computeFloatarr(final class_243 class_243) {
        final class_243 method_1020 = class_243.method_1020(DataNImpl_10.class310.field_1724.method_33571());
        return new float[] { (float)Math.toDegrees(Math.atan2(method_1020.field_1350, method_1020.field_1352)) - 90.0f, (float)(-Math.toDegrees(Math.atan2(method_1020.field_1351, Math.sqrt(method_1020.field_1352 * method_1020.field_1352 + method_1020.field_1350 * method_1020.field_1350)))) };
    }
    
    private static double lambda$onRender3D$0(final class_2338 class_2338) {
        return DataNImpl_10.class310.field_1724.method_5707(class_2338.method_46558());
    }
}
