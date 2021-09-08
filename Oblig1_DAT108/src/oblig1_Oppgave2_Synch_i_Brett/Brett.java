package oblig1_Oppgave2_Synch_i_Brett;

import java.util.LinkedList;
import java.util.Queue;

public class Brett {

	private Queue<Hamburger> innhold;

	public Brett() {
		innhold = new LinkedList<>();
	}

	public synchronized void leggTil(Hamburger burger, String navn) {
		while (!ledigPlass()) {
			System.out.println(navn + " prøvde å legge på burger " + burger + " men brettet var fullt! Venter.");
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		notifyAll();
		innhold.add(burger);
	}

	public Hamburger taAv(String navn) {

		while (erTom()) {
			System.out.println(navn + " ville ta burger men brettet var tomt! Venter.");

			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		notifyAll();
		return innhold.remove();
	}

	@Override
	public String toString() {
		return "" + innhold;
	}

	public boolean ledigPlass() {
		return (innhold.size() < 4);
	}

	public boolean erTom() {
		return innhold.isEmpty();
	}

}
