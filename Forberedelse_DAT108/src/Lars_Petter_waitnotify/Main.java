package Lars_Petter_waitnotify;

public class Main {

	private static String melding;

	public static void main(String[] args) {
		
		Object lock = new Object();  // "Ballen" vår

		Thread printTraad = new Thread(new Runnable() {
			@Override
			public void run() {
				
				synchronized(lock) {
					while (melding == null) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
						}
					}
				}
				System.out.println(melding);
			}

		});
		
		Thread verdiTraad = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock) {
					melding = "Dette er en melding";
					lock.notifyAll();
				}
				
				
				
			}
		});
		
		printTraad.start();
		verdiTraad.start();

	}

}











