package JavaRepetisjon;

public class EnkelListe<T> {
	private LinearNode<T> forste;
	private int antall;

	public EnkelListe() {
		forste = null;
		antall = 0;
	}

	public void leggTilForst(T element) {
		forste = new LinearNode<>(element);
		antall++;
	}

	public void skriv() {
		
		System.out.print("[");
		LinearNode<T> denne = forste;
		while (denne.getNeste() != null) {
			
			System.out.println(denne.getElement());
			denne = denne.getNeste();
			
		}
		
		System.out.println("]");
		
	}

	public void snu() {
// fyll inn
	}
	
	
	
	public static void main(String[] args) {
		EnkelListe<Integer> liste = new EnkelListe<>();
		
	}
}




















