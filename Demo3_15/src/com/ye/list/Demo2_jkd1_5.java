package com.ye.list;

public class Demo2_jkd1_5 {

	public static void main(String[] args) {
		int[] s ={11,22,33,44,55,66};
		//print(s);
		//print(s);
		//print(11,22,33,44,55);
		print();
	}
/*public  static void print(int[] array){
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);*/
	
	//}
//}
	public static void print(int ...array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"...");
		}
	}
}
