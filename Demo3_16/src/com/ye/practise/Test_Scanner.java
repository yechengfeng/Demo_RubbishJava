package com.ye.practise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test_Scanner {
	/*键盘录入一个int类型的整数,对其求二进制表现形式
	 * 如果录入的整数过大,给予提示,录入的整数过大请重新录入一个整数BigInteger
	 * 如果录入的是小数,给予提示,录入的是小数,请重新录入一个整数
	 * 如果录入的是其他字符,给予提示,录入的是非法字符,请重新录入一个整数*/

	public static void main(String[] args) {
		System.out.println("请输入一个整数");
		while(true){
			Scanner  sc = new Scanner(System.in); 
			String str =sc.nextLine();
			try {
				Integer s =Integer.parseInt(str);
			
			System.out.println(Integer.toBinaryString(s));
			break;
			} catch (Exception e) {
				try {
					new BigInteger(str);
					System.out.println("输入的整数过大");
				} catch (Exception e1) {
					try {
						new BigDecimal(str);
						System.out.println("输入的是一个小数");
					} catch (Exception e2) {
						System.out.println("输入的是非法字符");
						
					}
					
				}
			}
			
		}
	
	}
		
		
	

	private static void toBinaryString(int i) {
	}

}
