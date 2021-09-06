package tråder_og_synkronisering;

public class BroCode_MAIN_InnerClassExample {

	public static void main(String[] args) {
		
		BroCode_Outside out = new BroCode_Outside();
		
		BroCode_Outside.Inside in = out.new Inside();
		
		in.Greeting();
		
		

	}

}
