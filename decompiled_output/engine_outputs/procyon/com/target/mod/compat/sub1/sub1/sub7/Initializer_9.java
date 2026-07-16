// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import net.minecraft.class_636;
import net.minecraft.class_746;
import net.minecraft.class_1268;
import net.minecraft.class_3965;
import net.minecraft.class_2248;
import net.minecraft.class_2758;
import net.minecraft.class_2680;
import net.minecraft.class_638;
import net.minecraft.class_310;
import net.minecraft.class_2769;
import net.minecraft.class_4969;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import net.minecraft.class_1923;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import net.minecraft.class_2818;
import java.util.stream.Stream;

public final class Initializer_9
{
    private static final String strValue;
    
    public static Stream<class_2818> getStream() {
        final int n = Math.max(2, Initializer_1.class310.field_1690.method_38521()) + 3;
        final int n2 = n * 2 + 1;
        final int int_1 = Initializer_21.getInt_1();
        final class_1923 method_31476 = Initializer_1.class310.field_1724.method_31476();
        final int n3 = int_1;
        final class_1923 seed = new class_1923(method_31476.field_9181 - n, method_31476.field_9180 - n);
        final Stream<class_2818> filter = Stream.iterate(seed, Initializer_9::lambda$getLoadedChunks$0).limit(n2 * (long)n2).filter(Initializer_9::lambda$getLoadedChunks$1).map((Function<? super class_1923, ? extends class_2818>)Initializer_9::lambda$getLoadedChunks$2).filter(Objects::nonNull);
        if (n3 == 0) {
            int int1 = Initializer.getInt();
            Initializer.setInt(++int1);
        }
        return filter;
    }
    
    public static boolean checkClass_2338(final class_2338 class_2338) {
        Label_0042: {
            try {
                if (!checkCondition(class_2338, class_2246.field_23152)) {
                    return false;
                }
                final class_310 class_2339 = Initializer_1.class310;
                final class_638 class_2340 = class_2339.field_1687;
                final class_2338 class_2341 = class_2338;
                final class_2680 class_2342 = class_2340.method_8320(class_2341);
                final class_2758 class_2343 = class_4969.field_23153;
                final Comparable comparable = class_2342.method_11654((class_2769)class_2343);
                final Integer n = (Integer)comparable;
                final int n2 = n;
                if (n2 != 0) {
                    break Label_0042;
                }
                return false;
            }
            catch (final IllegalStateException ex) {
                throw computeException(ex);
            }
            try {
                final class_310 class_2339 = Initializer_1.class310;
                final class_638 class_2340 = class_2339.field_1687;
                final class_2338 class_2341 = class_2338;
                final class_2680 class_2342 = class_2340.method_8320(class_2341);
                final class_2758 class_2343 = class_4969.field_23153;
                final Comparable comparable = class_2342.method_11654((class_2769)class_2343);
                final Integer n = (Integer)comparable;
                final int n2 = n;
                if (n2 != 0) {
                    return true;
                }
            }
            catch (final IllegalStateException ex2) {
                throw computeException(ex2);
            }
        }
        return false;
    }
    
    public static boolean checkClass_2338_1(final class_2338 class_2338) {
        Label_0042: {
            try {
                if (!checkCondition(class_2338, class_2246.field_23152)) {
                    return false;
                }
                final class_310 class_2339 = Initializer_1.class310;
                final class_638 class_2340 = class_2339.field_1687;
                final class_2338 class_2341 = class_2338;
                final class_2680 class_2342 = class_2340.method_8320(class_2341);
                final class_2758 class_2343 = class_4969.field_23153;
                final Comparable comparable = class_2342.method_11654((class_2769)class_2343);
                final Integer n = (Integer)comparable;
                final int n2 = n;
                if (n2 == 0) {
                    break Label_0042;
                }
                return false;
            }
            catch (final IllegalStateException ex) {
                throw computeException(ex);
            }
            try {
                final class_310 class_2339 = Initializer_1.class310;
                final class_638 class_2340 = class_2339.field_1687;
                final class_2338 class_2341 = class_2338;
                final class_2680 class_2342 = class_2340.method_8320(class_2341);
                final class_2758 class_2343 = class_4969.field_23153;
                final Comparable comparable = class_2342.method_11654((class_2769)class_2343);
                final Integer n = (Integer)comparable;
                final int n2 = n;
                if (n2 == 0) {
                    return true;
                }
            }
            catch (final IllegalStateException ex2) {
                throw computeException(ex2);
            }
        }
        return false;
    }
    
