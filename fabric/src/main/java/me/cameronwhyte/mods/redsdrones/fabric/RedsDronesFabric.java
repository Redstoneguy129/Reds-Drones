package me.cameronwhyte.mods.redsdrones.fabric;

import me.cameronwhyte.mods.redsdrones.RedsDrones;
import net.fabricmc.api.ModInitializer;

public class RedsDronesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        RedsDrones.init();
    }
}
