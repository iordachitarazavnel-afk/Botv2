// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2.sub1;

import java.util.function.Consumer;
import java.util.ArrayList;
import com.target.mod.compat.sub1.sub1.sub2.AbstractBuildB;

public class ParseCSub_5 extends AbstractBuildB<BlockEImpl>
{
    public double doubleValue;
    public double doubleValue_1;
    
    public ParseCSub_5(final double doubleValue, final double doubleValue_1) {
        this.doubleValue = doubleValue;
        this.doubleValue_1 = doubleValue_1;
    }
    
    @Override
    public void setArraylist(final ArrayList<BlockEImpl> list) {
        list.forEach(this::lambda$fire$0);
    }
    
    @Override
    public Class<BlockEImpl> getClass() {
        return BlockEImpl.class;
    }
    
    private void lambda$fire$0(final BlockEImpl blockEImpl) {
        blockEImpl.setPackf(this);
    }
}
