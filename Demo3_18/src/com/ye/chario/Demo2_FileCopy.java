package com.ye.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileCopy {

	public static void main(String[] args) throws IOException {
		FileReader file =new FileReader("����.txt");
		FileWriter fw =new FileWriter("��d��.txt");
		int num;
		while((num=file.read())!=-1){
			fw.write(num);
		}
		fw.close();
		file.close();
	}

}
