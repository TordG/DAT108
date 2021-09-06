package tråder_og_synkronisering;
import java.util.*;

public class Thenewboston_Tuna implements Runnable {
	String name;
	int time;
	Random r = new Random();
	
	public Thenewboston_Tuna(String x, int time) {
		name = x;
		this.time = time;
		//time = r.nextInt(999); //Will be a number between 0 and 999 milliseconds (1 second)
	}
	
	public void run() {
		try {
			System.out.printf("%s is sleeping for %d millisecond\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		}catch(Exception e) {
			
		}
	}

}
