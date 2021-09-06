package Lars_Petter_busywait;

public class Main {

	private static String melding;

	public static void main(String[] args) {

		Thread printTraad = new Thread(new Runnable() {
			@Override
			public void run() {
				while (melding == null) { //Vi vil ikke ha "null" derfor sier vi gjør ingenting mens den er null 
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						
//					}
				}
				System.out.println(melding);
			}

		});
		
		Thread verdiTraad = new Thread(new Runnable() {
			@Override
			public void run() {
				melding = "Dette er en melding";
				
			}
		});
		
		printTraad.start();
		verdiTraad.start();

	}

}











