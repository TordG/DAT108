package sendermottaker;

public class Mottaker extends Thread {
	
	private Melding melding;

	public Mottaker(Melding melding) {
		this.melding = melding;

	}
	
	@Override
	public void run() {
		while (true) {
			try {
				sleep(2000); //Venter litt av en eller annen grunn
			} catch (InterruptedException e) {
				
			}
			
			synchronized (melding) {
				while (melding.erMeldingLest()) {
					try {
						melding.wait();
					} catch (InterruptedException e) {
					}
					
				}
				
				String mottattTekst = melding.getTekst();
				melding.notifyAll();
				System.out.println("Mottaker har mottatt melding " + mottattTekst);
			}
			
			
		}
	}

}
