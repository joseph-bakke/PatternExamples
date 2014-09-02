public class Whip extends CondimentDecorator {

	Beverage beverage; 
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return this.beverage.getDescription() + ", Whip";
	}
	
	public double cost() {
		double finalCost;
		
		switch( beverage.size ) {
			case 'S':
				finalCost = .15;
			case 'M':
				finalCost = .30;
			case 'L':
				finalCost = .45;
			default:
		}
		return finalCost + beverage.cost();
	}
}