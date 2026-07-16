// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2.sub1;

import java.util.function.Consumer;
import java.util.ArrayList;
import com.target.mod.compat.sub1.sub1.sub2.AbstractBuildB;

public class ParseCSub extends AbstractBuildB<BlockEImpl_11>
{
    @Override
    public void setArraylist(final ArrayList<BlockEImpl_11> list) {
        list.forEach(this::lambda$fire$0);
    }
    
    @Override
    public Class<BlockEImpl_11> getClass() {
        return BlockEImpl_11.class;
    }
    
    private void lambda$fire$0(final BlockEImpl_11 blockEImpl_11) {
        blockEImpl_11.setCalcc(this);
    }
}
