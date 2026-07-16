// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import net.minecraft.class_638;
import net.minecraft.class_2400;
import org.joml.Vector3f;
import net.minecraft.class_243;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub5.sub1.CalcGSub;
import net.minecraft.class_310;

public class Initializer_25
{
    private static final class_310 class310;
    
    private static CalcGSub getGridf() {
        if (Initializer_1.getSyncf() == null) {
            return null;
        }
        return Initializer_1.getSyncf().computeCalcg_1(CalcGSub.class);
    }
    
    private static int getInt() {
        return 12;
    }
    
    private static double getDouble() {
        return 0.3;
    }
    
    public static void setCalcg(final AbstractLoadF abstractLoadF) {
        if (Initializer_25.class310.field_1724 == null || Initializer_25.class310.field_1687 == null) {
            return;
        }
        final class_243 method_1031 = Initializer_25.class310.field_1724.method_73189().method_1031(0.0, (double)Initializer_25.class310.field_1724.method_18381(Initializer_25.class310.field_1724.method_18376()), 0.0);
        final double double1 = getDouble();
        final int int1 = getInt();
        processAll((class_2394)class_2398.field_11211, method_1031, double1, double1, double1, int1);
        processAll_1(method_1031, 0.0f, 1.0f, 0.0f, (int)(int1 * 0.7));
    }
    
    public static void setCalcg_1(final AbstractLoadF abstractLoadF) {
        if (Initializer_25.class310.field_1724 == null || Initializer_25.class310.field_1687 == null) {
            return;
        }
        final class_243 method_1031 = Initializer_25.class310.field_1724.method_73189().method_1031(0.0, (double)Initializer_25.class310.field_1724.method_18381(Initializer_25.class310.field_1724.method_18376()), 0.0);
        final double double1 = getDouble();
        final int int1 = getInt();
        processAll_1(method_1031, 1.0f, 0.0f, 0.0f, int1);
        processAll((class_2394)class_2398.field_11251, method_1031, double1 * 0.7, double1 * 0.7, double1 * 0.7, (int)(int1 * 0.6));
    }
    
    public static void setCalcgAndBool(final AbstractLoadF abstractLoadF, final boolean b) {
        if (abstractLoadF.isEnabled()) {
            setCalcg_2(abstractLoadF);
        }
        else {
            setCalcg_3(abstractLoadF);
        }
    }
    
    private static void setCalcg_2(final AbstractLoadF calcg) {
        final int int_1 = Initializer_21.getInt_1();
        class_310 class_311;
        final class_310 class_310 = class_311 = Initializer_25.class310;
        if (int_1 != 0) {
            if (class_310.field_1724 == null) {
                return;
            }
            final class_310 class310;
            class_311 = (class310 = Initializer_25.class310);
        }
        if (int_1 != 0) {
            if (class_310.field_1687 == null) {
                return;
            }
            class_311 = Initializer_25.class310;
        }
        final class_243 method_1031 = class_311.field_1724.method_73189().method_1031(0.0, (double)Initializer_25.class310.field_1724.method_18381(Initializer_25.class310.field_1724.method_18376()), 0.0);
        final double double1 = getDouble();
        final int int1 = getInt();
        switch (Initializer_17.intArr[calcg.getStepf().ordinal()]) {
            case 1: {
                final class_2400 field_11205 = class_2398.field_11205;
                final Vector3f vector3f = new Vector3f(1.0f, 0.2f, 0.2f);
                processAll((class_2394)field_11205, method_1031, double1, double1, double1, int1);
                processAll_1(method_1031, vector3f.floatValue_1, vector3f.floatValue_2, vector3f.floatValue, (int)(int1 * 0.7));
                if (int_1 == 0)
                return;
            }
            case 2: {
                final class_2400 field_11206 = class_2398.field_11215;
                final Vector3f vector3f2 = new Vector3f(0.2f, 0.8f, 1.0f);
                processAll((class_2394)field_11206, method_1031, double1, double1, double1, int1);
                processAll_1(method_1031, vector3f2.floatValue_1, vector3f2.floatValue_2, vector3f2.floatValue, (int)(int1 * 0.7));
                if (int_1 == 0)
                return;
            }
            case 3: {
                final class_2400 field_11207 = class_2398.field_11211;
                final Vector3f vector3f3 = new Vector3f(1.0f, 0.8f, 0.2f);
                processAll((class_2394)field_11207, method_1031, double1, double1, double1, int1);
                processAll_1(method_1031, vector3f3.floatValue_1, vector3f3.floatValue_2, vector3f3.floatValue, (int)(int1 * 0.7));
                if (int_1 == 0)
                return;
            }
            case 4: {
                final class_2400 field_11208 = class_2398.field_11249;
                final Vector3f vector3f4 = new Vector3f(0.8f, 0.2f, 1.0f);
                processAll((class_2394)field_11208, method_1031, double1, double1, double1, int1);
                processAll_1(method_1031, vector3f4.floatValue_1, vector3f4.floatValue_2, vector3f4.floatValue, (int)(int1 * 0.7));
                if (int_1 == 0)
                return;
            }
            case 5: {
                final class_2400 field_11209 = class_2398.field_11220;
                final Vector3f vector3f5 = new Vector3f(1.0f, 0.9f, 0.6f);
                processAll((class_2394)field_11209, method_1031, double1, double1, double1, int1);
                processAll_1(method_1031, vector3f5.floatValue_1, vector3f5.floatValue_2, vector3f5.floatValue, (int)(int1 * 0.8));
                if (int_1 == 0)
                return;
            }
            case 6: {
                final class_2400 field_11210 = class_2398.field_11240;
                final Vector3f vector3f6 = new Vector3f(1.0f, 0.5f, 0.1f);
                processAll((class_2394)field_11210, method_1031, double1, double1, double1, int1);
                processAll_1(method_1031, vector3f6.floatValue_1, vector3f6.floatValue_2, vector3f6.floatValue, (int)(int1 * 0.7));
                if (int_1 == 0) {
                    break;
                }
                return;
            }
        }
        setCalcg(calcg);
    }
    
