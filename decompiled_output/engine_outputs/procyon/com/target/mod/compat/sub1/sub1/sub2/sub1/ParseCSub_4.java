// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2.sub1;

import java.util.function.Consumer;
import java.util.ArrayList;
import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub1.sub2.AbstractBuildB;

public class ParseCSub_4 extends AbstractBuildB<BlockEImpl_10>
{
    public final class_1297 class1297;
    
    public ParseCSub_4(final class_1297 class1297) {
        this.class1297 = class1297;
    }
    
    @Override
    public void setArraylist(final ArrayList<BlockEImpl_10> list) {
        list.forEach(this::lambda$fire$0);
    }
    
    @Override
    public Class<BlockEImpl_10> getClass() {
        return BlockEImpl_10.class;
    }
    
    private void lambda$fire$0(final BlockEImpl_10 blockEImpl_10) {
        blockEImpl_10.setNodeb(this);
    }
}
