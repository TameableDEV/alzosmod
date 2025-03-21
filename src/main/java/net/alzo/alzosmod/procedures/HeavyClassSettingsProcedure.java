package net.alzo.alzosmod.procedures;

import net.minecraft.world.entity.Entity;

public class HeavyClassSettingsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (true) {
			entity.getPersistentData().putBoolean("mod:primary", false);
		}
	}
}
