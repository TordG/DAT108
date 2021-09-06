package Lars_Petter_sendermottaker_V2;

public class Melding {
	
	private String tekst;
	private boolean mottatt = true;

	public boolean erMottatt() {
		return mottatt;
	}

	public void send(String nyMelding) {
		tekst = nyMelding;
		mottatt = false; //Den nye meldingen er ikke mottatt enda
		
	}

	public String motta() {
		mottatt = true;
		return tekst;
	}

}
