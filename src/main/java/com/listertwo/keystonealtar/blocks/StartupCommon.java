package com.listertwo.keystonealtar.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class StartupCommon {
    public static KeystoneAltarBlock keystoneAltarBlock;
    public static BlockItem keystoneAltarItem;

    @SubscribeEvent
    public static void onBlocksRegistration(final RegistryEvent.Register<Block> blockRegisterEvent){
        keystoneAltarBlock = (KeystoneAltarBlock)(new KeystoneAltarBlock().setRegistryName("keystonealtar","keystone_altar"));
        blockRegisterEvent.getRegistry().register(keystoneAltarBlock);
    }

    @SubscribeEvent
    public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent){

        Item.Properties itemSimpleProperties = new Item.Properties().tab(ItemGroup.TAB_DECORATIONS);
        keystoneAltarItem = new BlockItem(keystoneAltarBlock, itemSimpleProperties);
        keystoneAltarItem.setRegistryName(keystoneAltarBlock.getRegistryName());
        itemRegisterEvent.getRegistry().register(keystoneAltarItem);
    }

    @SubscribeEvent
    public static void onCommonSetupEvent(FMLCommonSetupEvent event){

    }
}
