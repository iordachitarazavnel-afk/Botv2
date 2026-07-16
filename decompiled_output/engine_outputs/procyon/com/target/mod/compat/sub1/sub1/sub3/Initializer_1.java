// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3;

import com.target.mod.compat.sub1.sub1.sub1.Initializer_4;
import com.target.mod.compat.sub1.sub1.sub5.sub1.CalcGSub;

public class Initializer_1
{
    public static final int intValue = 300;
    public static final float floatValue = 0.3f;
    private static boolean boolFlag;
    
    public static int method_int(final int n, final float b) {
        return (int)((n >> 24 & 0xFF) * Math.max(0.0f, Math.min(1.0f, b))) << 24 | (n & 0xFFFFFF);
    }
    
    public static int method_int_1(final int n, int max) {
        max = Math.max(0, Math.min(255, max));
        return max << 24 | (n & 0xFFFFFF);
    }
    
    public static int method_int_2(final int n, final int n2, final float n3) {
        final int n4 = n >> 24 & 0xFF;
        final int n5 = n >> 16 & 0xFF;
        final int n6 = n >> 8 & 0xFF;
        final int n7 = n & 0xFF;
        return (int)(n4 + ((n2 >> 24 & 0xFF) - n4) * n3) << 24 | (int)(n5 + ((n2 >> 16 & 0xFF) - n5) * n3) << 16 | (int)(n6 + ((n2 >> 8 & 0xFF) - n6) * n3) << 8 | (int)(n7 + ((n2 & 0xFF) - n7) * n3);
    }
    
    public static float getFloat() {
        final boolean enabled = isEnabled();
        final Initializer_4 syncF = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF;
        CalcGSub calcGSub = null;
        Label_0029: {
            if (!enabled) {
                if (syncF == null) {
                    calcGSub = null;
                    break Label_0029;
                }
                final Initializer_4 syncF2 = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF;
            }
            calcGSub = syncF.computeCalcg_1(CalcGSub.class);
        }
        final CalcGSub calcGSub3;
        final CalcGSub calcGSub2 = calcGSub3 = calcGSub;
        if (!enabled) {
            if (calcGSub3 == null) {
                return 0.35f;
            }
            calcGSub2.bindK.getValue();
        }
        return ((Double)calcGSub3).floatValue() / 100.0f;
    }
    
    public static int getInt() {
        final boolean enabled_1 = isEnabled_1();
        final Initializer_4 syncF = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF;
        CalcGSub calcGSub = null;
        Label_0029: {
            if (enabled_1) {
                if (syncF == null) {
                    calcGSub = null;
                    break Label_0029;
                }
                final Initializer_4 syncF2 = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF;
            }
            calcGSub = syncF.computeCalcg_1(CalcGSub.class);
        }
        final CalcGSub calcGSub2 = calcGSub;
        return (enabled_1 && calcGSub2 == null) ? -48060 : calcGSub2.getInt();
    }
    
    public static int getInt_1() {
        return method_int_2(getInt(), -16777216, 0.3f);
    }
    
    public static int getInt_2() {
        return -16119281;
    }
    
    public static int getInt_3() {
        return -15461352;
    }
    
    public static int getInt_4() {
        return -15066590;
    }
    
    public static int getInt_5() {
        return -15658731;
    }
    
    public static int getInt_6() {
        return -15329760;
    }
    
    public static int getInt_7() {
        return -14540240;
    }
    
    public static int getInt_8() {
        return -2039576;
    }
    
    public static int getInt_9() {
        return -7829352;
    }
    
    public static int getInt_10() {
        return -14013896;
    }
    
    public static int getInt_11() {
        return -14540240;
    }
    
    public static int getInt_12() {
        return -15329760;
    }
    
    public static void setBool(final boolean boolFlag) {
        Initializer_1.boolFlag = boolFlag;
    }
    
    public static boolean isEnabled() {
        return Initializer_1.boolFlag;
    }
    
    public static boolean isEnabled_1() {
        return !isEnabled();
    }
    
    static {
        if (!isEnabled_1()) {
            setBool(true);
        }
    }
}
