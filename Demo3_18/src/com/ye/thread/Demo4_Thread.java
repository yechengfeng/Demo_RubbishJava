package com.ye.thread;

public class Demo4_Thread {
	public static void main(String[] args) {
		//demo2();
		demo1();
		
	}

	private static void demo2() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println( "aaaa");
					
				}
			}
		}).start();
		for (int i = 0; i < 10000; i++) {
			System.out.println("bbbbbbb");
			
		}
		Thread.currentThread().setDaemon(true);
	}

	private static void demo1() {
		new Thread("ycf"){
			public void run(){
				for (int i = 0; i < 2; i++) {
					System.out.println(this.getName()+"..."+"aaaaaaaaaaaaaaaa");
				}
			}
		}.start();
		for (int i = 0; i < 10000; i++) {
			System.out.println("bbbbbbb");
			
		}
	}

}
