package tråder_og_synkronisering;


public class Telusko_ThreadDemo {

	public static void main(String[] args) throws Exception {
		
		
		//UTEN LAMBDA-EXPRESSION
		Runnable obj1 = new Runnable() {
			
			public void run() {
				
				for(int i =1; i<=5; i++) {
					
					System.out.println("Hi " + Thread.currentThread().getPriority());//Vil printe 1
					try {Thread.sleep(500);} catch (Exception e) {}
					
				}
			}
			
		};
		
		//MED LAMBDA-EXPRESSION - Den -> pilen
		Runnable obj2 = () -> {
				
				for(int i =1; i<=5; i++) {
					
					System.out.println("Hello");
					try {Thread.sleep(500);} catch (Exception e) {}
				}
			}; //^Telusko puttet alt dette INN i "Thread t1 og t2 new Thread()" for å spare linjer
		
		//Men jeg foretrekker å putte objektnavnene inn slik som her:
		Thread t1 = new Thread(obj1, "Hi Thread");
		Thread t2 = new Thread(obj2, "Hello Thread");  //<---Kan også gi trådene navn her!
		
		
		//Gir navn og viser navn til trådene
//		t1.setName("Hi Thread");
//		t2.setName("Hello Thread");
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
		
		t1.setPriority(Thread.MIN_PRIORITY);//1
		t2.setPriority(Thread.MAX_PRIORITY);//10
		//Vanlig/default priority er 5
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		
		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		t2.start();
		
		
		
		
		//Disse må brukes for at main-metoden til slutt skal printe ut den "Bye"-en på slutten!
		//Forteller main-metoden at den skal vente på at de to trådene er ferdig
		t1.join();
		t2.join();
		
		//Sjekker om trådene er "i live", vil her printe false fordi de er ferdig på dette tidspunkt
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		System.out.println("Bye");
		
		

	}

}



















