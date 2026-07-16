// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub4;

import java.util.function.Predicate;
import java.util.HashMap;
import java.util.Map;

public class Initializer_2
{
    private final Map<String, Initializer_6> map;
    private final long longValue;
    private boolean boolFlag;
    
    public Initializer_2() {
        this.map = new HashMap<String, Initializer_6>();
        this.boolFlag = false;
        this.longValue = System.currentTimeMillis();
        this.boolFlag = true;
    }
    
    public void execute() {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        final long currentTimeMillis = System.currentTimeMillis();
        final int[] array = intarrArray;
        final boolean boolFlag = this.boolFlag;
        if (array == null) {
            if (boolFlag) {
                final long n = lcmp(currentTimeMillis - this.longValue, 350L);
                if (array != null) {
                    return;
                }
                if (n >= 0) {
                    this.boolFlag = false;
                }
            }
            this.map.entrySet().removeIf((Predicate<? super Object>)Initializer_2::lambda$update$0);
        }
    }
    
    public float getFloat() {
        if (!this.boolFlag) {
            return 1.0f;
        }
        return this.method_float_1(Math.min(1.0f, (System.currentTimeMillis() - this.longValue) / 350.0f));
    }
    
    public void processAll(final String s, final float n, final float n2, final long n3) {
        this.map.put(s, new Initializer_6(n, n2, n3, System.currentTimeMillis()));
    }
    
    public float method_float(final String s, final float n) {
        final Initializer_6 initializer_6 = this.map.get(s);
        return (initializer_6 != null) ? initializer_6.getFloat() : n;
    }
    
    public boolean checkString(final String s) {
        final Initializer_6 initializer_6 = this.map.get(s);
        return initializer_6 != null && !initializer_6.isEnabled();
    }
    
    private float method_float_1(final float n) {
        return 1.0f - (float)Math.pow(1.0f - n, 3.0);
    }
    
    private float method_float_2(final float n) {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        float n2 = n;
        final float n3 = 0.5f;
        if (intarrArray == null) {
            if (n >= n3) {
                return (float)(1.0 - Math.pow(-2.0f * n + 2.0f, 3.0) / 2.0);
            }
            n2 = 4.0f * n * n;
        }
        return n2 * n3;
    }
    
    private static boolean lambda$update$0(final long long1, final Map.Entry entry) {
        final Initializer_6 initializer_6 = entry.getValue();
        initializer_6.setLong(long1);
        return initializer_6.isEnabled();
    }
}
