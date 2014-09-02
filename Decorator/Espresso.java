public class Espresso extends Beverage {
	
	public Espresso(char s) {
		this.description = "Espresso";
		this.size = s;
	}
	
	public double cost() {
		switch( size ) {
			case 'S':
				return .99;
			case 'M':
				return 1.99;
			case 'L':
				return 2.99;
			default:
				return 0;
		}
	}
}