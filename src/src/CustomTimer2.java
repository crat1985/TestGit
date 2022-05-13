package src;

import java.util.Timer;
import java.util.TimerTask;

public class CustomTimer2 {
	private Timer timer;
	private int timeInSec;
	
	public CustomTimer2() {
		this.timer = new Timer();
		this.timeInSec = 10;
	}
	
	public void start(TimerListener listener) {
		listener.onStart();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println(timeInSec+"s");
				listener.onRun();
				if(timeInSec==0) {
					listener.onFinish();
					cancel();
				}
				timeInSec--;
			}
		}, 1000, 1000);
	}
}
