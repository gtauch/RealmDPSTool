package main;

import java.util.EnumMap;

import enums.Ability;
import enums.Armor;
import enums.Enchantment;
import enums.Ring;
import enums.Stat;
import enums.Weapon;

public class Player {
	
	Classes classChoice;
	Weapon weapon;
	Ability ability;
	Armor armor;
	Ring ring;
	
    EnumMap<Stat, Double> stats;
    
    Player(Classes classIn){
    	classChoice = classIn;
    	weapon = Weapon.None;
    	ability = Ability.None;
    	armor = Armor.None;
    	ring = Ring.None;

        stats = new EnumMap<>(Stat.class);
        for (Stat stat : Stat.values()) {
            stats.put(stat, classChoice.stats.get(stat).doubleValue());
        }
	}
    
    public Double getStat(Stat stat) {
        return stats.get(stat);
    }

    public void setStat(Stat stat, double value) {
        stats.put(stat, value);
    }
    
    public void recalculateStats() {
    	stats.clear();
    	stats.putAll(classChoice.stats);
    	
    	for (Stat stat : weapon.getStats().keySet()) {
    		setStat(stat, getStat(stat) + weapon.getStats().get(stat));
    	}
    	for (Stat stat : ability.getStats().keySet()) {
    		setStat(stat, getStat(stat) + ability.getStats().get(stat));
    	}
    	for (Stat stat : armor.getStats().keySet()) {
    		setStat(stat, getStat(stat) + armor.getStats().get(stat));
    	}
    	for (Stat stat : ring.getStats().keySet()) {
    		setStat(stat, getStat(stat) + ring.getStats().get(stat));
    	}
    	
    	for (Enchantment enchant : ability.getEnchantments()) {
    		enchant.apply(this);
    	}
    	for (Enchantment enchant : armor.getEnchantments()) {
    		enchant.apply(this);
    	}
    	for (Enchantment enchant : weapon.getEnchantments()) {
    		enchant.apply(this);
    	}
    	for (Enchantment enchant : ring.getEnchantments()) {
    		enchant.apply(this);
    	}
    	
    }

	public double getBonusStat(Stat stat) {       
        return stats.get(stat) - classChoice.stats.get(stat);
	}
}
