package a;

import java.util.EnumMap;
import java.util.Map;

import a.Ability.AbilityType;
import a.Armor.ArmorType;
import a.Weapon.WeaponType;

public enum Classes {
	Rogue(Map.of(
            Stat.Life, 750,
            Stat.Mana, 252,
            Stat.Attack, 55,
            Stat.Defense, 25,
            Stat.Speed, 65,
            Stat.Dexterity, 75,
            Stat.Vitality, 40,
            Stat.Wisdom, 50
        ), WeaponType.Dagger, AbilityType.Cloak, ArmorType.Leather),;

    EnumMap<Stat, Double> stats;
    WeaponType weaponType;
    AbilityType abilityType;
    ArmorType armorType;
    
	Classes(Map<Stat, Number> statsIn, WeaponType weaponTypeIn, AbilityType abilityTypeIn, ArmorType armorTypeIn) {
        stats = new EnumMap<>(Stat.class);
        for (Stat stat : Stat.values()) {
            stats.put(stat, statsIn.get(stat).doubleValue());
        }
        
        weaponType = weaponTypeIn;
        abilityType = abilityTypeIn;
        armorType = armorTypeIn;
	}
}
