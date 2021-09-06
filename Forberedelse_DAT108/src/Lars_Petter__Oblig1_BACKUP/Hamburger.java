package Lars_Petter__Oblig1_BACKUP;

public class Hamburger {
	
	//for å få hver hamburger til å øke med 1, usikker på hva instanceCounter er
	static int instanceCounter = 0;
	
	public int num;
	
	public Hamburger() {
		instanceCounter++;
		num = instanceCounter;
		
//		
	}

	@Override
	public String toString() {
		return "" + num;
	}
	
	
	
	
	
	
	
	
	
}
