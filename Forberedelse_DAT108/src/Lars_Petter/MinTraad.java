package Lars_Petter;

public class MinTraad extends Thread {
	
	
	private boolean fortsette = true;

	
	public MinTraad(String navn) {
		super(navn);
	}
	
	
	public void stopp() {
		fortsette = false;
		System.out.println("Stoppet.");
	}

	@Override
	public void run() {
		while (fortsette) {
			System.out.println(getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
	
}
