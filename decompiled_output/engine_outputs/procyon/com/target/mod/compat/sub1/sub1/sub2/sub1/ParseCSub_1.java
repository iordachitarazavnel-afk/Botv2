// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2.sub1;

import java.util.function.Consumer;
import java.util.ArrayList;
import net.minecraft.class_2596;
import com.target.mod.compat.sub1.sub1.sub2.AbstractBuildB;

public class ParseCSub_1 extends AbstractBuildB<BlockEImpl_7>
{
    public class_2596<?> class2596;
    
    public ParseCSub_1(final class_2596<?> class2596) {
        this.class2596 = class2596;
    }
    
    @Override
    public void setArraylist(final ArrayList<BlockEImpl_7> list) {
        list.forEach(this::lambda$fire$0);
    }
    
    @Override
    public Class<BlockEImpl_7> getClass() {
        return BlockEImpl_7.class;
    }
    
    private void lambda$fire$0(final BlockEImpl_7 blockEImpl_7) {
        blockEImpl_7.setConfigh(this);
    }
}
