package tråder_og_synkronisering;

public class BroCode_AnonymousClass {

	public static void main(String[] args) {
		
		BroCode_Greeting greeting = new BroCode_Greeting() {
			
			@Override
			public void Welcome() {
				System.out.println("YO BRO !");
			}
			
		};
		BroCode_Greeting greeting2 = new BroCode_Greeting();
		
		greeting.Welcome();
		greeting2.Welcome();

	}

}
