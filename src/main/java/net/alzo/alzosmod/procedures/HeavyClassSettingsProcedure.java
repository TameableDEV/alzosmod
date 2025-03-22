package net.alzo.alzosmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.Entity;

import net.alzo.alzosmod.network.AlzosModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HeavyClassSettingsProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AlzosModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlzosModModVariables.PlayerVariables())).PlayerOrigin == 3) {
			entity.getPersistentData().putBoolean("mod:primary", false);
		}
	}
}
