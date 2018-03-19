package com.ye.Thread;
//单例设计模式
public class Demo1_Singleton {
	public static void main(String[] args) {
		Singleton s = Singleton.getSingleton();
		Singleton s1 = Singleton.getSingleton();
		System.out.println(s1==s);
		Singleton1 s2 = Singleton1.getSingleton1();
		Singleton1 s3 = Singleton1.getSingleton1();
		System.out.println(s2==s3);
		
	}
}
class Singleton{
	private Singleton(){};
	private static Singleton s =new Singleton();
	public  static Singleton getSingleton(){
		return s;
	}
}
class Singleton1{
	private Singleton1(){};
	private static  Singleton1 s ;
	public static Singleton1  getSingleton1(){
		if(s==null) //可能在多线程的时候创建多个s对象
			 s=new Singleton1();
			 return s ;
		
	}
	
	
	
	
	
	
	
	
	
	
}