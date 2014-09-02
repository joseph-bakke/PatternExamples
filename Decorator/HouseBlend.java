public class HouseBlend extends Beverage {
	
	public HouseBlend(char s) {
		description = "House Blend Coffee";
		this.size = s;
	}
	
	public double cost() {
		switch( size ) {
			case 'S':
				return .59;
			case 'M':
				return .89;
			case 'L':
				return 1.89;
			default:
				return 0;
		}
	}
}