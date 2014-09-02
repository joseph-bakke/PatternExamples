package main;

public class Soldier extends Unit {
	
	public Soldier() {
		this.description = "Soldier";
		this.cost = 1;
		this.reward = 1;
		this.health = 2;
		this.attackPower = 1;

	}
	
	public int cost() { return this.cost; }
	public int reward() { return this.reward; }
	public int health() { return this.health; }
	public int attackPower() { return this.attackPower; }
}
