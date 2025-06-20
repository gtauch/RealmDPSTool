package a;

import java.util.EnumMap;

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
    	
    	for (Stat stat : weapon.stats.keySet()) {
    		setStat(stat, getStat(stat) + weapon.stats.get(stat));
    	}
    	for (Stat stat : ability.stats.keySet()) {
    		setStat(stat, getStat(stat) + ability.stats.get(stat));
    	}
    	for (Stat stat : armor.stats.keySet()) {
    		setStat(stat, getStat(stat) + armor.stats.get(stat));
    	}
    	for (Stat stat : ring.stats.keySet()) {
    		setStat(stat, getStat(stat) + ring.stats.get(stat));
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

	double getBonusStat(Stat stat) {       
        return stats.get(stat) - classChoice.stats.get(stat);
	}
}
