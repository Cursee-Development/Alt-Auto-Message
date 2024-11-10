package com.cursee.automessage.core.client;

import net.fabricmc.api.ClientModInitializer;

public class AutoMessageClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AutoMessageClient.setup();
    }
}
