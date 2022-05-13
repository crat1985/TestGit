package src;

import java.util.Random;
import java.util.TimerTask;

public class TPTimer2Casino extends TimerTask{
	private int time = 5;
	@Override
	public void run() {
		int[] numbers_list = {1,7,18,24,14,90,100};
		if(time>1) {
			System.out.println("Affichage des résultat dans "+time+" secondes");
		} else if(time==1) {
			System.out.println("Affichage des résultat dans une seconde");
		}
		time--;
		if((time+1)==0) {
			Random r = new Random();
			System.out.printf("Résultats :\n%d\n%d\n%d\n",numbers_list[r.nextInt(numbers_list.length-1)],numbers_list[r.nextInt(numbers_list.length-1)],numbers_list[r.nextInt(numbers_list.length-1)]);
			cancel();
		}
	}

}
