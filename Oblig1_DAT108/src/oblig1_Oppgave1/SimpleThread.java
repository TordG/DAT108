package oblig1_Oppgave1;

class SimpleThread extends Thread {
	
	private boolean fortsett = true;
	
	public void stopp() {
		fortsett = false;
	}
	
	@Override
	public void run() {
		while (fortsett) { //boolsk variabel fortsett
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(3000);  //Skriver ut navnet på tråden hvert 3. sekund
			} catch (InterruptedException e) {
				
			}
		}
	}
}