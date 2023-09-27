package net.esa.extremesnowadventures.items;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExtremeSnowAdventures.MOD_ID);

    public static final RegistryObject<Item> WHITE_PROCESSED_WOOL = ITEMS.register("white_processed_wool",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_PROCESSED_WOOL = ITEMS.register("red_processed_wool",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOT_COCOA = ITEMS.register("hot_cocoa",
            () -> new HotCocoa());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
