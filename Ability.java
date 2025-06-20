package a;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;

public enum Ability implements Enchantable {
	None(AbilityType.None, Map.of()),
	CloakOfShadows(AbilityType.Cloak, Map.of()),
	;
	
	public enum AbilityType{
		None, Cloak, Poison, Prism, Quiver, Trap, Star, Spell, Skull, Orb, Tome, Scepter, Mace, Lute, Helm, Shield, Seal, Wakizashi, Sheath;
	}
		
    EnumMap<Stat, Double> stats;
	LinkedList<Enchantment> enchantments;

	AbilityType type;
	
	Ability(AbilityType typeIn, Map<Stat, Number> statsIn){
        stats = StatUtils.buildStats(statsIn);
        enchantments = new LinkedList<>();
		
		type = typeIn;
	}

	@Override
    public LinkedList<Enchantment> getEnchantments() {
        return enchantments;
    }
}
