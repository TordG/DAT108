package tråder_og_synkronisering;

public class BroCode_Main {

	public static void main(String[] args) throws InterruptedException {
		
		//shows how many threads are running
		//System.out.println(Thread.activeCount() + " is currently running");
		
//		Thread.currentThread().setName("MAIN");
//		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setPriority(10);
//		
//		//Will be 5 by default, idk why! Priority from 1 to 10
//		System.out.println(Thread.currentThread().getPriority());
		
		//Prints out "true" boolean
		//System.out.println(Thread.currentThread().isAlive());
		
		
//		for(int i = 3; i>0; i--) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
//		
//		System.out.println("You are done!");
		
		BroCode_MyThread thread2 = new BroCode_MyThread();
		
		
		
		
		System.out.println(thread2.isDaemon());
		
		thread2.start();
		
		//System.out.println(thread2.isAlive());
		
		
		thread2.setPriority(1);
		//System.out.println(thread2.getName());
		System.out.println(thread2.getPriority());
		
		System.out.println(Thread.activeCount() + " is currently running");
		
	
		
		
		
		
		
	}

}
















