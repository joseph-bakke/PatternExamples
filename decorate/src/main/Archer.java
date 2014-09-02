package main;

public class Archer extends Unit {

	public Archer( ) {
		this.description = "Archer";
		this.cost = 2;
		this.reward = 1;
		this.health = 3;
		this.attackPower = 1;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int cost() { return this.cost; }
	public int reward() { return this.reward; }
	public int health() { return this.health; }
	public int attackPower() { return this.attackPower; }
}
