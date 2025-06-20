package main;

import java.util.LinkedList;

import enums.Enchantment;

public interface Enchantable {
    LinkedList<Enchantment> getEnchantments();

    default void addEnchantment(Enchantment enchant, int tier) {
        enchant.setTier(tier);
        getEnchantments().add(enchant);
    }
}
