package Lars_Petter_waitnotifymelding;

public class Melding {
	private String innhold;

	public synchronized String getInnhold() {
		while (!harInnhold()) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		return innhold;
	}

	public synchronized void setInnhold(String innhold) {
		this.innhold = innhold;
		notifyAll();
	}

	// synchronized bare for sikkerhetsskyld i følge Lars Petter
	public synchronized boolean harInnhold() {
		return innhold != null;
	}

}
