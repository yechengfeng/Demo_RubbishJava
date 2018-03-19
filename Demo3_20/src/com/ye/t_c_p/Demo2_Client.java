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
	 * 创建Socket连接服务端(指定ip地址,端口号)通过ip地址找对应的服务器
	 * 调用Socket的getInputStream()和getOutputStream()方法获取和服务端相连的IO流
	 * 输入流可以读取服务端输出流写出的数据 输出流可以写出数据到服务端的输入流
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
