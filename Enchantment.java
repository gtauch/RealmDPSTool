package a;

import java.util.ArrayList;
import java.util.Arrays;

public enum Enchantment {
AttackBonus(new Stat [] {Stat.Attack},new double [] {1.4, 2.2, 3, 3.8}, new ArrayList<Label>(Arrays.asList(Label.SingleStat, Label.Attack, Label.FlatBonus))),
;
	private enum Label{
		SingleStat, DualStat, TradeOff,
		Attack, Defense, Dexterity, Mana, Life, Speed, Vitality, Wisdom,
		FlatBonus, RelativeBonus, ConversionBonus, 
		;
	}
	
	Stat [] stat;
	double [] tierValues;
	ArrayList<Label> types;
	int tier;
	
	Enchantment(Stat [] effectedStatsIn, double [] tierValuesIn, ArrayList<Label> typesIn){
		stat = effectedStatsIn;
		tierValues = tierValuesIn;
		types = typesIn;
	}

	void apply(Player player) {
		if (types.contains(Label.FlatBonus)) {
			player.setStat(stat[0], player.getStat(stat[0]) + tierValues[tier]);
		}
		
		if (types.contains(Label.RelativeBonus) || types.contains(Label.ConversionBonus)) {
			player.setStat(stat[0], player.getStat(stat[0]) + (player.getBonusStat(stat[1]) * (tierValues[tier]/100)));
		}				
	}
}
