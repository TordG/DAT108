package tråder_og_synkronisering;

class A {
	public void show() {
		System.out.println("in A show");
	}
}

public class Telusko_AnonymousExample {

	public static void main(String[] args) {

		A obj = new A() {

			public void show() {
				System.out.println("im the best");
			}
		};
		obj.show();

	}

}
