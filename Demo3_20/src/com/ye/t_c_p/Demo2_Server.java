package com.ye.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 *  ����ServerSocket(��Ҫָ���˿ں�)
	* ����ServerSocket��accept()��������һ���ͻ������󣬵õ�һ��Socket
	* ����Socket��getInputStream()��getOutputStream()������ȡ�Ϳͻ���������IO��
	* ���������Զ�ȡ�ͻ��������д��������
	* ���������д�����ݵ��ͻ��˵�������
 */


public class Demo2_Server {

	public static void main(String[] args) throws IOException {
		Scanner sc =new Scanner(System.in);
		ServerSocket  server =new  ServerSocket(12789);
	           Socket s= server.accept();
	       BufferedReader  bis =  new BufferedReader(new InputStreamReader(s.getInputStream()));
	  	     PrintStream ps  =new PrintStream(s.getOutputStream());
	  	     while(true){
	  	    String str =sc.nextLine();
	  	    	System.out.println(bis.readLine()); 
	  	    	ps.print(str);
	  	     }
	          
	           
	           
	}

}
