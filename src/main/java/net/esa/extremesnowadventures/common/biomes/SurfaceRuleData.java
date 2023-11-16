package net.esa.extremesnowadventures.common.biomes;

import net.esa.extremesnowadventures.common.block.SnowyDirtBlock;
import net.esa.extremesnowadventures.init.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class SurfaceRuleData {

    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource SNOWY_DIRT_BLOCK = makeStateRule(ModBlocks.SNOWY_DIRT_BLOCK.get());

    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, SNOWY_DIRT_BLOCK), DIRT);

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.THE_NORTH), SNOWY_DIRT_BLOCK),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.BEYOND_THE_WALL), SNOWY_DIRT_BLOCK),
          SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
