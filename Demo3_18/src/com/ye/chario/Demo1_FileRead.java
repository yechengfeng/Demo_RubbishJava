package com.ye.chario;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1_FileRead {
	/*
	 * ͨ�����һ�ζ�һ���ַ������ĵ�����Ӧ�ĵ�һ���ֽ�һ�붼�Ǹ��������Եײ�ͨ���ж��Ƿ�Ϊ������ʵ��һ�ζ�һ���ַ�
	 */

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("����.txt");
		FileWriter fw =new FileWriter("���.txt");
		int num;
		while((num=file.read())!=-1){
			System.out.print((char)num); 
		}
			
		fw.write("i am a student");
		fw.close();
		file.close();
	}

}
