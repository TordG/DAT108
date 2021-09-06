package oblig1_Oppgave2;



public class Main {

	public static void main(String[] args) throws InterruptedException {

		Brett brett = new Brett();

		Thread kokk1 = new Kokk("Kokk1", brett);
		Thread kokk2 = new Kokk("Kokk2", brett);
		Thread kokk3 = new Kokk("Kokk3", brett);

		Thread serv1 = new Servitor("Servitør1", brett);
		Thread serv2 = new Servitor("Servitør2", brett);

		kokk1.start();
		kokk2.start();
		kokk3.start();
		serv1.start();
		serv2.start();

		
		
		
		
		
		
		
		
		
		
		

	}

}
