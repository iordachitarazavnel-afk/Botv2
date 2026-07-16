// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5;

import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_4;

class ItemGSub extends SyncASub_4
{
    private boolean boolFlag;
    final RenderASub_6 eventQ;
    
    ItemGSub(final AbstractLoadF abstractLoadF, final String s, final String s2, final RenderASub_6 eventQ) {
        this.eventQ = eventQ;
        super(s, s2);
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
                    final boolean b = object instanceof String;
                    if (boolFlag) {
                        this.eventQ.setObject(object);
                    }
                }
            }
            finally {
                this.boolFlag = false;
            }
        }
    }
}
