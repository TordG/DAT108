package Lars_Petter__Oblig1;

public class Hamburger {
	
	//Bruker en STATIC variabel, for å få hver hamburger til å øke med 1
	static int counter = 0;
	
	public int num;
	
	public Hamburger() {
		counter++;
		num = counter;
		
//		
	}

	@Override
	public String toString() {
		return "" + num;
	}
	
	
	
	
	
	
	
	
	
}
