package com.ye.Thread;
//�������ģʽ
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
		if(s==null) //�����ڶ��̵߳�ʱ�򴴽����s����
			 s=new Singleton1();
			 return s ;
		
	}
	
	
	
	
	
	
	
	
	
	
}