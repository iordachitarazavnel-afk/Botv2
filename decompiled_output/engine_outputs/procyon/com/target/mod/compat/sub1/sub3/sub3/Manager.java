// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.gen.Invoker;
import net.minecraft.class_312;
import com.mojang.authlib.yggdrasil.ProfileResult;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_7574;
import net.minecraft.class_7853;
import net.minecraft.class_5520;
import com.mojang.authlib.minecraft.UserApiService;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.class_320;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_310.class })
public interface Manager
{
    @Accessor("field_1726")
    class_320 getSession();
    
    @Accessor("field_1726")
    @Mutable
    void mc$setSession(final class_320 p0);
    
    @Accessor("field_26902")
    @Mutable
    void mc$setUserApiService(final UserApiService p0);
    
    @Accessor("field_26842")
    @Mutable
    void mc$setSocialInteractionsManager(final class_5520 p0);
    
    @Accessor("field_39068")
    @Mutable
    void mc$setProfileKeys(final class_7853 p0);
    
    @Accessor("field_39492")
    @Mutable
    void mc$setAbuseReportContext(final class_7574 p0);
    
    @Accessor("field_45899")
    @Mutable
    void mc$setGameProfileFuture(final CompletableFuture<ProfileResult> p0);
    
    @Accessor("field_1729")
    class_312 getMouse();
    
    @Invoker("method_1536")
    boolean isEnabled();
    
    @Invoker("method_1583")
    void iDIU();
}
