package com.ye.test;
/*
 * ������¼������ݿ�������ǰ��Ŀ�µ�text.txt�ļ���,����¼�����ݵ�����quitʱ���˳�
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Text3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ݣ�quit ֹͣ���룺");
		FileOutputStream fos = new FileOutputStream("text.txt");
		while (true) {
			String str = sc.nextLine();

			if ("quit".equals(str)) {
				break;

			} else {
				fos.write(str.getBytes());
				//fos.write("\r\n".getBytes());
				
			}
		

		}	fos.close();

	}
}
