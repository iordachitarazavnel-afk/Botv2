// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import java.util.concurrent.Executors;
import java.util.function.Predicate;
import net.minecraft.class_11910;
import com.target.mod.compat.sub1.sub3.sub1.Interface;
import com.target.mod.compat.sub1.sub3.sub1.Interface_1;
import java.util.concurrent.ExecutorService;
import java.util.HashMap;
import net.minecraft.class_310;

public class Initializer_20
{
    private static final class_310 class310;
    public static HashMap<Integer, Boolean> hashMap;
    public static ExecutorService executorService;
    
    public static Interface_1 getPoolc() {
        return (Interface_1)((Interface)Initializer_20.class310).getMouse();
    }
    
    public static boolean checkInt(final int i) {
        final int int_1 = Initializer_14.getInt_1();
        final Boolean b = Initializer_20.hashMap.get(i);
        final int n = int_1;
        final Boolean b2 = b;
        return (n == 0 || b2 != null) && b2;
    }
    
    public static void setInt(final int i) {
        Initializer_20.hashMap.put(i, true);
        getPoolc().iOMB(Initializer_20.class310.method_22683().method_4490(), new class_11910(i, 0), 1);
    }
    
    public static void setInt_1(final int n) {
        getPoolc().iOMB(Initializer_20.class310.method_22683().method_4490(), new class_11910(n, 0), 0);
    }
    
    public static void setIntAndInt(final int n, final int n2) {
        Initializer_20.executorService.submit(Initializer_20::lambda$mouseClick$0);
    }
    
    public static void setInt_2(final int n) {
        setIntAndInt(n, 35);
    }
    
    public static boolean isEnabled() {
        return Initializer_20.hashMap.values().stream().anyMatch(Initializer_20::lambda$isSimulatedClick$1);
    }
    
    private static boolean lambda$isSimulatedClick$1(final Boolean b) {
        return b;
    }
    
    private static void lambda$mouseClick$0(final int n, final int n2) {
        try {
            setInt(n);
            Thread.sleep(n2);
            setInt_1(n);
        }
        catch (final InterruptedException ex) {}
    }
    
    static {
        class310 = class_310.method_1551();
        Initializer_20.hashMap = new HashMap<Integer, Boolean>();
        Initializer_20.executorService = Executors.newFixedThreadPool(100);
    }
}
