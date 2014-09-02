public class FactoryTest {

	public static void main(String [] args) {
		UnitFactory barracks = new Barracks();
		UnitFactory tower = new Tower();
		Unit unit1 = barracks.makeUnit("Soldier");
		Unit unit2 = barracks.makeUnit("Archer");
		Unit unit3 = tower.makeUnit("Dragon");
		
		System.out.println(unit1.getName());
		System.out.println(unit2.getName());
		System.out.println(unit3.getName());		
	}
}