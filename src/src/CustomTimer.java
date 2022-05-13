package src;

import java.util.Random;
import java.util.TimerTask;

public class CustomTimer extends TimerTask {
	private int time = 6;
	@Override
	public void run() {
		System.out.println("slt - "+time);
		time--;
		if((time+1)==5) {
			WarningForNoReason warningForNoReason = new WarningForNoReason();
			System.out.println("WARNING");
			warningForNoReason.printStackTrace();
		}
		if(time==0) {
			Random r = new Random();
			int nba = r.nextInt(6 - 1) + 1;
			System.out.println("valeur du dé : "+nba);
			cancel();
		}
	}

}
