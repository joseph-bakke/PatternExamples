public class Baby extends Human {
	
	public Baby() {
		moveBehavior = new Crawl();
		speakBehavior = new Babble();
	}
	
	public void display() {
		System.out.println("I'm a baby!");
	}
}