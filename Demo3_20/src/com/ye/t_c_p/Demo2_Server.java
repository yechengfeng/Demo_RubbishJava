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
 *  创建ServerSocket(需要指定端口号)
	* 调用ServerSocket的accept()方法接收一个客户端请求，得到一个Socket
	* 调用Socket的getInputStream()和getOutputStream()方法获取和客户端相连的IO流
	* 输入流可以读取客户端输出流写出的数据
	* 输出流可以写出数据到客户端的输入流
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
