// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2.sub1;

import java.util.ArrayList;
import com.target.mod.compat.sub1.sub1.sub2.Initializer;

public class BuildBSub_1 extends Initializer<BlockEImpl_2>
{
    @Override
    public void setArraylist(final ArrayList<BlockEImpl_2> list) {
        list.forEach(BlockEImpl_2::execute);
    }
    
    @Override
    public Class<BlockEImpl_2> getClass() {
        return BlockEImpl_2.class;
    }
}
