package main;

public class HealthUpgrade extends UnitUpgrader {

	Unit unit;
	
	public HealthUpgrade( Unit unit ) {
		this.unit = unit;
		this.description = unit.getDescription();
	}
	
	public int cost() { return unit.cost(); }
	public int reward() { return unit.reward(); }
	public int health() { return unit.health() + 1; }
	public int attackPower() { return unit.attackPower(); }
}
