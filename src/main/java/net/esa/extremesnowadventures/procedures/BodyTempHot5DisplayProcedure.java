package net.esa.extremesnowadventures.procedures;

import net.esa.extremesnowadventures.network.ModVariables;
import net.minecraft.world.entity.Entity;


public class BodyTempHot5DisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ModVariables.PlayerVariables())).body_temp == 5) {
			return true;
		}
		return false;
	}
}
