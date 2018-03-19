package com.ye.Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo4_ReentranLock {

	public static void main(String[] args) {
		final Printer4 p = new Printer4();
		new Thread() {
			public void run() {
				while (true) {
					
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

class Printer4{
	int flag = 1;
	  private ReentrantLock r =new ReentrantLock();
	  private Condition c1 =  r.newCondition();
	  private Condition c2 =  r.newCondition();
	  private Condition c3 =  r.newCondition();

	public void print1() throws InterruptedException {
		r.lock(); 
			if(flag != 1) {
				c1.await();
			}
			System.out.print("1");
			System.out.print("1");
			System.out.print("1");
			System.out.println("1");
			flag = 2;
			c2.signal();
		r.unlock();

	}

	public void print2() throws InterruptedException {

		r.lock();
			if(flag != 2) {
				c2.await();
			}
			System.out.print("2");
			System.out.print("2");
			System.out.print("2");
			System.out.println("2");
			flag = 3;
			c3.signal();
		r.unlock();

	}
	public void print3() throws InterruptedException {

		r.lock();
			if (flag !=3 ) {
				c3.await();
			}
			System.out.print("3");
			System.out.print("3");
			System.out.print("3");
			System.out.println("3");
			flag = 1;
			c1.signal();
		r.unlock();

	}


}
