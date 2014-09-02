public class Adult extends Human {
	
	public Adult() {		
		moveBehavior = new Walk();
		speakBehavior = new Talk();
	}
	
	public void display() {
		System.out.println("I'm an adult human!");
	}
}