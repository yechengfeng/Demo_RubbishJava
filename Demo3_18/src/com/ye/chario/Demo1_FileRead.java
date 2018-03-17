package com.ye.chario;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1_FileRead {
	/*
	 * 通过码表一次读一个字符，中文的码表对应的第一个字节一半都是负数，所以底层通过判断是否为负数来实现一次读一个字符
	 */

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("中文.txt");
		FileWriter fw =new FileWriter("你好.txt");
		int num;
		while((num=file.read())!=-1){
			System.out.print((char)num); 
		}
			
		fw.write("i am a student");
		fw.close();
		file.close();
	}

}
