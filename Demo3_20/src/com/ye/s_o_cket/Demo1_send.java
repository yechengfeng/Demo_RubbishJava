package com.ye.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo1_send {
	public static void main(String[] args) throws Exception {
		String  str="我要发送文件了！";
		DatagramSocket socket =new DatagramSocket();
		DatagramPacket packet =
	new DatagramPacket(str.getBytes(), str.getBytes().length,InetAddress.getByName("127.0.0.01"),7452 );
	socket.send(packet);
	socket.close();
	}

}	
