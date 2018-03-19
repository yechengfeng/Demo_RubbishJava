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
			System.out.print("Ñô");
			System.out.print("´º");
			System.out.print("°×");
			System.out.println("Ñ©");
			flag = 2;
			this.notify();
		}

	}

	public void print2() throws InterruptedException {

		synchronized (this) {
			if (flag != 2) {
				this.wait();
			}
			System.out.print("ÏÂ");
			System.out.print("Àï");
			System.out.print("°Í");
			System.out.println("ÈË");
			flag = 1;
			this.notify();
		}

	}

}
