package tråder_og_synkronisering;

public class Thenewboston_Bucky {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Thenewboston_Tuna("one",1));
		Thread t2 = new Thread(new Thenewboston_Tuna("two",2));
		Thread t3 = new Thread(new Thenewboston_Tuna("three",3));
		Thread t4 = new Thread(new Thenewboston_Tuna("four",4));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
