package com.ye.Thread;

import javax.swing.text.html.HTMLDocument.HTMLReader;

import org.omg.PortableServer.AdapterActivator;

public class Demo5_ThreadGroup {
	public static void main(String[] args) {
		//demo1();     	
		MyRunable mr =new MyRunable();
	ThreadGroup tg =new ThreadGroup("新的线程组");
		Thread t1 =new Thread(tg, mr, "first");
		Thread t2 =new Thread(tg, mr, "second");
		Thread t3 =new Thread(tg, mr, "third");
		System.out.println(t1.getName()+"..."+t2.getName()+"..."+t3.getName());
		System.out.println(t1.getThreadGroup().getName()+"...."+t2.getThreadGroup().getName());
		tg.setDaemon(true);
	}

	private static void demo1() {
		MyRunable mr =new MyRunable();
		Thread  td = new Thread(mr,"first");
		Thread  td1 = new Thread(mr,"second");
		ThreadGroup tg = td.getThreadGroup();
		ThreadGroup tg2 = td1.getThreadGroup();
	         System.out.println(td);     	
	         System.out.println(td);
	}
}
class MyRunable implements Runnable{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+i+"...");
		}
		
	}
}