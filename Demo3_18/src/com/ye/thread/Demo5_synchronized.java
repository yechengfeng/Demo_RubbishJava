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
		synchronized (Demo5_synchronized.class) {// ��̬������ֽ�����󣻷Ǿ�̬��this����
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("ѩ");
		}
		
	}

	public static synchronized void methed1() {
		 
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("��");
		}

	}


