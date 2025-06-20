package a;

import java.util.LinkedList;

public interface Enchantable {
    LinkedList<Enchantment> getEnchantments();

    default void addEnchantment(Enchantment enchant, int tier) {
        enchant.tier = tier;
        getEnchantments().add(enchant);
    }
}
