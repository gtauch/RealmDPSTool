package a;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;

public enum Ring implements Enchantable{
	None(Map.of()),
	RingOfMinorDefense(Map.of(Stat.Life, 5, Stat.Defense, 1, Stat.Mana, 5)),
	;
	
    EnumMap<Stat, Double> stats;
	LinkedList<Enchantment> enchantments;
	
	Ring(Map<Stat, Number> statsIn){
        stats = StatUtils.buildStats(statsIn);
        enchantments = new LinkedList<>();
	}

	@Override
	public LinkedList<Enchantment> getEnchantments() {
        return enchantments;
	}
}
