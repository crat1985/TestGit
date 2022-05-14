package src;

import java.util.Arrays;

public class Tableaux {
	public static void Tableaux() {
		char[] char1 = {'a','€'};
		
//		System.out.println(char1[1]);
		
		char1[0] = '$';
//		System.out.println(char1[0]);
//		int[] tab = new int[5]; //0 pour tout de base
		int[] tab = {6,78,56,89,34};
		String[] stringTab = new String[5]; //null de base
//		System.out.println(tab[0]);
		System.out.println("taille : "+tab.length); //pas de parenthèses pour length sauf pour les String
		Arrays.sort(tab);//par défaut par ordre alphabétique ou croissant
		
//		for(int i = 0;i<tab.length;i++) {
//			System.out.println(tab[i]);
//		}
		
		int[][] tab2dimensions = new int[2][2];
		tab2dimensions[0][0] = 89;
		int[][][][] tab3dimensions = new int[2][2][2][2]; //Encore ! Ca fait beaucoup là non ?
	}
}
