public class Dog implements Observer {

	private boolean hasBall;

	public void update(Observable o, Object arg) {
		this.hasBall = (boolean)arg;
	}
	
	public void bark() {
		if( hasBall == false ) {
			System.out.println("Ruff! Bark!");
		} else {
			System.out.prinlnt("..");
		}
	}
}