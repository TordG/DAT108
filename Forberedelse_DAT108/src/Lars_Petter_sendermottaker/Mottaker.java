package Lars_Petter_sendermottaker;


public class Mottaker extends Thread {

	private Melding melding;

	public Mottaker(Melding melding) {
		this.melding = melding;
	}

	@Override
	public void run() {

		while (true) { //For å forsikre oss om trådsikkerhet

			

			synchronized (melding) {
				while (melding.erMottatt()) {
					try {
						melding.wait();
					} catch (Exception e) {

					}
				}
				String mottattMelding = melding.motta();
				melding.notifyAll();
				System.out.println("Mottaker har mottatt melding: " + mottattMelding);
				
				
				
				//********************************
				//LITT USIKKER HVORFOR VI HAR DENNE BITEN MED, SPØR OM DET? 
				//********************************
//				try {
//					System.out.println("Prosesserer ...");
//					Thread.sleep(2000);
//					System.out.println("... Klar!");
//
//				} catch (InterruptedException e) {
//					
//				}
			}

		}

	}
}










