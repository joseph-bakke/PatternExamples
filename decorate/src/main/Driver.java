package main;

public class Driver {

	public static void main( String[] arg ) {
		
		Unit unit = new Soldier();
		Unit unit2 = new Archer();
		
		System.out.println("Soldier health: " + unit.health());
		unit = new Knight( unit );
		System.out.println("Knight health: " + unit.health() );
		unit2 = new Ranger( unit2 );
		
		
	}
}
