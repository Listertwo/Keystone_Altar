package com.listertwo.keystonealtar.blocks;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class StartupClientOnly {
    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event){
        RenderTypeLookup.setRenderLayer(StartupCommon.keystoneAltarBlock, RenderType.solid());
    }
}
