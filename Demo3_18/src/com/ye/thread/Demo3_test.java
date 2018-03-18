package com.ye.thread;

public class Demo3_test {
	public static void main(String[] args) {
		 Tickets tc =new Tickets();
		 Thread t1 =new Thread(tc);
		 Thread t2 =new Thread(tc);
		 Thread t3 =new Thread(tc);
		 Thread t4=new Thread(tc);
		 t1.start();
		 t2.start();
		 t3.start();
		 t4.start();
	}
}
 class Tickets implements Runnable{
	 private static  int ticket=1000;
	 
	 public  void run(){
		 while(true) {synchronized(this){
			 if(ticket==0){
				 break;
			 }
			 System.out.println(Thread.currentThread().getName()+ "µÚ"+ticket--+"ÕÅÆ±");
		 }
		 
		 } 
		 
	 }
 }
 
