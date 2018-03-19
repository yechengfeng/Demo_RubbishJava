package com.ye.Thread;

public class Demo3_Flag {

	public static void main(String[] args) {
		final Printer1 p = new Printer1();
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

class Printer1 {
	int flag = 1;

	public void print1() throws InterruptedException {
		synchronized (this) {
			if (flag != 1) {
				System.out.print("Ñô");
				System.out.print("´º");
				System.out.print("°×");
				System.out.println("Ñ©");
				flag = 1;

			}

		}

	}

	public void print2() throws InterruptedException {

		synchronized (this) {
			if (flag != 2) {
				System.out.print("ÏÂ");
				System.out.print("Àï");
				System.out.print("°Í");
				System.out.println("ÈË");
				flag = 2;

			}

		}

	}

}
