// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub5;

import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;
import net.minecraft.class_327$class_6415;
import org.joml.Matrix4f;
import net.minecraft.class_4597;
import net.minecraft.class_327;

public class Initializer_1
{
    public static void processAll(final class_327 class_327, final String s, final class_4597 class_328) {
        final Initializer[] syncaarrArray = class_437Sub.getSyncaarrArray();
        class_327.method_27521(s, 0.0f, 0.0f, 16777215, false, new Matrix4f(), class_328, class_327$class_6415.field_33993, 0, 15728880);
        if (syncaarrArray != null) {
            int int_1 = Initializer.getInt_1();
            Initializer.setInt(++int_1);
        }
    }
}
