// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import net.minecraft.class_636;
import net.minecraft.class_1268;
import net.minecraft.class_3965;
import java.util.function.Function;
import java.util.stream.Stream;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_310;

public class Initializer_4
{
    private static final class_310 class310;
    
    public static boolean checkCondition(final class_2338 class_2338, final class_2248 class_2339) {
        return Initializer_4.class310.field_1687 != null && Initializer_4.class310.field_1687.method_8320(class_2338).method_26204() == class_2339;
    }
    
    public static Stream<class_2338> createStream(final class_2338 class_2338, final class_2338 class_2339) {
        return class_2338.method_20437(class_2338, class_2339).map(class_2338::method_10062);
    }
    
    public static void setClass_3965AndBool(final class_3965 class_3965, final boolean b) {
        final int int1 = Initializer_14.getInt();
        final class_310 class310 = Initializer_4.class310;
        if (int1 == 0) {
            if (class310.field_1724 == null) {
                return;
            }
            final class_310 class311 = Initializer_4.class310;
        }
        final class_636 field_1761 = class310.field_1761;
        class_310 class312 = null;
        Label_0062: {
            if (int1 == 0) {
                if (field_1761 == null) {
                    return;
                }
                class312 = Initializer_4.class310;
                if (int1 != 0) {
                    break Label_0062;
                }
                final class_636 field_1762 = class312.field_1761;
            }
            field_1761.method_2896(Initializer_4.class310.field_1724, class_1268.field_5808, class_3965);
            if (!b) {
                return;
            }
            final class_310 class313 = Initializer_4.class310;
        }
        class312.field_1724.method_6104(class_1268.field_5808);
    }
    
    static {
        class310 = class_310.method_1551();
    }
}
