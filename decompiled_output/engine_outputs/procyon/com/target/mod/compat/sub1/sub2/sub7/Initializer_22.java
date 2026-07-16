// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import net.minecraft.class_3532;
import net.minecraft.class_243;
import net.minecraft.class_1297;
import net.minecraft.class_310;

public class Initializer_22
{
    private static final class_310 class310;
    
    public static RecordSub createCalcx(final class_1297 class_1297, final class_243 class_1298) {
        final class_243 computeClass_243 = computeClass_243(class_1297);
        final double x = class_1298.field_1352 - computeClass_243.field_1352;
        final double y = class_1298.field_1351 - computeClass_243.field_1351;
        final double y2 = class_1298.field_1350 - computeClass_243.field_1350;
        return new RecordSub((float)Math.toDegrees(Math.atan2(y2, x)) - 90.0f, (float)(-Math.toDegrees(Math.atan2(y, Math.sqrt(x * x + y2 * y2)))));
    }
    
    public static class_243 computeClass_243(final class_1297 class_1297) {
        return class_1297.method_73189().method_1031(0.0, (double)class_1297.method_5751(), 0.0);
    }
    
    public static class_243 computeClass_243_1(final class_1297 class_1297) {
        final float method_36454 = class_1297.method_36454();
        final float method_36455 = class_1297.method_36455();
        final float n = (float)Math.toRadians(-method_36454 - 180.0f);
        final float n2 = (float)Math.toRadians(-method_36455);
        final float method_36456 = class_3532.method_15362((double)n);
        final float method_36457 = class_3532.method_15374((double)n);
        final float method_36458 = class_3532.method_15362((double)n2);
        return new class_243((double)(method_36457 * method_36458), (double)class_3532.method_15374((double)n2), (double)(method_36456 * method_36458));
    }
    
    public static double method_double(final RecordSub recordSub) {
        if (Initializer_22.class310.field_1724 == null) {
            return 180.0;
        }
        final double method_15338 = class_3532.method_15338(recordSub.doubleValue - Initializer_22.class310.field_1724.method_36454());
        final double method_15339 = class_3532.method_15338(recordSub.doubleValue_1 - Initializer_22.class310.field_1724.method_36455());
        return Math.sqrt(method_15338 * method_15338 + method_15339 * method_15339);
    }
    
    static {
        class310 = class_310.method_1551();
    }
}
