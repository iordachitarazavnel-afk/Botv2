// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2.sub1;

import java.util.function.Consumer;
import java.util.ArrayList;
import net.minecraft.class_437;
import com.target.mod.compat.sub1.sub1.sub2.AbstractBuildB;

public class ParseCSub_7 extends AbstractBuildB<BlockEImpl_8>
{
    public class_437 class437;
    
    public ParseCSub_7(final class_437 class437) {
        this.class437 = class437;
    }
    
    @Override
    public void setArraylist(final ArrayList<BlockEImpl_8> list) {
        list.forEach(this::lambda$fire$0);
    }
    
    @Override
    public Class<BlockEImpl_8> getClass() {
        return BlockEImpl_8.class;
    }
    
    private void lambda$fire$0(final BlockEImpl_8 blockEImpl_8) {
        blockEImpl_8.setUtilg(this);
    }
}
