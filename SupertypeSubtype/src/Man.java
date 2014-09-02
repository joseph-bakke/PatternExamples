
public class Man extends Thing{
	public Man() {
		behavior = new behaviorOne();
	}
	
	public void changeDisplay() {
		behavior = new behaviorTwo();
	}
}
