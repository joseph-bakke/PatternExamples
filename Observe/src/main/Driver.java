package main;

public class Driver {

	
	public Driver() {

	}
	
	public static void main( String[] args ) {
		Subject subject1 = new Subject();
		Subject subject2 = new Subject();
		Subscriber sub1 = new Subscriber(subject1);
		Subscriber sub2 = new Subscriber(subject1);
		Subscriber sub3 = new Subscriber(subject2);
		
		//Prints false, false, false
		System.out.println();
		System.out.println( sub1.getSelect() );
		System.out.println( sub2.getSelect() );
		System.out.println( sub3.getSelect() );
		
		//Changes sub1 and sub2 to true
		subject1.isTurn();
		
		//Prints true, true, false
		System.out.println();
		System.out.println( sub1.getSelect() );
		System.out.println( sub2.getSelect() );
		System.out.println( sub3.getSelect() );
		
		//Remove sub1 then end turn, changing sub2 to false
		subject1.deleteObserver( sub1 );
		subject1.endTurn();
		
		//Prints true, false, false
		System.out.println();
		System.out.println( sub1.getSelect() );
		System.out.println( sub2.getSelect() );
		System.out.println( sub3.getSelect() );
		
	}
}
