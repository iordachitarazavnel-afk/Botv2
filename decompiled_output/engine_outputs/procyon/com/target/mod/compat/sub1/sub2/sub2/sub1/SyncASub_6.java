// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub2.sub1;

import java.awt.Color;

public class SyncASub_6 extends Initializer
{
    private Color color;
    
    public SyncASub_6(final String s, final Color color) {
        super(s);
        this.color = color;
    }
    
    public Color getColor() {
        return this.color;
    }
    
    @Override
    public void setObject(final Object o) {
        final String string = SyncASub_1.getString();
        final boolean b = o instanceof Color;
        Object o2 = null;
        Label_0041: {
            if (string == null) {
                if (b) {
                    this.color = (Color)o;
                    if (string == null) {
                        return;
                    }
                }
                o2 = o;
                if (string != null) {
                    break Label_0041;
                }
                final boolean b2 = o instanceof Integer;
            }
            if (!b) {
                return;
            }
            o2 = o;
        }
        this.color = new Color((int)o2, true);
    }
}