    private static void setCalcg_3(final AbstractLoadF abstractLoadF) {
        if (Initializer_25.class310.field_1724 == null || Initializer_25.class310.field_1687 == null) {
            return;
        }
        final class_243 method_1031 = Initializer_25.class310.field_1724.method_73189().method_1031(0.0, (double)Initializer_25.class310.field_1724.method_18381(Initializer_25.class310.field_1724.method_18376()), 0.0);
        final double double1 = getDouble();
        final int int1 = getInt();
        Vector3f vector3f = null;
        switch (Initializer_17.intArr[abstractLoadF.getStepf().ordinal()]) {
            case 1: {
                vector3f = new Vector3f(0.7f, 0.1f, 0.1f);
                break;
            }
            case 2: {
                vector3f = new Vector3f(0.1f, 0.5f, 0.7f);
                break;
            }
            case 3: {
                vector3f = new Vector3f(0.7f, 0.5f, 0.1f);
                break;
            }
            case 4: {
                vector3f = new Vector3f(0.5f, 0.1f, 0.7f);
                break;
            }
            case 5: {
                vector3f = new Vector3f(0.6f, 0.5f, 0.4f);
                break;
            }
            case 6: {
                vector3f = new Vector3f(0.7f, 0.3f, 0.05f);
                break;
            }
            default: {
                vector3f = new Vector3f(1.0f, 0.0f, 0.0f);
                break;
            }
        }
        processAll_1(method_1031, vector3f.floatValue_1, vector3f.floatValue_2, vector3f.floatValue, int1);
        processAll((class_2394)class_2398.field_11251, method_1031, double1 * 0.7, double1 * 0.7, double1 * 0.7, (int)(int1 * 0.5));
    }
    
    private static void processAll(final class_2394 class_2394, final class_243 class_2395, final double n, final double n2, final double n3, final int n4) {
        final class_638 field_1687 = Initializer_25.class310.field_1687;
        if (field_1687 == null) {
            return;
        }
        for (int i = 0; i < n4; ++i) {
            field_1687.method_8406(class_2394, class_2395.field_1352 + (Math.random() - 0.5) * n * 2.0, class_2395.field_1351 + (Math.random() - 0.5) * n2 * 2.0, class_2395.field_1350 + (Math.random() - 0.5) * n3 * 2.0, (Math.random() - 0.5) * 0.1, (Math.random() - 0.5) * 0.1, (Math.random() - 0.5) * 0.1);
        }
    }
    
    private static void processAll_1(final class_243 class_243, final float n, final float n2, final float n3, final int n4) {
        if (Initializer_25.class310.field_1687 == null) {
            return;
        }
        final Vector3f vector3f = new Vector3f(n, n2, n3);
        for (int i = 0; i < n4; ++i) {
            final double n5 = (Math.random() - 0.5) * 0.6;
            final double n6 = (Math.random() - 0.5) * 0.6;
            final double n7 = (Math.random() - 0.5) * 0.6;
            final double n8 = (Math.random() - 0.5) * 0.15;
            final double n9 = (Math.random() - 0.5) * 0.15;
            final double n10 = (Math.random() - 0.5) * 0.15;
        }
    }
    
    static {
        class310 = class_310.method_1551();
    }
}
