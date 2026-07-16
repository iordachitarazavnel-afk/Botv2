// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub1.sub5.sub5.RenderVImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.class_1799;
import java.lang.reflect.Field;
import net.minecraft.class_759;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_759.class })
public class Initializer_8
{
    private static Field[] FieldArray;
    
    private static Field[] getFields() {
        if (Initializer_8.FieldArray == null) {
            try {
                final Field[] declaredFields = class_759.class.getDeclaredFields();
                final Field[] array = new Field[4];
                final Field[] array2 = new Field[2];
                int n = 0;
                int n2 = 0;
                for (final Field field : declaredFields) {
                    Label_0119: {
                        Label_0096: {
                            Label_0081: {
                                try {
                                    field.setAccessible(true);
                                    if (field.getType() != Float.TYPE) {
                                        break Label_0096;
                                    }
                                    final int n3 = n;
                                    final int n4 = 4;
                                    if (n3 < n4) {
                                        break Label_0081;
                                    }
                                    break Label_0096;
                                }
                                catch (final Exception ex) {
                                    throw computeException(ex);
                                }
                                try {
                                    final int n3 = n;
                                    final int n4 = 4;
                                    if (n3 < n4) {
                                        array[n++] = field;
                                        break Label_0119;
                                    }
                                }
                                catch (final Exception ex2) {
                                    throw computeException(ex2);
                                }
                            }
                            try {
                                if (field.getType() != class_1799.class) {
                                    break Label_0119;
                                }
                                final int n5 = n2;
                                final int n6 = 2;
                                if (n5 < n6) {
                                    break Label_0119;
                                }
                                break Label_0119;
                            }
                            catch (final Exception ex3) {
                                throw computeException(ex3);
                            }
                        }
                        try {
                            final int n5 = n2;
                            final int n6 = 2;
                            if (n5 < n6) {
                                array2[n2++] = field;
                            }
                        }
                        catch (final Exception ex4) {
                            throw computeException(ex4);
                        }
                    }
                }
                Initializer_8.FieldArray = new Field[] { array[0], array[1], array[2], array[3], array2[0], array2[1] };
            }
            catch (final Exception ex5) {
                Initializer_8.FieldArray = new Field[0];
            }
        }
        return Initializer_8.FieldArray;
    }
    
    @Inject(method = { "method_3220" }, at = { @At("HEAD") }, cancellable = true)
    private void onUpdateHeldItems(final CallbackInfo callbackInfo) {
        try {
            if (RenderVImpl.isEnabled()) {
                final Field[] fields = getFields();
                if (fields.length >= 6) {
                    final class_759 class_759 = (class_759)this;
                    fields[0].setFloat(class_759, 1.0f);
                    fields[1].setFloat(class_759, 1.0f);
                    fields[2].setFloat(class_759, 1.0f);
                    fields[3].setFloat(class_759, 1.0f);
                    final class_310 method_1551 = class_310.method_1551();
                    try {
                        if (method_1551.field_1724 != null) {
                            fields[4].set(class_759, method_1551.field_1724.method_6047());
                            fields[5].set(class_759, method_1551.field_1724.method_6079());
                        }
                    }
                    catch (final Exception ex) {
                        throw computeException(ex);
                    }
                }
                callbackInfo.cancel();
            }
        }
        catch (final Exception ex2) {}
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
}
