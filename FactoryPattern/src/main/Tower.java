package main;

public class Tower extends UnitFactory {
	
	public Unit createUnit(String type) {
		
		if(type.equals("Wizard")) {
			return new Wizard();
		} else if(type.equals("Dragon")) {
			return new Dragon();
		} else return null;
	}
}
