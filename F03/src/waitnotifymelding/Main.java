package waitnotifymelding;

public class Main {

	

	public static void main(String[] args) {

		
		
		Melding melding = new Melding();

		Thread printlnTraad = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (melding) {

					while (melding.getTekst() == null) {
						try {
							melding.wait();
						} catch (InterruptedException e) {

						}
					}
					System.out.println(melding.getTekst());

				}

			}
		});

		Thread giVerdiTraad = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized(melding) {
					melding.setTekst("Hallo");
					melding.notifyAll();
				}
				
			}
		});

		printlnTraad.start();
		giVerdiTraad.start();

	}

}
