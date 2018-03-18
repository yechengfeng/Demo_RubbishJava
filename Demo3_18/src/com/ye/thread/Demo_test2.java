package com.ye.thread;

public class Demo_test2 {
	public static void main(String[] args) {
		Ticket s1 = new Ticket();
		Ticket s2 = new Ticket();
		Ticket s3 = new Ticket();
		Ticket s4 = new Ticket();
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}
}
class Ticket extends Thread{
	private static int  ticket =1000;
		public  void run(){
			while(true) {synchronized(Ticket.class){
				if(ticket==0){
					break;
				}
				System.out.println(this.getName()+ "µÚ"+ticket--+"ÕÅÆ±");
			}
				
			} 
			
		}
		
}
