// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import com.target.mod.compat.sub1.sub2.sub7.Initializer_6;
import net.minecraft.class_1268;
import org.lwjgl.glfw.GLFW;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_4;
import net.minecraft.class_2246;
import net.minecraft.class_3965;
import net.minecraft.class_239$class_240;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_4;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class CheckRImpl_1 extends Initializer_3 implements PackDImpl_4, PackDImpl_5
{
    private final SyncASub_1 buildC;
    private final SyncASub_5 parseB;
    private final SyncASub_1 buildC_1;
    private int intValue;
    private int intValue_1;
    
    public CheckRImpl_1() {
        super("walksy_optimizer", Initializer_14.computeString(new int[] { 132, 202, 54, 99, 43, 44, 66, 5, 66, 33, 100, 104, 0, 71, 142, 255, 166, 181, 222, 129, 222, 114, 178, 212, 220, 145, 52, 4, 112, 23, 33, 47, 118, 95, 14, 81, 122, 237, 176, 145, 204, 147, 163, 171, 242, 223, 138, 205, 233 }), "O.ptimizes tick rates and movement", Initializer.cacheE);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 134, 255, 166, 163, 17, 211, 251, 251, 178, 213, 253, 145, 52, 0, 112, 23, 48, 47, 118, 68, 14, 81, 97, 237, 176, 153, 204, 147, 181 }), 0.0, 20.0, 0.0, 1.0);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 79, 33, 100, 109, 0, 71, 134, 255, 166, 173, 17, 211, 251, 225, 178, 213, 250, 145, 52, 25, 112, 23, 32, 47, 118, 90, 14, 81, 118, 237, 176, 140, 204, 147, 176, 171, 242, 213, 138, 205, 245 }), true);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 79, 33, 100, 109, 0, 71, 134, 255, 166, 173, 17, 211, 251, 246, 178, 213, 246, 145, 52, 24, 112, 23, 52, 47, 118, 79 }), 1.0, 10.0, 1.0, 1.0);
        this.intValue = 0;
        this.intValue_1 = 0;
        this.setSyncaarr(this.buildC, this.parseB, this.buildC_1);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_4.class, this);
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.intValue = 0;
        this.intValue_1 = 0;
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_4.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        super.execute_1();
    }
    
    @Override
    public void setBlocke(final BindCSub bindCSub) {
        if (CheckRImpl_1.class310.field_1724 == null || CheckRImpl_1.class310.field_1765 == null || CheckRImpl_1.class310.field_1755 != null) {
            return;
        }
        if (!CheckRImpl_1.class310.field_1724.method_6047().method_31574(class_1802.field_8301)) {
            return;
        }
        if (CheckRImpl_1.class310.field_1765.method_17783() != class_239$class_240.field_1332) {
            return;
        }
        final class_3965 class_3965 = (class_3965)CheckRImpl_1.class310.field_1765;
        if (!Initializer_4.checkCondition(class_3965.method_17777(), class_2246.field_10540) && !Initializer_4.checkCondition(class_3965.method_17777(), class_2246.field_9987)) {
            return;
        }
        if (this.intValue < this.buildC.getDouble()) {
            return;
        }
        if (this.parseB.getBoolean() && this.intValue_1 < this.buildC_1.getDouble()) {
            return;
        }
        if (!com.target.mod.compat.sub1.sub2.sub7.Initializer.checkClass_2338_1(class_3965.method_17777())) {
            return;
        }
        bindCSub.execute_2();
        this.setClass_3965(class_3965);
    }
    
    @Override
    public void execute_2() {
        if (CheckRImpl_1.class310.field_1724 == null || CheckRImpl_1.class310.field_1765 == null || CheckRImpl_1.class310.field_1755 != null) {
            return;
        }
        if (!CheckRImpl_1.class310.field_1724.method_6047().method_31574(class_1802.field_8301)) {
            return;
        }
        if (GLFW.glfwGetMouseButton(CheckRImpl_1.class310.method_22683().method_4490(), 1) != 1) {
            this.intValue = 0;
            this.intValue_1 = 0;
            return;
        }
        if (this.intValue < this.buildC.getDouble()) {
            ++this.intValue;
            return;
        }
        if (this.parseB.getBoolean() && this.intValue_1 < this.buildC_1.getDouble()) {
            ++this.intValue_1;
            return;
        }
        this.intValue = 0;
        this.intValue_1 = 0;
        if (CheckRImpl_1.class310.field_1765.method_17783() != class_239$class_240.field_1332) {
            return;
        }
        final class_3965 class_3965 = (class_3965)CheckRImpl_1.class310.field_1765;
        if (!Initializer_4.checkCondition(class_3965.method_17777(), class_2246.field_10540) && !Initializer_4.checkCondition(class_3965.method_17777(), class_2246.field_9987)) {
            return;
        }
        if (!com.target.mod.compat.sub1.sub2.sub7.Initializer.checkClass_2338_1(class_3965.method_17777())) {
            return;
        }
        this.setClass_3965(class_3965);
    }
    
    private void setClass_3965(final class_3965 class_3965) {
        if (this.parseB.getBoolean()) {
            CheckRImpl_1.class310.field_1761.method_2896(CheckRImpl_1.class310.field_1724, class_1268.field_5808, class_3965);
            CheckRImpl_1.class310.field_1724.method_6104(class_1268.field_5808);
        }
        else {
            Initializer_6.setClass_3965AndBool(class_3965, true);
        }
    }
}
