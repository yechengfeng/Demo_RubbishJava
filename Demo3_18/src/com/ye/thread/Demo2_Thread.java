package com.ye.thread;

public class Demo2_Thread {

	public static void main(String[] args) {
    MyRunable s = new MyRunable();
    Thread td =new Thread(s);
    	td.start();
    	for(int i=0;i<10000;i++){
    		System.out.println(i);
    	}
	}

}
class MyRunable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<11000;i++)
		System.out.println("hello world");
	}
	
}
