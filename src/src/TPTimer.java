package src;

import java.util.Random;
import java.util.TimerTask;

public class TPTimer extends TimerTask {
	private int time = 5;
	@Override
	public void run() {
		if(time>1) {
			System.out.println("Plus que "+time+" secondes");
		} else if(time==1) {
			System.out.println("Plus qu'une seconde");
		}
		time--;
		if((time+1)==0) {
			System.out.println("Voici les 3 numéros :");
			Random r = new Random();
			int nba1 = r.nextInt(25-0)+0;
			System.out.println("1) "+nba1);
			int nba2 = r.nextInt(25-0)+0;
			System.out.println("2) "+nba2);
			int nba3 = r.nextInt(25-0)+0;
			System.out.println("3) "+nba3);
			System.out.println("Moyenne des 3 numéros : "+(nba1+nba2+nba3)/3);
			cancel();
		}
	}

}
