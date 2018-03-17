package com.ye.practise;
/* 从键盘接收一个字符串, 程序对其中所有字符进行排序,
 * 例如键盘输入: helloitcast程序打印:acehillostt
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test_sort1 {

	public static void main(String[] args) {
		//demo2();
		demo1();
	}

	private static void demo2() {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入字符串");
		String str = sc.nextLine();
		char[] ch =str.toCharArray();
		TreeSet<Character> st =new TreeSet<>(new Comparator<Character>() {


			@Override
			public int compare(Character o1, Character o2) {
				int num = o1-o2;
				return num==0?1:num;
			}
		});
	            for (int i = 0; i < ch.length; i++) {
					st.add(ch[i]);
				}
	            System.out.println(st);
	}

	private static void demo1() {
		Scanner  sc =new Scanner(System.in);
		System.out.println("请输入字符串");
		String str = sc.nextLine();
		char[] s =str.toCharArray();
		Arrays.sort(s);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	}
	
}
		
