public class Tower extends UnitFactory {
	
	Unit createUnit(String type) {
		if(type.equals("Dragon")) {
			return new Dragon();
		} else if(type.equals("Wizard")) {
			return new Wizard();
		} else return null;
	}
}