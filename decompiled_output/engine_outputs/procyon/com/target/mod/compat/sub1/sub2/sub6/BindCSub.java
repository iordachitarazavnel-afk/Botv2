// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub6;

import com.target.mod.compat.sub1.sub2.sub3.Initializer_1;
import com.target.mod.compat.sub1.sub2.sub3.Initializer;

public class BindCSub extends Initializer<PackDImpl_4>
{
    private static int[] intArr;
    
    @Override
    public Class<PackDImpl_4> getClass() {
        return PackDImpl_4.class;
    }
    
    public void setCheckr(final PackDImpl_4 packDImpl_4) {
        packDImpl_4.setBlocke(this);
    }
    
    public static void setIntarr(final int[] intArr) {
        BindCSub.intArr = intArr;
    }
    
    public static int[] getIntarrArray() {
        return BindCSub.intArr;
    }
    
    static {
        if (getIntarrArray() == null) {
            setIntarr(new int[2]);
        }
    }
}
