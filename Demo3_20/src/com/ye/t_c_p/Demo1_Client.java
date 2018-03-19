package com.ye.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo1_Client {
	/** ����Socket���ӷ����(ָ��ip��ַ,�˿ں�)ͨ��ip��ַ�Ҷ�Ӧ�ķ�����
	* ����Socket��getInputStream()��getOutputStream()������ȡ�ͷ����������IO��
	* ���������Զ�ȡ����������д��������
	* ���������д�����ݵ�����˵�������
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * 
	 */

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket  socket =new Socket("127.0.0.1", 12345);
	           OutputStream os=   socket.getOutputStream();
	             InputStream  is= socket.getInputStream();
	             byte[] arr =new byte[1024];
	             int len=is.read(arr);
	             System.out.println(new String(arr,0,len));
	             os.write("�ھ�������ļ�ǿ".getBytes());
	             byte[] arr1= new byte[1024];
		           int len1 =is.read(arr1);
		           System.out.println(new String(arr1,0,len1));
	             socket.close();
	} 
					
}
