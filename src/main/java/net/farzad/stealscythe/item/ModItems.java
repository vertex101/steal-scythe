package net.farzad.stealscythe.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;


import net.farzad.stealscythe.StealScythe;

import net.farzad.stealscythe.item.custom.ModToolMaterial;
import net.minecraft.item.Item;

import net.minecraft.item.SwordItem;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SCYTHE = RegisterItem("scythe",
            new SwordItem(ModToolMaterial.STEAL, 5, -3f, new FabricItemSettings()));
    public static final Item[] bigItems = {SCYTHE};

    public static final Item STEAL = RegisterItem("steal", new Item(new FabricItemSettings()));

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(StealScythe.MOD_ID, name), item);
    }

    public static void registerModItems () {
        StealScythe.LOGGER.info("Registering Items For" + StealScythe.MOD_ID);

    }


}
