package oblig1_Oppgave1;




//ALTERNATIV M�TE: "Sunniva-m�ten": Stopp SimpleThread n�r DialogThread !isAlive()



public class Oppgave1 {
	
	public static boolean fortsett = true;
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		SimpleThread t1 = new SimpleThread();
		
		Thread t2 = new DialogThread();
		
		t1.start();
		t2.start();
		
		
		
		
		t2.join(); //Joiner BARE t2, pga n�r den er stoppet s� utf�res det under!
		
		if (!t2.isAlive()) {
			t1.stopp();
		}
		
//		System.out.println("Stoppet"); HAR DENNE SETNINGEN I DialogThread heller?

	}

}








