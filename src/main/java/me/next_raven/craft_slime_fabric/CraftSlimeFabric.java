package me.next_raven.craft_slime_fabric;

import me.next_raven.craft_slime_fabric.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CraftSlimeFabric implements ModInitializer {

    public static final String MOD_ID = "craft_slime_fabric";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public void onInitialize() {
        ModItems.registerModItems();

    }
}
