//////////////////////////////////////////
// The following code demonstrates the	//
// state pattern						//
//////////////////////////////////////////


public abstract class State {

	public void mood() { }
}

public class SadState extends State {

	public void mood() {
		System.out.println(":(");
	}
}

public class HappyState extends State{

	public void mood() {
		System.out.println(":)");
	}
}

public class Person {

	State currentState;
	HappyState happyState;
	SadState sadState;
	
	public Person() {
		happyState = new HappyState();
		sadState = new SadState();
	}
	
	public void makeHappy() {
		this.currentState = happyState;
	}
	
	public void makeSad() { 
		this.currentState = sadState;
	}
	
	public void mood() {
		this.currentState.mood();
	}
}

public class Driver {

	
	public static void main( String[] args ) {
		
		Person luke = new Person();
		
		luke.makeHappy();
		luke.mood();
		luke.makeSad();
		luke.mood();
		luke.makeHappy();
		luke.mood();
		
	}
}
