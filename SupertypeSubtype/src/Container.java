
public class Container {
	private Thing[] container = new Thing[10];
	private int size;
	public Container(){size = 0;}
	public Thing getThing(int loc) {
		return container[loc];
	}
	public void addThing(Thing added) {
		container[size] = added;
		size++;
	}
	
}
