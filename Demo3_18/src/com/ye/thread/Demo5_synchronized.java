package com.ye.thread;

public class Demo5_synchronized {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					methed();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					methed1();
				}
			}
		}.start();
	}

	public static void methed() {
		synchronized (Demo5_synchronized.class) {// 静态的类的字节码对象；非静态的this调用
			System.out.print("阳");
			System.out.print("春");
			System.out.print("白");
			System.out.println("雪");
		}
		
	}

	public static synchronized void methed1() {
		 
			System.out.print("下");
			System.out.print("里");
			System.out.print("巴");
			System.out.println("人");
		}

	}


