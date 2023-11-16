package net.esa.extremesnowadventures.common.block;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.registries.ForgeRegistries;

public class SnowyDirtBlock extends Block {
    public SnowyDirtBlock() {
        super(Properties.of(Material.DIRT)
                .sound(new ForgeSoundType(1.0f, 1.0f,
                        () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.rooted_dirt.break")),
                        () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.snow.step")),
                        () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.rooted_dirt.place")),
                        () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.rooted_dirt.hit")),
                        () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.rooted_dirt.fall"))))
                .strength(1f, 10f));
    }
}
