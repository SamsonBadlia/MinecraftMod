package com.Samson.attemptone.init;

import com.Samson.attemptone.attemptone;
import com.google.common.base.Supplier;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, attemptone.MOD_ID);
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item",
			() -> new Item(new Item.Properties().tab(attemptone.TUTORIAL_TAB)));
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
		return ITEMS.register(name, item);
	}
	
}
