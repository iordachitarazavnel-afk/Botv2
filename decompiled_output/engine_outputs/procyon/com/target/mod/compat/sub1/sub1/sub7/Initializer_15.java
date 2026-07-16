// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub1.sub7.sub6.RecordSub;
import net.minecraft.class_3532;
import net.minecraft.class_2374;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_1657;

public final class Initializer_15
{
    public static class_243 computeClass_243(final class_1657 class_1657) {
        return class_1657.method_33571();
    }
    
    public static class_2338 getClass_2338() {
        return class_2338.method_49638((class_2374)Initializer_1.class310.field_1773.method_19418().method_71156());
    }
    
    public static class_2338 getClass_2338_1() {
        return new class_2338((int)computeClass_243((class_1657)Initializer_1.class310.field_1724).field_1352, (int)computeClass_243((class_1657)Initializer_1.class310.field_1724).field_1351, (int)computeClass_243((class_1657)Initializer_1.class310.field_1724).field_1350);
    }
    
    public static class_243 createClass_243(final float n, final float n2) {
        final float n3 = n2 * 0.017453292f;
        final float n4 = -n * 0.017453292f;
        final float method_15362 = class_3532.method_15362((double)n4);
        final float method_15363 = class_3532.method_15374((double)n4);
        final float method_15364 = class_3532.method_15362((double)n3);
        return new class_243((double)(method_15363 * method_15364), (double)(-class_3532.method_15374((double)n3)), (double)(method_15362 * method_15364));
    }
    
    public static class_243 computeClass_243_1(final class_1657 class_1657) {
        return createClass_243(class_1657.method_36454(), class_1657.method_36455());
    }
    
    public static RecordSub createPacka(final RecordSub recordSub, final RecordSub recordSub2) {
        return new RecordSub(Math.abs(Math.max(recordSub.getDouble(), recordSub2.getDouble()) - Math.min(recordSub.getDouble(), recordSub2.getDouble())), Math.abs(Math.max(recordSub.getDouble_1(), recordSub2.getDouble_1()) - Math.min(recordSub.getDouble_1(), recordSub2.getDouble_1())));
    }
    
    public static RecordSub createPacka_1(final RecordSub recordSub, final RecordSub recordSub2, final double n) {
        return new RecordSub(class_3532.method_17821((float)n, (float)recordSub.getDouble(), (float)recordSub2.getDouble()), class_3532.method_17821((float)n, (float)recordSub.getDouble_1(), (float)recordSub2.getDouble_1()));
    }
    
    public static double method_double_1(final RecordSub recordSub, final RecordSub recordSub2) {
        final RecordSub packa = createPacka(recordSub, recordSub2);
        return packa.getDouble() + packa.getDouble_1();
    }
    
    public static class_243 getClass_243() {
        return computeClass_243_1((class_1657)Initializer_1.class310.field_1724);
    }
    
    public static RecordSub createPacka_2(final class_1297 class_1297, final class_243 class_1298) {
        final double x = class_1298.field_1352 - class_1297.method_23317();
        final double y = class_1298.field_1351 - class_1297.method_23318();
        final double y2 = class_1298.field_1350 - class_1297.method_23321();
        return new RecordSub(class_3532.method_15338(Math.toDegrees(Math.atan2(y2, x)) - 90.0), -class_3532.method_15338(Math.toDegrees(Math.atan2(y, class_3532.method_15355((float)(x * x + y2 * y2))))));
    }
    
    public static double method_double(final RecordSub recordSub) {
        final double n = class_3532.method_15393(Initializer_1.class310.field_1724.method_36454());
        final double n2 = class_3532.method_15393(Initializer_1.class310.field_1724.method_36455());
        final double method_15338 = class_3532.method_15338(n - recordSub.getDouble());
        final double method_15339 = class_3532.method_15338(n2 - recordSub.getDouble_1());
        return Math.sqrt(method_15338 * method_15338 + method_15339 * method_15339);
    }
}
