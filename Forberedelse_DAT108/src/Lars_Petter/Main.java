package Lars_Petter;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(
				() -> System.out.println("Utskrift fra anon Runnable"));
		t.start();
		
		Thread.sleep(1000);
		
		System.out.println("Utskrift fra main()");

	}

}
