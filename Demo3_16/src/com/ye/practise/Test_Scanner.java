package com.ye.practise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test_Scanner {
	/*����¼��һ��int���͵�����,����������Ʊ�����ʽ
	 * ���¼�����������,������ʾ,¼�����������������¼��һ������BigInteger
	 * ���¼�����С��,������ʾ,¼�����С��,������¼��һ������
	 * ���¼����������ַ�,������ʾ,¼����ǷǷ��ַ�,������¼��һ������*/

	public static void main(String[] args) {
		System.out.println("������һ������");
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
					System.out.println("�������������");
				} catch (Exception e1) {
					try {
						new BigDecimal(str);
						System.out.println("�������һ��С��");
					} catch (Exception e2) {
						System.out.println("������ǷǷ��ַ�");
						
					}
					
				}
			}
			
		}
	
	}
		
		
	

	private static void toBinaryString(int i) {
	}

}
