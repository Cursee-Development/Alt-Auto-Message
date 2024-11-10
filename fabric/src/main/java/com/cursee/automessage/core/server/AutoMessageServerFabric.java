package com.cursee.automessage.core.server;

import net.fabricmc.api.DedicatedServerModInitializer;

public class AutoMessageServerFabric implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        AutoMessageServer.setup();
    }
}
