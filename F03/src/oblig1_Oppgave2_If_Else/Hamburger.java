package oblig1_Oppgave2_If_Else;

public class Hamburger {
	
	private static int counter;
	
	private int tall;

	public Hamburger() {
		counter++;
		this.tall = counter;
		
		
	}
	
	public String toString() {
		return "(Burger "+ tall + ")";
	}
}
