
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Container container = new Container();
		Man man = new Man();
		Mouse mouse = new Mouse();
		container.addThing(man);
		container.addThing(mouse);
		Thing the_man = container.getThing(0);
		Thing the_mouse = container.getThing(1);
		the_man.display();
		the_man.changeDisplay();
		the_man.display();
		the_mouse.display();

	}

}
