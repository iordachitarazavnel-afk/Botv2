// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2.sub1;

import java.util.function.Consumer;
import java.util.ArrayList;
import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;
import com.target.mod.compat.sub1.sub1.sub2.AbstractBuildB;

public class ParseCSub_8 extends AbstractBuildB<BlockEImpl_6>
{
    public int intValue;
    public int intValue_1;
    public long longValue;
    
    public ParseCSub_8(final int intValue, final int intValue_1, final long longValue) {
        final String string = BuildBSub.getString();
        this.intValue = intValue;
        this.intValue_1 = intValue_1;
        final String s = string;
        this.longValue = longValue;
        if (s == null) {
            int int1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt();
            com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int1);
        }
    }
    
    @Override
    public void setArraylist(final ArrayList<BlockEImpl_6> list) {
        list.forEach(this::lambda$fire$0);
    }
    
    @Override
    public Class<BlockEImpl_6> getClass() {
        return BlockEImpl_6.class;
    }
    
    private void lambda$fire$0(final BlockEImpl_6 blockEImpl_6) {
        blockEImpl_6.setWrape(this);
    }
}
