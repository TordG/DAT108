package Lars_Petter;

public class TiTraader {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName());
		
		for (int i = 1; i <= 10; i++) {
			Thread t = new Thread(new MinRunnable(), "Tråd nr. " + i);
			t.start();
			
		}

	}

}
