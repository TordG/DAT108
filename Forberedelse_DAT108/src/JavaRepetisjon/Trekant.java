package JavaRepetisjon;

import java.util.ArrayList;
import java.util.List;

//Rettvinklet trekant
public class Trekant implements Figur {
	
	private int sideLengde;

	

	public Trekant(int sideLengde) {
		super();
		this.sideLengde = sideLengde;
	}

	@Override
	public double areal() {
		// TODO Auto-generated method stub
		return sideLengde*sideLengde / 2;
	}

	@Override
	public void tegn() {
		for (int i = sideLengde; i < sideLengde; i--) {
			for (int j = 0; j < sideLengde; j++) {
				//???????????
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		
		List<Figur> liste = new ArrayList<>();
		
		Rektangel rek = new Rektangel(2,3);
		Trekant trek = new Trekant(4);
		
		liste.add(rek);
		liste.add(trek);
		
		
		System.out.println(rek.areal());
		System.out.println(trek.areal());
		
		double total = 0;
		for (Figur figur : liste) {
			total += figur.areal();
		}
		
		System.out.println(total);

	}

}


























