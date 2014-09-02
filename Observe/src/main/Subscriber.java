package main;
import java.util.*;

public class Subscriber implements Observer {

	private boolean selectable = false;
	Observable observable;
	
	public Subscriber(Observable observable) { 
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	public void update( Observable o, Object arg ) {
		selectable = (boolean)arg;
	}
	
	public boolean getSelect() {
		return this.selectable;
	}
}
