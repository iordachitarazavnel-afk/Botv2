// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2;

import java.util.ArrayList;

public abstract class Initializer<T extends PackDImpl>
{
    private static com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] SyncAArray;
    
    public abstract void setArraylist(final ArrayList<T> p0);
    
    public abstract Class<T> getClass();
    
    public static void setSyncaarr(final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] syncAArray) {
        Initializer.SyncAArray = syncAArray;
    }
    
    public static com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] getSyncaarrArray() {
        return Initializer.SyncAArray;
    }
    
    static {
        if (getSyncaarrArray() != null) {
            setSyncaarr(new com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[2]);
        }
    }
}
