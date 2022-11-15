package com.listertwo.keystonealtar;

import com.listertwo.keystonealtar.blocks.KeystoneAltarBlock;
import com.listertwo.keystonealtar.blocks.StartupCommon;
import com.listertwo.keystonealtar.usefultools.ClientSideOnlyModEventRegistrar;
import com.listertwo.keystonealtar.usefultools.debugging.ForgeLoggerTweaker;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.Level;

@Mod(KeystoneAltar.MODID)
public class KeystoneAltar {
    public static final String MODID = "keystonealtar";

    public KeystoneAltar() {
        final boolean HIDE_CONSOLE_NOISE = false;
        if (HIDE_CONSOLE_NOISE) {
            ForgeLoggerTweaker.setMinimumLevel(Level.WARN);
            ForgeLoggerTweaker.applyLoggerFilter();
        }

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        final ClientSideOnlyModEventRegistrar clientSideOnlyModEventRegistrar = new ClientSideOnlyModEventRegistrar(modEventBus);

        registerCommonEvents(modEventBus);
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> clientSideOnlyModEventRegistrar::registerClientOnlyEvents);
    }

    public void registerCommonEvents(IEventBus eventBus) {
        eventBus.register(StartupCommon.class);

    }
}