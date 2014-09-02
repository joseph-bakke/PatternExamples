package main;

public class Ranger extends UnitUpgrader {

	Unit unit;
	
	public Ranger( Unit unit ) {
		this.unit = unit;
		this.description = "Ranger";
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int cost() { return unit.cost() + 1; }
	public int reward() { return unit.reward() + 1; }
	public int health() { return unit.health() + 2; }
	public int attackPower() { return unit.attackPower() + 1; }
}
