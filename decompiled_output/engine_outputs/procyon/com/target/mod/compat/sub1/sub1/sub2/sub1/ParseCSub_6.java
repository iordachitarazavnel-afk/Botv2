// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2.sub1;

import java.util.function.Consumer;
import java.util.ArrayList;
import com.target.mod.compat.sub1.sub1.sub2.AbstractBuildB;

public class ParseCSub_6 extends AbstractBuildB<BlockEImpl_4>
{
    @Override
    public void setArraylist(final ArrayList<BlockEImpl_4> list) {
        list.forEach(this::lambda$fire$0);
    }
    
    @Override
    public Class<BlockEImpl_4> getClass() {
        return BlockEImpl_4.class;
    }
    
    private void lambda$fire$0(final BlockEImpl_4 blockEImpl_4) {
        blockEImpl_4.setSlota(this);
    }
}
