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
		double PositiveEffectRoll1 = 0;
		double NegativeEffectRoll1 = 0;
		double PositiveEffectRoll2 = 0;
		double NegativeEffectRoll2 = 0;
		if ((entity.getCapability(AlzosModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlzosModModVariables.PlayerVariables())).PlayerOrigin == 1) {
			PositiveEffectRoll1 = Mth.nextDouble(RandomSource.create(), 1, 10);
			PositiveEffectRoll2 = Mth.nextDouble(RandomSource.create(), 1, 10);
			NegativeEffectRoll1 = Mth.nextDouble(RandomSource.create(), 1, 10);
			NegativeEffectRoll2 = Mth.nextDouble(RandomSource.create(), 1, 10);
			if (PositiveEffectRoll1 <= 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 36000, 5, true, false));
			} else if (PositiveEffectRoll1 <= 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 36000, 2, true, false));
			} else if (PositiveEffectRoll1 <= 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 36000, 4, true, false));
			} else if (PositiveEffectRoll1 <= 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 36000, 2, false, false));
			} else if (PositiveEffectRoll1 <= 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 36000, 3, true, false));
			} else if (PositiveEffectRoll1 <= 6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 36000, 1, true, false));
			} else if (PositiveEffectRoll1 <= 7) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 36000, 2, true, false));
			} else if (PositiveEffectRoll1 <= 8) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 36000, 1, true, false));
			} else if (PositiveEffectRoll1 <= 9) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 36000, 1, true, false));
			} else if (PositiveEffectRoll1 <= 10) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 36000, 3, true, false));
			}
			if (PositiveEffectRoll2 <= 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 36000, 5, true, false));
			} else if (PositiveEffectRoll2 <= 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 36000, 2, true, false));
			} else if (PositiveEffectRoll2 <= 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 36000, 4, true, false));
			} else if (PositiveEffectRoll2 <= 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 36000, 2, true, false));
			} else if (PositiveEffectRoll2 <= 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 36000, 3, true, false));
			} else if (PositiveEffectRoll2 <= 6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 36000, 1, true, false));
			} else if (PositiveEffectRoll2 <= 7) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 36000, 2, true, false));
			} else if (PositiveEffectRoll2 <= 8) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 36000, 1, true, false));
			} else if (PositiveEffectRoll2 <= 9) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 36000, 1, true, false));
			} else if (PositiveEffectRoll2 <= 10) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 36000, 3, true, false));
			}
			if (NegativeEffectRoll1 <= 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 36000, 5, true, false));
			} else if (NegativeEffectRoll1 <= 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 36000, 2, true, false));
			} else if (NegativeEffectRoll1 <= 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 36000, 4, true, false));
			} else if (NegativeEffectRoll1 <= 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 36000, 2, false, false));
			} else if (NegativeEffectRoll1 <= 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 36000, 3, true, false));
			} else if (NegativeEffectRoll1 <= 6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 36000, 5, true, false));
			} else if (NegativeEffectRoll1 <= 7) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 36000, 2, true, false));
			} else if (NegativeEffectRoll1 <= 8) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 36000, 3, true, false));
			} else if (NegativeEffectRoll1 <= 9) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 36000, 1, true, false));
			} else if (NegativeEffectRoll1 <= 10) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 36000, 3, true, false));
			}
			if (NegativeEffectRoll2 <= 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 36000, 5, true, false));
			} else if (NegativeEffectRoll2 <= 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 36000, 2, true, false));
			} else if (NegativeEffectRoll2 <= 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 36000, 4, true, false));
			} else if (NegativeEffectRoll2 <= 4) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 36000, 2, false, false));
			} else if (NegativeEffectRoll2 <= 5) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 36000, 3, true, false));
			} else if (NegativeEffectRoll2 <= 6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 36000, 5, true, false));
			} else if (NegativeEffectRoll2 <= 7) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 36000, 2, true, false));
			} else if (NegativeEffectRoll2 <= 8) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 36000, 3, true, false));
			} else if (NegativeEffectRoll2 <= 9) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 36000, 1, true, false));
			} else if (NegativeEffectRoll2 <= 10) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 36000, 3, true, false));
			}
		}
	}
}
