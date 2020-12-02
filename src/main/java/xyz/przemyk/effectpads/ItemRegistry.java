package xyz.przemyk.effectpads;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EffectPads.MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final ItemGroup PADS_ITEM_GROUP = new ItemGroup(EffectPads.MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(JUMP_PAD.get());
        }
    };

    public static final RegistryObject<BlockItem> JUMP_PAD = ITEMS.register("jump_pad", () -> new BlockItem(BlockRegistry.JUMP_PAD.get(), new Item.Properties().group(PADS_ITEM_GROUP)));
    public static final RegistryObject<BlockItem> JUMP_PAD_2 = ITEMS.register("jump_pad_2", () -> new BlockItem(BlockRegistry.JUMP_PAD_2.get(), new Item.Properties().group(PADS_ITEM_GROUP)));
    public static final RegistryObject<BlockItem> JUMP_PAD_3 = ITEMS.register("jump_pad_3", () -> new BlockItem(BlockRegistry.JUMP_PAD_3.get(), new Item.Properties().group(PADS_ITEM_GROUP)));
    public static final RegistryObject<BlockItem> JUMP_PAD_4 = ITEMS.register("jump_pad_4", () -> new BlockItem(BlockRegistry.JUMP_PAD_4.get(), new Item.Properties().group(PADS_ITEM_GROUP)));

    public static final RegistryObject<BlockItem> SPEED_PAD = ITEMS.register("speed_pad", () -> new BlockItem(BlockRegistry.SPEED_PAD.get(), new Item.Properties().group(PADS_ITEM_GROUP)));
    public static final RegistryObject<BlockItem> SLOW_PAD = ITEMS.register("slow_pad", () -> new BlockItem(BlockRegistry.SLOW_PAD.get(), new Item.Properties().group(PADS_ITEM_GROUP)));

    public static final RegistryObject<BlockItem> LANDING_PAD = ITEMS.register("landing_pad", () -> new BlockItem(BlockRegistry.LANDING_PAD.get(), new Item.Properties().group(PADS_ITEM_GROUP)));

    public static final RegistryObject<BlockItem> CACTUS_PAD = ITEMS.register("cactus_pad", () -> new BlockItem(BlockRegistry.CACTUS_PAD.get(), new Item.Properties().group(PADS_ITEM_GROUP)));
    public static final RegistryObject<BlockItem> MAGMA_PAD = ITEMS.register("magma_pad", () -> new BlockItem(BlockRegistry.MAGMA_PAD.get(), new Item.Properties().group(PADS_ITEM_GROUP)));
}
