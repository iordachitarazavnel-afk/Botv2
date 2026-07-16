// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5;

import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;

class BuildCSub extends SyncASub_1
{
    private boolean boolFlag;
    final RenderASub bindK;
    
    BuildCSub(final AbstractLoadF abstractLoadF, final String s, final double n, final double n2, final double n3, final double n4, final RenderASub bindK) {
        this.bindK = bindK;
        final int int1 = AbstractLoadF.getInt();
        super(s, n, n2, n3, n4);
        int n5 = int1;
        this.boolFlag = false;
        if (Initializer.getInt_1() != 0) {
            AbstractLoadF.setInt(++n5);
        }
    }
    
    @Override
    public void setObject(final Object object) {
        final int int1 = AbstractLoadF.getInt();
        final boolean boolFlag = this.boolFlag;
        Label_0034: {
            if (int1 == 0) {
                break Label_0034;
            }
            if (boolFlag) {
                return;
            }
            this.boolFlag = true;
            try {
                super.setObject(object);
                if (int1 != 0) {
                    final boolean b = object instanceof Number;
                    if (boolFlag) {
                        this.bindK.setDouble(((Number)object).doubleValue());
                    }
                }
            }
            finally {
                this.boolFlag = false;
            }
        }
    }
}
