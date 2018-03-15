package com.ye.set;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 使用Scanner从键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
	* aaaabbbcccddd
 */
public class Demo2_Scanner {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		HashSet<Character> list =new HashSet();
		 String str = sc.nextLine();
		 char[] array =str.toCharArray();
		 for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		 System.out.println(list);
			}
		
	}


