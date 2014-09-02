//////////////////////////////////////////
// The following code is a 				//
// demonstration of the visitor pattern	//
//////////////////////////////////////////	

abstract class Visitor {
	
	abstract void visit( IntExp e );
	abstract void visit( AddExp e );
}

abstract class Visitable {
	abstract void accept( Visitor v );
}

public class IntExp extends Visitable {
	
	int value;
	
	public void accept( Visitor v ) {
		v.visit(this);
	}
	
	public void toString() {
		System.out.println(value);
	}
}

public class AddExp extends Visitable {
	int a, b;
	
	public void accept( Visitor v ) {
		v.visit(this);
	}
	
	public int add() {
		return this.a + this.b;
	}
	
	public void runAdd() {
		System.out.println(this.a + " + " + this.b + " = " + add() );
	}
}

public class Perform extends Visitor {
	
	public Perform() { }
	
	public void visit( IntExp e ) {
		e.toString();
	}
	
	public void visit( AddExp e ) {
		e.runAdd();
	}
	
	public doThings() {
		
	}
}

// Main class

public class Main {
	
	public static void main( String[] args ) {
		
		IntExp i = new IntExp();
		AddExp a = new AddExp();
		
		Perform p = new Perform();
		
		i.accept(p);
		a.accept(p);
	}
}