package JavaRepetisjon;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NettStudent extends Student {
	
	private String hjemsted;
	
	
	public NettStudent(String studnr, String fornavn, String etternavn, String studiested, String hjemsted ) {
		super(studnr, fornavn, etternavn, studiested);
		this.hjemsted = hjemsted;
		
		
	}
	
	public String getHjemsted() {
		return hjemsted;
	}
	
	
	
	

	@Override
	public String toString() {
		return super.toString() +" "+ hjemsted;
	}

	public static void main(String[] args) {
		
		List<NettStudent> liste = new ArrayList<>();
		
		liste.add(new NettStudent( "223", "Reidari", "Teigi", "HVL", "kjøttavika"));
		liste.add(new NettStudent( "323", "Schneidi", "Teigi", "HVL","ellavkia"));
		liste.add(new NettStudent( "123", "Løpo", "Teigi", "HVL", "litauen"));
		liste.add(new NettStudent( "423", "Heidi", "Teigi", "HVL","fyllingen"));
		liste.add(new NettStudent( "523", "Leddidi", "Teigi", "HVL","fyllingen"));
		
		Set<String> hjemsteder = new TreeSet<>();
		
		
		
		
		for (NettStudent ns : liste) {
			
//			hjemsteder.add(ns.getHjemsted());
			
		}
		
		System.out.println(hjemsteder);
		
		
		

	}







	







	public void setHjemsted(String hjemsted) {
		this.hjemsted = hjemsted;
	}

}
