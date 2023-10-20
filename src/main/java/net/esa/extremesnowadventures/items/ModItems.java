package net.esa.extremesnowadventures.items;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        ExtremeSnowAdventures.MOD_ID);

        public static final RegistryObject<Item> BLACK_PROCESSED_WOOL = ITEMS.register("blackprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BLUE_PROCESSED_WOOL = ITEMS.register("blueprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BROWN_PROCESSED_WOOL = ITEMS.register("brownprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CYAN_PROCESSED_WOOL = ITEMS.register("cyanprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GRAY_PROCESSED_WOOL = ITEMS.register("grayprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GREEN_PROCESSED_WOOL = ITEMS.register("greenprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LIGHT_BLUE_PROCESSED_WOOL = ITEMS.register("lightblueprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LIGHT_GRAY_PROCESSED_WOOL = ITEMS.register("lightgrayprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LIGHT_PINK_PROCESSED_WOOL = ITEMS.register("lightpinkprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LIME_PROCESSED_WOOL = ITEMS.register("limeprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MAGENTA_PROCESSED_WOOL = ITEMS.register("magentaprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ORANGE_PROCESSED_WOOL = ITEMS.register("orangeprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PURPLE_PROCESSED_WOOL = ITEMS.register("purpleprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RED_PROCESSED_WOOL = ITEMS.register("redprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WHITE_PROCESSED_WOOL = ITEMS.register("whiteprocessedwool",
                        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> YELLOW_PROCESSED_WOOL = ITEMS.register("yellowprocessedwool",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> HOT_COCOA = ITEMS.register("hotcocoa", () -> new HotCocoa());

        public static final RegistryObject<Item> WHITE_WINTER_CAP = ITEMS.register("whitewintercap",
                () -> new ArmorItem(ModArmorMaterials.WHITE_PROCESSED_WOOL, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> WHITE_WINTER_COAT = ITEMS.register("whitewintercoat",
                () -> new ArmorItem(ModArmorMaterials.WHITE_PROCESSED_WOOL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> WHITE_WINTER_PANTS = ITEMS.register("whitewinterpants",
                () -> new ArmorItem(ModArmorMaterials.WHITE_PROCESSED_WOOL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> WHITE_WINTER_BOOTS = ITEMS.register("whitewinterboots",
                () -> new ArmorItem(ModArmorMaterials.WHITE_PROCESSED_WOOL, ArmorItem.Type.BOOTS, new Item.Properties()));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
