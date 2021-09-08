package oblig1_Oppgave2_Synch_i_Brett;

import java.util.Random;

public class Servitor extends Thread {

	String navn;

	Brett brett;

	public Servitor(String navn, Brett brett) {
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

			synchronized (brett) {

				Hamburger burger = brett.taAv(navn);

				System.out.println(navn + " har tatt ut burger " + burger + " -> Brett: " + brett);

			}

		}

	}

}
