package tråder_og_synkronisering;


class Counter{
	int count;
	
	
	/* Sync means only one thread can work with this method
	 * if t1 works with it, t2 has to wait, and vise versa
	 * when you DONT make your methods synchronized, your method is not "thread safe"
	 * AKA multiple threads can then access the same method at the same time
	 * what we want is to make it so only ONE thread can use it at a time
	 */
	public synchronized void increment() {
		count++; //count = count + 1 <- Addition AND assignment, two actions, not one single action
	}
}

public class Telusko_SyncDemo {

	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Runnable() 
		{
			public void run() 
			{
				for(int i = 1; i <= 1000; i++) 
				{
					
					c.increment();
					
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() 
		{
			public void run() 
			{
				for(int i = 1; i <= 1000; i++) 
				{
					
					c.increment();
					
				}
			}
		});
		
		t1.start();
		t2.start();
		
		
		/*Without this t1.join() (and the throws-exception) the main method will run and
		 *  finish without letting the thread finish, and will only show "0" when sysoing c.count!
		 *  
		 *  I.E. we are asking MAIN thread to WAIT for t1 to complete its job
		 */
		t1.join();
		t2.join();
		
		
		System.out.println("Count " + c.count);
		

	}

}

















