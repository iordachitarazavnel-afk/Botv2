// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

import java.util.function.BiConsumer;

public class RenderASub extends AbstractSyncA<Double>
{
    private final double doubleValue;
    private final double doubleValue_1;
    private final double doubleValue_2;
    private static String strValue;
    
    public RenderASub(final String s, final double d, final double doubleValue, final double doubleValue_1, final double doubleValue_2) {
        super(s, d);
        this.doubleValue = doubleValue;
        this.doubleValue_1 = doubleValue_1;
        this.doubleValue_2 = doubleValue_2;
    }
    
    public void setDouble(final Double n) {
        final boolean enabled_1 = AbstractSyncA.isEnabled_1();
        final double max = Math.max(this.doubleValue, Math.min(this.doubleValue_1, n));
        final Double n2 = (Double)this.objValue;
        final boolean b = enabled_1;
        this.objValue = (T)Double.valueOf(max);
        Object o;
        final BiConsumer<T, T> biConsumer = (BiConsumer<T, T>)(o = this.biConsumer);
        if (!b) {
            if (biConsumer == null) {
                return;
            }
            o = this.biConsumer;
        }
        ((BiConsumer<Double, Double>)o).accept(n2, Double.valueOf(max));
    }
    
    public double getDouble() {
        return this.doubleValue;
    }
    
    public double getDouble_1() {
        return this.doubleValue_1;
    }
    
    public double getDouble_2() {
        return this.doubleValue_2;
    }
    
    @Override
    public void execute() {
        this.setObject();
    }
    
    public void execute_1() {
        this.setObject();
    }
    
    public static void setString(final String strValue) {
        RenderASub.strValue = strValue;
    }
    
    public static String getString() {
        return RenderASub.strValue;
    }
    
    static {
        if (getString() == null) {
            setString("ZVUXv");
        }
    }
}
