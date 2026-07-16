// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1;

import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import net.fabricmc.api.ClientModInitializer;

public class ClientModInitializerImpl implements ClientModInitializer
{
    private static int[] intArr;
    
    public void onInitializeClient() {
        new com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl().onInitializeClient();
        final int[] intarrArray = getIntarrArray();
        Initializer_1.getConfiga();
        if (intarrArray == null) {
            int int_1 = Initializer.getInt_1();
            Initializer.setInt(++int_1);
        }
    }
    
    public static void setIntarr(final int[] intArr) {
        ClientModInitializerImpl.intArr = intArr;
    }
    
    public static int[] getIntarrArray() {
        return ClientModInitializerImpl.intArr;
    }
    
    static {
        if (getIntarrArray() == null) {
            setIntarr(new int[1]);
        }
    }
}
