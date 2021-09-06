package Lars_Petter__Oblig1;

public class Oppgave2 {

	public static void main(String[] args) {
		
		Rutsjebane rb = new Rutsjebane();
		
		Kokk kokk1 = new Kokk(rb, "Kokk 1");
		Kokk kokk2 = new Kokk(rb, "Kokk 2");
		Kokk kokk3 = new Kokk(rb, "Kokk 3");
		
		Servitor serv1 = new Servitor(rb, "Servitør 1");
		Servitor serv2 = new Servitor(rb, "Servitør 2");
		
		kokk1.start();
		kokk2.start();
		kokk3.start();
		
		serv1.start();
		serv2.start();
		

	}

}
