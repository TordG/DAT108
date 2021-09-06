package Jenkov_Multithreading;

public class ThreadExample6 {

	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = () -> {
			
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " running");
			
		};
		
		Thread thread = new Thread ( runnable, "The Thread" );
		thread.start();
		Thread thread2 = new Thread( runnable, "The SECOND Thread");
		thread2.start();
		
		

		
		

	}

}
