package oblig1_Oppgave2_If_Else;

import java.util.LinkedList;
import java.util.Queue;

public class Brett {
	
	private Queue<Hamburger> innhold;
	
	public Brett() {
		innhold = new LinkedList<>();
	}
	
	public void leggTil(Hamburger burger) {
		innhold.add(burger);
	}
	
	public Hamburger taAv() {
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
