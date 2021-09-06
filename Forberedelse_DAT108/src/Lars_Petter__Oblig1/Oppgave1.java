package Lars_Petter__Oblig1;

import static javax.swing.JOptionPane.*; //For � f� inputDialog


//DEL 1:  Dere skal lage et lite program der vi har �n tr�d som skriver ut en linje p� skjermen
//hvert 3. sekund

class SimpleThread extends Thread {
	@Override
	public void run() {
		while (Oppgave1.fortsett) { //boolsk variabel fortsett
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(3000);  //Skriver ut navnet p� tr�den hvert 3. sekund
			} catch (InterruptedException e) {
				
			}
		}
	}
}


//DEL 2: �n tr�d som gjentatte ganger lar brukeren taste inn via JOptionPane
//hva som skal skrives ut. 
//String input = showInputDialog("Skriv her");

//Det skal v�re en egen �kommando� (f.eks. quit) for � avslutte
//hele programmet.

class DialogThread extends Thread {
	
	@Override
	public void run() {
		while (Oppgave1.fortsett) {
			
			String input = showInputDialog("Skriv her. 'quit' for � avslutte.");
			System.out.println(input);
			if (input.equals("quit")) {
				Oppgave1.fortsett = false;  
				//System.out.println("Stoppet");
			}
		}
	}
}

public class Oppgave1 {
	
	public static boolean fortsett = true;
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new SimpleThread();
		
		Thread t2 = new DialogThread();
		
		t1.start();
		t2.start();
		
		
		
		t1.join();
		t2.join();
		
		System.out.println("Stoppet");

	}

}
