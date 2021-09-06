package oblig1_Oppgave2_If_Else;

import java.util.Random;

public class Servitor extends Thread {
	
	String navn;
	
	Brett brett;
	
	public Servitor(String navn, Brett brett) {
		this.navn = navn;
		this.brett = brett;
	}
	
	@Override
	public void run() {
		
		String utskrift = "";
		
		while (true) {
			
			
			synchronized (brett) {
				
				try { //Sover mellom 2 og 6 sekunder
					Random r = new Random();
					int low = 2000;
					int high = 6001;
					int result = r.nextInt(high-low) + low;
					sleep(result);
				} catch (InterruptedException e) {
					
				}
				
				if (!brett.erTom()) {
					Hamburger burger = brett.taAv();
					
					utskrift = navn + " har tatt ut " + burger + " -> Brett: " + brett;
				}else {
					utskrift = navn + " ville ta burger men brettet var tomt!";
				}
				
				
				
				
			}
			
			
			//Igjen må utskriften skje utenfor synch-blokken. Why?
			System.out.println(utskrift);
			
		}
		
	}

}
