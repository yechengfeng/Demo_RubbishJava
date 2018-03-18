package com.ye.thread;

public class Demo5_Sleep {

	public static void main(String[] args) {
			new Thread(){
				public  void run(){
					for(int i=20;i>0;i--){
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
						System.out.println("µπº∆ ±£∫"+i+"√Î");
					}
					
				}
			}.start();
	}

}
