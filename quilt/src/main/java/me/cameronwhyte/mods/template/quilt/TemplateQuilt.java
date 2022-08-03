package me.cameronwhyte.mods.template.quilt;

import me.cameronwhyte.mods.template.Template;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class TemplateQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        Template.init();
    }
}
