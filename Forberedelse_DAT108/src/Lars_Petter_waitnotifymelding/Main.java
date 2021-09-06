package Lars_Petter_waitnotifymelding;

public class Main {

	public static void main(String[] args) {

		Melding melding = new Melding(); // "Ballen" vår

		Thread printTraad = new Thread(new Runnable() {
			@Override
			public void run() {

				System.out.println(melding.getInnhold());
			}

		});

		Thread verdiTraad = new Thread(new Runnable() {
			@Override
			public void run() {
				melding.setInnhold("Dette er en melding");
			}
		});

		printTraad.start();
		verdiTraad.start();

	}

}
