package net.alzo.alzosmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.alzo.alzosmod.network.AlzosModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GamblerBeginnersLuckProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AlzosModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlzosModModVariables.PlayerVariables())).PlayerOrigin == 1) {
			if (Mth.nextDouble(RandomSource.create(), 1, 6) <= 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 36000, 5, false, false));
			} else if (Mth.nextDouble(RandomSource.create(), 1, 6) <= 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 36000, 2, false, false));
			} else if (Mth.nextDouble(RandomSource.create(), 1, 6) <= 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 36000, 5, false, false));
			} else if (Mth.nextDouble(RandomSource.create(), 1, 6) <= 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 36000, 3, false, false));
			} else if (Mth.nextDouble(RandomSource.create(), 1, 6) <= 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 36000, 3, false, false));
			} else if (Mth.nextDouble(RandomSource.create(), 1, 6) <= 6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 36000, 1, false, false));
			}
		}
	}
}
