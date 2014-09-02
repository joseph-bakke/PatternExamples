import java.util.*;

public class Person extends Observable {

	private boolean hasBall;
	
	public Person() { 	
		hasBall = true;
	}
	
	public void throwBall() {
		setChanged();
		notifyObservers(this, hasBall);
		this.hasBall = false;
	}
}