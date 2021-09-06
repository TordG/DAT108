package oblig1_Oppgave2_ReentrantLock_IkkeRiktig;

import java.util.Random;

public class Kokk extends Thread {

	String navn;
	Brett brett;

	public Kokk(String navn, Brett brett) {
		this.navn = navn;
		this.brett = brett;
	}

	public int randomTall() {
		Random r = new Random();
		int low = 2000;
		int high = 6001;
		int result = r.nextInt(high - low) + low;
		return result;
	}

	@Override
	public void run() {

		while (true) {

			try { // Sover mellom 2 og 6 sekunder

				sleep(randomTall());
			} catch (InterruptedException e) {

			}

			
				Hamburger burger = new Hamburger();

				
				brett.leggTil(burger, navn);
				

				System.out.println(navn + " har lagt på burger " + burger + " -> Brett: " + brett);

			

		}

	}

}
