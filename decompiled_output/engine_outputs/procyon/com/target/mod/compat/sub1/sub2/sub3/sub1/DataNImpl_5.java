// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub3.sub1;

import org.lwjgl.glfw.GLFW;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_11;
import net.minecraft.class_239;
import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_6;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import net.minecraft.class_1802;
import net.minecraft.class_1657;
import net.minecraft.class_3966;
import net.minecraft.class_1743;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_6;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_5 extends Initializer_3 implements PackDImpl_5, PackDImpl_6
{
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private int intValue;
    private int intValue_1;
    private int intValue_2;
    private boolean boolFlag;
    private int intValue_3;
    
    public DataNImpl_5() {
        super("shield_disabler", Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 75, 33, 100, 109, 0, 71, 128, 255, 166, 170, 222, 129, 195, 189, 225, 204, 156, 195, 0, 123, 34, 57, 90, 125, 74, 57, 92, 110, 24, 191, 129, 247, 158, 171, 214, 249, 221 }), "A.ttacks with an axe to disable enemy shields", Initializer.cacheE);
        this.intValue = -1;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.boolFlag = false;
        this.intValue_3 = 0;
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 41, 99, 43, 44, 66, 5, 74, 33, 100, 112, 0, 70, 161, 255, 166, 163, 222, 129, 203, 189, 224, 233, 156, 195, 16 }), 0.0, 20.0, 0.0, 1.0);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 189, 225, 204, 156, 195, 12, 123, 34, 38, 90, 125, 74, 57, 92, 117 }), 0.0, 20.0, 0.0, 1.0);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 189, 225, 202, 156, 195, 8, 123, 34, 41, 90, 125, 64 }), true);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 87, 33, 100, 113, 0, 71, 139 }), false);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 70, 33, 100, 117, 0, 71, 144, 255, 166, 175, 222, 129, 213, 189, 224, 237, 156, 194, 33, 123, 34, 37, 90, 125, 71, 57, 92, 104, 24, 190, 172, 247, 158, 182, 214, 249, 202 }), false);
        this.setSyncaarr(this.buildC, this.buildC_1, this.parseB, this.parseB_1, this.parseB_2);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd(PackDImpl_6.class, this);
        this.intValue_1 = this.buildC.getInt();
        this.intValue_2 = this.buildC_1.getInt();
        this.intValue = -1;
        this.intValue_3 = 0;
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_6.class, this);
        if (DataNImpl_5.class310.field_1724 != null && this.intValue != -1 && this.parseB.getBoolean()) {
            Initializer_10.setInt(this.intValue);
        }
        this.intValue = -1;
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_5.class310.field_1724 != null && DataNImpl_5.class310.field_1687 != null && DataNImpl_5.class310.field_1755 == null && (!this.parseB_2.getBoolean() || DataNImpl_5.class310.field_1724.method_6047().method_7909() instanceof class_1743)) {
            final class_239 field_1765 = DataNImpl_5.class310.field_1765;
            if (field_1765 instanceof final class_3966 class_3966) {
                if (!DataNImpl_5.class310.field_1724.method_6115()) {
                    final class_1297 method_17782 = class_3966.method_17782();
                    if (method_17782 instanceof final class_1657 class_3967) {
                        if (class_3967.method_24518(class_1802.field_8255) && class_3967.method_6039()) {
                            if (this.intValue == -1) {
                                this.intValue = Initializer_8.method_int(DataNImpl_5.class310.field_1724.method_31548());
                            }
                            if (this.intValue_2 > 0) {
                                --this.intValue_2;
                                return;
                            }
                            if (!(DataNImpl_5.class310.field_1724.method_6047().method_7909() instanceof class_1743)) {
                                if (Initializer_10.isEnabled_1()) {
                                    this.intValue_3 = 1;
                                }
                            }
                            else {
                                if (this.intValue_3 > 0) {
                                    --this.intValue_3;
                                    return;
                                }
                                if (this.intValue_1 > 0) {
                                    --this.intValue_1;
                                }
                                else {
                                    Initializer_6.setClass_1297AndBool((class_1297)class_3967, this.boolFlag = true);
                                    if (this.parseB_1.getBoolean()) {
                                        Initializer_6.setClass_1297AndBool((class_1297)class_3967, true);
                                    }
                                    this.boolFlag = false;
                                    this.intValue_1 = this.buildC.getInt();
                                    this.intValue_2 = this.buildC_1.getInt();
                                }
                            }
                        }
                        else if (this.intValue != -1) {
                            if (this.parseB.getBoolean()) {
                                Initializer_10.setInt(this.intValue);
                            }
                            this.intValue = -1;
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void setSlotf(final BindCSub_11 bindCSub_11) {
        if (DataNImpl_5.class310.field_1724 != null && DataNImpl_5.class310.field_1724.method_6047().method_7909() instanceof class_1743) {
            return;
        }
        if (this.boolFlag) {
            return;
        }
        if (DataNImpl_5.class310.method_22683() != null) {
            final class_239 field_1765 = DataNImpl_5.class310.field_1765;
            if (field_1765 instanceof final class_3966 class_1658) {
                final class_1297 method_17782 = class_1658.method_17782();
                if (method_17782 instanceof final class_1657 class_1657) {
                    if (class_1657.method_24518(class_1802.field_8255) && class_1657.method_6039() && GLFW.glfwGetMouseButton(DataNImpl_5.class310.method_22683().method_4490(), 0) != 1) {
                        bindCSub_11.execute_2();
                    }
                }
            }
        }
    }
}
