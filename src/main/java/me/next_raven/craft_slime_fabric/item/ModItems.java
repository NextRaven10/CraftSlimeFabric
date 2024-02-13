package me.next_raven.craft_slime_fabric.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.*;
import net.minecraft.*;
import me.next_raven.craft_slime_fabric.CraftSlimeFabric;
import me.next_raven.craft_slime_fabric.item.ModItems;
import net.minecraft.registry.Registry;

import static net.minecraft.item.Items.BUCKET;

public class ModItems {

    public static final Item pestle = registerItem("pestle",
            new Item(new FabricItemSettings()));

    public static final Item mortar = registerItem("mortar",
            new Mortar(new FabricItemSettings()));






    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CraftSlimeFabric.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CraftSlimeFabric.LOGGER.debug("Registering Mod Items for " + CraftSlimeFabric.MOD_ID);
}}
