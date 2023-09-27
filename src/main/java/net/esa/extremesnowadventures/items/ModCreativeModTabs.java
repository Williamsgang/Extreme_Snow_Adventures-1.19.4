package net.esa.extremesnowadventures.items;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = ExtremeSnowAdventures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModTabs {
    public static CreativeModeTab ESA_ITEM_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        ESA_ITEM_TAB = event.registerCreativeModeTab(new ResourceLocation(ExtremeSnowAdventures.MOD_ID, "esa_item_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.HOT_COCOA.get()))
                        .title(Component.translatable("creativemodetab.esa_item_tab")));
    }
}
