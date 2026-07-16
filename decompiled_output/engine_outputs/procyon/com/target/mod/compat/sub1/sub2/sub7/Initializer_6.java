// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import net.minecraft.class_742;
import java.util.Iterator;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3959;
import net.minecraft.class_3959$class_242;
import net.minecraft.class_3959$class_3960;
import net.minecraft.class_239;
import net.minecraft.class_1657;
import net.minecraft.class_1297;
import net.minecraft.class_1268;
import net.minecraft.class_3965;
import java.util.function.Predicate;
import net.minecraft.class_310;

public class Initializer_6
{
    private static final class_310 class310;
    
    public static boolean isEnabled() {
        return Initializer_6.class310.field_1687 != null && Initializer_6.class310.field_1724 != null && Initializer_6.class310.field_1687.method_18456().stream().filter(Initializer_6::lambda$hasEliminatedEntities$0).filter(Initializer_6::lambda$hasEliminatedEntities$1).anyMatch(Initializer_6::lambda$hasEliminatedEntities$2);
    }
    
    public static void setClass_3965AndBool(final class_3965 class_3965, final boolean b) {
        if (Initializer_6.class310.field_1724 == null || Initializer_6.class310.field_1761 == null) {
            return;
        }
        Initializer_6.class310.field_1761.method_2896(Initializer_6.class310.field_1724, class_1268.field_5808, class_3965);
        if (b) {
            Initializer_6.class310.field_1724.method_6104(class_1268.field_5808);
        }
    }
    
    public static void setClass_1297AndBool(final class_1297 class_1297, final boolean b) {
        if (Initializer_6.class310.field_1724 == null || Initializer_6.class310.field_1761 == null) {
            return;
        }
        Initializer_6.class310.field_1761.method_2918((class_1657)Initializer_6.class310.field_1724, class_1297);
        if (b) {
            Initializer_6.class310.field_1724.method_6104(class_1268.field_5808);
        }
    }
    
    public static boolean checkClass_1657(final class_1657 class_1657) {
        return Initializer_6.class310.field_1724 != null && class_1657.method_5828(1.0f).method_1026(Initializer_6.class310.field_1724.method_73189().method_1020(class_1657.method_73189()).method_1029()) < 0.0;
    }
    
    public static class_239 computeClass_239(final double n) {
        if (Initializer_6.class310.field_1724 == null || Initializer_6.class310.field_1687 == null) {
            return null;
        }
        final class_243 method_33571 = Initializer_6.class310.field_1724.method_33571();
        return (class_239)Initializer_6.class310.field_1687.method_17742(new class_3959(method_33571, method_33571.method_1019(Initializer_6.class310.field_1724.method_5828(1.0f).method_1021(n)), class_3959$class_3960.field_17559, class_3959$class_242.field_1348, (class_1297)Initializer_6.class310.field_1724));
    }
    
    public static class_1657 createClass_1657(final class_1297 class_1297, final float n, final boolean b, final boolean b2) {
        final int int1 = Initializer_14.getInt();
        if (Initializer_6.class310.field_1687 == null) {
            return null;
        }
        class_1657 class_1298 = null;
        double n2 = n;
        for (class_1657 class_1299 : Initializer_6.class310.field_1687.method_18456()) {
            final class_1657 class_1302;
            class_1657 class_1301;
            final class_1657 class_1300 = class_1301 = (class_1302 = class_1299);
            if (int1 != 0) {
                return class_1302;
            }
            if (int1 == 0) {
                if (class_1300 == class_1297 && int1 == 0) {
                    continue;
                }
                class_1301 = class_1299;
            }
            boolean b5;
            boolean method_7325;
            boolean b4;
            final boolean b3 = b4 = (method_7325 = (b5 = class_1301.method_29504()));
            if (int1 == 0) {
                if (b3) {
                    continue;
                }
                method_7325 = (b4 = (b5 = class_1299.method_31481()));
            }
            if (int1 == 0) {
                if (b4 && int1 == 0) {
                    continue;
                }
                b5 = (method_7325 = class_1299.method_7325());
            }
            class_1657 class_1303 = null;
            Label_0146: {
                if (int1 == 0) {
                    if (method_7325) {
                        continue;
                    }
                    class_1303 = class_1299;
                    if (int1 != 0) {
                        break Label_0146;
                    }
                    b5 = class_1303.method_68878();
                }
                if (b5 && int1 == 0) {
                    continue;
                }
            }
            final double n3 = class_1303.method_5739(class_1297);
            double n5;
            final double n4 = n5 = dcmpl(n3, n2);
            if (int1 == 0) {
                if (n4 > 0 && int1 == 0) {
                    continue;
                }
                n5 = (b ? 1 : 0);
            }
            Label_0226: {
                Label_0218: {
                    class_1297 class_1304 = null;
                    Label_0193: {
                        if (int1 == 0) {
                            if (n4 == 0) {
                                break Label_0218;
                            }
                            class_1304 = class_1297;
                            if (int1 != 0) {
                                break Label_0193;
                            }
                            n5 = ((class_1297 instanceof class_1309) ? 1 : 0);
                        }
                        if (n5 == 0) {
                            break Label_0218;
                        }
                        class_1304 = class_1297;
                    }
                    final class_1309 class_1305 = (class_1309)class_1304;
                    if (int1 != 0) {
                        break Label_0226;
                    }
                    if (!class_1305.method_6057((class_1297)class_1299) && int1 == 0) {
                        continue;
                    }
                }
                n2 = n3;
                class_1298 = class_1299;
            }
            if (int1 != 0) {
                break;
            }
        }
        return class_1298;
    }
    
    public static class_1297 createClass_1297(final class_1297 class_1297, final float n, final boolean b) {
        if (Initializer_6.class310.field_1687 == null) {
            return null;
        }
        class_1297 class_1298 = null;
        double n2 = n;
        for (final class_1297 class_1299 : Initializer_6.class310.field_1687.method_8335(class_1297, class_1297.method_5829().method_1014((double)n))) {
            if (class_1299 instanceof final class_1309 class_1300) {
                if (class_1300.method_29504()) {
                    continue;
                }
                if (class_1300.method_31481()) {
                    continue;
                }
                final double n3 = class_1299.method_5739(class_1297);
                if (n3 > n2) {
                    continue;
                }
                if (b && class_1297 instanceof class_1309 && !((class_1309)class_1297).method_6057(class_1299)) {
                    continue;
                }
                n2 = n3;
                class_1298 = class_1299;
            }
        }
        return class_1298;
    }
    
    private static boolean lambda$hasEliminatedEntities$2(final class_742 class_742) {
        return class_742.method_31481() || class_742.method_29504() || class_742.method_6032() <= 0.0f;
    }
    
    private static boolean lambda$hasEliminatedEntities$1(final class_742 class_742) {
        return class_742.method_5739((class_1297)Initializer_6.class310.field_1724) < 6.0f;
    }
    
    private static boolean lambda$hasEliminatedEntities$0(final class_742 class_742) {
        return class_742 != Initializer_6.class310.field_1724;
    }
    
    static {
        class310 = class_310.method_1551();
    }
}
