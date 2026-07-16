// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import net.minecraft.class_742;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_1657;
import net.minecraft.class_1268;
import net.minecraft.class_3965;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import java.util.Iterator;
import net.minecraft.class_1802;
import net.minecraft.class_9334;
import net.minecraft.class_1542;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_1309;
import java.util.function.Predicate;
import net.minecraft.class_310;

public final class Initializer_7
{
    private static final class_310 class310;
    
    public static boolean isEnabled() {
        return Initializer_7.class310.field_1687 != null && Initializer_7.class310.field_1724 != null && Initializer_7.class310.field_1687.method_18456().parallelStream().filter(Initializer_7::lambda$iDBN$0).filter(Initializer_7::lambda$iDBN$1).anyMatch(class_1309::method_29504);
    }
    
    public static boolean isEnabled_1() {
        final int int1 = Initializer_21.getInt();
        final class_310 class310 = Initializer_7.class310;
        if (int1 == 0) {
            if (class310.field_1724 == null) {
                return false;
            }
            final class_310 class311 = Initializer_7.class310;
        }
        if (class310.field_1687 != null) {
            final class_238 class_238 = new class_238(Initializer_7.class310.field_1724.method_23317() - 10.0, Initializer_7.class310.field_1724.method_23318() - 5.0, Initializer_7.class310.field_1724.method_23321() - 10.0, Initializer_7.class310.field_1724.method_23317() + 10.0, Initializer_7.class310.field_1724.method_23318() + 5.0, Initializer_7.class310.field_1724.method_23321() + 10.0);
            int n = 0;
            while (true) {
                for (final class_1297 class_239 : Initializer_7.class310.field_1687.method_8335((class_1297)null, class_238)) {
                    Label_0413: {
                        if (int1 == 0) {
                            int n4;
                            final int n3;
                            final int n2 = n3 = (n4 = ((class_239 instanceof class_1542) ? 1 : 0));
                            if (int1 != 0) {
                                if (int1 == 0) {
                                    if (n3 >= 2) {
                                        n4 = 1;
                                    }
                                    else {
                                        n4 = 0;
                                    }
                                }
                                return n4 != 0;
                            }
                            if (n2 == 0) {
                                break Label_0413;
                            }
                        }
                        final class_1799 method_6983 = ((class_1542)class_239).method_6983();
                        int n6;
                        final int n5 = n6 = (method_6983.method_7960() ? 1 : 0);
                        if (int1 == 0) {
                            if (n5 != 0) {
                                continue;
                            }
                            final boolean method_6984;
                            n6 = ((method_6984 = method_6983.method_57826(class_9334.field_54196)) ? 1 : 0);
                        }
                        class_1799 class_254 = null;
                        Label_0357: {
                            if (int1 == 0) {
                                if (n5 != 0) {
                                    class_1792 class_245;
                                    class_1792 method_6985;
                                    class_1792 class_244;
                                    class_1792 class_243;
                                    class_1792 class_242;
                                    class_1792 class_241;
                                    final class_1792 class_240 = class_241 = (class_242 = (class_243 = (class_244 = (method_6985 = (class_245 = method_6983.method_7909())))));
                                    class_1792 class_251;
                                    class_1792 field_8348;
                                    class_1792 class_250;
                                    class_1792 class_249;
                                    class_1792 class_248;
                                    class_1792 class_247;
                                    final class_1792 class_246 = class_247 = (class_248 = (class_249 = (class_250 = (field_8348 = (class_251 = class_1802.field_22027)))));
                                    Label_0334: {
                                        if (int1 == 0) {
                                            if (class_240 == class_246) {
                                                break Label_0334;
                                            }
                                            final class_1792 class_252;
                                            class_241 = (class_252 = (class_242 = (class_243 = (class_244 = (method_6985 = (class_245 = method_6983.method_7909()))))));
                                            final class_1792 class_253;
                                            class_247 = (class_253 = (class_248 = (class_249 = (class_250 = (field_8348 = (class_251 = class_1802.field_22028))))));
                                        }
                                        if (int1 == 0) {
                                            if (class_240 == class_246) {
                                                break Label_0334;
                                            }
                                            class_242 = (class_241 = (class_243 = (class_244 = (method_6985 = (class_245 = method_6983.method_7909())))));
                                            class_248 = (class_247 = (class_249 = (class_250 = (field_8348 = (class_251 = class_1802.field_22029)))));
                                        }
                                        if (int1 == 0) {
                                            if (class_241 == class_247) {
                                                break Label_0334;
                                            }
                                            class_243 = (class_242 = (class_244 = (method_6985 = (class_245 = method_6983.method_7909()))));
                                            class_249 = (class_248 = (class_250 = (field_8348 = (class_251 = class_1802.field_22030))));
                                        }
                                        if (int1 == 0) {
                                            if (class_242 == class_248) {
                                                break Label_0334;
                                            }
                                            class_244 = (class_243 = (method_6985 = (class_245 = method_6983.method_7909())));
                                            class_250 = (class_249 = (field_8348 = (class_251 = class_1802.field_8805)));
                                        }
                                        if (int1 == 0) {
                                            if (class_243 == class_249) {
                                                break Label_0334;
                                            }
                                            method_6985 = (class_244 = (class_245 = method_6983.method_7909()));
                                            field_8348 = (class_250 = (class_251 = class_1802.field_8058));
                                        }
                                        if (int1 == 0) {
                                            if (class_244 == class_250) {
                                                break Label_0334;
                                            }
                                            class_245 = (method_6985 = method_6983.method_7909());
                                            class_251 = (field_8348 = class_1802.field_8348);
                                        }
                                        if (int1 == 0) {
                                            if (method_6985 == field_8348) {
                                                break Label_0334;
                                            }
                                            class_245 = method_6983.method_7909();
                                            class_251 = class_1802.field_8285;
                                        }
                                        if (class_245 != class_251) {
                                            break Label_0413;
                                        }
                                    }
                                    ++n;
                                    if (int1 == 0) {
                                        break Label_0413;
                                    }
                                }
                                class_254 = method_6983;
                                if (int1 != 0) {
                                    break Label_0357;
                                }
                                n6 = class_254.method_7947();
                            }
                            if (n6 <= 32) {
                                break Label_0413;
                            }
                        }
                        class_1792 class_256;
                        class_1792 method_6986;
                        final class_1792 class_255 = method_6986 = (class_256 = class_254.method_7909());
                        class_1792 class_258;
                        class_1792 field_8349;
                        final class_1792 class_257 = field_8349 = (class_258 = class_1802.field_8301);
                        if (int1 == 0) {
                            if (class_255 == class_257) {
                                return true;
                            }
                            final class_1792 class_259;
                            method_6986 = (class_259 = (class_256 = method_6983.method_7909()));
                            final class_1792 class_260;
                            field_8349 = (class_260 = (class_258 = class_1802.field_8281));
                        }
                        if (int1 == 0) {
                            if (class_255 == class_257) {
                                return true;
                            }
                            class_256 = (method_6986 = method_6983.method_7909());
                            class_258 = (field_8349 = class_1802.field_8367);
                        }
                        if (int1 == 0) {
                            if (method_6986 == field_8349) {
                                return true;
                            }
                            class_256 = method_6983.method_7909();
                            class_258 = class_1802.field_8287;
                        }
                        if (class_256 != class_258) {
                            break Label_0413;
                        }
                        return true;
                    }
                    if (int1 != 0) {
                        break;
                    }
                }
                int n3;
                int n4 = n3 = n;
                continue;
            }
        }
        return false;
    }
    
