package com.ye.Thread;

public class Demo4_Notify {

	public static void main(String[] args) {
		final Printer p = new Printer();
		new Thread() {
			public void run() {
				while (true) {
					/*try {
						this.sleep(3000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}*/
					try {
						p.print1();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}
		}.start();
		new Thread() {
			public void run() {
				while (true) {
					/*try {
						this.sleep(3000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}*/
					try {
						p.print2();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}

class Printer {
	int flag = 1;

	public void print1() throws InterruptedException {
		synchronized (this) {
			if (flag != 1) {
				this.wait();
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("ѩ");
			flag = 2;
			this.notify();
		}

	}

	public void print2() throws InterruptedException {

		synchronized (this) {
			if (flag != 2) {
				this.wait();
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("��");
			flag = 1;
			this.notify();
		}

	}

}
