package Jenkov_Multithreading;

public class ThreadExample7 {

	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = () -> {
			
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " running");
			
			try {
				Thread.sleep(2000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println(threadName + " finished");
			
		};
		
		Thread thread = new Thread ( runnable, "The Thread" );
		thread.start();
		
		
		

		
		

	}

}
