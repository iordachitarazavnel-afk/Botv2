// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5;

import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;

class ParseBSub extends SyncASub_5
{
    private boolean boolFlag;
    final RenderASub_1 buffC;
    
    ParseBSub(final AbstractLoadF abstractLoadF, final String s, final boolean b, final RenderASub_1 buffC) {
        this.buffC = buffC;
        super(s, b);
        this.boolFlag = false;
    }
    
    @Override
    public void setObject(final Object object) {
        final int int_1 = AbstractLoadF.getInt_1();
        final boolean boolFlag = this.boolFlag;
        Label_0034: {
            if (int_1 != 0) {
                break Label_0034;
            }
            if (boolFlag) {
                return;
            }
            this.boolFlag = true;
            try {
                super.setObject(object);
                if (int_1 == 0) {
                    final boolean b = object instanceof Boolean;
                    if (boolFlag) {
                        this.buffC.setObject(object);
                    }
                }
            }
            finally {
                this.boolFlag = false;
            }
        }
    }
    
    @Override
    public void execute() {
        Label_0037: {
            if (AbstractLoadF.getInt_1() != 0) {
                break Label_0037;
            }
            if (this.boolFlag) {
                return;
            }
            this.boolFlag = true;
            try {
                super.execute();
                this.buffC.setObject(this.getBoolean());
            }
            finally {
                this.boolFlag = false;
            }
        }
    }
}
