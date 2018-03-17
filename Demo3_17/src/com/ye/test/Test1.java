package com.ye.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	/*
	 * Õº∆¨º”√‹
	 */

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis =new BufferedInputStream(new FileInputStream("1.jpg"));
		BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("111.jpg"));
		int num;
		while((num=bis.read())!=-1){
			bos.write(num^12);
			}
		bis.close();
		bos.close();
	}

}
