package JavaRepetisjon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Mandag2 {

	public static void main(String[] args) {
		
//		List<Integer> liste = new ArrayList<>();
//		
//		liste.add(1);
//		liste.add(2);
//		liste.add(3);
//		liste.add(3);
//		liste.add(4);
//		
//		
//		System.out.println(liste);
//		
//		System.out.println(liste.indexOf(3));
//		
//		liste.clear();
//		
//		System.out.println(liste.isEmpty());
//		
//		
//		Set<String> mengde1 = new HashSet<>();
//		
//		mengde1.add("Hei");
//		mengde1.add("På");
//		mengde1.add("Deg");
//		
//		Set<String> mengde2 = new HashSet<>();
//		
//		mengde2.add("Hei");
//		mengde2.add("Meg");
//		mengde2.add("Grei");
//		
//		System.out.println(mengde1);
//		System.out.println(mengde2);
//		
//		mengde1.retainAll(mengde2);
//		
//		System.out.println(mengde1);
//		
//		mengde1.addAll(mengde2);
		
		
		List<String> liste = new ArrayList<>();
		
		liste.add("Hei");
		liste.add("På");
		liste.add("På");
		liste.add("Deg");
		liste.add("Deg");
		liste.add("Deg");
		
		Map<String, Integer> forekomst = new HashMap<>();
		
		
		int counter = 0;
		
		for (String element : liste) {
			if (forekomst.containsKey(element)) {
				counter++;
			} else {
				counter = 1;
			}
			
			forekomst.put(element, counter);
		}
		
		System.out.println(forekomst.get("Hei"));
		System.out.println(forekomst.get("På"));
		System.out.println(forekomst.get("Deg"));
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		System.out.println(forekomst.get(input));
		
		
		
		
		
	}

}
