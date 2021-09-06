package JavaRepetisjon;

import java.util.ArrayList;
import java.util.List;

public class Onsdag {
	
	public static boolean alleLovlige(ArrayList<String> koder) {
		
		boolean lovlige = true;
		
		for (String kode : koder) {
			if (!lovligKode(kode)) {
				lovlige = false;
			}
			
		}
		
		
		return lovlige;
		
	}
	
	
	public static boolean lovligKode(String kode) {
		
		int jevnTotal = 0;
		int oddTotal = 0;
		
		boolean lovlig = false;
		
		for (int i = 0; i < kode.length()-1; i++) {
			int siffer = Character.digit(kode.charAt(i), 10);
			if (i % 2 == 0) {
				
				jevnTotal += siffer;
				
			}else {
				oddTotal += siffer;
			}
		}
		
		
		if ((jevnTotal + oddTotal*3 + Character.digit(kode.charAt(12), 10) ) % 10 == 0) {
			
			lovlig = true;
		}
		
		return lovlig;
		
	}
	
	
	public static String land(String kode) {
		
		String toSiffer = kode.substring(0, 2);
		String treSiffer = kode.substring(0, 3);
		
		String land;
				

		if (toSiffer.equals("57")) {
			land = "Danmark";
		} else if (toSiffer.equals("73")) {
			land = "Sverige";
			
		}else if (toSiffer.equals("64")) {
			land = "Finland";
			
		} else if (toSiffer.equals("70")) {
			land = "Norge";
			
		}else if (treSiffer.equals("569")) {
			land = "Island";
			
		} else {
			land = "Uspesifisert land utenfor Norden";
		}

		
		
		return land;
		
	}

	public static void main(String[] args) {
		String kode1 = "7038010002151";
		String kode2 = "7038010002151";
		String kode3 = "7038010002151";
		
		ArrayList<String> liste = new ArrayList<>();
		
		liste.add(kode1);
		liste.add(kode2);
		liste.add(kode3);
		
		System.out.println(alleLovlige(liste));
		
		
		
		
		
		
		
	

	}

}
