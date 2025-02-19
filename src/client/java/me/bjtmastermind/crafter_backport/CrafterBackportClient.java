package me.bjtmastermind.crafter_backport;

import me.bjtmastermind.crafter_backport.gui.screen.ingame.CrafterScreen;
import me.bjtmastermind.crafter_backport.registry.ClientModParticles;
import me.bjtmastermind.crafter_backport.registry.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class CrafterBackportClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.CRAFTER_3X3, CrafterScreen::new);
        ClientModParticles.registerParticles();
    }
}
