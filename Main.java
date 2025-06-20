package a;

import javax.swing.SwingUtilities;

public class Main {

//	static double dps = 0;
//	static double dpsBeforeDefense;
//	static Classes classChoice;
//	static Weapon weapon;
//	static Ability ability;
//	static Armor armor;
//	static Ring ring;
	public static Player player;

	
	public static void main(String[] args) {
	    SwingUtilities.invokeLater(Window::new);
				
		player = new Player(Classes.Rogue);
		
		Weapon weapon = Weapon.Shortbow;
		
		//this applies it to the enum, its not making a new object
//		weapon.addEnchantment(Enchantment.AttackBonus, 1);
		
		player.weapon = weapon;
	}
//		dpsBeforeDefense = ((weapon.averageDamage * (0.5 + player.getStat(Stat.Attack)/50)) * weapon.shots) * (1.5 + 6.5*(player.getStat(Stat.Dexterity)/75)) * weapon.rateOfFire;
//		double minDamage = dpsBeforeDefense * .1;
//		
//		if (weapon.ignoreDefense) {
//		minDamage = dpsBeforeDefense;
//		}
//		else {
//		while (defense < 25) {
//			dps = dpsBeforeDefense - defense * weapon.shots;
//			if (dps <= minDamage) {
//				dps = minDamage;
//				defense = 6000;
//				System.out.println("defense " + defense + ": " + dps);
//				break;
//			}
//			System.out.println("defense " + defense + ": " + dps);
//			defense++;
//		}
//		while (defense < 500) {
//			dps = dpsBeforeDefense - defense * weapon.shots;
//			if (dps <= minDamage) {
//				dps = minDamage;
//				System.out.println("defense " + defense + ": " + dps);
//				break;
//			}
//			System.out.println("defense " + defense + ": " + dps);
//			defense += 10;
//		}
//		while (defense <= 5000) {
//			dps = dpsBeforeDefense - defense * weapon.shots;
//			if (dps <= minDamage) {
//				dps = minDamage;
//				System.out.println("defense " + defense + ": " + dps);
//				break;
//			}
//			System.out.println("defense " + defense + ": " + dps);
//			defense += 100;
//		}
//		}
//		
//		System.out.println("dps before defense " + dpsBeforeDefense);
//		System.out.println("min damage: " + minDamage);
//	}
//
	public static double getDPSatDefense(int defense) {
//		double dpsBeforeDefense = ((player.weapon.averageDamage * (0.5 + player.getStat(Stat.Attack)/50)) * player.weapon.shots) * (1.5 + 6.5*(player.getStat(Stat.Dexterity)/75)) * player.weapon.rateOfFire;
//		double dps = dpsBeforeDefense - (player.weapon.shots*defense);
//		if (dps < dpsBeforeDefense * .1) {
//			dps = dpsBeforeDefense * .1;
//		}
//		
		return 0;//dps;
	}

	
	
}
