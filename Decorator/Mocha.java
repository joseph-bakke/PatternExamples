public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public double cost() {
		double finalCost;
		
		switch( beverage.size ) {
			case 'S':
				finalCost = .10;
			case 'M':
				finalCost = .20;
			case 'L':
				finalCost = .30;
			default:
		}
		return finalCost + beverage.cost();
	}
}