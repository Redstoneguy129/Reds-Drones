package me.cameronwhyte.mods.template.forge;

import me.cameronwhyte.mods.template.Template;
import net.minecraftforge.fml.common.Mod;

@Mod(Template.MOD_ID)
public class TemplateForge {
    public TemplateForge() {
        Template.init();
    }
}
