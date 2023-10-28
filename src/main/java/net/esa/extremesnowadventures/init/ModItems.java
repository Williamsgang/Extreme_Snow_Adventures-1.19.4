package net.esa.extremesnowadventures.init;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.esa.extremesnowadventures.common.item.HotCocoaItem;
import net.esa.extremesnowadventures.common.armor.WinterGearArmor;
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

        public static final RegistryObject<Item> HOT_COCOA = ITEMS.register("hotcocoa", () -> new HotCocoaItem());

        public static final RegistryObject<Item> WINTER_HELMET = ITEMS.register("winter_helmet",
                () -> new WinterGearArmor.Helmet());
        public static final RegistryObject<Item> WINTER_CHESTPLATE = ITEMS.register("winter_chestplate",
                () -> new WinterGearArmor.Chestplate());
        public static final RegistryObject<Item> WINTER_LEGGINGS = ITEMS.register("winter_leggings",
                () -> new WinterGearArmor.Leggings());
        public static final RegistryObject<Item> WINTER_BOOTS = ITEMS.register("winter_boots",
                () -> new WinterGearArmor.Boots());

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
