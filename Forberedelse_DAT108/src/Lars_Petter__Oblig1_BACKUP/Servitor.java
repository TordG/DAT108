package Lars_Petter__Oblig1_BACKUP;

import java.util.Random;

public class Servitor extends Thread {

	// Servitører er tråd-objekter, og tar hamburgere uavhengig av hva som skjer
	// ellers

	private Rutsjebane bane;
	private String navn;

	public Servitor(Rutsjebane bane, String navn) {
		this.bane = bane;
		this.navn = navn;
	}

	public void hentBurger() {

	}

	@Override
	public void run() {

		while (true) {
			
			synchronized(bane) {
				while (bane.ledigPlass()) {
					try {
						System.out.println(navn + " ønsker å ta hamburger men brett tomt. Venter!");
						bane.wait();
					} catch (Exception e) {
						
					}
					
				}
				try {
					Random r = new Random();
					int low = 2000;
					int high = 6001;
					int result = r.nextInt(high-low) + low;
					Thread.sleep(result);
				} catch (InterruptedException e) {
					
				}
				Hamburger burger = bane.taUt();
				
				
				bane.notifyAll();
				System.out.println(navn + " har tatt ut burger "+ burger + " -> " + bane.toString());
			}

		}

	}
}









