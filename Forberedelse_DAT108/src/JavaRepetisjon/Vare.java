package JavaRepetisjon;

import java.util.HashMap;
import java.util.Map;

public class Vare {
	
	private String strekkode;
	private String navn;
	private int pris;
	
	

	public Vare(String strekkode, String navn, int pris) {
	
		this.strekkode = strekkode;
		this.navn = navn;
		this.pris = pris;
	}
	
	public static void main(String[] args) {
		
		Map<String, Vare> prisliste = new HashMap<>();
		
		prisliste.put("7033330013290", new Vare("7033330013290","bremykt",30));

	}
	
	public Vare() {
		strekkode = "";
		navn = "";
		pris = 0;
	}
	
	
	



	public String getStrekkode() {
		return strekkode;
	}



	public void setStrekkode(String strekkode) {
		this.strekkode = strekkode;
	}



	public String getNavn() {
		return navn;
	}



	public void setNavn(String navn) {
		this.navn = navn;
	}



	public int getPris() {
		return pris;
	}



	public void setPris(int pris) {
		this.pris = pris;
	}





}





























