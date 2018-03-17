package com.ye.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 在控制台录入文件的路径,将文件拷贝到当前项目下
 */

public class test2 {

	public static void main(String[] args) throws IOException {
		File file =   getFile();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		int num;
		while((num=bis.read())!=-1){
			bos.write(num);
		}
		bis.close();
		bos.close();
		System.out.println("copy完成");
	}
	public static File getFile(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件路径");
		while(true){
			File  file =new File(sc.nextLine());
			if(!file.exists()){
				System.out.println("你输入的路径不存在，请重新输入：");
			}else if(file.isDirectory()){
				System.out.println("你输入的是一个路径，请重新输入：");
			}else
			{
				return file;
			}
			
			
		}
	}
}
