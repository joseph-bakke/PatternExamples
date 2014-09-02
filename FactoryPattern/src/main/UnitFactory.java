package main;

public abstract class UnitFactory {
	
	public Unit makeUnit(String type) {
		Unit unit;
		
		unit = createUnit(type);
		
		return unit;
	}
	
	protected abstract Unit createUnit(String type);
}
