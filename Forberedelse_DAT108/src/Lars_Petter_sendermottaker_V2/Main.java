package Lars_Petter_sendermottaker_V2;

//I denne skal all synchronize- og lås-greiene være i melding-klassen, ikke i sender og mottaker


public class Main {

	public static void main(String[] args) {
		
		Melding m = new Melding();
		
		Sender sender = new Sender(m);
		
		Mottaker mottaker = new Mottaker(m);
		
		sender.start();
		mottaker.start();
		
		
		
		
	
		
	}

};











