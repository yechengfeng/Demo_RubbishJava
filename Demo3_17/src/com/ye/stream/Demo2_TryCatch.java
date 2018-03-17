package com.ye.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_TryCatch {
	/*
	 * 1.7版本的异常处理代码，try（）中的代码在执行完{}里的语句自动释放，（）中的代码必须继承父类autocloseable方法
	 */

	public static void main(String[] args) throws IOException {
		try (FileInputStream file = new FileInputStream("xx.txt");
				FileOutputStream ots = new FileOutputStream("xx.txt");
				) {
			int num;
			while ((num = file.read()) != -1) {
				ots.write(num);
			}
			System.out.println("1.7版本的异常处理代码，try（）中的代码在执行完{}里的语句自动释放，（）中的代码必须继承父类autocloseable方法");
		}

	}

}
