// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

public class RenderASub_1 extends AbstractSyncA<Boolean>
{
    private static boolean boolFlag;
    
    public RenderASub_1(final String s, final Boolean b) {
        super(s, b);
    }
    
    @Override
    public void execute() {
        final boolean enabled_1 = AbstractSyncA.isEnabled_1();
        final boolean booleanValue = this.getValue();
        if (!enabled_1 && booleanValue) {}
        this.setObject(booleanValue);
    }
    
    public static void setBool(final boolean boolFlag) {
        RenderASub_1.boolFlag = boolFlag;
    }
    
    public static boolean isEnabled() {
        return RenderASub_1.boolFlag;
    }
    
    public static boolean isEnabled_1() {
        return !isEnabled();
    }
    
    static {
        if (isEnabled_1()) {
            setBool(true);
        }
    }
}
