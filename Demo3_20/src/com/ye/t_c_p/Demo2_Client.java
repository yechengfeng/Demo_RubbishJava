package com.ye.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo2_Client {
	/**
	 * ����Socket���ӷ����(ָ��ip��ַ,�˿ں�)ͨ��ip��ַ�Ҷ�Ӧ�ķ�����
	 * ����Socket��getInputStream()��getOutputStream()������ȡ�ͷ����������IO��
	 * ���������Զ�ȡ����������д�������� ���������д�����ݵ�����˵�������
	 * 
	 * @throws IOException
	 * @throws UnknownHostException
	 * 
	 */

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("127.0.0.1", 12789);
		BufferedReader bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		while (sc.hasNext()) {
			String str = sc.nextLine();
			if ("quit".equals(sc.nextLine())) {
				socket.close();

			}
			str = sc.nextLine();
			System.out.println(bis.readLine());
			ps.print(str);

		}

	}

}
