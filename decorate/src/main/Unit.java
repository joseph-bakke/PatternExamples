package main;

public abstract class Unit {

	String description = "Unknown Unit";
	protected int cost;
	protected int reward;
	protected int health;
	protected int attackPower;
	
	public String getDescription() {
		return this.description;
	}
	

	public void takeDamage( int damage ) {
		this.health = health - damage;
	}
	
	public void attack( Unit target ) {
		target.takeDamage( attackPower() );
	}
	
	public abstract int cost();
	public abstract int reward();
	public abstract int health();
	public abstract int attackPower();
}
