package Lars_Petter_sendermottaker;

import javax.swing.JOptionPane;

public class Sender extends Thread {

	private Melding melding;

	public Sender(Melding melding) {
		this.melding = melding;
	}

	@Override
	public void run() {

		while (true) { //For � forsikre oss om tr�dsikkerhet

			String nyMelding = JOptionPane.showInputDialog("Skriv inn melding");

			synchronized (melding) {
				while (!melding.erMottatt()) {
					try {
						melding.wait();
					} catch (Exception e) {

					}
				}
				melding.send(nyMelding);
				melding.notifyAll();
				System.out.println("Sender har sendt melding: " + nyMelding);
			}

		}

	}

}
