package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare {
	public static void Compare() {
		List<Toy> jouets = new ArrayList<>();
		jouets.add(new Toy("Lu garu", 15, "Super jeu de cartes", 5));
		jouets.add(new Toy("Zebre Figurine", 10, "Petite figurine zebrou",10));
		jouets.add(new Toy("Izibot Evo",100,"Petit robot programmable",5));
		jouets.add(new Toy("Araignée Peluche", 30, "Un super doudou",5));
		jouets.add(new Toy("Ligo Start wars", 10, "Jeu de construction", 10));
		jouets.add(new Toy("Bakogan Battle Pack", 20, "Figurines d'action", 0));
		
		Collections.sort(jouets, new PriceComparator());
		for(Toy jouet : jouets) {
			System.out.println("Nom : "+jouet.getName()+"\nPrix : "+jouet.getPrice()+"€\nDescription : "+jouet.getDesc()+"\nPromo : "+jouet.getPromo()+"% de réduction\n");
		}
		//14:18
	}
}
