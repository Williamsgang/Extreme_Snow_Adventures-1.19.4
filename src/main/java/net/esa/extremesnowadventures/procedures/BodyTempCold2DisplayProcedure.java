package net.esa.extremesnowadventures.procedures;

import net.esa.extremesnowadventures.network.ModVariables;
import net.minecraft.world.entity.Entity;

public class BodyTempCold2DisplayProcedure {
    public static boolean execute(Entity entity) {
        if (entity == null)
            return false;
		return (entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ModVariables.PlayerVariables())).body_temp == -2;
	}
}
