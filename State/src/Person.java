
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
	