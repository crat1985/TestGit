package src;

import java.util.Timer;
import java.util.TimerTask;

public class CustomTimerTP {
	private Timer timer;
	private int timeInSec;
	public CustomTimerTP(int time) {
		this.timer = new Timer();
		this.timeInSec = time;
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
		}, 12000, 1000);
	}
}
