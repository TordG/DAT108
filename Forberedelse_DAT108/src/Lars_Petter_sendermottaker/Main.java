package Lars_Petter_sendermottaker;

import java.util.LinkedList;
import java.util.Queue;

import Lars_Petter__Oblig1.Hamburger;
import Lars_Petter__Oblig1.Rutsjebane;

public class Main {

	public static void main(String[] args) {
		
		Melding m = new Melding();
		
		Sender sender = new Sender(m);
		
		Mottaker mottaker = new Mottaker(m);
		
		sender.start();
		mottaker.start();
		
		
		
		
		//*************************************
		//Bevis på at Queue<> LinkedList<> funker bra!
		//*************************************
		
//		Rutsjebane bane = new Rutsjebane();
//		
//		Queue<Hamburger> innhold = new LinkedList<>();
//		
//		Hamburger h1 = new Hamburger();
//		Hamburger h2 = new Hamburger();
//		Hamburger h3 = new Hamburger();
//		Hamburger h4 = new Hamburger();
//		Hamburger h5 = new Hamburger();
//		
//		bane.innhold.add(h1);
//		bane.innhold.add(h2);
//		bane.innhold.add(h3);
//		bane.innhold.add(h4);
//		bane.innhold.add(h5);
//		
//		System.out.println(bane.innhold);
//		
//		System.out.println(bane.ledigPlass());
		
	}

};











