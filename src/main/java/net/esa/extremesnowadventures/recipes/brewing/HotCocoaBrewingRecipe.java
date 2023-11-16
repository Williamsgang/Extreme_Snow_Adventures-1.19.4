package net.esa.extremesnowadventures.recipes.brewing;

import net.esa.extremesnowadventures.init.ModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HotCocoaBrewingRecipe implements IBrewingRecipe {

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new HotCocoaBrewingRecipe()));
    }

    @Override
    public boolean isInput(ItemStack input) {
        return Ingredient.of(new ItemStack(Items.MILK_BUCKET)).test(input);
    }

    @Override
    public boolean isIngredient(ItemStack ingredient) {
        return Ingredient.of(new ItemStack(Items.COCOA_BEANS)).test(ingredient);
    }

    @Override
    public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
        if (isInput(input) && isIngredient(ingredient)) {
            return new ItemStack(ModItems.HOT_COCOA.get());
        }
        return ItemStack.EMPTY;
    }

}