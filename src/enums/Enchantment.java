package enums;

import java.util.ArrayList;
import java.util.Arrays;

import main.Player;

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
	private int tier;
	
	Enchantment(Stat [] effectedStatsIn, double [] tierValuesIn, ArrayList<Label> typesIn){
		stat = effectedStatsIn;
		tierValues = tierValuesIn;
		types = typesIn;
	}

	public void apply(Player player) {
		if (types.contains(Label.FlatBonus)) {
			player.setStat(stat[0], player.getStat(stat[0]) + tierValues[getTier()]);
		}
		
		if (types.contains(Label.RelativeBonus) || types.contains(Label.ConversionBonus)) {
			player.setStat(stat[0], player.getStat(stat[0]) + (player.getBonusStat(stat[1]) * (tierValues[getTier()]/100)));
		}				
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}
}
