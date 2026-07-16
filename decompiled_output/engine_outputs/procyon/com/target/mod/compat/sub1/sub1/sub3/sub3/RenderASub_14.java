// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_3;

public class RenderASub_14 extends AbstractSyncA<Initializer_3>
{
    private final int intValue;
    private final int intValue_1;
    private final int intValue_2;
    private final int intValue_3;
    private final boolean boolFlag;
    
    public RenderASub_14(final String s, final Initializer_3 initializer_3, final int intValue, final int intValue_1, final int intValue_2, final int intValue_3, final boolean boolFlag) {
        super(s, initializer_3);
        final boolean enabled_1 = AbstractSyncA.isEnabled_1();
        this.intValue = intValue;
        this.intValue_1 = intValue_1;
        this.intValue_2 = intValue_2;
        this.intValue_3 = intValue_3;
        this.boolFlag = boolFlag;
        final boolean b = enabled_1;
        final T objValue = this.objValue;
        Label_0102: {
            RenderASub_14 renderASub_14 = null;
            Label_0084: {
                if (!b) {
                    if (objValue == null) {
                        this.objValue = (T)new Initializer_3(initializer_3.intValue, initializer_3.intValue_1);
                    }
                    renderASub_14 = this;
                    if (b) {
                        break Label_0084;
                    }
                    final T objValue_1 = this.objValue_1;
                }
                if (objValue != null) {
                    break Label_0102;
                }
                renderASub_14 = this;
            }
            renderASub_14.objValue_1 = (T)new Initializer_3(initializer_3.intValue, initializer_3.intValue_1);
        }
        if (b) {
            int int1 = Initializer.getInt();
            Initializer.setInt(++int1);
        }
    }
    
    public RenderASub_14(final String s, final Initializer_3 initializer_3, final int n, final int n2) {
        this(s, initializer_3, n, n2, n, n2, false);
    }
    
    public int getInt() {
        return this.intValue;
    }
    
    public int getInt_1() {
        return this.intValue_1;
    }
    
    public int getInt_2() {
        return this.intValue_2;
    }
    
    public int getInt_3() {
        return this.intValue_3;
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public int getInt_4() {
        Initializer_3 initializer_3 = this.getValue();
        if (initializer_3 == null) {
            initializer_3 = (Initializer_3)this.objValue_1;
        }
        return initializer_3.getInt();
    }
    
    public void setBuffw(final Initializer_3 object) {
        final boolean enabled = AbstractSyncA.isEnabled();
        int n2;
        final int n = n2 = object.intValue;
        int n4;
        final int n3 = n4 = this.intValue;
        if (enabled) {
            if (n < n3) {
                return;
            }
            final int intValue_1;
            n2 = (intValue_1 = object.intValue_1);
            final int intValue_2;
            n4 = (intValue_2 = this.intValue_1);
        }
        if (enabled) {
            if (n > n3) {
                return;
            }
            n2 = object.intValue;
            n4 = object.intValue_1;
        }
        if (n2 <= n4) {
            super.setObject(object);
        }
    }
    
    @Override
    public void execute() {
        this.objValue = (T)new Initializer_3(((Initializer_3)this.objValue_1).intValue, ((Initializer_3)this.objValue_1).intValue_1);
    }
}
