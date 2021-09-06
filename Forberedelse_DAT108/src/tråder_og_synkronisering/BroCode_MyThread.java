package tråder_og_synkronisering;

public class BroCode_MyThread extends Thread {
	
	@Override
	public void run() {
		
		if (this.isDaemon()) {
			System.out.println("This is a daemon thread that is running");
		}else {
			System.out.println("This is user-thread that is running");
		}
		
	}

}
