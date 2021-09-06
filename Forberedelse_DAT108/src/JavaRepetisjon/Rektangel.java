package JavaRepetisjon;

public class Rektangel implements Figur {

	private int hoyde;
	private int bredde;
	
	public Rektangel(int h, int b) {
		hoyde = h;
		bredde = b;
	}

	@Override
	public double areal() {
		// TODO Auto-generated method stub
		return hoyde * bredde;
	}

	@Override
	public void tegn() {
		for (int i = 0; i < hoyde; i++) {
			for (int j = 0; j < bredde; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		Rektangel rek = new Rektangel(2,3);
		rek.tegn();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
