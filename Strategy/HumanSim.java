public class HumanSim {

	public static void main( String[] args ) {
		Human Steve = new Adult();
		Human Rob = new Baby();
		
		Steve.performMove();
		Rob.performMove();
		Steve.performSpeak();
		Rob.performSpeak();
		Steve.setMoveBehavior( new Run() );
		Steve.performMove();
	}
}