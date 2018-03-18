package com.ye.thread;

public class Demo3_Thread {

	public static void main(String[] args) {
			new  Thread("hello"){
				public void run(){
					for(int i=0;i<3;i++){
						

					System.out.println(this.getName()+"ddd");}
				}
			}.start();
			new Thread(new Runnable() {
				
				@Override
				public void run() {for(int i=0;i<2;i++){
					System.out.println(Thread.currentThread().getName()+"aaa");
				}}
		
			}).start();
			for(int i=0;i<1;i++){
			System.out.println(Thread.currentThread().getName());
			}
			//Thread.currentThread().setDaemon(true);
			
		
}}
