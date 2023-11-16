package net.esa.extremesnowadventures.init;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExtremeSnowAdventures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTab {
    public static final CreativeModeTab ESA_ITEM_TAB = new CreativeModeTab("esa_item_tab") {
        @Override
        public ItemStack makeIcon() {
            return null;
        }
    };

}
