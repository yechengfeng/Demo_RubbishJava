package com.ye.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo5_Execotors {

	public static void main(String[] args) {
		ExecutorService poor =Executors.newFixedThreadPool(2);
		poor.submit( new MyRunable());
		poor.submit( new MyRunable());
		poor.shutdown();
	}

}
