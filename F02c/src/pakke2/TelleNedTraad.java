package pakke2;

public class TelleNedTraad extends Thread {

	private Teller teller;
	private int n;

	public TelleNedTraad(Teller teller, int antallGanger) {
		this.teller = teller;
		this.n = antallGanger;
	}

	@Override
	public void run() {
		for (int i = 0; i < n; i++) {

			teller.tellNed();

		}
	}

}
