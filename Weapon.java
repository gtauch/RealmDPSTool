package a;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public enum Weapon implements Enchantable {
	None(WeaponType.None,
		new LinkedList<>(List.of(
	        new Projectile(15, 20, 7.04, 1, false, true),
	        new Projectile(5, 10, 7.04, 1, true, true),
	        new Projectile(5, 10, 7.04, 1, true, true)
	    )),
		Map.of()),
//	
//	//daggers
//	//tiered
//	SteelDagger(1, 25, 70, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	Dirk(1, 25, 80, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	BlueSteelDagger(1, 30, 85, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	DuskyRoseDagger(1, 40, 90, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	SilverDagger(1, 45, 100, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	GoldenDagger(1, 50, 110, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	ObsidianDagger(1, 60, 125, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	MithrilDagger(1, 70, 140, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	FireDagger(1, 85, 155, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	RagetalonDagger(1, 95, 165, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	EmeraldshardDagger(1, 100, 175, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	AgateclawDagger(1, 105, 190, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	DaggerOfFoulMalevolence(1, 115, 200, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	DaggerOfSinisterDeeds(1, 125, 220, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	DaggerOfDireHatred(1, 140, 235, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),	
//	//UT
//	PoisonFangDagger(1, 75, 115, 5.6, 1.4, false, WeaponType.Dagger, Map.of()),
//	BoneDagger(1, 95, 170, 5.02, 1.1, false, WeaponType.Dagger, Map.of()),
//	MisterMango(1, 250, 300, 6.0, 0.5, false, WeaponType.Dagger, Map.of()),
//	GroovyMango(1, 250, 300, 6.0, 0.75, false, WeaponType.Dagger, Map.of()),
//	HeartfindDagger(1, 105, 190, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	MarionetteRavager(1, 60, 140, 5.28, 1.5, true, WeaponType.Dagger, Map.of(Stat.Speed, 4)),
//	BountyHuntersDagger(3, 110, 160, 5.32, 0.65, false, WeaponType.Dagger, Map.of()),
//	CorruptionCutter(2, 85, 100, 5.6, 1.2, false, WeaponType.Dagger, Map.of()),
//	TheRightHook(1, 200, 300, 6.3, 0.65, false, WeaponType.Dagger, Map.of(Stat.Vitality, 6)),
//	SpiritDagger(1, 50, 280, 5.2, 1.05, false, WeaponType.Dagger, Map.of()),
//	ChainDagger(1, 110, 130, 5.5, 0.8, false, WeaponType.Dagger, Map.of()),
//	QueensStinger(1, 150, 170, 5.0, 1.05, true, WeaponType.Dagger, Map.of()),
//	DuelingDaggers(2, 85, 100, 5.6, 1.2, false, WeaponType.Dagger, Map.of()),
//	CorrosionCutter(1, 150, 170, 5.0, 1.05, true, WeaponType.Dagger, Map.of()),
//	DirkOfCronus(1, 150, 290, 4.5, 0.95, false, WeaponType.Dagger, Map.of(Stat.Wisdom, 6)),
//	Mischief(3, 70, 300, 5.2, 1.05, true, WeaponType.Dagger, Map.of()),
//	Avarice(1, 190, 215, 5.985, 1.05, false, WeaponType.Dagger, Map.of()),
//	//ST
//	BladeOfFates(2, 350, 500, 5.5, 0.12, false, WeaponType.Dagger, Map.of(Stat.Speed, -8)),
//	ArchangelsJudgement(4, 60, 75, 5.99, 0.85, false, WeaponType.Dagger, Map.of()),
//	ToxinTooth(1, 265, 320, 3.5, 0.7, false, WeaponType.Dagger, Map.of()),
//	EtheriteDagger(1, 115, 225, 3.84, 1.1, false, WeaponType.Dagger, Map.of()),
//	SoulcursedScythe(1, 345, 460, 4.0, 0.4, true, WeaponType.Dagger, Map.of()),
//	CarvedGolemRemains(1, 155, 170, 6.3, 1.05, false, WeaponType.Dagger, Map.of()),
//	SymbioticRipper(1, 120, 170, 5.6, 1.25, false, WeaponType.Dagger, Map.of(Stat.Vitality, -2)),
//	ToxicToad(1, 750, 750, 5.0, 0.45, false, WeaponType.Dagger, Map.of()),
//
//	//limited
//	ToyKnife(1, 50, 50, 5.0, 0.8, false, WeaponType.Dagger, Map.of()),
//	SunshineShiv(1, 15, 30, 4.5, 0.55, false, WeaponType.Dagger, Map.of()),
//	PrismaticSlasher(2, 10, 10, 4.0, 1.6, false, WeaponType.Dagger, Map.of()),
//	DaggerOfTheTerribleTalon(1, 105, 190, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	AnIcicle(1, 105, 190, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	DaggerOfTheHastefulRabbit(1, 115, 200, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	DaggerOfTheAmethystPrism(1, 115, 200, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	FrostLichsFinger(1, 115, 200, 5.6, 1.05, false, WeaponType.Dagger, Map.of()),
//	AspirantsDagger(1, 140, 215, 5.6, 0.95, false, WeaponType.Dagger, Map.of()),
//	SpatulaDagger(1, 115, 200, 5.6, 1.05, false, WeaponType.Dagger, Map.of(Stat.Vitality, 2)),
//	DaggerOfEternalChaos(1, 115, 200, 5.6, 1.05, false, WeaponType.Dagger, Map.of(Stat.Attack, 2)),
//	ChickenLegOfDoom(1, 65, 105, 6.0, 0.95, false, WeaponType.Dagger, Map.of()),
//	EvergreenDagger(2, 140, 230, 6.14, 1.3, false, WeaponType.Dagger, Map.of()),
//	//dual blades
//	RoyalBlades(2, 60, 80, 4.8, 1.1, false, WeaponType.Dagger, Map.of()),
//	BlazingBlades(2, 60, 90, 4.8, 1.1, false, WeaponType.Dagger, Map.of()),
//	GarnetBlades(2, 65, 100, 4.8, 1.1, false, WeaponType.Dagger, Map.of()),
//	VerdantBlades(2, 75, 105, 4.8, 1.1, false, WeaponType.Dagger, Map.of()),
//	OccultBlades(2, 80, 110, 4.8, 1.1, false, WeaponType.Dagger, Map.of()),
//	BloodshedBlades(2, 85, 120, 4.8, 1.1, false, WeaponType.Dagger, Map.of()),
//	MoonstoneBlades(2, 95, 130, 4.8, 1.1, false, WeaponType.Dagger, Map.of()),
//	SoulforgedBlades(2, 105, 140, 4.8, 1.1, false, WeaponType.Dagger, Map.of()),
//	//UT
//	FractalBlades(2, 75, 105, 4.8, 1.0, false, WeaponType.Dagger, Map.of()),
//	//ST
//	HeartJewelBlades(2, 80, 110, 4.8, 1.0, false, WeaponType.Dagger, Map.of()),
//	BoomerangBlades(2, 95, 125, 4.8, 0.5, true, WeaponType.Dagger, Map.of()),
//	HatchlingBlades(2, 95, 125, 4.8, 0.5, true, WeaponType.Dagger, Map.of()),
//	FrostbiteBlades(2, 85, 120, 4.8, 1.0, false, WeaponType.Dagger, Map.of()),
//	VoidBlades(2, 95, 130, 4.8, 1.0, false, WeaponType.Dagger, Map.of(Stat.Speed, 5)),
//	PiratesSidearms(2, 85, 125, 4.8, 1.0, false, WeaponType.Dagger, Map.of()),
//	HerosBlades(2, 95, 130, 4.8, 1.0, false, WeaponType.Dagger, Map.of()),

	//bows (most need to be changed to account for multiple projectiles)
	Shortbow(WeaponType.Bow,
		    new LinkedList<>(List.of(
		        new Projectile(15, 20, 7.04, 1, false, true),
		        new Projectile(5, 10, 7.04, 1, true, true),
		        new Projectile(5, 10, 7.04, 1, true, true)
		    )),
		    Map.of()
		),
//
//		ReinforcedBow(
//		    new LinkedList<>(List.of(
//		        new Projectile(20, 25, false),
//		        new Projectile(5, 10, false),
//		        new Projectile(5, 10, false)
//		    )),
//		    0.0, 5, "Bow", List.of("Large Standard Arrow", "Reinforced Small Arrow")
//		),
//
//		HardwoodBow(
//		    new LinkedList<>(List.of(
//		        new Projectile(25, 30, false),
//		        new Projectile(5, 15, false),
//		        new Projectile(5, 15, false)
//		    )),
//		    0.0, 8, "Type.bow, List.of("Large Standard Arrow", "Hardwood Small Arrow")
//		),
//
//		GreywoodBow(
//		    new LinkedList<>(List.of(
//		        new Projectile(30, 35, false),
//		        new Projectile(5, 15, false),
//		        new Projectile(5, 15, false)
//		    )),
//		    0.0, 11, "Bow", List.of("Large Standard Arrow", "Greywood Small Arrow")
//		),
//
//		IronwoodBow(
//		    new LinkedList<>(List.of(
//		        new Projectile(35, 45, false),
//		        new Projectile(15, 20, false),
//		        new Projectile(15, 20, false)
//		    )),
//		    0.0, 17, "Bow", List.of("Large Standard Arrow", "Ironwood Small Arrow")
//		),
//
//		FireBow(
//		    new LinkedList<>(List.of(
//		        new Projectile(45, 55, false),
//		        new Projectile(15, 20, false),
//		        new Projectile(15, 20, false)
//		    )),
//		    0.0, 24, "Bow", List.of("Large Standard Arrow", "Fire Small Bolt")
//		),
//
//		SharpshooterBow(
//		    new LinkedList<>(List.of(
//		        new Projectile(55, 65, false),
//		        new Projectile(15, 20, false),
//		        new Projectile(15, 20, false)
//		    )),
//		    0.0, 35, "Bow", List.of("Large Standard Arrow", "Sharpshooter Small Arrow")
//		),
//
//		RedwoodBow(
//		    new LinkedList<>(List.of(
//		        new Projectile(65, 75, false),
//		        new Projectile(20, 30, false),
//		        new Projectile(20, 30, false)
//		    )),
//		    1.0, 53, "Bow", List.of("Redwood Large Arrow", "Redwood Small Arrow")
//		),
//
//		GoldenBow(
//		    new LinkedList<>(List.of(
//		        new Projectile(85, 95, false),
//		        new Projectile(20, 30, false),
//		        new Projectile(20, 30, false)
//		    )),
//		    2.0, 75, "Bow", List.of("Golden Large Arrow", "Golden Small Arrow")
//		),
//
//		VerdantBow(
//		    new LinkedList<>(List.of(
//		        new Projectile(95, 105, false),
//		        new Projectile(20, 30, false),
//		        new Projectile(20, 30, false)
//		    )),
//		    3.0, 109, "Bow", List.of("Verdant Large Arrow", "Verdant Small Arrow")
//		),
//
//		BowOfFeyMagic(
//		    new LinkedList<>(List.of(
//		        new Projectile(105, 115, false),
//		        new Projectile(25, 35, false),
//		        new Projectile(25, 35, false)
//		    )),
//		    4.0, 159, "Bow", List.of("Fey Large Arrow", "Fey Small Arrow")
//		),
//
//		BowOfInnocentBlood(
//		    new LinkedList<>(List.of(
//		        new Projectile(115, 125, false),
//		        new Projectile(25, 35, false),
//		        new Projectile(25, 35, false)
//		    )),
//		    5.0, 233, "Bow", List.of("Blood Large Arrow", "Blood Small Arrow")
//		),
//
//		BowOfCovertHavens(
//		    new LinkedList<>(List.of(
//		        new Projectile(125, 135, false),
//		        new Projectile(25, 35, false),
//		        new Projectile(25, 35, false)
//		    )),
//		    6.0, 450, "Bow", List.of("Blue Arrow", "Covert Small Arrow")
//		),
//
//		BowOfMysticalEnergy(
//		    new LinkedList<>(List.of(
//		        new Projectile(135, 145, false),
//		        new Projectile(35, 45, false),
//		        new Projectile(35, 45, false)
//		    )),
//		    7.0, 650, "Bow", List.of("Mystical Energy Large Shot", "Mystical Energy Small Shot")
//		),
//
//		BowOfDeepEnchantment(
//		    new LinkedList<>(List.of(
//		        new Projectile(145, 155, false),
//		        new Projectile(35, 45, false),
//		        new Projectile(35, 45, false)
//		    )),
//		    8.0, 950, "Bow", List.of("Deep Enchantment Large Arrow", "Deep Enchantment Small Arrow")
//		)

//	ShortSword(1, 45, 90, 3.5, 1, false, WeaponType.Sword, Map.of()),


	
	;
	public enum WeaponType {
		None, Staff, Sword, Bow, Wand, Katana, Dagger;
	}

//	int shots, minDamage, maxDamage;
	double averageDamage;
	LinkedList<Projectile> projectiles;
    EnumMap<Stat, Double> stats;
	LinkedList<Enchantment> enchantments = new LinkedList<Enchantment>();

	WeaponType type;

	Weapon(WeaponType typeIn, LinkedList<Projectile> projectilesIn, Map<Stat, Number> statsIn) {
        stats = StatUtils.buildStats(statsIn);
        projectiles = projectilesIn;
		type = typeIn;
		
		for (Projectile projectile : projectiles) {
			averageDamage += projectile.getAverageDamage();
		}
	}

    @Override
    public LinkedList<Enchantment> getEnchantments() {
        return enchantments;
    }
}
