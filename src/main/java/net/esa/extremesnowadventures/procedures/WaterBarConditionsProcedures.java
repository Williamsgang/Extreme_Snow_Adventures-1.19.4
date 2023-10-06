package net.esa.extremesnowadventures.procedures;

import net.esa.extremesnowadventures.network.ModVariables;
import net.minecraft.world.entity.Entity;

public class WaterBarConditionsProcedures {
    public static boolean executeWaterBarCondition0(Entity entity) {
        if (entity == null)
            return false;
        return (entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ModVariables.PlayerVariables())).water_bar < 1;
    }

    public static boolean executeWaterBarCondition1(Entity entity) {
        if (entity == null)
            return false;
        return entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar > 1
                && entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar < 2;
    }
    public static boolean executeWaterBarCondition2(Entity entity) {
        if (entity == null)
            return false;
        return entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar > 2
                && entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar < 3;
    }
    public static boolean executeWaterBarCondition3(Entity entity) {
        if (entity == null)
            return false;
        return entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar > 3
                && entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar < 4;
    }
    public static boolean executeWaterBarCondition4(Entity entity) {
        if (entity == null)
            return false;
        return entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar > 4
                && entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar < 5;
    }
    public static boolean executeWaterBarCondition5(Entity entity) {
        if (entity == null)
            return false;
        return entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar > 5
                && entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar < 6;
    }
    public static boolean executeWaterBarCondition6(Entity entity) {
        if (entity == null)
            return false;
        return entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar > 6
                && entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar < 7;
    }
    public static boolean executeWaterBarCondition7(Entity entity) {
        if (entity == null)
            return false;
        return entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar > 7
                && entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar < 8;
    }
    public static boolean executeWaterBarCondition8(Entity entity) {
        if (entity == null)
            return false;
        return entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar > 8
                && entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar < 9;
    }
    public static boolean executeWaterBarCondition9(Entity entity) {
        if (entity == null)
            return false;
        return entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar > 9
                && entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar < 10;
    }
    public static boolean executeWaterBarCondition10(Entity entity) {
        if (entity == null)
            return false;
        return entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new ModVariables.PlayerVariables()).water_bar > 10;
    }
}
