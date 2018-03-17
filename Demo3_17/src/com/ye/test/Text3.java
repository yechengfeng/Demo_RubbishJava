package com.ye.test;
/*
 * 将键盘录入的数据拷贝到当前项目下的text.txt文件中,键盘录入数据当遇到quit时就退出
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Text3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据，quit 停止输入：");
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
