package a;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;

public enum Armor implements Enchantable {
	None(ArmorType.None, Map.of()),
	WolfSkinArmor(ArmorType.Leather, Map.of()),
	;

	public enum ArmorType{
		None, Leather, Robe, Heavy;
	}
	
    EnumMap<Stat, Double> stats;
	LinkedList<Enchantment> enchantments;
	
	ArmorType type;
	
	Armor(ArmorType typeIn, Map<Stat, Number> statsIn) {
        stats = StatUtils.buildStats(statsIn);
        enchantments = new LinkedList<>();
        
		type = typeIn;
	}

	@Override
	public LinkedList<Enchantment> getEnchantments() {
        return enchantments;
	}
}
