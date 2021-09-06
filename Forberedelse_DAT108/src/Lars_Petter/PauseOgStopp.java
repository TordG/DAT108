package Lars_Petter;

public class PauseOgStopp {

	public static void main(String[] args) throws InterruptedException {
		
		MinTraad t = new MinTraad("Dingdong-tråd");
		t.start();
		
		
		Thread.sleep(2000);
		
		t.stopp();

	}
	
	

}
