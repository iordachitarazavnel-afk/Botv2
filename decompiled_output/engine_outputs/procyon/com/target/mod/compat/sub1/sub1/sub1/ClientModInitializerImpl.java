// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub1;

import net.minecraft.class_310;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.api.ClientModInitializer;

public final class ClientModInitializerImpl implements ClientModInitializer
{
    public void onInitializeClient() {
        ClientLifecycleEvents.CLIENT_STARTED.register((Object)ClientModInitializerImpl::lambda$onInitializeClient$0);
    }
    
    private static void lambda$onInitializeClient$0(final class_310 class_310) {
        new Initializer_1();
    }
}
