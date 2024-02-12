package com.example.examplemod.item;
import com.example.examplemod.ExampleMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DaggerItems{
    // List of objects to load via Forge
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    // Add item
    public static final RegistryObject<Item> STONE_DAGGER = ITEMS.register("stone_dagger", () -> new Item(new Item.Properties()));

    // Register IEventBus objects
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
