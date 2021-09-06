package oblig1_Oppgave1;

import static javax.swing.JOptionPane.showInputDialog;

class DialogThread extends Thread {
	
private boolean fortsett = true;
	
	private void stopp() {
		fortsett = false;
	}
	
	@Override
	public void run() {
		while (fortsett) {
			
			String input = showInputDialog("Skriv her. 'quit' for å avslutte.");
			System.out.println(input);
			if (input.equals("quit")) {
				stopp(); 
				System.out.println("Stoppet"); //Kan også ha denne i Main
				
			}
		}
	}
}
