package src;

import java.util.Arrays;
import java.util.Scanner;

public class Characters {
	public static void Characters() {
		char car = '€';
		if(car == 'a') {
			System.out.println("vrai");
		} else {
			System.out.println("faux");
		}
		if('a'<='z') { //selon table ASCII
			
		}
		System.out.println('a'<='z' ? "vrai" : "faux");
		
		String str = "651VYUVYjbf### juhb f";
		System.out.println(str.charAt(11));
		
//		Scanner s = new Scanner(System.in);
//		System.out.print("Entrez votre pseudo : ");
//		System.out.println(s.next());
		
		int var = (int)'a'; //pas obligé de mettre (int) en général
		System.out.println(var);
		int var2 = 72;
		char var3 = (char)var2;
		System.out.println(var3);
		char car2 = Character.toUpperCase('a');
		System.out.println(car2);
		System.out.println("position in ASCII table : "+(int)car2);
		System.out.println(Character.getNumericValue('a')); //= 10
		System.out.println(Character.isDigit('9') ? "9 est un nombre" : "9 n'est pas un nombre XD");
		
		char[] charTab = {'a','z'};
		
		Arrays.sort(charTab);
		for(char i : charTab) {
			System.out.println(i);
		}
		System.out.println("\nAlphabet :");
		for(char j = 'A';j<='Z';j++) {
			System.out.println(j);
		}
	}
}
