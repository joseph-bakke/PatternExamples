public abstract class Human {
	
	MoveBehavior moveBehavior;
	SpeakBehavior speakBehavior;
	
	public Human() { }
	
	public abstract void display();
	
	public void performMove() {
		moveBehavior.move();
	}
	
	public void performSpeak() {
		speakBehavior.speak();
	}
	
	public void setMoveBehavior( MoveBehavior mb ) { this.moveBehavior = mb; }
	public void setSpeakBehavior( SpeakBehavior sb ) { this.speakBehavior = sb; }
}