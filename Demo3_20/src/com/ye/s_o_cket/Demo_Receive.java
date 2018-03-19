package com.ye.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Demo_Receive {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket =new DatagramSocket(7452);
		DatagramPacket packet =new DatagramPacket(new byte[1024], 1024);
		socket.receive(packet);
		socket.close();
		byte[] arr =packet.getData();
		int len =packet.getLength();
		System.out.println(new String(arr,0,len));
	}

}
