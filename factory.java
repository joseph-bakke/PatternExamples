//////////////////////////////////////
// The following code demonstrates	//
// the factory pattern				//
//////////////////////////////////////

public abstract class UnitFactory {
	
	public Unit makeUnit(String type) {
		Unit unit;
		
		unit = createUnit(type);
		
		return unit;
	}
	
	protected abstract Unit createUnit(String type);
}

public class Barracks extends UnitFactory {

	public Unit createUnit(String type) {
		if(type.equals("Soldier")) {
			return new Soldier();
		} else if(type.equals("Archer")) {
			return new Archer();
		} else return null;
	}
}

public abstract class Unit {
	
	String name;
	int health;
	int attack;
	int moveRange;
	int attackRange;
	
	public String getName() {
		return name;
	}
}

public class Soldier extends Unit {
	
	public Soldier() {
		name = "Soldier";
		health = 10;
		attack = 2;
		moveRange = 1;
		attackRange = 1;		
	}
}

public class Archer extends Unit {

	public Archer() {
		name = "Archer";
		health = 10;
		attack = 1;
		moveRange = 1;
		attackRange = 1;		
	}
}
