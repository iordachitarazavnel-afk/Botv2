// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2.sub1;

import java.util.function.Consumer;
import java.util.ArrayList;
import com.target.mod.compat.sub1.sub1.sub2.AbstractBuildB;

public class ParseCSub_3 extends AbstractBuildB<BlockEImpl_9>
{
    @Override
    public void setArraylist(final ArrayList<BlockEImpl_9> list) {
        list.forEach(this::lambda$fire$0);
    }
    
    @Override
    public Class<BlockEImpl_9> getClass() {
        return BlockEImpl_9.class;
    }
    
    private void lambda$fire$0(final BlockEImpl_9 blockEImpl_9) {
        blockEImpl_9.setGridd(this);
    }
}
