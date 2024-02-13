package me.next_raven.craft_slime_fabric.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Mortar extends Item {
    public Mortar(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return stack.copy();
    }
}
