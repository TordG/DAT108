package Jenkov_Multithreading;

public class ThreadExample4 {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("running");
				System.out.println("finished");
			}
		};
		
		Thread thread = new Thread (runnable);
		thread.start();

	}

}
