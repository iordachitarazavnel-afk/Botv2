// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_10932;
import net.minecraft.class_1657;
import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_1 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_5 parseB;
    private final SyncASub_1 buildC;
    private final SyncASub_5 parseB_1;
    
    public DataNImpl_1() {
        super(Initializer_14.computeString(new int[] { 3, 31, 245, 238, 248, 218, 200, 203 }), Initializer_14.computeString(new int[] { 35, 31, 245, 238, 248, 218, 200, 203 }), Initializer_14.computeString(new int[] { 46, 14, 241, 237, 249, 198, 222, 152, 166, 160, 173, 141, 155, 131, 37, 120, 114, 82, 83, 83, 63, 55, 46, 72, 7, 17, 169, 249, 254, 193, 208, 224, 191, 190, 132, 129, 215, 103, 108, 107, 74, 75, 75, 100, 59, 53, 69, 24, 18, 242, 191 }), Initializer.cacheE_2);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 59, 88, 237, 237, 238, 199, 223, 203, 227, 129, 183, 136, 150 }), true);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 46, 88, 249, 252, 246, 204, 201, 152, 130, 163, 182, 145, 129, 142 }), 0.0, 1.0, 0.1, 0.05);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 57, 88, 228, 226, 243, 199, 223, 152, 133, 175, 178, 129, 207, 178, 108, 100, 121, 73, 73, 89, 52 }), true);
        this.setSyncaarr(this.parseB, this.buildC, this.parseB_1);
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
    }
    
    public float method_float(final class_1297 class_1297) {
        if (!this.boolFlag_1) {
            return 0.0f;
        }
        if (this.parseB.getBoolean() && !(class_1297 instanceof class_1657)) {
            return 0.0f;
        }
        if (class_1297 == DataNImpl_1.class310.field_1724) {
            return 0.0f;
        }
        return this.buildC.getFloat();
    }
    
    @Override
    public boolean isEnabled() {
        return this.boolFlag_1 && this.parseB_1.getBoolean();
    }
    
    public static class_10932 createClass_10932(final class_10932 class_10932, final float n) {
        return class_10932;
    }
}
