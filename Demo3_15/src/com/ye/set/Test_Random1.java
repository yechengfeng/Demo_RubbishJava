package com.ye.set;

import java.util.HashSet;
/* ���󣺱�дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨��
 * 
 */
import java.util.Random;

public class Test_Random1 {

	public static void main(String[] args) {
		wrong_test0();
		//demo2();
		//	wrong_test();
		}



	private static void wrong_test0() {
		
		
		HashSet<Integer>  list =new HashSet<>();
		for(int i=0;i<11;i++){
		list.add((int)(Math.random()*20));
		}
		System.out.println(list);
	}
	 
		

	private static void demo2() {
		
		HashSet<Integer> list = new HashSet<>();
		Random r =new Random();
		while(list.size()<10){
			list.add(r.nextInt(20)+1);
			}
		System.out.println(list);
	}
		
		private static void wrong_test() {
		
			HashSet<Integer>  list =new HashSet<>();
			while(list.size()<10){
			list.add((int)(Math.random()*20));}
			System.out.println(list);
			
		}
		
	}



