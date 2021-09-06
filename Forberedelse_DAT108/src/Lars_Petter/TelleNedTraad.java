package Lars_Petter;

public class TelleNedTraad extends Thread {
	
	
	private Teller teller;
	private int antallGanger;
	
	public TelleNedTraad(Teller teller, int antallGanger) {
		this.teller = teller;
		this.antallGanger = antallGanger;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < antallGanger; i++) {
			teller.tellNed();
		}
	}

}
