// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub3;

import java.util.Collection;
import net.minecraft.class_1657;
import java.util.HashSet;
import java.util.Set;

public class Initializer_2
{
    private final Set<String> set;
    
    public Initializer_2() {
        final int[] intarrArray = Initializer.getIntarrArray();
        final int[] array = intarrArray;
        this.set = new HashSet<String>();
        if (array != null) {
            int int_1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1();
            com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int_1);
        }
    }
    
    public void setString(final String s) {
        this.set.add(s.toLowerCase());
    }
    
    public void setString_1(final String s) {
        Initializer.getIntarrArray();
        this.set.remove(s.toLowerCase());
        if (com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1() != 0) {
            Initializer.setIntarr(new int[3]);
        }
    }
    
    public boolean checkString(final String s) {
        return this.set.contains(s.toLowerCase());
    }
    
    public boolean checkClass_1657(final class_1657 class_1657) {
        return this.checkString(class_1657.method_5477().getString());
    }
    
    public Set<String> getSet() {
        return new HashSet<String>(this.set);
    }
    
    public void execute() {
        this.set.clear();
    }
}
