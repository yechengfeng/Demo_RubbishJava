package com.ye.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1_TryFinally {
	public static void main(String[] args) throws IOException {
		FileInputStream file =null;
		FileOutputStream fos =null;
		int num;
		try {
			file = new FileInputStream("yecf.txt");
			fos = new FileOutputStream("xx.txt");
			while((num=file.read())!=-1){
				fos.write(num);
		}} finally {
			if(file!=null)
				try{
			file.close();
			}finally{
			fos.close();
			}
		System.out.println("д�����");
		System.out.println("1.6�汾�����쳣����");
	}
}}
