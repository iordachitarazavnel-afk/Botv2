// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_2596;
import net.minecraft.class_2743;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_9;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_10;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class SyncPImpl_1 extends Initializer_3 implements PackDImpl_10, PackDImpl_5
{
    private final SyncASub_1 buildC;
    private int intValue;
    private long longValue;
    private int intValue_1;
    
    public SyncPImpl_1() {
        super("auto_jump_reset", "Jump Reset", "Jumps when you take damage to reduce knockback.", Initializer.cacheE_2);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 43, 99, 43, 44, 66, 5, 86, 33, 100, 105, 0, 71, 149, 48, 244, 154, 134, 211, 250, 219, 178, 213, 253, 145, 52, 16, 112, 23, 58, 47, 118, 65 }), 1.0, 10.0, 4.0, 1.0);
        this.intValue = -1;
        this.longValue = 0L;
        this.intValue_1 = 0;
        this.setSyncaarr(this.buildC);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_10.class, this);
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.intValue = -1;
        this.intValue_1 = 0;
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_10.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        this.intValue = -1;
        this.intValue_1 = 0;
        super.execute_1();
    }
    
    @Override
    public void setParsec(final BindCSub_9 bindCSub_9) {
        if (SyncPImpl_1.class310.field_1724 == null || SyncPImpl_1.class310.field_1687 == null) {
            return;
        }
        final class_2596<?> class_2596 = bindCSub_9.getClass_2596();
        if (class_2596 instanceof class_2743 && ((class_2743)class_2596).method_11818() == SyncPImpl_1.class310.field_1724.method_5628()) {
            if (1.0 < 0.05) {
                return;
            }
            if (SyncPImpl_1.class310.field_1724.method_24828()) {
                this.intValue = 1;
                this.intValue_1 = 0;
            }
            else {
                this.intValue = this.buildC.getInt();
                this.intValue_1 = 0;
            }
        }
    }
    
    @Override
    public void execute_2() {
        if (SyncPImpl_1.class310.field_1724 == null || SyncPImpl_1.class310.field_1687 == null) {
            return;
        }
        if (SyncPImpl_1.class310.field_1724.method_24828()) {
            ++this.intValue_1;
        }
        else {
            this.intValue_1 = 0;
        }
        if (this.intValue > 0) {
            if (SyncPImpl_1.class310.field_1724.method_24828()) {
                if (this.intValue_1 >= 1) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.longValue > 400L) {
                        SyncPImpl_1.class310.field_1724.method_6043();
                        this.longValue = currentTimeMillis;
                    }
                    this.intValue = -1;
                }
            }
            else {
                --this.intValue;
                if (this.intValue <= 0) {
                    this.intValue = -1;
                }
            }
        }
    }
}
