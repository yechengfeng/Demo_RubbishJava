package com.ye.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo6_Callable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService poor =Executors.newFixedThreadPool(2);
	  Future<Integer>    s =   	poor.submit( new MyCallable(100));
	  Future<Integer>    s1 =   poor.submit( new MyCallable(10));
		              System.out.println(s.get());
		              System.out.println(s1.get());
	}
}
class MyCallable implements Callable<Integer>{
	private int num;
	public MyCallable(int num){
		this.num =num;
	}
	@Override
	public Integer call() throws Exception {
		int sum=0;
	  for(int i=1;i<=num;i++){
		 sum +=i;
	  }
	  return sum;
	}

}