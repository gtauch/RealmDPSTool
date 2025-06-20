package main;

public class Projectile {
    private final int minDamage, maxDamage;
    private double averageDamage, range, rateOfFire;
    private final boolean ignoreDefense, hitsMultipleTargets;
    


    public Projectile(int minDamageIn, int maxDamageIn, double rangeIn, double rateOfFireIn, boolean ignoreDefenseIn, boolean hitsMultipleTargetsIn) {
        this.minDamage = minDamageIn;
        this.maxDamage = maxDamageIn;
        this.averageDamage = (minDamage + maxDamage) / 2.0; 
        this.ignoreDefense = ignoreDefenseIn;
        this.range = rangeIn;
        this.setRateOfFire(rateOfFireIn);
        this.hitsMultipleTargets = hitsMultipleTargetsIn;
    }

	public double getAverageDamage() {
		return averageDamage;
	}

	public double getRateOfFire() {
		return rateOfFire;
	}

	public void setRateOfFire(double rateOfFire) {
		this.rateOfFire = rateOfFire;
	}
}

