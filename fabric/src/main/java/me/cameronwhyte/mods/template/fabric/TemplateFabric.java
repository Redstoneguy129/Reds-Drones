package me.cameronwhyte.mods.template.fabric;

import me.cameronwhyte.mods.template.Template;
import net.fabricmc.api.ModInitializer;

public class TemplateFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Template.init();
    }
}
