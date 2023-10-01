package net.esa.extremesnowadventures.items;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExtremeSnowAdventures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTab {
    public static CreativeModeTab ESA_ITEM_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        ESA_ITEM_TAB = event.registerCreativeModeTab(new ResourceLocation(ExtremeSnowAdventures.MOD_ID, "item_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.WHITE_PROCESSED_WOOL.get()))
                        .title(Component.translatable("creativemodetab.item_tab")));
    }
}
