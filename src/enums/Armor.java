package enums;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;

import main.Enchantable;
import main.StatUtils;

public enum Armor implements Enchantable {
	None(ArmorType.None, Map.of()),
	WolfSkinArmor(ArmorType.Leather, Map.of()),
	;

	public enum ArmorType{
		None, Leather, Robe, Heavy;
	}
	
    private EnumMap<Stat, Double> stats;
	LinkedList<Enchantment> enchantments;
	
	private ArmorType type;
	
	Armor(ArmorType typeIn, Map<Stat, Number> statsIn) {
        setStats(StatUtils.buildStats(statsIn));
        enchantments = new LinkedList<>();
        
		setType(typeIn);
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

	public ArmorType getType() {
		return type;
	}

	public void setType(ArmorType type) {
		this.type = type;
	}
}
