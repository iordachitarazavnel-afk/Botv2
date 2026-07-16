// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import java.util.concurrent.Executors;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import com.target.mod.compat.sub1.sub3.sub3.Manager;
import com.target.mod.compat.sub1.sub3.sub3.Interface_1;
import java.util.concurrent.ExecutorService;

public final class Initializer_14
{
    private static final ExecutorService executorService;
    
    public static void setInt(final int n) {
        setIntAndInt(n, 35);
    }
    
    public static void setIntAndInt(final int n, final int n2) {
        Initializer_14.executorService.submit(Initializer_14::lambda$mouseClick$0);
    }
    
    public static void setInt_1(final int n) {
        final Interface_1 interface_1 = (Interface_1)((Manager)Initializer_1.class310).getMouse();
    }
    
    public static void setInt_2(final int n) {
        final Interface_1 interface_1 = (Interface_1)((Manager)Initializer_1.class310).getMouse();
    }
    
    private static void lambda$mouseClick$0(final int n, final int n2) {
        try {
            setInt_1(n);
            Thread.sleep(n2);
            setInt_2(n);
        }
        catch (final InterruptedException ex) {}
    }
    
    static {
        executorService = Executors.newFixedThreadPool(2);
    }
}
