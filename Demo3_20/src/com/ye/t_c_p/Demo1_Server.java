package com.ye.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  ����ServerSocket(��Ҫָ���˿ں�)
	* ����ServerSocket��accept()��������һ���ͻ������󣬵õ�һ��Socket
	* ����Socket��getInputStream()��getOutputStream()������ȡ�Ϳͻ���������IO��
	* ���������Զ�ȡ�ͻ��������д��������
	* ���������д�����ݵ��ͻ��˵�������
 */


public class Demo1_Server {

	public static void main(String[] args) throws IOException {
		ServerSocket  server =new  ServerSocket(12345);
	           Socket s= server.accept();
	           InputStream io =s.getInputStream();
	           OutputStream os =s.getOutputStream();
	           os.write("��������".getBytes());
	           byte[] arr= new byte[1024];
	           int len =io.read(arr);
	           System.out.println(new String(arr,0,len));
	           os.write("�й�ɽ��������".getBytes());
	           
	           
	}

}
