// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import net.minecraft.class_746;
import net.minecraft.class_3532;
import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;
import net.minecraft.class_243;
import net.minecraft.class_310;

public class Initializer_10
{
    private static final class_310 class310;
    private static boolean boolFlag;
    private static float floatValue;
    private static float floatValue_1;
    private static float floatValue_2;
    private static float floatValue_3;
    
    public static float[] createFloatarr(final class_243 class_243, final class_243 class_244) {
        final double x = class_244.field_1352 - class_243.field_1352;
        final int int_1 = Initializer_21.getInt_1();
        final double y = class_244.field_1351 - class_243.field_1351;
        final double y2 = class_244.field_1350 - class_243.field_1350;
        final double sqrt = Math.sqrt(x * x + y2 * y2);
        final float n = (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f;
        int n2 = int_1;
        final float[] array = { n, (float)(-(Math.atan2(y, sqrt) * 180.0 / 3.141592653589793)) };
        if (Initializer.getInt() == 0) {
            Initializer_21.setInt(++n2);
        }
        return array;
    }
    
    public static float[] computeFloatarr(final class_1297 class_1297) {
        if (Initializer_10.class310.field_1724 == null) {
            return new float[] { 0.0f, 0.0f };
        }
        return createFloatarr(Initializer_10.class310.field_1724.method_33571(), class_1297.method_73189().method_1031(0.0, (double)(class_1297.method_17682() / 2.0f), 0.0));
    }
    
    public static float[] computeFloatarr_1(final class_243 class_243) {
        if (Initializer_10.class310.field_1724 == null) {
            return new float[] { 0.0f, 0.0f };
        }
        return createFloatarr(Initializer_10.class310.field_1724.method_33571(), class_243);
    }
    
    public static void setFloatAndFloat(final float n, final float n2) {
        if (Initializer_10.class310.field_1724 == null) {
            return;
        }
        if (!Initializer_10.boolFlag) {
            Initializer_10.floatValue_2 = Initializer_10.class310.field_1724.method_36454();
            Initializer_10.floatValue_3 = Initializer_10.class310.field_1724.method_36455();
            Initializer_10.boolFlag = true;
        }
        Initializer_10.floatValue = method_float(n);
        Initializer_10.floatValue_1 = class_3532.method_15363(n2, -90.0f, 90.0f);
    }
    
    public static void execute() {
        if (Initializer_10.class310.field_1724 == null || !Initializer_10.boolFlag) {
            return;
        }
        Initializer_10.class310.field_1724.method_36456(Initializer_10.floatValue_2);
        Initializer_10.class310.field_1724.method_36457(Initializer_10.floatValue_3);
        Initializer_10.boolFlag = false;
        Initializer_10.floatValue = 0.0f;
        Initializer_10.floatValue_1 = 0.0f;
    }
    
    public static float getFloat() {
        if (Initializer_10.boolFlag) {
            return Initializer_10.floatValue;
        }
        return (Initializer_10.class310.field_1724 != null) ? Initializer_10.class310.field_1724.method_36454() : 0.0f;
    }
    
    public static float getFloat_1() {
        if (Initializer_10.boolFlag) {
            return Initializer_10.floatValue_1;
        }
        return (Initializer_10.class310.field_1724 != null) ? Initializer_10.class310.field_1724.method_36455() : 0.0f;
    }
    
    public static boolean isEnabled() {
        return Initializer_10.boolFlag;
    }
    
    public static float method_float(float n) {
        n %= 360.0f;
        if (n >= 180.0f) {
            n -= 360.0f;
        }
        if (n < -180.0f) {
            n += 360.0f;
        }
        return n;
    }
    
    public static float method_float_2(final float n, final float n2) {
        float n3 = Math.abs(n - n2) % 360.0f;
        if (n3 > 180.0f) {
            n3 = 360.0f - n3;
        }
        return n3;
    }
    
    public static float method_float_1(final float n, final float n2, final float n3) {
        final float method_float = method_float(n2 - n);
        if (Math.abs(method_float) <= n3) {
            return n2;
        }
        if (method_float > 0.0f) {
            return n + n3;
        }
        return n - n3;
    }
    
    public static float[] createFloatarr_1(final float n, final float n2, final float n3, final float n4, final float n5) {
        return new float[] { method_float_1(n, n3, n5), method_float_1(n2, n4, n5) };
    }
    
    public static boolean checkCondition(final class_243 class_243, final float n) {
        if (Initializer_10.class310.field_1724 == null) {
            return false;
        }
        final float[] computeFloatarr_1 = computeFloatarr_1(class_243);
        final float method_float_2 = method_float_2(Initializer_10.class310.field_1724.method_36454(), computeFloatarr_1[0]);
        final float method_float_3 = method_float_2(Initializer_10.class310.field_1724.method_36455(), computeFloatarr_1[1]);
        return method_float_2 <= n && method_float_3 <= n;
    }
    
    public static boolean checkCondition_1(final class_1297 class_1297, final float n) {
        final int int_1 = Initializer_21.getInt_1();
        class_1297 field_1724;
        final class_746 class_1298 = (class_746)(field_1724 = (class_1297)Initializer_10.class310.field_1724);
        if (int_1 != 0) {
            if (class_1298 == null) {
                return false;
            }
            field_1724 = class_1297;
        }
        final float[] computeFloatarr = computeFloatarr(field_1724);
        final float method_float_2 = method_float_2(Initializer_10.class310.field_1724.method_36454(), computeFloatarr[0]);
        final float method_float_3 = method_float_2(Initializer_10.class310.field_1724.method_36455(), computeFloatarr[1]);
        float n3;
        final float n2 = n3 = fcmpg(method_float_2, n);
        if (int_1 != 0) {
            if (n2 > 0) {
                return false;
            }
            final int n4;
            n3 = (n4 = fcmpg(method_float_3, n));
        }
        if (int_1 != 0) {
            if (n2 > 0) {
                return false;
            }
            n3 = 1;
        }
        return n3 != 0.0f;
        n3 = 0;
        return n3 != 0.0f;
    }
    
    public static float method_float_3(final class_243 class_243) {
        if (Initializer_10.class310.field_1724 == null) {
            return 0.0f;
        }
        final float[] computeFloatarr_1 = computeFloatarr_1(class_243);
        final float method_float_2 = method_float_2(Initializer_10.class310.field_1724.method_36454(), computeFloatarr_1[0]);
        final float method_float_3 = method_float_2(Initializer_10.class310.field_1724.method_36455(), computeFloatarr_1[1]);
        return (float)Math.sqrt(method_float_2 * method_float_2 + method_float_3 * method_float_3);
    }
    
    static {
        class310 = class_310.method_1551();
        Initializer_10.boolFlag = false;
        Initializer_10.floatValue = 0.0f;
        Initializer_10.floatValue_1 = 0.0f;
        Initializer_10.floatValue_2 = 0.0f;
        Initializer_10.floatValue_3 = 0.0f;
    }
}
