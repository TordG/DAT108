package Lars_Petter__Oblig1;

public class Hamburger {
	
	//Bruker en STATIC variabel, for � f� hver hamburger til � �ke med 1
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
