package Lars_Petter__Oblig1_BACKUP;

import java.util.Random;

public class Kokk extends Thread {

	//Kokker er tråd-objekter, og lager hamburgere uavhengig av hva som skjer ellers
	
	private Rutsjebane bane;
	private String navn;
	
	public Kokk(Rutsjebane bane, String navn) {
		this.bane = bane;
		this.navn = navn;
	}
	
//	public void lagBurger() {         TROR IKKE EGEN METODE TRENGS
//		Hamburger burger = new Hamburger();
//		
//	}
	
	
	
	@Override
	public void run() {
		
		while (true) {
			
//			Hamburger burger = new Hamburger();
//			System.out.println("Burger laget"); //Foreløpig
			
			synchronized (bane) {
				while (!bane.ledigPlass()) {
					try {
						System.out.println(navn + " klar med hamburger men brett fullt. Venter!");
						bane.wait();
					} catch (Exception e) {
						
					}
				}
				try {
					Random r = new Random(); //Dette for å få mellom 2 og 6 sekunder
					int low = 2000;
					int high = 6001;
					int result = r.nextInt(high-low) + low;
					Thread.sleep(result);
				} catch (InterruptedException e) {
					
				}
				Hamburger burger = new Hamburger();
				bane.leggTil(burger);
				
				bane.notifyAll();		      //Må gi navn/tall til burger
				System.out.println(navn + " legger på burger " + burger + " -> " + bane.toString());
				
				
			}
			
			
		}
		
	}
	
	
	
}
