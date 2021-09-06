package Lars_Petter__Oblig1;

import java.util.LinkedList;
import java.util.Queue;

public class Rutsjebane {
	private Queue<Hamburger> innhold;
	
	
	
	public Rutsjebane(){
		 innhold = new LinkedList<>();
	}
	
	public void leggTil(Hamburger burger) {
		innhold.add(burger);
		
	}

	public Queue<Hamburger> getInnhold() {
		return innhold;
	}

	public boolean ledigPlass() {
		return innhold.size() < 5; 
	}
	
	public Hamburger taUt() {
		return innhold.remove();
	}

	@Override
	public String toString() {
		return "Brett: " + innhold;
	}
	
	
}
