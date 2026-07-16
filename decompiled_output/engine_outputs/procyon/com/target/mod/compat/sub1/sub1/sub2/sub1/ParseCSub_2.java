// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2.sub1;

import java.util.Iterator;
import java.util.ArrayList;
import net.minecraft.class_2596;
import com.target.mod.compat.sub1.sub1.sub2.AbstractBuildB;

public class ParseCSub_2 extends AbstractBuildB<BlockEImpl_3>
{
    public class_2596<?> class2596;
    
    public ParseCSub_2(final class_2596<?> class2596) {
        this.class2596 = class2596;
    }
    
    @Override
    public void setArraylist(final ArrayList<BlockEImpl_3> list) {
        final String string = BuildBSub.getString();
        final Iterator<BlockEImpl_3> iterator = list.iterator();
        final String s = string;
        while (iterator.hasNext()) {
            iterator.next().setEventi(this);
            if (s == null) {
                break;
            }
        }
    }
    
    @Override
    public Class<BlockEImpl_3> getClass() {
        return BlockEImpl_3.class;
    }
}
