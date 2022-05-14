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
		//tableau à dimensions variables
		int[][] tabDimVariables = new int[4][];
		tabDimVariables[0] = new int[2];
		tabDimVariables[1] = new int[1];
		tabDimVariables[2] = new int[2];
		tabDimVariables[3] = new int[3];
		tabDimVariables[0][0] = 1;
		tabDimVariables[0][1] = 2;
		tabDimVariables[1][0] = 3;
		tabDimVariables[2][0] = 4;
		tabDimVariables[2][1] = 5;
		tabDimVariables[3][0] = 6;
		tabDimVariables[3][1] = 7;
		tabDimVariables[3][2] = 8;
//		System.out.println(tabDimVariables[0].length);
//		System.out.println(tabDimVariables[1].length);
//		System.out.println(tabDimVariables[2].length);
//		System.out.println(tabDimVariables[3].length);
//		System.out.println(tabDimVariables.length);
		for(int[] i : tabDimVariables) {
			for(int j : i) {
				System.out.println(j);
			}
		}
	}
}
