
package net.alzo.alzosmod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.network.FriendlyByteBuf;

import net.alzo.alzosmod.AlzosModMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PrimaryAbilityMessage {
	int type, pressedms;

	public PrimaryAbilityMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public PrimaryAbilityMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(PrimaryAbilityMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(PrimaryAbilityMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
		});
		context.setPacketHandled(true);
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		AlzosModMod.addNetworkMessage(PrimaryAbilityMessage.class, PrimaryAbilityMessage::buffer, PrimaryAbilityMessage::new, PrimaryAbilityMessage::handler);
	}
}
