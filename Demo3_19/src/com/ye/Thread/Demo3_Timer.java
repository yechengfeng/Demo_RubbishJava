package com.ye.Thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo3_Timer {

	public static void main(String[] args) throws InterruptedException {
		Timer time =new Timer();
		time.schedule(new MyTimetask(), new Date(2018-1900,2,19,14,43,50),3000);
		while(true){
			Thread.sleep(1000);
			System.out.println(new Date());
		}

	}

}
class MyTimetask extends TimerTask{

	@Override
	public void run() {
		System.out.println("Æð´² Õ½¶·");
	}
	
	
}