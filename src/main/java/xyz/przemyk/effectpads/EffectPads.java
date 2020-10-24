package xyz.przemyk.effectpads;

import net.minecraftforge.fml.common.Mod;

@Mod(EffectPads.MODID)
public class EffectPads {
    public static final String MODID = "effectpads";

    public EffectPads() {
        BlockRegistry.init();
        ItemRegistry.init();
    }
}
