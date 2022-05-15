package src;

import java.util.Arrays;

public class ChainesDeCaracteres {
	public static void ChainesDeCaracteres() {
		String str = "idk";
		System.out.println(str);
		System.out.println(str.equals("idk") ? "C'est la même chose !" : "Ce n'est pas la même chose !");
		System.out.println(str.compareTo("idl") < 0 ? "C'est la même chose !" : "Ce n'est pas la même chose !");
		System.out.println("ba".compareTo("baaaa")); //=> -3 car trois caractères identiques en moins
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		String[] array = {"ggggf","sdfsfd","fddfsd"};
		Arrays.sort(array);
		System.out.println(array[0]);System.out.println(array[1]);System.out.println(array[2]);
		String numberString = "1516";
		int number = Integer.valueOf(numberString); //ou parseInt(str1) c'est pareil
		String numberToString = String.valueOf(number);
		System.out.println(numberToString);
		StringBuffer sB = new StringBuffer(str);
		sB.setCharAt(0, '[');
		System.out.println(sB.toString());
		String trimExemple = "   aaa   ";
		System.out.println(trimExemple.trim()); //supprime les espaces aux extrémités
		trimExemple = trimExemple.replace('a', '#');
		System.out.println(trimExemple);
		trimExemple = trimExemple.replaceAll("###", "test");
		System.out.println(trimExemple);
		StringBuilder sb = new StringBuilder("");
		for(int i = 0;i<10;i++) {
			sb.append("a");
		}
		System.out.println(sb.toString());
		
		String text = "Ceci est une phrase XD";
		
		System.out.println();
		for(String j : text.split(" ")) {
			System.out.println(j);
		}
	}
}
