// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_2735;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_9;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_10;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class SyncPImpl extends Initializer_3 implements PackDImpl_10
{
    private static SyncPImpl blockCI;
    
    public SyncPImpl() {
        super("no_bounce", Initializer_14.computeString(new int[] { 132, 202, 47, 99, 43, 44, 66, 5, 76, 33, 101, 70, 0, 71, 138, 255, 166, 179, 222, 129, 201, 189, 224, 235, 156, 195, 12 }), "Removes the crystal bounce animation", Initializer.RENDER);
        SyncPImpl.blockCI = this;
    }
    
    public static SyncPImpl getBlockci() {
        return SyncPImpl.blockCI;
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_10.class, this);
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_10.class, this);
        super.execute_1();
    }
    
    @Override
    public void setParsec(final BindCSub_9 bindCSub_9) {
        if (SyncPImpl.class310.field_1724 == null || SyncPImpl.class310.field_1687 == null) {
            return;
        }
        if (bindCSub_9.getClass_2596() instanceof class_2735) {
            bindCSub_9.execute_2();
        }
    }
}
