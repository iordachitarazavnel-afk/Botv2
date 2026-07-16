// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import org.joml.Matrix4fc;
import org.joml.Vector4f;
import net.minecraft.class_243;
import org.joml.Matrix4f;
import net.minecraft.class_310;

public class Initializer_13
{
    private static final class_310 class310;
    private static Matrix4f matrix4f;
    private static Matrix4f matrix4f_1;
    
    public static void setMatrix4fAndMatrix4f(final Matrix4f matrix4f, final Matrix4f matrix4f_1) {
        Initializer_13.matrix4f = matrix4f;
        Initializer_13.matrix4f_1 = matrix4f_1;
    }
    
    public static Vector4f computeVector4f(final class_243 class_243) {
        final int int_1 = Initializer_14.getInt_1();
        class_310 class_245;
        final class_310 class_244 = class_245 = Initializer_13.class310;
        if (int_1 != 0) {
            if (class_244.field_1773 == null) {
                return null;
            }
            final class_310 class310;
            class_245 = (class310 = Initializer_13.class310);
        }
        if (int_1 != 0) {
            if (class_244.method_22683() == null) {
                return null;
            }
            class_245 = Initializer_13.class310;
        }
        final class_243 method_1020 = class_243.method_1020(class_245.field_1773.method_19418().method_71156());
        final Vector4f vector4f = new Vector4f((float)method_1020.field_1352, (float)method_1020.field_1351, (float)method_1020.field_1350, 1.0f);
        vector4f.mul((Matrix4fc)Initializer_13.matrix4f_1);
        vector4f.mul((Matrix4fc)Initializer_13.matrix4f);
        float method_1021;
        float n2;
        final float n = n2 = (method_1021 = fcmpg(vector4f.floatValue, 0.0f));
        if (int_1 != 0) {
            if (n <= 0) {
                return null;
            }
            final Vector4f vector4f2 = vector4f;
            vector4f2.floatValue_1 /= vector4f.floatValue;
            final Vector4f vector4f3 = vector4f;
            vector4f3.floatValue_2 /= vector4f.floatValue;
            final Vector4f vector4f4 = vector4f;
            vector4f4.floatValue /= vector4f.floatValue;
            final float n3;
            n2 = (n3 = (method_1021 = fcmpg(vector4f.floatValue, -1.0f)));
        }
        if (int_1 != 0) {
            if (n < 0) {
                return null;
            }
            method_1021 = (n2 = fcmpl(vector4f.floatValue, 1.0f));
        }
        if (int_1 != 0) {
            if (n2 > 0) {
                return null;
            }
            method_1021 = Initializer_13.class310.method_22683().method_4486();
        }
        return new Vector4f((vector4f.floatValue_1 * 0.5f + 0.5f) * method_1021, (1.0f - (vector4f.floatValue_2 * 0.5f + 0.5f)) * Initializer_13.class310.method_22683().method_4502(), vector4f.floatValue, vector4f.floatValue);
    }
    
    public static boolean checkVector4f(final Vector4f vector4f) {
        if (vector4f == null) {
            return false;
        }
        final int method_4486 = Initializer_13.class310.method_22683().method_4486();
        final int method_4487 = Initializer_13.class310.method_22683().method_4502();
        return vector4f.floatValue_1 >= 0.0f && vector4f.floatValue_1 <= method_4486 && vector4f.floatValue_2 >= 0.0f && vector4f.floatValue_2 <= method_4487 && vector4f.floatValue >= -1.0f && vector4f.floatValue <= 1.0f;
    }
    
    static {
        class310 = class_310.method_1551();
        Initializer_13.matrix4f = new Matrix4f();
        Initializer_13.matrix4f_1 = new Matrix4f();
    }
}
