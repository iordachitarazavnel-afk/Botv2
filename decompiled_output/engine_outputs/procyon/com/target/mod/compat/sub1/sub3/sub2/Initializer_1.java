// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub2;

import com.target.mod.compat.sub1.sub2.sub1.sub1.Initializer;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_12;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_13;
import org.joml.Matrix4fc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.joml.Vector4f;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import org.joml.Matrix4f;
import net.minecraft.class_4184;
import net.minecraft.class_9779;
import net.minecraft.class_9922;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_761.class })
public class Initializer_1
{
    @Inject(method = { "method_22710" }, at = { @At("HEAD") })
    private void onRenderHead(final class_9922 class_9922, final class_9779 class_9923, final boolean b, final class_4184 class_9924, final Matrix4f matrix4f, final Matrix4f matrix4f2, final Matrix4f matrix4f3, final GpuBufferSlice gpuBufferSlice, final Vector4f vector4f, final boolean b2, final CallbackInfo callbackInfo) {
        Initializer_13.setMatrix4fAndMatrix4f(new Matrix4f((Matrix4fc)matrix4f2), new Matrix4f((Matrix4fc)matrix4f));
    }
    
    @Inject(method = { "method_22710" }, at = { @At("TAIL") })
    private void onRender(final class_9922 class_9922, final class_9779 class_9923, final boolean b, final class_4184 class_9924, final Matrix4f matrix4f, final Matrix4f matrix4f2, final Matrix4f matrix4f3, final GpuBufferSlice gpuBufferSlice, final Vector4f vector4f, final boolean b2, final CallbackInfo callbackInfo) {
        if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.isEnabled()) {
            Initializer.setBindc(new BindCSub_12(1.0f));
        }
    }
}
