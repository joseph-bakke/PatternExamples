
public class Thing {
	Strategy behavior;
	public Thing(){}
	public void display() {
		behavior.execute();
	}
	
	public void changeDisplay() {
		
	}
}
