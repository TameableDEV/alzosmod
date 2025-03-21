
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.alzo.alzosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.alzo.alzosmod.item.GamblersTokenItem;
import net.alzo.alzosmod.AlzosModMod;

public class AlzosModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AlzosModMod.MODID);
	public static final RegistryObject<Item> GAMBLERS_TOKEN = REGISTRY.register("gamblers_token", () -> new GamblersTokenItem());
	// Start of user code block custom items
	// End of user code block custom items
}
