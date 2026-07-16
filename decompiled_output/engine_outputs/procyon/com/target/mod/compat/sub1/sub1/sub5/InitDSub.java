// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5;

import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_7;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_3;

class InitDSub extends SyncASub_3
{
    private boolean boolFlag;
    final RenderASub_7 gridH;
    
    InitDSub(final AbstractLoadF abstractLoadF, final String s, final int n, final boolean b, final RenderASub_7 gridH) {
        this.gridH = gridH;
        super(s, n, b);
        this.boolFlag = false;
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
                        this.gridH.setInt(((Number)object).intValue());
                    }
                }
            }
            finally {
                this.boolFlag = false;
            }
        }
    }
    
    @Override
    public void setInt(final int n) {
        Label_0035: {
            if (AbstractLoadF.getInt() == 0) {
                break Label_0035;
            }
            if (this.boolFlag) {
                return;
            }
            this.boolFlag = true;
            try {
                super.setInt(n);
                this.gridH.setInt(n);
            }
            finally {
                this.boolFlag = false;
            }
        }
    }
}
