package oblig1_Oppgave2;

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
		int result = r.nextInt(high-low) + low;
		return result;
	}
	
	@Override
	public void run() {
		
		
		
		while (true) {
			
			
			try { //Sover mellom 2 og 6 sekunder
				
				
				sleep(randomTall());
			} catch (InterruptedException e) {
				
			}
			
			
			synchronized (brett) {
				
				
				
				
				while (brett.erTom()) {
					System.out.println(navn + " ville ta burger men brettet var tomt! Venter.");
					
					try {
						brett.wait();
					} catch (InterruptedException e) {
						
					}
				}
				Hamburger burger = brett.taAv();
			
				
				brett.notifyAll();
				
				System.out.println(navn + " har tatt ut burger " + burger + " -> Brett: " + brett);
				
				
				
				
			}
			
			
		
			
			
		}
		
	}

}
