package com.ye.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * �ڿ���̨¼���ļ���·��,���ļ���������ǰ��Ŀ��
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
		System.out.println("copy���");
	}
	public static File getFile(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ļ�·��");
		while(true){
			File  file =new File(sc.nextLine());
			if(!file.exists()){
				System.out.println("�������·�������ڣ����������룺");
			}else if(file.isDirectory()){
				System.out.println("���������һ��·�������������룺");
			}else
			{
				return file;
			}
			
			
		}
	}
}
