// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2.sub1;

import java.util.ArrayList;
import com.target.mod.compat.sub1.sub1.sub2.Initializer;

public class BuildBSub_2 extends Initializer<BlockEImpl_5>
{
    @Override
    public void setArraylist(final ArrayList<BlockEImpl_5> list) {
        list.forEach(BlockEImpl_5::execute);
    }
    
    @Override
    public Class<BlockEImpl_5> getClass() {
        return BlockEImpl_5.class;
    }
}
