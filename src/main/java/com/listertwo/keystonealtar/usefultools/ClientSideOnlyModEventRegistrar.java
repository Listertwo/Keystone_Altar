package com.listertwo.keystonealtar.usefultools;

import net.minecraftforge.eventbus.api.IEventBus;

public class ClientSideOnlyModEventRegistrar {
    private final IEventBus eventBus;

    public ClientSideOnlyModEventRegistrar(IEventBus eventBus){
        this.eventBus = eventBus;
    }

    public void registerClientOnlyEvents(){

    }
}
