// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub2.sub1;

public class SyncASub_4 extends Initializer
{
    private String strValue;
    
    public SyncASub_4(final String s, final String strValue) {
        super(s);
        this.strValue = strValue;
    }
    
    @Override
    public String getString() {
        return this.strValue;
    }
    
    @Override
    public void setObject(final Object o) {
        final String string = SyncASub_1.getString();
        Object o2 = o;
        if (string == null) {
            if (!(o instanceof String)) {
                return;
            }
            o2 = o;
        }
        this.strValue = (String)o2;
    }
}
