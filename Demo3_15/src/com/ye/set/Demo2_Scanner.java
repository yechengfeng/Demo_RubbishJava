package com.ye.set;

import java.util.HashSet;
import java.util.Scanner;

/*
 * ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�
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


