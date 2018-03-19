package com.ye.Thread;

public class Demo2_Runtime {
	public static void main(String[] args) {
		for(int i=0;i<10000;i++)
		{
			System.out.println(i);
		}
		Runtime r =Runtime.getRuntime();
		System.gc();
		System.out.println( r.freeMemory()/1024/1024); 
	
	}
}
