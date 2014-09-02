public abstract class Beverage {

	String description = "Unknown Beverage";
	char size;
	
	public String get Description() {
		return size + description;
	}
	
	public abstract double cost();
}