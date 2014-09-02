package main;

public class Knight extends UnitUpgrader {

	Unit unit;
	
	public Knight( Unit unit ) {
		this.unit = unit;
		this.description = "Knight";
	}
	
	public String description() {
		return "Knight";
	
	}
	
	public int cost() { return unit.cost() + 1; }
	public int reward() { return unit.reward() + 1; }
	public int health() { return unit.health() + 2; }
	public int attackPower() { return unit.attackPower() + 1; }
}
