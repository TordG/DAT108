package tråder_og_synkronisering;

public class BroCode_Outside {
	
	
	String x = "Hello ";
	
	public class Inside{
		
		String y = "World!";
		
		public void Greeting() {
			
			System.out.println(x+y);
		}
		
	}

}
