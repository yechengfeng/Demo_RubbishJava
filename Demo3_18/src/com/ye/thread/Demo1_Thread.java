package com.ye.thread;

public class Demo1_Thread {

	public static void main(String[] args) {
//		MyThread  s = new MyThread();
//		s.start();
		Mythread2 s2 = new Mythread2();
		s2.start();
		
		for(int i=0;i<1000;i++){
			System.out.println("hello world");
		}
	}

}
class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("MYthread");
		}
	}
	 
}
class Mythread2 extends MyThread {
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("MYthread+++++");
		}
	}
	
}
