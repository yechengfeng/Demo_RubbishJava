package com.ye.thread;

public class Demo5_join {

	public static void main(String[] args) {
		 Thread t1 =new  Thread(){
			public void run(){
				this.setName("第一个线程");
				for(int i=0;i<100;i++){
					System.out.println(this.getName()+".....");
					
				}
			}
		};
		Thread t2 =new Thread(){
			public void run(){
				this.setName("第二个线程");
				for (int i = 0; i < 100; i++) {
					if(i==10){
						try {
							//t1.join();
							t1.join(1);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
					System.out.println(this.getName()+">>>>");
					
				}
			}
		};
		t1.start();
		t2.start();
	}

}
