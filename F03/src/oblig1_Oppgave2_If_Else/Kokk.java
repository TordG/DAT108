package oblig1_Oppgave2_If_Else;

import java.util.Random;

public class Kokk extends Thread {

	String navn;
	Brett brett;

	public Kokk(String navn, Brett brett) {
		this.navn = navn;
		this.brett = brett;
	}

	@Override
	public void run() {
		
		String utskrift = "";
		
		while (true) {
			
			
			synchronized (brett) {
				Hamburger burger = new Hamburger();
				
				try { //Sover mellom 2 og 6 sekunder
					Random r = new Random();
					int low = 2000;
					int high = 6001;
					int result = r.nextInt(high-low) + low;
					sleep(result);
				} catch (InterruptedException e) {
					
				}
				
				if (brett.ledigPlass()) {
					brett.leggTil(burger);		//må være inni synchronized
					utskrift = navn + " har lagt på "+ burger +" -> Brett: " + brett;
				} else {
					utskrift = navn + " prøvde å legge på" + burger+ " men brettet var fullt!";
					
				}
				
			};
			
				
				//Blir bare "random" når Syso'en er utenfor synchronized-blokken
			
				//HVORFOR FUNKER DET PÅ DENNE MÅTEN?? Spør på Lab

				System.out.println(utskrift); //Denne må være utenfor
				
				
				
			
		}
		
		

		

	}

}
