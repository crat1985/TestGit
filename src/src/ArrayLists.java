package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayLists {

	public static void ArrayLists(){
		ArrayList<String> list = new ArrayList<>(); //<String> pour  que ça ne contienne que des String
		//pas besoin de remettre "new ArrayList<String>();
//		list.add(25);
		list.add("Texte");
		list.add(Day.MATIN.getMsg());
		System.out.println(list);
//		list.remove(2);
//		System.out.println(list);
		list.clear();
		list.add("Un");
		list.add("texte");
		list.add("random");
		list.add("XD");
		if(list.size() != 1) System.out.println("Le tableau n'a pas une taille égale à 1");
		if(list.contains("Un")) {
			System.out.println("list contient \"Un\"");
		}
		
		Map<String, Integer> ages = new HashMap<>();
		ages.put("Graven", 18);
		ages.put("RIC21000", 15);
		ages.put("Bob", 10);
		
		System.out.println(ages.toString());
		System.out.println(ages.get("RIC21000"));
		ages.remove("Bob");
		System.out.println(ages.toString());
		
		ages.clear();
		
		if(ages.isEmpty()) {
			System.out.println("La hashmap ages est vide !");
		}
		ages.put("Riccardo", 15);
		if(ages.containsKey("RIC21")) {
			System.out.println("RIC21 est dans la hashmap");
		} else {
			System.out.println("RIC21 n'est pas dans la hashmap");
		}
		
		if(ages.containsValue(15)) {
			System.out.println("15 est dans la hashmap");
		} else {
			System.out.println("15 n'est pas dans la hashmap");
		}
		
		ages.put("Eléa", 16);
		
		for(String a : ages.keySet()) {
			System.out.println(a);
		}
		for(int a : ages.values()) {
			System.out.println(a);
		}
		System.out.printf("\n\n\n\n\n");
		for(Entry<String, Integer> a : ages.entrySet()) {
			System.out.printf("Prénom : %s, âge : %d\n", a.getKey(), a.getValue());
		}
		double moyenne = 0;
		for(Entry<String, Integer> element : ages.entrySet()) {
			moyenne += element.getValue();
		}
		moyenne /= ages.size();
		System.out.println("Moyenne : "+moyenne);
	}
	
}