    public static boolean checkCondition(final class_2338 class_2338, final class_2248 class_2339) {
        try {
            if (Initializer_1.class310.field_1687.method_8320(class_2338).method_26204() == class_2339) {
                return true;
            }
        }
        catch (final IllegalStateException ex) {
            throw computeException(ex);
        }
        return false;
    }
    
    public static void setClass_3965AndBool(final class_3965 class_3965, final boolean b) {
        final int int_1 = Initializer_21.getInt_1();
        try {
            class_310 class310 = null;
            Label_0069: {
                class_636 field_1761 = null;
                Label_0052: {
                    Label_0034: {
                        class_310 class_3967 = null;
                        Label_0024: {
                            class_310 class_3966;
                            try {
                                class_3966 = (class_3967 = Initializer_1.class310);
                                if (int_1 == 0) {
                                    break Label_0034;
                                }
                                final class_746 class_3968 = class_3966.field_1724;
                                if (class_3968 != null) {
                                    break Label_0024;
                                }
                                return;
                            }
                            catch (final Exception ex) {
                                throw computeException(ex);
                            }
                            try {
                                final class_746 class_3968 = class_3966.field_1724;
                                if (class_3968 == null) {
                                    return;
                                }
                                class_3967 = Initializer_1.class310;
                            }
                            catch (final Exception ex2) {
                                throw computeException(ex2);
                            }
                        }
                        try {
                            field_1761 = class_3967.field_1761;
                            if (int_1 == 0) {
                                break Label_0069;
                            }
                            if (field_1761 != null) {
                                break Label_0052;
                            }
                        }
                        catch (final Exception ex3) {
                            throw computeException(ex3);
                        }
                    }
                    return;
                    try {
                        class310 = Initializer_1.class310;
                        if (int_1 == 0) {
                            break Label_0069;
                        }
                        final class_636 field_1762 = class310.field_1761;
                    }
                    catch (final Exception ex4) {
                        throw computeException(ex4);
                    }
                }
                try {
                    field_1761.method_2896(Initializer_1.class310.field_1724, class_1268.field_5808, class_3965);
                    if (!b) {
                        return;
                    }
                    final class_310 class311 = Initializer_1.class310;
                }
                catch (final Exception ex5) {
                    throw computeException(ex5);
                }
            }
            class310.field_1724.method_6104(class_1268.field_5808);
        }
        catch (final Exception ex6) {}
    }
    
    private static class_2818 lambda$getLoadedChunks$2(final class_1923 class_1923) {
        return Initializer_1.class310.field_1687.method_8497(class_1923.field_9181, class_1923.field_9180);
    }
    
    private static boolean lambda$getLoadedChunks$1(final class_1923 class_1923) {
        return Initializer_1.class310.field_1687.method_8393(class_1923.field_9181, class_1923.field_9180);
    }
    
    private static class_1923 lambda$getLoadedChunks$0(final class_1923 class_1923, final class_1923 class_1924, final class_1923 class_1925) {
        int n = class_1925.field_9181;
        final int int1 = Initializer_21.getInt();
        int field_9180 = class_1925.field_9180;
        ++n;
        final int n2 = int1;
        Label_0054: {
            int n3 = 0;
            int field_9181 = 0;
            Label_0048: {
                try {
                    n3 = n;
                    field_9181 = class_1923.field_9181;
                    if (n2 != 0) {
                        break Label_0054;
                    }
                    if (n3 <= field_9181) {
                        break Label_0048;
                    }
                }
                catch (final IllegalStateException ex) {
                    throw computeException(ex);
                }
                n = class_1924.field_9181;
                ++field_9180;
            }
            final int field_9182 = class_1923.field_9180;
            try {
                if (n3 > field_9181) {
                    throw new IllegalStateException(Initializer_9.strValue);
                }
            }
            catch (final IllegalStateException ex2) {
                throw computeException(ex2);
            }
        }
        return new class_1923(n, field_9180);
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 6);
        final char[] charArray = "=<#^kFP\u0002!<R~\u000b\u0014\u0007,?\u001c~\u000b\u0007\u0001::\u0015".toCharArray();
        final int length = charArray.length;
        int n4 = 0;
        while (true) {
            Label_0128: {
                if (length > 1) {
                    break Label_0128;
                }
                n3 = (n2 = n4);
                do {
                    final char c = charArray[n2];
                    charArray[n3] = (char)(c ^ (n ^ switch (n4 % 7) {
                        case 0 -> 104;
                        case 1 -> 78;
                        case 2 -> 87;
                        case 3 -> 61;
                        case 4 -> 12;
                        case 5 -> 45;
                        default -> 118;
                    }));
                    ++n4;
                } while (n == 0);
            }
            if (length <= n4) {
                strValue = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
