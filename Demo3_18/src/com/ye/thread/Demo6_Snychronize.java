package com.ye.thread;

public class Demo6_Snychronize {

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
		synchronized ("df") {
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("ѩ");
		}
		
	}

	public static void methed1() {
		synchronized ("df") {
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("��");
		}

	}

}
