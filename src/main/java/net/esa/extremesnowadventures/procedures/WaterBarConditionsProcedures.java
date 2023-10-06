package net.esa.extremesnowadventures.procedures;

import net.esa.extremesnowadventures.network.ModVariables;
import net.minecraft.world.entity.Entity;

public class WaterBarConditionsProcedures {
    private static ModVariables.PlayerVariables getPlayerVariables(Entity entity) {
        if (entity == null) {
            return new ModVariables.PlayerVariables();
        }
        return entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ModVariables.PlayerVariables());
    }

    public static boolean executeWaterBarCondition(int lowerBound, int upperBound, Entity entity) {
        ModVariables.PlayerVariables playerVariables = getPlayerVariables(entity);
        return playerVariables.water_bar > lowerBound && playerVariables.water_bar < upperBound;
    }

    public static boolean executeWaterBarConditionUpper(int upperBound, Entity entity) {
        ModVariables.PlayerVariables playerVariables = getPlayerVariables(entity);
        return playerVariables.water_bar < upperBound;
    }
}
