public class Barracks extends UnitFactory {
		
	Unit createUnit(String type) {
		if(type.equals("Soldier")) {
			return new Soldier();
		} else if(type.equals("Archer")) {
			return new Archer();
		} else return null;
	}
}