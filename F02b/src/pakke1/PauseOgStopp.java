package pakke1;

public class PauseOgStopp { //DENNE FUNKER IKKE! FIKK IKKE SETT HVA HAN GJORDE

	public static void main(String[] args) throws InterruptedException {

		MinTraad t = new MinTraad("Hei-tråd");
		t.start();

		Thread.sleep(3000);

		t.stopp();

	}

}

class MinTraad extends Thread {
	
	boolean fortsette = true;
	
	public MinTraad(String navn) {
		super(navn);
	}
	
	public void stopp() {
		fortsette = false;
		System.out.println("Stoppet.");
	}
	
	@Override
	public void  run() {
		while (fortsette) {
			System.out.println("Hei");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}

		}
	}
}










