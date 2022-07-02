package digitalclock;

import java.util.Date;

public class clockthread extends Thread{

	clock c;
	String time;
	
	public clockthread(clock c) {
		
		this.c = c;
		start();
	}
	public void run() {
		
		while(true) {
			time =""+new Date();
			c.jlabClock.setText(time);
		}
	}
}
