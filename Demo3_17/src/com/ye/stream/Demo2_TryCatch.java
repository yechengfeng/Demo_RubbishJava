package com.ye.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_TryCatch {
	/*
	 * 1.7�汾���쳣������룬try�����еĴ�����ִ����{}�������Զ��ͷţ������еĴ������̳и���autocloseable����
	 */

	public static void main(String[] args) throws IOException {
		try (FileInputStream file = new FileInputStream("xx.txt");
				FileOutputStream ots = new FileOutputStream("xx.txt");
				) {
			int num;
			while ((num = file.read()) != -1) {
				ots.write(num);
			}
			System.out.println("1.7�汾���쳣������룬try�����еĴ�����ִ����{}�������Զ��ͷţ������еĴ������̳и���autocloseable����");
		}

	}

}