    public static void setClass_3965AndBool(final class_3965 class_3965, final boolean b) {
        if (Initializer_7.class310.field_1761 == null || Initializer_7.class310.field_1724 == null) {
            return;
        }
        if (Initializer_7.class310.field_1761.method_2896(Initializer_7.class310.field_1724, class_1268.field_5808, class_3965).method_23665() && b) {
            Initializer_7.class310.field_1724.method_6104(class_1268.field_5808);
        }
    }
    
    public static void setClass_1297AndBool(final class_1297 class_1297, final boolean b) {
        if (Initializer_7.class310.field_1761 == null || Initializer_7.class310.field_1724 == null) {
            return;
        }
        Initializer_7.class310.field_1761.method_2918((class_1657)Initializer_7.class310.field_1724, class_1297);
        if (b) {
            Initializer_7.class310.field_1724.method_6104(class_1268.field_5808);
        }
    }
    
    public static double method_double(final class_243 class_243, final class_243 class_244) {
        return class_243.method_1022(class_244);
    }
    
    public static boolean checkClass_1799(final class_1799 class_1799) {
        return class_1799.method_57826(class_9334.field_50077);
    }
    
    public static class_1657 createClass_1657(final class_1657 class_1657, final float n, final boolean b, final boolean b2) {
        if (Initializer_7.class310.field_1687 == null) {
            return null;
        }
        class_1657 class_1658 = null;
        double n2 = n;
        for (final class_1657 class_1659 : Initializer_7.class310.field_1687.method_18456()) {
            if (b2 && class_1659 == class_1657) {
                continue;
            }
            if (class_1659.method_29504()) {
                continue;
            }
            if (b && !class_1657.method_6057((class_1297)class_1659)) {
                continue;
            }
            final double n3 = class_1657.method_5739((class_1297)class_1659);
            if (n3 >= n2) {
                continue;
            }
            n2 = n3;
            class_1658 = class_1659;
        }
        return class_1658;
    }
    
    public static class_239 computeClass_239(final double n) {
        if (Initializer_7.class310.field_1724 == null) {
            return null;
        }
        return Initializer_7.class310.field_1724.method_5745(n, 0.0f, false);
    }
    
    private static boolean lambda$iDBN$1(final class_742 class_742) {
        return class_742.method_5858((class_1297)Initializer_7.class310.field_1724) <= 36.0;
    }
    
    private static boolean lambda$iDBN$0(final class_742 class_742) {
        return class_742 != Initializer_7.class310.field_1724;
    }
    
    static {
        class310 = class_310.method_1551();
    }
}
