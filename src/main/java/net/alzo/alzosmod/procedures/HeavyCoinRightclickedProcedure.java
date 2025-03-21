package net.alzo.alzosmod.procedures;

import net.minecraft.world.entity.Entity;

import net.alzo.alzosmod.network.AlzosModModVariables;

public class HeavyCoinRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 3;
			entity.getCapability(AlzosModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PlayerOrigin = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
