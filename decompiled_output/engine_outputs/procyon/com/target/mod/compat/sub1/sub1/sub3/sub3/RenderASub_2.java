// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

import java.util.HashSet;
import net.minecraft.class_2248;
import java.util.Set;

public class RenderASub_2 extends AbstractSyncA<Set<class_2248>>
{
    public RenderASub_2(final String s, final Set<class_2248> set) {
        super(s, (HashSet<class_2248>)((set != null) ? set : new HashSet<class_2248>()));
    }
    
    public Set<class_2248> getSet() {
        return this.getValue();
    }
    
    public void setClass_2248(final class_2248 class_2248) {
        this.getValue().add(class_2248);
    }
    
    public void setClass_2248_1(final class_2248 class_2248) {
        ((AbstractSyncA<Set>)this).getValue().remove(class_2248);
    }
    
    public boolean checkClass_2248(final class_2248 class_2248) {
        return ((AbstractSyncA<Set>)this).getValue().contains(class_2248);
    }
}
