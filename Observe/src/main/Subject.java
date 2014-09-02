package main;
import java.util.*;

public class Subject extends Observable{

	public boolean isTurn = false;
	
	public Subject() { }
	
	public void isTurn() { 
		this.isTurn = true;
		setChanged();
		notifyObservers( isTurn );
	}
	
	public void endTurn() {
		this.isTurn = false;
		setChanged();
		notifyObservers( isTurn );
	}
	
}
