package enums;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;

import main.Enchantable;
import main.StatUtils;

public enum Ability implements Enchantable {
	None(AbilityType.None, Map.of()),
	CloakOfShadows(AbilityType.Cloak, Map.of()),
	;
	
	public enum AbilityType{
		None, Cloak, Poison, Prism, Quiver, Trap, Star, Spell, Skull, Orb, Tome, Scepter, Mace, Lute, Helm, Shield, Seal, Wakizashi, Sheath;
	}
		
    private EnumMap<Stat, Double> stats;
	LinkedList<Enchantment> enchantments;

	private AbilityType type;
	
	Ability(AbilityType typeIn, Map<Stat, Number> statsIn){
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

	public AbilityType getType() {
		return type;
	}

	public void setType(AbilityType type) {
		this.type = type;
	}
}
