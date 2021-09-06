package pakke2;

public class RaceCondition {

	public static void main(String[] args) throws InterruptedException {
		
		final int N = 10000;
		
		Teller teller = new Teller();
		
		Thread telleOppTraad = new TelleOppTraad(teller, N);
		Thread telleNedTraad = new TelleNedTraad(teller, N);
		
		telleOppTraad.start();
		telleNedTraad.start();
		
		//Vente til begge trådene er ferdig
		telleOppTraad.join();
		telleNedTraad.join();
		
		System.out.println("Ferdig ... Tellerverdi = " + teller.getVerdi());

	}

}
