package Lars_Petter__Oblig1_BACKUP;

public class Hamburger {
	
	//for � f� hver hamburger til � �ke med 1, usikker p� hva instanceCounter er
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
