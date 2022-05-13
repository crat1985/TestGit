package src;

import java.util.Timer;
import java.util.TimerTask;

public class Chrono {
	public static void Chrono() {
		Timer chrono = new Timer();
//		chrono.schedule(new TimerTask() {
//			
//			@Override
//			public void run() {
//				System.out.println("slt");
//			}
//		}, 500);
//		chrono.schedule(new TimerTask() {
//			
//			int time = 10;
//			@Override
//			public void run() {
//				System.out.println("slt - "+time);
//				time--;
//				if(time==5) {
//					WarningForNoReason warningForNoReason = new WarningForNoReason();
//					System.out.println("WARNING");
//					warningForNoReason.printStackTrace();
//				}
//				if(time==0) {
//					cancel();
//				}
//			}
//		}, 1000, 1000);
//		chrono.schedule(new CustomTimer(), 1000, 1000);
//		chrono.schedule(new TPTimer(), 1000, 1000);
		chrono.schedule(new TPTimer2Casino(), 1000, 1000);
	}
}
