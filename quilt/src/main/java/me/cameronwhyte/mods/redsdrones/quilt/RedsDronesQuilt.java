package me.cameronwhyte.mods.redsdrones.quilt;

import me.cameronwhyte.mods.redsdrones.RedsDrones;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class RedsDronesQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        RedsDrones.init();
    }
}
