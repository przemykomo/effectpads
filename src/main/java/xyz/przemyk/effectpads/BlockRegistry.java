package xyz.przemyk.effectpads;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.przemyk.effectpads.blocks.*;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EffectPads.MODID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<JumpPadBlock> JUMP_PAD = BLOCKS.register("jump_pad", () -> new JumpPadBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid().hardnessAndResistance(0.6F), 1.0F));
    public static final RegistryObject<JumpPadBlock> JUMP_PAD_2 = BLOCKS.register("jump_pad_2", () -> new JumpPadBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid().hardnessAndResistance(0.6F), 1.1F));
    public static final RegistryObject<JumpPadBlock> JUMP_PAD_3 = BLOCKS.register("jump_pad_3", () -> new JumpPadBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid().hardnessAndResistance(0.6F), 1.3F));
    public static final RegistryObject<JumpPadBlock> JUMP_PAD_4 = BLOCKS.register("jump_pad_4", () -> new JumpPadBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid().hardnessAndResistance(0.6F), 1.5F));

    public static final RegistryObject<PadBlock> SPEED_PAD = BLOCKS.register("speed_pad", () -> new PadBlock(AbstractBlock.Properties.create(Material.ICE).speedFactor(1.5F).hardnessAndResistance(0.8F)));
    public static final RegistryObject<PadBlock> SLOW_PAD = BLOCKS.register("slow_pad", () -> new PadBlock(AbstractBlock.Properties.create(Material.SAND, MaterialColor.BROWN).speedFactor(0.4F).hardnessAndResistance(0.5F).sound(SoundType.SOUL_SAND)));

    public static final RegistryObject<LandingPadBlock> LANDING_PAD = BLOCKS.register("landing_pad", () -> new LandingPadBlock(AbstractBlock.Properties.create(Material.WOOL).hardnessAndResistance(0.8F).sound(SoundType.CLOTH)));

    public static final RegistryObject<CactusPadBlock> CACTUS_PAD = BLOCKS.register("cactus_pad", () -> new CactusPadBlock(AbstractBlock.Properties.create(Material.CACTUS).hardnessAndResistance(0.4F).sound(SoundType.CLOTH)));
    public static final RegistryObject<MagmaPadBlock> MAGMA_PAD = BLOCKS.register("magma_pad", () -> new MagmaPadBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).setLightLevel(blockState -> 3).tickRandomly().hardnessAndResistance(0.5F)));
}
