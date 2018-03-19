package com.ye.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  创建ServerSocket(需要指定端口号)
	* 调用ServerSocket的accept()方法接收一个客户端请求，得到一个Socket
	* 调用Socket的getInputStream()和getOutputStream()方法获取和客户端相连的IO流
	* 输入流可以读取客户端输出流写出的数据
	* 输出流可以写出数据到客户端的输入流
 */


public class Demo1_Server {

	public static void main(String[] args) throws IOException {
		ServerSocket  server =new  ServerSocket(12345);
	           Socket s= server.accept();
	           InputStream io =s.getInputStream();
	           OutputStream os =s.getOutputStream();
	           os.write("试试运气".getBytes());
	           byte[] arr= new byte[1024];
	           int len =io.read(arr);
	           System.out.println(new String(arr,0,len));
	           os.write("中国山东找蓝翔".getBytes());
	           
	           
	}

}
