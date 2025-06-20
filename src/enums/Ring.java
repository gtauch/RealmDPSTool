package enums;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;

import main.Enchantable;
import main.StatUtils;

public enum Ring implements Enchantable{
	None(Map.of()),
	RingOfMinorDefense(Map.of(Stat.Life, 5, Stat.Defense, 1, Stat.Mana, 5)),
	;
	
    private EnumMap<Stat, Double> stats;
	LinkedList<Enchantment> enchantments;
	
	Ring(Map<Stat, Number> statsIn){
        setStats(StatUtils.buildStats(statsIn));
        enchantments = new LinkedList<>();
	}

	@Override
	public LinkedList<Enchantment> getEnchantments() {
        return enchantments;
	}

	public EnumMap<Stat, Double> getStats() {
		return stats;
	}

	public void setStats(EnumMap<Stat, Double> stats) {
		this.stats = stats;
	}
}
