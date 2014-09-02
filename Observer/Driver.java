public class Driver {

	public static void main( String[] args ) {
		
		new Person John = new Person();
		new Dog Scruffy = new Dog();
		
		John.addObserver(Scruffy);
		Scruffy.bark();
		John.throwBall();
		Scruffy.bark();
	}
}