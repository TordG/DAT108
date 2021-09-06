package oblig1_Oppgave2_ReentrantLock_IkkeRiktig;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Brett {
	
	private Lock lock = new ReentrantLock();
	private Condition ledig = lock.newCondition();
	private Condition ikkeTom = lock.newCondition();
	

	private Queue<Hamburger> innhold;

	public Brett() {
		innhold = new LinkedList<>();
	}

	public void leggTil(Hamburger burger, String navn) {
		lock.lock();
		while (!ledigPlass()) {
			System.out.println(navn + " prøvde å legge på burger " + burger + " men brettet var fullt! Venter.");
			try {
				ledig.await();
			} catch (InterruptedException e) {

			} finally {
				lock.unlock();
			}
		}
		ledig.signalAll();
		innhold.add(burger);
	}

	public Hamburger taAv(String navn) {

		lock.lock();
		while (erTom()) {
			System.out.println(navn + " ville ta burger men brettet var tomt! Venter.");

			try {
				ikkeTom.await();
			} catch (InterruptedException e) {

			} finally {
				lock.unlock();
			}
		}
		ikkeTom.signalAll();
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
