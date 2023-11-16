package net.esa.extremesnowadventures.init;

import net.esa.extremesnowadventures.core.ExtremeSnowAdventures;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, ExtremeSnowAdventures.MOD_ID);
    public static final RegistryObject<Potion> GLASS_OF_WATER = POTIONS.register("glass_of_water", () -> new Potion());

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}