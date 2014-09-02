public class CoffeeShop {

	public static void main( String[] args ) {
	
		Beverage beverage = new Espresso('M');
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		beverage = new Whip(beverage);
		
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
}