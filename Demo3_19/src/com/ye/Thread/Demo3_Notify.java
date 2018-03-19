package com.ye.Thread;

public class Demo3_Notify {

	public static void main(String[] args) {
		final Printer3 p = new Printer3();
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
						p.print3();
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

class Printer3{
	int flag = 1;

	public void print1() throws InterruptedException {
		synchronized (this) {
			while (flag != 1) {
				this.wait();
			}
			System.out.print("1");
			System.out.print("1");
			System.out.print("1");
			System.out.println("1");
			flag = 2;
			this.notifyAll();
		}

	}

	public void print2() throws InterruptedException {

		synchronized (this) {
			while(flag != 2) {
				this.wait();
			}
			System.out.print("2");
			System.out.print("2");
			System.out.print("2");
			System.out.println("2");
			flag = 3;
			this.notifyAll();
		}

	}
	public void print3() throws InterruptedException {

		synchronized (this) {
			while (flag !=3 ) {
				this.wait();
			}
			System.out.print("3");
			System.out.print("3");
			System.out.print("3");
			System.out.println("3");
			flag = 1;
			this.notifyAll();
		}

	}


}
